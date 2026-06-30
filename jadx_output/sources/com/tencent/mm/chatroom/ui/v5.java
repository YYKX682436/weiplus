package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class v5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f64594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xy f64595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f64597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(r45.xy xyVar, com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f64595e = xyVar;
        this.f64596f = roomAccessVerifyApplicationByQrOrInvitationUI;
        this.f64597g = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.chatroom.ui.v5(this.f64595e, this.f64596f, this.f64597g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.chatroom.ui.v5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f64594d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.rs5 rs5Var = new r45.rs5();
            rs5Var.f385175d = this.f64595e.f390589d;
            com.tencent.mm.chatroom.ui.u6 u6Var = com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI.f63828i;
            rs5Var.f385176e = this.f64596f.U6();
            rs5Var.f385177f = 1;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 700;
            lVar.f70666c = "/cgi-bin/micromsg-bin/revokechatroomqrcode";
            lVar.f70664a = rs5Var;
            lVar.f70665b = new r45.ss5();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f64594d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.chatroom.ui.u5 u5Var = new com.tencent.mm.chatroom.ui.u5(this.f64597g, (com.tencent.mm.modelbase.f) obj, null);
        this.f64594d = 2;
        if (kotlinx.coroutines.l.g(g3Var, u5Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
