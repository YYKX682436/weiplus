package kf;

/* loaded from: classes7.dex */
public final class b extends android.graphics.SurfaceTexture {

    /* renamed from: a, reason: collision with root package name */
    public int f388692a;

    /* renamed from: b, reason: collision with root package name */
    public int f388693b;

    /* renamed from: c, reason: collision with root package name */
    public kf.a f388694c;

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameConsumedListener f388695d;

    @Override // android.graphics.SurfaceTexture
    public void setDefaultBufferSize(int i17, int i18) {
        if (this.f388692a == i17 && this.f388693b == i18) {
            return;
        }
        this.f388692a = i17;
        this.f388693b = i18;
        super.setDefaultBufferSize(i17, i18);
        kf.a aVar = this.f388694c;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.m0) aVar).a(i17, i18);
        }
    }

    @Override // android.graphics.SurfaceTexture
    public void updateTexImage() {
        super.updateTexImage();
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameConsumedListener onFrameConsumedListener = this.f388695d;
        if (onFrameConsumedListener != null) {
            onFrameConsumedListener.mo52732x774eb8d6();
        }
    }
}
