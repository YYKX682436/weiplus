package com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26;

/* renamed from: com.tenpay.android.wechat.TenpaySecureEncrypt */
/* loaded from: classes9.dex */
public final class C28002xcd8b6923 implements com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 {
    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: desedeEncode */
    public java.lang.String mo121431xea62cd8a(java.lang.String str, java.lang.String str2) {
        return new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121799xea62cd8a(str);
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: desedeVerifyCode */
    public java.lang.String mo121432x19b57b7a(java.lang.String str, java.lang.String str2) {
        return new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121801x19b57b7a(str);
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: encryptPasswd */
    public java.lang.String mo121433xd26bb163(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            str = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121663xf830e4e1(str);
        }
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        if (str2 != null) {
            c28013x36bca45.m121808x5d476ab4(str2);
        }
        return c28013x36bca45.m121802xd26bb163(str);
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: encryptPasswdWithRSA2048 */
    public java.lang.String mo121434x8b1ff279(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            str = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121663xf830e4e1(str);
        }
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        if (str2 != null) {
            c28013x36bca45.m121808x5d476ab4(str2);
        }
        return c28013x36bca45.m121803x8b1ff279(str);
    }
}
