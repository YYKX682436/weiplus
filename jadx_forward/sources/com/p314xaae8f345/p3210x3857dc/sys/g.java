package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes16.dex */
public class g extends com.p314xaae8f345.p3210x3857dc.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.WebChromeClient.FileChooserParams f302086a;

    public g(android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        this.f302086a = fileChooserParams;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.r0
    public android.content.Intent a() {
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams = this.f302086a;
        if (fileChooserParams != null) {
            return fileChooserParams.createIntent();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.r0
    public java.lang.String[] b() {
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams = this.f302086a;
        return fileChooserParams != null ? fileChooserParams.getAcceptTypes() : new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p3210x3857dc.r0
    public int c() {
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams = this.f302086a;
        if (fileChooserParams != null) {
            return fileChooserParams.getMode();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.r0
    public boolean d() {
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams = this.f302086a;
        if (fileChooserParams != null) {
            return fileChooserParams.isCaptureEnabled();
        }
        return false;
    }
}
