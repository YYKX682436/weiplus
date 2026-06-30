package com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc;

/* renamed from: com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase */
/* loaded from: classes16.dex */
public interface InterfaceC27574x746b60f {

    /* renamed from: com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase$Callback */
    /* loaded from: classes8.dex */
    public interface Callback {
        /* renamed from: onGetWebViewPixelsComplete */
        void mo117736x4d420ac8(long j17, byte[] bArr);

        /* renamed from: onNativeEventsEvent */
        void mo117737xa248684b(java.lang.String str, java.lang.String str2);

        /* renamed from: onNotifyFilterShowOrHideComplete */
        void mo117738xc9b6723b(long j17, int i17);
    }

    /* renamed from: createPlatformView */
    void mo14830x800200d4(double d17, boolean z17);

    /* renamed from: dispose */
    void mo14831x63a5261f(int i17);

    /* renamed from: getWebViewPixelsAsync */
    void mo14832x6fa537ec(long j17);

    /* renamed from: notifyFilterShowOrHideAsync */
    void mo14833xab4e0a19(long j17, boolean z17);

    /* renamed from: notifyFocusChanged */
    void mo14834x5a8f48a5(boolean z17);

    /* renamed from: notifyH5BoxResult */
    void mo14835x93387072(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    /* renamed from: setCallback */
    void mo14836x6c4ebec7(com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback callback);
}
