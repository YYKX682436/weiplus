package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class pl extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b5s;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.d2 item = (so2.d2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            holder.p(com.tencent.mm.R.id.l0f).setBackgroundResource(com.tencent.mm.R.drawable.f481816d45);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l0g);
        r45.c64 c64Var = item.f410312d;
        java.lang.String str = c64Var.f371311e;
        textView.setText(str == null || str.length() == 0 ? c64Var.A : c64Var.f371311e);
        holder.itemView.postDelayed(new com.tencent.mm.plugin.finder.convert.ol(this, holder, i17), 300L);
    }
}
