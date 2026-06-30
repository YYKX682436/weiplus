package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryHeaderStageGroup;", "Landroid/widget/RelativeLayout;", "Lpf4/z;", "adapter", "Ljz5/f0;", "setContentAdapter", "Lkotlin/Function0;", "o", "Lyz5/a;", "getOnDeleteClick", "()Lyz5/a;", "setOnDeleteClick", "(Lyz5/a;)V", "onDeleteClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryHeaderStageGroup */
/* loaded from: classes4.dex */
public final class C18483x95082783 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f253508d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f253509e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.Scroller f253510f;

    /* renamed from: g, reason: collision with root package name */
    public int f253511g;

    /* renamed from: h, reason: collision with root package name */
    public int f253512h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f253513i;

    /* renamed from: m, reason: collision with root package name */
    public float f253514m;

    /* renamed from: n, reason: collision with root package name */
    public float f253515n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public yz5.a onDeleteClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18483x95082783(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cwq, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nbd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f253508d = c1163xf1deaba4;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.nbf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f253509e = findViewById2;
        this.f253510f = new android.widget.Scroller(context);
        new oj5.a0(context);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
        findViewById2.setOnClickListener(new rf4.g1(this));
    }

    public final void a() {
        if (this.f253513i) {
            return;
        }
        this.f253513i = true;
        this.f253510f.startScroll(this.f253511g, 0, (this.f253509e.getMeasuredWidth() + com.p314xaae8f345.mm.ui.zk.a(getContext(), 20)) - this.f253511g, 0);
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f253510f;
        if (scroller.computeScrollOffset()) {
            scroller.getCurrX();
            scroller.getCurrY();
            this.f253511g = scroller.getCurrX();
            scrollTo(scroller.getCurrX(), 0);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f253514m = motionEvent.getX();
            this.f253515n = motionEvent.getY();
        } else {
            boolean z17 = true;
            if (valueOf == null || valueOf.intValue() != 2) {
                if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 3)) {
                    z17 = false;
                }
                if (z17) {
                    this.f253514m = 0.0f;
                    this.f253515n = 0.0f;
                }
            } else if (java.lang.Math.abs(motionEvent.getX() - this.f253514m) > java.lang.Math.abs(motionEvent.getY() - this.f253515n)) {
                requestDisallowInterceptTouchEvent(true);
            }
        }
        return dispatchTouchEvent;
    }

    public final yz5.a getOnDeleteClick() {
        return this.onDeleteClick;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View target, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f253508d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = c1163xf1deaba4.mo7951xfd37656d();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7951xfd37656d != null && mo7946xf939df19 != null) {
            if (f17 > 0.0f) {
                if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d).x() == mo7946xf939df19.mo1894x7e414b06() - 1) {
                    a();
                }
            } else if (f17 < 0.0f && getScrollX() != 0 && !this.f253513i) {
                this.f253513i = true;
                android.widget.Scroller scroller = this.f253510f;
                int i17 = this.f253511g;
                scroller.startScroll(i17, 0, 0 - i17, 0);
                invalidate();
            }
        }
        return super.onNestedPreFling(target, f17, f18);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View target, int i17, int i18, int[] consumed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumed, "consumed");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f253508d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = c1163xf1deaba4.mo7951xfd37656d();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7951xfd37656d == null || mo7946xf939df19 == null) {
            return;
        }
        if (i17 > 0) {
            if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d).x() == mo7946xf939df19.mo1894x7e414b06() - 1) {
                int min = java.lang.Math.min(this.f253511g + i17, this.f253509e.getMeasuredWidth() + com.p314xaae8f345.mm.ui.zk.a(getContext(), 20));
                this.f253511g = min;
                scrollTo(min, 0);
                consumed[0] = i17;
            }
        } else if (i17 < 0 && getScrollX() != 0) {
            int max = java.lang.Math.max(this.f253511g + i17, 0);
            this.f253511g = max;
            scrollTo(max, 0);
            consumed[0] = i17;
        }
        this.f253512h = i17;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View child, android.view.View target, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        this.f253512h = 0;
        this.f253513i = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        return (i17 & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View child) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        int i17 = this.f253511g;
        if (i17 != 0) {
            int i18 = this.f253512h;
            if (i18 > 0) {
                a();
            } else if (i18 < 0 && !this.f253513i) {
                this.f253513i = true;
                this.f253510f.startScroll(i17, 0, 0 - i17, 0);
                invalidate();
            }
        }
        this.f253512h = 0;
        this.f253513i = false;
    }

    /* renamed from: setContentAdapter */
    public final void m71435x8727f198(pf4.z adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        throw null;
    }

    /* renamed from: setOnDeleteClick */
    public final void m71436x2858cdfc(yz5.a aVar) {
        this.onDeleteClick = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18483x95082783(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
