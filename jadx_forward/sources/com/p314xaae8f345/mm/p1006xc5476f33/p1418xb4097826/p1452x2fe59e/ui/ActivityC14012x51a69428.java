package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 288)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Landroid/view/View;", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "Landroid/view/View;", "getIdGroup", "()Landroid/view/View;", "setIdGroup", "(Landroid/view/View;)V", "idGroup", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveMoreOptionSettingUI */
/* loaded from: classes.dex */
public final class ActivityC14012x51a69428 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public android.view.View idGroup;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: X6 */
    public java.lang.String getF191078t() {
        return "FinderLiveMoreOptionSettingUI";
    }

    public final void d7() {
        java.lang.Object obj;
        java.util.LinkedList a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.a();
        int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
        android.view.View view = this.idGroup;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ruj) : null;
        if (textView == null) {
            return;
        }
        java.util.Iterator it = a17.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.of1) obj).m75939xb282bd08(2) == m75939xb282bd08) {
                    break;
                }
            }
        }
        r45.of1 of1Var = (r45.of1) obj;
        textView.setText(of1Var != null ? of1Var.m75945x2fec8307(0) : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.avm;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{id2.s4.class, id2.o.class, id2.f5.class, id2.b2.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.r8.class)), pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.q8.class)), pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.s8.class))});
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001 && i18 == -1) {
            d7();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList<r45.z63> m75941xfb821914;
        android.view.View view;
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.dyl);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.va(this));
        this.idGroup = findViewById(com.p314xaae8f345.mm.R.id.ruh);
        if (zl2.q4.f555466a.g()) {
            android.view.View view2 = this.idGroup;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            d7();
            android.view.View view3 = this.idGroup;
            if (view3 != null) {
                view3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wa(this));
            }
        } else {
            android.view.View view4 = this.idGroup;
            if (view4 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (getIntent().getBooleanExtra("intent_status_from_privacy_to_video_setting", false) && (view = this.idGroup) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ru8);
        r45.a73 a73Var = (r45.a73) g92.b.f351302e.k2().e().m75936x14adae67(11);
        r45.a73 a73Var2 = null;
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(a73Var != null ? a73Var.mo14344x5f01b1f6() : null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.a73 a73Var3 = new r45.a73();
        try {
            a73Var3.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(l17));
            a73Var2 = a73Var3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
        }
        if (a73Var2 != null && (m75941xfb821914 = a73Var2.m75941xfb821914(0)) != null) {
            for (r45.z63 z63Var : m75941xfb821914) {
                if (z63Var != null) {
                    zl2.r.f555471a.a(z63Var, "SimpleUIComponent_get");
                }
            }
        }
        if (a73Var2 != null) {
            java.util.LinkedList m75941xfb8219142 = a73Var2.m75941xfb821914(0);
            if ((m75941xfb8219142 == null || m75941xfb8219142.isEmpty()) ? false : true) {
                if (findViewById != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById != null) {
                    findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xa(this));
                    return;
                }
                return;
            }
        }
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setIdGroup */
    public final void m56578x126f7b62(android.view.View view) {
        this.idGroup = view;
    }
}
