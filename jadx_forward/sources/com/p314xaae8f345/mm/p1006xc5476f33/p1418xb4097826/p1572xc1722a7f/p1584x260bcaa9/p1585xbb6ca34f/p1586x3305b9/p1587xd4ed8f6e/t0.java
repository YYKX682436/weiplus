package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class t0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f203476e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.s0 f203477f;

    public t0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f203476e = context;
        this.f203477f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.s0(this);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dvp;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.k item = (vp2.k) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        boolean z18 = true;
        if (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i = true;
        }
        java.util.ArrayList arrayList = item.f520464d;
        boolean isEmpty = arrayList.isEmpty();
        int i19 = 8;
        android.content.Context context = this.f203476e;
        if (isEmpty) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) holder.p(com.p314xaae8f345.mm.R.id.rjk);
            if (c2718xca2902ff != null) {
                c2718xca2902ff.setVisibility(8);
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.rjl);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6h));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.rjl);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) holder.p(com.p314xaae8f345.mm.R.id.rjk);
        if (c2718xca2902ff2 != null) {
            c2718xca2902ff2.setVisibility(0);
            c2718xca2902ff2.n();
            java.util.Iterator it = arrayList.iterator();
            int i27 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String title = (java.lang.String) next;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.r0(this, context, c2718xca2902ff2.l(), z18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
                android.widget.TextView textView3 = r0Var.f203444d;
                if (textView3 != null) {
                    textView3.setText(title);
                }
                r0Var.f203443c = i27;
                int size = arrayList.size();
                android.content.Context context2 = r0Var.f203441a;
                int b17 = i65.a.b(context2, 12);
                int b18 = i65.a.b(context2, i19);
                int b19 = i65.a.b(context2, 12);
                int b27 = i65.a.b(context2, i19);
                int i29 = r0Var.f203443c;
                if (i29 == 0) {
                    b17 = i65.a.b(context2, 16);
                } else if (i29 == size - 1) {
                    b19 = i65.a.b(context2, 16);
                }
                oa.i iVar = r0Var.f203442b;
                oa.k kVar = iVar.f425318h;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.v0.k(kVar, b17, b18, b19, b27);
                c2718xca2902ff2.d(iVar, false);
                i27 = i28;
                i19 = 8;
                z18 = true;
            }
            c2718xca2902ff2.K.clear();
            c2718xca2902ff2.a(this.f203477f);
            oa.i k17 = c2718xca2902ff2.k(0);
            if (k17 == null || k17.a()) {
                return;
            }
            k17.b();
        }
    }
}
