package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes4.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y0 f171347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 f171348f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y0 y0Var) {
        this.f171348f = activityC12636x4eed9257;
        this.f171346d = list;
        this.f171347e = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257 = this.f171348f;
        if (activityC12636x4eed9257.f170853z) {
            activityC12636x4eed9257.f170853z = false;
            java.lang.String str = activityC12636x4eed9257.f170836f;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int k76 = activityC12636x4eed9257.k7();
            int j76 = activityC12636x4eed9257.j7();
            for (r45.vb vbVar : activityC12636x4eed9257.f170834d) {
                if (this.f171346d.contains(vbVar.f469591d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeUI", "setAuthState scope=%s", vbVar.f469591d);
                    if (activityC12636x4eed9257.E || !activityC12636x4eed9257.D || !vbVar.f469591d.equals("scope.userLocationBackground") || k76 == 2) {
                        if (activityC12636x4eed9257.K || !activityC12636x4eed9257.f170833J || !vbVar.f469591d.equals("scope.bluetoothBackground") || j76 == 2) {
                            r45.hn4 hn4Var = new r45.hn4();
                            if (vbVar.f469591d.equals("scope.userInfo")) {
                                hn4Var.f457848f = activityC12636x4eed9257.f170851x;
                            }
                            if (vbVar.f469591d.equals("scope.userProfileChange")) {
                                hn4Var.f457848f = activityC12636x4eed9257.f170852y;
                            }
                            hn4Var.f457846d = vbVar.f469591d;
                            hn4Var.f457847e = vbVar.f469593f;
                            linkedList.add(hn4Var);
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.qc7();
            lVar.f152198b = new r45.rc7();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp_modauth";
            lVar.f152200d = 1188;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            r45.qc7 qc7Var = new r45.qc7();
            qc7Var.f465369d = str;
            qc7Var.f465370e = linkedList;
            lVar.f152197a = qc7Var;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.n(activityC12636x4eed9257));
            com.p314xaae8f345.mm.p944x882e457a.z2.e(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p(activityC12636x4eed9257, this.f171347e), true, activityC12636x4eed9257);
        }
    }
}
