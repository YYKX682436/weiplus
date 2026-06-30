package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29;

/* loaded from: classes9.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a {

    /* renamed from: a, reason: collision with root package name */
    public static cu4.g f262899a;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void a(android.app.Activity activity, android.content.Intent intent, int i17) {
        cu4.g gVar = f262899a;
        if (gVar != null) {
            gVar.a(activity, intent, i17);
        } else {
            super.a(activity, intent, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public boolean b() {
        cu4.g gVar = f262899a;
        if (gVar != null) {
            return gVar.b();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void c(android.app.Activity activity, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("action", "action.close_wallet_lock");
        j45.l.n(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void d(android.app.Activity activity, int i17, int i18) {
        super.d(activity, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void e(android.app.Activity activity, cu4.f fVar, cu4.e eVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public boolean f() {
        return hu4.f.a() || com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance.i();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void g(android.app.Activity activity) {
        cu4.g gVar = f262899a;
        if (gVar != null) {
            gVar.g(activity);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void h(android.app.Activity activity, int i17) {
        super.h(activity, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public cu4.f i() {
        cu4.g gVar = f262899a;
        if (gVar != null) {
            return gVar.i();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    /* renamed from: init */
    public void mo74014x316510() {
        java.lang.Throwable th6 = new java.lang.Throwable();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "WalletLock init start, call stack: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(gm0.j1.u().c().l(40, null), 0);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(o17);
        int i17 = o17 & 8388608;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "pluginSwitch %d %d", valueOf, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "fingerprint wallet lock is opened");
            fu4.b bVar = new fu4.b();
            f262899a = bVar;
            bVar.mo74014x316510();
            boolean z18 = re4.g0.c() && wt5.a.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            boolean z19 = re4.g0.c() && wt5.a.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "init isSupportSoter: %b, isSupportFingerprintLock: %b, isSuppoerFaceIdLock: %b", java.lang.Boolean.valueOf(re4.g0.c()), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
            if (hu4.f.a() && !z18 && !z19) {
                boolean o18 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_IS_AUTO_JUMP_TO_GESTURE_WHEN_NOT_SUPPORT_FINGERPRINT_BOOLEAN_SYNC, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "has opened fingerprint lock, but device not support soter, and use gesture, isAutoJumpToGesture: %b", java.lang.Boolean.valueOf(o18));
                if (o18) {
                    hu4.g gVar = new hu4.g();
                    f262899a = gVar;
                    gVar.mo74014x316510();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "WalletLock init end, wallet lock type: %d", java.lang.Integer.valueOf(lVar.h()));
                    return;
                }
            }
        } else if (hu4.f.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "gesture wallet lock is opened");
            hu4.g gVar2 = new hu4.g();
            f262899a = gVar2;
            gVar2.mo74014x316510();
            lVar.l(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "wallet lock is not open");
            f262899a = new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a();
            lVar.d(false);
            f262899a.mo74014x316510();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "WalletLock init end, wallet lock type: %d", java.lang.Integer.valueOf(lVar.h()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void j(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "wallet lock switch to gesture");
            hu4.g gVar = new hu4.g();
            f262899a = gVar;
            gVar.mo74014x316510();
            lVar.l(false);
            fu4.a.b();
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "wallet lock switch to fingerprint lock");
            fu4.b bVar = new fu4.b();
            f262899a = bVar;
            bVar.mo74014x316510();
            hu4.f.b(false);
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "wallet lock switch to faceid lock");
            eu4.a aVar = new eu4.a();
            f262899a = aVar;
            aVar.mo74014x316510();
            return;
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLockImpl", "unknown wallet lock type, ignore switch");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "wallet lock switch to none");
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a aVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a();
        f262899a = aVar2;
        aVar2.mo74014x316510();
        lVar.d(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public boolean k(android.app.Activity activity, cu4.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "protectMeOnCreate walletlock impl");
        if (f262899a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockImpl", "protectMeOnCreate walletlock impl null, force init");
            mo74014x316510();
        }
        cu4.g gVar = f262899a;
        if (gVar != null) {
            return gVar.k(activity, fVar);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void l(android.app.Activity activity, android.content.Intent intent) {
        cu4.g gVar = f262899a;
        if (gVar != null) {
            gVar.l(activity, intent);
        } else {
            super.l(activity, intent);
        }
    }
}
