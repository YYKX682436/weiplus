package lr;

/* loaded from: classes10.dex */
public final class a1 extends lr.o0 {

    /* renamed from: f, reason: collision with root package name */
    public final float f402025f;

    /* renamed from: g, reason: collision with root package name */
    public final float f402026g;

    /* renamed from: h, reason: collision with root package name */
    public final float f402027h;

    public a1() {
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        this.f402025f = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561907w5);
        this.f402026g = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f402027h = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) - 1;
        resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.f402094b = 8;
        e();
    }

    @Override // lr.o0
    public float a() {
        return this.f402026g;
    }

    @Override // lr.o0
    public float b() {
        return this.f402025f;
    }

    @Override // lr.o0
    public float c() {
        return this.f402027h;
    }
}
