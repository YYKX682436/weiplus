package bt;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class})
/* loaded from: classes12.dex */
public class g1 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0
    public long T3() {
        throw new java.lang.IllegalStateException("Not Supported");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0
    public void a(int i17) {
        jx3.f.INSTANCE.a(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0
    public void i4(int i17, int i18, byte[] bArr, int i19) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_err_type", i17);
        bundle.putInt("key_err_code", i18);
        bundle.putByteArray("key_buffer", bArr);
        bundle.putInt("key_channel", i19);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, bundle, bt.l1.class, null);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.smc.C4583x3abd71cb.f19532x4fbc8495.m40337xac5f2d6b();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37512x13c589e0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarsOnSplashService", "mars2 start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37620xdc4f8f95()));
        com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c c4440xec1b926c = new com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
        com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37617xa38667cc(com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.class, c4440xec1b926c);
        c4440xec1b926c.m37605x6c4ebec7(new com.p314xaae8f345.p542x3306d5.mm.C4562x2edeead1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244 c4585x1608f244 = new com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
        com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37617xa38667cc(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class, c4585x1608f244);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17201x9abaf2a9 c17201x9abaf2a9 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17201x9abaf2a9(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        c17201x9abaf2a9.m68464x339aefaa(com.p314xaae8f345.mm.app.w7.f135429f);
        c4585x1608f244.m40383x6c4ebec7(c17201x9abaf2a9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarsOnSplashService", "mars2 end process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37620xdc4f8f95()));
        try {
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37515x3e5a77bb();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40379x3e5a77bb();
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37515x3e5a77bb();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40379x3e5a77bb();
            }
        }
        ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40371x59b52e3d(kx3.a.f394813a);
        ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40385x4ce9f2a9(true);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37953x6c4ebec7(new com.p314xaae8f345.p542x3306d5.cdn.C4448x9e020106());
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(bt.g1.class.getClassLoader() == null ? -1 : bt.g1.class.getClassLoader().hashCode());
        objArr[1] = java.lang.Integer.valueOf(java.lang.Thread.currentThread().getContextClassLoader() == null ? -1 : java.lang.Thread.currentThread().getContextClassLoader().hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarsOnSplashService", "SmcLogic, class loader %s, %s", objArr);
        if (!com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84216xda9a11d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MarsOnSplashService", "clicfg_enable_paymars_android:false");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MarsOnSplashService", "clicfg_enable_paymars_android:true");
        com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84225x13c589e0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarsOnSplashService", "paymars start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179().m84277xdc4f8f95()));
        com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c c23008xec1b926c = new com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c(com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179());
        com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179().m84274xa38667cc(com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.class, c23008xec1b926c);
        c23008xec1b926c.m84257x6c4ebec7(new com.p314xaae8f345.p2841xd11c237d.mm.C23012x2edeead1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244 c23035x1608f244 = new com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244(com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179());
        com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179().m84274xa38667cc(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.class, c23035x1608f244);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17199x84621931 c17199x84621931 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17199x84621931(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        c17199x84621931.m68462x339aefaa(com.p314xaae8f345.mm.app.w7.f135429f);
        c23035x1608f244.m84525x6c4ebec7(c17199x84621931);
        try {
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84228x3e5a77bb();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.class)).m84521x3e5a77bb();
            }
        } catch (java.lang.Throwable unused2) {
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84228x3e5a77bb();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.class)).m84521x3e5a77bb();
            }
        }
        ((com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.class)).m84513x59b52e3d(kx3.a.f394813a);
        ((com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.class)).m84527x4ce9f2a9(true);
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = java.lang.Integer.valueOf(bt.g1.class.getClassLoader() == null ? -1 : bt.g1.class.getClassLoader().hashCode());
        objArr2[1] = java.lang.Integer.valueOf(java.lang.Thread.currentThread().getContextClassLoader() != null ? java.lang.Thread.currentThread().getContextClassLoader().hashCode() : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarsOnSplashService", "paymars SmcLogic, class loader %s, %s", objArr2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0
    public void x1() {
        com.p314xaae8f345.mm.p944x882e457a.a.b();
    }
}
