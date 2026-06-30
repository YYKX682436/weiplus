package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget */
/* loaded from: classes15.dex */
public class C28741x872bf68d implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf {
    private static final java.lang.String TAG = "SurfaceTexturePlatformViewRenderTarget";

    /* renamed from: surface */
    private android.view.Surface f71892x9189ecad;

    /* renamed from: surfaceTexture */
    private android.graphics.SurfaceTexture f71893x299653ae;

    /* renamed from: surfaceTextureEntry */
    private final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry f71894x3350e164;

    /* renamed from: trimMemoryListener */
    private final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener f71895xd557b197;

    /* renamed from: bufferWidth */
    private int f71890xc2725166 = 0;

    /* renamed from: bufferHeight */
    private int f71889x7208e187 = 0;

    /* renamed from: shouldRecreateSurfaceForLowMemory */
    private boolean f71891xf00b50d7 = false;

    public C28741x872bf68d(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry) {
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener onTrimMemoryListener = new io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener() { // from class: io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget.1
            @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener
            /* renamed from: onTrimMemory */
            public void mo138091x29685b02(int i17) {
                if (i17 != 80 || android.os.Build.VERSION.SDK_INT < 29) {
                    return;
                }
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28741x872bf68d.this.f71891xf00b50d7 = true;
            }
        };
        this.f71895xd557b197 = onTrimMemoryListener;
        this.f71894x3350e164 = surfaceTextureEntry;
        this.f71893x299653ae = surfaceTextureEntry.mo138117x299653ae();
        surfaceTextureEntry.mo138116x399c4d58(onTrimMemoryListener);
    }

    /* renamed from: recreateSurfaceIfNeeded */
    private void m138837x908f6a10() {
        android.view.Surface surface = this.f71892x9189ecad;
        if (surface == null || this.f71891xf00b50d7) {
            if (surface != null) {
                surface.release();
                this.f71892x9189ecad = null;
            }
            this.f71892x9189ecad = m138838x17711011();
            this.f71891xf00b50d7 = false;
        }
    }

    /* renamed from: createSurface */
    public android.view.Surface m138838x17711011() {
        return new android.view.Surface(this.f71893x299653ae);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getHeight */
    public int mo53762x1c4fb41d() {
        return this.f71889x7208e187;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getId */
    public long mo53763x5db1b11() {
        return this.f71894x3350e164.id();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getSurface */
    public android.view.Surface mo53764xcf572877() {
        m138837x908f6a10();
        android.graphics.SurfaceTexture surfaceTexture = this.f71893x299653ae;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f71892x9189ecad;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getWidth */
    public int mo53765x755bd410() {
        return this.f71890xc2725166;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: isReleased */
    public boolean mo53766xafdb8087() {
        return this.f71893x299653ae == null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: release */
    public void mo53767x41012807() {
        this.f71893x299653ae = null;
        android.view.Surface surface = this.f71892x9189ecad;
        if (surface != null) {
            surface.release();
            this.f71892x9189ecad = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: resize */
    public void mo53768xc84d9cb4(int i17, int i18) {
        this.f71890xc2725166 = i17;
        this.f71889x7208e187 = i18;
        android.graphics.SurfaceTexture surfaceTexture = this.f71893x299653ae;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i17, i18);
        }
    }
}
