package com.tencent.liteapp.framework.dynamic_module;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.liteapp.framework.dynamic_module.c f45986a = new com.tencent.liteapp.framework.dynamic_module.c();

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl f45987b;

    public final synchronized void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PayLoadingManager", "showPayLoading " + z17);
        if (z17 && f45987b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayLoadingManager", "Loading dialog already showing, skipping");
            return;
        }
        if (!z17 && f45987b == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayLoadingManager", "Loading dialog already hidden, skipping");
            return;
        }
        if (z17) {
            f45987b = new com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl();
            new com.tencent.liteapp.framework.dynamic_module.b();
            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl mMKProgressDialogImpl = f45987b;
            if (mMKProgressDialogImpl != null) {
                mMKProgressDialogImpl.showPayGlobalLoading(true);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PayLoadingManager", "Payment loading dialog shown");
        } else {
            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl mMKProgressDialogImpl2 = f45987b;
            if (mMKProgressDialogImpl2 != null) {
                mMKProgressDialogImpl2.dismiss();
            }
            f45987b = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.PayLoadingManager", "Payment loading dialog dismissed");
        }
    }
}
