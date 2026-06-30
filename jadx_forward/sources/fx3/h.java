package fx3;

/* loaded from: classes10.dex */
public final class h extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f348670d;

    /* renamed from: e, reason: collision with root package name */
    public final int f348671e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f348672f;

    public h(java.lang.String id6, int i17, java.lang.String log) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(log, "log");
        this.f348670d = id6;
        this.f348671e = i17;
        this.f348672f = log;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        fx3.h other = (fx3.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348672f, other.f348672f);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        fx3.h other = (fx3.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f348671e, other.f348671e);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f348670d;
    }
}
