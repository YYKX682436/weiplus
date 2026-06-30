package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class g8 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f198650e;

    public g8(yz5.p switchChangedCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchChangedCallback, "switchChangedCallback");
        this.f198650e = switchChangedCallback;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ar9;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h8 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h8) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.nu_);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) holder.p(com.p314xaae8f345.mm.R.id.ntc);
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.z63 z63Var = item.f198665d;
        java.lang.String m75945x2fec8307 = z63Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        objArr[0] = m75945x2fec8307;
        textView.setText(holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgv, objArr));
        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z63Var.m75939xb282bd08(2) == 1);
        viewOnClickListenerC22631x1cc07cc8.setEnabled(true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("item ");
        sb6.append(z63Var.m75945x2fec8307(1));
        sb6.append(": ");
        sb6.append(z63Var.m75939xb282bd08(2) == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f8(item, holder, this, viewOnClickListenerC22631x1cc07cc8));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
