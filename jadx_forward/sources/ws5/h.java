package ws5;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f530745a;

    /* renamed from: b, reason: collision with root package name */
    public final int f530746b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f530747c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f530748d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.wo1 f530749e;

    public h(java.lang.String cacheBusinessKey, int i17, java.lang.String fromCommentScene, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.wo1 wo1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheBusinessKey, "cacheBusinessKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromCommentScene, "fromCommentScene");
        this.f530745a = cacheBusinessKey;
        this.f530746b = i17;
        this.f530747c = fromCommentScene;
        this.f530748d = gVar;
        this.f530749e = wo1Var;
    }

    /* renamed from: equals */
    public boolean m174404xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws5.h)) {
            return false;
        }
        ws5.h hVar = (ws5.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f530745a, hVar.f530745a) && this.f530746b == hVar.f530746b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f530747c, hVar.f530747c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f530748d, hVar.f530748d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f530749e, hVar.f530749e);
    }

    /* renamed from: hashCode */
    public int m174405x8cdac1b() {
        int hashCode = ((((this.f530745a.hashCode() * 31) + java.lang.Integer.hashCode(this.f530746b)) * 31) + this.f530747c.hashCode()) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f530748d;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        r45.wo1 wo1Var = this.f530749e;
        return hashCode2 + (wo1Var != null ? wo1Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m174406x9616526c() {
        return "LiveSquarePreloadExt(cacheBusinessKey=" + this.f530745a + ", commentScene=" + this.f530746b + ", fromCommentScene=" + this.f530747c + ", lastBuffer=" + this.f530748d + ", customPreloadConfig=" + this.f530749e + ')';
    }
}
