package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 f182255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c f182256e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var) {
        this.f182256e = activityC13591xdaafa82c;
        this.f182255d = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.bq0 bq0Var;
        r45.jq0 jq0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImgDetailUI", "request deal QBAR string");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = this.f182255d;
        if (a1Var.f182218c.i()) {
            a1Var.f182218c.u();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
        am.r3 r3Var = c5292x67f91197.f135612g;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c = this.f182256e;
        r3Var.f89314b = activityC13591xdaafa82c;
        r3Var.f89313a = a1Var.f182220e;
        r3Var.f89315c = a1Var.f182221f;
        r3Var.f89317e = 7;
        r3Var.f89321i = 39;
        r3Var.f89325m = a1Var.f182223h;
        r3Var.f89327o = true;
        r3Var.f89329q = a1Var.f182224i;
        r45.gp0 gp0Var = a1Var.f182216a;
        if (gp0Var != null) {
            r3Var.f89322j = gp0Var.f456967s;
            r3Var.f89323k = gp0Var.f456971u;
        }
        r3Var.f89316d = a1Var.f182222g;
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putInt("stat_scene", 5);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c.f182157w;
        activityC13591xdaafa82c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImgDetailUI", "addStatInfo4AppBrand, from fav");
        bundle.putInt("LaunchCodeScene_ScanScene", 4);
        o72.r2 r2Var = activityC13591xdaafa82c.f182160o;
        if (r2Var != null && (bq0Var = r2Var.f67640x5ab01132) != null && (jq0Var = bq0Var.f452495d) != null) {
            bundle.putString("stat_chat_talker_username", o72.c3.b(jq0Var));
            bundle.putString("stat_send_msg_user", jq0Var.f459569f);
            bundle.putString("stat_msg_id", jq0Var.f459579s);
        }
        r3Var.f89324l = bundle;
        c5292x67f91197.e();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
