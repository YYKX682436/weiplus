package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView */
/* loaded from: classes9.dex */
public class C16364x2d32e7b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g4 f227648b2;

    public C16364x2d32e7b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g4 g4Var = this.f227648b2;
        if (g4Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.km kmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.km) g4Var;
            kmVar.getClass();
            if (motionEvent.getAction() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = kmVar.f228646a;
                android.view.View n17 = activityC16390x60cac25d.D.n(activityC16390x60cac25d.f228056m);
                activityC16390x60cac25d.C = n17;
                activityC16390x60cac25d.D.f227283f = n17;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C16364x2d32e7b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
