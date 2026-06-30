package gl4;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f354385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1);
        this.f354385d = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.y80 response = (bw5.y80) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doJoinMembership result response.ret: ");
        r45.ie mo11484xe92ab0a8 = response.mo11484xe92ab0a8();
        sb6.append(mo11484xe92ab0a8 != null ? java.lang.Integer.valueOf(mo11484xe92ab0a8.f458492d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
        this.f354385d.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(response));
        return jz5.f0.f384359a;
    }
}
