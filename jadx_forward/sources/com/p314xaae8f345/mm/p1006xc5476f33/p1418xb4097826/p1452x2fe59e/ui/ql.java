package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class ql implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c f191994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191995e;

    public ql(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c activityC14095xead19c0c, android.view.View view) {
        this.f191994d = activityC14095xead19c0c;
        this.f191995e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c activityC14095xead19c0c = this.f191994d;
        boolean z17 = activityC14095xead19c0c.f191090u;
        hy2.g gVar = hy2.g.f367591a;
        int i17 = 11;
        android.view.View view2 = this.f191995e;
        if (z17) {
            java.lang.String str2 = gVar.b() + ":00";
            java.lang.String str3 = "0" + gVar.a() + ":00";
            if (activityC14095xead19c0c.f191091v != 7) {
                i17 = activityC14095xead19c0c.f191090u ? 6 : 5;
            } else if (!activityC14095xead19c0c.f191090u) {
                i17 = 10;
            }
            str = "finder_limit_curfew_" + c01.id.e();
            string = view2.getResources().getString(activityC14095xead19c0c.f191091v == 7 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574377i36 : com.p314xaae8f345.mm.R.C30867xcad56011.f6w, str2, str3);
        } else {
            int c17 = gVar.c() / 60;
            if (activityC14095xead19c0c.f191091v != 7) {
                i17 = activityC14095xead19c0c.f191090u ? 6 : 5;
            } else if (!activityC14095xead19c0c.f191090u) {
                i17 = 10;
            }
            str = "finder_limit_time_lock_" + c01.id.e();
            string = view2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573635f72, java.lang.Integer.valueOf(c17));
        }
        java.lang.String str4 = string;
        int i18 = i17;
        java.lang.String str5 = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHotWordTimelineUI", "key: " + str5);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).u6(view2.getContext(), i18, str5, view2.getResources().getString(activityC14095xead19c0c.f191091v == 7 ? com.p314xaae8f345.mm.R.C30867xcad56011.i3b : com.p314xaae8f345.mm.R.C30867xcad56011.f7d), str4, "", null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pl(activityC14095xead19c0c));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
