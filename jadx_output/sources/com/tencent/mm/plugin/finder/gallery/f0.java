package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class f0 extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (layoutParams2.f11865h % 3 == 1) {
                outRect.left = 1;
                outRect.right = 1;
            }
            outRect.bottom = 1;
            outRect.top = 0;
        }
    }
}
