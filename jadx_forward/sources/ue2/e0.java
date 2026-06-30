package ue2;

/* loaded from: classes3.dex */
public final class e0 extends android.widget.FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f508336n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f508337d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f508338e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f508339f;

    /* renamed from: g, reason: collision with root package name */
    public ue2.i0 f508340g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f508341h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f508342i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.animation.AccelerateDecelerateInterpolator f508343m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f508337d = context;
        this.f508343m = new android.view.animation.AccelerateDecelerateInterpolator();
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        setVisibility(8);
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(Integer.MIN_VALUE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "initializeShell", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "initializeShell", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setOnClickListener(new ue2.z(this));
        this.f508339f = view;
        addView(view);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatInternalDialog", "initializeShell: 弹窗壳初始化完成");
    }

    public final void a(boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator withEndAction;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration2;
        if (!this.f508341h || this.f508342i) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatInternalDialog", "dismiss: 开始隐藏内部弹窗");
        this.f508342i = true;
        android.view.View view = this.f508339f;
        if (view != null && (animate2 = view.animate()) != null && (alpha = animate2.alpha(0.0f)) != null && (duration2 = alpha.setDuration(300L)) != null) {
            duration2.start();
        }
        android.view.ViewGroup viewGroup = this.f508338e;
        if (viewGroup == null || (animate = viewGroup.animate()) == null) {
            return;
        }
        android.view.ViewPropertyAnimator translationY = animate.translationY(this.f508338e != null ? r4.getHeight() : 0.0f);
        if (translationY == null || (duration = translationY.setDuration(300L)) == null || (interpolator = duration.setInterpolator(this.f508343m)) == null || (withEndAction = interpolator.withEndAction(new ue2.y(this, z17))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void b() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator withStartAction;
        android.view.ViewPropertyAnimator withEndAction;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration2;
        if (this.f508341h || this.f508342i) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatInternalDialog", "show: 开始显示内部弹窗");
        this.f508342i = true;
        setVisibility(0);
        android.view.View view = this.f508339f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup = this.f508338e;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.view.View view2 = this.f508339f;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "show", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "show", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.ViewGroup viewGroup2 = this.f508338e;
        if (viewGroup2 != null) {
            viewGroup2.setTranslationY(viewGroup2 != null ? viewGroup2.getHeight() : 0.0f);
        }
        android.view.View view3 = this.f508339f;
        if (view3 != null && (animate2 = view3.animate()) != null && (alpha = animate2.alpha(1.0f)) != null && (duration2 = alpha.setDuration(300L)) != null) {
            duration2.start();
        }
        android.view.ViewGroup viewGroup3 = this.f508338e;
        if (viewGroup3 == null || (animate = viewGroup3.animate()) == null || (translationY = animate.translationY(0.0f)) == null || (duration = translationY.setDuration(300L)) == null || (interpolator = duration.setInterpolator(this.f508343m)) == null || (withStartAction = interpolator.withStartAction(new ue2.c0(this))) == null || (withEndAction = withStartAction.withEndAction(new ue2.d0(this))) == null) {
            return;
        }
        withEndAction.start();
    }

    /* renamed from: getContentView */
    public final android.view.ViewGroup m167884xc2a54588() {
        return this.f508338e;
    }

    /* renamed from: setContentView */
    public final void m167885x590ab8fc(android.view.ViewGroup contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        if (this.f508341h || this.f508342i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveChatInternalDialog", "setContentView: 弹窗正在显示或动画中，不能设置内容");
            return;
        }
        android.view.View view = this.f508338e;
        if (view != null) {
            removeView(view);
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f508337d);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setOnClickListener(ue2.b0.f508329d);
        frameLayout.setTranslationY(frameLayout.getHeight());
        frameLayout.addView(contentView);
        this.f508338e = frameLayout;
        addView(frameLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatInternalDialog", "setContentView: 内容视图已设置，添加了点击事件防护");
    }

    /* renamed from: setInternalDialogListener */
    public final void m167886x53e6f53b(ue2.i0 i0Var) {
        this.f508340g = i0Var;
    }
}
