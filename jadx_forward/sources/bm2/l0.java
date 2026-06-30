package bm2;

/* loaded from: classes3.dex */
public final class l0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.b0 f103591e;

    public l0(bm2.v0 v0Var, bm2.b0 b0Var) {
        this.f103590d = v0Var;
        this.f103591e = b0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.q qVar = this.f103590d.f103903p;
        if (qVar != null) {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLivePromoteInfoAnchor");
            qVar.mo147xb9724478((r45.z42) tag, view, java.lang.Integer.valueOf(this.f103591e.m8183xf806b362()));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
