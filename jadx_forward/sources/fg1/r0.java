package fg1;

/* loaded from: classes7.dex */
public class r0 implements dg.g {

    /* renamed from: a, reason: collision with root package name */
    public int f343414a;

    /* renamed from: b, reason: collision with root package name */
    public int f343415b;

    /* renamed from: c, reason: collision with root package name */
    public int f343416c;

    /* renamed from: d, reason: collision with root package name */
    public int f343417d;

    /* renamed from: e, reason: collision with root package name */
    public int f343418e;

    /* renamed from: f, reason: collision with root package name */
    public int f343419f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f343420g;

    /* renamed from: h, reason: collision with root package name */
    public float f343421h;

    /* renamed from: i, reason: collision with root package name */
    public float f343422i;

    public boolean a(java.lang.String str, int i17, int i18, int i19, int i27) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, scale type is null");
            return false;
        }
        if (i17 == 0 || i18 == 0 || i19 == 0 || i27 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, width or height is 0");
            return false;
        }
        if (str.equalsIgnoreCase(this.f343420g) && this.f343414a == i17 && this.f343415b == i18 && this.f343416c == i19 && this.f343417d == i27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, same as last calculated");
            return true;
        }
        this.f343420g = str;
        this.f343414a = i17;
        this.f343415b = i18;
        this.f343416c = i19;
        this.f343417d = i27;
        float f17 = (i19 * 1.0f) / i27;
        float f18 = (i17 * 1.0f) / i18;
        if (str.equalsIgnoreCase("contain")) {
            int i28 = this.f343414a;
            int i29 = this.f343415b;
            if (i28 < i29) {
                int i37 = (int) (i28 / f17);
                this.f343419f = i37;
                this.f343418e = i28;
                if (i37 > i29) {
                    this.f343418e = (int) (i29 * f17);
                    this.f343419f = i29;
                }
            } else {
                int i38 = (int) (i29 * f17);
                this.f343418e = i38;
                this.f343419f = i29;
                if (i38 > i28) {
                    this.f343419f = (int) (i28 / f17);
                    this.f343418e = i28;
                }
            }
        } else if (this.f343420g.equalsIgnoreCase("fill")) {
            this.f343419f = this.f343415b;
            this.f343418e = this.f343414a;
        } else if (this.f343420g.equalsIgnoreCase("cover")) {
            int i39 = this.f343414a;
            int i47 = this.f343415b;
            if (i39 > i47) {
                int i48 = (int) (i39 / f17);
                this.f343419f = i48;
                this.f343418e = i39;
                if (i48 < i47) {
                    this.f343418e = (int) (i47 * f17);
                    this.f343419f = i47;
                }
            } else {
                int i49 = (int) (i47 * f17);
                this.f343418e = i49;
                this.f343419f = i47;
                if (i49 < i39) {
                    this.f343419f = (int) (i39 / f17);
                    this.f343418e = i39;
                }
            }
        } else if (java.lang.Math.abs(f17 - f18) > 0.05d) {
            int i57 = this.f343414a;
            int i58 = this.f343415b;
            if (i57 < i58) {
                this.f343419f = (int) (i57 / f17);
                this.f343418e = i57;
            } else {
                this.f343418e = (int) (i58 * f17);
                this.f343419f = i58;
            }
        } else {
            int i59 = this.f343414a;
            int i66 = this.f343415b;
            if (i59 > i66) {
                this.f343419f = (int) (i59 / f17);
                this.f343418e = i59;
            } else {
                this.f343418e = (int) (i66 * f17);
                this.f343419f = i66;
            }
        }
        this.f343421h = (this.f343418e * 1.0f) / this.f343414a;
        this.f343422i = (this.f343419f * 1.0f) / this.f343415b;
        return true;
    }
}
