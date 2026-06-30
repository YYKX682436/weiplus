package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29;

/* renamed from: com.tencent.mm.plugin.walletlock.model.WalletLockInitTask$1 */
/* loaded from: classes9.dex */
class C19203x85990606 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f> {
    public C19203x85990606(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.k kVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f39173x3fe91575 = 1842411039;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f) {
        boolean z17;
        boolean z18;
        boolean z19;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f2 = c6244x161a780f;
        int i17 = c6244x161a780f2.f136493g.f88925a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE;
        synchronized (nVar.f262911f) {
        }
        synchronized (nVar.f262911f) {
        }
        am.n10 n10Var = c6244x161a780f2.f136493g;
        int i18 = n10Var.f88925a;
        am.o10 o10Var = c6244x161a780f2.f136494h;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 == 2) {
                    o10Var.f89038a = java.lang.Boolean.valueOf(hu4.j.g());
                } else if (i18 == 3) {
                    o10Var.f89038a = java.lang.Boolean.valueOf(hu4.j.f());
                } else if (i18 == 4) {
                    nVar.i();
                }
            } else if (n10Var.f88926b instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6) {
                o10Var.f89038a = 16;
            } else {
                synchronized (nVar.f262911f) {
                    z18 = nVar.f262909d;
                }
                if (z18) {
                    nVar.j(false);
                    nVar.k(false);
                    o10Var.f89038a = 16;
                } else {
                    synchronized (nVar.f262911f) {
                        z19 = nVar.f262910e;
                    }
                    if (z19) {
                        nVar.j(false);
                        nVar.k(false);
                        o10Var.f89038a = 18;
                    } else {
                        long j17 = hu4.i.f366763a;
                        long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
                        if ((j17 == -1 || elapsedRealtime >= hu4.c.f366757a || hu4.j.f()) && hu4.f.a()) {
                            o10Var.f89038a = 17;
                        } else {
                            o10Var.f89038a = 16;
                        }
                        nVar.a(new java.lang.ref.WeakReference(n10Var.f88926b));
                    }
                }
            }
        } else if (n10Var.f88926b instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6) {
            o10Var.f89038a = 16;
        } else {
            synchronized (nVar.f262911f) {
                z17 = nVar.f262909d;
            }
            if (z17) {
                o10Var.f89038a = 16;
                nVar.a(new java.lang.ref.WeakReference(n10Var.f88926b));
                nVar.j(false);
            } else {
                long j18 = hu4.i.f366763a;
                long elapsedRealtime2 = (android.os.SystemClock.elapsedRealtime() - j18) / 1000;
                if (j18 == -1 || elapsedRealtime2 >= hu4.c.f366757a || (hu4.j.f() && hu4.f.a())) {
                    o10Var.f89038a = 17;
                } else {
                    o10Var.f89038a = 16;
                    nVar.a(new java.lang.ref.WeakReference(n10Var.f88926b));
                }
            }
        }
        n10Var.f88926b = null;
        return false;
    }
}
