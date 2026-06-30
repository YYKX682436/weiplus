package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.KindaJSEvent */
/* loaded from: classes9.dex */
public class C3235x6da79b04 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426 {
    private static final java.lang.String TAG = "MicroMsg.KindaJSEvent";

    /* renamed from: mDelegate */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate f12410x55d38512;

    /* renamed from: mIMMOnActivityResult */
    @java.lang.Deprecated
    private com.p314xaae8f345.mm.ui.da f12412x1382bc07;

    /* renamed from: mRequestCode */
    @java.lang.Deprecated
    private int f12413xee92466f;

    /* renamed from: mResultCode */
    @java.lang.Deprecated
    private int f12414xba148bf7 = 0;

    /* renamed from: mEventType */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e f12411x7c96e307 = com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.WEB;

    /* renamed from: com.tencent.kinda.framework.module.impl.KindaJSEvent$KindaJsEventDelegate */
    /* loaded from: classes9.dex */
    public interface KindaJsEventDelegate extends com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426 {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
    /* renamed from: kindaCloseWebViewImpl */
    public void mo24859x14baf22e(boolean z17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate kindaJsEventDelegate = this.f12410x55d38512;
        if (kindaJsEventDelegate != null) {
            kindaJsEventDelegate.mo24859x14baf22e(z17, abstractC3623x3b485619);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_jsapi_close_page_after_pay", z17 ? 1 : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[kindaCloseWebViewImpl] The data from JsApiPayUseCase: isCloseWebView: %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.ui.da daVar = this.f12412x1382bc07;
        if (daVar != null) {
            daVar.mo9729x757c998b(this.f12413xee92466f, this.f12414xba148bf7, intent);
        }
        if (abstractC3623x3b485619 != null) {
            abstractC3623x3b485619.mo25801x2e7a5e();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
    /* renamed from: kindaEndWithResult */
    public void mo24860x91578571(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate kindaJsEventDelegate = this.f12410x55d38512;
        if (kindaJsEventDelegate != null) {
            kindaJsEventDelegate.mo24860x91578571(str, hashMap);
            return;
        }
        if (hashMap != null) {
            i17 = "pending".equals(hashMap.get("pay_status")) ? 0 : "fail".equals(hashMap.get("pay_status")) ? 1 : -1;
            str2 = hashMap.get("err_code");
            str3 = hashMap.get("err_desc");
        } else {
            str2 = "";
            i17 = -1;
            str3 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[kindaEndWithResult] The data from JsApiPayUseCase: result: %s, pay_status(isClearFailure): %d, err_code: %s, err_desc: %s", str, java.lang.Integer.valueOf(i17), str2, str3);
        android.content.Intent intent = new android.content.Intent();
        this.f12414xba148bf7 = 0;
        if (str.endsWith("ok")) {
            this.f12414xba148bf7 = -1;
            intent.putExtra("key_is_clear_failure", i17);
        } else if (str.endsWith("fail")) {
            this.f12414xba148bf7 = 5;
            intent.putExtra("key_jsapi_pay_err_code", str2);
            intent.putExtra("key_jsapi_pay_err_msg", str3);
            intent.putExtra("key_is_clear_failure", i17);
        }
        intent.putExtra("key_pay_fail_reason", hashMap.get("fail_reason"));
        intent.putExtra("key_pay_completed_data", hashMap.get("payCompletedData"));
        intent.putExtra("key_pay_overseaPayData", hashMap.get("overseaPayData"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "has fail_reason: %s, has payCompletedData: %s, has overseaPayData: %s", hashMap.get("fail_reason"), hashMap.get("payCompletedData"), hashMap.get("overseaPayData"));
        com.p314xaae8f345.mm.ui.da daVar = this.f12412x1382bc07;
        if (daVar != null) {
            daVar.mo9729x757c998b(this.f12413xee92466f, this.f12414xba148bf7, intent);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
    /* renamed from: kindaGetType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e mo24861xe667f7a3() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate kindaJsEventDelegate = this.f12410x55d38512;
        return kindaJsEventDelegate != null ? kindaJsEventDelegate.mo24861xe667f7a3() : this.f12411x7c96e307;
    }

    /* renamed from: setDelegate */
    public void m25879xa7687c07(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate kindaJsEventDelegate) {
        this.f12410x55d38512 = kindaJsEventDelegate;
    }

    /* renamed from: setIMMOnActivityResult */
    public void m25880xcf5b49f2(com.p314xaae8f345.mm.ui.da daVar) {
        this.f12412x1382bc07 = daVar;
    }

    /* renamed from: setRequestCode */
    public void m25881xb4c0ef5a(int i17) {
        this.f12413xee92466f = i17;
    }

    /* renamed from: setType */
    public void m25882x7650bebc(com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e enumC3560xcac27c5e) {
        this.f12411x7c96e307 = enumC3560xcac27c5e;
    }
}
