package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class r7 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.n7 f87758d;

    public r7(com.tencent.mm.plugin.appbrand.n7 n7Var) {
        this.f87758d = n7Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        if (iPCBoolean == null || !iPCBoolean.f68400d) {
            throw new java.lang.IllegalStateException("safeCheckAvailableLib");
        }
        this.f87758d.f86038h.H.a("reload");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.q7(this));
    }
}
