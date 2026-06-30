package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class d0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final db0.e f67327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.n0 f67328f;

    public d0(com.tencent.mm.feature.openmsg.uic.n0 n0Var, db0.e eVar) {
        this.f67328f = n0Var;
        this.f67327e = eVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.elk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.feature.openmsg.uic.e0 item = (com.tencent.mm.feature.openmsg.uic.e0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        db0.e eVar = this.f67327e;
        if (eVar != null) {
            eVar.a(item, i17);
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.tencent.mm.R.id.t3n);
        boolean z18 = item.f67331e;
        com.tencent.mm.feature.openmsg.uic.n0 n0Var = this.f67328f;
        if (z18) {
            kotlin.jvm.internal.o.d(relativeLayout);
            com.tencent.mm.feature.openmsg.uic.n0.U6(n0Var, relativeLayout, 0);
        } else {
            kotlin.jvm.internal.o.d(relativeLayout);
            com.tencent.mm.feature.openmsg.uic.n0.U6(n0Var, relativeLayout, es.h.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 20));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.h6y);
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = item.f67330d;
        if (networkDeviceInfo.f66594o) {
            imageView.setColorFilter(b3.l.getColor(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f478822i7), android.graphics.PorterDuff.Mode.SRC_IN);
        } else {
            imageView.setColorFilter((android.graphics.ColorFilter) null);
        }
        if (networkDeviceInfo.f66594o && kotlin.jvm.internal.o.b(networkDeviceInfo.f66586d, com.tencent.mm.feature.openmsg.uic.n0.f67358i)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.c1n);
        } else {
            n11.a b17 = n11.a.b();
            java.lang.String str = networkDeviceInfo.f66589g;
            java.lang.Object value = ((jz5.n) com.tencent.mm.feature.openmsg.uic.n0.f67357h).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            b17.h(str, imageView, (o11.g) value);
        }
        holder.p(com.tencent.mm.R.id.f485298h75).setOnClickListener(new com.tencent.mm.feature.openmsg.uic.c0(n0Var, item));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.k3s)).setText(networkDeviceInfo.f66588f);
    }
}
