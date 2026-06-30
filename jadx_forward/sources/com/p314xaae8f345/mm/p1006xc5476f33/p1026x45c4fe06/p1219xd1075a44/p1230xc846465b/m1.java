package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class m1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 f173550d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k1 k1Var) {
        this.f173550d = abstractC12805xabdd4ef7;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef7 = this.f173550d;
        int size = abstractC12805xabdd4ef7.f173441f2.size();
        int m53638x2a647fd9 = abstractC12805xabdd4ef7.m53638x2a647fd9();
        if (abstractC12805xabdd4ef7.m53640x8a88f15() == 1) {
            size--;
        }
        if (size > abstractC12805xabdd4ef7.mo53647x8c6e4d5c()) {
            size = abstractC12805xabdd4ef7.mo53647x8c6e4d5c();
        }
        if (abstractC12805xabdd4ef7.m53640x8a88f15() == 1) {
            int i17 = size % m53638x2a647fd9;
            return (i17 == 0 ? size + 1 : size + ((m53638x2a647fd9 + 1) - i17)) + abstractC12805xabdd4ef7.m53640x8a88f15();
        }
        int i18 = size % m53638x2a647fd9;
        return i18 != 0 ? size + (m53638x2a647fd9 - i18) : size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.p1) k3Var;
        p1Var.f173566h.setVisibility(8);
        android.widget.ImageView imageView = p1Var.f173567i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef7 = this.f173550d;
        if (i17 >= ((java.util.ArrayList) abstractC12805xabdd4ef7.f173441f2).size() || i17 - abstractC12805xabdd4ef7.m53640x8a88f15() > abstractC12805xabdd4ef7.mo53647x8c6e4d5c()) {
            android.view.View view = p1Var.f173565g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            abstractC12805xabdd4ef7.j1(p1Var, null, i17);
            return;
        }
        android.view.View view2 = p1Var.f173565g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x) ((java.util.ArrayList) abstractC12805xabdd4ef7.f173441f2).get(i17);
        if (xVar != null) {
            p1Var.f173565g.setTag(xVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = xVar.f173617a;
        if (c11714x918fd2e4 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(c11714x918fd2e4.f157896f))) {
            android.widget.TextView textView = p1Var.f173566h;
            textView.setVisibility(0);
            textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(c11714x918fd2e4.f157896f));
        } else if (imageView != null && c11714x918fd2e4 != null && c11714x918fd2e4.f157905r) {
            imageView.setVisibility(0);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80788xabd630fc);
        }
        abstractC12805xabdd4ef7.j1(p1Var, xVar, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef7 = this.f173550d;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.p1(abstractC12805xabdd4ef7, com.p314xaae8f345.mm.ui.id.b(abstractC12805xabdd4ef7.f173439d2).inflate(abstractC12805xabdd4ef7.mo53643x2ee31f5b(), viewGroup, false));
    }
}
