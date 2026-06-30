package te2;

/* loaded from: classes3.dex */
public final class l implements te2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499712d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f499713e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f499714f;

    /* renamed from: g, reason: collision with root package name */
    public final qo0.c f499715g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f499716h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f499717i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f499718m;

    /* renamed from: n, reason: collision with root package name */
    public te2.b f499719n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f499720o;

    public l(android.view.View viewRoot, android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 basePluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewRoot, "viewRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePluginLayout, "basePluginLayout");
        this.f499712d = viewRoot;
        this.f499713e = context;
        this.f499714f = liveData;
        this.f499715g = statusMonitor;
        this.f499716h = basePluginLayout;
        this.f499717i = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f499720o = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    public static final void c(te2.l lVar, java.lang.String str, int i17, java.lang.String str2) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o1 o1Var;
        lVar.getClass();
        dk2.u7 u7Var = dk2.u7.f315714a;
        ce2.i e17 = u7Var.e(str);
        boolean g17 = u7Var.g(e17);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#addLocalGiftMsg giftInfo is null,giftId:" + str + ",cnt:" + i17 + ",comboId:" + str2);
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        r45.cj1 cj1Var = new r45.cj1();
        cj1Var.set(0, e17.f67814x2c488eb6);
        cj1Var.set(3, e17.c1());
        ch1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cj1Var.mo14344x5f01b1f6()));
        r45.xn1 xn1Var = new r45.xn1();
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        java.util.LinkedList linkedList = null;
        java.util.LinkedList linkedList2 = c1Var != null ? c1Var.f410345h : null;
        if (linkedList2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList2) {
                if (((r45.yl1) obj).m75939xb282bd08(0) != 4) {
                    arrayList.add(obj);
                }
            }
            linkedList = new java.util.LinkedList(arrayList);
        }
        xn1Var.set(11, linkedList);
        zl2.r4 r4Var = zl2.r4.f555483a;
        xn1Var.set(0, r4Var.m0(lVar.f499714f));
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        ch1Var.set(1, 20009);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1(ch1Var);
        l1Var.f197126h = str2;
        l1Var.f197127i = i17;
        l1Var.f197123e = i17 > 1 ? g17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197152d : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197154f : g17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197153e : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197155g;
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var2 == null || (str3 = c1Var2.f410385o) == null) {
            str3 = "";
        }
        l1Var.f197134s = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#addLocalGiftMsg local add GiftShowInfo:" + l1Var);
        mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var3 == null || (o1Var = c1Var3.f410339g) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) o1Var).g(l1Var);
    }

    public static final void f(te2.l lVar, java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String str3;
        r45.kv1 kv1Var;
        java.util.List list;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#addSelfGiftToComment giftId:" + str + " comboCount:" + i17 + ",comboId:" + str2);
        if ((str == null || str.length() == 0) || i17 <= 0) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        r45.xn1 xn1Var = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f555483a;
        xn1Var.set(0, r4Var.m0(lVar.f499714f));
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        xn1Var.set(11, c1Var != null ? c1Var.f410345h : null);
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        ch1Var.set(1, 20013);
        dk2.j5 j5Var = new dk2.j5(ch1Var);
        j5Var.f315174d = true;
        r45.yh1 yh1Var = new r45.yh1();
        yh1Var.set(0, str);
        yh1Var.set(4, str2);
        yh1Var.set(3, java.lang.Integer.valueOf(i17));
        ce2.i e17 = dk2.u7.f315714a.e(str);
        yh1Var.set(1, e17 != null ? e17.c1() : null);
        j5Var.f315173c = yh1Var;
        mm2.x4 x4Var = (mm2.x4) efVar.i(mm2.x4.class);
        if (x4Var != null && (list = x4Var.f411061f) != null) {
            list.add(j5Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#addSelfGiftToComment comboCount:" + i17 + ",comboId:" + str2 + ",username:" + j5Var.a());
        no0.h.f420253a.a();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = j5Var.k();
        r45.yh1 yh1Var2 = j5Var.f315173c;
        if (yh1Var2 == null || (kv1Var = (r45.kv1) yh1Var2.m75936x14adae67(1)) == null || (str3 = kv1Var.m75945x2fec8307(8)) == null) {
            str3 = "";
        }
        objArr[1] = str3;
        objArr[2] = java.lang.String.valueOf(i17);
        java.lang.String string = lVar.f499713e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_w, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        lVar.f499712d.announceForAccessibility(string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85246c4).mo141623x754a37bb()).r()).intValue() == 1 ? true : r1.f410303i) == true) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.l.g():void");
    }

    @Override // fs2.a
    /* renamed from: onAttach */
    public void mo56536x3b13c504(java.lang.Object obj) {
        te2.b callback = (te2.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f499719n = callback;
        ((te2.o) callback).f499798h = new te2.c(this);
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        te2.b bVar = this.f499719n;
        if (bVar != null) {
            ((te2.o) bVar).a();
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f499718m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}
