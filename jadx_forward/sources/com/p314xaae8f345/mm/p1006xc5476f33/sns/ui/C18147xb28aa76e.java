package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.TestTimeForSns */
/* loaded from: classes4.dex */
public class C18147xb28aa76e extends android.widget.FrameLayout {

    /* renamed from: DEBUG */
    public final boolean f38348x3de9e33;
    public final java.lang.String TAG;

    /* renamed from: _hellAccFlag_ */
    private byte f38349x7f11beae;

    /* renamed from: beginTime */
    public long f38350xc00dc316;

    /* renamed from: hasDrawed */
    private boolean f38351xd6099c1d;

    /* renamed from: listener */
    private com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ew f38352x503cc4b4;

    /* renamed from: util */
    private ad4.f f38353x36f002;

    public C18147xb28aa76e(android.content.Context context) {
        super(context);
        this.f38348x3de9e33 = true;
        this.TAG = "MicroMsg.TestTimeForSns";
        this.f38353x36f002 = new ad4.f(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchDraw", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        super.dispatchDraw(canvas);
        if (!this.f38351xd6099c1d) {
            this.f38351xd6099c1d = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(10);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(22);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchDraw", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        ad4.f fVar = this.f38353x36f002;
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGestureDetector", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil");
        android.view.GestureDetector gestureDetector = fVar.f84715b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGestureDetector", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/TestTimeForSns", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/sns/ui/TestTimeForSns", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        return dispatchTouchEvent;
    }

    /* renamed from: hasDrawed */
    public boolean m70818xd6099c1d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasDrawed", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        boolean z17 = this.f38351xd6099c1d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasDrawed", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        return z17;
    }

    /* renamed from: setListener */
    public void m70819xc6cf6336(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ew ewVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setListener", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setListener", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
    }

    public C18147xb28aa76e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38348x3de9e33 = true;
        this.TAG = "MicroMsg.TestTimeForSns";
        this.f38353x36f002 = new ad4.f(getContext());
    }
}
