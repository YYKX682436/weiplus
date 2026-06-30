package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class tu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f104649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yu f104650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104651f;

    public tu(ya2.b2 b2Var, com.tencent.mm.plugin.finder.convert.yu yuVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f104649d = b2Var;
        this.f104650e = yuVar;
        this.f104651f = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        r45.xk b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder$bindMedia$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.yu yuVar = this.f104650e;
        ya2.b2 b2Var = this.f104649d;
        if (b2Var == null || (b17 = ya2.d.b(b2Var, false)) == null) {
            f0Var = null;
        } else {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String string = b17.getString(0);
            if (string == null) {
                string = "";
            }
            intent.putExtra("Contact_User", string);
            intent.putExtra("Contact_Scene", 213);
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("biz_profile_tab_type", 1);
            j45.l.j(yuVar.itemView.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            f0Var = jz5.f0.f302826a;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f104651f;
        if (f0Var == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_username", b2Var != null ? b2Var.D0() : null);
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            android.content.Context context = yuVar.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent2, baseFinderFeed.getItemId(), null, 0, 6, false, 0, baseFinderFeed.w(), 192, null);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context2 = yuVar.itemView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            i0Var.mk(context2, intent2);
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long itemId = baseFinderFeed.getItemId();
        android.content.Context context3 = yuVar.itemView.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        o3Var.Zi(4, itemId, xy2.c.d(context3), 1, b2Var != null ? b2Var.D0() : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder$bindMedia$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
