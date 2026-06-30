package bm2;

/* loaded from: classes8.dex */
public final class l8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.p8 f103605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f103606e;

    public l8(bm2.p8 p8Var, r45.z22 z22Var) {
        this.f103605d = p8Var;
        this.f103606e = z22Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f103605d.f103766f;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f103606e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
