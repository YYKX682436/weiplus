package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f221896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f221897g;

    public m(java.lang.String str, int i17, int i18, boolean z17) {
        this.f221894d = str;
        this.f221895e = i17;
        this.f221896f = i18;
        this.f221897g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f221895e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f221896f;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str = this.f221894d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameControlCmdParser", "MicroMsg.Wepkg message pkgid:%s, downloadTriggerType:%d, downloadType:%d", str, valueOf, valueOf2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3();
        am.t20 t20Var = c6276xb08681d3.f136525g;
        t20Var.f89502a = 1;
        t20Var.f89503b = str;
        t20Var.f89506e = i17;
        t20Var.f89507f = i18;
        c6276xb08681d3.e();
        if (this.f221897g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 15L, 1L, false);
        }
    }
}
