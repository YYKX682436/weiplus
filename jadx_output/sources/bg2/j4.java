package bg2;

/* loaded from: classes2.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.o4 f20197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(bg2.o4 o4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20197e = o4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.j4(this.f20197e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.j4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.res.AssetManager assets;
        android.content.Context context;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20196d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bg2.o4 o4Var = this.f20197e;
            com.tencent.mm.view.MMPAGView mMPAGView = o4Var.f20354h;
            if (mMPAGView != null) {
                in5.s0 s0Var = o4Var.f417141d.f417149i;
                if (s0Var == null || (context = s0Var.f293121e) == null || (assets = context.getAssets()) == null) {
                    assets = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
                }
                kotlin.jvm.internal.o.d(assets);
                mMPAGView.k(assets, "finder_feed_small_lottery_anim.pag");
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            bg2.i4 i4Var = new bg2.i4(o4Var, null);
            this.f20196d = 1;
            if (kotlinx.coroutines.l.g(g3Var, i4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
