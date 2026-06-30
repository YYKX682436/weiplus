package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes8.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q f233728d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q qVar) {
        this.f233728d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.u().c().w(4103, java.lang.Boolean.TRUE);
        gm0.j1.u().c().w(4104, java.lang.Boolean.FALSE);
        c01.fb b17 = c01.fb.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q qVar = this.f233728d;
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16723x347a332a activityC16723x347a332a = qVar.f233731d;
            android.content.Intent intent = new android.content.Intent(qVar.f233731d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16725xc15abea1.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16723x347a332a, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16723x347a332a.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16723x347a332a, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.String d17 = b17.d();
            if (d17 == null) {
                d17 = "";
            }
            b17.c();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(java.lang.Integer.valueOf(b17.f118721b), 0);
            if (d17.equals("") || j17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16723x347a332a activityC16723x347a332a2 = qVar.f233731d;
                android.content.Intent intent2 = new android.content.Intent(qVar.f233731d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16725xc15abea1.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC16723x347a332a2, arrayList2.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC16723x347a332a2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC16723x347a332a2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16723x347a332a activityC16723x347a332a3 = qVar.f233731d;
                android.content.Intent intent3 = new android.content.Intent(qVar.f233731d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a.class);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent3);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(activityC16723x347a332a3, arrayList3.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC16723x347a332a3.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(activityC16723x347a332a3, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(14L);
        qVar.f233731d.finish();
    }
}
