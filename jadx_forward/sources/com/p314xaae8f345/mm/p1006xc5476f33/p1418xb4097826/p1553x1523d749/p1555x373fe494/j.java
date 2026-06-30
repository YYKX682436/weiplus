package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494;

/* loaded from: classes.dex */
public final class j extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.atr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.z2 item = (so2.z2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.q94 q94Var = item.f492264d;
        java.util.LinkedList m75941xfb821914 = q94Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRecord_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.xc5) next).m75939xb282bd08(0) == 2) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        java.util.LinkedList m75941xfb8219142 = q94Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getRecord_list(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb8219142) {
            if (((r45.xc5) obj).m75939xb282bd08(0) == 1) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        android.content.Context context = holder.f374654e;
        if (size > 0 || size2 > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (size > 0) {
                sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nri, java.lang.Integer.valueOf(size)));
            }
            if (sb6.length() > 0) {
                sb6.append(",");
            }
            if (size2 > 0) {
                sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nre, java.lang.Integer.valueOf(size2)));
            }
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ir6)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrf, sb6.toString()));
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ir6)).setText("");
        }
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.irm)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqq, k35.m1.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqs), q94Var.m75939xb282bd08(2) * 1000)));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
