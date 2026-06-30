package qa1;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f442508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f442509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qa1.h f442510f;

    public d(qa1.h hVar, int i17, int i18) {
        this.f442510f = hVar;
        this.f442508d = i17;
        this.f442509e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.h hVar = this.f442510f;
        android.graphics.SurfaceTexture b17 = hVar.f442532o.b();
        int i17 = this.f442508d;
        int i18 = this.f442509e;
        super/*gh.k*/.onSurfaceTextureSizeChanged(b17, i17, i18);
        hVar.f442531n.t(i17, i18);
    }
}
