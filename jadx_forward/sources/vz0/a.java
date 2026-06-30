package vz0;

/* loaded from: classes14.dex */
public final class a implements o1.a {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f523107d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f523108e;

    public a(boolean z17, boolean z18) {
        this.f523107d = z17;
        this.f523108e = z18;
    }

    @Override // o1.a
    public java.lang.Object a(long j17, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p2.w(p2.x.a(this.f523107d ? p2.w.b(j18) : 0.0f, this.f523108e ? p2.w.c(j18) : 0.0f));
    }

    @Override // o1.a
    public long b(long j17, long j18, int i17) {
        if (i17 == 2) {
            return d1.f.a(this.f523107d ? d1.e.c(j18) : 0.0f, this.f523108e ? d1.e.d(j18) : 0.0f);
        }
        int i18 = d1.e.f307159e;
        return d1.e.f307156b;
    }

    @Override // o1.a
    public java.lang.Object c(long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p2.w(p2.w.f432937b);
    }

    @Override // o1.a
    public long d(long j17, int i17) {
        return d1.e.f307156b;
    }
}
