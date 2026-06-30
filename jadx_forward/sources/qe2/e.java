package qe2;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 f443575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f443576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe2.c f443577f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, android.content.Context context, qe2.c cVar) {
        this.f443575d = e0Var;
        this.f443576e = context;
        this.f443577f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this.f443575d, false, 1, null);
        android.content.Context context = this.f443576e;
        qe2.c cVar = this.f443577f;
        if (!(cVar.f443568a.length() == 0)) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", cVar.f443568a);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).mk(context, intent);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.CoAuthorSheet", th6, "jumpToProfile error", new java.lang.Object[0]);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
