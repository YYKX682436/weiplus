package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class v implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f186812e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var, int i17) {
        this.f186811d = e0Var;
        this.f186812e = i17;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var = this.f186811d;
            if (i17 < e0Var.f186760q.size()) {
                java.lang.Object obj = e0Var.f186760q.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                zb2.d dVar = (zb2.d) obj;
                if (dVar.f552794e) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, e0Var.m158354x19263085(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
                intent.putExtra("CLIENT_KV_REPORTINFO", "{\"drama_source_card_region\":" + dVar.f552797h + '}');
                hc2.e0.a(intent, 0, null, 3, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r45.fl5 fl5Var = dVar.f552793d;
                i0Var.ak(context, intent, fl5Var != null ? fl5Var.m75942xfb822ef2(0) : 0L, fl5Var != null ? fl5Var.m75942xfb822ef2(4) : 0L, null, null, 0L, null, this.f186812e, fl5Var != null ? fl5Var.m75945x2fec8307(6) : null);
            }
        }
    }
}
