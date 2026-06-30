package com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7;

/* renamed from: com.tencent.wechat.zidl.MagicSclBizFlutterApiCaller */
/* loaded from: classes14.dex */
public class C27675xa348e0ed {

    /* renamed from: com.tencent.wechat.zidl.MagicSclBizFlutterApiCaller$InvokeBizFlutterApiCallback */
    /* loaded from: classes14.dex */
    public interface InvokeBizFlutterApiCallback {
        /* renamed from: complete */
        void m119336xdc453139(long j17, com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27682x217c9d63.MagicSclBizApiResponse magicSclBizApiResponse);
    }

    /* renamed from: jniInvokeBizFlutterApiAsync */
    private native void m119334xa105de88(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.Object obj);

    /* renamed from: invokeBizFlutterApiAsync */
    public void m119335x62757dc3(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27675xa348e0ed.InvokeBizFlutterApiCallback invokeBizFlutterApiCallback) {
        m119334xa105de88(j17, str, str2, bArr, invokeBizFlutterApiCallback);
    }
}
