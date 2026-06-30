package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class r5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f64476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in.b f64478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f64479g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64480h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64481i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(java.lang.String str, in.b bVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.chatroom.ui.x5 x5Var, com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f64477e = str;
        this.f64478f = bVar;
        this.f64479g = u3Var;
        this.f64480h = x5Var;
        this.f64481i = roomAccessVerifyApplicationByQrOrInvitationUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.chatroom.ui.r5(this.f64477e, this.f64478f, this.f64479g, this.f64480h, this.f64481i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.chatroom.ui.r5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f64476d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.wc3 wc3Var = new r45.wc3();
            wc3Var.f389064d = this.f64477e;
            java.lang.String str = this.f64478f.f292718d.f292728n;
            com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "GetChatRoomQRCodeStatus " + wc3Var.f389064d + ", " + str);
            wc3Var.f389065e.add(str);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 20039;
            lVar.f70666c = "/cgi-bin/micromsg-bin/getchatroomqrcodestatus";
            lVar.f70664a = wc3Var;
            lVar.f70665b = new r45.xc3();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f64476d = 1;
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
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.chatroom.ui.q5 q5Var = new com.tencent.mm.chatroom.ui.q5(this.f64479g, fVar, this.f64478f, this.f64480h, this.f64481i, this.f64477e, null);
        this.f64476d = 2;
        if (kotlinx.coroutines.l.g(g3Var, q5Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
