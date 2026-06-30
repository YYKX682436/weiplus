package vz5;

/* loaded from: classes7.dex */
public final class l implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f523330a;

    /* renamed from: b, reason: collision with root package name */
    public final vz5.m f523331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f523332c;

    public l(java.io.File start, vz5.m direction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(direction, "direction");
        this.f523330a = start;
        this.f523331b = direction;
        this.f523332c = Integer.MAX_VALUE;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new vz5.j(this);
    }
}
