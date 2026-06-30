package el4;

/* loaded from: classes8.dex */
public final class f0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public f0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5526xf28eaa6d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5526xf28eaa6d) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.yc ycVar = event.f135852g;
        int i17 = ycVar.f89986a.f65875xb5fc3ab6;
        if (i17 < 600000 || i17 >= 699999) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRedDotExpiredEventListener", "handleTingRedDotExpiredEvent");
        qk.d9 d9Var = (qk.d9) i95.n0.c(qk.d9.class);
        r45.vs2 vs2Var = ycVar.f89986a.f65874xb5f7102a;
        ((ef0.z3) d9Var).getClass();
        em4.c cVar = em4.c.f336746a;
        java.util.Objects.toString(vs2Var);
        if (vs2Var == null || !em4.c.f336746a.c(null)) {
            return false;
        }
        em4.c.d("red_dot_expired", em4.c.b(vs2Var, null, null, 4, null));
        return false;
    }
}
