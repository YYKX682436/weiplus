package com.p314xaae8f345.p542x3306d5.cdn;

/* renamed from: com.tencent.mars.cdn.CronetLogicCallBack */
/* loaded from: classes7.dex */
public class C4448x9e020106 implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CallBack {
    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CallBack
    /* renamed from: reportGroupIDKey */
    public void mo37965xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(iArr[i18], iArr2[i18], iArr3[i18]));
        }
        jx3.f.INSTANCE.b(arrayList, false);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CallBack
    /* renamed from: reportIDKey */
    public void mo37966xf0018e90(long j17, long j18, long j19) {
        jx3.f.INSTANCE.mo68477x336bdfd8(j17, j18, j19, false);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CallBack
    /* renamed from: reportKV */
    public void mo37967xe68be19f(long j17, java.lang.String str, long j18) {
        jx3.f.INSTANCE.n((int) j17, (int) j18, str, false, false);
    }
}
