package com.tencent.mm.plugin.emoji.ui.v3;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aB\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Li22/w;", "c2", "Li22/w;", "getSizeResolver", "()Li22/w;", "setSizeResolver", "(Li22/w;)V", "sizeResolver", "Lkotlin/Function1;", "", "Ljz5/f0;", "d2", "Lyz5/l;", "getOnSizeChangedCallback", "()Lyz5/l;", "setOnSizeChangedCallback", "(Lyz5/l;)V", "onSizeChangedCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmojiStoreV3SingleProductRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public final java.lang.String f98469b2;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public i22.w sizeResolver;

    /* renamed from: d2, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSizeChangedCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3SingleProductRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98469b2 = "MicroMsg.EmojiStoreV3SingleProductRecyclerView";
    }

    public final yz5.l getOnSizeChangedCallback() {
        return this.onSizeChangedCallback;
    }

    public final i22.w getSizeResolver() {
        return this.sizeResolver;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.sizeResolver != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                i22.w wVar = this.sizeResolver;
                gridLayoutManager.c0(wVar != null ? wVar.f288060b : 0);
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i(this.f98469b2, "onSizeChanged w:" + i17 + ", h:" + i18 + ", oldw::" + i19 + ", oldH:" + i27);
        i22.w wVar = this.sizeResolver;
        if (wVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3ItemSizeResolver", "setParentWidth: " + i17);
            if (i17 > 0) {
                wVar.f288059a = i17;
                wVar.d();
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.c0(wVar.f288060b);
            }
            yz5.l lVar = this.onSizeChangedCallback;
            if (lVar != null) {
                lVar.invoke(java.lang.Integer.valueOf(wVar.f288060b));
            }
        }
        if (getItemDecorationCount() > 0) {
            D0();
        }
    }

    public final void setOnSizeChangedCallback(yz5.l lVar) {
        this.onSizeChangedCallback = lVar;
    }

    public final void setSizeResolver(i22.w wVar) {
        this.sizeResolver = wVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3SingleProductRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
