package e21;

/* loaded from: classes11.dex */
public class g0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e21.l0 f328055d;

    public g0(e21.l0 l0Var) {
        this.f328055d = l0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "summeroplog pusherTry onTimerExpired tryStartNetscene");
        e21.l0 l0Var = this.f328055d;
        l0Var.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (l0Var.f328074d && currentTimeMillis - l0Var.f328081n > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            l0Var.f328074d = false;
        }
        if (l0Var.f328074d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OplogService", "summeroplog tryStartNetscene netSceneRunning, return.");
        } else {
            java.util.List n07 = l0Var.b().n0(20);
            java.util.ArrayList arrayList = (java.util.ArrayList) n07;
            if (arrayList.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "summeroplog tryStartNetscene list null ret");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "tryStartNetscene list size:%d, total:%d", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(l0Var.b().m126807x7444f759()));
                if (!l0Var.f328074d && arrayList.size() > 0) {
                    l0Var.f328081n = currentTimeMillis;
                    l0Var.f328074d = true;
                    java.util.LinkedList<xg3.q0> linkedList = new java.util.LinkedList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        xg3.q0 q0Var = (xg3.q0) it.next();
                        if (q0Var.b() == 0 && q0Var.f535960f > 0) {
                            linkedList.add(q0Var);
                        }
                    }
                    arrayList.removeAll(linkedList);
                    for (xg3.q0 q0Var2 : linkedList) {
                        if ("@openim".equals(q0Var2.f535962h)) {
                            gm0.j1.i();
                            gm0.j1.n().f354821b.g(new l41.c0(q0Var2));
                        } else if ("@byp".equals(q0Var2.f535962h)) {
                            gm0.j1.i();
                            gm0.j1.n().f354821b.g(new it1.a(q0Var2));
                        } else {
                            l0Var.b().m0(q0Var2);
                            l0Var.f328080m.c(q0Var2, null, l0Var.b().m126807x7444f759(), e21.x.f328129f);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        e21.j jVar = new e21.j(n07);
                        gm0.j1.i();
                        gm0.j1.n().f354821b.g(jVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "doScene[%s], list size=%d", java.lang.Integer.valueOf(jVar.hashCode()), java.lang.Integer.valueOf(arrayList.size()));
                    }
                }
                java.lang.System.currentTimeMillis();
                arrayList.size();
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m126803x9616526c() {
        return super.toString() + "|pusherTry";
    }
}
