package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public class t3 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f203481e;

    /* renamed from: f, reason: collision with root package name */
    public final float f203482f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.q f203483g;

    public t3(int i17, float f17, sp2.k kVar, yz5.q optionClickHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionClickHandler, "optionClickHandler");
        this.f203481e = i17;
        this.f203482f = f17;
        this.f203483g = optionClickHandler;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eiy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        dk2.hc hcVar;
        int i19;
        dk2.ic icVar;
        android.view.View view;
        int i27;
        vp2.h0 item = (vp2.h0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i28 = 0;
        java.util.List i29 = kz5.c0.i(holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.unc), holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.und), holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.une));
        int i37 = this.f203481e;
        int i38 = (int) (this.f203482f * i37);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.s3 s3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.s3(this, i38);
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ukh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        s3Var.mo146xb9724478(findViewById);
        dk2.bc bcVar = item.f520458e;
        if (bcVar == null || (hcVar = bcVar.f314789c) == null) {
            return;
        }
        ((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.vfm)).setText(hcVar.f315115d);
        dk2.ic icVar2 = item.f520460g;
        dk2.dc dcVar = item.f520459f;
        if (dcVar != null) {
            dcVar.d(hcVar);
        }
        java.util.Iterator it = i29.iterator();
        while (it.hasNext()) {
            ((android.widget.Button) it.next()).setVisibility(8);
        }
        int i39 = 0;
        for (java.lang.Object obj : kz5.n0.K0(hcVar.f315116e, 3)) {
            int i47 = i39 + 1;
            if (i39 < 0) {
                kz5.c0.p();
                throw null;
            }
            dk2.ic icVar3 = (dk2.ic) obj;
            android.widget.Button button = (android.widget.Button) kz5.n0.a0(i29, i39);
            if (button != null) {
                button.setVisibility(i28);
                button.setText(icVar3.f315156b);
                icVar = icVar2;
                view = findViewById;
                i27 = i38;
                button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.r3(item, this, i29, i39, icVar3, i17, holder));
                button.setSelected(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(icVar3, icVar));
            } else {
                icVar = icVar2;
                view = findViewById;
                i27 = i38;
            }
            icVar2 = icVar;
            i39 = i47;
            findViewById = view;
            i38 = i27;
            i28 = 0;
        }
        android.view.View view2 = findViewById;
        int i48 = i38;
        android.content.Context context = holder.f374654e;
        float q17 = i65.a.q(context);
        int paddingLeft = i37 - (view2.getPaddingLeft() + view2.getPaddingRight());
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.nei);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.vfm);
        if (i29.isEmpty()) {
            i19 = 0;
        } else {
            java.util.Iterator it6 = i29.iterator();
            i19 = 0;
            while (it6.hasNext()) {
                if ((((android.widget.Button) it6.next()).getVisibility() == 0) && (i19 = i19 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), 0);
        int measuredHeight = textView.getMeasuredHeight();
        float b17 = i65.a.b(context, 34) * q17;
        java.util.Iterator it7 = i29.iterator();
        while (it7.hasNext()) {
            ((android.widget.Button) it7.next()).getLayoutParams().height = (int) b17;
        }
        findViewById2.getLayoutParams().height = (int) e06.p.e(((i48 - measuredHeight) - (i19 > 0 ? (b17 * i19) + ((q17 * i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn)) * (i19 - 1)) : 0.0f)) - (r5 * 2), i65.a.b(context, 4), i65.a.b(context, 32));
        findViewById2.requestLayout();
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }
}
