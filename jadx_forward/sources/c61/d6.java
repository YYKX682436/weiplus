package c61;

/* loaded from: classes.dex */
public final class d6 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f120470a;

    public d6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f120470a = interfaceC29045xdcb5ca57;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f120470a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.o(java.lang.Boolean.FALSE, -1L, "errorType=" + i17 + " errorCode=" + i18 + " msg=" + str)));
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f120470a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.o(java.lang.Boolean.TRUE, java.lang.Long.valueOf(data.f456118d), "")));
    }
}
