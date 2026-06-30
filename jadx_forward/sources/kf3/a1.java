package kf3;

/* loaded from: classes.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc f388850d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc) {
        this.f388850d = activityC16486x3260b8cc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc.f230058q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc = this.f388850d;
        activityC16486x3260b8cc.getClass();
        android.content.Intent intent = new android.content.Intent(activityC16486x3260b8cc, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", activityC16486x3260b8cc.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6m));
        intent.putExtra("list_type", 0);
        intent.putExtra("list_attr", 64);
        intent.putExtra("menu_mode", 2);
        intent.putExtra("key_confirm_menu_name", activityC16486x3260b8cc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.df7));
        intent.putExtra("recommend_chatroom", true);
        intent.putExtra("need_show_expand_btn", true);
        intent.putExtra("default_multi_search", true);
        intent.putExtra("need_show_multiSelect_bottom", true);
        intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J1(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c(), ","));
        intent.putExtra("max_limit_num", if3.k0.Bi().c());
        intent.putExtra("too_many_member_tip_string", activityC16486x3260b8cc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m69, java.lang.Integer.valueOf(if3.k0.Bi().c())));
        intent.putExtra("too_many_member_tip_ok_string", activityC16486x3260b8cc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        pf5.j0.a(intent, kk5.q0.class);
        pf5.j0.a(intent, kk5.w.class);
        pf5.j0.a(intent, kk5.v0.class);
        pf5.j0.a(intent, cj5.d1.class);
        pf5.j0.a(intent, aj5.g1.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.u3.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        activityC16486x3260b8cc.startActivityForResult(intent, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
