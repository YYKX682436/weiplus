package vd1;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public km5.d f517104a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.zt5 f517105b = new r45.zt5();

    public final void a(ze.n nVar, yz5.p callback) {
        km5.d e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        synchronized (this) {
            if (this.f517104a == null) {
                if (nVar != null) {
                    lm0.a K1 = nVar.K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(K1);
                    e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) K1).e1("/cgi-bin/mmbiz-bin/wxartrappsvr/route", nVar.f156336n, this.f517105b, r45.au5.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class);
                    e17 = c0Var != null ? c0Var.e1("/cgi-bin/mmbiz-bin/wxartrappsvr/route", null, this.f517105b, r45.au5.class) : null;
                    if (e17 == null) {
                        e17 = ((km5.q) km5.u.d()).q(vd1.c.f517098a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "$logic(...)");
                    }
                }
                this.f517104a = e17;
                ((km5.q) e17.a(new vd1.d(callback))).s(new vd1.e(callback));
            }
        }
    }
}
