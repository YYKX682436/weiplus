package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class m6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f102384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f102385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f102386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(ya2.b2 b2Var, com.tencent.mm.ui.MMActivity mMActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f102385e = b2Var;
        this.f102386f = mMActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.assist.m6(this.f102385e, this.f102386f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.assist.m6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f102384d;
        ya2.b2 b2Var = this.f102385e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            java.lang.String D0 = b2Var.D0();
            this.f102384d = 1;
            obj = ((com.tencent.mm.feature.finder.live.t6) b1Var).Ni(r17, 4, D0, 0L, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.ui.MMActivity activity = this.f102386f;
        kotlin.jvm.internal.o.g(activity, "activity");
        int i18 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n;
        ot0.q qVar = new ot0.q();
        zy2.h hVar = new zy2.h();
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
        kotlin.jvm.internal.o.g(str, "<set-?>");
        hVar.f477398i = str;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) pf5.z.f353948a.a(activity).c(zy2.v9.class))).Q6(hVar.f477391b);
        qVar.f(hVar);
        qVar.f348666i = 50;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 20);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("content_type_forward_to_wework", 8);
        j45.l.w(activity, ".ui.transmit.MsgRetransmitUI", intent, 1003, new com.tencent.mm.plugin.finder.assist.l6(b2Var, i18));
        return jz5.f0.f302826a;
    }
}
