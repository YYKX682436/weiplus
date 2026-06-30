package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class uy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f110840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f110841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(com.tencent.mm.plugin.finder.feed.pz pzVar, ym5.s3 s3Var) {
        super(0);
        this.f110840d = pzVar;
        this.f110841e = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f110840d;
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().postDelayed(new com.tencent.mm.plugin.finder.feed.ty(pzVar, this.f110841e), com.tencent.mm.plugin.finder.storage.t70.f127590a.Q1());
        }
        return jz5.f0.f302826a;
    }
}
