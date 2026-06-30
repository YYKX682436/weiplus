package x03;

/* loaded from: classes15.dex */
public final class p0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f532620d;

    public p0(x03.u0 u0Var) {
        this.f532620d = u0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public final void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        x03.u0 u0Var = this.f532620d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(u0Var.f532666a, "tplayer log " + interfaceC26164x73fc6bc6 + " error " + i17 + ' ' + i18);
        x03.s1 s1Var = u0Var.f532669d;
        if (s1Var != null) {
            ((x03.i1) s1Var).a(i18, i17, "视频加载失败，请重试", "重试");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1414, 1);
    }
}
