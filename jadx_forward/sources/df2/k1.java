package df2;

/* loaded from: classes3.dex */
public final class k1 extends df2.de implements df2.l9 {

    /* renamed from: p, reason: collision with root package name */
    public final int f312070p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f312071q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashSet f312072r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f312073s;

    /* renamed from: t, reason: collision with root package name */
    public int f312074t;

    /* renamed from: u, reason: collision with root package name */
    public long f312075u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f312076v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        ml2.y3 y3Var = ml2.y3.f409803e;
        this.f312070p = 9;
        this.f312071q = new p012xc85e97e9.p093xedfae76a.j0();
        this.f312072r = new java.util.HashSet();
    }

    @Override // df2.l9
    public void b5() {
        m7("autoDismiss", false);
    }

    @Override // df2.l9
    /* renamed from: getTag */
    public java.lang.String mo124177xb5887064() {
        return "FinderCreateLiveGuideController";
    }

    @Override // df2.de
    public void i7(r45.tm1 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.i7(info);
        if (info.m75939xb282bd08(0) == 3) {
            this.f312071q.mo7808x76db6cb1(info);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            r0 = 1
            androidx.lifecycle.j0 r1 = r4.f312071q
            r2 = 0
            if (r6 == 0) goto L1f
            android.view.View r6 = r4.f7(r4)
            r3 = 0
            if (r6 == 0) goto L14
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L14
            r3 = r0
        L14:
            if (r3 != 0) goto L17
            goto L1f
        L17:
            java.lang.Object r6 = r1.mo3195x754a37bb()
            r1.mo523x53d8522f(r6)
            goto L22
        L1f:
            r1.mo523x53d8522f(r2)
        L22:
            r4.a7(r5, r4)
            kotlinx.coroutines.r2 r5 = r4.f312073s
            if (r5 == 0) goto L2c
            p3325xe03a0797.p3326xc267989b.p2.a(r5, r2, r0, r2)
        L2c:
            r4.f312073s = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.k1.m7(java.lang.String, boolean):void");
    }

    public final void n7(int i17, int i18, java.lang.Long l17) {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("entrance_type", i18);
        gVar.h("entrance_id", l17);
        gVar.o("strategy_id", this.f312074t);
        gVar.p("guide_live_id", this.f312075u);
        gVar.h("guide_finderusername", this.f312076v);
        zy2.zb.j5(zbVar, 36L, gVar.toString(), null, 4, null);
    }

    public final void o7(int i17) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.B2;
        cl0.g gVar = new cl0.g();
        gVar.o("strategy_id", this.f312074t);
        gVar.o("type", i17);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCreateLiveGuideController", "onViewMount");
        this.f312071q.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.f1(this));
    }

    @Override // df2.de, if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        m7("onViewUnmount", true);
        super.mo8999xb1ef75c(pluginLayout);
    }
}
