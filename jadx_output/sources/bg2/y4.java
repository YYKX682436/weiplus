package bg2;

/* loaded from: classes2.dex */
public final class y4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.a5 f20670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.r4 f20671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(bg2.a5 a5Var, bg2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20670e = a5Var;
        this.f20671f = r4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.y4(this.f20670e, this.f20671f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.y4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20669d;
        bg2.a5 a5Var = this.f20670e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f20669d = 1;
            obj = bg2.a5.Y6(a5Var, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            a5Var.d7();
        }
        bg2.r4 r4Var = this.f20671f;
        if (r4Var.f20458b.hasStarted()) {
            com.tencent.mars.xlog.Log.i(a5Var.f19918e, "[toastViewIn] view:" + r4Var.f20457a + " has started in anim.");
        } else {
            com.tencent.mars.xlog.Log.i(a5Var.f19918e, "[toastViewIn] view:" + r4Var.f20457a);
            android.view.ViewGroup Z6 = a5Var.Z6();
            if (Z6 != null) {
                Z6.setVisibility(0);
            }
            android.view.ViewGroup Z62 = a5Var.Z6();
            if (Z62 != null) {
                Z62.addView(r4Var.f20457a);
            }
            r4Var.f20458b.setAnimationListener(new bg2.t4(a5Var, r4Var));
            r4Var.f20457a.startAnimation(r4Var.f20458b);
        }
        return jz5.f0.f302826a;
    }
}
