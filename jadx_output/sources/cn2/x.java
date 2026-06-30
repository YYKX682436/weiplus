package cn2;

/* loaded from: classes3.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f43631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cn2.k f43632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f43633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cn2.c0 f43634g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(cn2.k kVar, android.view.View view, cn2.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f43632e = kVar;
        this.f43633f = view;
        this.f43634g = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cn2.x(this.f43632e, this.f43633f, this.f43634g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cn2.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f43631d;
        cn2.k kVar = this.f43632e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = kVar.f43562f.f43523b;
            this.f43631d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue());
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.System.out.print((java.lang.Object) "\t大R:step1-1 begin scaleInAnim!");
        java.lang.Object parent = this.f43633f.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view == null) {
            return null;
        }
        long j18 = kVar.f43562f.f43524c;
        this.f43631d = 2;
        this.f43634g.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        animatorSet.setDuration(150L);
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.16f), android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.16f));
        animatorSet.setDuration(j18);
        animatorSet.addListener(new cn2.u(c0Var, nVar));
        animatorSet.start();
        obj = nVar.a();
        if (obj == aVar) {
            return aVar;
        }
        return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue());
    }
}
