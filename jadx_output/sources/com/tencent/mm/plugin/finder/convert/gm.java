package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gm extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.axw;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.g2 item = (so2.g2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("FinderLivePurchaseListConvert", "bind view ");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.d5j);
        r45.s11 s11Var = item.f410359d;
        java.lang.String string = s11Var.getString(9);
        if (string == null) {
            string = "";
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (p17 != null) {
            g1Var.f().c(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128356f), (com.tencent.mm.ui.widget.MMRoundCornerImageView) p17, g1Var.h(mn2.f1.f329953d));
        }
        vo0.d a17 = g1Var.a();
        java.lang.String string2 = s11Var.getString(2);
        if (string2 == null) {
            string2 = "";
        }
        mn2.n nVar = new mn2.n(string2, null, 2, null);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.d5l);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f329957h));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.d5o);
        java.lang.String string3 = s11Var.getString(0);
        if (string3 == null) {
            string3 = "";
        }
        textView.setText(string3);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.d5n);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        android.widget.TextView textView2 = (android.widget.TextView) p19;
        java.lang.String string4 = s11Var.getString(6);
        if (string4 == null) {
            string4 = "";
        }
        textView2.setText(string4);
        java.lang.String string5 = s11Var.getString(7);
        if (string5 == null) {
            string5 = "";
        }
        if (string5.length() == 0) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.d5k)).setVisibility(8);
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.d5k)).setText("");
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.d5k)).setVisibility(0);
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.d5k)).setText(string5);
        }
        java.lang.String string6 = s11Var.getString(8);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.d5m)).setText(string6 != null ? string6 : "");
        android.view.View p27 = holder.p(com.tencent.mm.R.id.d5o);
        kotlin.jvm.internal.o.f(p27, "getView(...)");
        android.widget.TextView textView3 = (android.widget.TextView) p27;
        android.view.View p28 = holder.p(com.tencent.mm.R.id.d5n);
        kotlin.jvm.internal.o.f(p28, "getView(...)");
        textView3.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.convert.fm(textView3, this, (android.widget.TextView) p28));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.d5o)).getPaint(), 0.8f);
    }
}
