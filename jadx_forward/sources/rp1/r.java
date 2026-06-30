package rp1;

/* loaded from: classes13.dex */
public final class r implements rp1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f480050a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7) {
        this.f480050a = c12917x19ac03e7;
    }

    @Override // rp1.p0
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12914xc9f89b34 m54100xd0aac668;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12914xc9f89b34 m54100xd0aac6682;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f480050a;
        if (!((c12917x19ac03e7.f174952d & 32) != 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallViewV2", "onIdleStateChange isIdle: " + z17 + " background and ignore");
            c12917x19ac03e7.S = z17;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewV2", "onIdleStateChange isIdle: " + z17 + ", last: " + c12917x19ac03e7.S);
        if (z17 && !c12917x19ac03e7.S) {
            m54100xd0aac6682 = c12917x19ac03e7.m54100xd0aac668();
            if (m54100xd0aac6682 != null) {
                float alpha2 = m54100xd0aac6682.getAlpha();
                qp1.g0.a(m54100xd0aac6682);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(alpha2));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m54100xd0aac6682, arrayList.toArray(), "com/tencent/mm/plugin/ball/util/FloatBallViewUtils", "animateAlpha", "(Landroid/view/View;FFJ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                m54100xd0aac6682.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(m54100xd0aac6682, "com/tencent/mm/plugin/ball/util/FloatBallViewUtils", "animateAlpha", "(Landroid/view/View;FFJ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.ViewPropertyAnimator animate = m54100xd0aac6682.animate();
                if (animate != null && (alpha = animate.alpha(0.4f)) != null && (duration = alpha.setDuration(100L)) != null && (interpolator = duration.setInterpolator(new android.view.animation.LinearInterpolator())) != null) {
                    interpolator.start();
                }
            }
        } else if (z17) {
            m54100xd0aac668 = c12917x19ac03e7.m54100xd0aac668();
            qp1.g0.a(m54100xd0aac668);
            c12917x19ac03e7.Q(0.4f);
        }
        c12917x19ac03e7.S = z17;
    }
}
