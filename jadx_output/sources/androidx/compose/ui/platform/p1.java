package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class p1 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f10681d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f10682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setClipChildren(false);
        this.f10681d = new java.util.HashMap();
        this.f10682e = new java.util.HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final java.util.HashMap<r2.o, u1.w> getHolderToLayoutNode() {
        return this.f10681d;
    }

    public final java.util.HashMap<u1.w, r2.o> getLayoutNodeToHolder() {
        return this.f10682e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View child, android.view.View target) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.util.Set<r2.o> keySet = this.f10681d.keySet();
        kotlin.jvm.internal.o.f(keySet, "holderToLayoutNode.keys");
        for (r2.o oVar : keySet) {
            oVar.layout(oVar.getLeft(), oVar.getTop(), oVar.getRight(), oVar.getBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (!(android.view.View.MeasureSpec.getMode(i17) == 1073741824)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(android.view.View.MeasureSpec.getMode(i18) == 1073741824)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), android.view.View.MeasureSpec.getSize(i18));
        java.util.Set<r2.o> keySet = this.f10681d.keySet();
        kotlin.jvm.internal.o.f(keySet, "holderToLayoutNode.keys");
        for (r2.o oVar : keySet) {
            int i27 = oVar.f368746v;
            if (i27 != Integer.MIN_VALUE && (i19 = oVar.f368747w) != Integer.MIN_VALUE) {
                oVar.measure(i27, i19);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            u1.w wVar = (u1.w) this.f10681d.get(childAt);
            if (childAt.isLayoutRequested() && wVar != null) {
                u1.d0 d0Var = u1.w.f423678p0;
                wVar.I(false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
