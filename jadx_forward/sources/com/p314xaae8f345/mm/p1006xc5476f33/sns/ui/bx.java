package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class bx implements android.view.View.OnClickListener {
    public bx(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw kwVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$24");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineClickEvent", "appbrandHomeRedirectListener");
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$24");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720) view.getTag();
        r45.y87 y87Var = c19807x593d1720.f39044xb84ea7e1;
        if (y87Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener username is null");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$24");
            return;
        }
        java.lang.String str = y87Var.f472397d;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineClickEvent", "username: " + str);
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str;
        nxVar.f89002d = 1009;
        nxVar.f89003e = c19807x593d1720.Id + ":" + c19807x593d1720.f39018xf3f56116;
        nxVar.f89019u = c19807x593d1720.Id;
        nxVar.f89021w = 2;
        nxVar.f89020v = c19807x593d1720.f39018xf3f56116;
        c6113xa3727625.e();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$24");
    }
}
