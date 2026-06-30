package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class ij extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hj f280766e;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        if (c01.e2.L(this.f280113d.x())) {
            java.util.HashMap hashMap = (java.util.HashMap) this.f280113d.g().getIntent().getSerializableExtra("key_red_packet_preview_extraInfo");
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).Ai(this.f280113d.g(), hashMap, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fj(this));
            gb3.n.f351564a = java.util.UUID.randomUUID().toString();
            gb3.n.f351565b = android.os.SystemClock.elapsedRealtime() / 1000;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227268a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227269b;
        if (iVar != null) {
            iVar.j();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227269b = null;
        }
        gb3.n.a(3);
        gb3.n.f351564a = null;
        gb3.n.f351566c = null;
        gb3.n.f351565b = -1L;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227268a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227269b;
        if (iVar != null) {
            iVar.j();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227269b = null;
        }
        gb3.n.a(3);
        gb3.n.f351564a = null;
        gb3.n.f351566c = null;
        gb3.n.f351565b = -1L;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RedPacketPreviewComponent", "onChattingExitAnimStart");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hj hjVar = this.f280766e;
        if (hjVar != null) {
            hjVar.b();
            java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
            if (k17 == null || k17.get() == null || k17.get() == null) {
                return;
            }
            try {
                if (((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).aj()) {
                    java.lang.Class<?> cls = ((android.app.Activity) k17.get()).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zd zdVar = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def.Q1;
                    if (cls == com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def.class) {
                        ((android.app.Activity) k17.get()).finish();
                    }
                } else {
                    java.lang.Class<?> cls2 = ((android.app.Activity) k17.get()).getClass();
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9.L1;
                    if (cls2 == com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9.class) {
                        ((android.app.Activity) k17.get()).finish();
                    }
                }
            } catch (java.lang.ClassNotFoundException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RedPacketPreviewComponent", "onChattingExitAnimStart throw exception");
            }
        }
    }
}
