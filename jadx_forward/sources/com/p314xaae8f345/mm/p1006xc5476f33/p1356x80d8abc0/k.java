package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class k implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.b bVar) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        l75.k0 k0Var = gm0.j1.u().f354686f;
        int i17 = message.what;
        if (i17 == 1) {
            k0Var.b();
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        k0Var.t();
        return true;
    }
}
