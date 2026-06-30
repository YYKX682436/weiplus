package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui;

/* loaded from: classes7.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d f156479d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d activityC11550x40c70d1d) {
        this.f156479d = activityC11550x40c70d1d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d activityC11550x40c70d1d = this.f156479d;
        if (activityC11550x40c70d1d.f156459e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.g();
            gVar.f156438i = "menu";
            gVar.f156439m = "back";
            gVar.x(activityC11550x40c70d1d.f156459e.C0());
        }
        activityC11550x40c70d1d.finish();
        activityC11550x40c70d1d.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
