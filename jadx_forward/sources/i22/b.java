package i22;

/* loaded from: classes15.dex */
public final class b extends i22.w {

    /* renamed from: f, reason: collision with root package name */
    public final float f369462f;

    /* renamed from: g, reason: collision with root package name */
    public final float f369463g;

    public b() {
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        this.f369462f = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561916we);
        this.f369463g = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        d();
    }

    @Override // i22.w
    public float a() {
        return 0.0f;
    }

    @Override // i22.w
    public float b() {
        return this.f369462f;
    }

    @Override // i22.w
    public float c() {
        return this.f369463g;
    }

    @Override // i22.w
    public void d() {
        this.f369593b = (int) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().widthPixels - (2 * 0.0f)) / (this.f369462f + this.f369463g));
    }
}
