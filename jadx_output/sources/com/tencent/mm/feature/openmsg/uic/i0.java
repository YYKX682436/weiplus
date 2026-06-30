package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes3.dex */
public final class i0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.n0 f67339e;

    public i0(com.tencent.mm.feature.openmsg.uic.n0 n0Var) {
        this.f67339e = n0Var;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.elk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.feature.openmsg.uic.j0 item = (com.tencent.mm.feature.openmsg.uic.j0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.tencent.mm.R.id.t3n);
        boolean z18 = item.f67342d;
        com.tencent.mm.feature.openmsg.uic.n0 n0Var = this.f67339e;
        if (z18) {
            kotlin.jvm.internal.o.d(relativeLayout);
            com.tencent.mm.feature.openmsg.uic.n0.U6(n0Var, relativeLayout, 0);
        } else {
            kotlin.jvm.internal.o.d(relativeLayout);
            com.tencent.mm.feature.openmsg.uic.n0.U6(n0Var, relativeLayout, es.h.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 20));
        }
        relativeLayout.setOnClickListener(new com.tencent.mm.feature.openmsg.uic.h0(n0Var));
        ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.h6y)).setImageResource(com.tencent.mm.R.drawable.d7i);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.k3s)).setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ob_));
    }
}
