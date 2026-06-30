package p10;

/* loaded from: classes8.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        super(1);
        this.f432531d = c10541x905158a3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String token = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicDebugPanelView", "startProfile success, token: ".concat(token));
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3 = this.f432531d;
        c10541x905158a3.f147349f = token;
        c10541x905158a3.f147347d.post(new p10.s(c10541x905158a3));
        return jz5.f0.f384359a;
    }
}
