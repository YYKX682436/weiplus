package ex3;

/* loaded from: classes.dex */
public final class e extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f338740d;

    /* renamed from: e, reason: collision with root package name */
    public final int f338741e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.dp5 f338742f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f338743g;

    public e(int i17, int i18, r45.dp5 item, java.lang.String summary) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(summary, "summary");
        this.f338740d = i17;
        this.f338741e = i18;
        this.f338742f = item;
        this.f338743g = summary;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ex3.e other = (ex3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f338740d == other.f338740d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338742f, other.f338742f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338743g, other.f338743g);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ex3.e other = (ex3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f338741e, other.f338741e);
        return i17 == 0 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f338740d, other.f338740d) : i17;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f338741e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f338742f.m75945x2fec8307(0) + '-' + this.f338741e;
    }
}
