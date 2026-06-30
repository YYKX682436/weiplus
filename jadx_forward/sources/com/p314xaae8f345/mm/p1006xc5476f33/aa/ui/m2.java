package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes8.dex */
public class m2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o2 f154265d;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o2 o2Var) {
        this.f154265d = o2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7 = this.f154265d.f154288d;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7.C;
        activityC11348xdd034dc7.getClass();
        try {
            activityC11348xdd034dc7.j7();
            activityC11348xdd034dc7.f154020p = false;
            activityC11348xdd034dc7.f154024t = 0.0d;
            activityC11348xdd034dc7.f154017m.setText(activityC11348xdd034dc7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_k, java.lang.Double.valueOf(0.0d)));
            ((java.util.HashMap) activityC11348xdd034dc7.f154021q).clear();
            activityC11348xdd034dc7.m7();
            activityC11348xdd034dc7.l7();
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 v2Var = activityC11348xdd034dc7.f154023s;
            if (v2Var != null) {
                java.util.Iterator it = ((java.util.ArrayList) v2Var.f154383d).iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2) it.next()).f154404b = "";
                }
                v2Var.notifyDataSetChanged();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "clearAmount error: %s", e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 3, 9);
    }
}
