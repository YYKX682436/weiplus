package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class h2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f66742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f66743c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f66744d;

    public h2(com.tencent.mm.feature.finder.live.v4 v4Var, long j17, int i17, s40.t0 t0Var) {
        this.f66741a = v4Var;
        this.f66742b = j17;
        this.f66743c = i17;
        this.f66744d = t0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.feature.finder.live.v4 v4Var = this.f66741a;
        return java.lang.Boolean.valueOf(v4Var.f66990n.post(new com.tencent.mm.feature.finder.live.g2(fVar, v4Var, this.f66742b, this.f66743c, this.f66744d)));
    }
}
