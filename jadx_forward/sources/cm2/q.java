package cm2;

/* loaded from: classes2.dex */
public final class q extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.alt;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.t63 t63Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        cm2.p item = (cm2.p) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.nz_);
        java.lang.String str = null;
        java.lang.Object Z = list != null ? kz5.n0.Z(list) : null;
        if (Z instanceof java.lang.String) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) Z;
            if (!(charSequence.length() == 0)) {
                textView.setText(charSequence);
                textView.setAlpha(1.0f);
            }
        }
        r45.xq1 xq1Var = item.f124909g;
        if (xq1Var != null && (t63Var = (r45.t63) xq1Var.m75936x14adae67(0)) != null && (m75941xfb821914 = t63Var.m75941xfb821914(0)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.u24) obj).m75939xb282bd08(1) == xq1Var.m75939xb282bd08(1)) {
                        break;
                    }
                }
            }
            r45.u24 u24Var = (r45.u24) obj;
            if (u24Var != null) {
                str = u24Var.m75945x2fec8307(0);
            }
        }
        textView.setText(str);
        textView.setAlpha(1.0f);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
