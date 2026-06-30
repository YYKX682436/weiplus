package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class k2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("name_regex");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        tp3.a.INSTANCE.d("<cmd><diagnostic>" + java.lang.String.format("<fetch target='%s' name_regex='%s' network='any' />", tp3.b.a("§§´¥ì±¬"), stringExtra) + "</diagnostic></cmd>");
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Diag op3 triggered.", 1).show();
    }
}
