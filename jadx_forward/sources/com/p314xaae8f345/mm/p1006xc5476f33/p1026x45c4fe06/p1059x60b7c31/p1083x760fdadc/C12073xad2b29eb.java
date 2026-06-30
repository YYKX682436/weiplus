package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.DuplicateStateCoverViewContainer */
/* loaded from: classes7.dex */
public class C12073xad2b29eb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 {
    public C12073xad2b29eb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean contains = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505.a(this).contains(motionEvent.getRawX(), motionEvent.getRawY());
        if (motionEvent.getActionMasked() == 0 && !g(motionEvent.getX(), motionEvent.getY()) && !contains) {
            return false;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!dispatchTouchEvent && motionEvent.getActionMasked() != 0) {
            int childCount = getChildCount();
            int pointerId = isMotionEventSplittingEnabled() ? 1 << motionEvent.getPointerId(motionEvent.getActionIndex()) : -1;
            for (int i17 = childCount - 1; i17 >= 0; i17--) {
                android.view.View childAt = getChildAt(i17);
                float x17 = motionEvent.getX();
                float y17 = motionEvent.getY();
                if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 c12072x6098f505 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) childAt;
                    c12072x6098f505.getClass();
                    if (!(c12072x6098f505 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12073xad2b29eb)) {
                        continue;
                    }
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1221x2e06d1.C12764xd5406843.a(childAt) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1221x2e06d1.C12764xd5406843.b(this, x17, y17, childAt, null) && childAt.isDuplicateParentStateEnabled()) {
                    if1.s.a(this, motionEvent, false, childAt, pointerId);
                    if ((childAt instanceof gb1.j) && ((gb1.j) childAt).a()) {
                        break;
                    }
                }
            }
        }
        return dispatchTouchEvent;
    }

    public C12073xad2b29eb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
