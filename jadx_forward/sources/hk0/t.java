package hk0;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk0.v f363338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk0.b1 f363339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(hk0.v vVar, hk0.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363338d = vVar;
        this.f363339e = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hk0.t(this.f363338d, this.f363339e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hk0.t tVar = (hk0.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        tVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        hk0.v vVar = this.f363338d;
        vVar.f363363d = false;
        android.animation.ValueAnimator valueAnimator = vVar.f363362c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        vVar.f363362c = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        android.animation.ValueAnimator valueAnimator2 = vVar.f363362c;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new hk0.r(this.f363339e));
        }
        android.animation.ValueAnimator valueAnimator3 = vVar.f363362c;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new hk0.s());
        }
        android.animation.ValueAnimator valueAnimator4 = vVar.f363362c;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(200L);
        }
        android.animation.ValueAnimator valueAnimator5 = vVar.f363362c;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        return jz5.f0.f384359a;
    }
}
