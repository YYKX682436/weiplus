package i72;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f370944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f370945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f370946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a f370947g;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a, int i17, int i18, int i19) {
        this.f370947g = textureViewSurfaceTextureListenerC13526x5bf79f0a;
        this.f370944d = i17;
        this.f370945e = i18;
        this.f370946f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f370944d;
        int i18 = this.f370945e;
        int i19 = i17 - i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "restHeight: %d", java.lang.Integer.valueOf(i19));
        if (i19 <= 0) {
            return;
        }
        int i27 = i19 / 2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f370946f, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = this.f370947g;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(textureViewSurfaceTextureListenerC13526x5bf79f0a.getLayoutParams());
        layoutParams.setMargins(marginLayoutParams.leftMargin, i27, marginLayoutParams.rightMargin, marginLayoutParams.height + i27);
        textureViewSurfaceTextureListenerC13526x5bf79f0a.setLayoutParams(layoutParams);
        textureViewSurfaceTextureListenerC13526x5bf79f0a.invalidate();
    }
}
