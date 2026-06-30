package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.o f101904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f101905e;

    public l(com.tencent.mm.plugin.finder.activity.uic.o oVar, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.f101904d = oVar;
        this.f101905e = finderContact;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$showBottomSheet$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.uic.o oVar = this.f101904d;
        android.app.Activity context = oVar.getContext();
        java.lang.String username = this.f101905e.getUsername();
        if (username == null) {
            username = "";
        }
        java.lang.String str = username;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SOURCE, 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        r45.r03 r03Var = (r45.r03) oVar.f452719d;
        r45.e21 e21Var = r03Var != null ? (r45.e21) r03Var.getCustom(16) : null;
        com.tencent.mm.plugin.finder.activity.uic.o oVar2 = this.f101904d;
        kotlin.jvm.internal.o.d(jSONObject2);
        oVar2.Y6(context, e21Var, str, jSONObject2, "link_editnote_avatar_profile", 1, 2, 131);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$showBottomSheet$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
