package g31;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349594a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349595b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349596c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349597d;

    /* renamed from: e, reason: collision with root package name */
    public e31.i f349598e;

    public b(java.lang.String bizUsername, java.lang.String templateId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        this.f349594a = bizUsername;
        this.f349595b = templateId;
        this.f349596c = i17;
        this.f349597d = i18;
    }

    /* renamed from: equals */
    public boolean m130778xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31.b)) {
            return false;
        }
        g31.b bVar = (g31.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349594a, bVar.f349594a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349595b, bVar.f349595b) && this.f349596c == bVar.f349596c && this.f349597d == bVar.f349597d;
    }

    /* renamed from: hashCode */
    public int m130779x8cdac1b() {
        return (((((this.f349594a.hashCode() * 31) + this.f349595b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349596c)) * 31) + java.lang.Integer.hashCode(this.f349597d);
    }

    /* renamed from: toString */
    public java.lang.String m130780x9616526c() {
        return "UpdateSubscribeStatusTask(bizUsername=" + this.f349594a + ", templateId=" + this.f349595b + ", uiStatus=" + this.f349596c + ", businessType=" + this.f349597d + ')';
    }
}
