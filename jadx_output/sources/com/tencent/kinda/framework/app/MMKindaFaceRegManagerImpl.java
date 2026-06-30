package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class MMKindaFaceRegManagerImpl implements com.tencent.kinda.gen.KindaFaceRegManager {
    private static final int FACE_ACTION_REQUEST_CODE = 1;
    private final java.lang.String TAG = "MMKindaFaceRegManagerImpl";

    @Override // com.tencent.kinda.gen.KindaFaceRegManager
    public void startFaceImpl(int i17, java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.VoidBoolStringI32StringCallback voidBoolStringI32StringCallback, com.tencent.kinda.gen.VoidCallback voidCallback, java.lang.String str3) {
        startFaceImpl(i17, str, str2, voidBoolStringI32StringCallback, voidCallback, str3, "");
    }

    @Override // com.tencent.kinda.gen.KindaFaceRegManager
    public void startFaceImpl(int i17, java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.VoidBoolStringI32StringCallback voidBoolStringI32StringCallback, com.tencent.kinda.gen.VoidCallback voidCallback, java.lang.String str3, java.lang.String str4) {
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity("com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI");
        if (!(topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) && !(topOrUIPageFragmentActivity instanceof com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI)) {
            com.tencent.mars.xlog.Log.e("MMKindaFaceRegManagerImpl", "startFaceImpl failed due to incompatible context(%s)", topOrUIPageFragmentActivity.getClass().getName());
            return;
        }
        com.tencent.mars.xlog.Log.i("MMKindaFaceRegManagerImpl", "siScene:%s，strPackage：%s,strPackageSign:%s,otherVerifyTitle:%s，faceVerifyTitle：%s", java.lang.Integer.valueOf(i17), str, str2, str3, str4);
        if (topOrUIPageFragmentActivity instanceof com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI) {
            com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = (com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI) topOrUIPageFragmentActivity;
            walletBrandUI.f181093r = true;
            walletBrandUI.f181091p = voidBoolStringI32StringCallback;
            walletBrandUI.f181092q = voidCallback;
            com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent();
            am.jr jrVar = requestFaceVerifyForPayEvent.f54694g;
            jrVar.f7076j = walletBrandUI;
            jrVar.f7067a = i17;
            jrVar.f7068b = str;
            jrVar.f7069c = str2;
            jrVar.f7070d = str3;
            jrVar.f7073g = str4;
            jrVar.f7074h = 4;
            requestFaceVerifyForPayEvent.e();
            return;
        }
        com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = (com.tencent.mm.framework.app.UIPageFragmentActivity) topOrUIPageFragmentActivity;
        uIPageFragmentActivity.f68154g = voidBoolStringI32StringCallback;
        uIPageFragmentActivity.f68155h = voidCallback;
        com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent2 = new com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent();
        am.jr jrVar2 = requestFaceVerifyForPayEvent2.f54694g;
        jrVar2.f7076j = uIPageFragmentActivity;
        jrVar2.f7067a = i17;
        jrVar2.f7068b = str;
        jrVar2.f7069c = str2;
        jrVar2.f7070d = str3;
        jrVar2.f7073g = str4;
        jrVar2.f7074h = 4;
        requestFaceVerifyForPayEvent2.e();
    }
}
