package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView */
/* loaded from: classes4.dex */
public class C18407xdfdc90f6 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f252364d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f252365e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f252366f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Handler f252367g;

    /* renamed from: h, reason: collision with root package name */
    public int f252368h;

    /* renamed from: i, reason: collision with root package name */
    public int f252369i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 f252370m;

    public C18407xdfdc90f6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f252365e = false;
        this.f252366f = false;
        this.f252368h = 500;
        this.f252369i = 500;
        a(context);
    }

    public void a(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        this.f252367g = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f252368h = android.view.ViewConfiguration.getLongPressTimeout();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdTouchProgressView", "init, longPressTimeout=" + this.f252368h);
        if (this.f252368h < 500) {
            this.f252368h = 500;
        }
        this.f252369i = this.f252368h;
        this.f252364d = new android.view.GestureDetector(context, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.a1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        super.dispatchDraw(canvas);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    /* renamed from: getLongPressTime */
    public int m71253x37b632de() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLongPressTime", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        int i17 = this.f252368h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLongPressTime", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        return i17;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        int action = motionEvent.getAction();
        android.view.GestureDetector gestureDetector = this.f252364d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (action == 0) {
            this.f252365e = false;
        } else if (action == 1 || action == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdTouchProgressView", "onTouchEvent cancel， action=" + action + ", IsLongClicked=" + this.f252366f + ", isSuccFinish=" + this.f252365e);
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f252367g.removeCallbacksAndMessages(null);
            if (!this.f252365e && this.f252366f && (b1Var = this.f252370m) != null) {
                b1Var.mo71188x3d6f0539();
            }
            this.f252366f = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdTouchProgressView", "clear");
            this.f252367g.removeCallbacksAndMessages(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        return onTouchEvent;
    }

    /* renamed from: setActionListener */
    public void m71254xbe6460c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 b1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActionListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        this.f252370m = b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActionListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    /* renamed from: setPressDuration */
    public void m71255xb9b985b5(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPressDuration", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdTouchProgressView", "setPressDuration:" + i17);
        int i18 = this.f252368h;
        if (i17 < i18) {
            i17 = i18;
        }
        this.f252369i = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPressDuration", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    public C18407xdfdc90f6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f252365e = false;
        this.f252366f = false;
        this.f252368h = 500;
        this.f252369i = 500;
        a(context);
    }
}
