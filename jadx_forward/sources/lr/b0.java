package lr;

/* loaded from: classes10.dex */
public final class b0 extends lr.o0 {

    /* renamed from: f, reason: collision with root package name */
    public final float f402029f;

    /* renamed from: g, reason: collision with root package name */
    public final float f402030g;

    /* renamed from: h, reason: collision with root package name */
    public final float f402031h;

    public b0() {
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        this.f402029f = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561905w3);
        this.f402030g = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f402031h = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) - 1;
        resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.f402094b = 5;
        e();
    }

    @Override // lr.o0
    public float a() {
        return this.f402030g;
    }

    @Override // lr.o0
    public float b() {
        return this.f402029f;
    }

    @Override // lr.o0
    public float c() {
        return this.f402031h;
    }

    @Override // lr.o0
    public void e() {
        if (com.p314xaae8f345.mm.ui.bk.A()) {
            super.e();
            return;
        }
        float f17 = this.f402093a;
        float f18 = 2;
        float f19 = this.f402030g;
        float f27 = f17 - (f18 * f19);
        float f28 = this.f402029f;
        if (f27 < f28 * f18) {
            this.f402094b = 1;
            return;
        }
        float f29 = this.f402031h;
        float f37 = (f27 - f28) / (f28 + f29);
        float b17 = a06.d.b(f37) != 0 ? f37 / a06.d.b(f37) : 0.0f;
        int i17 = ((b17 >= 1.0f || b17 <= 0.989f) ? (int) f37 : ((int) f37) + 1) + 1;
        float f38 = i17;
        int i18 = (int) ((f27 - (f28 * f38)) / (i17 - 1));
        this.f402095c = i18;
        this.f402096d = (int) (((this.f402093a - (f38 * f28)) - (i18 * i17)) / f18);
        this.f402097e = i18 / 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("customPanelSizeResolver", "updateSize: " + i17 + ", itemSize: " + f28 + ", edgeSize: " + f19 + ", minSpaceSize: " + f29 + ", spanCount: " + this.f402094b + ", itemSpace: " + this.f402095c + ", contentPadding: " + this.f402096d + ", titlePadding: " + this.f402097e + " parentWidth: " + this.f402093a + ' ' + ((f27 - f28) / (f28 + f29)) + "， ratio: " + b17);
        this.f402094b = i17;
    }
}
