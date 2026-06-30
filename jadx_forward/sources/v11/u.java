package v11;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f514002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f514003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f514004c;

    /* renamed from: d, reason: collision with root package name */
    public final int f514005d;

    public u(int i17, int i18, int i19, int i27) {
        this.f514002a = i17;
        this.f514003b = i18;
        this.f514004c = i19;
        this.f514005d = i27;
    }

    /* renamed from: equals */
    public boolean m170952xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.u)) {
            return false;
        }
        v11.u uVar = (v11.u) obj;
        return this.f514002a == uVar.f514002a && this.f514003b == uVar.f514003b && this.f514004c == uVar.f514004c && this.f514005d == uVar.f514005d;
    }

    /* renamed from: hashCode */
    public int m170953x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f514002a) * 31) + java.lang.Integer.hashCode(this.f514003b)) * 31) + java.lang.Integer.hashCode(this.f514004c)) * 31) + java.lang.Integer.hashCode(this.f514005d);
    }

    /* renamed from: toString */
    public java.lang.String m170954x9616526c() {
        return "NativeMarkdownBlockquoteConfig(barWidthPx=" + this.f514002a + ", barColor=" + this.f514003b + ", barMarginEndPx=" + this.f514004c + ", maxNestLevel=" + this.f514005d + ')';
    }
}
