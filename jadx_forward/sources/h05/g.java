package h05;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oi6 f359466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h05.i f359467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui.ActivityC19561x3f936717 f359468f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui.ActivityC19561x3f936717 activityC19561x3f936717, r45.oi6 oi6Var, h05.i iVar) {
        this.f359468f = activityC19561x3f936717;
        this.f359466d = oi6Var;
        this.f359467e = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui.ActivityC19561x3f936717 activityC19561x3f936717 = this.f359468f;
        r45.oi6 oi6Var = this.f359466d;
        h05.i iVar = this.f359467e;
        if (oi6Var == null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui.ActivityC19561x3f936717.f270089i;
            activityC19561x3f936717.getClass();
            iVar.a(false);
            return;
        }
        android.util.Pair pair = (android.util.Pair) activityC19561x3f936717.f270093g.get(oi6Var);
        if (pair == null) {
            iVar.a(false);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(oi6Var);
        r45.ji6 ji6Var = new r45.ji6();
        ji6Var.f459377f = linkedList;
        ji6Var.f459375d = ((java.lang.Integer) pair.first).intValue();
        ji6Var.f459376e = (java.lang.String) pair.second;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(ji6Var);
        r45.d36 d36Var = new r45.d36();
        d36Var.f453584d = linkedList2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = d36Var;
        lVar.f152200d = 4642;
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamepluginappsvr/setuserswitch";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152198b = new r45.e36();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new h05.f(activityC19561x3f936717, iVar), false);
    }
}
