package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class q2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        x51.o1.f452064q = com.tencent.mm.sdk.platformtools.t8.D1(intent.getStringExtra("key"), 0);
        x51.o1.f452065r = com.tencent.mm.sdk.platformtools.t8.D1(intent.getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL), 0);
        x51.o1.f452066s = intent.getStringExtra("str");
        com.tencent.mars.xlog.Log.w("MicroMsg.Shell", "dkshell set [%d %d] [%s]", java.lang.Integer.valueOf(x51.o1.f452064q), java.lang.Integer.valueOf(x51.o1.f452065r), x51.o1.f452066s);
        int i17 = x51.o1.f452064q;
        if (10009 == i17) {
            boolean z17 = x51.o1.f452042a;
            java.util.HashMap hashMap = com.tencent.mm.console.p0.f64832b;
        } else if (10014 == i17 && com.tencent.mm.sdk.platformtools.x2.n()) {
            w11.w1.wi().c(7L, 1, "", com.tencent.mm.booter.x1.e());
        } else if (10015 == x51.o1.f452064q) {
            com.tencent.mm.sdk.platformtools.x2.p();
        }
    }
}
