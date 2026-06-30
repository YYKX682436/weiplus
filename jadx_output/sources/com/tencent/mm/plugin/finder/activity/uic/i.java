package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.o f101890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.activity.uic.o oVar) {
        super(1);
        this.f101890d = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [jz5.f0, java.lang.Object] */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.e21 e21Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        kotlin.jvm.internal.o.g((java.lang.String) obj, "<anonymous parameter 0>");
        com.tencent.mm.plugin.finder.activity.uic.o oVar = this.f101890d;
        r45.r03 r03Var = (r45.r03) oVar.f452719d;
        ?? r86 = jz5.f0.f302826a;
        if (r03Var != null && (e21Var = (r45.e21) r03Var.getCustom(16)) != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) e21Var.getCustom(19)) != null) {
            android.app.Activity context = oVar.getContext();
            long j17 = oVar.T;
            r45.r03 r03Var2 = (r45.r03) oVar.f452719d;
            oVar.W6(context, j17, r03Var2 != null ? (r45.e21) r03Var2.getCustom(16) : null, finderJumpInfo, "feed_jumpicon");
            r1 = r86;
        }
        if (r1 == null) {
            com.tencent.mm.plugin.finder.activity.uic.o.V6(oVar);
        }
        return r86;
    }
}
