package com.tencent.mm.mj_publisher.finder.shoot_composing;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¨\u0006\""}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/RecordButton;", "Landroid/widget/FrameLayout;", "", "enable", "Ljz5/f0;", "setTouchEnable", "isTapToAutoRecord", "setIsTapToAutoRecord", "Lmx0/a0;", "callback", "setLongPressCallback", "Lmx0/b0;", "setLongPressScrollCallback", "Lmx0/x9;", "setSimpleTapCallback", "", "color", "setInnerViewColor", "showCircularProgressBar", "setShowCircularProgressBar", "duration", "setRecordMaxDuration", "setEnableCallback", "Lkotlin/Function0;", "interceptor", "setRecordInterceptor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RecordButton extends android.widget.FrameLayout {
    public static final /* synthetic */ int G = 0;
    public long A;
    public boolean B;
    public boolean C;
    public boolean D;
    public yz5.a E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f69501d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f69502e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f69503f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar f69504g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularCustomProgressBar f69505h;

    /* renamed from: i, reason: collision with root package name */
    public mx0.a0 f69506i;

    /* renamed from: m, reason: collision with root package name */
    public mx0.x9 f69507m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f69508n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f69509o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f69510p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f69511q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f69512r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f69513s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f69514t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f69515u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f69516v;

    /* renamed from: w, reason: collision with root package name */
    public float f69517w;

    /* renamed from: x, reason: collision with root package name */
    public int f69518x;

    /* renamed from: y, reason: collision with root package name */
    public int f69519y;

    /* renamed from: z, reason: collision with root package name */
    public long f69520z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69508n = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f69510p = true;
        this.f69517w = -1.0f;
        this.B = true;
        this.C = true;
        this.F = true;
        d();
    }

    public static final void a(com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton, boolean z17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator viewPropertyAnimator2 = recordButton.f69513s;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        android.view.ViewPropertyAnimator viewPropertyAnimator3 = null;
        recordButton.f69513s = null;
        android.view.View view = recordButton.f69501d;
        if (view == null || (viewPropertyAnimator = view.animate()) == null) {
            viewPropertyAnimator = null;
        } else {
            viewPropertyAnimator.scaleX(0.5f);
            viewPropertyAnimator.scaleY(0.5f);
            viewPropertyAnimator.setDuration(50L);
            viewPropertyAnimator.start();
        }
        recordButton.f69513s = viewPropertyAnimator;
        android.view.View view2 = recordButton.f69502e;
        if (view2 != null && (animate = view2.animate()) != null) {
            animate.scaleX(1.35f);
            animate.scaleY(1.35f);
            animate.alpha(0.0f);
            animate.setDuration(50L);
            animate.setListener(new mx0.z2(recordButton, z17, animate));
            animate.start();
            viewPropertyAnimator3 = animate;
        }
        recordButton.f69514t = viewPropertyAnimator3;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "cancelAllAni");
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f69513s;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f69513s = null;
        android.view.ViewPropertyAnimator viewPropertyAnimator2 = this.f69512r;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        this.f69512r = null;
        android.view.ViewPropertyAnimator viewPropertyAnimator3 = this.f69515u;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        this.f69515u = null;
        android.view.ViewPropertyAnimator viewPropertyAnimator4 = this.f69514t;
        if (viewPropertyAnimator4 != null) {
            viewPropertyAnimator4.cancel();
        }
        this.f69514t = null;
        android.view.ViewPropertyAnimator viewPropertyAnimator5 = this.f69516v;
        if (viewPropertyAnimator5 != null) {
            viewPropertyAnimator5.cancel();
        }
        this.f69516v = null;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "cancelAllDelayJob");
        kotlinx.coroutines.r2 r2Var = this.f69509o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f69509o = null;
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ddd, (android.view.ViewGroup) this, true);
        this.f69501d = findViewById(com.tencent.mm.R.id.f485343hd2);
        this.f69502e = findViewById(com.tencent.mm.R.id.kn_);
        this.f69503f = findViewById(com.tencent.mm.R.id.lbl);
        this.f69505h = (com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularCustomProgressBar) findViewById(com.tencent.mm.R.id.bwq);
        this.f69504g = (com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar) findViewById(com.tencent.mm.R.id.bwr);
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "resetCircularProgressBar");
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularCustomProgressBar recordButtonCircularCustomProgressBar = this.f69505h;
        if (recordButtonCircularCustomProgressBar != null) {
            recordButtonCircularCustomProgressBar.setVisibility(8);
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar recordButtonCircularProgressBar = this.f69504g;
        if (recordButtonCircularProgressBar != null) {
            recordButtonCircularProgressBar.setVisibility(8);
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar recordButtonCircularProgressBar2 = this.f69504g;
        if (recordButtonCircularProgressBar2 != null) {
            recordButtonCircularProgressBar2.f69534m = 0.0f;
            recordButtonCircularProgressBar2.invalidate();
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar recordButtonCircularProgressBar3 = this.f69504g;
        if (recordButtonCircularProgressBar3 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordButtonCircularProgressBar", "reset");
            recordButtonCircularProgressBar3.f69535n = 100.0f;
            recordButtonCircularProgressBar3.f69534m = 0.0f;
            recordButtonCircularProgressBar3.invalidate();
        }
    }

    public final void f() {
        setVisibility(8);
        android.view.View view = this.f69501d;
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        android.view.View view2 = this.f69502e;
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/RecordButton", "resetWithoutAni", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/RecordButton", "resetWithoutAni", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        e();
        this.f69511q = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r0 != 3) goto L106;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setEnableCallback(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "setEnableCallback, " + z17);
        this.C = z17;
    }

    public final void setInnerViewColor(int i17) {
        android.view.View view = this.f69501d;
        if (view != null) {
            view.post(new mx0.c3(this, i17));
        }
    }

    public final void setIsTapToAutoRecord(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "setIsTapToAutoRecord >> " + z17);
        this.D = z17;
    }

    public final void setLongPressCallback(mx0.a0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "setLongPressCallback");
        this.f69506i = callback;
    }

    public final void setLongPressScrollCallback(mx0.b0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "setLongPressScrollCallback");
    }

    public final void setRecordInterceptor(yz5.a interceptor) {
        kotlin.jvm.internal.o.g(interceptor, "interceptor");
        this.E = interceptor;
    }

    public final void setRecordMaxDuration(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "setRecordMaxDuration >> " + i17);
        this.f69519y = i17;
    }

    public final void setShowCircularProgressBar(boolean z17) {
        this.F = z17;
    }

    public final void setSimpleTapCallback(mx0.x9 x9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "setSingleTapCallback");
        this.f69507m = x9Var;
    }

    public final void setTouchEnable(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "setTouchEnable >> " + z17);
        this.f69510p = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69508n = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f69510p = true;
        this.f69517w = -1.0f;
        this.B = true;
        this.C = true;
        this.F = true;
        d();
    }
}
