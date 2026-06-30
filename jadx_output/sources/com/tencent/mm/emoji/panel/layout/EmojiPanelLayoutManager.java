package com.tencent.mm.emoji.panel.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/emoji/panel/layout/EmojiPanelLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EmojiPanelLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public boolean f64924v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPanelLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f64924v = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f64924v && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return this.f64924v && super.getF123307r();
    }
}
