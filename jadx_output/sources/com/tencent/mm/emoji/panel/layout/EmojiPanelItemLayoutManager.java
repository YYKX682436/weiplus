package com.tencent.mm.emoji.panel.layout;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/emoji/panel/layout/EmojiPanelItemLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "mr/j", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EmojiPanelItemLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        P(i17, 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 state, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(state, "state");
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        mr.j jVar = new mr.j(context);
        jVar.f12049a = i17;
        startSmoothScroll(jVar);
    }
}
