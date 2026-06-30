package com.tencent.mm.console;

/* loaded from: classes8.dex */
public class s1 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        java.lang.Runtime.getRuntime().gc();
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "trigger gc...", 0).show();
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.console.r1(this), 500L);
    }
}
