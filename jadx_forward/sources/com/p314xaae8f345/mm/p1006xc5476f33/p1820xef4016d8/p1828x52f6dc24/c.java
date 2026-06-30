package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24;

/* loaded from: classes15.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.e {
    public c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        super(layoutManager, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.e
    public int a(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        return this.f227286a.m8014x2ea13bdf(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.e
    public int b(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        return this.f227286a.m8013x8bb7462e(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.e
    public int c() {
        return this.f227286a.m8028x805c2682();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.e
    public int d() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f227286a;
        return (layoutManager.m8037x755bd410() - layoutManager.m8028x805c2682()) - layoutManager.m8029x8b7f0b01();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.e
    public int e() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f227286a;
        return (layoutManager.m8018x1c4fb41d() - layoutManager.m8031xf39fff7a()) - layoutManager.m8026xc96f6de6();
    }
}
