package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class l extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105257e;

    public l(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var) {
        this.f105257e = e0Var;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489079ee0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.c item = (zb2.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.uwg);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.pj2 pj2Var = item.f471259d;
        r45.ft4 ft4Var = (r45.ft4) pj2Var.getCustom(0);
        sb6.append(ft4Var != null ? ft4Var.getInteger(0) : 0);
        sb6.append('-');
        r45.ft4 ft4Var2 = (r45.ft4) pj2Var.getCustom(0);
        sb6.append(ft4Var2 != null ? ft4Var2.getInteger(1) : 0);
        textView.setText(sb6.toString());
        if (this.f105257e.f105234x == i17) {
            textView.setAlpha(1.0f);
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        } else {
            textView.setAlpha(0.55f);
            com.tencent.mm.ui.bk.t0(textView.getPaint());
        }
    }
}
