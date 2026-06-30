package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public class i implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f83992a;

    public i(com.tencent.mm.plugin.appbrand.jsruntime.n nVar, android.webkit.ValueCallback valueCallback) {
        this.f83992a = valueCallback;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        this.f83992a.onReceiveValue(str);
    }
}
