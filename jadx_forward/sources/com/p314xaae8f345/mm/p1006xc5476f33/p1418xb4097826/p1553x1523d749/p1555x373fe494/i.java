package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494;

/* loaded from: classes.dex */
public final class i extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ats;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.y2 item = (so2.y2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.f374658i = item;
        android.content.Context context = holder.f374654e;
        android.content.res.Resources resources = context.getResources();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ir8);
        r45.xc5 xc5Var = item.f492257d;
        java.lang.String m75945x2fec8307 = xc5Var.m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        textView.setText(m75945x2fec8307);
        java.lang.String m75945x2fec83072 = xc5Var.m75945x2fec8307(2);
        java.lang.String str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.isl);
            textView2.setText(str);
            textView2.getVisibility();
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.isl)).getVisibility();
        }
        if (xc5Var.m75939xb282bd08(0) == 2) {
            holder.p(com.p314xaae8f345.mm.R.id.uda).setBackgroundColor(android.graphics.Color.parseColor("#215CB5"));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.ud_)).m82040x7541828(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.ud_)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79754x23e1a05d, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay)));
        } else {
            holder.p(com.p314xaae8f345.mm.R.id.uda).setBackgroundColor(android.graphics.Color.parseColor("#FA5151"));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.ud_)).m82040x7541828(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.ud_)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79892x630439a8, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay)));
        }
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ir8)).setText(k35.m1.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ley), xc5Var.m75942xfb822ef2(1) * 1000));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
