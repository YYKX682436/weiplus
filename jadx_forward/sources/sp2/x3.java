package sp2;

/* loaded from: classes2.dex */
public final class x3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f492806d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ha2 f492807e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f492808f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f492809g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f492810h;

    /* renamed from: i, reason: collision with root package name */
    public int f492811i;

    /* renamed from: m, reason: collision with root package name */
    public int f492812m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f492813n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f492814o;

    /* renamed from: p, reason: collision with root package name */
    public final sp2.w3 f492815p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f492806d = "LiveSquareTimeRefreshingUIC_" + hashCode();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(14);
        this.f492813n = arrayList;
        this.f492814o = new java.util.concurrent.ConcurrentHashMap();
        this.f492815p = new sp2.w3(this, android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean O6(sp2.x3 r7, int r8, bq2.b r9) {
        /*
            r45.ha2 r0 = r7.f492807e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L7
            goto L2d
        L7:
            switch(r8) {
                case 8: goto L28;
                case 9: goto L23;
                case 10: goto L1d;
                case 11: goto L17;
                case 12: goto La;
                case 13: goto L11;
                case 14: goto Lb;
                default: goto La;
            }
        La:
            goto L2d
        Lb:
            r3 = 5
            int r0 = r0.m75939xb282bd08(r3)
            goto L2e
        L11:
            r3 = 4
            int r0 = r0.m75939xb282bd08(r3)
            goto L2e
        L17:
            r3 = 3
            int r0 = r0.m75939xb282bd08(r3)
            goto L2e
        L1d:
            r3 = 2
            int r0 = r0.m75939xb282bd08(r3)
            goto L2e
        L23:
            int r0 = r0.m75939xb282bd08(r1)
            goto L2e
        L28:
            int r0 = r0.m75939xb282bd08(r2)
            goto L2e
        L2d:
            r0 = r2
        L2e:
            java.lang.String r9 = r7.S6(r9)
            if (r9 != 0) goto L35
            goto L8a
        L35:
            java.util.concurrent.ConcurrentHashMap r3 = r7.f492814o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r3.get(r4)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            if (r3 == 0) goto L4b
            java.lang.Object r9 = r3.get(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 != 0) goto L51
        L4b:
            r3 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
        L51:
            long r3 = r9.longValue()
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r3 = "checkAddRequestScene scene: "
            r9.<init>(r3)
            r9.append(r8)
            java.lang.String r8 = " interval: "
            r9.append(r8)
            r9.append(r0)
            java.lang.String r8 = " offsetTime: "
            r9.append(r8)
            r9.append(r5)
            java.lang.String r8 = r9.toString()
            java.lang.String r7 = r7.f492806d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r8)
            long r7 = (long) r0
            r3 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r3
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 < 0) goto L88
            if (r0 <= 0) goto L88
            goto L89
        L88:
            r1 = r2
        L89:
            r2 = r1
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.x3.O6(sp2.x3, int, bq2.b):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P6(sp2.x3 r19, java.util.ArrayList r20, java.util.ArrayList r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.x3.P6(sp2.x3, java.util.ArrayList, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void Q6(sp2.x3 x3Var, int i17, bq2.b bVar) {
        java.lang.String S6 = x3Var.S6(bVar);
        if (S6 == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = x3Var.f492814o;
        if (concurrentHashMap.get(valueOf) == null) {
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), new java.util.concurrent.ConcurrentHashMap());
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (concurrentHashMap2 != null) {
        }
    }

    public final void R6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f492808f = recyclerView;
        this.f492809g = adapter;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492806d, "bindParentRecyclerView parentRecyclerView: " + this.f492808f + " adapter: " + adapter);
    }

    public final java.lang.String S6(bq2.b bVar) {
        if (bVar instanceof bq2.e) {
            return java.lang.String.valueOf(((bq2.e) bVar).f105099e.m59251x5db1b11());
        }
        if (bVar instanceof bq2.c) {
            return ((bq2.c) bVar).f105097e.f460880d;
        }
        if (bVar instanceof bq2.f) {
            return java.lang.String.valueOf(((bq2.f) bVar).f105100e);
        }
        if (bVar instanceof bq2.g) {
            return java.lang.String.valueOf(((bq2.g) bVar).f105102e);
        }
        if (!(bVar instanceof bq2.d)) {
            return null;
        }
        return "interactionEntry_" + ((bq2.d) bVar).f105098e.m75939xb282bd08(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int T6() {
        r45.ha2 ha2Var = this.f492807e;
        int i17 = 0;
        if (ha2Var != null) {
            int[] iArr = {ha2Var.m75939xb282bd08(0), ha2Var.m75939xb282bd08(2), ha2Var.m75939xb282bd08(1), ha2Var.m75939xb282bd08(3), ha2Var.m75939xb282bd08(4), ha2Var.m75939xb282bd08(5)};
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i18 = 0; i18 < 6; i18++) {
                int i19 = iArr[i18];
                if (i19 > 0) {
                    arrayList.add(java.lang.Integer.valueOf(i19));
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Comparable comparable = (java.lang.Comparable) it.next();
                while (it.hasNext()) {
                    java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
                i17 = ((java.lang.Number) comparable).intValue();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492806d, "getMiniRefreshInterval = " + i17);
        return i17;
    }

    public final void U6(bq2.b bVar, dk2.zg zgVar) {
        boolean z17 = bVar.f105094b.isShown() && bVar.f105094b.isAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492806d, "notifyItemRangeChanged feedObject: " + bVar + " isAttachShow: " + z17);
        if (z17) {
            bVar.f105095c.m8148xed6e4d18(bVar.f105093a, zgVar);
        }
    }

    public final void V6(int i17, int i18) {
        java.util.ArrayList d17 = kz5.c0.d(13);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f492808f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f492809g;
        if (c1163xf1deaba4 == null || c22848x6ddd90cf == null) {
            return;
        }
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sp2.n3 n3Var = sp2.n3.f492649a;
            java.util.ArrayList d18 = kz5.c0.d(java.lang.Integer.valueOf(intValue));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(n3Var.a(i17, i18, c1163xf1deaba4, c22848x6ddd90cf, d18));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                bq2.b bVar = (bq2.b) it6.next();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f492814o.get(java.lang.Integer.valueOf(intValue));
                if (concurrentHashMap != null) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492806d, "resetRequestSceneInterval for " + bVar + " from scene " + intValue);
            }
        }
    }

    public final void W6(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492806d, "startRequestCgi first: " + i17 + " last: " + i18);
        this.f492810h = true;
        this.f492811i = i17;
        this.f492812m = i18;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f492808f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f492809g;
        if (c1163xf1deaba4 == null || c22848x6ddd90cf == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.y0 mo144225x95f74600 = mo144225x95f74600();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new sp2.v3(this, i17, i18, c1163xf1deaba4, c22848x6ddd90cf, null), 2, null);
    }

    public final void X6() {
        boolean z17 = false;
        this.f492810h = false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null;
        if (abstractActivityC15087xee12defa != null && abstractActivityC15087xee12defa.mo78538xecd98af8()) {
            z17 = true;
        }
        java.lang.String str = this.f492806d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startTimer fail, page is paused");
            return;
        }
        int T6 = T6();
        sp2.w3 w3Var = this.f492815p;
        w3Var.mo50303x856b99f0(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startTimer refreshInterval: " + T6);
        if (T6 > 0) {
            this.f492814o.clear();
            w3Var.mo50307xb9e94560(1, T6 * 1000);
        }
    }

    public final void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492806d, "stopTimer");
        this.f492815p.mo50303x856b99f0(1);
    }

    public final void Z6(r45.ha2 ha2Var) {
        this.f492807e = ha2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAsyncInfoConfig: highTag=");
        sb6.append(ha2Var != null ? java.lang.Integer.valueOf(ha2Var.m75939xb282bd08(0)) : null);
        sb6.append(" product=");
        sb6.append(ha2Var != null ? java.lang.Integer.valueOf(ha2Var.m75939xb282bd08(2)) : null);
        sb6.append(", agg=");
        sb6.append(ha2Var != null ? java.lang.Integer.valueOf(ha2Var.m75939xb282bd08(1)) : null);
        sb6.append(", playTogether=");
        sb6.append(ha2Var != null ? java.lang.Integer.valueOf(ha2Var.m75939xb282bd08(3)) : null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f492806d, sb6.toString(), new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492806d, "onDestroy");
        Y6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        Y6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492806d, "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492806d, "onResume");
        X6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f492806d = "LiveSquareTimeRefreshingUIC_" + hashCode();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(14);
        this.f492813n = arrayList;
        this.f492814o = new java.util.concurrent.ConcurrentHashMap();
        this.f492815p = new sp2.w3(this, android.os.Looper.getMainLooper());
    }
}
