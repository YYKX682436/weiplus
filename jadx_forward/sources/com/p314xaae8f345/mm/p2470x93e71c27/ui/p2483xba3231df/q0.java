package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class q0 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e5c;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Integer num;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w data = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.h(holder, data, i17, i18, z17, list);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0 o0Var = data.f272550g;
        if (o0Var != null && (num = o0Var.f270925d) != null) {
            int intValue = num.intValue();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.h6y);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(intValue);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.odf);
        if (textView == null) {
            return;
        }
        textView.setText(data.a());
    }
}
