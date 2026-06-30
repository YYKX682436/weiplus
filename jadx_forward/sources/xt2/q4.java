package xt2;

/* loaded from: classes3.dex */
public final class q4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nt2 f538503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.r4 f538504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(xt2.b5 b5Var, r45.nt2 nt2Var, xt2.r4 r4Var) {
        super(3);
        this.f538502d = b5Var;
        this.f538503e = nt2Var;
        this.f538504f = r4Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        xt2.b5 b5Var = this.f538502d;
        if (booleanValue) {
            boolean z17 = intValue == 1;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = b5Var.f538171m;
            if (viewOnClickListenerC22631x1cc07cc8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productReplaySwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
            android.view.View view = b5Var.f538174p;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("optionParent");
                throw null;
            }
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = b5Var.f538176r;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoChooseIcon");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = b5Var.f538177s;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("manualChooseIcon");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
            r45.nt2 nt2Var = this.f538503e;
            nt2Var.set(0, valueOf);
            nt2Var.set(1, java.lang.Integer.valueOf(intValue2));
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = b5Var.f538171m;
            if (viewOnClickListenerC22631x1cc07cc82 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productReplaySwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(null);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = b5Var.f538171m;
            if (viewOnClickListenerC22631x1cc07cc83 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productReplaySwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc83.m81392x52cfa5c6(!viewOnClickListenerC22631x1cc07cc83.f292896x);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b5Var.f538169h;
            db5.t7.g(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573313e75));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc84 = b5Var.f538171m;
            if (viewOnClickListenerC22631x1cc07cc84 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productReplaySwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc84.postDelayed(new xt2.p4(b5Var, this.f538504f), 100L);
        }
        return jz5.f0.f384359a;
    }
}
