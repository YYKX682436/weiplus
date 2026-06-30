package km2;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashMap f390680p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public static int f390681q = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;

    /* renamed from: b, reason: collision with root package name */
    public int f390683b;

    /* renamed from: c, reason: collision with root package name */
    public km2.r f390684c;

    /* renamed from: f, reason: collision with root package name */
    public km2.u f390687f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.x4 f390688g;

    /* renamed from: h, reason: collision with root package name */
    public int f390689h;

    /* renamed from: k, reason: collision with root package name */
    public r45.k42 f390692k;

    /* renamed from: l, reason: collision with root package name */
    public android.os.Bundle f390693l;

    /* renamed from: m, reason: collision with root package name */
    public int f390694m;

    /* renamed from: o, reason: collision with root package name */
    public r45.md5 f390696o;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f390682a = "FinderLiveDataModel@" + hashCode();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f390685d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f390686e = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashMap f390690i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public java.util.ArrayList f390691j = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390695n = "";

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(java.util.List list, km2.u uVar) {
        java.util.List list2;
        java.lang.String str;
        if (list != null) {
            list2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(new km2.t((km2.m) it.next()));
            }
        } else {
            list2 = kz5.p0.f395529d;
        }
        java.util.List f17 = f(this.f390686e, list2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = this.f390686e.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            km2.t tVar = (km2.t) it6.next();
            km2.m mVar = tVar.f390755d;
            if ((mVar != null && mVar.f390672q) != false) {
                if (!(mVar != null && mVar.f390671p)) {
                    arrayList.add(tVar);
                }
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            str = this.f390682a;
            if (!hasNext) {
                break;
            }
            km2.t tVar2 = (km2.t) it7.next();
            java.util.Iterator it8 = this.f390686e.iterator();
            int i17 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((km2.t) it8.next(), tVar2)) {
                    break;
                }
                i17++;
            }
            if (i17 > -1) {
                this.f390686e.remove(i17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeNotExposedBackUpLive removeDataIndex=");
                sb6.append(i17);
                sb6.append(" name=");
                com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17 = tVar2.b();
                sb6.append(b17 != null ? b17.M : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                if (uVar != null) {
                    uVar.g(i17, 1);
                }
            }
        }
        this.f390686e.addAll(f17);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#appendLiveData remoteSize=");
        sb7.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb7.append(", after filter size ");
        java.util.LinkedList linkedList = (java.util.LinkedList) f17;
        sb7.append(linkedList.size());
        sb7.append(", now liveDataList.size=");
        sb7.append(this.f390686e.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
        return linkedList.size();
    }

    public final android.content.Intent b(android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        km2.t c17 = c();
        if (c17 != null) {
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17 = c17.b();
            intent.putExtra("key_enter_live_param_share_username", b17 != null ? b17.I : null);
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b18 = c17.b();
            intent.putExtra("key_enter_live_param_from_share_scene_new", b18 != null ? java.lang.Integer.valueOf(b18.K) : null);
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b19 = c17.b();
            intent.putExtra("KEY_ENTER_LIVE_PARAM_TO_USERNAME", b19 != null ? b19.L : null);
        }
        return intent;
    }

    public final km2.t c() {
        int size = this.f390686e.size();
        int d17 = d();
        boolean z17 = false;
        if (d17 >= 0 && d17 < size) {
            z17 = true;
        }
        if (z17) {
            return (km2.t) kz5.n0.a0(this.f390686e, d());
        }
        return null;
    }

    public final int d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390682a, "get curPos:" + this.f390683b);
        return this.f390683b;
    }

    public final r45.ta4 e() {
        dk2.x4 x4Var = this.f390688g;
        if (x4Var != null) {
            return x4Var.B;
        }
        return null;
    }

    public final java.util.List f(java.util.List list, java.util.List list2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            km2.t tVar = (km2.t) it.next();
            java.util.Iterator it6 = list.iterator();
            int i17 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((km2.t) it6.next()).d(tVar) == 0) {
                    break;
                }
                i17++;
            }
            java.util.Iterator it7 = linkedList.iterator();
            int i18 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (((km2.t) it7.next()).d(tVar) == 0) {
                    break;
                }
                i18++;
            }
            if (i17 == -1 && i18 == -1) {
                linkedList.add(tVar);
            }
        }
        return linkedList;
    }

    public final void g(dk2.x4 finderLiveConfig) {
        java.lang.Integer num;
        java.util.LinkedList linkedList;
        gk2.e a17;
        int i17;
        long j17;
        java.util.LinkedList<r45.sp1> m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLiveConfig, "finderLiveConfig");
        this.f390688g = finderLiveConfig;
        this.f390689h = finderLiveConfig.f315859t;
        this.f390690i = finderLiveConfig.f315861v;
        this.f390691j = finderLiveConfig.f315860u;
        this.f390693l = finderLiveConfig.f315863x;
        h(finderLiveConfig.f315848i);
        int i18 = finderLiveConfig.f315849j;
        int i19 = finderLiveConfig.f315850k;
        int i27 = finderLiveConfig.f315853n;
        r45.kd1 kd1Var = finderLiveConfig.f315855p;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = finderLiveConfig.f315857r;
        r45.gy0 gy0Var = finderLiveConfig.f315858s;
        int i28 = finderLiveConfig.f315859t;
        java.lang.String str = finderLiveConfig.f315856q;
        r45.q92 q92Var = finderLiveConfig.f315862w;
        r45.ta4 ta4Var = finderLiveConfig.B;
        java.lang.String m75945x2fec8307 = ta4Var != null ? ta4Var.m75945x2fec8307(32) : null;
        r45.ta4 ta4Var2 = finderLiveConfig.B;
        int m75939xb282bd08 = ta4Var2 != null ? ta4Var2.m75939xb282bd08(34) : 0;
        jz5.l P6 = ((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).P6();
        km2.r rVar = new km2.r(null, 0L, null, null, null, 0, null, 0, 0.0f, 0.0f, 0, 0, null, null, 0, null, 0, null, false, null, 0, 2097151, null);
        rVar.f390737i = ((java.lang.Number) P6.f384366d).floatValue();
        rVar.f390738j = ((java.lang.Number) P6.f384367e).floatValue();
        rVar.f390736h = 7;
        rVar.f390739k = i19;
        rVar.f390734f = i18;
        rVar.f390740l = i27;
        rVar.f390732d = kd1Var;
        rVar.f390741m = str;
        rVar.f390733e = c19792x256d2725;
        rVar.f390742n = gy0Var;
        rVar.f390743o = i28;
        rVar.f390746r = q92Var;
        rVar.f390748t = m75945x2fec8307;
        rVar.f390749u = m75939xb282bd08;
        this.f390684c = rVar;
        r45.ta4 ta4Var3 = finderLiveConfig.B;
        java.lang.String m75945x2fec83072 = ta4Var3 != null ? ta4Var3.m75945x2fec8307(32) : null;
        boolean z17 = !(m75945x2fec83072 == null || m75945x2fec83072.length() == 0);
        java.util.ArrayList arrayList = finderLiveConfig.f315851l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.m mVar = new km2.m((com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e) it.next());
            mVar.f390669n = z17;
            arrayList2.add(new km2.t(mVar));
        }
        this.f390686e = new java.util.ArrayList(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        r45.ta4 ta4Var4 = finderLiveConfig.B;
        java.lang.String str2 = this.f390682a;
        if (ta4Var4 != null && (m75941xfb821914 = ta4Var4.m75941xfb821914(31)) != null) {
            for (r45.sp1 sp1Var : m75941xfb821914) {
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sp1Var);
                km2.m mVar2 = new km2.m(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).Mk(sp1Var));
                mVar2.f390672q = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "parseLiveConfigList name=" + sp1Var.m75945x2fec8307(3));
                arrayList3.add(new km2.t(mVar2));
            }
        }
        if (this.f390686e.size() > 0 && finderLiveConfig.f315855p != null) {
            r45.jc1 jc1Var = new r45.jc1();
            r45.kd1 kd1Var2 = finderLiveConfig.f315855p;
            if (kd1Var2 != null) {
                i17 = 0;
                j17 = kd1Var2.m75942xfb822ef2(0);
            } else {
                i17 = 0;
                j17 = 0;
            }
            jc1Var.set(i17, java.lang.Long.valueOf(j17));
            r45.kd1 kd1Var3 = finderLiveConfig.f315855p;
            jc1Var.set(1, kd1Var3 != null ? kd1Var3.m75934xbce7f2f(2) : null);
            km2.m mVar3 = ((km2.t) this.f390686e.get(0)).f390755d;
            if (mVar3 != null) {
                mVar3.f390666h = jc1Var;
            }
            gk2.e a18 = ((km2.t) this.f390686e.get(0)).a();
            mm2.c1 c1Var = a18 != null ? (mm2.c1) a18.a(mm2.c1.class) : null;
            if (c1Var != null) {
                c1Var.f410360j5 = jc1Var;
            }
            gk2.e a19 = ((km2.t) this.f390686e.get(0)).a();
            mm2.c1 c1Var2 = a19 != null ? (mm2.c1) a19.a(mm2.c1.class) : null;
            if (c1Var2 != null) {
                com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17 = ((km2.t) this.f390686e.get(0)).b();
                c1Var2.f410432v4 = b17 != null ? b17.H : false;
            }
        }
        if (!arrayList3.isEmpty()) {
            this.f390686e.addAll(arrayList3);
        }
        km2.t c17 = c();
        mm2.c1 c1Var3 = (c17 == null || (a17 = c17.a()) == null) ? null : (mm2.c1) a17.a(mm2.c1.class);
        if (c1Var3 == null) {
            num = null;
        } else {
            r45.ta4 ta4Var5 = finderLiveConfig.B;
            if (ta4Var5 != null) {
                java.util.LinkedList<r45.qa4> m75941xfb8219142 = ta4Var5.m75941xfb821914(20);
                if (m75941xfb8219142 != null) {
                    linkedList = null;
                    for (r45.qa4 qa4Var : m75941xfb8219142) {
                        if (linkedList == null) {
                            linkedList = new java.util.LinkedList();
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qa4Var);
                        r45.qa4 qa4Var2 = new r45.qa4();
                        qa4Var2.set(0, qa4Var.m75945x2fec8307(0));
                        qa4Var2.set(1, java.lang.Long.valueOf(qa4Var.m75942xfb822ef2(1)));
                        linkedList.add(qa4Var2);
                    }
                    num = null;
                } else {
                    num = null;
                    linkedList = null;
                }
                ta4Var5.set(20, num);
            } else {
                num = null;
                linkedList = null;
            }
            c1Var3.f410440w6 = linkedList;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseLiveConfigList liveDataListSize=");
        sb6.append(this.f390686e.size());
        sb6.append(" backupLiveDataListSize=");
        sb6.append(arrayList3.size());
        sb6.append(' ');
        r45.ta4 e17 = e();
        sb6.append(e17 != null ? java.lang.Integer.valueOf(e17.hashCode()) : num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
    }

    public final void h(int i17) {
        this.f390683b = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390682a, "set curPos :" + this.f390683b);
    }

    public final java.lang.String i(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            java.lang.String str = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("******" + i17 + ':');
            km2.m mVar = ((km2.t) obj).f390755d;
            if (mVar != null) {
                str = mVar.c();
            }
            sb6.append(str);
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    /* renamed from: toString */
    public java.lang.String m143676x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveDataModel(" + hashCode() + "):");
        sb6.append("init pos:" + d() + ';');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("loaderParams:tab:");
        km2.r rVar = this.f390684c;
        sb7.append(rVar != null ? java.lang.Integer.valueOf(rVar.f390734f) : null);
        sb7.append(",objectId:");
        km2.r rVar2 = this.f390684c;
        sb7.append(rVar2 != null ? java.lang.Long.valueOf(rVar2.f390730b) : null);
        sb7.append(",lastBuf is null:");
        km2.r rVar3 = this.f390684c;
        sb7.append((rVar3 != null ? rVar3.f390729a : null) == null);
        sb7.append(",columnVMKey:");
        km2.r rVar4 = this.f390684c;
        sb7.append(rVar4 != null ? rVar4.f390748t : null);
        sb7.append(';');
        sb6.append(sb7.toString());
        int size = this.f390686e.size();
        if (size <= 0) {
            sb6.append("live data is empty");
            java.lang.String sb8 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
            return sb8;
        }
        for (int i17 = 0; i17 < size; i17++) {
            sb6.append("live_" + i17 + ':' + this.f390686e.get(i17));
        }
        java.lang.String sb9 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        return sb9;
    }
}
