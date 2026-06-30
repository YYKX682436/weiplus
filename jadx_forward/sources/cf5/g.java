package cf5;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f122506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122507b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122508c;

    /* renamed from: d, reason: collision with root package name */
    public final int f122509d;

    /* renamed from: e, reason: collision with root package name */
    public final int f122510e;

    public g(int i17, int i18, int i19, int i27, int i28) {
        this.f122506a = i17;
        this.f122507b = i18;
        this.f122508c = i19;
        this.f122509d = i27;
        this.f122510e = i28;
    }

    /* renamed from: equals */
    public boolean m14761xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5.g)) {
            return false;
        }
        cf5.g gVar = (cf5.g) obj;
        return this.f122506a == gVar.f122506a && this.f122507b == gVar.f122507b && this.f122508c == gVar.f122508c && this.f122509d == gVar.f122509d && this.f122510e == gVar.f122510e;
    }

    /* renamed from: hashCode */
    public int m14762x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f122506a) * 31) + java.lang.Integer.hashCode(this.f122507b)) * 31) + java.lang.Integer.hashCode(this.f122508c)) * 31) + java.lang.Integer.hashCode(this.f122509d)) * 31) + java.lang.Integer.hashCode(this.f122510e);
    }

    /* renamed from: toString */
    public java.lang.String m14763x9616526c() {
        return "SelectionContentTypes(plainTextCount=" + this.f122506a + ", codeBlockCount=" + this.f122507b + ", tableCount=" + this.f122508c + ", hrCount=" + this.f122509d + ", formulaCount=" + this.f122510e + ')';
    }
}
