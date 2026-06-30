package bg2;

/* loaded from: classes2.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kr0 f20551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f20552g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(bg2.z3 z3Var, r45.kr0 kr0Var, android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20550e = z3Var;
        this.f20551f = kr0Var;
        this.f20552g = viewGroup;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.u3(this.f20550e, this.f20551f, this.f20552g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.u3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.ViewGroup viewGroup;
        r45.kr0 kr0Var;
        int i17;
        r45.bg6 bg6Var;
        android.view.ViewGroup viewGroup2;
        r45.bg6 bg6Var2;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator withEndAction;
        android.view.ViewPropertyAnimator animate4;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f20549d;
        r45.kr0 kr0Var2 = this.f20551f;
        bg2.z3 z3Var = this.f20550e;
        int i19 = 0;
        android.view.ViewGroup viewGroup3 = this.f20552g;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            viewGroup = viewGroup3;
            long c17 = c01.id.c() - z3Var.f20697r;
            if (kr0Var2 == null || (bg6Var = (r45.bg6) kr0Var2.getCustom(5)) == null) {
                kr0Var = kr0Var2;
                i17 = 0;
            } else {
                i17 = bg6Var.getInteger(0);
                kr0Var = kr0Var2;
            }
            long j17 = i17 * 1000;
            com.tencent.mars.xlog.Log.i("LiveConvertShoppingPromoteController", "start job, delayShowMs:" + j17 + ", elapseTime:" + c17);
            long j18 = j17 - c17;
            if (j18 > 0) {
                this.f20549d = 1;
                if (kotlinx.coroutines.k1.b(j18, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i18 != 1) {
                if (i18 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                viewGroup2 = viewGroup3;
                com.tencent.mars.xlog.Log.i("LiveConvertShoppingPromoteController", "gone 5");
                if (viewGroup2 != null && (animate4 = viewGroup2.animate()) != null) {
                    animate4.cancel();
                }
                if (viewGroup2 != null && (animate3 = viewGroup2.animate()) != null && (alpha2 = animate3.alpha(0.0f)) != null && (duration2 = alpha2.setDuration(300L)) != null && (withEndAction = duration2.withEndAction(new bg2.t3(viewGroup2))) != null) {
                    withEndAction.start();
                }
                z3Var.f20705z = true;
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            viewGroup = viewGroup3;
            kr0Var = kr0Var2;
        }
        com.tencent.mars.xlog.Log.i("LiveConvertShoppingPromoteController", "show 5");
        viewGroup2 = viewGroup;
        if (viewGroup != null) {
            viewGroup2.setVisibility(0);
        }
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(0.0f);
        }
        if (viewGroup2 != null && (animate2 = viewGroup2.animate()) != null) {
            animate2.cancel();
        }
        if (viewGroup2 != null && (animate = viewGroup2.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(300L)) != null) {
            duration.start();
        }
        if (kr0Var != null && (bg6Var2 = (r45.bg6) kr0Var.getCustom(5)) != null) {
            i19 = bg6Var2.getInteger(1);
        }
        long j19 = i19 * 1000;
        if (j19 > 0) {
            this.f20549d = 2;
            if (kotlinx.coroutines.k1.b(j19, this) == aVar) {
                return aVar;
            }
            com.tencent.mars.xlog.Log.i("LiveConvertShoppingPromoteController", "gone 5");
            if (viewGroup2 != null) {
                animate4.cancel();
            }
            if (viewGroup2 != null) {
                withEndAction.start();
            }
            z3Var.f20705z = true;
        }
        return jz5.f0.f302826a;
    }
}
