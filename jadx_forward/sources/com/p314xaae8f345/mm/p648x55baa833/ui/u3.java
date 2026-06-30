package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class u3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f146097a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p648x55baa833.ui.v3 f146098b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f146099c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f146100d = false;

    public u3(java.util.List list, com.p314xaae8f345.mm.p648x55baa833.ui.v3 v3Var) {
        this.f146097a = list;
        this.f146098b = v3Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: clearView */
    public void mo8113xb4407692(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        super.mo8113xb4407692(c1163xf1deaba4, k3Var);
        this.f146100d = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(3, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onChildDraw */
    public void mo8128xf876e561(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, float f17, float f18, int i17, boolean z17) {
        if (this.f146099c) {
            android.view.ViewPropertyAnimator animate = k3Var.f3639x46306858.animate();
            k3Var.f3639x46306858.setTranslationZ(20.0f);
            animate.start();
            this.f146099c = false;
        }
        if (this.f146100d) {
            android.view.ViewPropertyAnimator animate2 = k3Var.f3639x46306858.animate();
            k3Var.f3639x46306858.setTranslationZ(0.0f);
            animate2.start();
            this.f146100d = false;
            this.f146099c = true;
        }
        super.mo8128xf876e561(canvas, c1163xf1deaba4, k3Var, f17, f18, i17, z17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2) {
        int m8183xf806b362 = k3Var.m8183xf806b362();
        int m8183xf806b3622 = k3Var2.m8183xf806b362();
        java.util.List list = this.f146097a;
        if (m8183xf806b362 < m8183xf806b3622) {
            int i17 = m8183xf806b362;
            while (i17 < m8183xf806b3622) {
                int i18 = i17 + 1;
                java.util.Collections.swap(list, i17, i18);
                i17 = i18;
            }
        } else {
            for (int i19 = m8183xf806b362; i19 > m8183xf806b3622; i19--) {
                java.util.Collections.swap(list, i19, i19 - 1);
            }
        }
        c1163xf1deaba4.mo7946xf939df19().m8150x87567217(m8183xf806b362, m8183xf806b3622);
        com.p314xaae8f345.mm.p648x55baa833.ui.v3 v3Var = this.f146098b;
        if (v3Var != null) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10344x9fa852c8 activityC10344x9fa852c8 = ((com.p314xaae8f345.mm.p648x55baa833.ui.p3) v3Var).f145955a;
            activityC10344x9fa852c8.f145316s = true;
            activityC10344x9fa852c8.U6();
        }
        k3Var.f3639x46306858.performHapticFeedback(0, 2);
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSelectedChanged */
    public void mo8134xb54743ba(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
    }
}
