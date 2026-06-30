package rr3;

/* loaded from: classes4.dex */
public final class d extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ym f480714d;

    /* renamed from: e, reason: collision with root package name */
    public final int f480715e;

    public d(r45.ym recordInfo, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        recordInfo = (i18 & 1) != 0 ? new r45.ym() : recordInfo;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordInfo, "recordInfo");
        this.f480714d = recordInfo;
        this.f480715e = i17;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        rr3.d other = (rr3.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f480714d.f472742e == other.f480714d.f472742e;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        rr3.d other = (rr3.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f480715e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f480714d.hashCode());
    }
}
