package com.tencent.mars.cdn;

/* loaded from: classes7.dex */
public class CronetLogicCallBack implements com.tencent.mars.cdn.CronetLogic.CallBack {
    @Override // com.tencent.mars.cdn.CronetLogic.CallBack
    public void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.tencent.mars.smc.IDKey(iArr[i18], iArr2[i18], iArr3[i18]));
        }
        jx3.f.INSTANCE.b(arrayList, false);
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CallBack
    public void reportIDKey(long j17, long j18, long j19) {
        jx3.f.INSTANCE.idkeyStat(j17, j18, j19, false);
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CallBack
    public void reportKV(long j17, java.lang.String str, long j18) {
        jx3.f.INSTANCE.n((int) j17, (int) j18, str, false, false);
    }
}
