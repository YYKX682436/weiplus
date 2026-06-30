package v11;

/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f513859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f513860b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Float f513861c;

    public a0(float f17, int i17, java.lang.Float f18) {
        this.f513859a = f17;
        this.f513860b = i17;
        this.f513861c = f18;
    }

    /* renamed from: equals */
    public boolean m170860xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.a0)) {
            return false;
        }
        v11.a0 a0Var = (v11.a0) obj;
        return java.lang.Float.compare(this.f513859a, a0Var.f513859a) == 0 && this.f513860b == a0Var.f513860b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513861c, a0Var.f513861c);
    }

    /* renamed from: hashCode */
    public int m170861x8cdac1b() {
        int hashCode = ((java.lang.Float.hashCode(this.f513859a) * 31) + java.lang.Integer.hashCode(this.f513860b)) * 31;
        java.lang.Float f17 = this.f513861c;
        return hashCode + (f17 == null ? 0 : f17.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m170862x9616526c() {
        return "NativeMarkdownHeadingStyleConfig(textSizeDp=" + this.f513859a + ", topPaddingPx=" + this.f513860b + ", fontWeight=" + this.f513861c + ')';
    }

    public /* synthetic */ a0(float f17, int i17, java.lang.Float f18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(f17, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? null : f18);
    }
}
