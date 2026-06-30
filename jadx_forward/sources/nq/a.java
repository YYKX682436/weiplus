package nq;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f420390a;

    /* renamed from: b, reason: collision with root package name */
    public final int f420391b;

    /* renamed from: c, reason: collision with root package name */
    public final int f420392c;

    /* renamed from: d, reason: collision with root package name */
    public final int f420393d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420394e;

    public a(int i17, int i18, int i19, int i27, int i28) {
        this.f420390a = i17;
        this.f420391b = i18;
        this.f420392c = i19;
        this.f420393d = i27;
        this.f420394e = i28;
    }

    /* renamed from: equals */
    public boolean m149861xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof nq.a) {
                nq.a aVar = (nq.a) obj;
                if (this.f420390a == aVar.f420390a) {
                    if (this.f420391b == aVar.f420391b) {
                        if (this.f420392c == aVar.f420392c) {
                            if (this.f420393d == aVar.f420393d) {
                                if (this.f420394e == aVar.f420394e) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m149862x8cdac1b() {
        return (((((((this.f420390a * 31) + this.f420391b) * 31) + this.f420392c) * 31) + this.f420393d) * 31) + this.f420394e;
    }

    /* renamed from: toString */
    public java.lang.String m149863x9616526c() {
        return "ColorInfo(particleColor1=" + this.f420390a + ", particleColor2=" + this.f420391b + ", particleColor3=" + this.f420392c + ", bgColor1=" + this.f420393d + ", bgColor2=" + this.f420394e + ")";
    }
}
