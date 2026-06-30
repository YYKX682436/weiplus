package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.SmileyGrid */
/* loaded from: classes5.dex */
public class C22805xf493e977 extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public final int f294994d;

    public C22805xf493e977(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f294994d = 20;
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
    }

    /* renamed from: getSmileyType */
    public int m82736x6c08c941() {
        return this.f294994d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
    }

    /* renamed from: setCallback */
    public void m82737x6c4ebec7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var) {
    }

    /* renamed from: setOnTextOperationListener */
    public void m82738x5e04422d(com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 k0Var) {
    }

    /* renamed from: setScene */
    public void m82739x53aed94a(int i17) {
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }
}
