package bm2;

/* loaded from: classes3.dex */
public final class f8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.h8 f21900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.c8 f21901e;

    public f8(bm2.h8 h8Var, bm2.c8 c8Var) {
        this.f21900d = h8Var;
        this.f21901e = c8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindVisitorModeViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof r45.of1) {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAliasInfo");
            r45.of1 of1Var = (r45.of1) tag;
            int integer = of1Var.getInteger(2);
            bm2.h8 h8Var = this.f21900d;
            h8Var.f21954g = integer;
            yz5.l lVar = h8Var.f21951d;
            if (lVar != null) {
                lVar.invoke(of1Var);
            }
        } else {
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.content.Context context = this.f21901e.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r4Var.f3(context, "type error!");
            com.tencent.mars.xlog.Log.e("FinderLiveVisitorRoleAdapter", "bindVisitorModeViewHolder it.tag:" + view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindVisitorModeViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
