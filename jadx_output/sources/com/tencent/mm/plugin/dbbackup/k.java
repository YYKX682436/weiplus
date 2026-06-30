package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class k implements com.tencent.mm.sdk.platformtools.k3 {
    public k(com.tencent.mm.plugin.dbbackup.b bVar) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        l75.k0 k0Var = gm0.j1.u().f273153f;
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
