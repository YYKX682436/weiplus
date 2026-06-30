package k41;

/* loaded from: classes9.dex */
public final class s0 implements com.p314xaae8f345.mm.p2621x8fb0427b.i8 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.i8
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (i17 == 5 && (obj instanceof java.lang.String) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4((java.lang.String) obj)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConversationChangeListener", "openImKfConversationChangedListener onNotifyChange delete %s", obj);
            ((ku5.t0) ku5.t0.f394148d).b(k41.z0.f385590d, "kefu_conversation_logic_thread");
        }
    }
}
