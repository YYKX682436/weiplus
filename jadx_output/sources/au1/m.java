package au1;

/* loaded from: classes8.dex */
public final class m {
    public m(kotlin.jvm.internal.i iVar) {
    }

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetCardEntranceStyle", "trigger get card entrance: %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_LAST_TIMESTAMP_LONG_SYNC;
        java.lang.Object m17 = c17.m(u3Var, 0L);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - ((java.lang.Long) m17).longValue();
        if (z17 || currentTimeMillis > 86400000) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            new au1.n().l().q(au1.l.f14062a);
        }
    }
}
