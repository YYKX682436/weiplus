package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90;

/* renamed from: com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK_V2 */
/* loaded from: classes13.dex */
public class C26709xa83a0b9 extends com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca implements com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.IQQDownloaderInstalled {
    protected static final java.lang.String TAG = "QQDownloaderOpenSDK";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26709xa83a0b9 f56379x46143c22;

    /* renamed from: mTaskList */
    protected java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> f56380xc87b750;

    public C26709xa83a0b9() {
        this.f56380xc87b750 = null;
        this.f56380xc87b750 = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    /* renamed from: about */
    public static java.lang.String m105085x585238d() {
        return "TMQQDownloaderOpenSDK_2014_05_13_17_36_release_35169";
    }

    /* renamed from: addToTaskList */
    private synchronized void m105086xe78996df(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b) {
        boolean z17;
        if (c26708x7750f26b != null) {
            java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> copyOnWriteArrayList = this.f56380xc87b750;
            if (copyOnWriteArrayList != null) {
                java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b next = it.next();
                    java.lang.String str = next.f56375x9200497;
                    z17 = true;
                    if (str == null) {
                        java.lang.String str2 = next.f56376x4225cd2c;
                        if (str2 != null && str2.equals(c26708x7750f26b.f56376x4225cd2c)) {
                            break;
                        }
                    } else if (str.equals(c26708x7750f26b.f56375x9200497)) {
                        java.lang.String str3 = next.f56376x4225cd2c;
                        if (str3 == null || str3.equals(c26708x7750f26b.f56376x4225cd2c)) {
                            break;
                        }
                    }
                }
                if (!z17) {
                    this.f56380xc87b750.add(c26708x7750f26b);
                }
            }
        }
    }

    /* renamed from: getBatchRequestType */
    private int m105087x6b1f6645(boolean z17, int i17) {
        if (z17) {
            if (i17 != 0) {
                if (i17 == 1) {
                    return 1;
                }
                if (i17 == 2) {
                    return 6;
                }
                if (i17 == 3) {
                    return 5;
                }
            }
        } else {
            if (i17 == 0 || i17 == 1) {
                return 4;
            }
            if (i17 == 2) {
                return 8;
            }
            if (i17 == 3) {
                return 7;
            }
        }
        return 2;
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26709xa83a0b9 m105088x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26709xa83a0b9 c26709xa83a0b9;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26709xa83a0b9.class) {
            if (f56379x46143c22 == null) {
                f56379x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26709xa83a0b9();
            }
            c26709xa83a0b9 = f56379x46143c22;
        }
        return c26709xa83a0b9;
    }

    /* renamed from: onProgressChanged */
    private void m105089x95ed2be8(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, long j17, long j18) {
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d>> it = this.f56271x47156d3e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d interfaceC26700x308b266d = it.next().get();
            if (interfaceC26700x308b266d == null) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onDownloadStateChanged listener = null");
            } else {
                interfaceC26700x308b266d.mo105043x87e7c5b(c26708x7750f26b, j17, j18);
            }
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d
    /* renamed from: OnDownloadTaskProgressChanged */
    public void mo105043x87e7c5b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, long j17, long j18) {
        if (c26708x7750f26b != null) {
            m105089x95ed2be8(c26708x7750f26b, j17, j18);
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d
    /* renamed from: OnDownloadTaskStateChanged */
    public void mo105044xc6f868cf(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, int i17, int i18, java.lang.String str) {
        if (c26708x7750f26b != null) {
            m105025xaba1ac62(c26708x7750f26b, i17, i18, str);
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d
    /* renamed from: OnQQDownloaderInvalid */
    public void mo105045x236c3a63() {
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d>> it = this.f56271x47156d3e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d interfaceC26700x308b266d = it.next().get();
            if (interfaceC26700x308b266d == null) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "OnQQDownloaderInvalid listener = null");
            } else {
                interfaceC26700x308b266d.mo105045x236c3a63();
            }
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d
    /* renamed from: OnServiceFree */
    public void mo105046xd936a742() {
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d>> it = this.f56271x47156d3e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d interfaceC26700x308b266d = it.next().get();
            if (interfaceC26700x308b266d == null) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "OnQQDownloaderInvalid listener = null");
            } else {
                interfaceC26700x308b266d.mo105046xd936a742();
            }
        }
    }

    /* renamed from: addBatchUpdateOperationToDB */
    public long m105090x6337141e(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> arrayList, boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        byte[] m105071x2c0b0be0;
        boolean z18 = arrayList == null || arrayList.size() == 0;
        int m105087x6b1f6645 = m105087x6b1f6645(z18, i17);
        if (m105087x6b1f6645 != 3 && !z18) {
            java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b next = it.next();
                if (next != null) {
                    m105086xe78996df(next);
                }
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26720xd19704d7 m105070xd55f2d6d = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105070xd55f2d6d(m105087x6b1f6645, arrayList, str, str2, str3);
        if (m105070xd55f2d6d == null || (m105071x2c0b0be0 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105071x2c0b0be0(m105070xd55f2d6d)) == null) {
            return -1L;
        }
        return m105016x38e26e5b(m105071x2c0b0be0);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca
    /* renamed from: addDownloadTaskFromAppDetail */
    public long mo105011x21184a7a(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18) {
        m105086xe78996df(c26708x7750f26b);
        return super.m105015x38e26e5b(c26708x7750f26b, z17, z18, c26708x7750f26b.f56371x6e5ae6c2, null, 2);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: addDownloadTaskFromAuthorize */
    public long mo105012x3a11b091(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, java.lang.String str) {
        m105086xe78996df(c26708x7750f26b);
        return super.m105015x38e26e5b(c26708x7750f26b, true, true, c26708x7750f26b.f56371x6e5ae6c2, str, 3);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: addDownloadTaskFromTaskList */
    public long mo105013x9c40b21b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18) {
        m105086xe78996df(c26708x7750f26b);
        return super.m105015x38e26e5b(c26708x7750f26b, z17, z18, c26708x7750f26b.f56371x6e5ae6c2, null, 1);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: destroyQQDownloaderOpenSDK */
    public void mo105018x8510c021() {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104955x41b0e64b();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c.m104979x9cf0d20b().m104980xc6e3cda3();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.m104988x9cf0d20b().m104989xf5e5c7a0();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.m104988x9cf0d20b().m104990x5cd39514();
        android.content.Context context = this.f56269xd6cfe882;
        if (context != null) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(context).m105084x787b4082();
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.m105051x9cf0d20b().m105055x70349dca();
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.m105051x9cf0d20b().m105054xb4567ae5(this.f56269xd6cfe882);
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105491x5cd39ffa();
        this.f56269xd6cfe882 = null;
    }

    /* renamed from: getBatchTaskState */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300> m105091x957be0e8(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.f56269xd6cfe882 == null) {
            throw new java.lang.Exception("mContext shouldn't be null !");
        }
        if (arrayList == null || arrayList.size() <= 0) {
            throw new java.lang.Exception("ArrayList<TMQQDownloaderOpenSDKParam> appList cann't be null or empty!");
        }
        int m105010x3de44a48 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca.m105010x3de44a48(this.f56269xd6cfe882);
        if (m105010x3de44a48 <= 1) {
            return null;
        }
        if (m105010x3de44a48 >= 4) {
            return com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(this.f56269xd6cfe882).m105073x94ec4ddc(arrayList, str, str2, str3);
        }
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 m105074xa30d80a3 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(this.f56269xd6cfe882).m105074xa30d80a3(arrayList.get(0));
        if (m105074xa30d80a3 == null) {
            return null;
        }
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(m105074xa30d80a3);
        return arrayList2;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: getDownloadTaskState */
    public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 mo105023xc45041ae(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b) {
        android.content.Context context = this.f56269xd6cfe882;
        if (context == null) {
            throw new java.lang.Exception("Context shouldn't be null !");
        }
        if (c26708x7750f26b != null) {
            return com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(context).m105074xa30d80a3(c26708x7750f26b);
        }
        throw new java.lang.Exception("TMQQDownloaderOpenSDKParam param cann't is null!");
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: initQQDownloaderOpenSDK */
    public void mo105024x5473474b(android.content.Context context) {
        this.f56269xd6cfe882 = context;
        this.f56267xab3ca929 = context.getPackageName();
        this.f56268x9e1d2c1d = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105485xc7211efa(this.f56269xd6cfe882);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105499xe9f5beed(this.f56269xd6cfe882);
        this.f56272xb1163be4 = 2;
        android.content.Context context2 = this.f56269xd6cfe882;
        if (context2 != null) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(context2).m105082x8b9cca69(this);
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.m105051x9cf0d20b().m105053x2573f6be(this.f56269xd6cfe882);
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.m105051x9cf0d20b().m105052xa5e4d183(this);
        }
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104953xc20729b2();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c.m104979x9cf0d20b().m104982x319ab1e7();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.m104988x9cf0d20b().m104991xeaf05970();
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.IQQDownloaderInstalled
    /* renamed from: onQQDownloaderInstalled */
    public synchronized void mo105056xc09a3d06(android.content.Context context) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "received qqdownload install broadcase!");
        java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> copyOnWriteArrayList = this.f56380xc87b750;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b next = it.next();
                if (next != null) {
                    try {
                        mo105023xc45041ae(next);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                    }
                    this.f56380xc87b750.remove(next);
                }
            }
        }
    }

    /* renamed from: releaseIPCConnected */
    public void m105092xc35f07f4() {
        android.content.Context context = this.f56269xd6cfe882;
        if (context != null) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(context).m105083x8668fec0();
        }
    }

    /* renamed from: startToAppDetail */
    public void m105093xd1237fd5(android.content.Context context, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18, int i17) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        if (z17) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad m104978x4a8e9809 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104978x4a8e9809((byte) 1);
            m104978x4a8e9809.via = c26708x7750f26b.via;
            m104978x4a8e9809.f56611x27ebbb = uuid;
            m104978x4a8e9809.f56612x58b7f1c = c26708x7750f26b.f56375x9200497;
            m104978x4a8e9809.f56629xdf539674 = 1;
            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104969x86141d2d(m104978x4a8e9809);
        }
        if (c26708x7750f26b != null) {
            java.lang.String m105022x6b99b4d6 = super.m105022x6b99b4d6(z17, z18);
            int i18 = 1 != i17 ? 4 : 1;
            m105086xe78996df(c26708x7750f26b);
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(this.f56269xd6cfe882).m105077x212cb475(c26708x7750f26b, i18, m105022x6b99b4d6, c26708x7750f26b.f56371x6e5ae6c2, null);
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26699x2293a699
    /* renamed from: startToAuthorized */
    public void mo105028x597fd7f8(android.content.Context context, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, java.lang.String str) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (c26708x7750f26b != null) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad m104978x4a8e9809 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104978x4a8e9809((byte) 1);
            m104978x4a8e9809.via = c26708x7750f26b.via;
            m104978x4a8e9809.f56611x27ebbb = uuid;
            m104978x4a8e9809.f56612x58b7f1c = c26708x7750f26b.f56375x9200497;
            m104978x4a8e9809.f56629xdf539674 = 1;
            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104969x86141d2d(m104978x4a8e9809);
            m105086xe78996df(c26708x7750f26b);
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(this.f56269xd6cfe882).m105077x212cb475(c26708x7750f26b, 3, super.m105022x6b99b4d6(true, true), c26708x7750f26b.f56371x6e5ae6c2, str);
            return;
        }
        throw new java.lang.Exception("QQDownloaderParam param cann't be null!");
    }

    /* renamed from: startToBatchUpdateOperation */
    public int m105095x196e2621(android.content.Context context, java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> arrayList, boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        int m105010x3de44a48 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca.m105010x3de44a48(context);
        boolean z18 = true;
        if (m105010x3de44a48 <= 0) {
            return 1;
        }
        if (m105010x3de44a48 < 4) {
            return 2;
        }
        if (arrayList != null && arrayList.size() != 0) {
            z18 = false;
        }
        int m105087x6b1f6645 = m105087x6b1f6645(z18, i17);
        if (!com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(this.f56269xd6cfe882).m105076x6cc84cd3(m105087x6b1f6645, arrayList, str, str2, str3)) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "handleBatchRequestAction return false with batchRequestType=" + m105087x6b1f6645);
        }
        return 0;
    }

    /* renamed from: startToDownloadTaskList */
    public void m105096x6ef71d08(android.content.Context context, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, boolean z17, boolean z18, int i17) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (c26708x7750f26b == null) {
            return;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        if (z17) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad m104978x4a8e9809 = com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104978x4a8e9809((byte) 1);
            m104978x4a8e9809.f56611x27ebbb = uuid;
            m104978x4a8e9809.f56624x2361c60 = "";
            m104978x4a8e9809.via = c26708x7750f26b.via;
            m104978x4a8e9809.f56612x58b7f1c = c26708x7750f26b.f56375x9200497;
            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.m104977x9cf0d20b().m104969x86141d2d(m104978x4a8e9809);
        }
        if (c26708x7750f26b != null) {
            java.lang.String m105022x6b99b4d6 = super.m105022x6b99b4d6(z17, z18);
            int i18 = 1 == i17 ? 2 : 5;
            m105086xe78996df(c26708x7750f26b);
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(this.f56269xd6cfe882).m105077x212cb475(c26708x7750f26b, i18, m105022x6b99b4d6, c26708x7750f26b.f56371x6e5ae6c2, null);
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.AbstractC26696x1d987bca
    /* renamed from: startToWebView */
    public void mo105030xd0ab32dc(android.content.Context context, java.lang.String str) {
        android.content.Context context2;
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.Exception("param url shouldn't be null!");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        java.lang.String m105020xd32b22be = super.m105020xd32b22be(5, hashMap);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startToWebView finalPath:" + m105020xd32b22be);
        if (android.text.TextUtils.isEmpty(str) || (context2 = this.f56269xd6cfe882) == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(context2).m105078x69548d7a(m105020xd32b22be);
    }

    /* renamed from: startToAuthorized */
    public void m105094x597fd7f8(android.content.Context context, java.lang.String str) {
        android.content.Context context2;
        java.lang.String m105019x77685021 = super.m105019x77685021(str);
        if (android.text.TextUtils.isEmpty(str) || (context2 = this.f56269xd6cfe882) == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105072x9cf0d20b(context2).m105078x69548d7a(m105019x77685021);
    }
}
