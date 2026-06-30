package bm2;

/* loaded from: classes10.dex */
public final class b7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f103333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f103334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f103335f;

    public b7(int i17, r45.yx1 yx1Var, bm2.k7 k7Var) {
        this.f103333d = i17;
        this.f103334e = yx1Var;
        this.f103335f = k7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Top item position ");
        int i17 = this.f103333d;
        sb6.append(i17);
        sb6.append(", name ");
        r45.yx1 yx1Var = this.f103334e;
        sb6.append(yx1Var.f472999o.f452676d.f451884e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongPlayListAdapter", sb6.toString());
        bm2.k7 k7Var = this.f103335f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = k7Var.f103575n;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba42 != null ? c1163xf1deaba42.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        java.lang.Integer valueOf = c1162x665295de != null ? java.lang.Integer.valueOf(c1162x665295de.w()) : null;
        if (i17 != 0) {
            ((java.util.ArrayList) k7Var.f103578q).remove(i17);
            ((java.util.ArrayList) k7Var.f103578q).add(0, new bm2.v6(bm2.w6.f103946f, this.f103334e, null, 4, null));
            k7Var.m8150x87567217(i17, 0);
            k7Var.m8151xc67946d3(0, i17 + 1);
            if (valueOf != null && valueOf.intValue() == 0 && (c1163xf1deaba4 = k7Var.f103575n) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = k7Var.f103576o;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bm2.a7(k7Var, yx1Var, null), 3, null);
            }
            bm2.k7 k7Var2 = this.f103335f;
            k7Var2.I(2, bm2.y8.f103996f, k7Var2.f103574m, 1, yx1Var.f472999o.f452676d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
