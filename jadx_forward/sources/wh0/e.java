package wh0;

/* loaded from: classes11.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f527448d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0[] f527449e = {null};

    public e(java.lang.String str, int i17, int i18) {
        this.f527448d = new wh0.d(str, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        synchronized (this.f527449e) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f527449e[0];
            if (u0Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendWxAICommandCgi", "[!] reuse netscene, last queue callback:%s, new callback:%s", u0Var2, u0Var);
            }
            this.f527449e[0] = u0Var;
        }
        return mo9409x10f9447a(sVar, this.f527448d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 17907;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        synchronized (this.f527449e) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f527449e[0];
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
            }
        }
    }
}
