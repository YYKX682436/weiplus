package db2;

/* loaded from: classes2.dex */
public final class l3 implements db2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db2.z2 f309590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f309591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f309592c;

    public l3(db2.z2 z2Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f309590a = z2Var;
        this.f309591b = c0Var;
        this.f309592c = interfaceC29045xdcb5ca57;
    }

    @Override // db2.z2
    /* renamed from: onCgiBack */
    public void mo11127x7a59302d(int i17, int i18, java.lang.String str, db2.c3 resp, java.util.List interceptors) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interceptors, "interceptors");
        this.f309590a.mo11127x7a59302d(i17, i18, str, resp, interceptors);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f309591b;
        if (!c0Var.f391645d) {
            this.f309592c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(resp));
        }
        c0Var.f391645d = true;
    }
}
