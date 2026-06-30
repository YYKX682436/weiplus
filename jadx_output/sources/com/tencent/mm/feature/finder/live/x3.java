package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f67033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f67034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f67035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f67036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f67037h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(yl2.g1 g1Var, android.app.Activity activity, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f67034e = g1Var;
        this.f67035f = activity;
        this.f67036g = z17;
        this.f67037h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.finder.live.x3(this.f67034e, this.f67035f, this.f67036g, this.f67037h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.finder.live.x3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f67033d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yl2.g1 g1Var = this.f67034e;
            this.f67033d = 1;
            obj = yl2.g1.t(g1Var, null, false, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "goToAnchorLiveDirect failed, errCode:" + ((yl2.x) a0Var).f463081a);
        } else {
            boolean z17 = a0Var instanceof yl2.z;
            yl2.g1 g1Var2 = this.f67034e;
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "goToAnchorLiveDirect continueLive");
                g1Var2.d(((yl2.z) a0Var).f463087a);
            } else if (a0Var instanceof yl2.y) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "goToAnchorLiveDirect success");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("FunctionGuideAction", ((com.tencent.mm.ui.MMFragmentActivity) this.f67035f).getIntent().getIntExtra("FunctionGuideAction", 0));
                g1Var2.h(intent, ((yl2.y) a0Var).f463083a, this.f67036g);
            }
        }
        this.f67037h.invoke();
        return jz5.f0.f302826a;
    }
}
