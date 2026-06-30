package bm2;

/* loaded from: classes3.dex */
public final class f8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.h8 f103433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.c8 f103434e;

    public f8(bm2.h8 h8Var, bm2.c8 c8Var) {
        this.f103433d = h8Var;
        this.f103434e = c8Var;
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAliasInfo");
            r45.of1 of1Var = (r45.of1) tag;
            int m75939xb282bd08 = of1Var.m75939xb282bd08(2);
            bm2.h8 h8Var = this.f103433d;
            h8Var.f103487g = m75939xb282bd08;
            yz5.l lVar = h8Var.f103484d;
            if (lVar != null) {
                lVar.mo146xb9724478(of1Var);
            }
        } else {
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context = this.f103434e.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r4Var.f3(context, "type error!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveVisitorRoleAdapter", "bindVisitorModeViewHolder it.tag:" + view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindVisitorModeViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
