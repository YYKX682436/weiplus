package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29;

/* loaded from: classes9.dex */
public enum l {
    instance;


    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f262903d;

    /* renamed from: e, reason: collision with root package name */
    public zt5.s f262904e;

    /* renamed from: f, reason: collision with root package name */
    public int f262905f = -1;

    l() {
    }

    public void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockManager", "closeAllWalletLock");
        l(false);
        if (z17) {
            fu4.a.b();
        }
        hu4.f.b(false);
        k(false);
        if (z17) {
            fu4.a.b();
        }
    }

    public int h() {
        if (this.f262905f == -1) {
            this.f262905f = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_CURRENT_USED_TYPE_INT_SYNC, 0)).intValue();
        }
        return this.f262905f;
    }

    public boolean i() {
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_FINGERPRINT_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockManager", "isUserSetFingerprintLock: %b", java.lang.Boolean.valueOf(booleanValue));
        return booleanValue;
    }

    public boolean j(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f) {
        boolean z17;
        long j17;
        boolean z18;
        if (c6244x161a780f == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE;
        synchronized (nVar.f262911f) {
            z17 = nVar.f262909d;
        }
        am.n10 n10Var = c6244x161a780f.f136493g;
        if (z17) {
            nVar.a(new java.lang.ref.WeakReference(n10Var.f88926b));
            nVar.j(false);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockManager", "current wallet lock type: %d", java.lang.Integer.valueOf(this.f262905f));
        int i17 = this.f262905f;
        if (i17 == 2) {
            j17 = fu4.a.f348417a;
        } else {
            if (i17 != 1) {
                return false;
            }
            j17 = hu4.i.f366763a;
        }
        long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockManager", "lastVerifyOkTime: %d, elapsedRealTime: %d, pastTime: %d, PREVENT_INPUT_PWD_SECONDS: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.k.a()));
        if (j17 != -1 && elapsedRealtime < com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.k.a()) {
            int i18 = instance.f262905f;
            if (i18 == 1) {
                z18 = hu4.j.f();
            } else if (i18 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockManager", "isUserBlockedInFingerprint: %b", java.lang.Boolean.valueOf(fu4.a.e()));
                z18 = fu4.a.e();
            } else {
                z18 = false;
            }
            if (!z18) {
                nVar.a(new java.lang.ref.WeakReference(n10Var.f88926b));
                return false;
            }
        }
        return true;
    }

    public void k(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintInfoStorage", "set user face id lock: %s", java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_FACEID_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().i(true);
    }

    public void l(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintInfoStorage", "set fingerprint lock status isOpened: %b", java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_FINGERPRINT_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(gm0.j1.u().c().l(40, null), 0);
        gm0.j1.u().c().w(40, java.lang.Integer.valueOf(z17 ? 8388608 | o17 : (-8388609) & o17));
        gm0.j1.u().c().i(true);
    }

    public void m(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockManager", "old wallet lock type: %d, new type: %d", java.lang.Integer.valueOf(this.f262905f), java.lang.Integer.valueOf(i17));
        this.f262905f = i17;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_CURRENT_USED_TYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        gm0.j1.u().c().i(true);
    }
}
