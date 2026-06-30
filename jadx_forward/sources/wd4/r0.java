package wd4;

/* loaded from: classes4.dex */
public abstract class r0 {
    public static final void a(wd4.l1 l1Var, android.view.View view, java.util.ArrayList imageQBarDataList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addImageScanQRCode", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageQBarDataList, "imageQBarDataList");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(imageQBarDataList)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addImageScanQRCode", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
            return;
        }
        l1Var.d().f293412q = new wd4.o0(l1Var, imageQBarDataList, view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addImageScanQRCode", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 b(wd4.l1 l1Var, android.view.View view, java.util.ArrayList imageQBarDataList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageQBarDataList, "imageQBarDataList");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
            return null;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.c0.a(l1Var.c(), view, imageQBarDataList, 0).f384366d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = arrayList.size() == 1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) arrayList.get(0) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
        return c17261xe88a6357;
    }
}
