package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaHKFingerprintImpl */
/* loaded from: classes15.dex */
public class C3130x99572e14 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3464xdc04587f {

    /* renamed from: ACTION_HANDLER */
    public static com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.HKSoterMpAuthenHandler f12018x31466621 = null;
    private static final java.lang.String TAG = "MicroMsg.KindaHKFingerprintImpl";

    /* renamed from: cacheFingerType */
    private static com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 f12019xaa463b65;

    /* renamed from: cacheRect */
    private static com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf f12020xdeffec86;

    /* renamed from: cacheValid */
    private static boolean f12021x134519a;

    /* renamed from: mAuthenDialog */
    private static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f12022xac41e206;

    /* renamed from: vivoFingerHelper */
    private static com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda f12023x31b97b43;

    /* renamed from: authCallback */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.BioAuthCallback f12024xdd803a0d;

    /* renamed from: cancelCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12025x829f98df;

    /* renamed from: challengeString */
    private java.lang.String f12026x4610b254;

    /* renamed from: changePwdCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12027xe81e10d2;

    /* renamed from: failCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12028x34045d83;

    /* renamed from: reasonString */
    private java.lang.String f12032xafb21b75;

    /* renamed from: succCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3638xb592486c f12033x49c72ca7;

    /* renamed from: mController */
    private pe4.o f12030x2305be9 = null;

    /* renamed from: mProgressDialog */
    private android.app.ProgressDialog f12031x7b659fa2 = null;

    /* renamed from: hasHandleCallback */
    private boolean f12029x801b13c7 = false;

    /* renamed from: com.tencent.kinda.framework.app.KindaHKFingerprintImpl$BioAuthCallback */
    /* loaded from: classes9.dex */
    public interface BioAuthCallback {
        /* renamed from: onResult */
        void mo14630x57429edc(org.json.JSONObject jSONObject);
    }

    /* renamed from: com.tencent.kinda.framework.app.KindaHKFingerprintImpl$HKSoterMpAuthenHandler */
    /* loaded from: classes15.dex */
    public static class HKSoterMpAuthenHandler extends android.os.Handler {
        private java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14> mUi;

        /* renamed from: showProgress */
        private boolean f12034x918cb44a;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$handleMessage$0 */
        public /* synthetic */ void m25204xda4e56ae(int i17, java.lang.String[] strArr, int[] iArr) {
            this.mUi.get().m25188x3c698039(i17, strArr, iArr);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: inform ok");
                    re4.d0 d0Var = (re4.d0) message.obj;
                    java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14> weakReference = this.mUi;
                    if (weakReference == null || weakReference.get() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().m25191xaa8d325(d0Var);
                        return;
                    }
                case 1:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: inform cancel");
                    re4.d0 d0Var2 = (re4.d0) message.obj;
                    java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14> weakReference2 = this.mUi;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().m25189x13d2743(d0Var2);
                        return;
                    }
                case 2:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: inform fail");
                    re4.d0 d0Var3 = (re4.d0) message.obj;
                    java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14> weakReference3 = this.mUi;
                    if (weakReference3 == null || weakReference3.get() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().m25190x3bc6e27(d0Var3);
                        return;
                    }
                case 3:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: request permission");
                    java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14> weakReference4 = this.mUi;
                    if (weakReference4 == null || weakReference4.get() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: ui cleared");
                        return;
                    }
                    java.lang.String[] stringArray = message.getData().getStringArray("permissions");
                    int i17 = message.getData().getInt("request_code");
                    if (stringArray == null || stringArray.length <= 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: permission null");
                        return;
                    }
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.j(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4(), i17, new j35.b0() { // from class: com.tencent.kinda.framework.app.KindaHKFingerprintImpl$HKSoterMpAuthenHandler$$a
                        @Override // j35.b0
                        /* renamed from: onRequestPermissionsResult */
                        public final void mo2413x953457f1(int i18, java.lang.String[] strArr, int[] iArr) {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.HKSoterMpAuthenHandler.this.m25204xda4e56ae(i18, strArr, iArr);
                        }
                    }, new java.lang.String[]{"android.permission.USE_FINGERPRINT"}, null, null);
                    return;
                case 4:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: show progress");
                    if (this.f12034x918cb44a) {
                        java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14> weakReference5 = this.mUi;
                        if (weakReference5 == null || weakReference5.get() == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: ui cleared");
                            return;
                        } else {
                            this.mUi.get().m25194x918cb44a();
                            return;
                        }
                    }
                    return;
                case 5:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: dismiss progress");
                    java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14> weakReference6 = this.mUi;
                    if (weakReference6 == null || weakReference6.get() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: ui cleared");
                        return;
                    } else {
                        this.mUi.get().m25187x5ae4aed7();
                        return;
                    }
                case 6:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: show dialog");
                    java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14> weakReference7 = this.mUi;
                    if (weakReference7 == null || weakReference7.get() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: ui cleared");
                        return;
                    } else {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 unused = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.f12022xac41e206 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) message.obj;
                        return;
                    }
                case 7:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: inform retry");
                    java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14> weakReference8 = this.mUi;
                    if (weakReference8 == null || weakReference8.get() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: ui cleared");
                    } else {
                        this.mUi.get().m25192x747c6cbf((re4.d0) message.obj);
                    }
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.TAG, "hy: unidentified msg: %d", java.lang.Integer.valueOf(message.what));
                    return;
            }
        }

        private HKSoterMpAuthenHandler(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14 c3130x99572e14, boolean z17) {
            this.f12034x918cb44a = false;
            this.mUi = null;
            this.mUi = new java.lang.ref.WeakReference<>(c3130x99572e14);
            this.f12034x918cb44a = z17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dismissProgress */
    public void m25187x5ae4aed7() {
        android.app.ProgressDialog progressDialog = this.f12031x7b659fa2;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f12031x7b659fa2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnRequestPermissionsResult */
    public void m25188x3c698039(int i17, java.lang.String[] strArr, int[] iArr) {
        pe4.o oVar = this.f12030x2305be9;
        if (oVar != null) {
            oVar.e(i17, strArr, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: informCancel */
    public void m25189x13d2743(re4.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inform cancel");
        if (this.f12029x801b13c7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inform cancel has handled callbacl ignore");
            return;
        }
        this.f12029x801b13c7 = true;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.BioAuthCallback bioAuthCallback = this.f12024xdd803a0d;
        if (bioAuthCallback == null) {
            this.f12025x829f98df.mo25801x2e7a5e();
            return;
        }
        try {
            bioAuthCallback.mo14630x57429edc(new org.json.JSONObject().put("operationStatus", com.p314xaae8f345.p347x615374d.p349x208df1fe.app.EnumC3158x584e6019.CANCELED.name()));
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "JSON error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: informFail */
    public void m25190x3bc6e27(re4.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inform fail");
        if (this.f12029x801b13c7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inform fail has handled callbacl ignore");
            return;
        }
        this.f12029x801b13c7 = true;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.BioAuthCallback bioAuthCallback = this.f12024xdd803a0d;
        if (bioAuthCallback == null) {
            this.f12028x34045d83.mo25801x2e7a5e();
        } else {
            if (d0Var.f476064f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "auth cancelled, do not callback");
                return;
            }
            try {
                bioAuthCallback.mo14630x57429edc(new org.json.JSONObject().put("operationStatus", com.p314xaae8f345.p347x615374d.p349x208df1fe.app.EnumC3158x584e6019.FAILURE.name()));
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "JSON error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: informOk */
    public void m25191xaa8d325(re4.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inform ok");
        if (this.f12029x801b13c7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inform ok has handled callbacl ignore");
            return;
        }
        this.f12029x801b13c7 = true;
        java.lang.String str = d0Var.f476062d;
        java.lang.String str2 = d0Var.f476063e;
        if (this.f12024xdd803a0d == null) {
            this.f12033x49c72ca7.mo28530x2e7a5e(str, str2, "");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("json", str);
            jSONObject.put("signature", str2);
            this.f12024xdd803a0d.mo14630x57429edc(new org.json.JSONObject().put("operationStatus", com.p314xaae8f345.p347x615374d.p349x208df1fe.app.EnumC3158x584e6019.SUCCESS.name()).put("authInfo", jSONObject));
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "JSON error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: informRetry */
    public void m25192x747c6cbf(re4.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inform retry");
        if (this.f12024xdd803a0d != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("errCode", d0Var.f476059a);
                this.f12024xdd803a0d.mo14630x57429edc(new org.json.JSONObject().put("operationStatus", com.p314xaae8f345.p347x615374d.p349x208df1fe.app.EnumC3158x584e6019.RETRY.name()).put("authInfo", jSONObject));
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "JSON error");
            }
        }
    }

    /* renamed from: prepareData */
    private void m25193xb1ba9551(re4.c0 c0Var, re4.d0 d0Var) {
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c0Var.f476052a = java.lang.Byte.parseByte("01", 16);
            c0Var.f476053b = this.f12026x4610b254;
            c0Var.f476054c = this.f12032xafb21b75;
            if (!re4.g0.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hy: not support soter");
                d0Var.f476059a = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54063x6bbae3b4;
                d0Var.f476060b = "not support soter";
                return;
            }
            if (c0Var.f476052a <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hy: param error: request mode illegal");
                d0Var.f476059a = 90003;
                d0Var.f476060b = "resp model error";
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c0Var.f476053b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hy: param error: challenge null");
                d0Var.f476059a = 90004;
                d0Var.f476060b = "challenge is null";
            } else if (c0Var.f476053b.length() >= 512) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hy: param error: challenge too long");
                d0Var.f476059a = 90004;
                d0Var.f476060b = "challenge is too long. 512 chars at most";
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c0Var.f476054c)) {
                c0Var.f476054c = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jie);
            } else if (c0Var.f476054c.length() > 42) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hy: param error: content too long. use default");
                c0Var.f476054c = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jie);
            }
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
            d0Var.f476059a = 90003;
            d0Var.f476060b = "authen mode is illegal: number format error. found: 0X01";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showProgress */
    public void m25194x918cb44a() {
        android.app.ProgressDialog progressDialog = this.f12031x7b659fa2;
        if (progressDialog == null || !progressDialog.isShowing()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 b17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jid), false, null);
            this.f12031x7b659fa2 = b17;
            b17.show();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3464xdc04587f
    /* renamed from: authenticateImpl */
    public void mo25195x4eef8a95(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.AbstractC3617x3879e6d8 abstractC3617x3879e6d8, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 abstractC3618x898d6123, com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a) {
    }

    /* renamed from: cancelBioAuth */
    public void m25196x486916f6() {
        pe4.o oVar = this.f12030x2305be9;
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "cancel bio auth request error, mController not init");
            return;
        }
        pe4.m mVar = (pe4.m) oVar;
        gu5.c cVar = mVar.f435242k;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterControllerFingerprint", "cancel bioAuth request error, mFingerprintCanceller is null");
            return;
        }
        mVar.f435254e = true;
        zt5.h.e("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", java.lang.Boolean.TRUE);
        if (cVar.f357494a.isCanceled()) {
            zt5.h.c("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new java.lang.Object[0]);
            return;
        }
        ju5.o.a().c(new gu5.a(cVar));
        ju5.o a17 = ju5.o.a();
        a17.f383669b.postDelayed(new gu5.b(cVar), 350L);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3464xdc04587f
    /* renamed from: getFingerPosition */
    public com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf mo25197x8eecd4a8() {
        return new com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf(new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(0.0f, 0.0f), new com.p314xaae8f345.p347x615374d.gen.C3525x44836ec(0.0f, 0.0f));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3464xdc04587f
    /* renamed from: getFingerType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 mo25198xb1c06239() {
        return com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.NONE;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3464xdc04587f
    /* renamed from: releaseService */
    public void mo25199xab8670ae() {
        pe4.o oVar = this.f12030x2305be9;
        if (oVar != null) {
            oVar.getClass();
        }
        android.app.ProgressDialog progressDialog = this.f12031x7b659fa2;
        if (progressDialog != null && progressDialog.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "releaseService mProgressDialog dismiss!");
            this.f12031x7b659fa2.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = f12022xac41e206;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "releaseService mAuthenDialog dismiss!");
        f12022xac41e206.dismiss();
    }

    /* renamed from: showBioAuthModalImpl */
    public void m25200x894769a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.BioAuthCallback bioAuthCallback) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "context is null, invalid");
            return;
        }
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "kinda getTopOrUIPageFragmentActivity is null, invalid");
            return;
        }
        this.f12029x801b13c7 = false;
        f12018x31466621 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.HKSoterMpAuthenHandler(false);
        this.f12032xafb21b75 = str;
        this.f12026x4610b254 = str2;
        this.f12024xdd803a0d = bioAuthCallback;
        re4.c0 c0Var = new re4.c0();
        re4.d0 d0Var = new re4.d0();
        m25193xb1ba9551(c0Var, d0Var);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        c0Var.f476055d = bool;
        c0Var.f476056e = bool;
        if (d0Var.f476059a != 0) {
            m25190x3bc6e27(d0Var);
            return;
        }
        pe4.o a17 = pe4.a.IML.a(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4(), c0Var, d0Var, f12018x31466621);
        this.f12030x2305be9 = a17;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "no corresponding authen mode");
            d0Var.f476059a = 90003;
            d0Var.f476060b = "no corresponding mode";
            m25190x3bc6e27(d0Var);
            return;
        }
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        a17.f435256g = new oe4.i();
        pe4.o oVar = this.f12030x2305be9;
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        oVar.f435255f = new oe4.h();
        pe4.o oVar2 = this.f12030x2305be9;
        oVar2.f435257h = 2;
        oVar2.d(null);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3464xdc04587f
    /* renamed from: showBioAuthViewImpl */
    public void mo25201x856db898(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p347x615374d.gen.AbstractC3638xb592486c abstractC3638xb592486c, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "context is null, invalid");
            return;
        }
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "kinda getTopOrUIPageFragmentActivity is null, invalid");
            return;
        }
        this.f12029x801b13c7 = false;
        f12018x31466621 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3130x99572e14.HKSoterMpAuthenHandler(true);
        this.f12032xafb21b75 = str;
        this.f12026x4610b254 = str2;
        this.f12033x49c72ca7 = abstractC3638xb592486c;
        this.f12028x34045d83 = abstractC3623x3b485619;
        this.f12025x829f98df = abstractC3623x3b4856192;
        this.f12027xe81e10d2 = abstractC3623x3b4856193;
        re4.c0 c0Var = new re4.c0();
        re4.d0 d0Var = new re4.d0();
        m25193xb1ba9551(c0Var, d0Var);
        if (d0Var.f476059a != 0) {
            m25190x3bc6e27(d0Var);
            return;
        }
        pe4.o a17 = pe4.a.IML.a(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4(), c0Var, d0Var, f12018x31466621);
        this.f12030x2305be9 = a17;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "no corresponding authen mode");
            d0Var.f476059a = 90003;
            d0Var.f476060b = "no corresponding mode";
            m25190x3bc6e27(d0Var);
            return;
        }
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        a17.f435256g = new oe4.i();
        pe4.o oVar = this.f12030x2305be9;
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        oVar.f435255f = new oe4.h();
        pe4.o oVar2 = this.f12030x2305be9;
        oVar2.f435257h = 2;
        oVar2.d(null);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3464xdc04587f
    /* renamed from: showFaceIdAuthDialogImpl */
    public void mo25202x88547465(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3617x3879e6d8 abstractC3617x3879e6d8, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3464xdc04587f
    /* renamed from: supportBioType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3387x5ccc5442 mo25203x5b703d93() {
        return re4.g0.c() ? com.p314xaae8f345.p347x615374d.gen.EnumC3387x5ccc5442.FINGERPRINT : com.p314xaae8f345.p347x615374d.gen.EnumC3387x5ccc5442.NONE;
    }
}
