package nr2;

/* loaded from: classes8.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f420826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f420826d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#orderAndPay onFailed type:");
        pr4.j jVar = it.f439518a;
        sb6.append(jVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionPayUIC", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f420826d;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) h0Var.f391656d;
        if (interfaceC29045xdcb5ca57 != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new nr2.k0(false, "orderAndPay onFailed type:" + jVar, "", 0)));
        }
        h0Var.f391656d = null;
        return jz5.f0.f384359a;
    }
}
