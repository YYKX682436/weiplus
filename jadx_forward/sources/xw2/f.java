package xw2;

/* loaded from: classes2.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f539223d;

    public f(xw2.s sVar) {
        this.f539223d = sVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/base/PagerRowView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.h3 h3Var;
        java.lang.Object mo144003x754a37bb;
        int i19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/base/PagerRowView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        xw2.s sVar = this.f539223d;
        int m8020x7e414b06 = sVar.f539254i.m8020x7e414b06();
        int y17 = sVar.f539254i.y();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) sVar.m176119xa0ab20ce()).f216101f;
        do {
            h3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var;
            mo144003x754a37bb = h3Var.mo144003x754a37bb();
            xw2.t tVar = (xw2.t) mo144003x754a37bb;
            i19 = tVar.f539259c;
            tVar.getClass();
        } while (!h3Var.j(mo144003x754a37bb, new xw2.t(m8020x7e414b06, y17, i19)));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
