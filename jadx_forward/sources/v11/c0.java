package v11;

/* loaded from: classes11.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f513879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f513880b;

    /* renamed from: c, reason: collision with root package name */
    public final int f513881c;

    public c0(int i17, int i18, int i19) {
        this.f513879a = i17;
        this.f513880b = i18;
        this.f513881c = i19;
    }

    /* renamed from: equals */
    public boolean m170869xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.c0)) {
            return false;
        }
        v11.c0 c0Var = (v11.c0) obj;
        return this.f513879a == c0Var.f513879a && this.f513880b == c0Var.f513880b && this.f513881c == c0Var.f513881c;
    }

    /* renamed from: hashCode */
    public int m170870x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f513879a) * 31) + java.lang.Integer.hashCode(this.f513880b)) * 31) + java.lang.Integer.hashCode(this.f513881c);
    }

    /* renamed from: toString */
    public java.lang.String m170871x9616526c() {
        return "NativeMarkdownListConfig(prefixColor=" + this.f513879a + ", prefixGapPx=" + this.f513880b + ", indentPerLevelPx=" + this.f513881c + ')';
    }
}
