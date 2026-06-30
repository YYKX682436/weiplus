package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes11.dex */
public class o2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("fetch_base_id");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "base id is empty, abort");
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "base id is empty, abort", 1).show();
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("use_https", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "#RECOVERY_FETCH_PATCH, baseId = %s, useHTTPS = %s", stringExtra, java.lang.Boolean.valueOf(booleanExtra));
        sc0.g gVar = (sc0.g) i95.n0.c(sc0.g.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        sc0.f fVar = sc0.f.TEST_SHELL_COMMAND;
        ((rc0.i) gVar).getClass();
        com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.m94446xdca7e94f(context, fVar, stringExtra, true, booleanExtra);
    }
}
