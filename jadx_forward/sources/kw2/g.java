package kw2;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f394546a;

    /* renamed from: b, reason: collision with root package name */
    public final so2.i3 f394547b;

    /* renamed from: c, reason: collision with root package name */
    public final so2.i3 f394548c;

    /* renamed from: d, reason: collision with root package name */
    public final dn.h f394549d;

    public g(boolean z17, so2.i3 i3Var, so2.i3 i3Var2, dn.h hVar) {
        this.f394546a = z17;
        this.f394547b = i3Var;
        this.f394548c = i3Var2;
        this.f394549d = hVar;
    }

    /* renamed from: equals */
    public boolean m144498xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.g)) {
            return false;
        }
        kw2.g gVar = (kw2.g) obj;
        return this.f394546a == gVar.f394546a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394547b, gVar.f394547b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394548c, gVar.f394548c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394549d, gVar.f394549d);
    }

    /* renamed from: hashCode */
    public int m144499x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f394546a) * 31;
        so2.i3 i3Var = this.f394547b;
        int m164895x8cdac1b = (hashCode + (i3Var == null ? 0 : i3Var.m164895x8cdac1b())) * 31;
        so2.i3 i3Var2 = this.f394548c;
        int m164895x8cdac1b2 = (m164895x8cdac1b + (i3Var2 == null ? 0 : i3Var2.m164895x8cdac1b())) * 31;
        dn.h hVar = this.f394549d;
        return m164895x8cdac1b2 + (hVar != null ? hVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m144500x9616526c() {
        return "DownloaderResult(isDownloaderOnStart=" + this.f394546a + ", mediaCacheOneStart=" + this.f394547b + ", mediaCacheOnStop=" + this.f394548c + ", downloaderResultOnStop=" + this.f394549d + ')';
    }
}
