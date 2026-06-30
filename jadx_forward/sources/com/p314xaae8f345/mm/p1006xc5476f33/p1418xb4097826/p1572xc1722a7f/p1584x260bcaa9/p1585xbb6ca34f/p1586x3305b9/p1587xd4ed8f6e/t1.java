package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes.dex */
public class t1 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public vp2.s f203478e;

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.el8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        boolean z18;
        java.lang.Object a07;
        r45.pw1 pw1Var;
        vp2.s item = (vp2.s) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f203478e = item;
        if (list == null || (a07 = kz5.n0.a0(list, 0)) == null || !(a07 instanceof dk2.zg)) {
            z18 = false;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consume payload ");
            dk2.zg zgVar = (dk2.zg) a07;
            r45.il0 il0Var = zgVar.f315976f;
            sb6.append(il0Var != null ? java.lang.Integer.valueOf(il0Var.m75939xb282bd08(0)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInteractionEntranceConvert", sb6.toString());
            r45.il0 il0Var2 = zgVar.f315976f;
            java.lang.Integer valueOf = il0Var2 != null ? java.lang.Integer.valueOf(il0Var2.m75939xb282bd08(0)) : null;
            vp2.s sVar = this.f203478e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, (sVar == null || (pw1Var = sVar.f520487d) == null) ? null : java.lang.Integer.valueOf(pw1Var.m75939xb282bd08(0)))) {
                r45.il0 il0Var3 = zgVar.f315976f;
                java.lang.String m75945x2fec8307 = il0Var3 != null ? il0Var3.m75945x2fec8307(1) : null;
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.u5a);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(m75945x2fec8307);
                    textView.setVisibility(0);
                }
            }
            z18 = true;
        }
        if (z18) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        android.content.Context context = holder.f374654e;
        layoutParams.width = (context.getResources().getDisplayMetrics().widthPixels - (i65.a.b(context, 12) * 3)) / 2;
        layoutParams.height = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        holder.f3639x46306858.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.u5_);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.u5b);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.u5a);
        r45.pw1 pw1Var2 = item.f520487d;
        textView2.setText(pw1Var2.m75945x2fec8307(1));
        java.lang.String m75945x2fec83072 = pw1Var2.m75945x2fec8307(2);
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(pw1Var2.m75945x2fec8307(2));
        }
        int m75939xb282bd08 = pw1Var2.m75939xb282bd08(0);
        if (m75939xb282bd08 == 1) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79176x608e1841);
            c22699x3dcdb352.m82040x7541828(-1);
        } else if (m75939xb282bd08 != 2) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79176x608e1841);
            c22699x3dcdb352.m82040x7541828(-1);
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80603x22730eba);
            c22699x3dcdb352.m82040x7541828(-1);
        }
        android.view.View view = holder.f3639x46306858;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(pw1Var2.m75945x2fec8307(1));
        java.lang.String m75945x2fec83073 = pw1Var2.m75945x2fec8307(2);
        if (!(m75945x2fec83073 == null || m75945x2fec83073.length() == 0)) {
            sb7.append(",");
            sb7.append(pw1Var2.m75945x2fec8307(2));
        }
        java.lang.String sb8 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        view.setContentDescription(sb8);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f203478e = null;
    }
}
