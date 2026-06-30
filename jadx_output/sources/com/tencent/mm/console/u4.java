package com.tencent.mm.console;

/* loaded from: classes13.dex */
public class u4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "extras is null");
        } else {
            extras.putInt(ya.b.SOURCE, 4);
            by5.d1.b(extras, null);
        }
    }
}
