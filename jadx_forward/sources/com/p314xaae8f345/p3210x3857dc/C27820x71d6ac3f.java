package com.p314xaae8f345.p3210x3857dc;

/* renamed from: com.tencent.xweb.XWebExtendInputClient */
/* loaded from: classes7.dex */
public class C27820x71d6ac3f extends com.p314xaae8f345.p3210x3857dc.p3211xcdc6dad4.a {
    private static final java.lang.String TAG = "XWebExtendInputClient";

    public C27820x71d6ac3f(com.p314xaae8f345.p3210x3857dc.i2 i2Var) {
        super.m120240x316510(i2Var);
    }

    /* renamed from: evaluateJavascript */
    public void m120206x738236e6(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        if (this.f61126xfa790d36 == 1) {
            this.f61125x344b8c76.mo120337x738236e6(str, valueCallback);
        }
    }

    /* renamed from: getToolBarHeight */
    public int mo120207x6a051cac(int i17) {
        return 0;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3211xcdc6dad4.a
    /* renamed from: initPSWebView */
    public void mo120208x94b0d186(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9) {
        super.mo120208x94b0d186(c27847xac2547f9);
    }

    /* renamed from: onExtraInfoChanged */
    public void mo120209x628133f5(java.lang.String str) {
    }

    /* renamed from: onHideKeyboard */
    public boolean mo120210xb4cbdec8(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        return false;
    }

    /* renamed from: onKeyboardHeightChanged */
    public void m120211x88a99e47(boolean z17, int i17, boolean z18) {
        if (this.f61126xfa790d36 == 1) {
            this.f61125x344b8c76.mo120369x8f3469f5(z17, i17, z18);
        }
    }

    /* renamed from: onShowKeyboard */
    public boolean mo120212x6080f183(java.lang.String str, java.lang.String str2, android.view.inputmethod.InputConnection inputConnection, android.os.ResultReceiver resultReceiver) {
        return false;
    }

    /* renamed from: onShowKeyboardConfig */
    public boolean mo120213x48bcf2a5(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, int i27, android.view.inputmethod.EditorInfo editorInfo) {
        return false;
    }

    /* renamed from: performEditorAction */
    public boolean mo120214x17a33804(int i17) {
        return true;
    }
}
