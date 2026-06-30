package wd4;

/* loaded from: classes4.dex */
public abstract class c3 {
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f) {
        wd4.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String g76 = accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.g7();
        if (android.text.TextUtils.isEmpty(g76)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            gVar = null;
        } else {
            java.util.Objects.requireNonNull(g76);
            gVar = new wd4.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622.b(g76, "mp4"), bi1.g.SNS_VIDEO);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandOpenMaterials_SnsOnlineVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_SnsOnlineVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + gVar);
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f), null, null, new wd4.b3(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f, gVar, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials");
    }
}
