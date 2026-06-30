package v11;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f513932a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f513933b;

    /* renamed from: c, reason: collision with root package name */
    public final int f513934c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f513935d;

    /* renamed from: e, reason: collision with root package name */
    public final v11.s f513936e;

    public i(java.lang.String prefix, boolean z17, int i17, java.util.List textRuns, v11.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textRuns, "textRuns");
        this.f513932a = prefix;
        this.f513933b = z17;
        this.f513934c = i17;
        this.f513935d = textRuns;
        this.f513936e = sVar;
    }

    /* renamed from: equals */
    public boolean m170899xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.i)) {
            return false;
        }
        v11.i iVar = (v11.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513932a, iVar.f513932a) && this.f513933b == iVar.f513933b && this.f513934c == iVar.f513934c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513935d, iVar.f513935d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513936e, iVar.f513936e);
    }

    /* renamed from: hashCode */
    public int m170900x8cdac1b() {
        int hashCode = ((((((this.f513932a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f513933b)) * 31) + java.lang.Integer.hashCode(this.f513934c)) * 31) + this.f513935d.hashCode()) * 31;
        v11.s sVar = this.f513936e;
        return hashCode + (sVar == null ? 0 : sVar.m170946x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m170901x9616526c() {
        return "ListItemUiModel(prefix=" + this.f513932a + ", ordered=" + this.f513933b + ", indentLevel=" + this.f513934c + ", textRuns=" + this.f513935d + ", sourceRange=" + this.f513936e + ')';
    }
}
