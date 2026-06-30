package dk2;

/* loaded from: classes3.dex */
public final class h4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gk2.e f315094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f315095c;

    public h4(java.lang.String str, gk2.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f315093a = str;
        this.f315094b = eVar;
        this.f315095c = interfaceC29045xdcb5ca57;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f315095c;
        if (i17 == 0 && fVar.f152149b == 0) {
            st2.g3 g3Var = st2.g3.f493859a;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            if (g3Var.s(this.f315093a, this.f315094b, (r45.dv1) resp)) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.TRUE, fVar.f152151d)));
            } else {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, fVar.f152151d)));
            }
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, fVar.f152151d)));
        }
        return jz5.f0.f384359a;
    }
}
