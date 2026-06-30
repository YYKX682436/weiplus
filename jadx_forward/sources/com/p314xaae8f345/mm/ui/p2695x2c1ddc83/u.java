package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class u implements com.p314xaae8f345.mm.ui.p2740x696c9db.od {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v f289622a;

    public u(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v vVar) {
        this.f289622a = vVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.od
    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea3;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea4;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseConversationUI", "[onDrawed]");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v vVar = this.f289622a;
        vVar.f289711a.f39554x6408e5f = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = vVar.f289711a;
        c21628xcedb13ea = activityC22359x66709fa8.f39537xc7dd9584;
        if (c21628xcedb13ea == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseConversationUI", "chattingFragmet is null!");
            return;
        }
        c21628xcedb13ea2 = activityC22359x66709fa8.f39537xc7dd9584;
        boolean K0 = c21628xcedb13ea2.K0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseConversationUI", "[onDrawed] isReadyToStartAnim:%s ", java.lang.Boolean.valueOf(K0));
        if (K0) {
            c21628xcedb13ea3 = activityC22359x66709fa8.f39537xc7dd9584;
            c21628xcedb13ea3.T0();
            c21628xcedb13ea4 = activityC22359x66709fa8.f39537xc7dd9584;
            c21628xcedb13ea4.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChattingUIFragment", "onDrawReadyForAnimStart called");
            ((hd5.j) ((hd5.v) ((ke5.a) c21628xcedb13ea4.B0()).f388573a).f362187e).a();
            com.p314xaae8f345.mm.ui.cf.f279625d.c();
            activityC22359x66709fa8.m80493x77e6be77();
            c22559x35245a10 = activityC22359x66709fa8.f39540xbb71960b;
            c22559x35245a10.m81107xd394853f(null);
        }
    }
}
