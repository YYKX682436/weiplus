package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class b extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f243772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.z9 f243773b;

    public b(boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        this.f243772a = z17;
        this.f243773b = z9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f243772a;
        int i17 = z17 ? n17 & (-257) : n17 | 256;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetShake", "setInstall pluginFlag install:%b  pluginFlag : %d -> %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(n17), java.lang.Integer.valueOf(i17));
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            c34.s Ni = c34.h0.Ni();
            Ni.f119773d.A("shakeitem1", "delete from shakeitem1");
            Ni.m145262xf35bbb4();
            com.p314xaae8f345.mm.p2621x8fb0427b.qa Di = r21.w.Di();
            Di.f276784d.mo70514xb06685ab(Di.mo145255x88e404c3(), null, null);
        }
        com.p314xaae8f345.mm.ui.z9 z9Var = this.f243773b;
        if (z9Var != null) {
            z9Var.mo735xb0dfc7d8(null, null);
        }
    }
}
