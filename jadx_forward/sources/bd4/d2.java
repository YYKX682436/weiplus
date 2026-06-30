package bd4;

/* loaded from: classes4.dex */
public final class d2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f100841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f100842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f100843f;

    public d2(android.view.View view, bd4.f2 f2Var, boolean z17) {
        this.f100841d = view;
        this.f100842e = f2Var;
        this.f100843f = z17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$$inlined$doOnPreDraw$1");
        this.f100841d.getViewTreeObserver().removeOnPreDrawListener(this);
        bd4.f2 f2Var = this.f100842e;
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isCollapsed$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z18 = f2Var.f100863k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isCollapsed$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            boolean s17 = f2Var.s(intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (s17) {
                wl5.x m19 = f2Var.m();
                if (m19 != null) {
                    m19.f();
                }
                bd4.f2.a(f2Var).postDelayed(new bd4.e2(f2Var, this.f100843f), 200L);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$$inlined$doOnPreDraw$1");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isCollapsed$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z19 = f2Var.f100863k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isCollapsed$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            boolean s18 = f2Var.s(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (s18) {
                wl5.x m27 = f2Var.m();
                if (m27 != null) {
                    m27.f();
                }
                wl5.x m28 = f2Var.m();
                if (m28 != null) {
                    android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) m28.f528697i.getSystemService("accessibility");
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                        z17 = true;
                    }
                    if (!z17) {
                        if (m28.f528688a == null) {
                            m28.j();
                        }
                        m28.p(m28.f528688a);
                        wl5.q qVar = m28.f528690b;
                        if (qVar != null) {
                            qVar.f528663d.dismiss();
                        }
                    }
                }
                bd4.f2.a(f2Var).postDelayed(new bd4.e2(f2Var, this.f100843f), 200L);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$$inlined$doOnPreDraw$1");
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
        bd4.f2.a(f2Var).postDelayed(new bd4.e2(f2Var, this.f100843f), 200L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$$inlined$doOnPreDraw$1");
        return true;
    }
}
