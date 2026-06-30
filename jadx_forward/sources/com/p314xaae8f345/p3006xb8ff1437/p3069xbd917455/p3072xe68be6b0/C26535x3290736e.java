package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0;

/* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter */
/* loaded from: classes16.dex */
public class C26535x3290736e implements com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086 {

    /* renamed from: CONFIG_NAME_BUFFER_MAX_DURATION */
    protected static final java.lang.String f54950x66277277 = "buffermaxtotaldurationms";

    /* renamed from: CONFIG_NAME_BUFFER_MIN_DURATION */
    protected static final java.lang.String f54951x826e9d49 = "buffermintotaldurationms";

    /* renamed from: CONFIG_NAME_BUFFER_TYPE */
    protected static final java.lang.String f54952x18494f82 = "buffertype";

    /* renamed from: CONFIG_NAME_MAX_BUFFERING_TIME */
    protected static final java.lang.String f54953x488c9dfc = "maxbufferingtimems";

    /* renamed from: CONFIG_NAME_MIN_BUFFERING_DURATION */
    protected static final java.lang.String f54954x3279ad95 = "minbufferingdurationms";

    /* renamed from: CONFIG_NAME_MIN_BUFFERING_TIME */
    protected static final java.lang.String f54955xfe28e34e = "minbufferingtimems";

    /* renamed from: CONFIG_NAME_PRELOAD_DURATION */
    protected static final java.lang.String f54956xf9857d21 = "preloadtotaldurationms";

    /* renamed from: CONFIG_NAME_REDUCE_LATENCY_ACTION */
    protected static final java.lang.String f54957x8496fd19 = "reducelatencyaction";

    /* renamed from: CONFIG_NAME_REDUCE_LATENCY_SPEED */
    protected static final java.lang.String f54958xec8414e4 = "reducelatencyspeed";

    /* renamed from: REPORT_CACHE_NAME */
    private static final java.lang.String f54959xb842c533 = "TPReporterCache";
    private static final java.lang.String TAG = "TPBaseReporter";

    /* renamed from: mCache */
    private static com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26566xc609bdb0 f54960xbdddfb15;

    /* renamed from: mContext */
    protected android.content.Context f54961xd6cfe882;

    /* renamed from: mPlayerInfoGetter */
    protected com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf f54963x97315ba7;

    /* renamed from: mReportChannelListenerList */
    protected java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e>> f54964x1cc77654;

    /* renamed from: mReportInfoGetter */
    protected com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26240x603a7652 f54966x5e048a3a;

    /* renamed from: mReporterInitParams */
    protected com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26546x3533ba13 f54968x806675c4;

    /* renamed from: mReportUtils */
    protected com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26544xfeac63c1 f54967x9acdfd30 = null;

    /* renamed from: mReportEventSeq */
    protected int f54965xae2ee286 = 0;

    /* renamed from: mPlayerConfigKeyValueMap */
    protected java.util.Map<java.lang.String, java.lang.Object> f54962x60e7c4fa = new java.util.HashMap();

    /* renamed from: analyseReportIdFromCacheKey */
    private static java.lang.String m103770xceacc169(java.lang.String str) {
        for (java.lang.reflect.Field field : com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.class.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getType() == java.lang.String.class) {
                try {
                    java.lang.String str2 = (java.lang.String) field.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.class);
                    if (str2 != null && str.endsWith(str2)) {
                        return str2;
                    }
                } catch (java.lang.IllegalAccessException unused) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "fail to get value of field(" + field.getName() + ") in TPReportEventId.class)");
                }
            }
        }
        return null;
    }

    /* renamed from: classifyMapIntoRsvExtMapAndExtMap */
    public static void m103771x61ab3cba(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (m103774xe6bc8261(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue());
            } else if (m103773x2beb8810(entry.getKey())) {
                map3.put(entry.getKey(), entry.getValue());
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "invalid extend info <" + entry.getKey() + ", " + entry.getValue() + "> from ITPReportInfoGetter, key valid!");
            }
        }
    }

    /* renamed from: createLocalCache */
    private synchronized void m103772xb8f13cf3(android.content.Context context, java.lang.String str) {
        if (f54960xbdddfb15 != null) {
            return;
        }
        f54960xbdddfb15 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26566xc609bdb0(this.f54961xd6cfe882, str);
    }

    /* renamed from: isValidExtKey */
    public static boolean m103773x2beb8810(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("ext_");
    }

    /* renamed from: isValidRsvExtKey */
    public static boolean m103774xe6bc8261(java.lang.String str) {
        if (str == null) {
            return false;
        }
        for (java.lang.reflect.Field field : com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.C26241xafb8d45e.class.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                java.lang.String str2 = (java.lang.String) field.get(com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.C26241xafb8d45e.class);
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
            } catch (java.lang.IllegalAccessException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
        return false;
    }

    /* renamed from: reportAndClearCache */
    private synchronized void m103775xe8b31598() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26566xc609bdb0 c26566xc609bdb0 = f54960xbdddfb15;
        if (c26566xc609bdb0 == null) {
            return;
        }
        java.util.Iterator<java.lang.String> it = c26566xc609bdb0.m104285xd3d4347().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            java.lang.String m103770xceacc169 = m103770xceacc169(next);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed) f54960xbdddfb15.m104287xcc440832(next);
            if (m103770xceacc169 != null && c26551xb06837ed != null) {
                java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = c26551xb06837ed.m103886x18cb9578();
                m103787xeb62bb48(m103770xceacc169, m103886x18cb9578);
                com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26263x413d0abf.m101576xbcd477d3(m103770xceacc169, m103886x18cb9578);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "report cached reportEvent, key:" + next);
            }
        }
        f54960xbdddfb15.m104284xc82fcbb0();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: addReportChannelListener */
    public void mo103764xf84afce2(com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e interfaceC26239x32996f7e) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e>> copyOnWriteArrayList = this.f54964x1cc77654;
        if (copyOnWriteArrayList == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "mReportChannelListenerList is null");
            return;
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == interfaceC26239x32996f7e) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "mReportChannelListenerList has contain reportChannelListener");
                return;
            }
        }
        this.f54964x1cc77654.add(new java.lang.ref.WeakReference<>(interfaceC26239x32996f7e));
    }

    /* renamed from: cacheReport */
    public synchronized void m103776x1ebcc756(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed) {
        if (f54960xbdddfb15 != null && this.f54968x806675c4.f55070x34acf576.booleanValue()) {
            f54960xbdddfb15.m104289xac26b9fb(c26551xb06837ed.m103900x194b99df() + str, c26551xb06837ed);
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "write cache, flowid:" + c26551xb06837ed.m103900x194b99df() + ", reportId:" + str);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "mCache is null or does not need to report to beacon, no caching!");
    }

    /* renamed from: dumpMapInfo */
    public void m103777xf7a07396(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(":{");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            sb6.append(key);
            sb6.append(":");
            sb6.append(value);
            sb6.append(",");
        }
        sb6.append("}");
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, sb6.toString());
    }

    /* renamed from: fillInitExtReportInfoToCommonParams */
    public void m103778xe4b5d01c(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d c26534xafaa5d7d) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26240x603a7652 interfaceC26240x603a7652 = this.f54966x5e048a3a;
        if (interfaceC26240x603a7652 == null) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> m101485xfa22bc62 = interfaceC26240x603a7652.m101485xfa22bc62();
        if (m101485xfa22bc62 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "fillInitExtReportInfoToCommonParams fail, initExtendReportInfo is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        m103771x61ab3cba(m101485xfa22bc62, hashMap, hashMap2);
        c26534xafaa5d7d.f54945x9879cc5e.m103940x3580eb17(hashMap);
        c26534xafaa5d7d.f54945x9879cc5e.m103939x5319a7c8(hashMap2);
    }

    /* renamed from: fillStreamInfoToCommonParams */
    public void m103779xa97549fd(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d c26534xafaa5d7d) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf interfaceC26550x996747bf = this.f54963x97315ba7;
        if (interfaceC26550x996747bf == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo101568xc0f8b3fa = interfaceC26550x996747bf.mo101568xc0f8b3fa();
        c26534xafaa5d7d.f54945x9879cc5e.m103936xc80cdeb(this.f54968x806675c4.f55072x23efaf8a);
        c26534xafaa5d7d.f54945x9879cc5e.m103935x65cc485c(mo101568xc0f8b3fa.f53259x4233636b.f53267x25993aa7);
        c26534xafaa5d7d.f54945x9879cc5e.m103938x8bb19a02(mo101568xc0f8b3fa.f53259x4233636b.f53269x96897fd7);
        c26534xafaa5d7d.f54945x9879cc5e.m103948x99514bbd(this.f54968x806675c4.f55073x591e3e08);
        c26534xafaa5d7d.f54945x9879cc5e.m103957x9b399365(this.f54968x806675c4.f55077xd50aea7a);
        c26534xafaa5d7d.f54945x9879cc5e.m103929x1d597716(mo101568xc0f8b3fa.f53259x4233636b.f53268x8423aa1d);
        c26534xafaa5d7d.f54945x9879cc5e.m103959x2354315e(mo101568xc0f8b3fa.f53259x4233636b.f53272xb0d0c8db);
        c26534xafaa5d7d.f54945x9879cc5e.m103926x1dd9c063(mo101568xc0f8b3fa.f53259x4233636b.f53264x2d2f1fb6);
        c26534xafaa5d7d.f54945x9879cc5e.m103955x9449991d(mo101568xc0f8b3fa.f53259x4233636b.f53270xa194b1f2);
        c26534xafaa5d7d.f54945x9879cc5e.m103954x44efcec5(mo101568xc0f8b3fa.f53259x4233636b.f53276xce627899);
        c26534xafaa5d7d.f54945x9879cc5e.m103960xe9ed06b4(mo101568xc0f8b3fa.f53259x4233636b.f53273x3a11db7f);
        c26534xafaa5d7d.f54945x9879cc5e.m103956xca029dad(this.f54968x806675c4.f55071x11423731);
        c26534xafaa5d7d.f54945x9879cc5e.m103951xbd067eae("" + mo101568xc0f8b3fa.f53259x4233636b.f53277x7b4db658 + "*" + mo101568xc0f8b3fa.f53259x4233636b.f53274xd49a1ad5);
        c26534xafaa5d7d.f54945x9879cc5e.m103931xd93cad06(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102352xa942c580());
        c26534xafaa5d7d.f54945x9879cc5e.m103953xf9d64c3f(c26534xafaa5d7d.f54948x11033d44);
        c26534xafaa5d7d.f54945x9879cc5e.m103930x7485ec4e(c26534xafaa5d7d.f54947x577997ee);
        c26534xafaa5d7d.f54945x9879cc5e.m103928x6f097f1(c26534xafaa5d7d.f54949xac0eba6f);
        c26534xafaa5d7d.f54945x9879cc5e.m103927x52cdf2f2(c26534xafaa5d7d.f54946xdb3e2e77);
        c26534xafaa5d7d.f54945x9879cc5e.m103958xe05800da(this.f54968x806675c4.f55069x9b3610be);
        this.f54962x60e7c4fa.put(f54951x826e9d49, java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53279xdc5cc5f9));
        this.f54962x60e7c4fa.put(f54950x66277277, java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53278x26c080a7));
        this.f54962x60e7c4fa.put(f54956xf9857d21, java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53284x45e5f842));
        this.f54962x60e7c4fa.put(f54954x3279ad95, java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53282x72a910b7));
        this.f54962x60e7c4fa.put(f54955xfe28e34e, java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53283x9666230));
        this.f54962x60e7c4fa.put(f54953x488c9dfc, java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53281x53ca1cde));
        this.f54962x60e7c4fa.put(f54957x8496fd19, java.lang.Integer.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53285x6d1c3f61));
        this.f54962x60e7c4fa.put(f54958xec8414e4, java.lang.Float.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53286xcdcf9068));
        this.f54962x60e7c4fa.put(f54952x18494f82, java.lang.Integer.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53280x4dd16fe7));
        try {
            c26534xafaa5d7d.f54945x9879cc5e.m103947x6c9d2b05(new org.json.JSONObject(this.f54962x60e7c4fa).toString());
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
    }

    /* renamed from: getDynamicStatisticParamsFromCore */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 m103780x8ed24936(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf interfaceC26550x996747bf = this.f54963x97315ba7;
        if (interfaceC26550x996747bf != null) {
            return interfaceC26550x996747bf.mo101567x55ab8bad(z17);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "getDynamicStatParamsFromCore failed, mPlayerInfoGetter is null, return default value");
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653();
    }

    /* renamed from: getDynamicStatisticParamsFromEventInfo */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 m103781x383a3b31(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653;
        if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStopEventInfo) {
            c26404xfb288653 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStopEventInfo) baseEventInfo).m103191x55ab8bad();
        } else if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayResetEventInfo) {
            c26404xfb288653 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayResetEventInfo) baseEventInfo).m103187x55ab8bad();
        } else if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo) {
            c26404xfb288653 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo) baseEventInfo).m103179x55ab8bad();
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "event info do not have dynamicStatisticParams");
            c26404xfb288653 = null;
        }
        return c26404xfb288653 == null ? new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653() : c26404xfb288653;
    }

    /* renamed from: getGeneralPlayFlowParamsFromCore */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 m103782xa70cd483() {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf interfaceC26550x996747bf = this.f54963x97315ba7;
        if (interfaceC26550x996747bf != null) {
            return interfaceC26550x996747bf.mo101568xc0f8b3fa();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "getGeneralPlayFlowParams failed, mPlayerInfoGetter is null, return default value");
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94();
    }

    /* renamed from: getGeneralPlayFlowParamsFromEventInfo */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 m103783xe943b804(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94;
        if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStopEventInfo) {
            c26405x843ecc94 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStopEventInfo) baseEventInfo).m103192xc0f8b3fa();
        } else if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayResetEventInfo) {
            c26405x843ecc94 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayResetEventInfo) baseEventInfo).m103188xc0f8b3fa();
        } else if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo) {
            c26405x843ecc94 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo) baseEventInfo).m103182xc0f8b3fa();
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "event info do not have generalPlayFlowParams");
            c26405x843ecc94 = null;
        }
        return c26405x843ecc94 == null ? new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94() : c26405x843ecc94;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: init */
    public void mo103765x316510(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26546x3533ba13 c26546x3533ba13) {
        this.f54961xd6cfe882 = context;
        this.f54964x1cc77654 = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.f54968x806675c4 = c26546x3533ba13;
        this.f54967x9acdfd30 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26544xfeac63c1(context);
        m103772xb8f13cf3(context, f54959xb842c533);
        m103775xe8b31598();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: onEvent */
    public void mo103766xaf8c47fb(int i17, com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
    }

    /* renamed from: removeCachedReport */
    public synchronized void m103784xecf7479a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26566xc609bdb0 c26566xc609bdb0 = f54960xbdddfb15;
        if (c26566xc609bdb0 == null) {
            return;
        }
        c26566xc609bdb0.m104288xc8a9e257(str + str2);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "remove cache, flowid:" + str + ", reportId:" + str2);
    }

    /* renamed from: removeCachedReports */
    public synchronized void m103785xb1f1ac19(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26566xc609bdb0 c26566xc609bdb0 = f54960xbdddfb15;
        if (c26566xc609bdb0 == null) {
            return;
        }
        java.util.Iterator<java.lang.String> it = c26566xc609bdb0.m104285xd3d4347().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (next.startsWith(str)) {
                f54960xbdddfb15.m104288xc8a9e257(next);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "remove cache, key:" + next);
            }
        }
    }

    /* renamed from: reportToBeaconIfNeed */
    public void m103786xddf12126(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.f54968x806675c4.f55070x34acf576.booleanValue()) {
            com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26263x413d0abf.m101576xbcd477d3(str, map);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "eventId:" + str + ", no need to report to beacon because of sampling");
    }

    /* renamed from: reportToExternalReportChannelIfNeed */
    public void m103787xeb62bb48(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.f54964x1cc77654.size() == 0) {
            return;
        }
        for (int i17 = 0; i17 < this.f54964x1cc77654.size(); i17++) {
            com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e interfaceC26239x32996f7e = this.f54964x1cc77654.get(i17).get();
            if (interfaceC26239x32996f7e != null) {
                interfaceC26239x32996f7e.m101484xefe04dc6(str, map);
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: reset */
    public void mo103767x6761d4f() {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e>> copyOnWriteArrayList = this.f54964x1cc77654;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f54964x1cc77654 = null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: setPlayerInfoGetter */
    public void mo103768xbcee8d9c(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf interfaceC26550x996747bf) {
        this.f54963x97315ba7 = interfaceC26550x996747bf;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: setReportInfoGetter */
    public void mo103769x83c1bc2f(com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26240x603a7652 interfaceC26240x603a7652) {
        this.f54966x5e048a3a = interfaceC26240x603a7652;
    }
}
