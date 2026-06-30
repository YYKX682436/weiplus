package df2;

/* loaded from: classes3.dex */
public final class x1 implements tn0.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f313285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.y1 f313286e;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, df2.y1 y1Var) {
        this.f313285d = c14197x319b1b9e;
        this.f313286e = y1Var;
    }

    @Override // tn0.x0
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f313285d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14197x319b1b9e, "<this>");
        if2.z.f372686a.i(c14197x319b1b9e, new df2.a2(c14197x319b1b9e, i17));
        df2.y1 y1Var = this.f313286e;
        df2.y1.e7(y1Var, 0, 0, 3, null);
        df2.y1.Z6(y1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCommonController", "onExitRoom " + i17);
    }

    @Override // tn0.x0
    public void e(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCommonController", "onEnterRoom " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f313285d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14197x319b1b9e, "<this>");
        if2.z.f372686a.i(c14197x319b1b9e, new df2.z1(c14197x319b1b9e, j17));
    }

    @Override // tn0.x0
    public void q1(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f313285d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14197x319b1b9e, "<this>");
        if2.z zVar = if2.z.f372686a;
        zVar.i(c14197x319b1b9e, new df2.b2(c14197x319b1b9e, i17, i18, str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCommonController", "onSwitchRole currentRole: " + i17 + " errMsg: " + str);
        df2.y1 y1Var = this.f313286e;
        if (i17 != 20) {
            df2.y1.Z6(y1Var);
            df2.y1.e7(y1Var, 0, 0, 3, null);
            return;
        }
        y1Var.f7();
        y1Var.getClass();
        if (zl2.r4.f555483a.x1() || y1Var.f313375q) {
            return;
        }
        y1Var.f313375q = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store = y1Var.getStore();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "<this>");
        zVar.i(store, new mf2.d(store));
        dk2.ef.f314905a.V(false);
    }
}
