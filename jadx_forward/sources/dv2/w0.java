package dv2;

/* loaded from: classes2.dex */
public final class w0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.a1 f325500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1616x70e39459.C14928x5c34302c f325501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f325502f;

    public w0(dv2.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1616x70e39459.C14928x5c34302c c14928x5c34302c, android.widget.Button button) {
        this.f325500d = a1Var;
        this.f325501e = c14928x5c34302c;
        this.f325502f = button;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1616x70e39459.C14928x5c34302c c14928x5c34302c = this.f325501e;
            dv2.a1 a1Var = this.f325500d;
            int O6 = dv2.a1.O6(a1Var, c14928x5c34302c);
            if (O6 >= 0 && O6 < a1Var.f325340e.size()) {
                java.lang.Object obj = a1Var.f325340e.get(O6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                this.f325502f.setEnabled(((r45.m66) obj).m75939xb282bd08(2) > 0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = a1Var.f325344i;
            if (c22848x6ddd90cf != null) {
                int i18 = 0;
                for (java.lang.Object obj2 : c22848x6ddd90cf.m82898xfb7e5820()) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    ((vs2.a) obj2).f521405e = O6 == i18;
                    i18 = i19;
                }
                c22848x6ddd90cf.m8146xced61ae5();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
