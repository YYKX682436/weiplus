package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class DuplicateStateCoverViewContainer extends com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer {
    public DuplicateStateCoverViewContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean contains = com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer.a(this).contains(motionEvent.getRawX(), motionEvent.getRawY());
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
                if (childAt instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) {
                    com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer coverViewContainer = (com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) childAt;
                    coverViewContainer.getClass();
                    if (!(coverViewContainer instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.DuplicateStateCoverViewContainer)) {
                        continue;
                    }
                }
                if (com.tencent.mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat.a(childAt) && com.tencent.mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat.b(this, x17, y17, childAt, null) && childAt.isDuplicateParentStateEnabled()) {
                    if1.s.a(this, motionEvent, false, childAt, pointerId);
                    if ((childAt instanceof gb1.j) && ((gb1.j) childAt).a()) {
                        break;
                    }
                }
            }
        }
        return dispatchTouchEvent;
    }

    public DuplicateStateCoverViewContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
