package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752;

/* loaded from: classes3.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 f253907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.C18508x534b42a5 f253908e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.C18508x534b42a5 c18508x534b42a5, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
        this.f253908e = c18508x534b42a5;
        this.f253907d = c5974x1d8a7409;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f253908e.f253716d.f253918c == this.f253907d.f136272g.f87933a) {
            this.f253908e.f253716d.e();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409 = this.f253907d;
            if (c5974x1d8a7409.f136272g.f87935c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.j jVar = this.f253908e.f253716d;
                jVar.getClass();
                boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(c5974x1d8a7409.f136272g.f87936d);
                am.ct ctVar = c5974x1d8a7409.f136272g;
                if (j17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.i iVar = jVar.f253920e;
                    if (iVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GestureGalleryTransLogic", "transCallback is null");
                    } else {
                        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ActivityC18509x4a85de3d) iVar).f253727g;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("original_file_path", str);
                        intent.putExtra("translate_source", ctVar.f87934b);
                        intent.setClassName(jVar.f253921f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = jVar.f253921f;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "handleTranslationReusltEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "handleTranslationReusltEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        jVar.f253921f.finish();
                        jVar.f253921f.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GestureGalleryTransLogic", "trans result path %s not exist!", ctVar.f87936d);
                }
            }
            this.f253908e.f253716d.f253918c = 0;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f253908e.f253716d.f253921f;
            db5.e1.G(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iaw), "", false, null);
        }
    }
}
