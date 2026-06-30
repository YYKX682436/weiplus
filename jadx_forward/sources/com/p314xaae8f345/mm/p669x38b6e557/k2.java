package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class k2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("name_regex");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        tp3.a.INSTANCE.d("<cmd><diagnostic>" + java.lang.String.format("<fetch target='%s' name_regex='%s' network='any' />", tp3.b.a("§§´¥ì±¬"), stringExtra) + "</diagnostic></cmd>");
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Diag op3 triggered.", 1).show();
    }
}
