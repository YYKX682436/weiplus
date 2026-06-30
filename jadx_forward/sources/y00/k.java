package y00;

/* loaded from: classes3.dex */
public final class k implements com.p314xaae8f345.mm.p2621x8fb0427b.i8 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.i8
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (!z65.c.f551991d && i17 == 5) {
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardOnConversationChanged", "onNotifyChange: invalid talker");
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardOnConversationChanged", "onNotifyChange: delete talker=%s", str);
                ((ku5.t0) ku5.t0.f394148d).B(new y00.i(str));
                ((ku5.t0) ku5.t0.f394148d).g(new y00.j(this, str));
            }
        }
    }
}
