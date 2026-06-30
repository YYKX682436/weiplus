package df2;

/* loaded from: classes3.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f312160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.p3 f312161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(android.graphics.RectF rectF, df2.p3 p3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312160e = rectF;
        this.f312161f = p3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        df2.l3 l3Var = new df2.l3(this.f312160e, this.f312161f, interfaceC29045xdcb5ca57);
        l3Var.f312159d = obj;
        return l3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.l3 l3Var = (df2.l3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        l3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.z0.g((p3325xe03a0797.p3326xc267989b.y0) this.f312159d);
        float centerY = this.f312160e.centerY();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
        int a17 = e8Var.a();
        df2.p3 p3Var = this.f312161f;
        int i17 = (a17 - p3Var.f312565p) / 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "start Anim centerY: " + centerY + " targetCenterY: " + i17);
        float f17 = (float) i17;
        if (centerY > f17) {
            p3Var.f312564o = f17 - centerY;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "resetanimTranslationY animTranslationY: " + p3Var.f312564o + " target: " + (e8Var.a() - p3Var.f312565p));
            float abs = java.lang.Math.abs(p3Var.f312564o);
            int i18 = p3Var.f312565p;
            if (abs > i18) {
                p3Var.f312564o = -i18;
            }
            android.view.View a76 = p3Var.a7();
            if (a76 != null && (animate = a76.animate()) != null && (translationY = animate.translationY(p3Var.f312564o)) != null && (duration = translationY.setDuration(240L)) != null) {
                duration.start();
            }
        }
        return jz5.f0.f384359a;
    }
}
