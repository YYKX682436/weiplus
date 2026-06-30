package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class d2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI f72600d;

    public d2(com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI launchAABeforeUI) {
        this.f72600d = launchAABeforeUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAABeforeUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.getType());
        if (m1Var instanceof i61.p) {
            com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI launchAABeforeUI = this.f72600d;
            android.app.Dialog dialog = launchAABeforeUI.f72475d;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (i17 != 0 || i18 != 0) {
                com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI.O6(launchAABeforeUI, false);
                db5.e1.T(launchAABeforeUI, str);
                launchAABeforeUI.finish();
                return;
            }
            r45.lh5 lh5Var = ((i61.p) m1Var).f288933s;
            if (lh5Var == null) {
                lh5Var = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAABeforeUI", "NetSceneNewAAQueryPFInfo retcode:%s retmsg:%s", java.lang.Integer.valueOf(lh5Var.f379484d), lh5Var.f379485e);
            if (lh5Var.f379484d != 0) {
                db5.e1.y(launchAABeforeUI, com.tencent.mm.sdk.platformtools.t8.K0(lh5Var.f379485e) ? launchAABeforeUI.getString(com.tencent.mm.R.string.f492381ga1) : lh5Var.f379485e, "", launchAABeforeUI.getString(com.tencent.mm.R.string.ga_), new com.tencent.mm.plugin.aa.ui.c2(this));
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enter_scene", 6);
            com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel netSceneNewAAQueryPFInfo$PfInfoParcel = new com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel();
            netSceneNewAAQueryPFInfo$PfInfoParcel.f72415d = lh5Var.f379486f;
            netSceneNewAAQueryPFInfo$PfInfoParcel.f72416e = lh5Var.f379487g;
            java.util.Iterator it = lh5Var.f379488h.iterator();
            while (it.hasNext()) {
                r45.o oVar = (r45.o) it.next();
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel netSceneNewAAQueryPFInfo$AALaunchItemParcel = new com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel();
                netSceneNewAAQueryPFInfo$AALaunchItemParcel.f72406d = oVar.f381784d;
                netSceneNewAAQueryPFInfo$AALaunchItemParcel.f72407e = oVar.f381785e;
                netSceneNewAAQueryPFInfo$PfInfoParcel.f72417f.add(netSceneNewAAQueryPFInfo$AALaunchItemParcel);
            }
            netSceneNewAAQueryPFInfo$PfInfoParcel.f72418g = lh5Var.f379489i;
            netSceneNewAAQueryPFInfo$PfInfoParcel.f72419h = lh5Var.f379490m;
            if (lh5Var.f379491n != null) {
                netSceneNewAAQueryPFInfo$PfInfoParcel.f72420i = new com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel();
                java.util.Iterator it6 = lh5Var.f379491n.f370430d.iterator();
                while (it6.hasNext()) {
                    netSceneNewAAQueryPFInfo$PfInfoParcel.f72420i.f72424d.add((java.lang.String) it6.next());
                }
                java.util.Iterator it7 = lh5Var.f379491n.f370431e.iterator();
                while (it7.hasNext()) {
                    netSceneNewAAQueryPFInfo$PfInfoParcel.f72420i.f72425e.add((java.lang.String) it7.next());
                }
            }
            netSceneNewAAQueryPFInfo$PfInfoParcel.f72421m = lh5Var.f379492o;
            com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel netSceneNewAAQueryPFInfo$AAOperationInfoParcel = new com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel();
            netSceneNewAAQueryPFInfo$PfInfoParcel.f72422n = netSceneNewAAQueryPFInfo$AAOperationInfoParcel;
            r45.q qVar = lh5Var.f379493p;
            netSceneNewAAQueryPFInfo$AAOperationInfoParcel.f72408d = qVar.f383519d;
            netSceneNewAAQueryPFInfo$AAOperationInfoParcel.f72409e = qVar.f383520e;
            netSceneNewAAQueryPFInfo$AAOperationInfoParcel.f72410f = qVar.f383521f;
            netSceneNewAAQueryPFInfo$AAOperationInfoParcel.f72411g = qVar.f383522g;
            netSceneNewAAQueryPFInfo$AAOperationInfoParcel.f72412h = qVar.f383523h;
            netSceneNewAAQueryPFInfo$AAOperationInfoParcel.f72413i = qVar.f383524i;
            netSceneNewAAQueryPFInfo$AAOperationInfoParcel.f72414m = qVar.f383525m;
            netSceneNewAAQueryPFInfo$PfInfoParcel.f72423o = lh5Var.f379494q;
            intent.putExtra("pfInfo", netSceneNewAAQueryPFInfo$PfInfoParcel);
            intent.putExtra("pfOrderNo", launchAABeforeUI.f72476e);
            r45.q qVar2 = lh5Var.f379493p;
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_PAYER_NUM_INT, java.lang.Integer.valueOf(qVar2.f383519d));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_RECEIVER_NUM_INT, java.lang.Integer.valueOf(qVar2.f383520e));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_TOTAL_USER_NUM_INT, java.lang.Integer.valueOf(qVar2.f383521f));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_TOTAL_AMOUNT_LONG, java.lang.Long.valueOf(qVar2.f383522g));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_PER_AMOUNT_LONG, java.lang.Long.valueOf(qVar2.f383523h));
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            j45.l.j(launchAABeforeUI, "aa", ".ui.LaunchAAUI", intent, null);
            com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI.O6(launchAABeforeUI, false);
            launchAABeforeUI.finish();
        }
    }
}
