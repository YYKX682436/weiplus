package en4;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.uic.C18752xe045e0a7 f336874d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.uic.C18752xe045e0a7 c18752xe045e0a7) {
        this.f336874d = c18752xe045e0a7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/uic/TopStorySearchUIC$handleSearchButtonVisibility$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.uic.C18752xe045e0a7 c18752xe045e0a7 = this.f336874d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) ((jz5.n) c18752xe045e0a7.f256655d).mo141623x754a37bb();
        vm4.b bVar = new vm4.b(((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) ((jz5.n) c18752xe045e0a7.f256655d).mo141623x754a37bb()).h());
        j75.f m67437x4bd5310 = jVar.f256519d.m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.B3(bVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/uic/TopStorySearchUIC$handleSearchButtonVisibility$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
