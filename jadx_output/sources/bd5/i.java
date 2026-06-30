package bd5;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI f19438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f19439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI msgHistoryGalleryPersonRecommendUI, java.util.Set set, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19438d = msgHistoryGalleryPersonRecommendUI;
        this.f19439e = set;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bd5.i(this.f19438d, this.f19439e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bd5.i iVar = (bd5.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI.F;
        com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI msgHistoryGalleryPersonRecommendUI = this.f19438d;
        msgHistoryGalleryPersonRecommendUI.getClass();
        com.tencent.mm.ui.chatting.history.groups.q qVar = com.tencent.mm.ui.chatting.history.groups.q.f201782f;
        qVar.getClass();
        java.util.List list = com.tencent.mm.ui.chatting.history.groups.q.f201784h;
        java.lang.String str = msgHistoryGalleryPersonRecommendUI.f201812w;
        if (str == null) {
            kotlin.jvm.internal.o.o("talker");
            throw null;
        }
        java.util.Set set = this.f19439e;
        bd5.c cVar = new bd5.c(str, list, set);
        xm3.n0 n0Var = new xm3.n0();
        n0Var.f455359d = 200;
        n0Var.f455357b = false;
        xm3.t0 t0Var = new xm3.t0(new com.tencent.mm.plugin.mvvmlist.MvvmList(cVar, n0Var, msgHistoryGalleryPersonRecommendUI, null, null, 24, null), new com.tencent.mm.ui.chatting.history.groups.MsgHistoryGalleryGroup$buildItemConvertFactory$1(qVar), true);
        t0Var.f455380J = false;
        msgHistoryGalleryPersonRecommendUI.h7().setAdapter(t0Var);
        bd5.k kVar = new bd5.k(msgHistoryGalleryPersonRecommendUI);
        msgHistoryGalleryPersonRecommendUI.h7().i(kVar);
        msgHistoryGalleryPersonRecommendUI.B = kVar;
        int size = set.size();
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = msgHistoryGalleryPersonRecommendUI.W6(com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendActionBarView.class);
        if (!(W6 instanceof com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendActionBarView)) {
            W6 = null;
        }
        com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendActionBarView msgHistoryGalleryPersonRecommendActionBarView = (com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendActionBarView) W6;
        if (msgHistoryGalleryPersonRecommendActionBarView != null) {
            java.lang.String str2 = msgHistoryGalleryPersonRecommendUI.f201814y;
            if (str2 == null) {
                kotlin.jvm.internal.o.o("cropImagePath");
                throw null;
            }
            em.c2 c2Var = msgHistoryGalleryPersonRecommendActionBarView.f201807f;
            if (c2Var != null) {
                if (c2Var.f254170b == null) {
                    c2Var.f254170b = (android.widget.ImageView) c2Var.f254169a.findViewById(com.tencent.mm.R.id.a_4);
                }
                android.widget.ImageView imageView = c2Var.f254170b;
                kotlin.jvm.internal.o.f(imageView, "getAvatarIv(...)");
                int h17 = i65.a.h(msgHistoryGalleryPersonRecommendActionBarView.getContext(), com.tencent.mm.R.dimen.f479649bo);
                gk0.k kVar2 = new gk0.k(h17, h17);
                kVar2.f272434e = com.tencent.mm.R.color.f478490b;
                ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ai(imageView, str2, kVar2);
                em.c2 c2Var2 = msgHistoryGalleryPersonRecommendActionBarView.f201807f;
                if (c2Var2 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                if (c2Var2.f254171c == null) {
                    c2Var2.f254171c = (android.widget.TextView) c2Var2.f254169a.findViewById(com.tencent.mm.R.id.cut);
                }
                c2Var2.f254171c.setText(msgHistoryGalleryPersonRecommendActionBarView.getContext().getString(com.tencent.mm.R.string.pbt, java.lang.Integer.valueOf(size)));
            }
        }
        return jz5.f0.f302826a;
    }
}
