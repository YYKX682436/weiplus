package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.feature.chatrecordstts.b1 b1Var) {
        super(0);
        this.f65471d = b1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "floatBall onDeleteClick");
        com.tencent.mm.feature.chatrecordstts.b1 b1Var = this.f65471d;
        b1Var.tj();
        com.tencent.mm.feature.chatrecordstts.i iVar = b1Var.f65363z;
        if (iVar != null) {
            ((cy1.a) iVar.a()).Hj("chat_hear_msg_float_unfold_close_btn", "view_clk", iVar.f65456a.f65430a, 33488);
        }
        com.tencent.mm.feature.chatrecordstts.i iVar2 = b1Var.f65363z;
        if (iVar2 != null) {
            iVar2.b(2);
        }
        return jz5.f0.f302826a;
    }
}
