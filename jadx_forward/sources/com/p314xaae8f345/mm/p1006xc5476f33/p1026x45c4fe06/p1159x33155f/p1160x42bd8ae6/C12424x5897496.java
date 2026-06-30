package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.devtools.c0$$c */
/* loaded from: classes.dex */
public final /* synthetic */ class C12424x5897496 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.c0 f167414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f167416c;

    public /* synthetic */ C12424x5897496(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.c0 c0Var, java.lang.String str, android.content.Context context) {
        this.f167414a = c0Var;
        this.f167415b = str;
        this.f167416c = context;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.c0 c0Var = this.f167414a;
        c0Var.getClass();
        final java.lang.String str = this.f167415b;
        boolean a17 = bf3.r0.a(str, (java.lang.String) obj);
        final android.content.Context context = this.f167416c;
        if (!a17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.c0$$e
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.lang.String str2 = str;
                    sb6.append(str2);
                    sb6.append(" export failed!");
                    dp.a.m125854x26a183b(context, sb6.toString(), 1).show();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.GameCpuProfile", str2 + " export failed!");
                }
            });
            return;
        }
        final java.lang.String str2 = lp0.b.D() + "appbrand/trace/" + str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.c0$$d
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str3 = str2;
                sb6.append(str3);
                sb6.append(" exported.");
                dp.a.m125854x26a183b(context, sb6.toString(), 1).show();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.GameCpuProfile", str3 + " exported.");
            }
        });
        c0Var.f167405a = false;
    }
}
