package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView */
/* loaded from: classes11.dex */
public class C12808x5de4409f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 {

    /* renamed from: f2, reason: collision with root package name */
    public android.view.View f173628f2;

    /* renamed from: g2, reason: collision with root package name */
    public vl1.j f173629g2;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f173630h2;

    public C12808x5de4409f(android.content.Context context) {
        super(context);
        h1();
    }

    private void h1() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de l17 = l1();
        super.mo7967x900dcbe1(l17);
        i(new vl1.h(this, l17));
        this.f173631b2.mo8163xed962dec(new vl1.i(this, l17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071
    /* renamed from: addFooterView */
    public void mo53680x55dede61(android.view.View view) {
        int x17 = this.f173631b2.x() - 1;
        if (this.f173628f2 == null || x17 < 0) {
            super.mo53680x55dede61(view);
            return;
        }
        vl1.g gVar = this.f173631b2;
        ((java.util.LinkedList) gVar.f519331h).add(x17, view);
        gVar.m8151xc67946d3(gVar.mo1894x7e414b06() - 1, 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071
    public boolean k1() {
        return this.f173628f2 != null ? this.f173631b2.mo1894x7e414b06() == 1 && this.f173631b2.x() == 1 : super.k1();
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de l1() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext());
    }

    public void m1(boolean z17) {
        if (this.f173630h2 == z17) {
            return;
        }
        this.f173630h2 = z17;
        android.view.View view = this.f173628f2;
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: setLayoutManager */
    public void mo7967x900dcbe1(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
    }

    /* renamed from: setLoadingView */
    public void m53682x626a4c3f(android.view.View view) {
        android.view.View view2 = this.f173628f2;
        if (view2 == view) {
            return;
        }
        if (view2 != null && !view2.equals(view)) {
            i1(this.f173628f2);
        }
        this.f173628f2 = view;
        if (view != null) {
            mo53680x55dede61(view);
            android.view.View view3 = this.f173628f2;
            int i17 = this.f173630h2 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "setLoadingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "setLoadingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: setOnLoadingStateChangedListener */
    public void m53683x6891e372(vl1.j jVar) {
        this.f173629g2 = jVar;
    }

    public C12808x5de4409f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        h1();
    }

    public C12808x5de4409f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        h1();
    }

    /* renamed from: setLoadingView */
    public void m53681x626a4c3f(int i17) {
        m53682x626a4c3f(android.view.LayoutInflater.from(getContext()).inflate(i17, (android.view.ViewGroup) this, false));
    }
}
