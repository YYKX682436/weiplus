package com.tencent.mm.emoji.panel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/emoji/panel/EmojiPanelGroupView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "enable", "Ljz5/f0;", "setScrollEnable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EmojiPanelGroupView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public final oj5.a0 f64897b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f64898c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f64899d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPanelGroupView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f64897b2 = new oj5.a0(context);
        setItemViewCacheSize(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        oj5.a0 a0Var = this.f64897b2;
        a0Var.b(ev6);
        int i17 = a0Var.f345831h;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        com.tencent.mm.emoji.panel.layout.EmojiPanelLayoutManager emojiPanelLayoutManager = layoutManager instanceof com.tencent.mm.emoji.panel.layout.EmojiPanelLayoutManager ? (com.tencent.mm.emoji.panel.layout.EmojiPanelLayoutManager) layoutManager : null;
        if (emojiPanelLayoutManager != null) {
            boolean z17 = false;
            if (this.f64898c2) {
                if (!(((i17 & 1) == 0 && (i17 & 2) == 0) ? false : true) && !this.f64899d2) {
                    z17 = true;
                }
            }
            emojiPanelLayoutManager.f64924v = z17;
        }
        return super.dispatchTouchEvent(ev6);
    }

    @Override // android.view.View
    public android.view.View focusSearch(int i17) {
        return null;
    }

    public final void setScrollEnable(boolean z17) {
        this.f64898c2 = z17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiPanelGroupView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
