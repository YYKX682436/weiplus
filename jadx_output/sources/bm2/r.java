package bm2;

/* loaded from: classes3.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f22259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f22260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.p f22261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.t f22262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f22263h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.view.MMPAGView mMPAGView, bm2.p pVar, bm2.t tVar, dk2.vg vgVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f22260e = mMPAGView;
        this.f22261f = pVar;
        this.f22262g = tVar;
        this.f22263h = vgVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bm2.r(this.f22260e, this.f22261f, this.f22262g, this.f22263h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f22259d;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f22260e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.N;
            this.f22259d = 1;
            if (sVar.d(hVar, mMPAGView, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bm2.p pVar = this.f22261f;
        pVar.f22215n = true;
        android.view.View view = pVar.f22214m;
        kotlin.jvm.internal.o.f(view, "<get-playingBg>(...)");
        this.f22262g.J(mMPAGView, view, this.f22263h.f234255b);
        return jz5.f0.f302826a;
    }
}
