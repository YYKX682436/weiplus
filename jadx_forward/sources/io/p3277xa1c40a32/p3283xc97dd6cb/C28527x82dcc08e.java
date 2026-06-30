package io.p3277xa1c40a32.p3283xc97dd6cb;

/* renamed from: io.clipworks.displaysys.DSProxySurface */
/* loaded from: classes5.dex */
public class C28527x82dcc08e extends io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa {

    /* renamed from: format */
    private int f70383xb45ff7f7;

    /* renamed from: height */
    private int f70384xb7389127;

    /* renamed from: surface */
    private android.view.Surface f70385x9189ecad;

    /* renamed from: width */
    private int f70386x6be2dc6;

    public C28527x82dcc08e(android.view.Surface surface) {
        m136919x385f87a4(surface);
    }

    /* renamed from: getFormat */
    public int m136910x19771aed() {
        return this.f70383xb45ff7f7;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getHeight */
    public int mo136911x1c4fb41d() {
        return this.f70384xb7389127;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getScaleFactor */
    public float mo136912x91b49603() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: getSurface */
    public android.view.Surface m136913xcf572877() {
        return this.f70385x9189ecad;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getVisibility */
    public int mo136914x61f71b08() {
        return 0;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getWidth */
    public int mo136915x755bd410() {
        return this.f70386x6be2dc6;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getX */
    public float mo136916x305bc2() {
        return 0.0f;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: getY */
    public float mo136917x305bc3() {
        return 0.0f;
    }

    @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
    /* renamed from: notifySurfaceChanged */
    public void mo136918xa36f50f0(int i17, int i18, int i19) {
        this.f70383xb45ff7f7 = i17;
        this.f70386x6be2dc6 = i18;
        this.f70384xb7389127 = i19;
        super.mo136918xa36f50f0(i17, i18, i19);
    }

    /* renamed from: updateSurface */
    public void m136919x385f87a4(android.view.Surface surface) {
        this.f70385x9189ecad = surface;
        if (surface != null) {
            this.f70386x6be2dc6 = io.p3277xa1c40a32.p3283xc97dd6cb.C28531xe9af6c24.c(surface);
            this.f70384xb7389127 = io.p3277xa1c40a32.p3283xc97dd6cb.C28531xe9af6c24.b(surface);
            this.f70383xb45ff7f7 = io.p3277xa1c40a32.p3283xc97dd6cb.C28531xe9af6c24.a(surface);
        } else {
            this.f70386x6be2dc6 = 0;
            this.f70384xb7389127 = 0;
            this.f70383xb45ff7f7 = 0;
        }
    }
}
