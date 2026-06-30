package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee f219676d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee) {
        this.f219676d = activityC15588x58c11aee;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee.f219402p1;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee = this.f219676d;
        java.lang.String str = activityC15588x58c11aee.f219443n;
        if (str != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str.trim()) && java.lang.System.currentTimeMillis() - activityC15588x58c11aee.f219404l1 > 1000) {
            activityC15588x58c11aee.f219404l1 = java.lang.System.currentTimeMillis();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(0)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC15588x58c11aee.f219443n)) {
                    activityC15588x58c11aee.L = true;
                    su4.k3.c(activityC15588x58c11aee.f219443n, 2, 2, 16);
                }
                java.lang.String f17 = su4.r2.f(16);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Ri(activityC15588x58c11aee.mo55332x76847179(), 16, str, f17, true, null, false, Integer.MAX_VALUE, "", 0);
                jx3.f.INSTANCE.d(12041, 16, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0)));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSAddFriendUI", "fts h5 template not avail");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
