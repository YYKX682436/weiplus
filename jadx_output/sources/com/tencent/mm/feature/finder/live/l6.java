package com.tencent.mm.feature.finder.live;

/* loaded from: classes4.dex */
public final class l6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66823a;

    public l6(yz5.l lVar) {
        this.f66823a = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            pm0.v.X(new com.tencent.mm.feature.finder.live.k6(this.f66823a, fVar));
        }
        return jz5.f0.f302826a;
    }
}
