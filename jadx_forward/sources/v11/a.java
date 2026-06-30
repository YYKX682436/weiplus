package v11;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f513851a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f513852b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f513853c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f513854d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f513855e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f513856f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f513857g;

    /* renamed from: h, reason: collision with root package name */
    public final v11.s f513858h;

    public a(java.lang.String text, boolean z17, boolean z18, boolean z19, java.lang.String str, boolean z27, boolean z28, v11.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f513851a = text;
        this.f513852b = z17;
        this.f513853c = z18;
        this.f513854d = z19;
        this.f513855e = str;
        this.f513856f = z27;
        this.f513857g = z28;
        this.f513858h = sVar;
    }

    /* renamed from: equals */
    public boolean m170857xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.a)) {
            return false;
        }
        v11.a aVar = (v11.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513851a, aVar.f513851a) && this.f513852b == aVar.f513852b && this.f513853c == aVar.f513853c && this.f513854d == aVar.f513854d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513855e, aVar.f513855e) && this.f513856f == aVar.f513856f && this.f513857g == aVar.f513857g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513858h, aVar.f513858h);
    }

    /* renamed from: hashCode */
    public int m170858x8cdac1b() {
        int hashCode = ((((((this.f513851a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f513852b)) * 31) + java.lang.Boolean.hashCode(this.f513853c)) * 31) + java.lang.Boolean.hashCode(this.f513854d)) * 31;
        java.lang.String str = this.f513855e;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f513856f)) * 31) + java.lang.Boolean.hashCode(this.f513857g)) * 31;
        v11.s sVar = this.f513858h;
        return hashCode2 + (sVar != null ? sVar.m170946x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m170859x9616526c() {
        return "InlineTextRunUiModel(text=" + this.f513851a + ", bold=" + this.f513852b + ", italic=" + this.f513853c + ", strikethrough=" + this.f513854d + ", linkUrl=" + this.f513855e + ", isInlineCode=" + this.f513856f + ", isInlineMath=" + this.f513857g + ", sourceRange=" + this.f513858h + ')';
    }
}
