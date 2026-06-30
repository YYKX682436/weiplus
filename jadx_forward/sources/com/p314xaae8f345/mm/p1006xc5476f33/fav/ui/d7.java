package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class d7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 f182107d;

    public d7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var) {
        this.f182107d = z7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "[handleDownMenu] click, show menu");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.f182107d;
        z7Var.f183194g.f();
        z7Var.f183194g.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c7(z7Var));
        z7Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = z7Var.f183188a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a ? (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a) abstractActivityC21394xb3d2c0cf : null;
        java.lang.String str = activityC13579xef51058a != null ? activityC13579xef51058a.Y : null;
        if (str == null) {
            str = "";
        }
        hashMap.put("fav_homepage_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_filter_unfold", "view_clk", hashMap, 32903);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
