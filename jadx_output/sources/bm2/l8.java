package bm2;

/* loaded from: classes8.dex */
public final class l8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.p8 f22072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f22073e;

    public l8(bm2.p8 p8Var, r45.z22 z22Var) {
        this.f22072d = p8Var;
        this.f22073e = z22Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f22072d.f22233f;
        if (lVar != null) {
            lVar.invoke(this.f22073e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
