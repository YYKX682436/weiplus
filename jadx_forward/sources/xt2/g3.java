package xt2;

/* loaded from: classes2.dex */
public final class g3 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f538299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f538300e;

    public g3(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, xt2.r3 r3Var) {
        this.f538299d = c22789xd23e9a9b;
        this.f538300e = r3Var;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f538299d.setVisibility(8);
        xt2.r3 r3Var = this.f538300e;
        java.lang.Runnable runnable = r3Var.f538514d;
        if (runnable != null) {
            r3Var.f538513c.mo50300x3fa464aa(runnable);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "cart promote pag cancel");
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f538299d.setVisibility(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "cart promote pag start");
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f538299d.setVisibility(8);
        xt2.r3 r3Var = this.f538300e;
        java.lang.Runnable runnable = r3Var.f538514d;
        if (runnable != null) {
            r3Var.f538513c.mo50300x3fa464aa(runnable);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "cart promote pag end");
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
