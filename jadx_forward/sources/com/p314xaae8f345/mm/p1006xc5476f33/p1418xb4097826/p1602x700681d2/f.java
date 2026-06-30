package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 f203832d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 c14604x9e435b69) {
        this.f203832d = c14604x9e435b69;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer$Companion$createDrawerToAttachWindow$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.k.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69.G, this.f203832d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer$Companion$createDrawerToAttachWindow$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer$Companion$createDrawerToAttachWindow$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 c14604x9e435b69 = this.f203832d;
        if (c14604x9e435b69.E) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.k.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69.G, c14604x9e435b69);
        }
        c14604x9e435b69.E = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer$Companion$createDrawerToAttachWindow$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
