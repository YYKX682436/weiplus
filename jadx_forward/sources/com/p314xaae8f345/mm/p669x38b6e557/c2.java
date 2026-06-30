package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class c2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        } else {
            tp3.a.INSTANCE.d("<cmd><diagnostic><MemoryHook enable='0' source='push' enableExpt='0' force='1'/></diagnostic></cmd>");
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Hook Disable", 0).show();
        }
    }
}
