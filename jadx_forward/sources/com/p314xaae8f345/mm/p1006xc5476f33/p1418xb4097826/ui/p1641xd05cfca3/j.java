package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3;

/* loaded from: classes14.dex */
public final class j implements p012xc85e97e9.p075x2eaf9f.p079xd1075a44.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t f211199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f211200b;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t tVar, android.view.ViewGroup viewGroup) {
        this.f211199a = tVar;
        this.f211200b = viewGroup;
    }

    @Override // p012xc85e97e9.p075x2eaf9f.p079xd1075a44.o
    public final void a(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 v17, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t tVar = this.f211199a;
        android.view.ViewGroup.LayoutParams layoutParams = tVar.m60958x4905e9fa().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i28 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        android.view.ViewGroup viewGroup = this.f211200b;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i29 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        if (i18 < (((v17.getChildAt(0).getMeasuredHeight() - v17.getMeasuredHeight()) - viewGroup.getMeasuredHeight()) - i28) - (i29 + ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin)) {
            tVar.f211232v = false;
        } else {
            tVar.f211232v = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t.P6(tVar);
        }
    }
}
