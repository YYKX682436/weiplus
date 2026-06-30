package cq4;

/* loaded from: classes10.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d f303014d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d) {
        this.f303014d = c18833x82cf22d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogThumbView", "onScrollStateChanged: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f303014d;
        if (i17 == 0) {
            if (c18833x82cf22d.A) {
                c18833x82cf22d.f257673n = true;
                bp4.c0 c0Var = c18833x82cf22d.f257684y;
                if (c0Var != null) {
                    c0Var.mo10984xc84dc82d();
                }
                c18833x82cf22d.A = false;
            }
            c18833x82cf22d.I = false;
        } else if (i17 == 1) {
            if (!c18833x82cf22d.I) {
                c18833x82cf22d.m72717xe9cb6c80(c18833x82cf22d.getScrollCount() + 1);
            }
            c18833x82cf22d.I = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        int i19;
        bp4.c0 c0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f303014d;
        boolean z17 = c18833x82cf22d.B;
        if (z17) {
            c18833x82cf22d.f257675p += i17;
        }
        int i27 = c18833x82cf22d.f257675p;
        if (!c18833x82cf22d.f257673n && z17 && (i19 = c18833x82cf22d.f257670h) > 0 && i17 != 0 && (c0Var = c18833x82cf22d.f257684y) != null) {
            long j17 = c18833x82cf22d.f257672m;
            long j18 = c18833x82cf22d.f257671i;
            bp4.c0.m(c0Var, (((j17 - j18) * i27) / i19) + j18, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
