package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 f236907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f236909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f236910g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f236911h;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7, java.lang.String str, int i17, int i18) {
        this.f236911h = activityC16972xc3ec91bf;
        this.f236907d = c5886xd11a0be7;
        this.f236908e = str;
        this.f236909f = i17;
        this.f236910g = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowImageUI", "request deal QBAR string");
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf = this.f236911h;
        if (activityC16972xc3ec91bf.f236854r.i()) {
            activityC16972xc3ec91bf.f236854r.u();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = this.f236907d;
        if (c5886xd11a0be7 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
        am.r3 r3Var = c5292x67f91197.f135612g;
        r3Var.f89314b = activityC16972xc3ec91bf;
        r3Var.f89313a = this.f236908e;
        r3Var.f89315c = this.f236909f;
        r3Var.f89317e = 8;
        r3Var.f89321i = 30;
        int selectedItemPosition = activityC16972xc3ec91bf.f236847h.getSelectedItemPosition();
        if (-1 == selectedItemPosition) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShowImageUI", "error position");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = activityC16972xc3ec91bf.f236848i.getItem(selectedItemPosition);
            if (item != null) {
                r3Var.f89322j = item.f();
                r3Var.f89323k = item.e();
            }
        }
        r3Var.f89316d = this.f236910g;
        r3Var.f89325m = c5886xd11a0be7.f136194g.f87901a;
        r3Var.f89327o = true;
        r3Var.f89329q = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.b(c5886xd11a0be7);
        if (activityC16972xc3ec91bf.getIntent() != null) {
            r3Var.f89324l = activityC16972xc3ec91bf.getIntent().getBundleExtra("_stat_obj");
        }
        activityC16972xc3ec91bf.getClass();
        android.os.Bundle bundle = r3Var.f89324l;
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowImageUI", "addStatInfo4AppBrand, statObj is null");
            bundle = new android.os.Bundle();
            r3Var.f89324l = bundle;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowImageUI", "addStatInfo4AppBrand, fromScene: %d, chatType: %d", java.lang.Integer.valueOf(activityC16972xc3ec91bf.f236860x), java.lang.Integer.valueOf(activityC16972xc3ec91bf.f236861y));
        if (1 == activityC16972xc3ec91bf.f236860x) {
            bundle.putInt("LaunchCodeScene_ScanScene", 4);
        } else {
            bundle.putInt("LaunchCodeScene_ScanScene", 1);
            bundle.putInt("LaunchCodeScene_ChatType", activityC16972xc3ec91bf.f236861y);
        }
        activityC16972xc3ec91bf.getClass();
        android.os.Bundle bundle2 = r3Var.f89324l;
        if (bundle2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowImageUI", "addStatInfo4GetA8Key, statObj is null");
            bundle2 = new android.os.Bundle();
            r3Var.f89324l = bundle2;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(activityC16972xc3ec91bf.f236851o, activityC16972xc3ec91bf.f236850n);
        if (f27 != null) {
            bundle2.putLong("serverMsgID", f27.I0());
            bundle2.putString("msgUsername", f27.V1());
        }
        bundle2.putString("geta8key_username", activityC16972xc3ec91bf.f236851o);
        bundle2.putInt("KMsgType", 49);
        if (1 == activityC16972xc3ec91bf.f236860x) {
            bundle2.putInt("KAppMsgType", 24);
        } else {
            bundle2.putInt("KAppMsgType", 19);
        }
        c5292x67f91197.e();
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
