package wr3;

/* loaded from: classes11.dex */
public final class l1 extends wr3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final wr3.n0 f530367a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.s5 f530368b;

    /* renamed from: c, reason: collision with root package name */
    public final int f530369c;

    public l1(wr3.n0 status, r45.s5 message, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        this.f530367a = status;
        this.f530368b = message;
        this.f530369c = i17;
    }

    @Override // wr3.c0
    public int a() {
        return this.f530369c;
    }

    /* renamed from: equals */
    public boolean m174345xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3.l1)) {
            return false;
        }
        wr3.l1 l1Var = (wr3.l1) obj;
        return this.f530367a == l1Var.f530367a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f530368b, l1Var.f530368b) && this.f530369c == l1Var.f530369c;
    }

    /* renamed from: hashCode */
    public int m174346x8cdac1b() {
        return (((this.f530367a.hashCode() * 31) + this.f530368b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f530369c);
    }

    /* renamed from: toString */
    public java.lang.String m174347x9616526c() {
        return "PicDataItem(status=" + this.f530367a + ", message=" + this.f530368b + ", viewType=" + this.f530369c + ')';
    }
}
