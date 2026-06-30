package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.o f101865d;

    public e(com.tencent.mm.plugin.finder.activity.uic.o oVar) {
        this.f101865d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.uic.o oVar = this.f101865d;
        android.app.Activity context = oVar.getContext();
        long j17 = oVar.T;
        r45.r03 r03Var = (r45.r03) oVar.f452719d;
        jz5.f0 f0Var = null;
        r45.e21 e21Var = r03Var != null ? (r45.e21) r03Var.getCustom(16) : null;
        oVar.getClass();
        if (e21Var != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) e21Var.getCustom(15);
            if (finderJumpInfo != null) {
                oVar.W6(context, j17, e21Var, finderJumpInfo, "feed_jumpicon");
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                oVar.X6(context, j17, e21Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
