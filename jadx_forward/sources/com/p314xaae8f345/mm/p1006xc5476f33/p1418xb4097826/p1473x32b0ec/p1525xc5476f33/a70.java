package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class a70 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f193352d = new java.util.ArrayList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return Integer.MAX_VALUE;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c70 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c70) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f193352d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70 b70Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70) arrayList.get(i17 % arrayList.size());
        java.lang.String str = b70Var.f193516b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (str != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(str, null, 2, null);
            android.view.View view = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
            a17.c(nVar, (android.widget.ImageView) view, g1Var.h(mn2.f1.f411490h));
        } else {
            android.graphics.Bitmap bitmap = b70Var.f193515a;
            if (bitmap != null) {
                android.view.View view2 = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.widget.ImageView");
                ((android.widget.ImageView) view2).setImageBitmap(bitmap);
            } else {
                f0Var = null;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onBindViewHolder: empty data:" + b70Var + " for position:" + (i17 % arrayList.size()));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        int i18 = (int) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70.W;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i18, i18);
        marginLayoutParams.setMarginStart((int) parent.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1));
        marginLayoutParams.setMarginEnd((int) parent.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1));
        imageView.setLayoutParams(marginLayoutParams);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c70(imageView);
    }
}
