package ze5;

/* loaded from: classes9.dex */
public final class c5 {
    public c5(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(ze5.c5 c5Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str, we5.y0 y0Var, boolean z17) {
        ot0.q qVar;
        c5Var.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        java.lang.String U1 = f9Var.U1();
        y0Var.d(new ze5.z4(dVar, f9Var));
        if (U1 != null) {
            qVar = ot0.q.v(U1);
            ot0.o0.a(U1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgRecordMvvm", "amessage, msgid:%s, user:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str);
            qVar = null;
        }
        if (qVar == null) {
            return;
        }
        int i17 = ct.t2.C0;
        i95.m c17 = i95.n0.c(ct.t2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ct.t2 t2Var = (ct.t2) c17;
        android.app.Activity g17 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        l15.c cVar = new l15.c();
        java.lang.String U12 = f9Var.U1();
        if (U12 == null) {
            U12 = "";
        }
        cVar.m126728xdc93280d(U12);
        y0Var.d(new ze5.b5(dVar2, dVar, ((te5.y) t2Var).wi(g17, cVar), a0Var, f9Var));
    }
}
