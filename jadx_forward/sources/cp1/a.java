package cp1;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.app.z2 {
    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BallAppForegroundListener", "onAppBackground, activity:%s", str);
        com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
        if (!wVar.f135422n && gm0.j1.a() && ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().B(false);
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().v0(false);
        }
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai() != null) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai().b(wVar.f135422n);
        }
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BallAppForegroundListener", "onAppForeground, activity:%s", str);
        if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n && gm0.j1.a() && ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null) {
            boolean V0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BallAppForegroundListener", "onAppForeground isTopApplication: %b", java.lang.Boolean.valueOf(V0));
            if (V0) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().E0(true);
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().v0(true);
            }
        }
    }
}
