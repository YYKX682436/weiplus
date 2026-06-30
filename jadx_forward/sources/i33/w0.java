package i33;

/* loaded from: classes10.dex */
public final class w0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.y0 f369816d;

    public w0(i33.y0 y0Var) {
        this.f369816d = y0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        java.lang.String str = this.f369816d.f369823f;
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.Set set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i18 == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        i33.y0 y0Var = this.f369816d;
        i33.t0 t0Var = (i33.t0) ((jz5.n) y0Var.f369825h).mo141623x754a37bb();
        if (t0Var != null && t0Var.f369781g) {
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        j33.x xVar = y0Var.f369824g;
        if ((xVar != null && xVar.f379005i) && xVar != null && !xVar.f379004h) {
            if (xVar.f379006m == null || xVar.f379007n == null) {
                xVar.f379005i = false;
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = xVar.f379000d;
                int w17 = c1162x665295de.w();
                int y17 = c1162x665295de.y();
                e06.k kVar = xVar.f379006m;
                e06.k kVar2 = null;
                java.lang.String str = xVar.f379003g;
                if (kVar != null && w17 < kVar.f327742d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkInvalidRecheckUnBindRange: up range null, vis:[" + w17 + ',' + y17 + ']');
                    xVar.f379006m = null;
                }
                e06.k kVar3 = xVar.f379007n;
                if (kVar3 != null && y17 > kVar3.f327743e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkInvalidRecheckUnBindRange: down range null, vis:[" + w17 + ',' + y17 + ']');
                    xVar.f379007n = null;
                }
                e06.k kVar4 = xVar.f379007n;
                if (kVar4 != null || xVar.f379006m != null) {
                    e06.k kVar5 = xVar.f379006m;
                    if (kVar5 != null && w17 >= kVar5.f327742d && w17 <= kVar5.f327743e) {
                        kVar2 = kVar5;
                    } else if (kVar4 != null && y17 >= kVar4.f327742d && y17 <= kVar4.f327743e) {
                        kVar2 = kVar4;
                    }
                }
                if (kVar2 != null) {
                    e06.k kVar6 = new e06.k(w17, y17);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    kz5.x0 it = kVar6.iterator();
                    while (true) {
                        boolean z17 = ((e06.j) it).f327747f;
                        set = xVar.f379008o;
                        if (!z17) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        int intValue = ((java.lang.Number) next).intValue();
                        if (!set.contains(java.lang.Integer.valueOf(intValue)) && kVar2.m(intValue)) {
                            arrayList2.add(next);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ((java.lang.Number) kz5.n0.X(arrayList2)).intValue();
                        ((java.lang.Number) kz5.n0.i0(arrayList2)).intValue();
                        java.util.Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            int intValue2 = ((java.lang.Number) it6.next()).intValue();
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = xVar.f379001e;
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4.p0(intValue2);
                            if (p07 != null) {
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
                                if (mo7946xf939df19 != null) {
                                    mo7946xf939df19.mo864xe5e2e48d(p07, intValue2);
                                }
                                set.add(java.lang.Integer.valueOf(intValue2));
                            }
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
