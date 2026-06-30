package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class xm extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public r45.fd2 f104962e;

    public xm(r45.fd2 fd2Var) {
        this.f104962e = fd2Var;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488992b00;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.fd2 fd2Var;
        so2.u2 item = (so2.u2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fmb);
        r45.fd2 fd2Var2 = item.f410635d;
        if (textView != null) {
            textView.setText(fd2Var2.getString(1));
        }
        r45.fd2 fd2Var3 = this.f104962e;
        if ((fd2Var3 == null || (fd2Var = (r45.fd2) fd2Var3.getCustom(3)) == null || fd2Var.getInteger(0) != fd2Var2.getInteger(0)) ? false : true) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.fmc);
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
            return;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.fmc);
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
