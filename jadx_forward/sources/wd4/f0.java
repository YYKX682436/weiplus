package wd4;

/* loaded from: classes4.dex */
public final class f0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f526432b;

    public f0(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f526431a = str;
        this.f526432b = h0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c3
    public final void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$mediaChangeListener$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "onMediaChange, mediaPath: " + str);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f526431a)) {
            ((yz5.l) this.f526432b.f391656d).mo146xb9724478(java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$mediaChangeListener$1");
    }
}
