package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class e4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f198609d = new java.util.ArrayList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f198609d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d4 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d4) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4 data = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4) this.f198609d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 no0Var = data.f198503b;
        android.view.View view = no0Var.f195201d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view.getParent(), holder.f3639x46306858)) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            android.view.View view2 = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) view2).addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        no0Var.b(data);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159(context);
        c22645x24069159.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        c22645x24069159.m81436x205ac394(i65.a.a(parent.getContext(), 12.0f));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d4(c22645x24069159);
    }
}
