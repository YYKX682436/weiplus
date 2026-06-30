package df2;

/* loaded from: classes3.dex */
public final class xd implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.yd f313305a;

    public xd(df2.yd ydVar) {
        this.f313305a = ydVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.y23 y23Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && (y23Var = (r45.y23) ((r45.bv1) fVar.f152151d).m75936x14adae67(3)) != null) {
            df2.yd ydVar = this.f313305a;
            ydVar.getClass();
            cm2.m0 m0Var = new cm2.m0(y23Var);
            dk2.xf P6 = ydVar.P6();
            if (P6 != null) {
                ((dk2.r4) P6).l0((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ydVar.O6(), m0Var, new df2.wd(ydVar, y23Var));
            }
            l81.b1 c17 = st2.c2.f493782a.c(y23Var, 1177, null, "", null, true);
            android.content.Context O6 = ydVar.O6();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = O6 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) O6 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                dk2.q4 q4Var = dk2.q4.f315471a;
                gk2.e liveRoomData = ydVar.getStore().getLiveRoomData();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = ydVar.f372632e;
                q4Var.n(abstractActivityC21394xb3d2c0cf, liveRoomData, c17, ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null);
            }
        }
        return jz5.f0.f384359a;
    }
}
