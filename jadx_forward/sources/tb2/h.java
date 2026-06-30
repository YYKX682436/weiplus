package tb2;

/* loaded from: classes3.dex */
public final class h extends rs.k {

    /* renamed from: t, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f498510t;

    public h(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f498510t = recyclerView;
        ae2.in inVar = ae2.in.f85221a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerFadeInDownAnimator", "FINDER_LIVE_SINGLE_FEED_SET_FINISH value: " + ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85361o).mo141623x754a37bb()).r()).intValue());
    }

    @Override // rs.k
    public void E(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (k3Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = this.f498510t.m7949x5701d990();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            boolean z17 = (s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i : null) instanceof so2.h1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerFadeInDownAnimator", "animateRemoveImpl: " + k3Var.hashCode() + ' ' + k3Var.m8183xf806b362() + " originAnimate: " + h0Var.f391656d + " liveFeed: " + z17);
            if (!z17) {
                super.E(k3Var);
                return;
            }
            this.f480818q.add(k3Var);
            android.view.ViewPropertyAnimator animate = k3Var.f3639x46306858.animate();
            animate.translationY((-k3Var.f3639x46306858.getHeight()) * 1.0f);
            animate.setDuration(300L);
            animate.setInterpolator(animate.getInterpolator());
            animate.setListener(new tb2.g(k3Var, z17, this, animate, h0Var));
            animate.setStartDelay(n());
            animate.start();
        }
    }

    public final void K(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(v17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/live/RecyclerFadeInDownAnimator", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        v17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(v17, "com/tencent/mm/plugin/finder/convert/live/RecyclerFadeInDownAnimator", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        v17.setScaleY(1.0f);
        v17.setScaleX(1.0f);
        v17.setTranslationY(0.0f);
        v17.setTranslationX(0.0f);
        v17.setRotation(0.0f);
        v17.setRotationY(0.0f);
        v17.setRotationX(0.0f);
        v17.setPivotY(v17.getMeasuredHeight() / 2.0f);
        v17.setPivotX(v17.getMeasuredWidth() / 2.0f);
        v17.animate().setInterpolator(null).setStartDelay(0L);
    }
}
