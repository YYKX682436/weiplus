package com.tencent.kinda.framework.app;

/* loaded from: classes15.dex */
public class KindaHKFingerprintImpl implements com.tencent.kinda.gen.KHKFingerPrintService {
    public static com.tencent.kinda.framework.app.KindaHKFingerprintImpl.HKSoterMpAuthenHandler ACTION_HANDLER = null;
    private static final java.lang.String TAG = "MicroMsg.KindaHKFingerprintImpl";
    private static com.tencent.kinda.gen.FingerType cacheFingerType;
    private static com.tencent.kinda.gen.KRect cacheRect;
    private static boolean cacheValid;
    private static com.tencent.mm.ui.widget.dialog.j0 mAuthenDialog;
    private static com.tencent.kinda.framework.app.FingerprintInsets vivoFingerHelper;
    private com.tencent.kinda.framework.app.KindaHKFingerprintImpl.BioAuthCallback authCallback;
    private com.tencent.kinda.gen.VoidCallback cancelCallback;
    private java.lang.String challengeString;
    private com.tencent.kinda.gen.VoidCallback changePwdCallback;
    private com.tencent.kinda.gen.VoidCallback failCallback;
    private java.lang.String reasonString;
    private com.tencent.kinda.gen.VoidStringStringStringCallback succCallback;
    private pe4.o mController = null;
    private android.app.ProgressDialog mProgressDialog = null;
    private boolean hasHandleCallback = false;

    /* loaded from: classes9.dex */
    public interface BioAuthCallback {
        void onResult(org.json.JSONObject jSONObject);
    }

    /* loaded from: classes15.dex */
    public static class HKSoterMpAuthenHandler extends android.os.Handler {
        private java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaHKFingerprintImpl> mUi;
        private boolean showProgress;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$0(int i17, java.lang.String[] strArr, int[] iArr) {
            this.mUi.get().handleOnRequestPermissionsResult(i17, strArr, iArr);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: inform ok");
                    re4.d0 d0Var = (re4.d0) message.obj;
                    java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaHKFingerprintImpl> weakReference = this.mUi;
                    if (weakReference == null || weakReference.get() == null) {
                        com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().informOk(d0Var);
                        return;
                    }
                case 1:
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: inform cancel");
                    re4.d0 d0Var2 = (re4.d0) message.obj;
                    java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaHKFingerprintImpl> weakReference2 = this.mUi;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().informCancel(d0Var2);
                        return;
                    }
                case 2:
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: inform fail");
                    re4.d0 d0Var3 = (re4.d0) message.obj;
                    java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaHKFingerprintImpl> weakReference3 = this.mUi;
                    if (weakReference3 == null || weakReference3.get() == null) {
                        com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().informFail(d0Var3);
                        return;
                    }
                case 3:
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: request permission");
                    java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaHKFingerprintImpl> weakReference4 = this.mUi;
                    if (weakReference4 == null || weakReference4.get() == null) {
                        com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    }
                    java.lang.String[] stringArray = message.getData().getStringArray("permissions");
                    int i17 = message.getData().getInt("request_code");
                    if (stringArray == null || stringArray.length <= 1) {
                        com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: permission null");
                        return;
                    }
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.j(com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity(), i17, new j35.b0() { // from class: com.tencent.kinda.framework.app.KindaHKFingerprintImpl$HKSoterMpAuthenHandler$$a
                        @Override // j35.b0
                        public final void onRequestPermissionsResult(int i18, java.lang.String[] strArr, int[] iArr) {
                            com.tencent.kinda.framework.app.KindaHKFingerprintImpl.HKSoterMpAuthenHandler.this.lambda$handleMessage$0(i18, strArr, iArr);
                        }
                    }, new java.lang.String[]{"android.permission.USE_FINGERPRINT"}, null, null);
                    return;
                case 4:
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: show progress");
                    if (this.showProgress) {
                        java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaHKFingerprintImpl> weakReference5 = this.mUi;
                        if (weakReference5 == null || weakReference5.get() == null) {
                            com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                            return;
                        } else {
                            this.mUi.get().showProgress();
                            return;
                        }
                    }
                    return;
                case 5:
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: dismiss progress");
                    java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaHKFingerprintImpl> weakReference6 = this.mUi;
                    if (weakReference6 == null || weakReference6.get() == null) {
                        com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().dismissProgress();
                        return;
                    }
                case 6:
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: show dialog");
                    java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaHKFingerprintImpl> weakReference7 = this.mUi;
                    if (weakReference7 == null || weakReference7.get() == null) {
                        com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                        return;
                    } else {
                        com.tencent.mm.ui.widget.dialog.j0 unused = com.tencent.kinda.framework.app.KindaHKFingerprintImpl.mAuthenDialog = (com.tencent.mm.ui.widget.dialog.j0) message.obj;
                        return;
                    }
                case 7:
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: inform retry");
                    java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaHKFingerprintImpl> weakReference8 = this.mUi;
                    if (weakReference8 == null || weakReference8.get() == null) {
                        com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: ui cleared");
                    } else {
                        this.mUi.get().informRetry((re4.d0) message.obj);
                    }
                    break;
                default:
                    com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.app.KindaHKFingerprintImpl.TAG, "hy: unidentified msg: %d", java.lang.Integer.valueOf(message.what));
                    return;
            }
        }

        private HKSoterMpAuthenHandler(com.tencent.kinda.framework.app.KindaHKFingerprintImpl kindaHKFingerprintImpl, boolean z17) {
            this.showProgress = false;
            this.mUi = null;
            this.mUi = new java.lang.ref.WeakReference<>(kindaHKFingerprintImpl);
            this.showProgress = z17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissProgress() {
        android.app.ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.mProgressDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        pe4.o oVar = this.mController;
        if (oVar != null) {
            oVar.e(i17, strArr, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void informCancel(re4.d0 d0Var) {
        com.tencent.mars.xlog.Log.i(TAG, "inform cancel");
        if (this.hasHandleCallback) {
            com.tencent.mars.xlog.Log.i(TAG, "inform cancel has handled callbacl ignore");
            return;
        }
        this.hasHandleCallback = true;
        com.tencent.kinda.framework.app.KindaHKFingerprintImpl.BioAuthCallback bioAuthCallback = this.authCallback;
        if (bioAuthCallback == null) {
            this.cancelCallback.call();
            return;
        }
        try {
            bioAuthCallback.onResult(new org.json.JSONObject().put("operationStatus", com.tencent.kinda.framework.app.OperationStatus.CANCELED.name()));
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e(TAG, "JSON error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void informFail(re4.d0 d0Var) {
        com.tencent.mars.xlog.Log.i(TAG, "inform fail");
        if (this.hasHandleCallback) {
            com.tencent.mars.xlog.Log.i(TAG, "inform fail has handled callbacl ignore");
            return;
        }
        this.hasHandleCallback = true;
        com.tencent.kinda.framework.app.KindaHKFingerprintImpl.BioAuthCallback bioAuthCallback = this.authCallback;
        if (bioAuthCallback == null) {
            this.failCallback.call();
        } else {
            if (d0Var.f394531f) {
                com.tencent.mars.xlog.Log.i(TAG, "auth cancelled, do not callback");
                return;
            }
            try {
                bioAuthCallback.onResult(new org.json.JSONObject().put("operationStatus", com.tencent.kinda.framework.app.OperationStatus.FAILURE.name()));
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e(TAG, "JSON error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void informOk(re4.d0 d0Var) {
        com.tencent.mars.xlog.Log.i(TAG, "inform ok");
        if (this.hasHandleCallback) {
            com.tencent.mars.xlog.Log.i(TAG, "inform ok has handled callbacl ignore");
            return;
        }
        this.hasHandleCallback = true;
        java.lang.String str = d0Var.f394529d;
        java.lang.String str2 = d0Var.f394530e;
        if (this.authCallback == null) {
            this.succCallback.call(str, str2, "");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("json", str);
            jSONObject.put("signature", str2);
            this.authCallback.onResult(new org.json.JSONObject().put("operationStatus", com.tencent.kinda.framework.app.OperationStatus.SUCCESS.name()).put("authInfo", jSONObject));
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e(TAG, "JSON error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void informRetry(re4.d0 d0Var) {
        com.tencent.mars.xlog.Log.i(TAG, "inform retry");
        if (this.authCallback != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("errCode", d0Var.f394526a);
                this.authCallback.onResult(new org.json.JSONObject().put("operationStatus", com.tencent.kinda.framework.app.OperationStatus.RETRY.name()).put("authInfo", jSONObject));
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e(TAG, "JSON error");
            }
        }
    }

    private void prepareData(re4.c0 c0Var, re4.d0 d0Var) {
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            c0Var.f394519a = java.lang.Byte.parseByte("01", 16);
            c0Var.f394520b = this.challengeString;
            c0Var.f394521c = this.reasonString;
            if (!re4.g0.c()) {
                com.tencent.mars.xlog.Log.e(TAG, "hy: not support soter");
                d0Var.f394526a = com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION;
                d0Var.f394527b = "not support soter";
                return;
            }
            if (c0Var.f394519a <= 0) {
                com.tencent.mars.xlog.Log.e(TAG, "hy: param error: request mode illegal");
                d0Var.f394526a = 90003;
                d0Var.f394527b = "resp model error";
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(c0Var.f394520b)) {
                com.tencent.mars.xlog.Log.e(TAG, "hy: param error: challenge null");
                d0Var.f394526a = 90004;
                d0Var.f394527b = "challenge is null";
            } else if (c0Var.f394520b.length() >= 512) {
                com.tencent.mars.xlog.Log.e(TAG, "hy: param error: challenge too long");
                d0Var.f394526a = 90004;
                d0Var.f394527b = "challenge is too long. 512 chars at most";
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(c0Var.f394521c)) {
                c0Var.f394521c = com.tencent.kinda.framework.widget.tools.KindaContext.get().getString(com.tencent.mm.R.string.jie);
            } else if (c0Var.f394521c.length() > 42) {
                com.tencent.mars.xlog.Log.e(TAG, "hy: param error: content too long. use default");
                c0Var.f394521c = com.tencent.kinda.framework.widget.tools.KindaContext.get().getString(com.tencent.mm.R.string.jie);
            }
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
            d0Var.f394526a = 90003;
            d0Var.f394527b = "authen mode is illegal: number format error. found: 0X01";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showProgress() {
        android.app.ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog == null || !progressDialog.isShowing()) {
            com.tencent.mm.ui.widget.dialog.g4 b17 = com.tencent.mm.ui.widget.dialog.g4.b(com.tencent.kinda.framework.widget.tools.KindaContext.get(), com.tencent.kinda.framework.widget.tools.KindaContext.get().getString(com.tencent.mm.R.string.jid), false, null);
            this.mProgressDialog = b17;
            b17.show();
        }
    }

    @Override // com.tencent.kinda.gen.KHKFingerPrintService
    public void authenticateImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidBinaryI32Callback voidBinaryI32Callback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback) {
    }

    public void cancelBioAuth() {
        pe4.o oVar = this.mController;
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e(TAG, "cancel bio auth request error, mController not init");
            return;
        }
        pe4.m mVar = (pe4.m) oVar;
        gu5.c cVar = mVar.f353709k;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterControllerFingerprint", "cancel bioAuth request error, mFingerprintCanceller is null");
            return;
        }
        mVar.f353721e = true;
        zt5.h.e("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", java.lang.Boolean.TRUE);
        if (cVar.f275961a.isCanceled()) {
            zt5.h.c("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new java.lang.Object[0]);
            return;
        }
        ju5.o.a().c(new gu5.a(cVar));
        ju5.o a17 = ju5.o.a();
        a17.f302136b.postDelayed(new gu5.b(cVar), 350L);
    }

    @Override // com.tencent.kinda.gen.KHKFingerPrintService
    public com.tencent.kinda.gen.KRect getFingerPosition() {
        return new com.tencent.kinda.gen.KRect(new com.tencent.kinda.gen.KPoint(0.0f, 0.0f), new com.tencent.kinda.gen.KSize(0.0f, 0.0f));
    }

    @Override // com.tencent.kinda.gen.KHKFingerPrintService
    public com.tencent.kinda.gen.FingerType getFingerType() {
        return com.tencent.kinda.gen.FingerType.NONE;
    }

    @Override // com.tencent.kinda.gen.KHKFingerPrintService
    public void releaseService() {
        pe4.o oVar = this.mController;
        if (oVar != null) {
            oVar.getClass();
        }
        android.app.ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            com.tencent.mars.xlog.Log.i(TAG, "releaseService mProgressDialog dismiss!");
            this.mProgressDialog.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = mAuthenDialog;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "releaseService mAuthenDialog dismiss!");
        mAuthenDialog.dismiss();
    }

    public void showBioAuthModalImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.framework.app.KindaHKFingerprintImpl.BioAuthCallback bioAuthCallback) {
        if (com.tencent.kinda.framework.widget.tools.KindaContext.get() == null) {
            com.tencent.mars.xlog.Log.i(TAG, "context is null, invalid");
            return;
        }
        if (com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity() == null) {
            com.tencent.mars.xlog.Log.i(TAG, "kinda getTopOrUIPageFragmentActivity is null, invalid");
            return;
        }
        this.hasHandleCallback = false;
        ACTION_HANDLER = new com.tencent.kinda.framework.app.KindaHKFingerprintImpl.HKSoterMpAuthenHandler(false);
        this.reasonString = str;
        this.challengeString = str2;
        this.authCallback = bioAuthCallback;
        re4.c0 c0Var = new re4.c0();
        re4.d0 d0Var = new re4.d0();
        prepareData(c0Var, d0Var);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        c0Var.f394522d = bool;
        c0Var.f394523e = bool;
        if (d0Var.f394526a != 0) {
            informFail(d0Var);
            return;
        }
        pe4.o a17 = pe4.a.IML.a(com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity(), c0Var, d0Var, ACTION_HANDLER);
        this.mController = a17;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e(TAG, "no corresponding authen mode");
            d0Var.f394526a = 90003;
            d0Var.f394527b = "no corresponding mode";
            informFail(d0Var);
            return;
        }
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        a17.f353723g = new oe4.i();
        pe4.o oVar = this.mController;
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        oVar.f353722f = new oe4.h();
        pe4.o oVar2 = this.mController;
        oVar2.f353724h = 2;
        oVar2.d(null);
    }

    @Override // com.tencent.kinda.gen.KHKFingerPrintService
    public void showBioAuthViewImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.VoidStringStringStringCallback voidStringStringStringCallback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.VoidCallback voidCallback3) {
        if (com.tencent.kinda.framework.widget.tools.KindaContext.get() == null) {
            com.tencent.mars.xlog.Log.i(TAG, "context is null, invalid");
            return;
        }
        if (com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity() == null) {
            com.tencent.mars.xlog.Log.i(TAG, "kinda getTopOrUIPageFragmentActivity is null, invalid");
            return;
        }
        this.hasHandleCallback = false;
        ACTION_HANDLER = new com.tencent.kinda.framework.app.KindaHKFingerprintImpl.HKSoterMpAuthenHandler(true);
        this.reasonString = str;
        this.challengeString = str2;
        this.succCallback = voidStringStringStringCallback;
        this.failCallback = voidCallback;
        this.cancelCallback = voidCallback2;
        this.changePwdCallback = voidCallback3;
        re4.c0 c0Var = new re4.c0();
        re4.d0 d0Var = new re4.d0();
        prepareData(c0Var, d0Var);
        if (d0Var.f394526a != 0) {
            informFail(d0Var);
            return;
        }
        pe4.o a17 = pe4.a.IML.a(com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity(), c0Var, d0Var, ACTION_HANDLER);
        this.mController = a17;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e(TAG, "no corresponding authen mode");
            d0Var.f394526a = 90003;
            d0Var.f394527b = "no corresponding mode";
            informFail(d0Var);
            return;
        }
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        a17.f353723g = new oe4.i();
        pe4.o oVar = this.mController;
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        oVar.f353722f = new oe4.h();
        pe4.o oVar2 = this.mController;
        oVar2.f353724h = 2;
        oVar2.d(null);
    }

    @Override // com.tencent.kinda.gen.KHKFingerPrintService
    public void showFaceIdAuthDialogImpl(java.lang.String str, com.tencent.kinda.gen.VoidBinaryI32Callback voidBinaryI32Callback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2) {
    }

    @Override // com.tencent.kinda.gen.KHKFingerPrintService
    public com.tencent.kinda.gen.BioType supportBioType() {
        return re4.g0.c() ? com.tencent.kinda.gen.BioType.FINGERPRINT : com.tencent.kinda.gen.BioType.NONE;
    }
}
