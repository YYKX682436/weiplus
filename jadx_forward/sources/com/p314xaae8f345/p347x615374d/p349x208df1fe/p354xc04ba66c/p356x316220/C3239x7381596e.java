package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl */
/* loaded from: classes9.dex */
public class C3239x7381596e implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3520xdaf2b5cc {
    private static final java.lang.String TAG = "KindaScanWidgetImpl";

    /* renamed from: isDismissOnScanFinish */
    private boolean f12418xb0795acf = true;

    /* renamed from: liteAppCallback */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.ScanWidgetLiteAppCallback f12419x2eb7abf8;

    /* renamed from: mCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3636xee40045c f12420x1ab9c7d2;

    /* renamed from: mScanBankCardResultListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f12421x8518dfa7;

    /* renamed from: scanBankCardConfirmResultListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f12422x1eb99148;

    /* renamed from: com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl$ScanWidgetLiteAppCallback */
    /* loaded from: classes9.dex */
    public interface ScanWidgetLiteAppCallback {
        /* renamed from: onScanCallback */
        void mo25901xbd530961(android.content.Intent intent);
    }

    public C3239x7381596e() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f12422x1eb99148 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5960xee159aa6>(a0Var) { // from class: com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.1
            {
                this.f39173x3fe91575 = 582289590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5960xee159aa6 c5960xee159aa6) {
                am.ps psVar = c5960xee159aa6.f136259g;
                if (psVar.f89190b == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(psVar.f89189a)) {
                    am.ps psVar2 = c5960xee159aa6.f136259g;
                    java.lang.String str = psVar2.f89189a;
                    android.graphics.Bitmap bitmap = psVar2.f89191c;
                    java.lang.String replaceAll = str.replaceAll("-", "").replaceAll(" ", "");
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12420x1ab9c7d2 != null) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12420x1ab9c7d2.mo28520x2e7a5e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.m25895x15a9108d(replaceAll), replaceAll, com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.m25897x864f4ecd(bitmap));
                    }
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12419x2eb7abf8 != null) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("cardNumber", com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.m25895x15a9108d(replaceAll));
                        intent.putExtra("scanResult", replaceAll);
                        intent.putExtra("imageData", com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.m25897x864f4ecd(bitmap));
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12419x2eb7abf8.mo25901xbd530961(intent);
                    }
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12422x1eb99148.mo48814x2efc64();
                return false;
            }
        };
        this.f12421x8518dfa7 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94>(a0Var) { // from class: com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.2
            {
                this.f39173x3fe91575 = 96068484;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94 c5961x66a09f94) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5961x66a09f94.f136260g.f89274a)) {
                    am.qs qsVar = c5961x66a09f94.f136260g;
                    java.lang.String str = qsVar.f89274a;
                    android.graphics.Bitmap bitmap = qsVar.f89275b;
                    java.lang.String replaceAll = str.replaceAll("-", "").replaceAll(" ", "");
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12420x1ab9c7d2 != null) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12420x1ab9c7d2.mo28520x2e7a5e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.m25895x15a9108d(replaceAll), replaceAll, com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.m25897x864f4ecd(bitmap));
                    }
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12419x2eb7abf8 != null) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("cardNumber", com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.m25895x15a9108d(replaceAll));
                        intent.putExtra("scanResult", replaceAll);
                        intent.putExtra("imageData", com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.m25897x864f4ecd(bitmap));
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12419x2eb7abf8.mo25901xbd530961(intent);
                    }
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.this.f12421x8518dfa7.mo48814x2efc64();
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getEncryptDataWithHash */
    public java.lang.String m25895x15a9108d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        c28013x36bca45.m121808x5d476ab4(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f1.a());
        com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
        return c28013x36bca45.m121803x8b1ff279(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3520xdaf2b5cc
    /* renamed from: dismissOnScanFinish */
    public void mo25896x2d559459(boolean z17) {
        this.f12418xb0795acf = !z17;
    }

    /* renamed from: getBitmapByte */
    public byte[] m25897x864f4ecd(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (java.io.IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3520xdaf2b5cc
    /* renamed from: scan */
    public void mo25898x35c67d(java.lang.String str) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "KindaScanWidgetImpl scan() KindaContext.get() return null!");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("scan_bankcard_with_confirm_ui", this.f12418xb0795acf);
        intent.putExtra("bank_card_owner", str);
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        j45.l.j(context, "scanner", ".ui.ScanCardUI", intent, null);
        this.f12422x1eb99148.mo48813x58998cd();
        this.f12421x8518dfa7.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3520xdaf2b5cc
    /* renamed from: setHandlerImpl */
    public void mo25899xca3932c8(com.p314xaae8f345.p347x615374d.gen.AbstractC3636xee40045c abstractC3636xee40045c) {
        this.f12420x1ab9c7d2 = abstractC3636xee40045c;
    }

    /* renamed from: setScanWidgetLiteAppCallback */
    public void m25900x8ee41855(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.ScanWidgetLiteAppCallback scanWidgetLiteAppCallback) {
        this.f12419x2eb7abf8 = scanWidgetLiteAppCallback;
    }
}
