package xx0;

/* loaded from: classes5.dex */
public final class a0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f539385d;

    public a0(xx0.d0 d0Var) {
        this.f539385d = d0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        e06.k kVar = new e06.k(w17, ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).y());
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar, this.f539385d.f539416n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateTabPageView", "onScrolled tab: " + this.f539385d.f539410e.f521572a + ", currentVisibleTemplatePositionRange: " + kVar);
        }
        if (this.f539385d.f539417o) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539385d.f539416n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE))) {
                int i19 = kVar.f327743e;
                if (w17 <= i19) {
                    while (true) {
                        this.f539385d.f539414i.B(w17);
                        if (w17 == i19) {
                            break;
                        } else {
                            w17++;
                        }
                    }
                }
            } else {
                java.util.Iterator it = kz5.n0.G0(kVar, this.f539385d.f539416n).iterator();
                while (it.hasNext()) {
                    this.f539385d.f539414i.B(((java.lang.Number) it.next()).intValue());
                }
                java.util.Iterator it6 = kz5.n0.G0(this.f539385d.f539416n, kVar).iterator();
                while (it6.hasNext()) {
                    this.f539385d.f539414i.z(((java.lang.Number) it6.next()).intValue());
                }
            }
        }
        this.f539385d.f539416n = kVar;
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
