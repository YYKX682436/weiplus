package com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7;

/* renamed from: com.tencent.wechat.zidl.MagicSclBizHostApiCallback */
/* loaded from: classes14.dex */
class C27677x7b4b99d3 implements com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.InterfaceC27676xb560636e.Callback {
    /* renamed from: jniOnInvokeBizHostApiComplete */
    private native void m119340x17f7dc34(long j17, byte[] bArr);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.InterfaceC27676xb560636e.Callback
    /* renamed from: onInvokeBizHostApiComplete */
    public void mo119339x3bfc98af(long j17, com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27682x217c9d63.MagicSclBizApiResponse magicSclBizApiResponse) {
        m119340x17f7dc34(j17, magicSclBizApiResponse.mo20648x5f01b1f6());
    }
}
