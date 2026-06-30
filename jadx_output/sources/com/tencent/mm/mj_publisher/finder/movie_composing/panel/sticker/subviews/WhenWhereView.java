package com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/subviews/WhenWhereView;", "Landroid/widget/FrameLayout;", "Liw0/c;", "d", "Ljz5/g;", "getWhenWhereAdapter", "()Liw0/c;", "whenWhereAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WhenWhereView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g whenWhereAdapter;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f69318e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WhenWhereView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final iw0.c getWhenWhereAdapter() {
        return (iw0.c) ((jz5.n) this.whenWhereAdapter).getValue();
    }

    public final void a(java.util.List whenWhereDataList, yz5.l selectedCallback) {
        kotlin.jvm.internal.o.g(whenWhereDataList, "whenWhereDataList");
        kotlin.jvm.internal.o.g(selectedCallback, "selectedCallback");
        this.f69318e = selectedCallback;
        getWhenWhereAdapter().y(whenWhereDataList);
    }

    public final void b(int i17, kw0.a stickerData) {
        kotlin.jvm.internal.o.g(stickerData, "stickerData");
        iw0.c whenWhereAdapter = getWhenWhereAdapter();
        whenWhereAdapter.getClass();
        whenWhereAdapter.x(i17, stickerData);
    }

    public /* synthetic */ WhenWhereView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhenWhereView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int c17;
        kotlin.jvm.internal.o.g(context, "context");
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        this.whenWhereAdapter = jz5.h.b(new mw0.n(this));
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
        recyclerView.N(new mw0.l(4, num != null ? num.intValue() : j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ajd)));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 4));
        recyclerView.setAdapter(getWhenWhereAdapter());
    }
}
