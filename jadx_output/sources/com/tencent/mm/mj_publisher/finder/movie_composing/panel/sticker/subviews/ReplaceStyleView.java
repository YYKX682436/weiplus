package com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/subviews/ReplaceStyleView;", "Landroid/widget/FrameLayout;", "", "Lkw0/a;", "styleDataList", "Ljz5/f0;", "setStyleDataList", "Landroidx/recyclerview/widget/RecyclerView;", "d", "Ljz5/g;", "getRvFancyTextStyle", "()Landroidx/recyclerview/widget/RecyclerView;", "rvFancyTextStyle", "Lmw0/h;", "f", "Lmw0/h;", "getSelectedStickerStyleCallback", "()Lmw0/h;", "setSelectedStickerStyleCallback", "(Lmw0/h;)V", "selectedStickerStyleCallback", "Lkotlin/Function0;", "", "g", "Lyz5/a;", "getGetPanelDiffHeight", "()Lyz5/a;", "setGetPanelDiffHeight", "(Lyz5/a;)V", "getPanelDiffHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ReplaceStyleView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g rvFancyTextStyle;

    /* renamed from: e, reason: collision with root package name */
    public final iw0.c f69314e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public mw0.h selectedStickerStyleCallback;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.a getPanelDiffHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplaceStyleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final androidx.recyclerview.widget.RecyclerView getRvFancyTextStyle() {
        java.lang.Object value = ((jz5.n) this.rvFancyTextStyle).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public final void a(int i17) {
        iw0.c cVar = this.f69314e;
        cVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = cVar.f275970d;
        int i18 = 0;
        for (java.lang.Object obj : arrayList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            kw0.a aVar = (kw0.a) obj;
            if (aVar.f312790c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i18), kw0.a.a(aVar, null, null, false, 3, null));
            }
            i18 = i19;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            kw0.a aVar2 = (kw0.a) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (aVar2 != null) {
                arrayList.set(intValue, aVar2);
                cVar.notifyItemChanged(intValue);
            }
        }
        kw0.a aVar3 = (kw0.a) kz5.n0.a0(arrayList, i17);
        if (aVar3 != null) {
            cVar.x(i17, kw0.a.a(aVar3, null, null, true, 3, null));
        }
    }

    public final yz5.a getGetPanelDiffHeight() {
        return this.getPanelDiffHeight;
    }

    public final mw0.h getSelectedStickerStyleCallback() {
        return this.selectedStickerStyleCallback;
    }

    public final void setGetPanelDiffHeight(yz5.a aVar) {
        this.getPanelDiffHeight = aVar;
    }

    public final void setSelectedStickerStyleCallback(mw0.h hVar) {
        this.selectedStickerStyleCallback = hVar;
    }

    public final void setStyleDataList(java.util.List<kw0.a> styleDataList) {
        kotlin.jvm.internal.o.g(styleDataList, "styleDataList");
        this.f69314e.y(styleDataList);
    }

    public /* synthetic */ ReplaceStyleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplaceStyleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int c17;
        kotlin.jvm.internal.o.g(context, "context");
        this.rvFancyTextStyle = jz5.h.b(new mw0.i(this));
        iw0.c cVar = new iw0.c(true, new mw0.j(this));
        this.f69314e = cVar;
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dg7, this);
        androidx.recyclerview.widget.RecyclerView rvFancyTextStyle = getRvFancyTextStyle();
        androidx.recyclerview.widget.n2 itemAnimator = rvFancyTextStyle.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
        if (o3Var != null) {
            o3Var.f12182g = false;
        }
        lv0.a aVar = new lv0.a();
        int dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        int dimensionPixelSize2 = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        aVar.f321477c = dimensionPixelSize;
        aVar.f321478d = dimensionPixelSize2;
        aVar.f321475a = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
        aVar.f321476b = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
        rvFancyTextStyle.N(new lv0.b(aVar));
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(rvFancyTextStyle);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        if (a18 != null) {
            c17 = a18.f247047d - a18.f247045b;
        } else {
            c17 = com.tencent.mm.ui.bl.c(rvFancyTextStyle.getContext());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c17);
        java.lang.Integer num = valueOf.intValue() != 0 ? valueOf : null;
        rvFancyTextStyle.N(new mw0.g(4, this, num != null ? num.intValue() : j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ajd)));
        rvFancyTextStyle.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 4));
        getRvFancyTextStyle().setAdapter(cVar);
    }
}
