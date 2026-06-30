package o50;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o50.b f424591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o50.b bVar) {
        super(1);
        this.f424591d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        vg5.a state = (vg5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (((wg5.d) state.a(wg5.d.class)) != null) {
            co.a aVar = state.f518309g;
            if (aVar == null || (str = aVar.m75945x2fec8307(aVar.f125235d + 1)) == null) {
                str = "";
            }
            o50.b bVar = this.f424591d;
            boolean z17 = !bVar.f424592d.isEmpty();
            java.util.List list = bVar.f424592d;
            java.lang.String str2 = z17 ? (java.lang.String) list.get(0) : "";
            int intExtra = bVar.m158359x1e885992().getIntExtra("ForwardParams_ReportFromScene", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AfterForwardEnterChattingUIC", "EnterChattingAfterTrans ForwardPreviewConfirmAction fromMsgTalker:" + str + " to:" + list + " fromScene:" + intExtra + " sessionId: " + com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b);
            if (intExtra == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AfterForwardEnterChattingUIC", "EnterChattingAfterTrans skip, scene=Scene_3rd");
            } else if (com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a()) {
                if (list.size() != 1 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.a(bVar.m158354x19263085(), null, str);
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.a(bVar.m158354x19263085(), str2, str);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
