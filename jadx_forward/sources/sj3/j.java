package sj3;

/* loaded from: classes14.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {
    public static final /* synthetic */ int C = 0;
    public final android.widget.RelativeLayout A;
    public boolean B;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed f490110d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f490111e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f490112f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f490113g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f490114h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f490115i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f490116m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f490117n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f490118o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f490119p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f490120q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f490121r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f490122s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.FrameLayout f490123t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f490124u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f490125v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f490126w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f490127x;

    /* renamed from: y, reason: collision with root package name */
    public int f490128y;

    /* renamed from: z, reason: collision with root package name */
    public final uj3.g f490129z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.a9u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f490123t = (android.widget.FrameLayout) findViewById;
        this.f490124u = true;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.nyb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f490125v = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.gz8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f490126w = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f566577gc4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f490127x = findViewById4;
        this.f490128y = -1;
        this.f490110d = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed) itemView.findViewById(com.p314xaae8f345.mm.R.id.nyi);
        this.f490111e = itemView.findViewById(com.p314xaae8f345.mm.R.id.jcb);
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.p5h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
        this.f490112f = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.jxj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById6, "null cannot be cast to non-null type android.widget.ImageView");
        this.f490113g = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.ntr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        android.view.View findViewById8 = itemView.findViewById(com.p314xaae8f345.mm.R.id.im6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById8, "null cannot be cast to non-null type android.widget.ImageView");
        this.f490115i = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.p314xaae8f345.mm.R.id.jwr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById9, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        this.f490114h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.p314xaae8f345.mm.R.id.a_m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        this.f490116m = (android.widget.TextView) findViewById10;
        this.f490118o = itemView.findViewById(com.p314xaae8f345.mm.R.id.a_l);
        this.f490117n = itemView.findViewById(com.p314xaae8f345.mm.R.id.a_9);
        this.A = (android.widget.RelativeLayout) itemView.findViewById(com.p314xaae8f345.mm.R.id.f568274mb4);
        android.content.Context context = itemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f490129z = new uj3.g(context);
    }

    public final void i() {
        int i17 = this.f490128y;
        if (i17 == 2 || i17 == 1) {
            j(true);
        }
        this.f490123t.removeAllViews();
        this.f490128y = -1;
    }

    public final void j(boolean z17) {
        if (z17 || this.f490128y != 2) {
            int i17 = this.f490128y;
            if (i17 == 1 || i17 == 2) {
                android.widget.FrameLayout frameLayout = this.f490123t;
                if (frameLayout.getChildCount() != 1) {
                    return;
                }
                android.view.View childAt = frameLayout.getChildAt(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) childAt.findViewById(com.p314xaae8f345.mm.R.id.f567556jw5);
                if ((imageView != null ? imageView.getBackground() : null) instanceof android.graphics.drawable.AnimationDrawable) {
                    android.graphics.drawable.Drawable background = imageView.getBackground();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    ((android.graphics.drawable.AnimationDrawable) background).stop();
                }
                frameLayout.removeViewAt(0);
                this.f490128y = -1;
            }
        }
    }

    public final void k() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.View view = this.f490117n;
        if (view != null && (animate2 = view.animate()) != null) {
            animate2.cancel();
        }
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(150L)) != null) {
            duration.setListener(new sj3.e(this));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f490121r;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f490121r;
        if (b4Var2 != null) {
            b4Var2.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f490121r;
        if (b4Var3 != null) {
            b4Var3.m77787xbe88f509();
        }
    }

    public final void l(android.view.View centerView, int i17, int i18, boolean z17) {
        android.graphics.Bitmap m17;
        jz5.f0 f0Var = jz5.f0.f384359a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(centerView, "centerView");
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18, 17);
        android.widget.FrameLayout frameLayout = this.f490123t;
        if (!z17) {
            frameLayout.addView(centerView, layoutParams);
            return;
        }
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.f3639x46306858.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed = this.f490110d;
        boolean z18 = false;
        if (c16587x33e31ed != null && (m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(frameLayout.getWidth() / 4, frameLayout.getHeight() / 4, android.graphics.Bitmap.Config.ARGB_8888, false)) != null) {
            try {
                new android.graphics.Canvas(m17).drawColor(-16777216);
                sj3.b5 m67077x1ff9e19 = c16587x33e31ed.m67077x1ff9e19();
                jz5.f0 f0Var2 = null;
                if (!(m67077x1ff9e19.f489977a != null)) {
                    m67077x1ff9e19 = null;
                }
                if (m67077x1ff9e19 != null) {
                    java.lang.String str = this.f490119p;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    android.graphics.Bitmap bitmap = m67077x1ff9e19.f489977a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
                    c16587x33e31ed.a(str, bitmap, 0, 0);
                    f0Var2 = f0Var;
                }
                if (f0Var2 != null) {
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f3639x46306858.getResources(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(m17, 10));
                    bitmapDrawable.setColorFilter(new android.graphics.ColorMatrixColorFilter(new android.graphics.ColorMatrix(new float[]{0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
                    frameLayout2.setBackground(bitmapDrawable);
                    z18 = true;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AvatarLayoutHolder", e17.getMessage() + ' ' + f0Var);
            }
        }
        if (!z18) {
            frameLayout2.setBackgroundColor(this.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560986zq));
        }
        frameLayout2.addView(centerView, layoutParams);
        frameLayout.addView(frameLayout2, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public final void n(boolean z17, boolean z18) {
        int i17 = this.f490128y;
        if (i17 == 3) {
            return;
        }
        if (z17 && i17 == 2) {
            return;
        }
        if (z17 || i17 == -1) {
            java.lang.Object systemService = this.f3639x46306858.getContext().getSystemService("layout_inflater");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570844c33, (android.view.ViewGroup) this.f490123t, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567556jw5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
            if (!z17 || !z18) {
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jw6)).setVisibility(8);
            }
            l(inflate, -2, -2, true);
            if (imageView.getBackground() instanceof android.graphics.drawable.AnimationDrawable) {
                android.graphics.drawable.Drawable background = imageView.getBackground();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                ((android.graphics.drawable.AnimationDrawable) background).start();
            }
            if (z17) {
                this.f490128y = 2;
            } else {
                this.f490128y = 1;
            }
        }
    }

    public final void o(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f490114h;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.raw.f79533x4d32081d, -65536));
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(this.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed = this.f490110d;
        if (c16587x33e31ed != null) {
            c16587x33e31ed.setTag(com.p314xaae8f345.mm.R.id.nwx, java.lang.Boolean.valueOf(i17 == 0));
        }
        ((android.widget.RelativeLayout) this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jwq)).setBackground(com.p314xaae8f345.mm.ui.uk.e(this.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.aqf, this.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        ((android.widget.RelativeLayout) this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jwq)).setVisibility(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.j.p(int):void");
    }

    public final void q(yz5.l lVar, boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.widget.TextView textView = this.f490116m;
        if (!(textView != null && textView.getVisibility() == 8)) {
            k();
            return;
        }
        this.f490122s = lVar;
        if (textView != null) {
            textView.setText(this.f490119p);
        }
        android.view.View view = this.f490117n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = this.f490118o;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f490121r;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f490121r;
        if (b4Var2 != null) {
            b4Var2.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f490121r;
        if (b4Var3 != null) {
            b4Var3.m77787xbe88f509();
        }
        this.f490121r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new sj3.h(this), false);
        if (view != null && (animate2 = view.animate()) != null) {
            animate2.cancel();
        }
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(150L)) == null) {
            return;
        }
        duration.setListener(new sj3.i(this));
    }
}
