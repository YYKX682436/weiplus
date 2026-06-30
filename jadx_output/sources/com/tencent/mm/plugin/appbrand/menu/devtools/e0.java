package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class e0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.c0 f85894b;

    public e0(com.tencent.mm.plugin.appbrand.menu.devtools.c0 c0Var, android.content.Context context) {
        this.f85894b = c0Var;
        this.f85893a = context;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.menu.devtools.d0(this));
        this.f85894b.f85872a = true;
    }
}
