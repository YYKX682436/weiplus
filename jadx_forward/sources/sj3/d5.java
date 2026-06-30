package sj3;

/* loaded from: classes14.dex */
public final class d5 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed f490018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f490019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f490020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f490021g;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed, android.graphics.Bitmap bitmap, int i17, int i18) {
        this.f490018d = c16587x33e31ed;
        this.f490019e = bitmap;
        this.f490020f = i17;
        this.f490021g = i18;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "drawBitmap";
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f490018d.f231874g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da0 = this.f490018d.f231872e;
        if (textureViewSurfaceTextureListenerC16577xc6e62da0 != null) {
            textureViewSurfaceTextureListenerC16577xc6e62da0.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed = this.f490018d;
        android.graphics.Bitmap bitmap = this.f490019e;
        int i17 = this.f490020f;
        int i18 = this.f490021g;
        synchronized (c16587x33e31ed) {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da02 = c16587x33e31ed.f231872e;
                    if (textureViewSurfaceTextureListenerC16577xc6e62da02 == null) {
                        return;
                    }
                    android.graphics.Canvas lockCanvas = textureViewSurfaceTextureListenerC16577xc6e62da02.lockCanvas(null);
                    if (lockCanvas == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultitalkFrameView", "getCanvasError");
                        return;
                    }
                    android.graphics.Matrix i19 = c16587x33e31ed.i(lockCanvas.getWidth(), lockCanvas.getHeight(), bitmap.getWidth(), bitmap.getHeight(), i17, i18);
                    c16587x33e31ed.f231885u = bitmap.getWidth();
                    c16587x33e31ed.f231886v = bitmap.getHeight();
                    lockCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    lockCanvas.drawColor(android.graphics.Color.parseColor("#232323"));
                    if (!bitmap.isRecycled()) {
                        try {
                            lockCanvas.drawBitmap(bitmap, i19, c16587x33e31ed.f231879o);
                        } catch (java.lang.Exception unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultitalkFrameView", "draw bitmap error");
                        }
                    }
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da03 = c16587x33e31ed.f231872e;
                        if (textureViewSurfaceTextureListenerC16577xc6e62da03 != null) {
                            textureViewSurfaceTextureListenerC16577xc6e62da03.unlockCanvasAndPost(lockCanvas);
                        }
                        c16587x33e31ed.f231882r++;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultitalkFrameView", e17, "drawBitmap unlockCanvasAndPost crash", new java.lang.Object[0]);
                    }
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultitalkFrameView", "DrawBitmap, bitmap is null or recycled");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(220L, 27L, 1L, false);
        }
    }
}
