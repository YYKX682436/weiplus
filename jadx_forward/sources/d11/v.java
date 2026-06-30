package d11;

/* loaded from: classes10.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f307226a;

    /* renamed from: b, reason: collision with root package name */
    public int f307227b;

    /* renamed from: c, reason: collision with root package name */
    public int f307228c;

    /* renamed from: d, reason: collision with root package name */
    public int f307229d;

    /* renamed from: e, reason: collision with root package name */
    public int f307230e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f307231f;

    /* renamed from: g, reason: collision with root package name */
    public d11.w[] f307232g;

    /* renamed from: h, reason: collision with root package name */
    public int f307233h = -1;

    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a(int i17) {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d b17 = b(i17);
        if (b17 == null) {
            return null;
        }
        int i18 = b17.f152726f;
        if (i18 <= 0) {
            b17.f152730m = 1;
        } else {
            double d17 = b17.f152730m / i18;
            if (d17 < 1.0d) {
                d17 = 1.0d;
            }
            b17.f152730m = (int) java.lang.Math.ceil(d17);
        }
        return b17;
    }

    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d b(int i17) {
        d11.w[] wVarArr = this.f307232g;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = null;
        if (wVarArr != null) {
            for (d11.w wVar : wVarArr) {
                if (wVar != null && i17 >= wVar.f307234d && i17 <= wVar.f307235e) {
                    c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
                    c11120x15dce88d.f152724d = wVar.f307236f;
                    c11120x15dce88d.f152725e = wVar.f307237g;
                    c11120x15dce88d.f152726f = wVar.f307238h;
                    c11120x15dce88d.f152727g = wVar.f307239i;
                    c11120x15dce88d.f152730m = this.f307228c;
                    c11120x15dce88d.f152731n = this.f307227b;
                    c11120x15dce88d.f152734q = this.f307229d;
                    c11120x15dce88d.f152735r = this.f307230e;
                    c11120x15dce88d.L = this.f307233h == 1;
                }
            }
        }
        return c11120x15dce88d;
    }

    public boolean c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f307226a)) {
            return true;
        }
        return d11.b.a(this.f307226a);
    }

    /* renamed from: toString */
    public java.lang.String m123354x9616526c() {
        return "[ busyTime " + this.f307226a + " audioBitrate " + this.f307227b + " iFrame " + this.f307228c + " profileIndex " + this.f307229d + " presetIndex " + this.f307230e + " isStepBr " + this.f307231f + " ]";
    }
}
