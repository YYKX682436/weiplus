package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class i extends com.p314xaae8f345.p3210x3857dc.z {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.JsResult f302088a;

    public i(android.webkit.JsResult jsResult) {
        this.f302088a = jsResult;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z
    public void a() {
        android.webkit.JsResult jsResult = this.f302088a;
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z
    public void b() {
        android.webkit.JsResult jsResult = this.f302088a;
        if (jsResult != null) {
            jsResult.confirm();
        }
    }
}
