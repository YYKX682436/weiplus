package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class i1 implements com.tencent.mm.plugin.appbrand.jsapi.auth.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f75121a;

    public i1(com.tencent.mm.ipcinvoker.r rVar) {
        this.f75121a = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.b0
    public void a(java.lang.String str) {
        com.tencent.mm.ipcinvoker.r rVar = this.f75121a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(str));
        }
    }
}
