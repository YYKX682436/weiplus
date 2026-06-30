package com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7;

/* renamed from: com.tencent.wechat.zidl.MagicSclBizHostApiCaller */
/* loaded from: classes14.dex */
public class C27678x6915ec99 {

    /* renamed from: com.tencent.wechat.zidl.MagicSclBizHostApiCaller$InvokeBizHostApiCallback */
    /* loaded from: classes14.dex */
    public interface InvokeBizHostApiCallback {
        /* renamed from: complete */
        void m119343xdc453139(long j17, com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27682x217c9d63.MagicSclBizApiResponse magicSclBizApiResponse);
    }

    /* renamed from: jniInvokeBizHostApiAsync */
    private native void m119341x9d44a8c0(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.Object obj);

    /* renamed from: invokeBizHostApiAsync */
    public void m119342xc994cb65(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27678x6915ec99.InvokeBizHostApiCallback invokeBizHostApiCallback) {
        m119341x9d44a8c0(j17, str, str2, bArr, invokeBizHostApiCallback);
    }
}
