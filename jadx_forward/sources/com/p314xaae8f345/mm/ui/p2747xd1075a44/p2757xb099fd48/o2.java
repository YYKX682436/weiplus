package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes15.dex */
public class o2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {
    public o2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l2 l2Var) {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -1);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8020x7e414b06() == 0) {
            return;
        }
        m7996x5201473d(z2Var);
        int m8037x755bd410 = (m8037x755bd410() - m8028x805c2682()) - m8029x8b7f0b01();
        java.util.ArrayList arrayList = new java.util.ArrayList(m8020x7e414b06());
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = 0;
        for (int i18 = 0; i18 < m8020x7e414b06(); i18++) {
            android.view.View f17 = z2Var.f(i18);
            m7995x142d145d(f17, rect);
            i17 += rect.left + rect.right;
            arrayList.add(new android.util.Pair(f17, java.lang.Integer.valueOf(rect.left + rect.right)));
        }
        int m8028x805c2682 = m8028x805c2682();
        int m8031xf39fff7a = m8031xf39fff7a();
        int max = java.lang.Math.max(0, m8037x755bd410 - i17) / arrayList.size();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            mo8052x6ae7e3a1((android.view.View) pair.first, (m8037x755bd410 - max) - ((java.lang.Integer) pair.second).intValue(), 0);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) ((android.view.View) pair.first).getLayoutParams();
            mo7989xbb8aeee6((android.view.View) pair.first);
            int intValue = m8028x805c2682 + ((java.lang.Integer) pair.second).intValue() + max;
            m8049xe4474aed((android.view.View) pair.first, m8028x805c2682 + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, m8031xf39fff7a + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, intValue - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (((m8018x1c4fb41d() - m8031xf39fff7a()) - m8026xc96f6de6()) + m8031xf39fff7a) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            m8028x805c2682 = intValue;
        }
    }
}
