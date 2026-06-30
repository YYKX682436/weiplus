package v11;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f513991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f513992b;

    /* renamed from: c, reason: collision with root package name */
    public final int f513993c;

    /* renamed from: d, reason: collision with root package name */
    public final int f513994d;

    public s(int i17, int i18, int i19, int i27) {
        this.f513991a = i17;
        this.f513992b = i18;
        this.f513993c = i19;
        this.f513994d = i27;
    }

    /* renamed from: equals */
    public boolean m170945xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.s)) {
            return false;
        }
        v11.s sVar = (v11.s) obj;
        return this.f513991a == sVar.f513991a && this.f513992b == sVar.f513992b && this.f513993c == sVar.f513993c && this.f513994d == sVar.f513994d;
    }

    /* renamed from: hashCode */
    public int m170946x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f513991a) * 31) + java.lang.Integer.hashCode(this.f513992b)) * 31) + java.lang.Integer.hashCode(this.f513993c)) * 31) + java.lang.Integer.hashCode(this.f513994d);
    }

    /* renamed from: toString */
    public java.lang.String m170947x9616526c() {
        return "MarkdownSourceRange(contentStart=" + this.f513991a + ", contentEnd=" + this.f513992b + ", fullStart=" + this.f513993c + ", fullEnd=" + this.f513994d + ')';
    }
}
