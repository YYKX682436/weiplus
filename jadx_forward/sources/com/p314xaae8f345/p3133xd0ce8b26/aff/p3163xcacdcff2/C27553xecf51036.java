package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.status.ZIDL_qp5oaPRwK */
/* loaded from: classes16.dex */
public class C27553xecf51036 {
    private static final java.lang.String TAG = "StatusModuleReadManagerK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f60545xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: GenTaskId */
    public static long m117527x6aa2d0d0() {
        return f60545xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_AX */
    private void m117528x1964d17f(java.lang.Object obj, byte[] bArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.markStatusReadCallback) obj).mo117442xdc453139((com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6.m116892x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_BX */
    private void m117529x1964d19e(java.lang.Object obj, byte[] bArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.getStatusReadListCallback) obj).m117440xdc453139((com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d.m116853x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_CX */
    private void m117530x1964d1bd(java.lang.Object obj, byte[] bArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.readReadRecordListFromDBCallback) obj).m117443xdc453139((com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d.m116853x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_DX */
    private void m117531x1964d1dc(java.lang.Object obj, boolean z17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.insertReadRecordCallback) obj).m117441xdc453139(z17);
    }

    /* renamed from: ZIDL_AV */
    public native void m117532x1964d17d(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_BV */
    public native void m117533x1964d19c(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_CV */
    public native void m117534x1964d1bb(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_DV */
    public native void m117535x1964d1da(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_qp5oaPRwC */
    public native void m117536xecf5102e(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
