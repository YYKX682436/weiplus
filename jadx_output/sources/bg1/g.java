package bg1;

/* loaded from: classes7.dex */
public class g implements fb1.h {

    /* renamed from: d, reason: collision with root package name */
    public boolean f19886d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f19887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.w f19888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg1.h f19889g;

    public g(bg1.h hVar, androidx.lifecycle.y yVar, tf.w wVar) {
        this.f19889g = hVar;
        this.f19887e = yVar;
        this.f19888f = wVar;
    }

    @Override // fb1.h
    public void a(fb1.c cVar) {
        yf.i0 i0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "checkCanInsertLivePusher, onStatusChange, status: %s", cVar);
        if ((cVar instanceof fb1.b) && (i0Var = this.f19889g.f19898i) != null && i0Var.I) {
            final yf.i0 i0Var2 = this.f19889g.f19898i;
            i0Var2.getClass();
            i0Var2.G(new java.lang.Runnable() { // from class: yf.i0$$c
                @Override // java.lang.Runnable
                public final void run() {
                    yf.i0 i0Var3 = yf.i0.this;
                    if (i0Var3.I) {
                        i0Var3.I = false;
                        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "unMutePlayInHighPriorityTask");
                        if (i0Var3.f461359J) {
                            if (i0Var3.f461362i == null) {
                                com.tencent.mars.xlog.Log.w(i0Var3.x(), "run#operate, adapter is null");
                                return;
                            }
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putBoolean("muted", false);
                            i0Var3.f461362i.g(bundle);
                        }
                    }
                }
            });
        } else if (cVar instanceof fb1.a) {
            this.f19888f.m();
            this.f19886d = true;
        } else if (this.f19886d) {
            this.f19886d = false;
            this.f19888f.o();
        }
    }

    @Override // fb1.h
    public androidx.lifecycle.y getLifecycleOwner() {
        return this.f19887e;
    }
}
