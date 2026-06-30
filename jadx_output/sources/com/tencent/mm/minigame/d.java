package com.tencent.mm.minigame;

/* loaded from: classes.dex */
public final class d implements nk5.c {
    @Override // nk5.c
    public boolean a(java.lang.String str) {
        return false;
    }

    @Override // nk5.c
    public void b() {
    }

    @Override // nk5.c
    public void c(boolean z17) {
    }

    @Override // nk5.c
    public boolean d(java.lang.String str) {
        boolean z17 = false;
        if (str != null && r26.n0.B(str, "com.tencent.wva.hostsdk.container", false)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("AppBrandVASHandle", "WVA.Activity.isSupportVAS " + str + " -> " + z17);
        return z17;
    }

    @Override // nk5.c
    public boolean e() {
        return true;
    }

    @Override // nk5.c
    public void f() {
    }
}
