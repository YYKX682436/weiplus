package wq4;

/* loaded from: classes14.dex */
public final class l0 extends android.graphics.SurfaceTexture {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f530196a;

    public l0(int i17) {
        super(i17);
        this.f530196a = "MicroMsg.VoipSurfaceTexture";
        try {
            detachFromGLContext();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530196a, "detachFromGLContext  in init error");
        }
    }
}
