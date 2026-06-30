package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.o f101869d;

    public f(com.tencent.mm.plugin.finder.activity.uic.o oVar) {
        this.f101869d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.e21 e21Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.uic.o oVar = this.f101869d;
        android.app.Activity context = oVar.getContext();
        r45.r03 r03Var = (r45.r03) this.f101869d.f452719d;
        if (r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1)) == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        oVar.Y6(context, (r20 & 2) != 0 ? null : null, str, (r20 & 8) != 0 ? "" : null, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 59 : 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
