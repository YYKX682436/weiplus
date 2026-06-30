package xn2;

/* loaded from: classes2.dex */
public final class d1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f537018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f537019e;

    public d1(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, xn2.f1 f1Var) {
        this.f537018d = f0Var;
        this.f537019e = f1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$rv$2$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f537018d;
            if (f0Var.f391649d > 0) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l lVar = new jz5.l("page_name", "TopStoryFinderLongVideoListPage");
                iy1.c cVar = iy1.c.MainUI;
                jz5.l lVar2 = new jz5.l("page_id", 50030);
                xn2.f1 f1Var = this.f537019e;
                ((cy1.a) rVar).yj("page_slide_down", null, kz5.c1.k(lVar, lVar2, new jz5.l("finder_context_id", ((xn2.p0) f1Var.f537026e).f537077b), new jz5.l("comment_scene", 281), new jz5.l("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(f1Var.mo978x19263085()))), 1, true);
            }
            f0Var.f391649d = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$rv$2$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$rv$2$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f537018d.f391649d += i18;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$rv$2$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
