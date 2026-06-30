package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34;

/* loaded from: classes10.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l f210549d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l lVar) {
        this.f210549d = lVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 c15104x4e0baa10;
        int i19;
        yz5.a aVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 c15416x1f1f78b7 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7) layoutManager : null;
        java.lang.String str2 = "onScrolled";
        if (c15416x1f1f78b7 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        int[] iArr = new int[c15416x1f1f78b7.f93453d];
        c15416x1f1f78b7.u(iArr);
        java.lang.Integer j07 = kz5.z.j0(iArr);
        int intValue = j07 != null ? j07.intValue() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l lVar = this.f210549d;
        java.util.Iterator it = lVar.f210557c.f210545d.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.c cVar = (in5.c) next;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.n nVar = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.n ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.n) cVar : null;
            if (nVar != null && intValue >= i27) {
                android.widget.TextView textView = lVar.f210569o;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dateHeaderTv");
                    throw null;
                }
                str = str2;
                textView.setText(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().c(new java.util.Date(nVar.f210572d), lVar.f210555a));
            } else {
                str = str2;
            }
            str2 = str;
            i27 = i28;
        }
        java.lang.String str3 = str2;
        if (i18 > 0 && (i19 = (c15104x4e0baa10 = lVar.f210556b).B) > 0) {
            int[] iArr2 = new int[c15416x1f1f78b7.f93453d];
            c15416x1f1f78b7.v(iArr2);
            java.lang.Integer h07 = kz5.z.h0(iArr2);
            if (lVar.f210557c.f210545d.size() - (h07 != null ? h07.intValue() : 0) <= i19 && (aVar = c15104x4e0baa10.C) != null) {
                aVar.mo152xb9724478();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", str3, "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
