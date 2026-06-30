package com.tencent.mm.console;

/* loaded from: classes.dex */
public class n3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "not coolassist or monkey env, disable opengl dump cmd.");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.console.n3$$a());
    }
}
