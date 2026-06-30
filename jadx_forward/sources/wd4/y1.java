package wd4;

/* loaded from: classes4.dex */
public final class y1 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f526600b;

    public y1(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f526599a = str;
        this.f526600b = h0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b3
    public final void r(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "onDownloadFinish, mediaPath: " + str + ", success: " + z17);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f526599a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
        } else {
            ((yz5.l) this.f526600b.f391656d).mo146xb9724478(java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
        }
    }
}
