package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class c1 implements java.lang.Runnable {
    public c1(com.tencent.mm.console.d1 d1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            aw1.p0.f14630a.f(new com.tencent.wcdb.support.CancellationSignal());
        }
    }
}
