package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/PagerLayoutManager;", "Lcom/tencent/mm/plugin/finder/view/manager/FinderLinearLayoutManager;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.PagerLayoutManager */
/* loaded from: classes10.dex */
public final class C15375x376f9a40 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15375x376f9a40(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: measureChildWithMargins */
    public void mo8052x6ae7e3a1(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        android.view.ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PagerLayoutManager", "measureChildWithMargins: lp is null");
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        m7995x142d145d(child, rect);
        child.measure(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(m8037x755bd410(), m8038xfc57f9d3(), ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i17 + rect.left + rect.right, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width, getF180019n()), p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(m8018x1c4fb41d(), m8019x47130b60(), ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i18 + rect.top + rect.bottom, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height, getF204840r()));
    }
}
