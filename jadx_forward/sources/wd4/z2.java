package wd4;

/* loaded from: classes4.dex */
public final class z2 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f f526610a;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f) {
        this.f526610a = accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 openMaterialService, wd4.h params) {
        boolean z17;
        r45.jj4 jj4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialService, "openMaterialService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f = this.f526610a;
        accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String str = accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.f248845e;
        if (str == null || (jj4Var = accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.f248853o) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsOnlineVideoActivity", "getDownloadResult, localId or media is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            z17 = false;
        } else {
            java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(str, jj4Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsOnlineVideoActivity", "getDownloadResult, downloadedPath: %s", i17);
            z17 = !android.text.TextUtils.isEmpty(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        java.lang.Boolean bool = z17 ? java.lang.Boolean.TRUE : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        return bool;
    }

    @Override // wd4.c
    public java.lang.Object b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var, wd4.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        java.lang.String materialPath = hVar.b().a().f167804f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialPath, "materialPath");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f = this.f526610a;
        accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDownload", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.f248858r;
        if (c17983xb14a9c8d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsOnlineVideoActivity", "startDownload, videoView is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDownload", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            z17 = false;
        } else {
            boolean T = c17983xb14a9c8d.T(materialPath);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDownload", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            z17 = T;
        }
        if (!z17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        }
        wd4.y2 y2Var = new wd4.y2(materialPath, nVar, accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d2 = accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.f248858r;
        if (c17983xb14a9c8d2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsOnlineVideoActivity", "addDownloadListener, videoView is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            if (c17983xb14a9c8d2.f247976i2 == null) {
                c17983xb14a9c8d2.f247976i2 = new java.util.ArrayList();
            }
            ((java.util.ArrayList) c17983xb14a9c8d2.f247976i2).add(y2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        return a17;
    }

    @Override // wd4.e
    /* renamed from: getName */
    public java.lang.String mo173543xfb82e301() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        return "SnsOnlineVideoActivity$Open";
    }
}
