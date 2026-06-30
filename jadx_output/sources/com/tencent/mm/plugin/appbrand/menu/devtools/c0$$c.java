package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes.dex */
public final /* synthetic */ class c0$$c implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.c0 f85881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85883c;

    public /* synthetic */ c0$$c(com.tencent.mm.plugin.appbrand.menu.devtools.c0 c0Var, java.lang.String str, android.content.Context context) {
        this.f85881a = c0Var;
        this.f85882b = str;
        this.f85883c = context;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.menu.devtools.c0 c0Var = this.f85881a;
        c0Var.getClass();
        final java.lang.String str = this.f85882b;
        boolean a17 = bf3.r0.a(str, (java.lang.String) obj);
        final android.content.Context context = this.f85883c;
        if (!a17) {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.c0$$e
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.lang.String str2 = str;
                    sb6.append(str2);
                    sb6.append(" export failed!");
                    dp.a.makeText(context, sb6.toString(), 1).show();
                    com.tencent.mars.xlog.Log.e("MiroMsg.GameCpuProfile", str2 + " export failed!");
                }
            });
            return;
        }
        final java.lang.String str2 = lp0.b.D() + "appbrand/trace/" + str;
        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.c0$$d
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str3 = str2;
                sb6.append(str3);
                sb6.append(" exported.");
                dp.a.makeText(context, sb6.toString(), 1).show();
                com.tencent.mars.xlog.Log.i("MiroMsg.GameCpuProfile", str3 + " exported.");
            }
        });
        c0Var.f85872a = false;
    }
}
