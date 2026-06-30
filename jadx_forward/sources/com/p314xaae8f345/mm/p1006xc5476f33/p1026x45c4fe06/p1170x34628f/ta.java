package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class ta implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f168657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wa f168658f;

    public ta(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wa waVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f168658f = waVar;
        this.f168656d = str;
        this.f168657e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*android.webkit.WebView*/.evaluateJavascript(this.f168656d, this.f168657e);
    }
}
