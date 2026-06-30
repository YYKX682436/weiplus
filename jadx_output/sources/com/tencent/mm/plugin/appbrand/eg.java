package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class eg extends com.tencent.mm.plugin.appbrand.ig implements k34.g {
    @Override // com.tencent.mm.plugin.appbrand.ig
    public boolean h(android.content.Intent intent, boolean z17) {
        boolean h17 = super.h(intent, z17);
        boolean z18 = i(intent) == -1;
        if (z18) {
            com.tencent.mars.xlog.Log.i("MiroMsg.WxaManufacturerShortcutEntry", "invalid scene ");
        }
        return !z18 && h17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ig
    public int i(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("SCENE", -1);
        if (intExtra == 2) {
            return 1114;
        }
        return intExtra == 1 ? 1113 : -1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ig
    public void l(android.content.Context context, android.content.Intent intent, boolean z17) {
    }
}
