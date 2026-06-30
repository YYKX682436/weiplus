package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class gx extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_n;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.e5 item = (so2.e5) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ogs);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ohd);
        android.content.Context context = holder.f374654e;
        r45.r03 r03Var = item.f491863d;
        if (textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String m75945x2fec8307 = r03Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String concat = "#".concat(m75945x2fec8307);
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, concat));
        }
        if (item.f491865f) {
            if (item.f491866g) {
                if (textView != null) {
                    textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77656x773eb619));
                }
            } else if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            }
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            if (item.f491866g) {
                if (textView != null) {
                    textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77647x5878209d));
                }
            } else if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.1f);
        }
        if (p17 != null) {
            java.lang.CharSequence text = textView != null ? textView.getText() : null;
            p17.setTag(com.p314xaae8f345.mm.R.id.e7l, text != null ? text : "");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFilterConvert", "item hash:" + item.hashCode() + ", topic:" + r03Var.m75945x2fec8307(0) + ", selected:" + item.f491865f);
    }
}
