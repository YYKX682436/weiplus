package cl2;

/* loaded from: classes2.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f42911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f42912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.view.MMPAGView mMPAGView, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42911d = mMPAGView;
        this.f42912e = mMRoundCornerImageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cl2.a(this.f42911d, this.f42912e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cl2.a aVar = (cl2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f42911d;
        mMPAGView.g();
        mMPAGView.setVisibility(0);
        this.f42912e.setVisibility(8);
        return jz5.f0.f302826a;
    }
}
