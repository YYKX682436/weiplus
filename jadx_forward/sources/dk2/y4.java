package dk2;

/* loaded from: classes3.dex */
public final class y4 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final r45.vm1 f315901d;

    /* renamed from: e, reason: collision with root package name */
    public final long f315902e;

    public y4(r45.vm1 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f315901d = info;
        this.f315902e = (info.m75939xb282bd08(3) * 1000) + c01.id.c();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        dk2.y4 other = (dk2.y4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f315902e, other.f315902e);
    }
}
