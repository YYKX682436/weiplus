package bp5;

/* loaded from: classes14.dex */
public final class k implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f23469d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f23470e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.ArrayMap f23471f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f23472g;

    public k(kotlinx.coroutines.y0 glScope) {
        kotlin.jvm.internal.o.g(glScope, "glScope");
        this.f23469d = glScope;
        this.f23470e = new android.util.SparseArray();
        this.f23471f = new android.util.ArrayMap();
    }

    public final synchronized void a(int i17, bp5.h infoProvider) {
        kotlin.jvm.internal.o.g(infoProvider, "infoProvider");
        if (this.f23472g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "already closed");
            return;
        }
        bp5.g gVar = (bp5.g) this.f23470e.get(i17);
        if (gVar != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has " + i17 + " key");
            if (kotlin.jvm.internal.o.b(gVar.a(), infoProvider)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "already has same targetHolder register");
                return;
            }
            kotlinx.coroutines.l.d(this.f23469d, null, null, new bp5.j(gVar, null), 3, null);
        }
        bp5.g gVar2 = new bp5.g(i17, new java.lang.ref.WeakReference(infoProvider), null, null, false, 28, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "bindOutput " + infoProvider + ", " + i17 + ',' + gVar2);
        this.f23470e.put(i17, gVar2);
    }

    public final synchronized bp5.g b(int i17, java.lang.String info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "getRenderTarget " + i17 + " (" + info + ") and " + this.f23470e.get(i17));
        return (bp5.g) this.f23470e.get(i17);
    }

    public final synchronized void c(int i17, bp5.h infoProvider) {
        kotlin.jvm.internal.o.g(infoProvider, "infoProvider");
        bp5.g gVar = (bp5.g) this.f23470e.get(i17);
        jz5.f0 f0Var = null;
        if (gVar != null) {
            if (!kotlin.jvm.internal.o.b(gVar.a(), infoProvider)) {
                gVar = null;
            }
            if (gVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "unbindOutput " + infoProvider + ", " + i17);
                gVar.f23466e = false;
                kotlinx.coroutines.l.d(this.f23469d, null, null, new bp5.j(gVar, null), 3, null);
                this.f23470e.remove(i17);
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.RenderTargetHolder", "unbind renderTarget not match current", new java.lang.Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23472g = true;
        this.f23471f.clear();
        android.util.SparseArray sparseArray = this.f23470e;
        android.util.SparseArray clone = sparseArray.clone();
        kotlin.jvm.internal.o.f(clone, "clone(...)");
        sparseArray.clear();
        kotlinx.coroutines.l.d(this.f23469d, null, null, new bp5.i(clone, null), 3, null);
    }
}
