package bu4;

@j95.b
/* loaded from: classes9.dex */
public class i extends i95.w implements cu4.k {

    /* renamed from: e, reason: collision with root package name */
    public fu4.h f106152e;

    /* renamed from: f, reason: collision with root package name */
    public fu4.n f106153f;

    /* renamed from: g, reason: collision with root package name */
    public bu4.h f106154g;

    /* renamed from: h, reason: collision with root package name */
    public cu4.j f106155h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f106151d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f106156i = false;

    /* renamed from: m, reason: collision with root package name */
    public cu4.g f106157m = new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.j();

    /* renamed from: n, reason: collision with root package name */
    public boolean f106158n = false;

    public boolean Ai() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wallet_lock_kinda_config, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "isWalletKindaEnable %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public void Bi(int i17, java.lang.String str) {
        this.f106155h.mo25445x3b7b1324(2, str, "", "", "");
    }

    public void Di() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "onAuthenSuccess, isfaceId : %s", java.lang.Boolean.valueOf(this.f106158n));
        zt5.s sVar = this.f106158n ? mz2.d2.IML.f414647g : com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance.f262904e;
        if (sVar != null) {
            java.lang.String str = sVar.f557154b;
            this.f106155h.mo25445x3b7b1324((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || fu4.a.d(str)) ? 0 : 1, "", str, sVar.f557162j, sVar.f557163k);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "SoterSignatureResult is null, show as fail");
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knq);
            if (this.f106158n) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2u);
            }
            Bi(2, string);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "PluginWalletLock onAccountRelease");
        java.util.HashSet hashSet = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE.f262912g;
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        hu4.i.f366763a = -1L;
        fu4.a.f348417a = -1L;
        ((km0.c) gm0.j1.p().a()).f390522c.registerActivityLifecycleCallbacks(new bu4.f(this));
    }

    public cu4.g wi() {
        if (this.f106157m == null) {
            synchronized (this) {
                if (this.f106157m == null) {
                    this.f106157m = new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.j();
                }
            }
        }
        return this.f106157m;
    }
}
