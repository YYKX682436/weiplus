package xn1;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn1.h f536991d;

    public e(xn1.h hVar) {
        this.f536991d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f536991d.d();
        if (this.f536991d.f537003s.size() != 0) {
            xn1.h hVar = this.f536991d;
            hVar.f536994g.a(hVar.f537003s, hVar, mn1.d.i().e().f391150i);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConvChooseHelper", "backupSessionInfo is null or nill!");
        xn1.h hVar2 = this.f536991d;
        ln1.h hVar3 = hVar2.f536994g;
        hVar3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation start");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor s17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) tn1.f.f().e().d()).s(1, kn1.k.s(), "*", -1);
        if (s17.getCount() == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ln1.i(hVar3, hVar2, linkedList));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation empty conversation!");
            s17.close();
            return;
        }
        s17.moveToFirst();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation count[%d]", java.lang.Integer.valueOf(s17.getCount()));
        while (!hVar3.f401298a) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            l4Var.mo9015xbf5d97fd(s17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l4Var.h1())) {
                int j76 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g()).j7(l4Var.h1());
                if (j76 > 0) {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(l4Var.h1(), true).f1())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation Biz conv:%s, msgCount[%d]", l4Var.h1(), java.lang.Integer.valueOf(j76));
                    } else {
                        kn1.i iVar = new kn1.i();
                        iVar.f391158d = l4Var.h1();
                        iVar.f391162h = j76;
                        iVar.f391159e = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g()).w3(l4Var.h1());
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g()).m5(l4Var.h1());
                        linkedList.add(iVar);
                    }
                }
            }
            if (!s17.moveToNext()) {
                s17.close();
                if (!hVar3.f401298a) {
                    ((ku5.t0) ku5.t0.f394148d).g(new ln1.k(hVar3, hVar2, linkedList));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation finish,size:%d, use time[%d]", java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupCalculator", "calculateChooseConversation cancel.");
        s17.close();
    }
}
