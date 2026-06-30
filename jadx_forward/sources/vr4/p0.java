package vr4;

/* loaded from: classes.dex */
public class p0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 f521324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521325e;

    public p0(vr4.r0 r0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5, java.lang.String str) {
        this.f521324d = c6236xbc6b9a5;
        this.f521325e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        gm0.j1.i();
        gm0.j1.n().f354821b.q(1767, this);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5 = this.f521324d;
        if (i17 == 0 && i18 == 0) {
            am.f10 f10Var = c6236xbc6b9a5.f136485h;
            f10Var.f88160b = this.f521325e;
            f10Var.f88161c.run();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "check jsapi error: %s, %s", java.lang.Integer.valueOf(i18), str);
            am.f10 f10Var2 = c6236xbc6b9a5.f136485h;
            f10Var2.f88159a = -1;
            f10Var2.f88161c.run();
        }
    }
}
