package cw2;

/* loaded from: classes14.dex */
public final class a6 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.b6 f305099d;

    public a6(cw2.b6 b6Var) {
        this.f305099d = b6Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        cw2.b6 b6Var = this.f305099d;
        try {
            surfaceTexture.updateTexImage();
            yz5.a aVar = b6Var.f305131d;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } catch (java.lang.RuntimeException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderThumbPlayerPostProcessor", "Update texture image failed. " + b6Var);
        }
    }
}
