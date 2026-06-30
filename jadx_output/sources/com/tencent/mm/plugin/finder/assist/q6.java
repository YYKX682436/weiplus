package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f102485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f102486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(ya2.b2 b2Var, com.tencent.mm.ui.MMActivity mMActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f102485d = b2Var;
        this.f102486e = mMActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.assist.q6(this.f102485d, this.f102486e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.assist.q6 q6Var = (com.tencent.mm.plugin.finder.assist.q6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ot0.q qVar = new ot0.q();
        zy2.h hVar = new zy2.h();
        ya2.b2 b2Var = this.f102485d;
        hVar.m(b2Var.D0());
        java.lang.String z07 = b2Var.z0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hVar.l(z07);
        hVar.j(b2Var.y0());
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = b2Var.field_authInfo;
        hVar.h(finderAuthInfo != null ? finderAuthInfo.getAuthIconType() : 0);
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2 = b2Var.field_authInfo;
        java.lang.String authProfession = finderAuthInfo2 != null ? finderAuthInfo2.getAuthProfession() : null;
        if (authProfession == null) {
            authProfession = "";
        }
        hVar.i(authProfession);
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo3 = b2Var.field_authInfo;
        java.lang.String authIconUrl = finderAuthInfo3 != null ? finderAuthInfo3.getAuthIconUrl() : null;
        hVar.f477397h = authIconUrl != null ? authIconUrl : "";
        hVar.k(1);
        qVar.f(hVar);
        qVar.f348666i = 105;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 35);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("content_type_forward_to_wework", 8);
        j45.l.w(this.f102486e, ".ui.transmit.MsgRetransmitUI", intent, 1018, new com.tencent.mm.plugin.finder.assist.p6(b2Var));
        return jz5.f0.f302826a;
    }
}
