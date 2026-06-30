package bg1;

/* loaded from: classes7.dex */
public class g implements fb1.h {

    /* renamed from: d, reason: collision with root package name */
    public boolean f101419d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f101420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.w f101421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg1.h f101422g;

    public g(bg1.h hVar, p012xc85e97e9.p093xedfae76a.y yVar, tf.w wVar) {
        this.f101422g = hVar;
        this.f101420e = yVar;
        this.f101421f = wVar;
    }

    @Override // fb1.h
    public void a(fb1.c cVar) {
        yf.i0 i0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "checkCanInsertLivePusher, onStatusChange, status: %s", cVar);
        if ((cVar instanceof fb1.b) && (i0Var = this.f101422g.f101431i) != null && i0Var.I) {
            final yf.i0 i0Var2 = this.f101422g.f101431i;
            i0Var2.getClass();
            i0Var2.G(new java.lang.Runnable() { // from class: yf.i0$$c
                @Override // java.lang.Runnable
                public final void run() {
                    yf.i0 i0Var3 = yf.i0.this;
                    if (i0Var3.I) {
                        i0Var3.I = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "unMutePlayInHighPriorityTask");
                        if (i0Var3.f542892J) {
                            if (i0Var3.f542895i == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var3.x(), "run#operate, adapter is null");
                                return;
                            }
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putBoolean("muted", false);
                            i0Var3.f542895i.g(bundle);
                        }
                    }
                }
            });
        } else if (cVar instanceof fb1.a) {
            this.f101421f.m();
            this.f101419d = true;
        } else if (this.f101419d) {
            this.f101419d = false;
            this.f101421f.o();
        }
    }

    @Override // fb1.h
    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y mo10388x95c7fa5f() {
        return this.f101420e;
    }
}
