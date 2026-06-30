package bd4;

/* loaded from: classes4.dex */
public final class d2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f19308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f19310f;

    public d2(android.view.View view, bd4.f2 f2Var, boolean z17) {
        this.f19308d = view;
        this.f19309e = f2Var;
        this.f19310f = z17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$$inlined$doOnPreDraw$1");
        this.f19308d.getViewTreeObserver().removeOnPreDrawListener(this);
        bd4.f2 f2Var = this.f19309e;
        wl5.x m17 = f2Var.m();
        android.util.Pair e17 = m17 != null ? m17.e() : null;
        java.lang.Integer num = e17 != null ? (java.lang.Integer) e17.first : null;
        boolean z17 = false;
        int intValue = num == null ? 0 : num.intValue();
        java.lang.Integer num2 = e17 != null ? (java.lang.Integer) e17.second : null;
        int intValue2 = num2 == null ? 0 : num2.intValue();
        int i17 = intValue2 - 1;
        if (i17 < intValue) {
            i17 = intValue;
        }
        wl5.x m18 = f2Var.m();
        if (m18 != null) {
            m18.N = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isCollapsed$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z18 = f2Var.f19330k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isCollapsed$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            boolean s17 = f2Var.s(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (s17) {
                wl5.x m19 = f2Var.m();
                if (m19 != null) {
                    m19.f();
                }
                bd4.f2.a(f2Var).postDelayed(new bd4.e2(f2Var, this.f19310f), 200L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$$inlined$doOnPreDraw$1");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isCollapsed$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z19 = f2Var.f19330k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isCollapsed$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (z19) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            boolean s18 = f2Var.s(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (s18) {
                wl5.x m27 = f2Var.m();
                if (m27 != null) {
                    m27.f();
                }
                wl5.x m28 = f2Var.m();
                if (m28 != null) {
                    android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) m28.f447164i.getSystemService("accessibility");
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                        z17 = true;
                    }
                    if (!z17) {
                        if (m28.f447155a == null) {
                            m28.j();
                        }
                        m28.p(m28.f447155a);
                        wl5.q qVar = m28.f447157b;
                        if (qVar != null) {
                            qVar.f447130d.dismiss();
                        }
                    }
                }
                bd4.f2.a(f2Var).postDelayed(new bd4.e2(f2Var, this.f19310f), 200L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$$inlined$doOnPreDraw$1");
                return true;
            }
        }
        wl5.x m29 = f2Var.m();
        if (m29 != null) {
            m29.s(intValue, intValue2);
        }
        wl5.x m37 = f2Var.m();
        if (m37 != null) {
            m37.f();
        }
        wl5.x m38 = f2Var.m();
        if (m38 != null) {
            m38.o();
        }
        bd4.f2.a(f2Var).postDelayed(new bd4.e2(f2Var, this.f19310f), 200L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$$inlined$doOnPreDraw$1");
        return true;
    }
}
