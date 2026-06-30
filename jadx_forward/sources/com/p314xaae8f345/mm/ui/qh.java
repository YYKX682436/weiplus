package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class qh implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f291097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f291098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f291099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f291100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 f291101h;

    public qh(com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 activityC21435x7826ced5, boolean z17, boolean z18, java.util.LinkedList linkedList, int i17) {
        this.f291101h = activityC21435x7826ced5;
        this.f291097d = z17;
        this.f291098e = z18;
        this.f291099f = linkedList;
        this.f291100g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c01.d9.e().q(1176, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(BatchSwitchServiceNotifyOption), errType : %s, errCode : %s, errMsg : %s.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.util.LinkedList linkedList = this.f291099f;
        if (i17 == 0 && i18 == 0) {
            e31.k a17 = e31.n.f328620a.a("name_wxa");
            for (int i19 = 0; i19 < linkedList.size(); i19++) {
                r45.vi6 vi6Var = (r45.vi6) linkedList.get(i19);
                if (a17 != null && vi6Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vi6Var.f469829f)) {
                    a17.f(vi6Var.f469829f, vi6Var.f469828e == 1);
                }
            }
            return;
        }
        db5.t7.m123882x26a183b(this.f291101h, com.p314xaae8f345.mm.R.C30867xcad56011.hd9, 0).show();
        if (this.f291097d) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
            boolean z17 = this.f291098e;
            p17.x(u3Var, java.lang.Boolean.valueOf(z17));
            bn0.g.f104312a.i("USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC", z17);
            ((zr.c) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.c.class)).O6(new java.lang.Object());
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.vi6 vi6Var2 = (r45.vi6) it.next();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433 c6210x3f282433 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433();
            java.lang.String str2 = vi6Var2.f469829f;
            am.g00 g00Var = c6210x3f282433.f136460g;
            g00Var.f88257a = str2;
            g00Var.f88258b = 1;
            g00Var.f88259c = this.f291100g;
            c6210x3f282433.e();
        }
    }
}
