package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f111307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f111308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(com.tencent.mm.plugin.finder.feed.pz pzVar, boolean z17) {
        super(0);
        this.f111307d = pzVar;
        this.f111308e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f111307d;
        pzVar.C.f107664w = pzVar.L1;
        com.tencent.mm.plugin.finder.feed.g00 Z0 = pzVar.Z0();
        boolean f17 = Z0.f();
        boolean z17 = this.f111308e;
        if (f17) {
            Z0.i(new com.tencent.mm.plugin.finder.feed.b00(Z0, z17));
        } else {
            Z0.f106800e.requestLoadMore(z17);
        }
        pzVar.L1 = null;
        return jz5.f0.f302826a;
    }
}
