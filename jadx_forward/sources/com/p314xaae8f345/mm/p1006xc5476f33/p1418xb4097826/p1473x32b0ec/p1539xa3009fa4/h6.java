package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class h6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 f198663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var) {
        super(0);
        this.f198663d = b8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        int a17 = (k0Var == null || (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) == null || (viewGroup = o9Var.f446856d) == null) ? 0 : com.p314xaae8f345.mm.ui.kk.a(viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = this.f198663d;
        android.view.View view = b8Var.f198474i;
        if (view != null) {
            com.p314xaae8f345.mm.ui.kk.f(view, 0);
            int height = view.getHeight() + com.p314xaae8f345.mm.ui.kk.a(view) + com.p314xaae8f345.mm.ui.kk.b(view) + view.getPaddingBottom() + view.getPaddingTop() + b8Var.f198488z;
            int i17 = a17 - height;
            int f17 = (i17 >= 0 ? i17 : 0) + i65.a.f(b8Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "[adjustPostBottomMargin] navigationBarHeight:" + b8Var.f198488z + ", postHeight:" + height + ", targetMargin:" + f17);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = f17;
                marginLayoutParams = marginLayoutParams2;
            }
            view.setLayoutParams(marginLayoutParams);
        }
        return jz5.f0.f384359a;
    }
}
