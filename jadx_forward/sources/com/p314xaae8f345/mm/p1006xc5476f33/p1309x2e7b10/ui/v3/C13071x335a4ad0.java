package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/CardRefreshLoadMoreLayout;", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.card.ui.v3.CardRefreshLoadMoreLayout */
/* loaded from: classes10.dex */
public final class C13071x335a4ad0 extends com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13071x335a4ad0(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00, com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5 parent, int i17, int i18, boolean z17, boolean z18, int[] consumed, int i19, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumed, "consumed");
        if (i19 == 1 && e(recyclerView) && this.isRefreshing) {
            recyclerView.f1();
        }
        super.g(recyclerView, parent, i17, i18, z17, z18, consumed, i19, z19);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00, com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5 parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        super.i(recyclerView, parent, i17);
        if (i17 == 0) {
            if (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.F(this, false, null, 3, null) && this.isRefreshing && this.isHasTopMore) {
                recyclerView.f1();
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.w(this, 0, false, null, 7, null);
                return;
            }
            return;
        }
        if (i17 == 1 && e(recyclerView) && this.isRefreshing && this.isHasTopMore) {
            recyclerView.f1();
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.w(this, 0, false, null, 7, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13071x335a4ad0(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
