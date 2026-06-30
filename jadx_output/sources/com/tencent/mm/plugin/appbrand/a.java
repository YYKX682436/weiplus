package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class a implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f74884a;

    public a(android.webkit.ValueCallback valueCallback) {
        this.f74884a = valueCallback;
    }

    @Override // cl.j1
    public final void a(java.lang.String str, cl.k1 k1Var) {
        android.webkit.ValueCallback valueCallback = this.f74884a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
    }
}
