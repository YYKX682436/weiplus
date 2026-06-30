package mi1;

/* loaded from: classes7.dex */
public final class q1 implements mi1.i2 {

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f408195h;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f408196d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f408197e;

    /* renamed from: f, reason: collision with root package name */
    public final mi1.h2 f408198f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f408199g;

    static {
        new mi1.c1(null);
        f408195h = jz5.h.b(mi1.b1.f408051d);
    }

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f408196d = runtime;
        this.f408197e = jz5.h.b(new mi1.p1(this));
        this.f408198f = new mi1.h2(0, null, 2, null);
        this.f408199g = jz5.h.b(mi1.o1.f408187d);
    }

    public static final void b(mi1.q1 q1Var) {
        q1Var.getClass();
        new mi1.k2().x(q1Var.f408196d.C0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        if (r10 == pz5.a.f440719d) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0152, code lost:
    
        if (r10 == pz5.a.f440719d) goto L60;
     */
    @Override // mi1.i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(mi1.h2 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.q1.a(mi1.h2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z17, boolean z18) {
        int i17;
        if ((this.f408198f.f408100a > 0) == true) {
            android.animation.AnimatorSet animatorSet = null;
            android.animation.ValueAnimator valueAnimator = null;
            if (!z18) {
                android.animation.Animator g17 = g(true, null);
                if (g17 != null) {
                    d(g17);
                    g17.start();
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime = this.f408196d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
            android.view.View a17 = runtime.f156354z.a(com.p314xaae8f345.mm.R.id.f564047db2);
            android.widget.LinearLayout linearLayout = a17 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) a17 : null;
            if (linearLayout != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int width = runtime.f156354z.d().getWidth() - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                if (linearLayout.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    i17 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
                } else {
                    i17 = width;
                }
                if (i17 != width) {
                    valueAnimator = android.animation.ValueAnimator.ofInt(0, width);
                    valueAnimator.addUpdateListener(new mi1.c3(linearLayout));
                }
                if (valueAnimator != null) {
                    arrayList.add(valueAnimator);
                }
                if (!z17) {
                    android.widget.ImageView m53336x6fbe8813 = runtime.f156354z.d().m53336x6fbe8813();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m53336x6fbe8813, "getButtonImage(...)");
                    arrayList.add(mi1.e3.a(m53336x6fbe8813, 300L));
                }
                animatorSet = new android.animation.AnimatorSet();
                animatorSet.playSequentially(kz5.n0.S0(arrayList));
            }
            if (animatorSet != null) {
                d(animatorSet);
                animatorSet.start();
            }
        }
    }

    public final android.animation.Animator d(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f408196d;
        mi1.j1 j1Var = new mi1.j1(animator);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c11510xdd90c2f2, "<this>");
        java.lang.String str = c11510xdd90c2f2.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        j1Var.mo146xb9724478(mVar);
        c11510xdd90c2f2.N.a(mVar);
        return animator;
    }

    public final mi1.r1 e(mi1.h2 state) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        mi1.j0 j0Var = (mi1.j0) state.f408101b;
        if (j0Var == null || (obj = j0Var.f408124g) == null || !(obj instanceof mi1.r1)) {
            return null;
        }
        return (mi1.r1) obj;
    }

    public final mi1.h2 f() {
        return (mi1.h2) ((jz5.n) this.f408199g).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator g(boolean r6, mi1.r1 r7) {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r5.f408196d
            java.lang.String r1 = "runtime"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r1)
            mi1.z0 r1 = mi1.z0.f408272e
            mi1.z0 r2 = mi1.a1.d(r0)
            r3 = 0
            if (r1 == r2) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = r3
        L13:
            r2 = 0
            if (r1 == 0) goto L19
            if (r7 == 0) goto L19
            return r2
        L19:
            mi1.v r7 = r0.f156354z
            com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton r7 = r7.d()
            android.widget.ImageView r7 = r7.m53336x6fbe8813()
            r1 = 0
            r7.setAlpha(r1)
            mi1.v r7 = r0.f156354z
            r1 = 2131296558(0x7f09012e, float:1.8211036E38)
            android.view.View r7 = r7.a(r1)
            boolean r1 = r7 instanceof android.widget.LinearLayout
            if (r1 == 0) goto L37
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            goto L38
        L37:
            r7 = r2
        L38:
            if (r7 != 0) goto L3b
            return r2
        L3b:
            mi1.v r0 = r0.f156354z
            com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton r0 = r0.d()
            int r0 = r0.getWidth()
            android.content.res.Resources r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e
            r4 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r1 = r1.getDimensionPixelSize(r4)
            int r0 = r0 - r1
            if (r6 == 0) goto L6e
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            boolean r6 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L69
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r6, r1)
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = r6.getMarginEnd()
            goto L6a
        L69:
            r6 = r3
        L6a:
            if (r6 != 0) goto L6e
            r6 = r2
            goto L7e
        L6e:
            int[] r6 = new int[]{r0, r3}
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofInt(r6)
            mi1.c3 r0 = new mi1.c3
            r0.<init>(r7)
            r6.addUpdateListener(r0)
        L7e:
            if (r6 == 0) goto L89
            mi1.n1 r7 = new mi1.n1
            r7.<init>(r5)
            r6.addListener(r7)
            r2 = r6
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.q1.g(boolean, mi1.r1):android.animation.Animator");
    }

    @Override // mi1.i2
    /* renamed from: getCurrentState */
    public mi1.h2 getF172578m() {
        return this.f408198f;
    }
}
