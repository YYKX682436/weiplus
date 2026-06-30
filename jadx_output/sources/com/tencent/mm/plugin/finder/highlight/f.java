package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f111430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f111431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f111431e = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.highlight.f(this.f111431e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.highlight.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f111430d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.H;
            this.f111430d = 1;
            obj = sVar.f(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.rfx.RfxPagFile rfxPagFile = (com.tencent.mm.rfx.RfxPagFile) obj;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f111431e;
        mMPAGView.setRepeatCount(0);
        if (rfxPagFile != null) {
            mMPAGView.setComposition(rfxPagFile);
        }
        if (mMPAGView.getVisibility() == 0) {
            mMPAGView.g();
        }
        return jz5.f0.f302826a;
    }
}
