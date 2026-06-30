package bp5;

/* loaded from: classes14.dex */
public final class k implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f105002d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f105003e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.ArrayMap f105004f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f105005g;

    public k(p3325xe03a0797.p3326xc267989b.y0 glScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(glScope, "glScope");
        this.f105002d = glScope;
        this.f105003e = new android.util.SparseArray();
        this.f105004f = new android.util.ArrayMap();
    }

    public final synchronized void a(int i17, bp5.h infoProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoProvider, "infoProvider");
        if (this.f105005g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "already closed");
            return;
        }
        bp5.g gVar = (bp5.g) this.f105003e.get(i17);
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has " + i17 + " key");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.a(), infoProvider)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "already has same targetHolder register");
                return;
            }
            p3325xe03a0797.p3326xc267989b.l.d(this.f105002d, null, null, new bp5.j(gVar, null), 3, null);
        }
        bp5.g gVar2 = new bp5.g(i17, new java.lang.ref.WeakReference(infoProvider), null, null, false, 28, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "bindOutput " + infoProvider + ", " + i17 + ',' + gVar2);
        this.f105003e.put(i17, gVar2);
    }

    public final synchronized bp5.g b(int i17, java.lang.String info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "getRenderTarget " + i17 + " (" + info + ") and " + this.f105003e.get(i17));
        return (bp5.g) this.f105003e.get(i17);
    }

    public final synchronized void c(int i17, bp5.h infoProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoProvider, "infoProvider");
        bp5.g gVar = (bp5.g) this.f105003e.get(i17);
        jz5.f0 f0Var = null;
        if (gVar != null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.a(), infoProvider)) {
                gVar = null;
            }
            if (gVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "unbindOutput " + infoProvider + ", " + i17);
                gVar.f104999e = false;
                p3325xe03a0797.p3326xc267989b.l.d(this.f105002d, null, null, new bp5.j(gVar, null), 3, null);
                this.f105003e.remove(i17);
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.RenderTargetHolder", "unbind renderTarget not match current", new java.lang.Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f105005g = true;
        this.f105004f.clear();
        android.util.SparseArray sparseArray = this.f105003e;
        android.util.SparseArray clone = sparseArray.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clone, "clone(...)");
        sparseArray.clear();
        p3325xe03a0797.p3326xc267989b.l.d(this.f105002d, null, null, new bp5.i(clone, null), 3, null);
    }
}
