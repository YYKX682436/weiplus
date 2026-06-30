package x03;

/* loaded from: classes15.dex */
public final class o0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f532616d;

    public o0(x03.u0 u0Var) {
        this.f532616d = u0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public final void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var;
        x03.u0 u0Var = this.f532616d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f532666a, "FVPlayer video_status " + interfaceC26164x73fc6bc6 + " prepared");
        u0Var.f532675j = true;
        x03.s1 s1Var = u0Var.f532669d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 3, interfaceC26164x73fc6bc6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1414, 0);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = u0Var.f532678m;
        if (!(b4Var2 != null && b4Var2.e()) || (b4Var = u0Var.f532678m) == null) {
            return;
        }
        b4Var.c(500L, 500L);
    }
}
