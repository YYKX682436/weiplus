package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523;

/* renamed from: com.tencent.thumbplayer.tmediacodec.hook.THookTextureView */
/* loaded from: classes14.dex */
public class C26500x9e673249 extends android.view.TextureView {
    public static final java.lang.String TAG = "THookTextureView";

    /* renamed from: sHookCallback */
    private static com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.SurfaceTextureHookCallback f54147xbc04e69b;

    /* renamed from: mInnerSetListener */
    private final android.view.TextureView.SurfaceTextureListener f54148x586558d;

    /* renamed from: mOutSetListener */
    private android.view.TextureView.SurfaceTextureListener f54149x9e7768d5;

    /* renamed from: com.tencent.thumbplayer.tmediacodec.hook.THookTextureView$SurfaceTextureHookCallback */
    /* loaded from: classes14.dex */
    public interface SurfaceTextureHookCallback {
        /* renamed from: onSurfaceTextureDestroyedCalled */
        boolean mo103437x8cb207c9(android.graphics.SurfaceTexture surfaceTexture);
    }

    public C26500x9e673249(android.content.Context context) {
        this(context, null, 0);
    }

    /* renamed from: setHookCallback */
    public static void m103444x2499340a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.SurfaceTextureHookCallback surfaceTextureHookCallback) {
        f54147xbc04e69b = surfaceTextureHookCallback;
    }

    @Override // android.view.TextureView
    public final void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f54149x9e7768d5 = surfaceTextureListener;
        super.setSurfaceTextureListener(this.f54148x586558d);
    }

    public C26500x9e673249(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C26500x9e673249(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f54148x586558d = new android.view.TextureView.SurfaceTextureListener() { // from class: com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i18, int i19) {
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.this.f54149x9e7768d5 != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.this.f54149x9e7768d5.onSurfaceTextureAvailable(surfaceTexture, i18, i19);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
                boolean z17 = false;
                boolean z18 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.this.f54149x9e7768d5 == null || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.this.f54149x9e7768d5.onSurfaceTextureDestroyed(surfaceTexture);
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.f54147xbc04e69b == null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.TAG, this + ", onSurfaceTextureDestroyed surfaceTexture:" + surfaceTexture + " result:" + z18);
                    return z18;
                }
                if (z18 && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.f54147xbc04e69b.mo103437x8cb207c9(surfaceTexture)) {
                    z17 = true;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.TAG, this + "onSurfaceTextureDestroyed surfaceTexture:" + surfaceTexture + " hookResult:" + z17 + "result:" + z18);
                return z17;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i18, int i19) {
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.this.f54149x9e7768d5 != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.this.f54149x9e7768d5.onSurfaceTextureSizeChanged(surfaceTexture, i18, i19);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.this.f54149x9e7768d5 != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.this.f54149x9e7768d5.onSurfaceTextureUpdated(surfaceTexture);
                }
            }
        };
        setSurfaceTextureListener(null);
    }
}
