package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class h extends com.p314xaae8f345.p3210x3857dc.y {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.JsPromptResult f302087a;

    public h(android.webkit.JsPromptResult jsPromptResult) {
        this.f302087a = jsPromptResult;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z
    public void a() {
        android.webkit.JsPromptResult jsPromptResult = this.f302087a;
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z
    public void b() {
        android.webkit.JsPromptResult jsPromptResult = this.f302087a;
        if (jsPromptResult != null) {
            jsPromptResult.confirm();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.y
    public void c(java.lang.String str) {
        android.webkit.JsPromptResult jsPromptResult = this.f302087a;
        if (jsPromptResult != null) {
            jsPromptResult.confirm(str);
        }
    }
}
