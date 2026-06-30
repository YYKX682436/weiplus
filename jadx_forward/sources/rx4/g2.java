package rx4;

/* loaded from: classes8.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(rx4.h2 h2Var) {
        super(0);
        this.f482690d = h2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ScrollView scrollView;
        rx4.h2 h2Var = this.f482690d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) h2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.cg7);
        if (frameLayout != null && (scrollView = h2Var.f482707p) != null) {
            float f17 = h2Var.m158354x19263085().getResources().getDisplayMetrics().density;
            java.lang.String str = h2Var.f482698d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest upgradeToNewLayout: replacing legacy layout with new layout");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) h2Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.jlt);
            if (viewGroup != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = viewGroup.getChildAt(i17);
                    sb6.append("[" + i17 + ']' + childAt.getClass().getSimpleName() + "(id=" + childAt.getId() + ",vis=" + childAt.getVisibility() + ") ");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest upgradeToNewLayout: mm_content_fl childCount=" + viewGroup.getChildCount() + ", children=" + ((java.lang.Object) sb6));
            }
            frameLayout.removeView(scrollView);
            android.view.View inflate = android.view.LayoutInflater.from(h2Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dun, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
            android.widget.ScrollView scrollView2 = (android.widget.ScrollView) inflate;
            frameLayout.addView(scrollView2);
            scrollView2.getViewTreeObserver().addOnScrollChangedListener(new rx4.c2(h2Var, scrollView2));
            scrollView2.getViewTreeObserver().addOnGlobalLayoutListener(new rx4.d2(h2Var, scrollView2, f17));
            scrollView2.setOnTouchListener(new rx4.e2(h2Var));
            h2Var.f482707p = scrollView2;
            pm0.v.X(new rx4.b1(h2Var));
            h2Var.f482717z = 0;
            scrollView2.post(new rx4.f2(h2Var, scrollView2, f17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest upgradeToNewLayout: re-render history and recommend after layout replacement");
            pf5.u uVar = pf5.u.f435469a;
            rx4.e0 e0Var = (rx4.e0) uVar.b(h2Var.m80379x76847179()).a(rx4.e0.class);
            e0Var.T6();
            pm0.v.X(new rx4.d0(e0Var, true));
            rx4.u0 u0Var = (rx4.u0) uVar.b(h2Var.m80379x76847179()).a(rx4.u0.class);
            u0Var.getClass();
            pm0.v.X(new rx4.t0(u0Var));
            p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.b(h2Var.m80379x76847179()).a(rx4.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            rx4.k0 k0Var = (rx4.k0) a17;
            p012xc85e97e9.p093xedfae76a.c1 a18 = uVar.b(h2Var.m80379x76847179()).a(rx4.s.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            rx4.s sVar = (rx4.s) a18;
            rx4.l lVar = k0Var.f482746h;
            rx4.d dVar = sVar.f482795g;
            if (lVar != null || dVar != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hitest upgradeToNewLayout: re-render hotspot/drama, hasHotspot=");
                sb7.append(lVar != null);
                sb7.append(", hasDrama=");
                sb7.append(dVar != null);
                sb7.append(", isTabModeActive=");
                sb7.append(h2Var.F);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
                if (h2Var.F) {
                    k0Var.V6(lVar, k0Var.f482744f, true);
                    sVar.a(dVar, sVar.f482794f);
                    pm0.v.X(new rx4.b2(h2Var, lVar, dVar));
                } else if (lVar != null) {
                    k0Var.V6(lVar, k0Var.f482744f, false);
                    android.view.View mo144222x4ff8c0f0 = h2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vbs);
                    if (mo144222x4ff8c0f0 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$upgradeToNewLayout$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$upgradeToNewLayout$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            h2Var.z7();
        }
        return jz5.f0.f384359a;
    }
}
