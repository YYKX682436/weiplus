package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet.wecoin.model.MidasPayLogCallbackImpl */
/* loaded from: classes8.dex */
public class C19061x48b2899b implements com.p314xaae8f345.p592x631407a.api.InterfaceC4733x84406d38 {

    /* renamed from: LOG_LEVEL_DEBUG */
    private static final int f38660x968b78fd = 2;

    /* renamed from: LOG_LEVEL_ERROR */
    private static final int f38661x969fb4b2 = 5;

    /* renamed from: LOG_LEVEL_INFO */
    private static final int f38662x366a00a4 = 3;

    /* renamed from: LOG_LEVEL_VERBOSE */
    private static final int f38663xda9a55ac = 1;

    /* renamed from: LOG_LEVEL_WARN */
    private static final int f38664x36702e7c = 4;
    private static final java.lang.String TAG = "MicroMsg.MidasPayLogCallbackImpl";

    @Override // com.p314xaae8f345.p592x631407a.api.InterfaceC4733x84406d38
    /* renamed from: onLogging */
    public void mo41422x640ccc80(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "tag:%s msg:%s", str, str2);
        } else if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "tag:%s msg:%s", str, str2);
        } else {
            if (i17 != 5) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "tag:%s msg:%s", str, str2);
        }
    }
}
