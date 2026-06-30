package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class v0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85939a;

    public v0(com.tencent.mm.plugin.appbrand.menu.devtools.w0 w0Var, android.content.Context context) {
        this.f85939a = context;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.menu.devtools.u0(this, (java.lang.String) obj));
    }
}
