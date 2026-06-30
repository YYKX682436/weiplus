package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class p9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f87010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w9 f87011f;

    public p9(com.tencent.mm.plugin.appbrand.page.w9 w9Var, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f87011f = w9Var;
        this.f87009d = str;
        this.f87010e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87011f.F0(this.f87009d, this.f87010e);
    }
}
