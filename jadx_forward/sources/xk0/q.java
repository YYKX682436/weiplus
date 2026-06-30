package xk0;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f536532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536533b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f536534c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f536535d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.SpannableString f536536e;

    public q(int i17, int i18, boolean z17, boolean z18, android.text.SpannableString spannableString) {
        this.f536532a = i17;
        this.f536533b = i18;
        this.f536534c = z17;
        this.f536535d = z18;
        this.f536536e = spannableString;
    }

    /* renamed from: equals */
    public boolean m175643xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk0.q)) {
            return false;
        }
        xk0.q qVar = (xk0.q) obj;
        return this.f536532a == qVar.f536532a && this.f536533b == qVar.f536533b && this.f536534c == qVar.f536534c && this.f536535d == qVar.f536535d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536536e, qVar.f536536e);
    }

    /* renamed from: hashCode */
    public int m175644x8cdac1b() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f536532a) * 31) + java.lang.Integer.hashCode(this.f536533b)) * 31) + java.lang.Boolean.hashCode(this.f536534c)) * 31) + java.lang.Boolean.hashCode(this.f536535d)) * 31;
        android.text.SpannableString spannableString = this.f536536e;
        return hashCode + (spannableString == null ? 0 : spannableString.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m175645x9616526c() {
        return "TextItemDrawInfo(mColor=" + this.f536532a + ", mBgColor=" + this.f536533b + ", mStoke=" + this.f536534c + ", mShadow=" + this.f536535d + ", mText=" + ((java.lang.Object) this.f536536e) + ')';
    }
}
