package mx0;

/* loaded from: classes5.dex */
public final class z2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 f413996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f413997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f413998f;

    public z2(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303, boolean z17, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f413996d = c10973x5ab09303;
        this.f413997e = z17;
        this.f413998f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButton", "outerView ani end");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303 = this.f413996d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10974x13de43d3 c10974x13de43d3 = c10973x5ab09303.f151038h;
        if (c10974x13de43d3 != null) {
            c10974x13de43d3.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startProgress ");
        sb6.append(c10973x5ab09303.f151051x);
        sb6.append(", ");
        sb6.append(c10973x5ab09303.f151052y);
        sb6.append(", ");
        sb6.append(c10973x5ab09303.isEnabled());
        sb6.append(", ");
        boolean z17 = this.f413997e;
        sb6.append(z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RecordButton", sb6.toString(), new java.lang.Object[0]);
        if (c10973x5ab09303.f151043p) {
            c10973x5ab09303.f151053z = java.lang.System.currentTimeMillis();
            if (z17) {
                mx0.a0 a0Var = c10973x5ab09303.f151039i;
                if (a0Var != null) {
                    ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) ((mx0.e3) a0Var).f413476a.f413524e).q0();
                }
            } else {
                mx0.a0 a0Var2 = c10973x5ab09303.f151039i;
                if (a0Var2 != null) {
                    ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) ((mx0.e3) a0Var2).f413476a.f413524e).q0();
                }
            }
            c10973x5ab09303.f151044q = true;
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10975xd53de684 c10975xd53de684 = c10973x5ab09303.f151037g;
            if (c10975xd53de684 != null) {
                c10975xd53de684.setVisibility(c10973x5ab09303.F ? 0 : 8);
            }
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10975xd53de684 c10975xd53de6842 = c10973x5ab09303.f151037g;
            if (c10975xd53de6842 != null) {
                c10975xd53de6842.f151067m = 0.0f;
                c10975xd53de6842.invalidate();
            }
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10975xd53de684 c10975xd53de6843 = c10973x5ab09303.f151037g;
            if (c10975xd53de6843 != null) {
                int i17 = c10973x5ab09303.f151051x;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButtonCircularProgressBar", "setInitData >> " + i17 + ", " + c10973x5ab09303.f151052y);
                c10975xd53de6843.f151068n = (float) i17;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordButton", "startProgress but is enable, is cancel");
        }
        this.f413998f.setListener(null);
    }
}
