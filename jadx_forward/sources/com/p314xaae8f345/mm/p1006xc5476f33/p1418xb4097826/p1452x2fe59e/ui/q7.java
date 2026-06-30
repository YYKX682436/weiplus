package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class q7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lo1 f191979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13987x4e1170fd f191980e;

    public q7(r45.lo1 lo1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13987x4e1170fd activityC13987x4e1170fd) {
        this.f191979d = lo1Var;
        this.f191980e = activityC13987x4e1170fd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI$buildSettingLayout$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.lo1 lo1Var = this.f191979d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) lo1Var.m75936x14adae67(0);
        if (c19786x6a1e2862 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13987x4e1170fd activityC13987x4e1170fd = this.f191980e;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13987x4e1170fd.mo55332x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = mo55332x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) mo55332x76847179 : null;
            if (abstractActivityC15087xee12defa == null || (str = java.lang.Integer.valueOf(abstractActivityC15087xee12defa.getD()).toString()) == null) {
                str = "";
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f409573e;
            a4Var.b(str, b17, "person_page_ext_entrance", "{\"entrance_id\":\"" + lo1Var.m75939xb282bd08(2) + "\"}");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC13987x4e1170fd.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, mo55332x768471792, p0Var, 0, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI$buildSettingLayout$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
