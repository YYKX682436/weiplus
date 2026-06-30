package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes7.dex */
public class d1 extends ea5.k {
    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo13581xd73276fa(j17, i17, i18, str, str2, i19, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.DynamicLibraryCheckService", "download fail. projectId:%s, name:%s, version:%s, errNo:%d, errCode:%d", str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo13582x5e6271bd(j17, str, str2, i17, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "download success. projectId:%s, name:%s, version:%s", str, str2, java.lang.Integer.valueOf(i17));
    }
}
