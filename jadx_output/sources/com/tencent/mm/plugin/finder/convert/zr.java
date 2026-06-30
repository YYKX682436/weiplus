package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class zr extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b57;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        r45.l95 l95Var;
        r45.e95 e95Var;
        java.lang.String str;
        so2.k4 item = (so2.k4) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oov);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oou);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.iif);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.pmn);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.pmm);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.pml);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oor);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        r45.bw0 bw0Var = item.f410454d;
        r45.ub ubVar = (r45.ub) bw0Var.getCustom(2);
        if (ubVar != null) {
            i19 = ubVar.getInteger(0);
            h0Var.f310123d = ubVar.getString(1);
        } else {
            i19 = 0;
        }
        r45.v96 v96Var = (r45.v96) bw0Var.getCustom(0);
        if (v96Var != null && (l95Var = v96Var.f388009d) != null && (e95Var = l95Var.f379241d) != null) {
            if (textView != null) {
                textView.setText(e95Var.f373165e);
            }
            java.lang.String str2 = e95Var.f373179v;
            if (str2 == null || str2.length() == 0) {
                str = e95Var.f373168h;
            } else {
                str = e95Var.f373179v + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + e95Var.f373168h;
            }
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderPoiManageItemConvert", "auditResult： " + i19);
        android.content.Context context = holder.f293121e;
        if (i19 == 1) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setText(context.getText(com.tencent.mm.R.string.f491977eu0));
            }
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            if (weImageView2 == null) {
                return;
            }
            weImageView2.setVisibility(8);
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
        if (weImageView3 != null) {
            weImageView3.setVisibility(0);
        }
        if (textView3 != null) {
            textView3.setText(context.getText(com.tencent.mm.R.string.ety));
        }
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.convert.yr(this, h0Var));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
