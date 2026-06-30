package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class zr extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b57;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        r45.l95 l95Var;
        r45.e95 e95Var;
        java.lang.String str;
        so2.k4 item = (so2.k4) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oov);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oou);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.iif);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.pmn);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.pmm);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.pml);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oor);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        r45.bw0 bw0Var = item.f491987d;
        r45.ub ubVar = (r45.ub) bw0Var.m75936x14adae67(2);
        if (ubVar != null) {
            i19 = ubVar.m75939xb282bd08(0);
            h0Var.f391656d = ubVar.m75945x2fec8307(1);
        } else {
            i19 = 0;
        }
        r45.v96 v96Var = (r45.v96) bw0Var.m75936x14adae67(0);
        if (v96Var != null && (l95Var = v96Var.f469542d) != null && (e95Var = l95Var.f460774d) != null) {
            if (textView != null) {
                textView.setText(e95Var.f454698e);
            }
            java.lang.String str2 = e95Var.f454712v;
            if (str2 == null || str2.length() == 0) {
                str = e95Var.f454701h;
            } else {
                str = e95Var.f454712v + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa + e95Var.f454701h;
            }
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiManageItemConvert", "auditResult： " + i19);
        android.content.Context context = holder.f374654e;
        if (i19 == 1) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setText(context.getText(com.p314xaae8f345.mm.R.C30867xcad56011.f573510eu0));
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            if (c22699x3dcdb3522 == null) {
                return;
            }
            c22699x3dcdb3522.setVisibility(8);
            return;
        }
        if (i19 == 2) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        if (i19 != 3) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.setVisibility(0);
        }
        if (textView3 != null) {
            textView3.setText(context.getText(com.p314xaae8f345.mm.R.C30867xcad56011.ety));
        }
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(0);
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yr(this, h0Var));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
