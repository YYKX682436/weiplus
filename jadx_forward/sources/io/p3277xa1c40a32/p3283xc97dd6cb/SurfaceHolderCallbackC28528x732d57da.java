package io.p3277xa1c40a32.p3283xc97dd6cb;

/* renamed from: io.clipworks.displaysys.DSProxySurfaceHolder */
/* loaded from: classes5.dex */
public class SurfaceHolderCallbackC28528x732d57da extends io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa implements android.view.SurfaceHolder.Callback {

    /* renamed from: holder */
    private final android.view.SurfaceHolder f70387xb7c6cdac;

    public SurfaceHolderCallbackC28528x732d57da(android.view.SurfaceHolder surfaceHolder) {
        this.f70387xb7c6cdac = surfaceHolder;
        surfaceHolder.addCallback(this);
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getHeight */
    public int mo136911x1c4fb41d() {
        android.view.SurfaceHolder surfaceHolder = this.f70387xb7c6cdac;
        if (surfaceHolder != null) {
            return surfaceHolder.getSurfaceFrame().height();
        }
        return 0;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getScaleFactor */
    public float mo136912x91b49603() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: getSurfaceHolder */
    public android.view.SurfaceHolder m136920xc38a6d03() {
        return this.f70387xb7c6cdac;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getVisibility */
    public int mo136914x61f71b08() {
        return 0;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getWidth */
    public int mo136915x755bd410() {
        android.view.SurfaceHolder surfaceHolder = this.f70387xb7c6cdac;
        if (surfaceHolder != null) {
            return surfaceHolder.getSurfaceFrame().width();
        }
        return 0;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getX */
    public float mo136916x305bc2() {
        if (this.f70387xb7c6cdac != null) {
            return r0.getSurfaceFrame().left;
        }
        return 0.0f;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getY */
    public float mo136917x305bc3() {
        if (this.f70387xb7c6cdac != null) {
            return r0.getSurfaceFrame().top;
        }
        return 0.0f;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        mo136918xa36f50f0(i17, i18, i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        m136940xb4b26d24(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        m136941x26cc0ebf();
    }
}
