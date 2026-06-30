package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class n4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.finder.live.k5) ((s40.z0) i95.n0.c(s40.z0.class))).getClass();
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveShellService", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("stream_id");
        r45.ok1 ok1Var = new r45.ok1();
        ok1Var.set(2, stringExtra);
        ((mm2.h7) dk2.ef.f233372a.i(mm2.h7.class)).f329118m.postValue(ok1Var);
    }
}
