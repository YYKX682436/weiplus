package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView */
/* loaded from: classes9.dex */
public class C19141xe17e052b extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374 {
    public C19141xe17e052b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    public android.view.View b() {
        return android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569725k2, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    public boolean c(java.lang.String str, fb5.n nVar) {
        return ((gt4.n) nVar.f342431b).f357006c.toUpperCase().contains(str.toUpperCase());
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getItemViewCreator */
    public fb5.l mo48655x185aee7e() {
        return new gt4.m(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getListView */
    public android.widget.ListView mo48656xcc101dd9() {
        return (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i3y);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getNoResultView */
    public android.view.View mo48657x932e1f79() {
        return findViewById(com.p314xaae8f345.mm.R.id.aep);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getScrollBar */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 mo48658x1853ff50() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10) findViewById(com.p314xaae8f345.mm.R.id.mwe);
    }
}
