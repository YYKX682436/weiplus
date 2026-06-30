package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class bs extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b5a;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.l95 l95Var;
        r45.e95 e95Var;
        so2.m4 item = (so2.m4) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindViewHolder], ");
        r45.ao5 ao5Var = item.f492014d;
        sb6.append(ao5Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiRelateConvert", sb6.toString());
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ooy);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oox);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.p(com.p314xaae8f345.mm.R.id.bdj);
        if (checkBox != null) {
            checkBox.setChecked(item.f492015e);
        }
        r45.v96 v96Var = (r45.v96) ao5Var.m75936x14adae67(0);
        if (v96Var == null || (l95Var = v96Var.f469542d) == null || (e95Var = l95Var.f460774d) == null) {
            return;
        }
        if (textView != null) {
            textView.setText(e95Var.f454698e);
        }
        java.lang.String str = e95Var.f454712v + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa + e95Var.f454701h;
        if (textView2 == null) {
            return;
        }
        textView2.setText(str);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
