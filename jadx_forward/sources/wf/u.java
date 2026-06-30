package wf;

/* loaded from: classes7.dex */
public class u extends tf.j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf1.o f527017g;

    public u(wf.v vVar, yf1.o oVar) {
        this.f527017g = oVar;
    }

    @Override // pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        java.lang.String str = this.f500359a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferFrom, textureView: " + ((com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view));
        this.f500362d = false;
        yf1.o oVar = this.f527017g;
        wf.b bVar = oVar.f543184a;
        wf.b bVar2 = oVar.f543184a;
        android.view.Surface surface = bVar.f526949g;
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
            bVar2.f526950h = surface;
            if (bVar2.N(surface)) {
                oVar.b(bVar2.f526957q, bVar2.f526958r);
            }
            if (runnable != null) {
                bVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferFrom, run afterTransferFromTask when originSurfaceTexture is null");
                runnable.run();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // pd1.l
    public android.view.View e(android.content.Context context) {
        return new com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c(context, null);
    }

    @Override // tf.j
    public tf.i g(android.view.View view, java.lang.Runnable runnable) {
        return new wf.t(this, (com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view, runnable);
    }
}
