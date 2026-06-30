package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class KindaJSEvent implements com.tencent.kinda.gen.KJSEvent {
    private static final java.lang.String TAG = "MicroMsg.KindaJSEvent";
    private com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate mDelegate;

    @java.lang.Deprecated
    private com.tencent.mm.ui.da mIMMOnActivityResult;

    @java.lang.Deprecated
    private int mRequestCode;

    @java.lang.Deprecated
    private int mResultCode = 0;
    private com.tencent.kinda.gen.KindaJSEventType mEventType = com.tencent.kinda.gen.KindaJSEventType.WEB;

    /* loaded from: classes9.dex */
    public interface KindaJsEventDelegate extends com.tencent.kinda.gen.KJSEvent {
    }

    @Override // com.tencent.kinda.gen.KJSEvent
    public void kindaCloseWebViewImpl(boolean z17, com.tencent.kinda.gen.VoidCallback voidCallback) {
        com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate kindaJsEventDelegate = this.mDelegate;
        if (kindaJsEventDelegate != null) {
            kindaJsEventDelegate.kindaCloseWebViewImpl(z17, voidCallback);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_jsapi_close_page_after_pay", z17 ? 1 : 0);
        com.tencent.mars.xlog.Log.i(TAG, "[kindaCloseWebViewImpl] The data from JsApiPayUseCase: isCloseWebView: %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.da daVar = this.mIMMOnActivityResult;
        if (daVar != null) {
            daVar.mmOnActivityResult(this.mRequestCode, this.mResultCode, intent);
        }
        if (voidCallback != null) {
            voidCallback.call();
        }
    }

    @Override // com.tencent.kinda.gen.KJSEvent
    public void kindaEndWithResult(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate kindaJsEventDelegate = this.mDelegate;
        if (kindaJsEventDelegate != null) {
            kindaJsEventDelegate.kindaEndWithResult(str, hashMap);
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
        com.tencent.mars.xlog.Log.i(TAG, "[kindaEndWithResult] The data from JsApiPayUseCase: result: %s, pay_status(isClearFailure): %d, err_code: %s, err_desc: %s", str, java.lang.Integer.valueOf(i17), str2, str3);
        android.content.Intent intent = new android.content.Intent();
        this.mResultCode = 0;
        if (str.endsWith("ok")) {
            this.mResultCode = -1;
            intent.putExtra("key_is_clear_failure", i17);
        } else if (str.endsWith("fail")) {
            this.mResultCode = 5;
            intent.putExtra("key_jsapi_pay_err_code", str2);
            intent.putExtra("key_jsapi_pay_err_msg", str3);
            intent.putExtra("key_is_clear_failure", i17);
        }
        intent.putExtra("key_pay_fail_reason", hashMap.get("fail_reason"));
        intent.putExtra("key_pay_completed_data", hashMap.get("payCompletedData"));
        intent.putExtra("key_pay_overseaPayData", hashMap.get("overseaPayData"));
        com.tencent.mars.xlog.Log.i(TAG, "has fail_reason: %s, has payCompletedData: %s, has overseaPayData: %s", hashMap.get("fail_reason"), hashMap.get("payCompletedData"), hashMap.get("overseaPayData"));
        com.tencent.mm.ui.da daVar = this.mIMMOnActivityResult;
        if (daVar != null) {
            daVar.mmOnActivityResult(this.mRequestCode, this.mResultCode, intent);
        }
    }

    @Override // com.tencent.kinda.gen.KJSEvent
    public com.tencent.kinda.gen.KindaJSEventType kindaGetType() {
        com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate kindaJsEventDelegate = this.mDelegate;
        return kindaJsEventDelegate != null ? kindaJsEventDelegate.kindaGetType() : this.mEventType;
    }

    public void setDelegate(com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate kindaJsEventDelegate) {
        this.mDelegate = kindaJsEventDelegate;
    }

    public void setIMMOnActivityResult(com.tencent.mm.ui.da daVar) {
        this.mIMMOnActivityResult = daVar;
    }

    public void setRequestCode(int i17) {
        this.mRequestCode = i17;
    }

    public void setType(com.tencent.kinda.gen.KindaJSEventType kindaJSEventType) {
        this.mEventType = kindaJSEventType;
    }
}
