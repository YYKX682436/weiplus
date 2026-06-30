package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class u5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f64570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f64571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.modelbase.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f64570d = u3Var;
        this.f64571e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.chatroom.ui.u5(this.f64570d, this.f64571e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.chatroom.ui.u5 u5Var = (com.tencent.mm.chatroom.ui.u5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f64570d.dismiss();
        if (this.f64571e.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "revoke success");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "revoke fail");
        }
        return jz5.f0.f302826a;
    }
}
