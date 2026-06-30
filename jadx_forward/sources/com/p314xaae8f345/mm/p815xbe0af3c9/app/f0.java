package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes11.dex */
public class f0 extends hm0.x {
    public f0(com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 c10820x69adf850) {
    }

    @Override // hm0.t
    public void b() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            synchronized (wo.w0.f529387p) {
                int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20327x62531b7e());
                if (c17 != 0) {
                    try {
                        if (c17 != 1) {
                            java.io.File file = wo.w0.f529386o;
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                        } else {
                            java.io.File file2 = wo.w0.f529386o;
                            if (file2.exists()) {
                                file2.delete();
                            }
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }
    }
}
