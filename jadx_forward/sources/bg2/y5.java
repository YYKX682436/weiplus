package bg2;

/* loaded from: classes2.dex */
public final class y5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f102205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102206e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(bg2.q6 q6Var, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f102205d = q6Var;
        this.f102206e = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.y5(this.f102205d, this.f102206e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.y5 y5Var = (bg2.y5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1496x373aa5.C14214xfa60143c c14214xfa60143c;
        android.content.Context context;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bg2.q6 q6Var = this.f102205d;
        in5.s0 s0Var = q6Var.f498674d.f498682i;
        if (s0Var == null || (context = s0Var.f374654e) == null) {
            c14214xfa60143c = null;
        } else {
            c14214xfa60143c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1496x373aa5.C14214xfa60143c(context);
            c14214xfa60143c.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lod);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            c14214xfa60143c.m56821x53bfe316(string);
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.loc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            c14214xfa60143c.m56817x76492e13(string2);
            c14214xfa60143c.m56818xe8299f09(new bg2.v5(q6Var, c14214xfa60143c, context));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1496x373aa5.C14214xfa60143c c14214xfa60143c2 = c14214xfa60143c;
        if (c14214xfa60143c2 != null) {
            q6Var.getClass();
            android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, ((java.lang.Number) ((jz5.n) q6Var.f101950i).mo141623x754a37bb()).intValue(), 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            android.view.animation.AnimationSet animationSet2 = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(300L);
            animationSet2.addAnimation(alphaAnimation2);
            bg2.r4 r4Var = new bg2.r4(c14214xfa60143c2, animationSet, animationSet2, q6Var.f101949h, new bg2.x5(q6Var, this.f102206e));
            bg2.a5 a5Var = (bg2.a5) q6Var.N6(bg2.a5.class);
            if (a5Var != null) {
                a5Var.e7(r4Var);
            }
            q6Var.f101951m = true;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.G2, kz5.c1.l(new jz5.l("liveId", bg2.q6.Z6(q6Var)), new jz5.l("feedId", bg2.q6.Y6(q6Var)), new jz5.l("panel_sence", "1")), null, null, null, null, false, 124, null);
        }
        return jz5.f0.f384359a;
    }
}
