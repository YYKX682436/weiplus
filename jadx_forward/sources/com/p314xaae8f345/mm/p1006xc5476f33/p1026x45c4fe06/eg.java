package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class eg extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ig implements k34.g {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ig
    public boolean h(android.content.Intent intent, boolean z17) {
        boolean h17 = super.h(intent, z17);
        boolean z18 = i(intent) == -1;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.WxaManufacturerShortcutEntry", "invalid scene ");
        }
        return !z18 && h17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ig
    public int i(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("SCENE", -1);
        if (intExtra == 2) {
            return 1114;
        }
        return intExtra == 1 ? 1113 : -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ig
    public void l(android.content.Context context, android.content.Intent intent, boolean z17) {
    }
}
