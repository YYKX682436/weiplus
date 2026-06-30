package sj3;

/* loaded from: classes14.dex */
public class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f490311d;

    public u4(sj3.a5 a5Var) {
        this.f490311d = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f231677d++;
        sj3.a5 a5Var = this.f490311d;
        a5Var.getClass();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = a5Var.f489950d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = serviceConnectionC16581x3d1d6bd2.mo55332x76847179();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(mo55332x76847179, "android.permission.CAMERA", 22, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "summerper checkPermission checkcamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), serviceConnectionC16581x3d1d6bd2.mo55332x76847179());
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = a5Var.f489968y;
        if (!a17) {
            c16586x7058535b.m67074xdd7d58e5(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(220L, 26L, 1L, false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y()) {
            c16586x7058535b.m67074xdd7d58e5(false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().z()) {
            c16586x7058535b.m67074xdd7d58e5(false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(serviceConnectionC16581x3d1d6bd2)) {
            p21.i.b(serviceConnectionC16581x3d1d6bd2, com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu, null);
            c16586x7058535b.m67074xdd7d58e5(false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        long a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.a();
        if (a18 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onClickVideoAction, isOverLoadFail is true! videoWaitMills:%s", java.lang.Long.valueOf(a18));
            int ceil = (int) java.lang.Math.ceil(((float) a18) / 1000.0f);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2n, java.lang.Integer.valueOf(ceil)), 0).show();
            c16586x7058535b.m67074xdd7d58e5(false);
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        zj3.g gVar = zj3.g.f554835a;
        boolean a19 = c16586x7058535b.a();
        zj3.f fVar = zj3.g.f554853s;
        if (a19) {
            fVar.b();
            zj3.g.f554850p = true;
        } else {
            fVar.a();
        }
        if (c16586x7058535b.a()) {
            a5Var.u(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r3) com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().r()).a(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(5);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            i4Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "hy: onCameraStart");
            i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.n3(i4Var));
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().getClass();
        } else {
            a5Var.v(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Z(1, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.H();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().getClass();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().m().j()) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153139d;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
