package i22;

/* loaded from: classes15.dex */
public final class z0 extends i22.w {

    /* renamed from: f, reason: collision with root package name */
    public final float f369603f;

    /* renamed from: g, reason: collision with root package name */
    public final float f369604g;

    /* renamed from: h, reason: collision with root package name */
    public final float f369605h;

    /* renamed from: i, reason: collision with root package name */
    public final int f369606i;

    public z0() {
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        this.f369603f = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561919wh);
        this.f369604g = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        this.f369605h = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f369593b = 4;
        this.f369606i = 4;
        d();
    }

    @Override // i22.w
    public float a() {
        return this.f369604g;
    }

    @Override // i22.w
    public float b() {
        return this.f369603f;
    }

    @Override // i22.w
    public float c() {
        return this.f369605h;
    }

    @Override // i22.w
    public void d() {
        int i17 = this.f369592a;
        float f17 = 2;
        float f18 = i17 - (this.f369604g * f17);
        float f19 = this.f369603f;
        if (f18 < f19 * f17) {
            this.f369593b = 1;
            return;
        }
        float f27 = this.f369605h;
        int i18 = (int) ((f18 + f27) / (f27 + f19));
        int i19 = this.f369606i;
        if (i18 > i19) {
            i18 = i19;
        }
        this.f369593b = i18;
        this.f369594c = (int) ((f18 - (i18 * f19)) / (i18 - 1));
        this.f369595d = (int) (((i17 - (f19 * i18)) - (r1 * i18)) / f17);
    }
}
