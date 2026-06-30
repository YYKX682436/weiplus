package bg2;

/* loaded from: classes2.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f102082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f102083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kr0 f102084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f102085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(bg2.z3 z3Var, r45.kr0 kr0Var, android.view.ViewGroup viewGroup, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f102083e = z3Var;
        this.f102084f = kr0Var;
        this.f102085g = viewGroup;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.u3(this.f102083e, this.f102084f, this.f102085g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.u3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
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
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f102082d;
        r45.kr0 kr0Var2 = this.f102084f;
        bg2.z3 z3Var = this.f102083e;
        int i19 = 0;
        android.view.ViewGroup viewGroup3 = this.f102085g;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            viewGroup = viewGroup3;
            long c17 = c01.id.c() - z3Var.f102230r;
            if (kr0Var2 == null || (bg6Var = (r45.bg6) kr0Var2.m75936x14adae67(5)) == null) {
                kr0Var = kr0Var2;
                i17 = 0;
            } else {
                i17 = bg6Var.m75939xb282bd08(0);
                kr0Var = kr0Var2;
            }
            long j17 = i17 * 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertShoppingPromoteController", "start job, delayShowMs:" + j17 + ", elapseTime:" + c17);
            long j18 = j17 - c17;
            if (j18 > 0) {
                this.f102082d = 1;
                if (p3325xe03a0797.p3326xc267989b.k1.b(j18, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i18 != 1) {
                if (i18 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                viewGroup2 = viewGroup3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertShoppingPromoteController", "gone 5");
                if (viewGroup2 != null && (animate4 = viewGroup2.animate()) != null) {
                    animate4.cancel();
                }
                if (viewGroup2 != null && (animate3 = viewGroup2.animate()) != null && (alpha2 = animate3.alpha(0.0f)) != null && (duration2 = alpha2.setDuration(300L)) != null && (withEndAction = duration2.withEndAction(new bg2.t3(viewGroup2))) != null) {
                    withEndAction.start();
                }
                z3Var.f102238z = true;
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            viewGroup = viewGroup3;
            kr0Var = kr0Var2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertShoppingPromoteController", "show 5");
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
        if (kr0Var != null && (bg6Var2 = (r45.bg6) kr0Var.m75936x14adae67(5)) != null) {
            i19 = bg6Var2.m75939xb282bd08(1);
        }
        long j19 = i19 * 1000;
        if (j19 > 0) {
            this.f102082d = 2;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j19, this) == aVar) {
                return aVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertShoppingPromoteController", "gone 5");
            if (viewGroup2 != null) {
                animate4.cancel();
            }
            if (viewGroup2 != null) {
                withEndAction.start();
            }
            z3Var.f102238z = true;
        }
        return jz5.f0.f384359a;
    }
}
