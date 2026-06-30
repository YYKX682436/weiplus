package com.tencent.mm.console;

/* loaded from: classes.dex */
public class g4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("video_path");
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "开启 直播本地推流: " + stringExtra, 1).show();
        com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class));
        v4Var.getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.M4).getValue()).r()).intValue() == 1) {
            v4Var.f66991o = stringExtra;
        } else {
            v4Var.f66991o = null;
        }
    }
}
