package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes.dex */
public class g4 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("video_path");
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "开启 直播本地推流: " + stringExtra, 1).show();
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class));
        v4Var.getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.M4).mo141623x754a37bb()).r()).intValue() == 1) {
            v4Var.f148524o = stringExtra;
        } else {
            v4Var.f148524o = null;
        }
    }
}
