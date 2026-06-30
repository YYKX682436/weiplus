package mg2;

/* loaded from: classes10.dex */
public final class e extends lg2.d {
    public int A;

    /* renamed from: v, reason: collision with root package name */
    public boolean f407756v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f407757w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f407758x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.HashSet f407759y;

    /* renamed from: z, reason: collision with root package name */
    public mn0.b0 f407760z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f407759y = new java.util.HashSet();
    }

    public static final void A(mg2.e eVar, android.os.Bundle bundle) {
        ig2.g b17 = eVar.b();
        b17.f372939e = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        b17.f372940f = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
        b17.f372941g = (eVar.b().f372939e == 0 || eVar.b().f372940f == 0) ? 0.0f : (eVar.b().f372939e * 1.0f) / eVar.b().f372940f;
    }

    public static final void B(mg2.e eVar, int i17) {
        eVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSwitchError: ");
        sb6.append(i17);
        sb6.append(" set: ");
        java.util.HashSet hashSet = eVar.f407759y;
        sb6.append(hashSet);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f400090e, sb6.toString());
        hashSet.add(java.lang.Integer.valueOf(i17));
        qg2.e.f444332a.b(eVar.b().f372909k);
    }

    public final r45.p72 C(long j17, long j18) {
        r45.p72 p72Var = new r45.p72();
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str = a52.a.f83117l;
        android.content.Context context = this.f400089d;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            context = null;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
        }
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).f216913n;
            if (i17 == 0 && (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa)) {
                i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context).getD();
            }
            if (i17 != 0) {
                str = java.lang.String.valueOf(i17);
            }
        }
        p72Var.set(0, str);
        p72Var.set(3, java.lang.Long.valueOf(j17));
        p72Var.set(4, java.lang.Long.valueOf(j18));
        p72Var.set(1, "SwitchImage_" + c01.id.c());
        p72Var.set(5, 0);
        return p72Var;
    }

    public final void D(java.lang.String str, yz5.l lVar, yz5.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSwitchInLiveRoomCallback isStartedLivePlay:");
        sb6.append(this.f407756v);
        sb6.append(" invokeSource: ");
        sb6.append(str);
        sb6.append(" errorSet: ");
        java.util.HashSet hashSet = this.f407759y;
        sb6.append(hashSet);
        sb6.append(" hasCallback: ");
        sb6.append(this.f407758x);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f400090e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (!this.f407756v && hashSet.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, str + " handleSwitchInLiveRoomCallback return for isStartedLivePlay:" + this.f407756v);
            return;
        }
        if (!this.f407757w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, str + " handleSwitchInLiveRoomCallback return for isStartedLivePlay:" + this.f407756v);
            return;
        }
        if (this.f407758x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, str + " handleSwitchInLiveRoomCallback hasCallback");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str + " handleSwitchInLiveRoomCallback");
        this.f407758x = true;
        lVar.mo146xb9724478(java.lang.Boolean.valueOf(hashSet.size() > 0));
        if (((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue()) {
            p();
        }
    }

    @Override // kg2.b
    public void f(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchInLiveRoom isRunning:");
        android.animation.AnimatorSet animatorSet = this.f400097o;
        sb6.append(animatorSet != null ? java.lang.Boolean.valueOf(animatorSet.isRunning()) : null);
        sb6.append(" livePlayer: ");
        sb6.append(this.f407760z);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f400090e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        kz2.c cVar = ig2.o.f372944a;
        kz2.c cVar2 = ig2.o.f372944a;
        cVar2.c("switchInLiveRoom before");
        mn0.b0 b0Var = this.f407760z;
        boolean z17 = b0Var instanceof nn0.c;
        if (b0Var != null) {
            ((mn0.y) b0Var).J(new mg2.c(this, z17, onFirstFrameRenderCallback, isDetachInvokeFun));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f407756v = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isStartedLivePlay:" + this.f407756v);
        }
        mn0.b0 b0Var2 = this.f407760z;
        if (b0Var2 != null) {
            mn0.b0.B(b0Var2, renderView, null, 2, null);
        }
        android.animation.AnimatorSet animatorSet2 = this.f400097o;
        boolean z18 = false;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            z18 = true;
        }
        if (z18) {
            android.animation.AnimatorSet animatorSet3 = this.f400097o;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new mg2.d(this, onFirstFrameRenderCallback, isDetachInvokeFun));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "switchInLiveRoom switch view success.");
            this.f407757w = true;
            D("onAnimationEnd2", onFirstFrameRenderCallback, isDetachInvokeFun);
        }
        cVar2.b("switchInLiveRoom after");
    }

    @Override // lg2.d, ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        long j17;
        long j18;
        r45.ka4 ka4Var;
        mn0.b0 b0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        java.lang.String str = "start preloadPlayer:" + b().f372910l;
        java.lang.String str2 = this.f400090e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        u(onAnimationEndCallback);
        this.f407757w = false;
        if (b().f372910l) {
            ig2.g b17 = b();
            r45.ka4 ka4Var2 = b().f372911m;
            long j19 = b().f372936b;
            long j27 = b().f372937c;
            java.lang.String str3 = b17.f372909k;
            if (android.text.TextUtils.isEmpty(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "preloadStartLivePlayer return for liveUrl:" + str3);
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadStartLivePlayer liveUrl:");
            sb6.append(str3);
            sb6.append(",liveSdkChannelParams is null:");
            sb6.append(ka4Var2 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            this.f407756v = false;
            int X = nn0.c.X(false);
            mn0.b0 N6 = ((im2.g4) ((vd2.f5) pf5.u.f435469a.e(s40.w0.class).c(vd2.f5.class))).N6(this.f400089d, (X == 5 || X == 6) ? 2 : 0);
            this.f407760z = N6;
            ((mn0.y) N6).K(mn0.d0.f411244g, 2);
            mn0.b0 b0Var2 = this.f407760z;
            if (b0Var2 != null) {
                ((mn0.y) b0Var2).f(true);
            }
            mn0.b0 b0Var3 = this.f407760z;
            if (b0Var3 != null) {
                j17 = j27;
                ((mn0.y) b0Var3).F(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a, this.f400090e, true, null, ka4Var2, 0, 0, 52, null));
            } else {
                j17 = j27;
            }
            mn0.b0 b0Var4 = this.f407760z;
            if (b0Var4 != null) {
                ((mn0.y) b0Var4).G(true);
            }
            mn0.b0 b0Var5 = this.f407760z;
            if (b0Var5 != null) {
                ((mn0.y) b0Var5).Q(0);
            }
            mn0.b0 b0Var6 = this.f407760z;
            if (b0Var6 != null) {
                j18 = j19;
                ka4Var = ka4Var2;
                ((mn0.y) b0Var6).J(new mg2.b(this, ka4Var2, j19, j17));
            } else {
                j18 = j19;
                ka4Var = ka4Var2;
            }
            mn0.l0 l0Var = b().f372912n;
            if (l0Var != null && (b0Var = this.f407760z) != null) {
                ((mn0.y) b0Var).N(l0Var);
            }
            mn0.b0 b0Var7 = this.f407760z;
            if (b0Var7 != null) {
                mn0.b0.D(b0Var7, qg2.e.f444332a.a(b().f372909k, b().f372911m), 1, ka4Var, C(j18, j17), false, false, 48, null);
            }
        }
    }

    @Override // lg2.d, ez2.b
    public void h() {
        android.animation.AnimatorSet animatorSet = this.f400097o;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        p();
    }

    @Override // lg2.a
    public android.graphics.Rect m() {
        android.view.View view = this.f400103q;
        if (view != null) {
            int[] iArr = new int[2];
            qg2.d.f444326a.e(view, iArr);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            ig2.g b17 = b();
            int i17 = iArr[0];
            b17.f372943i = new android.graphics.Rect(i17, iArr[1], viewGroup.getWidth() + i17, iArr[1] + viewGroup.getHeight());
        }
        return b().f372943i;
    }

    @Override // lg2.d, lg2.a
    public android.graphics.Rect n() {
        qg2.d dVar = qg2.d.f444326a;
        int g17 = dVar.g();
        int f17 = dVar.f();
        float h17 = dVar.h(z(), null);
        int i17 = (int) (z().f372939e * h17);
        int i18 = (int) (h17 * z().f372940f);
        int i19 = (g17 - i17) / 2;
        int i27 = (f17 - i18) / 2;
        return new android.graphics.Rect(i19, i27, i17 + i19, i18 + i27);
    }

    @Override // lg2.a
    public void p() {
        this.f400104r = true;
        android.widget.FrameLayout frameLayout = this.f400105s;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(null);
        }
        android.view.ViewGroup viewGroup = this.f400107u;
        if (viewGroup != null) {
            android.view.View findViewWithTag = viewGroup.findViewWithTag("fluent_view_tag");
            if (findViewWithTag != null) {
                findViewWithTag.setOnTouchListener(null);
            }
            java.lang.String str = this.f400090e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "detachFloatView view:" + findViewWithTag);
            ig2.g b17 = b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detachMaskView maskView:");
            android.view.View view = b17.f372908j;
            sb6.append(view);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (!(view instanceof android.widget.ImageView)) {
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view);
                }
                android.view.View view2 = b().f372938d;
                android.view.ViewGroup viewGroup3 = view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null;
                if (viewGroup3 != null) {
                    int i17 = this.A;
                    int i18 = (i17 <= 0 || i17 >= viewGroup3.getChildCount()) ? 0 : this.A;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "detachMaskView recover maskView validIndex: " + i18 + " childCount: " + viewGroup3.getChildCount());
                    viewGroup3.addView(view, i18);
                }
            }
            viewGroup.removeView(findViewWithTag);
        }
        this.f400103q = null;
        this.f400107u = null;
    }

    @Override // lg2.a
    public java.lang.String r() {
        return "SwitchOutImageDirector";
    }

    @Override // lg2.d
    public void v() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(q().width(), q().height());
        layoutParams.gravity = 17;
        android.view.View view = b().f372908j;
        if (view instanceof android.widget.ImageView) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = this.f400106t;
            if (c22646x1e9ca55 != null) {
                android.widget.ImageView imageView = new android.widget.ImageView(this.f400089d);
                android.widget.ImageView imageView2 = (android.widget.ImageView) view;
                imageView.setImageDrawable(imageView2.getDrawable());
                imageView.setScaleType(imageView2.getScaleType());
                c22646x1e9ca55.addView(imageView, layoutParams);
                return;
            }
            return;
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    i17 = viewGroup.getChildCount() - 1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewGroup.getChildAt(i17), view)) {
                    break;
                } else {
                    i17++;
                }
            }
            this.A = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400090e, "addMaskView originIndex: " + this.A);
            viewGroup.removeView(view);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = this.f400106t;
        if (c22646x1e9ca552 != null) {
            c22646x1e9ca552.addView(view, layoutParams);
        }
    }

    @Override // lg2.d
    public int w() {
        return com.p314xaae8f345.mm.R.C30861xcebc809e.b7w;
    }
}
