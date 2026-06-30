package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class p5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f66867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.z5 f66868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66869c;

    public p5(v65.n nVar, com.tencent.mm.feature.finder.live.z5 z5Var, java.lang.String str) {
        this.f66867a = nVar;
        this.f66868b = z5Var;
        this.f66869c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        v65.n nVar = this.f66867a;
        if (i17 == 0 && fVar.f70616b == 0) {
            nVar.a((com.tencent.mm.protocal.protobuf.FinderObject) ((r45.z61) fVar.f70618d).getCustom(1));
        } else {
            com.tencent.mars.xlog.Log.i(this.f66868b.f67057d, "get last object for " + this.f66869c + " failed");
            nVar.a(null);
        }
        return jz5.f0.f302826a;
    }
}
