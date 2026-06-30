package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes4.dex */
public final class g9 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75109a;

    public g9(java.lang.String str) {
        this.f75109a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str = this.f75109a;
        if (str == null || str.length() == 0) {
            km5.u.b().a("invalid appId");
        } else {
            uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCString(str), new com.tencent.mm.plugin.appbrand.app.x8(), new com.tencent.mm.plugin.appbrand.app.f9(km5.u.c()));
        }
        return 0;
    }
}
