package com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/subviews/FancyTextView;", "Landroid/widget/FrameLayout;", "", "Lkw0/a;", "fancyTextDataList", "Ljz5/f0;", "setDataList", "Lrw0/c;", "callback", "setFancyTextClickCallback", "Liw0/c;", "e", "Ljz5/g;", "getFancyTextAdapter", "()Liw0/c;", "fancyTextAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FancyTextView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public rw0.c f69311d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g fancyTextAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final iw0.c getFancyTextAdapter() {
        return (iw0.c) ((jz5.n) this.fancyTextAdapter).getValue();
    }

    public final void a(int i17, kw0.a stickerData) {
        kotlin.jvm.internal.o.g(stickerData, "stickerData");
        iw0.c fancyTextAdapter = getFancyTextAdapter();
        fancyTextAdapter.getClass();
        fancyTextAdapter.x(i17, stickerData);
    }

    public final void setDataList(java.util.List<kw0.a> fancyTextDataList) {
        kotlin.jvm.internal.o.g(fancyTextDataList, "fancyTextDataList");
        getFancyTextAdapter().y(fancyTextDataList);
    }

    public final void setFancyTextClickCallback(rw0.c callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f69311d = callback;
    }

    public /* synthetic */ FancyTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int c17;
        kotlin.jvm.internal.o.g(context, "context");
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        this.fancyTextAdapter = jz5.h.b(new mw0.f(this));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        addView(recyclerView, layoutParams);
        lv0.a aVar = new lv0.a();
        int dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        int dimensionPixelSize2 = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        aVar.f321477c = dimensionPixelSize;
        aVar.f321478d = dimensionPixelSize2;
        aVar.f321475a = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
        aVar.f321476b = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
        recyclerView.N(new lv0.b(aVar));
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(this);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        if (a18 != null) {
            c17 = a18.f247047d - a18.f247045b;
        } else {
            c17 = com.tencent.mm.ui.bl.c(getContext());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c17);
        java.lang.Integer num = valueOf.intValue() != 0 ? valueOf : null;
        recyclerView.N(new mw0.d(4, num != null ? num.intValue() : j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ajd)));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 4));
        recyclerView.setAdapter(getFancyTextAdapter());
    }
}
