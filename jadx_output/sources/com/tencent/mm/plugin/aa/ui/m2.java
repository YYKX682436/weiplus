package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes8.dex */
public class m2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.o2 f72732d;

    public m2(com.tencent.mm.plugin.aa.ui.o2 o2Var) {
        this.f72732d = o2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = this.f72732d.f72755d;
        int i18 = com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.C;
        launchAAByPersonAmountSelectUI.getClass();
        try {
            launchAAByPersonAmountSelectUI.j7();
            launchAAByPersonAmountSelectUI.f72487p = false;
            launchAAByPersonAmountSelectUI.f72491t = 0.0d;
            launchAAByPersonAmountSelectUI.f72484m.setText(launchAAByPersonAmountSelectUI.getString(com.tencent.mm.R.string.g_k, java.lang.Double.valueOf(0.0d)));
            ((java.util.HashMap) launchAAByPersonAmountSelectUI.f72488q).clear();
            launchAAByPersonAmountSelectUI.m7();
            launchAAByPersonAmountSelectUI.l7();
            com.tencent.mm.plugin.aa.ui.v2 v2Var = launchAAByPersonAmountSelectUI.f72490s;
            if (v2Var != null) {
                java.util.Iterator it = ((java.util.ArrayList) v2Var.f72850d).iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.aa.ui.w2) it.next()).f72871b = "";
                }
                v2Var.notifyDataSetChanged();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "clearAmount error: %s", e17.getMessage());
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 3, 9);
    }
}
