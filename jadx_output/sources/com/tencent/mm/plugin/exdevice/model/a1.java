package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class a1 extends u32.f0 {
    public a1(com.tencent.mm.plugin.exdevice.model.d1 d1Var) {
    }

    @Override // u32.g0
    public void N6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, byte[] bArr) {
        int i27 = com.tencent.mm.plugin.exdevice.model.d1.f98871g;
        a42.i.a(bArr);
        if (1 == i17) {
            com.tencent.mm.plugin.exdevice.model.l3.Di().q(str3, str2, false);
        } else if (2 == i17) {
            com.tencent.mm.plugin.exdevice.model.l3.Di().q(str3, str2, true);
        } else {
            com.tencent.mars.xlog.Log.e("com.tencent.mm.plugin.exdevice.model.d1", "unknown message type %d", java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.exdevice.model.l3.Ui().W0(a42.i.h(str2));
    }
}
