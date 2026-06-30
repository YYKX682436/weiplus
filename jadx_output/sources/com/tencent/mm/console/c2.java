package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class c2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        } else {
            tp3.a.INSTANCE.d("<cmd><diagnostic><MemoryHook enable='0' source='push' enableExpt='0' force='1'/></diagnostic></cmd>");
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Hook Disable", 0).show();
        }
    }
}
