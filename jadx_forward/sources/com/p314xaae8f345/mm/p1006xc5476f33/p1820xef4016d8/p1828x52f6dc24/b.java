package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24;

/* loaded from: classes10.dex */
public class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f227283f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f227284g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f227285h = false;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        return this.f227285h ? e(layoutManager) : new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.a(this, this.f227284g, layoutManager);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        android.view.View f17 = super.f(layoutManager);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < layoutManager.m8008x3d79f549(); i19++) {
            android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i19);
            if (m8007x6a486239 == f17) {
                i17 = i19;
            }
            if (m8007x6a486239 == this.f227283f) {
                i18 = i19;
            }
        }
        int i27 = i17 - i18;
        return i27 > 1 ? layoutManager.mo7935xa188593e(i18 + 1) : i27 < -1 ? layoutManager.mo7935xa188593e(i18 - 1) : f17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        android.view.View n17;
        int i19;
        int i27;
        if (layoutManager.m8020x7e414b06() == 0 || (n17 = n(layoutManager)) == null) {
            return -1;
        }
        android.view.View view = this.f227283f;
        if (view != null && view != n17) {
            n17 = view;
        }
        int m8032xa86cd69f = layoutManager.m8032xa86cd69f(n17);
        return (i17 < 100 || (i27 = m8032xa86cd69f + 1) >= layoutManager.m8020x7e414b06()) ? (i17 > -100 || (i19 = m8032xa86cd69f + (-1)) < 0) ? m8032xa86cd69f : i19 : i27;
    }

    public android.view.View n(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        android.view.View view = null;
        if (m8008x3d79f549 == 0) {
            return null;
        }
        new android.graphics.Rect();
        int m8028x805c2682 = layoutManager.m8009xf2b87f0() ? layoutManager.m8028x805c2682() + (((layoutManager.m8037x755bd410() - layoutManager.m8028x805c2682()) - layoutManager.m8029x8b7f0b01()) / 2) : layoutManager.m8037x755bd410() / 2;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
            android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i18);
            int m8012x7f0ab3e8 = layoutManager.m8012x7f0ab3e8(m8007x6a486239) - ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) m8007x6a486239.getLayoutParams())).leftMargin;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) m8007x6a486239.getLayoutParams();
            int abs = java.lang.Math.abs((m8012x7f0ab3e8 + (((layoutManager.m8014x2ea13bdf(m8007x6a486239) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin) / 2)) - m8028x805c2682);
            if (abs < i17) {
                view = m8007x6a486239;
                i17 = abs;
            }
        }
        return view;
    }
}
