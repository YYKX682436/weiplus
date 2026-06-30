package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 f182999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 f183000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e f183001f;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357) {
        this.f183001f = activityC13568x82804f7e;
        this.f182999d = c5886xd11a0be7;
        this.f183000e = c17261xe88a6357;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.bq0 bq0Var;
        r45.jq0 jq0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "request deal QBAR string");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = this.f183001f;
        if (activityC13568x82804f7e.f181894h.i()) {
            activityC13568x82804f7e.f181894h.u();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = this.f182999d;
        if (c5886xd11a0be7 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = activityC13568x82804f7e.f181892f.getItem(activityC13568x82804f7e.f181890d);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y3 y3Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y3) ((java.util.HashMap) activityC13568x82804f7e.f181897n).get(item.j());
        if (y3Var != null && y3Var.f183149a != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
            am.r3 r3Var = c5292x67f91197.f135612g;
            r3Var.f89314b = activityC13568x82804f7e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = this.f183000e;
            r3Var.f89313a = c17261xe88a6357.f240152d;
            r3Var.f89315c = c17261xe88a6357.f240153e;
            r3Var.f89317e = 7;
            r3Var.f89321i = 39;
            r3Var.f89322j = item.f();
            r3Var.f89323k = item.e();
            r3Var.f89325m = c5886xd11a0be7.f136194g.f87901a;
            r3Var.f89327o = true;
            r3Var.f89329q = c17261xe88a6357.f240163r;
            r3Var.f89316d = c17261xe88a6357.f240154f;
            android.os.Bundle bundle = new android.os.Bundle(1);
            bundle.putInt("stat_scene", 5);
            o72.r2 p17 = item.p();
            activityC13568x82804f7e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "addStatInfo4AppBrand, from fav");
            bundle.putInt("LaunchCodeScene_ScanScene", 4);
            if (p17 != null && (bq0Var = p17.f67640x5ab01132) != null && (jq0Var = bq0Var.f452495d) != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jq0Var.f459575o)) {
                    c01.z1.r().equals(jq0Var.f459569f);
                }
                bundle.putString("stat_chat_talker_username", o72.c3.b(jq0Var));
                bundle.putString("stat_send_msg_user", jq0Var.f459569f);
                bundle.putString("stat_msg_id", jq0Var.f459579s);
            }
            activityC13568x82804f7e.getClass();
            bundle.putInt("KMsgType", 49);
            bundle.putInt("KAppMsgType", 19);
            r3Var.f89324l = bundle;
            c5292x67f91197.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
