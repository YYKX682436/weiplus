package wt3;

/* loaded from: classes.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f530911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2);
        this.f530911d = h0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f530911d;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) h0Var.f391656d;
        if (interfaceC29045xdcb5ca57 != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (!booleanValue) {
                str = null;
            }
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str));
        }
        h0Var.f391656d = null;
        return jz5.f0.f384359a;
    }
}
