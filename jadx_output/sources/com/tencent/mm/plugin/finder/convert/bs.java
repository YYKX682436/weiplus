package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class bs extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b5a;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.l95 l95Var;
        r45.e95 e95Var;
        so2.m4 item = (so2.m4) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindViewHolder], ");
        r45.ao5 ao5Var = item.f410481d;
        sb6.append(ao5Var);
        com.tencent.mars.xlog.Log.i("FinderPoiRelateConvert", sb6.toString());
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ooy);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oox);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.p(com.tencent.mm.R.id.bdj);
        if (checkBox != null) {
            checkBox.setChecked(item.f410482e);
        }
        r45.v96 v96Var = (r45.v96) ao5Var.getCustom(0);
        if (v96Var == null || (l95Var = v96Var.f388009d) == null || (e95Var = l95Var.f379241d) == null) {
            return;
        }
        if (textView != null) {
            textView.setText(e95Var.f373165e);
        }
        java.lang.String str = e95Var.f373179v + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + e95Var.f373168h;
        if (textView2 == null) {
            return;
        }
        textView2.setText(str);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
