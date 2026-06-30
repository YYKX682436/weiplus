package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f111035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderCommentInfo f111036f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.tencent.mm.plugin.finder.feed.a7 a7Var, int i17, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo) {
        super(4);
        this.f111034d = a7Var;
        this.f111035e = i17;
        this.f111036f = finderCommentInfo;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.ty0 ty0Var = (r45.ty0) obj4;
        if (intValue == 0 && intValue2 == 0) {
            com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f111034d;
            com.tencent.mm.plugin.finder.feed.a7.s(a7Var, ty0Var);
            android.content.Context context = a7Var.f106207d;
            if (hc2.t.d(context) && (i17 = this.f111035e) == 1 && !kotlin.jvm.internal.o.b(this.f111036f.getUsername(), a7Var.e0(context, i17))) {
                com.tencent.mm.plugin.finder.feed.a7.s(a7Var, ty0Var);
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.a(context, 2);
            }
        }
        return jz5.f0.f302826a;
    }
}
