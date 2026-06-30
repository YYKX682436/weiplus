package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes13.dex */
public class u4 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "extras is null");
        } else {
            extras.putInt(ya.b.f77502x92235c1b, 4);
            by5.d1.b(extras, null);
        }
    }
}
