package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class g10 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f106811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g10(com.tencent.mm.plugin.finder.feed.r10 r10Var) {
        super(1);
        this.f106811d = r10Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f106811d;
        if (intValue == -6) {
            return new com.tencent.mm.plugin.finder.convert.sk(new com.tencent.mm.plugin.finder.feed.f10(r10Var));
        }
        hc2.l.a(r10Var.f108865i, intValue);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }
}
