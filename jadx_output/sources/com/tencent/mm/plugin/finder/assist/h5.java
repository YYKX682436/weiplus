package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes9.dex */
public final class h5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.g9 f102224a;

    public h5(zy2.g9 g9Var) {
        this.f102224a = g9Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i18 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        zy2.g9 g9Var = this.f102224a;
        if (i18 == 0 && (i17 = fVar.f70616b) == 0) {
            if (g9Var != null) {
                ((dk5.m5) g9Var).a(i18, i17, ((com.tencent.mm.protocal.protobuf.FinderUserPageResponse) fVar.f70618d).getContact());
                return f0Var;
            }
        } else if (g9Var != null) {
            ((dk5.m5) g9Var).a(i18, fVar.f70616b, null);
            return f0Var;
        }
        return null;
    }
}
