package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(288)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveVisitorRoleUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ProgressBar f109421w;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109420v = "FinderLiveVisitorRoleUI";

    /* renamed from: x, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f109422x = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6, reason: from getter */
    public java.lang.String getF109545t() {
        return this.f109420v;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b1e;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.live.viewmodel.v9.class, com.tencent.mm.plugin.finder.live.viewmodel.s8.class, com.tencent.mm.plugin.finder.live.viewmodel.z2.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList<r45.z63> list;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.eip);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.ld(this), com.tencent.mm.R.raw.icons_filled_close);
        this.f109421w = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.imc);
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f491498np5), new com.tencent.mm.plugin.finder.feed.ui.sd(this), null, com.tencent.mm.ui.fb.GREEN);
        ((com.tencent.mm.plugin.finder.live.viewmodel.v9) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.v9.class)).f117502x = false;
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = (com.tencent.mm.plugin.finder.live.viewmodel.v9) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.v9.class);
        long a17 = c01.id.a();
        v9Var.f117503y = 5;
        v9Var.f117504z = a17;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ru8);
        r45.a73 a73Var = (r45.a73) g92.b.f269769e.k2().e().getCustom(11);
        r45.a73 a73Var2 = null;
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(a73Var != null ? a73Var.toByteArray() : null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.a73 a73Var3 = new r45.a73();
        try {
            a73Var3.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(l17));
            a73Var2 = a73Var3;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
        }
        if (a73Var2 != null && (list = a73Var2.getList(0)) != null) {
            for (r45.z63 z63Var : list) {
                if (z63Var != null) {
                    zl2.r.f473938a.a(z63Var, "SimpleUIComponent_get");
                }
            }
        }
        if (a73Var2 != null) {
            java.util.LinkedList list2 = a73Var2.getList(0);
            if ((list2 == null || list2.isEmpty()) ? false : true) {
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(context).c(zy2.ra.class))).V6();
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById != null) {
                    findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.td(this, V6));
                }
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "4"), new jz5.l("type", "3"), new jz5.l("ref_scene", "5")), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)).toString(), null, null, false, 112, null);
                return;
            }
        }
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kotlinx.coroutines.z0.e(this.f109422x, null, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        jz5.f0 f0Var;
        boolean z17;
        super.onResume();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.qfz);
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.z2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        viewGroup.removeAllViews();
        r45.lc1 u47 = g92.b.f269769e.u4();
        r45.s02 s02Var = new r45.s02();
        s02Var.set(3, 2);
        s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
        android.view.View Q6 = ((com.tencent.mm.plugin.finder.live.viewmodel.z2) a17).Q6(u47, s02Var, false, true, false);
        if (Q6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(viewGroup, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(viewGroup, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.addView(Q6, new android.widget.RelativeLayout.LayoutParams(-1, -2));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.unu);
        int childCount = viewGroup2.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                z17 = false;
                break;
            }
            android.view.View childAt = viewGroup2.getChildAt(i17);
            z17 = true;
            if (childAt != null && childAt.getVisibility() == 0) {
                break;
            } else {
                i17++;
            }
        }
        if (z17) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.unr);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "checkOtherTitleShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "checkOtherTitleShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.unr);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "checkOtherTitleShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI", "checkOtherTitleShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(findViewById2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
