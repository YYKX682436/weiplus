package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f103840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f103841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.convert.oj ojVar) {
        super(1);
        this.f103840d = c0Var;
        this.f103841e = ojVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da daVar;
        gx2.q it = (gx2.q) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!this.f103840d.f310112d && (daVar = this.f103841e.C) != null) {
            ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar).play();
        }
        return jz5.f0.f302826a;
    }
}
