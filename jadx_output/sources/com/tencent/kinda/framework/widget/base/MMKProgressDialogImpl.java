package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKProgressDialogImpl implements com.tencent.kinda.gen.KProgressDialog {
    private static final java.lang.String TAG = "MMKProgressDialogImpl";
    private com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl kindaCacheService = new com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl();
    private android.app.Dialog mDialogImpl;
    private android.app.Dialog mLoadingImpl;
    private android.app.Dialog mPayProcessImpl;

    /* JADX INFO: Access modifiers changed from: private */
    public void finishUIPageFragmentActivity() {
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (!(topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity)) {
            com.tencent.mars.xlog.Log.i(TAG, "finishUIPageFragmentActivity, UIPageFragmentActivity no found!");
            return;
        }
        com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = (com.tencent.mm.framework.app.UIPageFragmentActivity) topOrUIPageFragmentActivity;
        if (uIPageFragmentActivity.U6()) {
            uIPageFragmentActivity.finish();
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "finishUIPageFragmentActivity, UIPageFragmentActivity shouldn't finish!");
        }
    }

    private void runInMainThread(java.lang.Runnable runnable) {
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            runnable.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindaDismissDialog() {
        com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl kindaCacheServiceImpl = this.kindaCacheService;
        if (kindaCacheServiceImpl != null) {
            kindaCacheServiceImpl.setBool("kindaShowingDialog", false, 0L);
            com.tencent.mars.xlog.Log.i(TAG, "setKindaDismissDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindaShowingDialog() {
        com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl kindaCacheServiceImpl = this.kindaCacheService;
        if (kindaCacheServiceImpl != null) {
            kindaCacheServiceImpl.setBool("kindaShowingDialog", true, 0L);
            com.tencent.mars.xlog.Log.i(TAG, "setKindaShowingDialog");
        }
    }

    private void showProgressLoadingWithTitle(final java.lang.String str, final boolean z17, final int i17) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showProgressLoadingWithTitle() KindaContext.get() return null! case 1");
        } else {
            runInMainThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.9
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl = com.tencent.mm.wallet_core.ui.b2.f(context, str, z17, i17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.9.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl = null;
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.tencent.mm.ui.MMActivity) {
                        ((com.tencent.mm.ui.MMActivity) context2).addDialog(com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void dismiss() {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl != null && com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl.isShowing()) {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl.dismiss();
                }
                if (com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mPayProcessImpl != null && com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mPayProcessImpl.isShowing()) {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mPayProcessImpl.dismiss();
                }
                if (com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl == null || !com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl.isShowing()) {
                    return;
                }
                com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl.dismiss();
            }
        });
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showCustomLoading(final java.lang.String str, final boolean z17) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            runInMainThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.8
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl = com.tencent.mm.wallet_core.ui.b2.c(context, str, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.8.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            if (com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl != null) {
                                com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl.dismiss();
                                com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl = null;
                            }
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.tencent.mm.ui.MMActivity) {
                        ((com.tencent.mm.ui.MMActivity) context2).addDialog(com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showGoToWPHKProgressLoading(boolean z17) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showGoToWPHKProgressLoading() KindaContext.get() return null! case 1");
        } else {
            showProgressLoadingWithTitle(context.getString(com.tencent.mm.R.string.pcr), z17, 12);
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showImpl(java.lang.String str, final boolean z17, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            runInMainThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl = com.tencent.mm.wallet_core.ui.b2.h(context, z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.1.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            voidCallback.call();
                            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl = null;
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.tencent.mm.ui.MMActivity) {
                        ((com.tencent.mm.ui.MMActivity) context2).addDialog(com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showNormalGlobalLoading(final boolean z17) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            final java.lang.String string = context.getString(com.tencent.mm.R.string.kvr);
            runInMainThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl = com.tencent.mm.wallet_core.ui.b2.c(context, string, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.6.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            if (com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl != null) {
                                com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl.dismiss();
                                com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl = null;
                            }
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.tencent.mm.ui.MMActivity) {
                        ((com.tencent.mm.ui.MMActivity) context2).addDialog(com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showNormalLoading(final boolean z17) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            final java.lang.String string = context.getString(com.tencent.mm.R.string.kvr);
            runInMainThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl = com.tencent.mm.wallet_core.ui.b2.c(context, string, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.5.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            if (com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl != null) {
                                com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl.dismiss();
                                com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl = null;
                            }
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.tencent.mm.ui.MMActivity) {
                        ((com.tencent.mm.ui.MMActivity) context2).addDialog(com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showPayGlobalLoading(final boolean z17) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            runInMainThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl = com.tencent.mm.wallet_core.ui.b2.h(context, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.7.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl = null;
                        }
                    });
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.7.2
                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(android.content.DialogInterface dialogInterface) {
                            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.setKindaDismissDialog();
                            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.finishUIPageFragmentActivity();
                        }
                    });
                    if (context instanceof com.tencent.mm.ui.MMActivity) {
                        com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.setKindaShowingDialog();
                        ((com.tencent.mm.ui.MMActivity) context).addDialog(com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showPayProcessImpl(final boolean z17, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        final android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showPayProcessImpl() KindaContext.get() return null! case 2");
        } else {
            runInMainThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mPayProcessImpl = com.tencent.mm.wallet_core.ui.b2.h(topOrUIPageFragmentActivity, z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.2.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            voidCallback.call();
                            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mPayProcessImpl = null;
                        }
                    });
                    android.content.Context context = topOrUIPageFragmentActivity;
                    if (context instanceof com.tencent.mm.ui.MMActivity) {
                        ((com.tencent.mm.ui.MMActivity) context).addDialog(com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mPayProcessImpl);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showToast(java.lang.String str) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showToast() KindaContext.get() return null! case 3");
        } else {
            db5.e1.T(context, str);
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showTopLoading(java.lang.String str, final boolean z17) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl can't startLoading because the context is null!");
        } else {
            final java.lang.String string = context.getString(com.tencent.mm.R.string.kvq);
            runInMainThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl = com.tencent.mm.wallet_core.ui.b2.c(context, string, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.4.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            if (com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl != null) {
                                com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl.dismiss();
                                com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl = null;
                            }
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.tencent.mm.ui.MMActivity) {
                        ((com.tencent.mm.ui.MMActivity) context2).addDialog(com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mLoadingImpl);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showWPHKPayGlobalLoading(final boolean z17) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showWPHKPayGlobalLoading() KindaContext.get() return null! case 1");
        } else {
            final java.lang.String string = context.getString(com.tencent.mm.R.string.oop);
            runInMainThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.10
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl = com.tencent.mm.wallet_core.ui.b2.f(context, string, !z17, 12, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.10.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl = null;
                        }
                    });
                    com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.10.2
                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(android.content.DialogInterface dialogInterface) {
                            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.setKindaDismissDialog();
                            com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.finishUIPageFragmentActivity();
                        }
                    });
                    if (context instanceof com.tencent.mm.ui.MMActivity) {
                        com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.setKindaShowingDialog();
                        ((com.tencent.mm.ui.MMActivity) context).addDialog(com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.this.mDialogImpl);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KProgressDialog
    public void showWPHKProgressLoading(boolean z17) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "MMKProgressDialogImpl showWPHKProgressLoading() KindaContext.get() return null! case 1");
        } else {
            showProgressLoadingWithTitle(context.getString(com.tencent.mm.R.string.oop), z17, 12);
        }
    }
}
