package bm2;

/* loaded from: classes10.dex */
public final class f7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f21896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f21897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hn2.d f21898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm2.t6 f21899h;

    public f7(int i17, r45.yx1 yx1Var, bm2.k7 k7Var, hn2.d dVar, bm2.t6 t6Var) {
        this.f21895d = i17;
        this.f21896e = yx1Var;
        this.f21897f = k7Var;
        this.f21898g = dVar;
        this.f21899h = t6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Request item position ");
        sb6.append(this.f21895d);
        sb6.append(", name ");
        r45.yx1 yx1Var = this.f21896e;
        sb6.append(yx1Var.f391466o.f371143d.f370351e);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongPlayListAdapter", sb6.toString());
        bm2.k7 k7Var = this.f21897f;
        if (!k7Var.f22040i.q7(6)) {
            sf2.d3 d3Var = k7Var.f22040i;
            d3Var.f407106p = this.f21898g;
            d3Var.f407107q = 2;
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        bm2.t6 t6Var = this.f21899h;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = t6Var.f22328s;
        kotlin.jvm.internal.o.f(mMProcessBar, "<get-btnProgress>(...)");
        k7Var.K(mMProcessBar, true);
        com.tencent.mm.ui.widget.button.WeButton weButton = t6Var.f22321i;
        kotlin.jvm.internal.o.f(weButton, "<get-btnRequestSong>(...)");
        k7Var.K(weButton, false);
        bm2.k7 k7Var2 = this.f21897f;
        k7Var2.I(2, bm2.y8.f22462e, k7Var2.f22041m, 1, yx1Var.f391466o.f371143d);
        bm2.t6 t6Var2 = this.f21899h;
        kotlinx.coroutines.y0 y0Var = t6Var2.f293120d;
        bm2.k7 k7Var3 = this.f21897f;
        com.tencent.mm.plugin.finder.live.util.y.d(k7Var3.f22040i, null, null, new bm2.e7(k7Var3, this.f21898g, y0Var, t6Var2, this.f21896e, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
