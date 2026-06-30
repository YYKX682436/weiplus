package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class l1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bf.h f75170d;

    public l1(com.tencent.mm.plugin.appbrand.app.m1 m1Var, bf.h hVar) {
        this.f75170d = hVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        bf.h hVar = this.f75170d;
        if (iPCString == null || (str = iPCString.f68406d) == null) {
            f0Var = null;
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            hVar.a(com.tencent.mm.modelavatar.z.h(str, null, false));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            hVar.a(null);
        }
    }
}
