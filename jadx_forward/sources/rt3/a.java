package rt3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f481041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f481042b;

    /* renamed from: c, reason: collision with root package name */
    public final int f481043c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f481044d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f481045e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.s46 f481046f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f481047g;

    public a(java.util.ArrayList templateList, int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.List list, r45.s46 s46Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateList, "templateList");
        this.f481041a = templateList;
        this.f481042b = i17;
        this.f481043c = i18;
        this.f481044d = gVar;
        this.f481045e = list;
        this.f481046f = s46Var;
        this.f481047g = z17;
    }

    /* renamed from: equals */
    public boolean m163003xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt3.a)) {
            return false;
        }
        rt3.a aVar = (rt3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481041a, aVar.f481041a) && this.f481042b == aVar.f481042b && this.f481043c == aVar.f481043c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481044d, aVar.f481044d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481045e, aVar.f481045e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481046f, aVar.f481046f) && this.f481047g == aVar.f481047g;
    }

    /* renamed from: hashCode */
    public int m163004x8cdac1b() {
        int hashCode = ((((this.f481041a.hashCode() * 31) + java.lang.Integer.hashCode(this.f481042b)) * 31) + java.lang.Integer.hashCode(this.f481043c)) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f481044d;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        java.util.List list = this.f481045e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        r45.s46 s46Var = this.f481046f;
        return ((hashCode3 + (s46Var != null ? s46Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f481047g);
    }

    /* renamed from: toString */
    public java.lang.String m163005x9616526c() {
        return "FinderTemplateDataRep(templateList=" + this.f481041a + ", maxAge=" + this.f481042b + ", continue_flag=" + this.f481043c + ", pageBuffer=" + this.f481044d + ", tabs=" + this.f481045e + ", curTab=" + this.f481046f + ", useFirstTemplate=" + this.f481047g + ')';
    }
}
