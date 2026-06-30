package df2;

/* loaded from: classes2.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.e6 f312369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312370f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(df2.e6 e6Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312369e = e6Var;
        this.f312370f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.n6(this.f312369e, this.f312370f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.n6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312368d;
        df2.e6 e6Var = this.f312369e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            e6Var.f311570d.setText(this.f312370f);
            this.f312368d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(833L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                animate = e6Var.f311570d.animate();
                if (animate != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(500L)) != null) {
                    duration.start();
                }
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        e6Var.f311570d.setVisibility(0);
        e6Var.f311570d.setAlpha(1.0f);
        this.f312368d = 2;
        if (p3325xe03a0797.p3326xc267989b.k1.b(1292L, this) == aVar) {
            return aVar;
        }
        animate = e6Var.f311570d.animate();
        if (animate != null) {
            duration.start();
        }
        return jz5.f0.f384359a;
    }
}
