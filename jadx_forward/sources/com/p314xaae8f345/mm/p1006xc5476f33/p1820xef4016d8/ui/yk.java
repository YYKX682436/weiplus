package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class yk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zk f229279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xv3 f229280e;

    public yk(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zk zkVar, r45.xv3 xv3Var) {
        this.f229279d = zkVar;
        this.f229280e = xv3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zk zkVar = this.f229279d;
        if (zkVar.f229319e == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("envelopeMaskIv");
            throw null;
        }
        int height = (int) ((r1.getHeight() / 1200.0f) * (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229280e.f472027x) ^ true ? 40 : 38));
        gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
        r45.wv3 wv3Var = zkVar.f229318d;
        if (wv3Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hbEnvelopSource");
            throw null;
        }
        android.view.View view = zkVar.f229320f;
        com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = zkVar.f229321g;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = zkVar.f229322h;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = zkVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16389xdab6e25f) m158354x19263085).f228041i;
        android.widget.ImageView imageView = zkVar.f229319e;
        if (imageView != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) jVar).rj(10, wv3Var, view, c10389xffc30b0, y0Var, i17, 0, imageView, height);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("envelopeMaskIv");
            throw null;
        }
    }
}
