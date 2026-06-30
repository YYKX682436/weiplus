package ix3;

/* loaded from: classes10.dex */
public final class l1 extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.x1 f377012d;

    /* renamed from: e, reason: collision with root package name */
    public final int f377013e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f377014f;

    public l1(com.p314xaae8f345.mm.vfs.x1 fileEntry, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileEntry, "fileEntry");
        this.f377012d = fileEntry;
        this.f377013e = i17;
        this.f377014f = z17;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ix3.l1 other = (ix3.l1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f377012d.f294765b, other.f377012d.f294765b);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ix3.l1 other = (ix3.l1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f377013e, other.f377013e);
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String name = this.f377012d.f294765b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
        return name;
    }
}
