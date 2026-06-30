package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.o f101862d;

    public d(com.tencent.mm.plugin.finder.activity.uic.o oVar) {
        this.f101862d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.e21 e21Var;
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.uic.o oVar = this.f101862d;
        r45.r03 r03Var = (r45.r03) oVar.f452719d;
        if (r03Var != null && (e21Var = (r45.e21) r03Var.getCustom(16)) != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) e21Var.getCustom(19);
            if (finderJumpInfo != null) {
                oVar.W6(oVar.getContext(), oVar.T, e21Var, finderJumpInfo, "feed_jumpicon");
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                oVar.X6(oVar.getContext(), oVar.T, e21Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
