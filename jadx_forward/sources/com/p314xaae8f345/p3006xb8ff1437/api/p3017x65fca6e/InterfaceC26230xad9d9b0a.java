package com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e;

/* renamed from: com.tencent.thumbplayer.api.proxy.ITPPreloadProxy */
/* loaded from: classes15.dex */
public interface InterfaceC26230xad9d9b0a {

    /* renamed from: com.tencent.thumbplayer.api.proxy.ITPPreloadProxy$IPreloadListener */
    /* loaded from: classes15.dex */
    public interface IPreloadListener {
        /* renamed from: onPrepareDownloadProgressUpdate */
        void mo54380x8ea30446(int i17, int i18, long j17, long j18);

        /* renamed from: onPrepareError */
        void mo54381xfaf06cc0();

        /* renamed from: onPrepareSuccess */
        void mo54382xe9650cbb();
    }

    /* renamed from: getPlayErrorCodeStr */
    java.lang.String mo101363xe1ed3aa6(int i17);

    /* renamed from: isAvailable */
    boolean mo101364x1a7eccbf();

    /* renamed from: pushEvent */
    void mo101365xd0c233a0(int i17);

    /* renamed from: setPreloadListener */
    void mo101366xb66de91b(com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener iPreloadListener);

    /* renamed from: startClipPreload */
    int mo101367xed7cbad7(java.lang.String str, java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> arrayList);

    /* renamed from: startPreload */
    int mo101368xe500ef47(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13);

    /* renamed from: startPreload */
    int mo101369xe500ef47(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13, java.util.Map<java.lang.String, java.lang.String> map);

    /* renamed from: stopPreload */
    void mo101370xa07057a7(int i17);
}
