package k84;

/* loaded from: classes3.dex */
public final class o0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f386685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f386686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f386687f;

    public o0(k84.q1 q1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17) {
        this.f386685d = q1Var;
        this.f386686e = h0Var;
        this.f386687f = i17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.ViewGroup J2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startAnim$1$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$startAnim$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent == null) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$startAnim$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startAnim$1$3");
            return true;
        }
        int action = motionEvent.getAction();
        int i17 = this.f386687f;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f386686e;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = null;
        k84.q1 q1Var = this.f386685d;
        if (action == 0) {
            k84.l lVar = k84.q1.Y;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$cancelBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            q1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q1Var.j(), "cancelBreezeAnim");
            android.animation.ValueAnimator valueAnimator = q1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.view.ViewGroup I = q1Var.I();
            if (I != null) {
                I.setScaleX(1.0f);
            }
            android.view.ViewGroup I2 = q1Var.I();
            if (I2 != null) {
                I2.setScaleY(1.0f);
            }
            android.view.ViewGroup H = q1Var.H();
            if (H != null) {
                H.setScaleX(1.0f);
            }
            android.view.ViewGroup H2 = q1Var.H();
            if (H2 != null) {
                H2.setScaleY(1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$cancelBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = (p3325xe03a0797.p3326xc267989b.r2) h0Var.f391656d;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            android.view.ViewGroup J3 = q1Var.J();
            if (J3 != null) {
                J3.setScaleX(0.95f);
            }
            android.view.ViewGroup J4 = q1Var.J();
            if (J4 != null) {
                J4.setScaleY(0.95f);
            }
            android.view.ViewGroup H3 = q1Var.H();
            if (H3 != null) {
                H3.setBackground(new android.graphics.drawable.ColorDrawable(e3.b.c(i17, -16777216, 0.15f)));
            }
            android.view.ViewGroup I3 = q1Var.I();
            if (I3 != null) {
                I3.setBackground(null);
            }
        } else if (action == 1 || action == 3) {
            android.view.ViewGroup J5 = q1Var.J();
            if (J5 != null) {
                J5.setScaleX(1.0f);
            }
            android.view.ViewGroup J6 = q1Var.J();
            if (J6 != null) {
                J6.setScaleY(1.0f);
            }
            android.view.ViewGroup H4 = q1Var.H();
            if (H4 != null) {
                H4.setBackground(new android.graphics.drawable.ColorDrawable(i17));
            }
            android.view.ViewGroup I4 = q1Var.I();
            if (I4 != null) {
                I4.setBackground(new android.graphics.drawable.ColorDrawable(e3.b.i(i17, 38)));
            }
            if (motionEvent.getAction() == 1 && (J2 = q1Var.J()) != null) {
                J2.performClick();
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var3 = (p3325xe03a0797.p3326xc267989b.r2) h0Var.f391656d;
            if (r2Var3 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.y0 h17 = q1Var.h();
            if (h17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                p3325xe03a0797.p3326xc267989b.r0 r0Var = q1Var.f386732t;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                r2Var = p3325xe03a0797.p3326xc267989b.l.d(h17, r0Var, null, new k84.n0(q1Var, null), 2, null);
            }
            h0Var.f391656d = r2Var;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$startAnim$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startAnim$1$3");
        return true;
    }
}
