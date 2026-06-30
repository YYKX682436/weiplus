package jn2;

/* loaded from: classes10.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.b1 f382287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.c1 f382288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ay1 f382289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jn2.w0 f382290g;

    public y0(jn2.b1 b1Var, jn2.c1 c1Var, r45.ay1 ay1Var, jn2.w0 w0Var) {
        this.f382287d = b1Var;
        this.f382288e = c1Var;
        this.f382289f = ay1Var;
        this.f382290g = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jn2.b1 b1Var = this.f382287d;
        if (b1Var.f382095h != jn2.u0.f382244d) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        jn2.c1 c1Var = this.f382288e;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = c1Var.f382103g;
        r45.ay1 ay1Var = this.f382289f;
        if (y0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorSingSongListAdapter", "Add song failed: panelScope is null, song=" + ay1Var.f451884e);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int ordinal = c1Var.f382104h.ordinal();
        if (ordinal == 0) {
            str = "Add song from board";
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            str = "Add song from search";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongListAdapter", str + ": " + ay1Var.f451884e + ", mid: " + ay1Var.f451883d);
        b1Var.j(jn2.u0.f382245e);
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.x0(this.f382288e, this.f382289f, this.f382290g, this.f382287d, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
