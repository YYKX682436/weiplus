package ll3;

/* loaded from: classes10.dex */
public final class p0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public p0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!gm0.j1.h() || !gm0.j1.a()) {
            return false;
        }
        am.y00 y00Var = event.f136478g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicFloatBallManager", "receive VoipEvent:[%s, %s]", java.lang.Integer.valueOf(y00Var.f89952f), java.lang.Integer.valueOf(y00Var.f89948b));
        int i17 = y00Var.f89948b;
        if (i17 != 7 && i17 != 3) {
            return false;
        }
        ll3.q0.f400743a.a(true);
        return false;
    }
}
