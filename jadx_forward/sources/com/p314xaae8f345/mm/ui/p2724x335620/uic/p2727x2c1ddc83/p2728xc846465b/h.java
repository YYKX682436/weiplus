package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.i f290861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.i iVar) {
        super(1);
        this.f290861d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        xi5.b bVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (state.G && (bVar = (xi5.b) state.a(xi5.b.class)) != null) {
            boolean a17 = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a();
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.i iVar = this.f290861d;
            if (!a17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AfterForwardUIC", "EnterChattingAfterTrans config disabled, show normal toast");
                dp.a.m125854x26a183b(iVar.m158354x19263085(), iVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), 0).show();
            }
            if (bVar.f536273g) {
                java.lang.String str2 = bVar.f536272f;
                if (str2 == null || str2.length() == 0) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.addFlags(268435456);
                    j45.l.u(iVar.m80379x76847179(), ".ui.transmit.TaskRedirectUI", intent, null);
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Chat_User", str2);
                    intent2.addFlags(67108864);
                    j45.l.u(iVar.m80379x76847179(), ".ui.chatting.ChattingUI", intent2, null);
                }
            }
        }
        xi5.a aVar = (xi5.a) state.a(xi5.a.class);
        if (aVar != null && (str = aVar.f536267b) != null && !r26.i0.n(str, "@kefu.openim", false)) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.k3.a(str);
        }
        return jz5.f0.f384359a;
    }
}
