package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui;

/* loaded from: classes7.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d f156480d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d activityC11550x40c70d1d) {
        this.f156480d = activityC11550x40c70d1d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f156480d.f156459e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.g();
            gVar.f156438i = "menu";
            gVar.f156439m = "close";
            gVar.x(this.f156480d.f156459e.C0());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(this.f156480d.f156459e.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.CLOSE);
            this.f156480d.f156459e.S();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.i();
            iVar.f156443i = "menu";
            iVar.x(this.f156480d.f156459e.C0());
        }
        this.f156480d.finish();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class))).j(this.f156480d, null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
