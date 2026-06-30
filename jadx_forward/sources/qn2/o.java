package qn2;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f446655a;

    /* renamed from: b, reason: collision with root package name */
    public final int f446656b;

    /* renamed from: c, reason: collision with root package name */
    public final int f446657c;

    /* renamed from: d, reason: collision with root package name */
    public final int f446658d;

    /* renamed from: e, reason: collision with root package name */
    public final int f446659e;

    public o(int i17, int i18, int i19, int i27, int i28) {
        this.f446655a = i17;
        this.f446656b = i18;
        this.f446657c = i19;
        this.f446658d = i27;
        this.f446659e = i28;
    }

    /* renamed from: equals */
    public boolean m160545xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn2.o)) {
            return false;
        }
        qn2.o oVar = (qn2.o) obj;
        return this.f446655a == oVar.f446655a && this.f446656b == oVar.f446656b && this.f446657c == oVar.f446657c && this.f446658d == oVar.f446658d && this.f446659e == oVar.f446659e;
    }

    /* renamed from: hashCode */
    public int m160546x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f446655a) * 31) + java.lang.Integer.hashCode(this.f446656b)) * 31) + java.lang.Integer.hashCode(this.f446657c)) * 31) + java.lang.Integer.hashCode(this.f446658d)) * 31) + java.lang.Integer.hashCode(this.f446659e);
    }

    /* renamed from: toString */
    public java.lang.String m160547x9616526c() {
        return "GiftLayoutParams(iconSize=" + this.f446655a + ", layoutBottomMargin=" + this.f446656b + ", line1BottomMargin=" + this.f446657c + ", line1InsideItemMargin=" + this.f446658d + ", line2InsideItemMargin=" + this.f446659e + ')';
    }
}
