package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class v5 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f110640d;

    public v5(android.content.Context context, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl) : i17;
        kotlin.jvm.internal.o.g(context, "context");
        this.f110640d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int i17 = this.f110640d;
        outRect.left = i17;
        outRect.right = i17;
        outRect.bottom = i17;
        outRect.top = i17;
    }
}
