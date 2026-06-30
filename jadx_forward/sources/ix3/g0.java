package ix3;

/* loaded from: classes10.dex */
public final class g0 extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f376952d;

    /* renamed from: e, reason: collision with root package name */
    public final ix3.c f376953e;

    public g0(int i17, ix3.c item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f376952d = i17;
        this.f376953e = item;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ix3.g0 other = (ix3.g0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        ix3.c cVar = this.f376953e;
        long j17 = cVar.f376905b;
        ix3.c cVar2 = other.f376953e;
        return j17 == cVar2.f376905b && cVar.f376906c.hashCode() == cVar2.f376906c.hashCode();
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ix3.g0 other = (ix3.g0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(other.f376952d, this.f376952d);
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ix3.c cVar = this.f376953e;
        sb6.append(cVar.f376905b);
        sb6.append('_');
        sb6.append(cVar.f376906c.hashCode());
        return sb6.toString();
    }
}
