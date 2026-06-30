package yg5;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f543868a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f543869b;

    /* renamed from: c, reason: collision with root package name */
    public final yg5.a f543870c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f543871d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f543872e;

    public b(java.lang.String uniqueId, java.lang.CharSequence charSequence, yg5.a selectMode, java.util.List optionList, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectMode, "selectMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionList, "optionList");
        this.f543868a = uniqueId;
        this.f543869b = charSequence;
        this.f543870c = selectMode;
        this.f543871d = optionList;
        this.f543872e = lVar;
    }

    /* renamed from: equals */
    public boolean m177158xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg5.b)) {
            return false;
        }
        yg5.b bVar = (yg5.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543868a, bVar.f543868a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543869b, bVar.f543869b) && this.f543870c == bVar.f543870c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543871d, bVar.f543871d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543872e, bVar.f543872e);
    }

    /* renamed from: hashCode */
    public int m177159x8cdac1b() {
        int hashCode = this.f543868a.hashCode() * 31;
        java.lang.CharSequence charSequence = this.f543869b;
        int hashCode2 = (((((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.f543870c.hashCode()) * 31) + this.f543871d.hashCode()) * 31;
        yz5.l lVar = this.f543872e;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m177160x9616526c() {
        return "Group(uniqueId=" + this.f543868a + ", name=" + ((java.lang.Object) this.f543869b) + ", selectMode=" + this.f543870c + ", optionList=" + this.f543871d + ", onOptionSelectedListener=" + this.f543872e + ')';
    }
}
