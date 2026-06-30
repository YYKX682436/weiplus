package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.share.a f65988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.feature.ecs.share.a aVar) {
        super(1);
        this.f65988d = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!r26.n0.N(it)) {
            t00.e1 e1Var = (t00.e1) this.f65988d;
            e1Var.getClass();
            f10.b[] bVarArr = f10.b.f258544d;
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams(it, 0), com.tencent.mm.feature.ecs.share.q.class);
            java.lang.String str = iPCString != null ? iPCString.f68406d : null;
            if (str == null) {
                str = "";
            }
            e1Var.a(1002, str);
            c00.n3 n3Var = e1Var.f414277b;
            if (n3Var != null) {
                n3Var.b(null);
            }
        }
        return jz5.f0.f302826a;
    }
}
