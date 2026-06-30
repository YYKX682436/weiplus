package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f101893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f101894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.o f101895f;

    public j(android.widget.ImageView imageView, com.tencent.mm.protocal.protobuf.FinderContact finderContact, com.tencent.mm.plugin.finder.activity.uic.o oVar) {
        this.f101893d = imageView;
        this.f101894e = finderContact;
        this.f101895f = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$setView$4$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f101893d.getContext();
        java.lang.String username = this.f101894e.getUsername();
        if (username == null) {
            username = "";
        }
        java.lang.String str = username;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SOURCE, 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        r45.r03 r03Var = (r45.r03) this.f101895f.f452719d;
        r45.e21 e21Var = r03Var != null ? (r45.e21) r03Var.getCustom(16) : null;
        com.tencent.mm.plugin.finder.activity.uic.o oVar = this.f101895f;
        kotlin.jvm.internal.o.d(context);
        kotlin.jvm.internal.o.d(jSONObject2);
        oVar.Y6(context, (r20 & 2) != 0 ? null : e21Var, str, (r20 & 8) != 0 ? "" : jSONObject2, (r20 & 16) != 0 ? "" : "link_editnote_avatar_profile", (r20 & 32) != 0 ? 0 : 1, (r20 & 64) != 0 ? 0 : 1, (r20 & 128) != 0 ? 59 : 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$setView$4$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
