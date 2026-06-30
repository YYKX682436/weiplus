package com.tencent.mm.plugin.emojicapture.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StickerLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final int f98788v;

    /* renamed from: w, reason: collision with root package name */
    public final int f98789w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerLayoutManager(android.content.Context context, int i17) {
        super(context, i17, false);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98788v = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480353ve);
        this.f98789w = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
    }

    public final void W() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                int position = getPosition(childAt);
                int left = (childAt.getLeft() + childAt.getRight()) / 2;
                int width = getWidth() / 2;
                int right = childAt.getRight() - childAt.getLeft();
                if (position == getItemCount() - 1 || java.lang.Math.abs(left - width) < right / 2) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(0.3f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        super.onLayoutChildren(recycler, state);
        W();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i17, recycler, state);
        W();
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        int width = ((getWidth() - this.f98788v) / 2) - this.f98789w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(width));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 state, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(state, "state");
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e32.a aVar = new e32.a(context);
        aVar.f12049a = i17;
        startSmoothScroll(aVar);
    }
}
