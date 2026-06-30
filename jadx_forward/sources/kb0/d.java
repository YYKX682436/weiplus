package kb0;

/* loaded from: classes8.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb0.g f387727d;

    public d(kb0.g gVar) {
        this.f387727d = gVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openway/report/OpenWayListReporter$attach$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        yj0.a.h(this, "com/tencent/mm/feature/openway/report/OpenWayListReporter$attach$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        kb0.h hVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openway/report/OpenWayListReporter$attach$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        int w17 = c1162x665295de != null ? c1162x665295de.w() : 0;
        int y17 = c1162x665295de != null ? c1162x665295de.y() : 0;
        kb0.g gVar = this.f387727d;
        if (w17 <= y17) {
            while (true) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) kz5.n0.a0(gVar.f387732c, w17);
                if (wVar != null) {
                    gVar.f387738i.add(wVar);
                    if (wVar.f272552i) {
                        gVar.f387739j.add(wVar);
                    }
                }
                if (w17 == y17) {
                    break;
                } else {
                    w17++;
                }
            }
        }
        java.lang.ref.WeakReference weakReference = gVar.f387741l;
        if (weakReference != null && (hVar = (kb0.h) weakReference.get()) != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.k0) hVar).f272505a.getClass();
        }
        yj0.a.h(this, "com/tencent/mm/feature/openway/report/OpenWayListReporter$attach$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
