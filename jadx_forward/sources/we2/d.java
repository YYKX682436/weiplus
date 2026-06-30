package we2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f526755a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f526756b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.q f526757c;

    public d(java.lang.String tag, java.lang.Object obj, yz5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f526755a = tag;
        this.f526756b = obj;
        this.f526757c = qVar;
    }

    /* renamed from: equals */
    public boolean m173635xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we2.d)) {
            return false;
        }
        we2.d dVar = (we2.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526755a, dVar.f526755a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526756b, dVar.f526756b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526757c, dVar.f526757c);
    }

    /* renamed from: hashCode */
    public int m173636x8cdac1b() {
        int hashCode = this.f526755a.hashCode() * 31;
        java.lang.Object obj = this.f526756b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        yz5.q qVar = this.f526757c;
        return hashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m173637x9616526c() {
        return "CommentSpanItem(tag=" + this.f526755a + ", span=" + this.f526756b + ", customizeSpanSetter=" + this.f526757c + ')';
    }

    public /* synthetic */ d(java.lang.String str, java.lang.Object obj, yz5.q qVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, obj, (i17 & 4) != 0 ? null : qVar);
    }
}
