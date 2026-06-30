package sf;

/* loaded from: classes7.dex */
public class h extends com.p314xaae8f345.p3210x3857dc.C27821xa4f66a14 implements sf.d {

    /* renamed from: a, reason: collision with root package name */
    public gg.c f488475a;

    @Override // com.p314xaae8f345.p3210x3857dc.C27821xa4f66a14
    /* renamed from: onPluginDestroy */
    public void mo120216x5444bda8(java.lang.String str, int i17) {
        super.mo120216x5444bda8(str, i17);
        gg.c cVar = this.f488475a;
        if (cVar != null) {
            ((gg.a) cVar).f(str, i17);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27821xa4f66a14
    /* renamed from: onPluginReady */
    public void mo120218x514e8ad1(java.lang.String str, int i17, android.graphics.SurfaceTexture surfaceTexture) {
        super.mo120218x514e8ad1(str, i17, surfaceTexture);
        gg.c cVar = this.f488475a;
        if (cVar != null) {
            ((gg.a) cVar).g(str, i17, surfaceTexture);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27821xa4f66a14
    /* renamed from: onPluginReadyForGPUProcess */
    public void mo120219x7230127b(java.lang.String str, int i17, android.view.Surface surface) {
        super.mo120219x7230127b(str, i17, surface);
        gg.c cVar = this.f488475a;
        if (cVar != null) {
            gg.a aVar = (gg.a) cVar;
            aVar.getClass();
            java.lang.String d17 = sf.i.d(str, i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(aVar.b(), "onPluginReady, key:%s", d17);
            eg.b c17 = aVar.c(str, i17, d17);
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(aVar.b(), "onPluginReady, key:%s, handler is null", d17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(aVar.b(), "onPluginReady, key:%s, handler is ready", d17);
                c17.i(surface);
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27821xa4f66a14
    /* renamed from: onPluginScreenshotTaken */
    public void mo120220xb1e0e6af(java.lang.String str, int i17, android.graphics.Bitmap bitmap) {
        super.mo120220xb1e0e6af(str, i17, bitmap);
        gg.c cVar = this.f488475a;
        if (cVar != null) {
            gg.a aVar = (gg.a) cVar;
            aVar.getClass();
            java.lang.String d17 = sf.i.d(str, i17);
            aVar.b();
            eg.b c17 = aVar.c(str, i17, d17);
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(aVar.b(), "onPluginScreenshotTaken, key:%s, handler is null", d17);
            } else {
                c17.k(bitmap);
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27821xa4f66a14
    /* renamed from: onPluginTouch */
    public void mo120223x516f906d(java.lang.String str, int i17, android.view.MotionEvent motionEvent) {
        super.mo120223x516f906d(str, i17, motionEvent);
        gg.c cVar = this.f488475a;
        if (cVar != null) {
            ((gg.a) cVar).h(str, i17, motionEvent);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27821xa4f66a14, sf.d
    /* renamed from: setPluginTextureScale */
    public void mo120225xc0b8afc4(java.lang.String str, int i17, float f17, float f18) {
        super.mo120225xc0b8afc4(str, i17, f17, f18);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27821xa4f66a14, sf.d
    /* renamed from: takePluginScreenshot */
    public void mo120226xf63e37a0(java.lang.String str, int i17) {
        super.mo120226xf63e37a0(str, i17);
    }
}
