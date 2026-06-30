package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2276x373aa5;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.view.StatusCardVerticalRecyclerView */
/* loaded from: classes10.dex */
public class C18681xbc07637c extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 {

    /* renamed from: j2, reason: collision with root package name */
    public int f255910j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f255911k2;

    /* renamed from: l2, reason: collision with root package name */
    public int f255912l2;

    /* renamed from: m2, reason: collision with root package name */
    public final android.view.ViewConfiguration f255913m2;

    /* renamed from: n2, reason: collision with root package name */
    public int f255914n2;

    /* renamed from: o2, reason: collision with root package name */
    public boolean f255915o2;

    public C18681xbc07637c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public void L0(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.f255915o2 = true;
        } else {
            this.f255915o2 = false;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f255915o2) {
            motionEvent.getAction();
            return true;
        }
        boolean z17 = false;
        if (action != 2) {
            int mo7958x54496c8e = mo7958x54496c8e();
            this.f255914n2 = motionEvent.getPointerId(0);
            this.f255910j2 = (int) (motionEvent.getX() + 0.0f);
            this.f255911k2 = (int) (motionEvent.getY() + 0.0f);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if (mo7958x54496c8e != 2 && mo7958x54496c8e != 1) {
                z17 = onInterceptTouchEvent;
            }
            motionEvent.getAction();
            return z17;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f255914n2);
        if (findPointerIndex < 0 || getLayoutManager() == null) {
            return false;
        }
        int x17 = (int) (motionEvent.getX(findPointerIndex) + 0.0f);
        int y17 = ((int) (motionEvent.getY(findPointerIndex) + 0.0f)) - this.f255911k2;
        boolean f204840r = getLayoutManager().getF204840r();
        double atan2 = java.lang.Math.atan2(r0 - this.f255911k2, x17 - this.f255910j2) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return (f204840r && java.lang.Math.abs(y17) > this.f255912l2 && (((atan2 > 75.0d ? 1 : (atan2 == 75.0d ? 0 : -1)) >= 0 && (atan2 > 105.0d ? 1 : (atan2 == 105.0d ? 0 : -1)) <= 0) || ((atan2 > 255.0d ? 1 : (atan2 == 255.0d ? 0 : -1)) >= 0 && (atan2 > 285.0d ? 1 : (atan2 == 285.0d ? 0 : -1)) <= 0))) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: setScrollingTouchSlop */
    public void mo7974x747fcb66(int i17) {
        super.mo7974x747fcb66(i17);
        android.view.ViewConfiguration viewConfiguration = this.f255913m2;
        if (i17 == 0) {
            this.f255912l2 = viewConfiguration.getScaledTouchSlop();
        } else {
            if (i17 != 1) {
                return;
            }
            this.f255912l2 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public C18681xbc07637c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f255914n2 = -1;
        this.f255915o2 = false;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f255913m2 = viewConfiguration;
        this.f255912l2 = viewConfiguration.getScaledTouchSlop();
    }
}
