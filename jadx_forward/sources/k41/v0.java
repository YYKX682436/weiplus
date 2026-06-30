package k41;

/* loaded from: classes9.dex */
public final class v0 implements com.p314xaae8f345.mm.p2621x8fb0427b.j8 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.j8
    public void p(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var) {
        if (l4Var == null) {
            return;
        }
        java.lang.String h17 = l4Var.h1();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(h17)) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(h17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConversationExtension", "openImKeService is created");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConversationExtension", "onMsgChangeNotify conversation is openim kefu username: %s", h17);
            l4Var.T1("opencustomerservicemsg");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(l4Var, h17);
            ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Ui(l4Var);
        }
    }
}
