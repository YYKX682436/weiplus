package com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7;

/* renamed from: com.tencent.wechat.zidl.MagicSclBizFlutterApiCallback */
/* loaded from: classes14.dex */
class C27674xf492c927 implements com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.InterfaceC27673x7ca626c2.Callback {
    /* renamed from: jniOnInvokeBizFlutterApiComplete */
    private native void m119333x6490958e(long j17, byte[] bArr);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.InterfaceC27673x7ca626c2.Callback
    /* renamed from: onInvokeBizFlutterApiComplete */
    public void mo119332xe7ba4333(long j17, com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27682x217c9d63.MagicSclBizApiResponse magicSclBizApiResponse) {
        m119333x6490958e(j17, magicSclBizApiResponse.mo20648x5f01b1f6());
    }
}
