package bg;

/* loaded from: classes7.dex */
public class b1 extends tf.j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f101277g;

    public b1(bg.c1 c1Var, fg1.g1 g1Var) {
        this.f101277g = g1Var;
    }

    @Override // pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f500359a, "transferFrom, textureView: " + ((com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view));
        this.f500362d = false;
        h(runnable);
    }

    @Override // pd1.l
    public android.view.View e(android.content.Context context) {
        com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c c3961x5e8e15c = new com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c(context, null);
        fg1.g1 g1Var = this.f101277g;
        g1Var.f343401a.H1 = new bg.d(g1Var, c3961x5e8e15c);
        return c3961x5e8e15c;
    }

    @Override // tf.j
    public tf.i g(android.view.View view, java.lang.Runnable runnable) {
        return new bg.a1(this, (com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view, runnable);
    }

    public final void h(java.lang.Runnable runnable) {
        fg1.g1 g1Var = this.f101277g;
        bg.f fVar = g1Var.f343401a;
        bg.f fVar2 = g1Var.f343401a;
        android.view.Surface surface = fVar.f101296g;
        java.lang.String str = this.f500359a;
        if (surface == null || !surface.isValid()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "transferFrom, originSurface is invalid");
            if (runnable != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferFrom, run afterTransferFromTask when originSurface is invalid");
                runnable.run();
                return;
            }
            return;
        }
        try {
            fVar2.T(surface);
            if (runnable != null) {
                fVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferFrom, run afterTransferFromTask when originSurfaceTexture is null");
                runnable.run();
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
