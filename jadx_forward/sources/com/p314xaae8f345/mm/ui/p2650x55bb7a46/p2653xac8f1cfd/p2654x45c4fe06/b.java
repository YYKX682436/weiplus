package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06;

/* loaded from: classes9.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f f280198d;

    public b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f fVar) {
        this.f280198d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/appbrand/AppBrandServiceComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceComponent", "MMTitleGotoBtn onClick");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f fVar = this.f280198d;
        android.app.Activity g17 = fVar.f280218d.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd26 = fVar.f280205g;
        fVar.getClass();
        if (g17 == null || c11832x1f85bd26 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceComponent", "activity or exportUrlParams is null");
        } else if (7 == fVar.f280204f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceComponent", "goToAppBrandProfileUI, from profile");
            g17.finish();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceComponent", "exportUrlParams : %s", c11832x1f85bd26.m50144x9616526c());
            java.lang.String str = c11832x1f85bd26.f159014g;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_username", str);
                intent.putExtra("key_from_scene", 8);
                intent.putExtra("key_scene_exposed_params", c11832x1f85bd26);
                j45.l.j(g17, "appbrand", ".ui.AppBrandProfileUI", intent, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/appbrand/AppBrandServiceComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
