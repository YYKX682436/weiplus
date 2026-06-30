package df2;

/* loaded from: classes3.dex */
public final class dt extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f311534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(df2.lt ltVar, android.view.ViewGroup viewGroup, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311533d = ltVar;
        this.f311534e = viewGroup;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.dt(this.f311533d, this.f311534e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.dt dtVar = (df2.dt) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dtVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.Context context;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df2.lt ltVar = this.f311533d;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = ltVar.E;
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setVisibility(0);
        }
        android.view.ViewGroup viewGroup = ltVar.f312237J;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            int i17 = context.getResources().getDisplayMetrics().widthPixels;
            float b17 = i65.a.b(context, 414);
            float f17 = i17;
            float f18 = (b17 <= f17 || b17 <= 0.0f || f17 <= 0.0f) ? 1.0f : f17 / b17;
            java.lang.String str = df2.lt.W;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "scale " + f18 + ", " + i17 + ", " + b17);
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.5f, f18).setDuration(300L);
            duration.addUpdateListener(new df2.ct(this.f311534e));
            ltVar.R = duration;
            duration.setInterpolator(new android.view.animation.OvershootInterpolator());
            android.animation.ValueAnimator valueAnimator = ltVar.R;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
        return jz5.f0.f384359a;
    }
}
