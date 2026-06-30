package bm2;

/* loaded from: classes.dex */
public final class g8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.h8 f103454d;

    public g8(bm2.h8 h8Var) {
        this.f103454d = h8Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindVisitorModeViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getTag() instanceof r45.of1) {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAliasInfo");
            r45.of1 of1Var = (r45.of1) tag;
            yz5.p pVar = this.f103454d.f103485e;
            if (pVar != null) {
                pVar.mo149xb9724478(of1Var, view);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindVisitorModeViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
