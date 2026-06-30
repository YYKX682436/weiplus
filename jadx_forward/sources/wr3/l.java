package wr3;

/* loaded from: classes11.dex */
public final class l extends wr3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final wr3.n0 f530362a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.s5 f530363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f530364c;

    public l(wr3.n0 status, r45.s5 message, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        this.f530362a = status;
        this.f530363b = message;
        this.f530364c = i17;
    }

    @Override // wr3.c0
    public int a() {
        return this.f530364c;
    }

    /* renamed from: equals */
    public boolean m174342xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3.l)) {
            return false;
        }
        wr3.l lVar = (wr3.l) obj;
        return this.f530362a == lVar.f530362a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f530363b, lVar.f530363b) && this.f530364c == lVar.f530364c;
    }

    /* renamed from: hashCode */
    public int m174343x8cdac1b() {
        return (((this.f530362a.hashCode() * 31) + this.f530363b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f530364c);
    }

    /* renamed from: toString */
    public java.lang.String m174344x9616526c() {
        return "ArticleItem(status=" + this.f530362a + ", message=" + this.f530363b + ", viewType=" + this.f530364c + ')';
    }
}
