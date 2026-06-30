package bm2;

/* loaded from: classes10.dex */
public final class f7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f103428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f103429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f103430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hn2.d f103431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm2.t6 f103432h;

    public f7(int i17, r45.yx1 yx1Var, bm2.k7 k7Var, hn2.d dVar, bm2.t6 t6Var) {
        this.f103428d = i17;
        this.f103429e = yx1Var;
        this.f103430f = k7Var;
        this.f103431g = dVar;
        this.f103432h = t6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Request item position ");
        sb6.append(this.f103428d);
        sb6.append(", name ");
        r45.yx1 yx1Var = this.f103429e;
        sb6.append(yx1Var.f472999o.f452676d.f451884e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongPlayListAdapter", sb6.toString());
        bm2.k7 k7Var = this.f103430f;
        if (!k7Var.f103573i.q7(6)) {
            sf2.d3 d3Var = k7Var.f103573i;
            d3Var.f488639p = this.f103431g;
            d3Var.f488640q = 2;
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        bm2.t6 t6Var = this.f103432h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = t6Var.f103861s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22627xa933f8e4, "<get-btnProgress>(...)");
        k7Var.K(c22627xa933f8e4, true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = t6Var.f103854i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22661xa3a2b3c0, "<get-btnRequestSong>(...)");
        k7Var.K(c22661xa3a2b3c0, false);
        bm2.k7 k7Var2 = this.f103430f;
        k7Var2.I(2, bm2.y8.f103995e, k7Var2.f103574m, 1, yx1Var.f472999o.f452676d);
        bm2.t6 t6Var2 = this.f103432h;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = t6Var2.f374653d;
        bm2.k7 k7Var3 = this.f103430f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(k7Var3.f103573i, null, null, new bm2.e7(k7Var3, this.f103431g, y0Var, t6Var2, this.f103429e, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
