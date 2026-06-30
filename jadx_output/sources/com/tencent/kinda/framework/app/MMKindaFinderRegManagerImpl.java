package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class MMKindaFinderRegManagerImpl implements com.tencent.kinda.gen.KindaFinderRegManager {
    private final java.lang.String TAG = "MicorMsg.MMFinderRegManagerImpl";

    @Override // com.tencent.kinda.gen.KindaFinderRegManager
    public void startFinderFeeds(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicorMsg.MMFinderRegManagerImpl", "startFinderProfile feedid：%s，nonceid：%s", str, str2);
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (!(topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity)) {
            com.tencent.mars.xlog.Log.e("MicorMsg.MMFinderRegManagerImpl", "startFaceImpl failed due to incompatible context(%s)", topOrUIPageFragmentActivity.getClass().getName());
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vj(topOrUIPageFragmentActivity, str, str2, true, 16, com.tencent.mm.plugin.wallet_core.utils.b1.a(1));
    }

    @Override // com.tencent.kinda.gen.KindaFinderRegManager
    public void startFinderProfile(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicorMsg.MMFinderRegManagerImpl", "startFinderProfile username：%s", str);
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (!(topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) && !topOrUIPageFragmentActivity.getClass().getName().contains(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP)) {
            com.tencent.mars.xlog.Log.e("MicorMsg.MMFinderRegManagerImpl", "startFaceImpl failed due to incompatible context(%s)", topOrUIPageFragmentActivity.getClass().getName());
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).xj(topOrUIPageFragmentActivity, str, 16, com.tencent.mm.plugin.wallet_core.utils.b1.a(1));
    }
}
