package bm2;

/* loaded from: classes10.dex */
public final class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f22161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.d f22162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.i6 f22163f;

    public n6(bm2.o6 o6Var, hn2.d dVar, bm2.i6 i6Var) {
        this.f22161d = o6Var;
        this.f22162e = dVar;
        this.f22163f = i6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter$bindSongItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.o6 o6Var = this.f22161d;
        if (!o6Var.f22196i.q7(o6Var.f22197m)) {
            sf2.d3 d3Var = o6Var.f22196i;
            d3Var.f407106p = this.f22162e;
            d3Var.f407107q = java.lang.Integer.valueOf(o6Var.f22199o.f390772d);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter$bindSongItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        bm2.i6 i6Var = this.f22163f;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = i6Var.f21981g;
        kotlin.jvm.internal.o.f(mMProcessBar, "<get-btnProgress>(...)");
        o6Var.K(mMProcessBar, true);
        com.tencent.mm.ui.widget.button.WeButton weButton = i6Var.f21980f;
        kotlin.jvm.internal.o.f(weButton, "<get-btnRequestSong>(...)");
        o6Var.K(weButton, false);
        bm2.i6 i6Var2 = this.f22163f;
        kotlinx.coroutines.y0 y0Var = i6Var2.f293120d;
        bm2.o6 o6Var2 = this.f22161d;
        com.tencent.mm.plugin.finder.live.util.y.d(o6Var2.f22196i, null, null, new bm2.m6(o6Var2, this.f22162e, y0Var, i6Var2, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter$bindSongItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
