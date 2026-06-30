package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm;

/* renamed from: com.tencent.thumbplayer.core.drm.ITPMediaDrm */
/* loaded from: classes16.dex */
public interface InterfaceC26386xc0dc0ec0 {

    /* renamed from: com.tencent.thumbplayer.core.drm.ITPMediaDrm$OnEventListener */
    /* loaded from: classes16.dex */
    public interface OnEventListener {
        /* renamed from: onEvent */
        void mo102521xaf8c47fb(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 interfaceC26386xc0dc0ec0, byte[] bArr, int i17, int i18, byte[] bArr2);
    }

    /* renamed from: com.tencent.thumbplayer.core.drm.ITPMediaDrm$OnExpirationUpdateListener */
    /* loaded from: classes16.dex */
    public interface OnExpirationUpdateListener {
        /* renamed from: onExpirationUpdate */
        void mo102522x2a402457(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 interfaceC26386xc0dc0ec0, byte[] bArr, long j17);
    }

    /* renamed from: com.tencent.thumbplayer.core.drm.ITPMediaDrm$OnKeyStatusChangeListener */
    /* loaded from: classes16.dex */
    public interface OnKeyStatusChangeListener {
        /* renamed from: onKeyStatusChange */
        void mo102523x7cad3e62(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 interfaceC26386xc0dc0ec0, byte[] bArr, java.util.List<android.media.MediaDrm.KeyStatus> list, boolean z17);
    }

    /* renamed from: close */
    void mo102507x5a5ddf8();

    /* renamed from: closeSession */
    void mo102508x2624157e(byte[] bArr);

    /* renamed from: getKeyRequest */
    android.media.MediaDrm.KeyRequest mo102509x45e88b26(byte[] bArr, byte[] bArr2, java.lang.String str, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    /* renamed from: getPropertyString */
    java.lang.String mo102510x7e95833c(java.lang.String str);

    /* renamed from: getProvisionRequest */
    android.media.MediaDrm.ProvisionRequest mo102511x89baf70();

    /* renamed from: openSession */
    byte[] mo102512x6a952cec();

    /* renamed from: provideKeyResponse */
    byte[] mo102513xfa625f(byte[] bArr, byte[] bArr2);

    /* renamed from: provideProvisionResponse */
    void mo102514xf850d395(byte[] bArr);

    /* renamed from: queryKeyStatus */
    java.util.HashMap<java.lang.String, java.lang.String> mo102515x83543f49(byte[] bArr);

    /* renamed from: removeKeys */
    void mo102516x4176b898(byte[] bArr);

    /* renamed from: restoreKeys */
    void mo102517x13a67da2(byte[] bArr, byte[] bArr2);

    /* renamed from: setOnExpirationUpdateListener */
    void mo102518x9021c82d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnExpirationUpdateListener onExpirationUpdateListener, android.os.Handler handler);

    /* renamed from: setOnKeyStatusChangeListener */
    void mo102519x442adaf4(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnKeyStatusChangeListener onKeyStatusChangeListener, android.os.Handler handler);

    /* renamed from: setPropertyString */
    void mo102520x468beb48(java.lang.String str, java.lang.String str2);
}
