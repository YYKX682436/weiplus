package bm2;

/* loaded from: classes10.dex */
public final class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f103694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.d f103695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.i6 f103696f;

    public n6(bm2.o6 o6Var, hn2.d dVar, bm2.i6 i6Var) {
        this.f103694d = o6Var;
        this.f103695e = dVar;
        this.f103696f = i6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter$bindSongItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.o6 o6Var = this.f103694d;
        if (!o6Var.f103729i.q7(o6Var.f103730m)) {
            sf2.d3 d3Var = o6Var.f103729i;
            d3Var.f488639p = this.f103695e;
            d3Var.f488640q = java.lang.Integer.valueOf(o6Var.f103732o.f472305d);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter$bindSongItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        bm2.i6 i6Var = this.f103696f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = i6Var.f103514g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22627xa933f8e4, "<get-btnProgress>(...)");
        o6Var.K(c22627xa933f8e4, true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = i6Var.f103513f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22661xa3a2b3c0, "<get-btnRequestSong>(...)");
        o6Var.K(c22661xa3a2b3c0, false);
        bm2.i6 i6Var2 = this.f103696f;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = i6Var2.f374653d;
        bm2.o6 o6Var2 = this.f103694d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(o6Var2.f103729i, null, null, new bm2.m6(o6Var2, this.f103695e, y0Var, i6Var2, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter$bindSongItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
