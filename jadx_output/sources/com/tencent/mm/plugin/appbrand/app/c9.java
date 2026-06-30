package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes.dex */
public final class c9 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f75038a;

    public c9(com.tencent.mm.ipcinvoker.r rVar) {
        this.f75038a = rVar;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.ipcinvoker.r rVar = this.f75038a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(str));
        }
        return java.lang.Boolean.TRUE;
    }
}
