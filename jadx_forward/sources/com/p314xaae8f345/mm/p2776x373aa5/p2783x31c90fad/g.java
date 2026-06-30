package com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad;

/* loaded from: classes15.dex */
public class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d f295192d;

    public g(com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar) {
        this.f295192d = dVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        ir.y0 x17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 != 0) {
            yj0.a.h(this, "com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f295192d;
        dVar.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            boolean z17 = false;
            android.view.View mo7935xa188593e = layoutManager.mo7935xa188593e(0);
            if (mo7935xa188593e != null && (x17 = dVar.f295174q.x(0)) != null && x17.f375452a.f375428a == 3 && w75.a.a() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                android.graphics.Rect rect = new android.graphics.Rect();
                c1163xf1deaba4.getGlobalVisibleRect(rect);
                android.graphics.Rect rect2 = new android.graphics.Rect();
                mo7935xa188593e.getGlobalVisibleRect(rect2);
                if (rect2.left >= rect.left && rect2.right <= rect.right && rect2.top >= rect.top && rect2.bottom <= rect.bottom) {
                    z17 = true;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "emoji search tab show");
                    dVar.b(dVar.f295157a);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
