package cn2;

/* loaded from: classes3.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f125164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cn2.k f125165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f125166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cn2.c0 f125167g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(cn2.k kVar, android.view.View view, cn2.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f125165e = kVar;
        this.f125166f = view;
        this.f125167g = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cn2.x(this.f125165e, this.f125166f, this.f125167g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cn2.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f125164d;
        cn2.k kVar = this.f125165e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = kVar.f125095f.f125056b;
            this.f125164d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue());
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.System.out.print((java.lang.Object) "\t大R:step1-1 begin scaleInAnim!");
        java.lang.Object parent = this.f125166f.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view == null) {
            return null;
        }
        long j18 = kVar.f125095f.f125057c;
        this.f125164d = 2;
        this.f125167g.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
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
