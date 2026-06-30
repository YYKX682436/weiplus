package com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c;

/* renamed from: com.github.henryye.nativeiv.comm.CommNativeBitmapStruct */
/* loaded from: classes6.dex */
class C1598x8de4afe7 extends com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb {

    /* renamed from: nConfig */
    private int f5299x3391e550 = -1;

    /* renamed from: premultiplyAlpha */
    private boolean f5300xc9bb3fd7;

    /* renamed from: convertToCommonStruct */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1598x8de4afe7 m17138xde9d3c4e() {
        int i17 = this.f5299x3391e550;
        int i18 = 0;
        int i19 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238;
        if (i17 != 4 && i17 != 3 && i17 != 2) {
            i19 = 0;
        }
        this.f5289xb5dd15bf = i19;
        if (i17 == 4) {
            i18 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e;
        } else if (i17 == 3) {
            i18 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53;
        } else if (i17 == 2) {
            i18 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5292x29a12564;
        }
        this.f5288x9a7ef13c = i18;
        return this;
    }
}
