package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes15.dex */
public final class u2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f104664e;

    /* renamed from: f, reason: collision with root package name */
    public final int f104665f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f104666g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f104667h;

    public u2(java.lang.String finderUserName, int i17, java.lang.String sdkRequestID, boolean z17) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(sdkRequestID, "sdkRequestID");
        this.f104664e = finderUserName;
        this.f104665f = i17;
        this.f104666g = sdkRequestID;
        this.f104667h = z17;
    }

    @Override // in5.r
    public int e() {
        return this.f104667h ? com.tencent.mm.R.layout.f488797dc2 : com.tencent.mm.R.layout.ces;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.n0 item = (so2.n0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.d_l);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) p17;
        boolean z18 = this.f104667h;
        r45.ri0 ri0Var = item.f410489d;
        if (z18) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.saj);
            java.lang.Object[] objArr = new java.lang.Object[1];
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            r45.yi0 yi0Var = ri0Var.f384905z;
            long j17 = yi0Var != null ? yi0Var.f391117d : 0L;
            ((b92.d1) zbVar).getClass();
            objArr[0] = zl2.r4.S(zl2.r4.f473950a, j17, 0, 2, null);
            textView.setText(holder.f293121e.getString(com.tencent.mm.R.string.dee, objArr));
        }
        ((com.tencent.mm.feature.emoji.i0) ((com.tencent.mm.feature.emoji.api.u5) i95.n0.c(com.tencent.mm.feature.emoji.api.u5.class))).getClass();
        zq.h.f474972a.d(n22.m.i(ri0Var), imageView, null);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.t2(holder, item, this));
    }
}
