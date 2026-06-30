package go2;

/* loaded from: classes.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f355521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f355521d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.n result = (pr4.n) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#orderAndPay consumeData complete");
        pr4.p pVar = result.f439572a;
        sb6.append(pVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberPayUIC", sb6.toString());
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MEMBER_PAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f355521d;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) h0Var.f391656d;
        if (interfaceC29045xdcb5ca57 != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new go2.d0(pVar == pr4.p.f439576f, "", "")));
        }
        h0Var.f391656d = null;
        return jz5.f0.f384359a;
    }
}
