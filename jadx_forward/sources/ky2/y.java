package ky2;

/* loaded from: classes.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.z f395134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395135e;

    public y(ky2.z zVar, int i17) {
        this.f395134d = zVar;
        this.f395135e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteHistoryAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ky2.z zVar = this.f395134d;
        yz5.l lVar = zVar.f395137e;
        if (lVar != null) {
            java.lang.Object obj = zVar.f395136d.get(this.f395135e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            lVar.mo146xb9724478(obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteHistoryAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
