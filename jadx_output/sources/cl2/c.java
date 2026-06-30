package cl2;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f42915d;

    /* renamed from: e, reason: collision with root package name */
    public int f42916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f42918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f42919h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, com.tencent.mm.view.MMPAGView mMPAGView, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42917f = str;
        this.f42918g = mMPAGView;
        this.f42919h = mMRoundCornerImageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cl2.c(this.f42917f, this.f42918g, this.f42919h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cl2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42916e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            java.lang.String str2 = this.f42917f;
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(str2);
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            java.lang.String bj6 = ((c61.p2) ybVar).bj("banner_pag_dir", a17);
            wh2.l lVar = wh2.l.f445955a;
            this.f42915d = bj6;
            this.f42916e = 1;
            java.lang.Object a18 = lVar.a(str2, bj6, this);
            if (a18 == aVar) {
                return aVar;
            }
            str = bj6;
            obj = a18;
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            str = (java.lang.String) this.f42915d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean z17 = ((wh2.i) obj) instanceof wh2.h;
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f42919h;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f42918g;
        if (z17) {
            mMPAGView.n();
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.H));
            mMPAGView.setComposition(str);
            mMPAGView.d();
            mMPAGView.setRepeatCount(-1);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            cl2.a aVar2 = new cl2.a(mMPAGView, mMRoundCornerImageView, null);
            this.f42915d = null;
            this.f42916e = 2;
            if (kotlinx.coroutines.l.g(g3Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
            cl2.b bVar = new cl2.b(mMRoundCornerImageView, mMPAGView, null);
            this.f42915d = null;
            this.f42916e = 3;
            if (kotlinx.coroutines.l.g(g3Var2, bVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
