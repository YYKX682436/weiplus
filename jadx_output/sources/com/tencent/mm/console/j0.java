package com.tencent.mm.console;

/* loaded from: classes7.dex */
class j0 implements com.tencent.mm.ipcinvoker.j {
    private j0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CommandProcessor", "ClearGameA8keyCookie before, cookie : %s", com.tencent.xweb.d.g().a("." + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy)));
        com.tencent.xweb.d.g().b("." + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy), "cookie_passkey=; max-age=0");
        com.tencent.xweb.d.g().b("." + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy), "uin=; max-age=0; httponly");
        com.tencent.xweb.d.g().b("." + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy), "key=; max-age=0; httponly");
        com.tencent.xweb.d.g().b("." + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy), "pass_ticket=; max-age=0; httponly");
        com.tencent.xweb.d.g().flush();
        com.tencent.mars.xlog.Log.i("MicroMsg.CommandProcessor", "ClearGameA8keyCookie end, cookie : %s", com.tencent.xweb.d.g().a("." + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy)));
    }
}
