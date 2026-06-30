package f12;

/* loaded from: classes4.dex */
public final class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f340132e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79, long j17) {
        this.f340131d = activityC13254xf536ee79;
        this.f340132e = j17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340131d;
        f12.c0 c0Var = activityC13254xf536ee79.f178973f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var.f340106b.setVisibility(8);
        f12.c0 c0Var2 = activityC13254xf536ee79.f178973f;
        if (c0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var2.f340106b.y();
        f12.c0 c0Var3 = activityC13254xf536ee79.f178973f;
        if (c0Var3 != null) {
            c0Var3.f340106b.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340131d;
        f12.c0 c0Var = activityC13254xf536ee79.f178973f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var.f340106b.setVisibility(8);
        f12.c0 c0Var2 = activityC13254xf536ee79.f178973f;
        if (c0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var2.f340106b.y();
        f12.c0 c0Var3 = activityC13254xf536ee79.f178973f;
        if (c0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var3.f340106b.setVisibility(8);
        uq.n nVar = (uq.n) activityC13254xf536ee79.X6().f340160q.mo3195x754a37bb();
        if (nVar != null && (str = nVar.f511700o) != null) {
            if (str.length() > 0) {
                f12.c0 c0Var4 = activityC13254xf536ee79.f178973f;
                if (c0Var4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                    throw null;
                }
                c0Var4.f340108d.setText(str);
            }
        }
        if (activityC13254xf536ee79.X6().f340158o.mo3195x754a37bb() != null) {
            f12.c0 c0Var5 = activityC13254xf536ee79.f178973f;
            if (c0Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            c0Var5.f340107c.setVisibility(0);
        } else {
            f12.c0 c0Var6 = activityC13254xf536ee79.f178973f;
            if (c0Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            c0Var6.f340107c.setVisibility(4);
        }
        uq.n nVar2 = (uq.n) activityC13254xf536ee79.X6().f340160q.mo3195x754a37bb();
        long j17 = nVar2 != null ? nVar2.f511706u : 0L;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f340132e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringEggRpt", "18916 eggRpt: " + b12.k.f98600h + ", 15, sessionId " + b12.k.f98597e + ", materialId " + j17 + " , appId " + b12.k.f98599g + ", timeMs: " + currentTimeMillis);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18916, b12.k.f98597e, "", 15, java.lang.Long.valueOf(currentTimeMillis), "", "", "", "", b12.k.f98599g, java.lang.Long.valueOf(j17), 0, 0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        f12.c0 c0Var = this.f340131d.f178973f;
        if (c0Var != null) {
            c0Var.f340116l.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
    }
}
