package rj5;

/* loaded from: classes10.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rj5.e f477912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f477913e;

    public d(rj5.e eVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f477912d = eVar;
        this.f477913e = f0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController$installListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f477913e.f391649d = i17;
        rj5.e eVar = this.f477912d;
        if (i17 == 0) {
            eVar.getClass();
            eVar.c(rj5.a.f477904d);
        } else {
            eVar.getClass();
            eVar.c(rj5.a.f477905e);
        }
        yj0.a.h(this, "com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController$installListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController$installListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        rj5.e eVar = this.f477912d;
        float mo162529x9746038c = eVar.mo162529x9746038c();
        java.util.Iterator it = eVar.f477911c.f291321d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2734x9d861347.AbstractC22476xceb0af4c) it.next()).b(mo162529x9746038c);
        }
        if (this.f477913e.f391649d != 0) {
            eVar.c(rj5.a.f477905e);
        }
        yj0.a.h(this, "com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController$installListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
