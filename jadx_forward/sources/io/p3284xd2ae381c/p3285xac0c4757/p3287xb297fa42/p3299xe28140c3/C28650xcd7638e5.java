package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3;

/* renamed from: io.flutter.embedding.engine.renderer.SurfaceTextureWrapper */
/* loaded from: classes14.dex */
public class C28650xcd7638e5 {

    /* renamed from: attached */
    private boolean f71277x201c7da4;

    /* renamed from: newFrameAvailable */
    private boolean f71278x61e3699c;

    /* renamed from: onFrameConsumed */
    private java.lang.Runnable f71279x774eb8d6;

    /* renamed from: released */
    private boolean f71280xdf23d93d;

    /* renamed from: surfaceTexture */
    private android.graphics.SurfaceTexture f71281x299653ae;

    public C28650xcd7638e5(android.graphics.SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }

    /* renamed from: attachToGLContext */
    public void m138133xc868816a(int i17) {
        synchronized (this) {
            if (this.f71280xdf23d93d) {
                return;
            }
            if (this.f71277x201c7da4) {
                this.f71281x299653ae.detachFromGLContext();
            }
            io.p3284xd2ae381c.Log.i("SurfaceTextureWrapper", "attachToGLContext " + this.f71281x299653ae);
            try {
                this.f71281x299653ae.attachToGLContext(i17);
            } catch (java.lang.Exception e17) {
                io.p3284xd2ae381c.Log.w("SurfaceTextureWrapper", "attachToGLContext with exception: " + e17);
            }
            this.f71277x201c7da4 = true;
        }
    }

    /* renamed from: detachFromGLContext */
    public void m138134x34700fcd() {
        synchronized (this) {
            io.p3284xd2ae381c.Log.i("SurfaceTextureWrapper", "detachFromGLContext " + this.f71281x299653ae);
            if (this.f71277x201c7da4 && !this.f71280xdf23d93d) {
                try {
                    this.f71281x299653ae.detachFromGLContext();
                } catch (java.lang.Exception e17) {
                    io.p3284xd2ae381c.Log.w("SurfaceTextureWrapper", "detachFromGLContext with exception " + e17);
                }
                this.f71277x201c7da4 = false;
            }
        }
    }

    /* renamed from: getTransformMatrix */
    public void m138135xb1778017(float[] fArr) {
        this.f71281x299653ae.getTransformMatrix(fArr);
    }

    /* renamed from: markDirty */
    public void m138136xc681e505() {
        synchronized (this) {
            this.f71278x61e3699c = true;
        }
    }

    /* renamed from: release */
    public void m138137x41012807() {
        synchronized (this) {
            if (!this.f71280xdf23d93d) {
                io.p3284xd2ae381c.Log.i("SurfaceTextureWrapper", "release " + this.f71281x299653ae);
                this.f71281x299653ae.release();
                this.f71280xdf23d93d = true;
                this.f71277x201c7da4 = false;
            }
        }
    }

    /* renamed from: shouldUpdate */
    public boolean m138138xb527e85c() {
        boolean z17;
        synchronized (this) {
            z17 = this.f71278x61e3699c;
        }
        return z17;
    }

    /* renamed from: surfaceTexture */
    public android.graphics.SurfaceTexture m138139x299653ae() {
        return this.f71281x299653ae;
    }

    /* renamed from: updateTexImage */
    public void m138140xf5b8bd5d() {
        synchronized (this) {
            this.f71278x61e3699c = false;
            if (!this.f71280xdf23d93d) {
                try {
                    this.f71281x299653ae.updateTexImage();
                    java.lang.Runnable runnable = this.f71279x774eb8d6;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (java.lang.Exception e17) {
                    io.p3284xd2ae381c.Log.e("SurfaceTextureWrapper", "updateTexImage with exception" + e17);
                }
            }
        }
    }

    public C28650xcd7638e5(android.graphics.SurfaceTexture surfaceTexture, java.lang.Runnable runnable) {
        this.f71278x61e3699c = false;
        this.f71281x299653ae = surfaceTexture;
        this.f71280xdf23d93d = false;
        this.f71279x774eb8d6 = runnable;
    }
}
