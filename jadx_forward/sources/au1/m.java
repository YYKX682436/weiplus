package au1;

/* loaded from: classes8.dex */
public final class m {
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetCardEntranceStyle", "trigger get card entrance: %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_LAST_TIMESTAMP_LONG_SYNC;
        java.lang.Object m17 = c17.m(u3Var, 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - ((java.lang.Long) m17).longValue();
        if (z17 || currentTimeMillis > 86400000) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            new au1.n().l().q(au1.l.f95595a);
        }
    }
}
