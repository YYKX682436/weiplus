package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class i0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85906b;

    public i0(com.tencent.mm.plugin.appbrand.menu.devtools.j0 j0Var, android.content.Context context, java.lang.String str) {
        this.f85905a = context;
        this.f85906b = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.menu.devtools.h0(this));
    }
}
