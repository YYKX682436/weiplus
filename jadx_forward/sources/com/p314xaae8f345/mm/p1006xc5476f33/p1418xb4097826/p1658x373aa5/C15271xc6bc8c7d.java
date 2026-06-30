package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderContactSortView;", "Lcom/tencent/mm/ui/base/sortview/BaseSortView;", "Lcom/tencent/mm/ui/base/VerticalScrollBar;", "getScrollBar", "Landroid/widget/ListView;", "getListView", "Landroid/view/View;", "getNoResultView", "Lfb5/l;", "getItemViewCreator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/finder/view/r7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderContactSortView */
/* loaded from: classes9.dex */
public final class C15271xc6bc8c7d extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15271xc6bc8c7d(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        m79360xa1aeda28(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.t7(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    public android.view.View b() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.afo, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    public boolean c(java.lang.String str, fb5.n nVar) {
        if (str == null) {
            return false;
        }
        java.lang.String str2 = nVar != null ? nVar.f342430a : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        return r26.i0.y(str, str2, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getItemViewCreator */
    public fb5.l mo48655x185aee7e() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s7(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getListView */
    public android.widget.ListView mo48656xcc101dd9() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.i3p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ListView) findViewById;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getNoResultView */
    public android.view.View mo48657x932e1f79() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kch);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getScrollBar */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 mo48658x1853ff50() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nds);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10) findViewById;
    }
}
