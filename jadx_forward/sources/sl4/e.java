package sl4;

/* loaded from: classes11.dex */
public final class e extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl4.g f490790a;

    public e(sl4.g gVar) {
        this.f490790a = gVar;
    }

    @Override // gp1.a0, gp1.z
    public void F0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81;
        sl4.g gVar = this.f490790a;
        gVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Integer num = null;
        boolean z17 = false;
        objArr[0] = c12886x91aa2b6d != null ? java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f490792n, "onFloatBallInfoReplaced type: %s", objArr);
        if (c12886x91aa2b6d != null && c12886x91aa2b6d.f174579d == gVar.h0()) {
            z17 = true;
        }
        if (z17) {
            if (c12886x91aa2b6d2 != null && (c12887x942bef81 = c12886x91aa2b6d2.M) != null) {
                num = java.lang.Integer.valueOf(c12887x942bef81.f174619f);
            }
            gVar.f490798t = num;
            gVar.w0(true, qk.z9.f445947f);
            gVar.u0(c12886x91aa2b6d, c12886x91aa2b6d2);
        }
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        sl4.g gVar = this.f490790a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f490792n, "onFloatBallDeleteButtonClick");
        gVar.n0();
        gVar.x0(qk.y9.f445917g);
        gVar.w0(true, qk.z9.f445946e);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    @Override // gp1.a0, gp1.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sl4.e.S(com.tencent.mm.plugin.ball.model.BallInfo, int, int, int, int):void");
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallPlayButtonClick status: ");
        sl4.g gVar = this.f490790a;
        bl4.b bVar = gVar.f490793o;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f103267c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f490792n, sb6.toString());
        gVar.t0();
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        sl4.g gVar = this.f490790a;
        if (gVar.k0()) {
            gVar.x0(qk.y9.f445915e);
            gVar.a();
        }
    }
}
