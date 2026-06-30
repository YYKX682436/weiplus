package bm2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f21991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f21992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.i f21993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.m f21994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f21995h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.view.MMPAGView mMPAGView, bm2.i iVar, bm2.m mVar, dk2.vg vgVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f21992e = mMPAGView;
        this.f21993f = iVar;
        this.f21994g = mVar;
        this.f21995h = vgVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bm2.j(this.f21992e, this.f21993f, this.f21994g, this.f21995h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f21991d;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f21992e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.N;
            this.f21991d = 1;
            if (sVar.d(hVar, mMPAGView, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bm2.i iVar = this.f21993f;
        iVar.f21962n = true;
        android.view.View view = iVar.f21961m;
        kotlin.jvm.internal.o.f(view, "<get-playingBg>(...)");
        this.f21994g.I(mMPAGView, view, this.f21995h.f234255b);
        return jz5.f0.f302826a;
    }
}
