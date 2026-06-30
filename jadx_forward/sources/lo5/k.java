package lo5;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f401750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2793xcfa97743.v2.p2800xc84b4196.TextureViewSurfaceTextureListenerC22892x75ece15d f401751e;

    public k(android.widget.FrameLayout frameLayout, com.p314xaae8f345.mm.p2793xcfa97743.v2.p2800xc84b4196.TextureViewSurfaceTextureListenerC22892x75ece15d textureViewSurfaceTextureListenerC22892x75ece15d) {
        this.f401750d = frameLayout;
        this.f401751e = textureViewSurfaceTextureListenerC22892x75ece15d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout frameLayout = this.f401750d;
        frameLayout.addView(this.f401751e, new android.widget.FrameLayout.LayoutParams(frameLayout.getWidth(), frameLayout.getHeight()));
    }
}
