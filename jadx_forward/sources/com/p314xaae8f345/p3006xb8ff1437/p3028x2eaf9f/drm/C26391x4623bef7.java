package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm;

/* renamed from: com.tencent.thumbplayer.core.drm.TPMediaDrmProxy */
/* loaded from: classes16.dex */
public class C26391x4623bef7 {

    /* renamed from: CREATE_MEDIA_DRM_SLICE_WAIT_TIME_MS */
    private static final long f53071xc2579739 = 100;

    /* renamed from: CREATE_MEDIA_DRM_TIMEOUT_MS */
    private static final long f53072xdecae962 = 5000;

    /* renamed from: ERR_API_LOW_LEVEL */
    private static final int f53073x5ed0011a = 2;

    /* renamed from: ERR_CREATE_MEDIA_DRM_FAILED */
    private static final int f53074x8ed7241 = 5;

    /* renamed from: ERR_ILLEGAL_ARGUMENT */
    private static final int f53075xd748a940 = 1;

    /* renamed from: ERR_INTERRUPT */
    private static final int f53076xdccd33c9 = 3;

    /* renamed from: ERR_NONE */
    private static final int f53077x82bcd5f2 = 0;

    /* renamed from: ERR_UNSUPPORTED_SCHEME */
    private static final int f53078xb8054049 = 4;
    private static final java.lang.String TAG = "[PlayerCore][TPMediaDrmProxy]";

    /* renamed from: mMediaDrm */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 f53079xef4c8aa8;

    /* renamed from: mNativeContext */
    private long f53080x5abc8e2b;

    /* renamed from: mUUID */
    private java.util.UUID f53081x627eda8;

    /* renamed from: com.tencent.thumbplayer.core.drm.TPMediaDrmProxy$DrmSessionId */
    /* loaded from: classes16.dex */
    public static final class DrmSessionId {

        /* renamed from: mSessionId */
        byte[] f53089x9ef18864;

        /* renamed from: mStatus */
        int f53090x1a39f6bf;

        public DrmSessionId(int i17, byte[] bArr) {
            this.f53090x1a39f6bf = i17;
            this.f53089x9ef18864 = bArr;
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.drm.TPMediaDrmProxy$KeyRequest */
    /* loaded from: classes16.dex */
    public static final class KeyRequest {

        /* renamed from: mData */
        byte[] f53091x62065b7;

        /* renamed from: mRequestType */
        int f53092xee9a27bc;

        /* renamed from: mStatus */
        int f53093x1a39f6bf;

        public KeyRequest(int i17, byte[] bArr, int i18) {
            this.f53092xee9a27bc = i17;
            this.f53091x62065b7 = bArr;
            this.f53093x1a39f6bf = i18;
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.drm.TPMediaDrmProxy$MediaDrmProxyCreateResult */
    /* loaded from: classes16.dex */
    public static final class MediaDrmProxyCreateResult {

        /* renamed from: mErrorCode */
        int f53094x8e53fa28;

        /* renamed from: mMediaDrmProxy */
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7 f53095x6044b8a6;

        public MediaDrmProxyCreateResult(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7 c26391x4623bef7, int i17) {
            this.f53095x6044b8a6 = c26391x4623bef7;
            this.f53094x8e53fa28 = i17;
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.drm.TPMediaDrmProxy$ProvisionRequest */
    /* loaded from: classes16.dex */
    public static final class ProvisionRequest {

        /* renamed from: mData */
        byte[] f53096x62065b7;

        /* renamed from: mDefaultUrl */
        java.lang.String f53097x4a53bbb;

        public ProvisionRequest(java.lang.String str, byte[] bArr) {
            this.f53097x4a53bbb = str;
            this.f53096x62065b7 = bArr;
        }
    }

    /* renamed from: checkInterrupt */
    private static void m102535x8ba6923b(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26385x848b480e interfaceC26385x848b480e) {
        if (interfaceC26385x848b480e != null && interfaceC26385x848b480e.mo102506x37ddcab8()) {
            throw new java.lang.InterruptedException();
        }
    }

    /* renamed from: createMediaDrmProxyByUUID */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.MediaDrmProxyCreateResult m102536x6a7323e9(java.lang.String str, boolean z17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26388xe82750e9 c26388xe82750e9) {
        if (str == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "illegal argument.");
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.MediaDrmProxyCreateResult(null, 1);
        }
        try {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7 m102537x75a999c2 = m102537x75a999c2(java.util.UUID.fromString(str), z17, c26388xe82750e9);
                return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.MediaDrmProxyCreateResult(m102537x75a999c2, m102537x75a999c2 != null ? 0 : 5);
            } catch (android.media.UnsupportedSchemeException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
                return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.MediaDrmProxyCreateResult(null, 4);
            } catch (java.lang.InterruptedException e18) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e18.getMessage());
                return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.MediaDrmProxyCreateResult(null, 3);
            }
        } catch (java.lang.IllegalArgumentException e19) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e19.getMessage());
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.MediaDrmProxyCreateResult(null, 1);
        }
    }

    /* renamed from: createMediaDrmProxyWithAsyncTimeout */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7 m102537x75a999c2(final java.util.UUID uuid, final boolean z17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26385x848b480e interfaceC26385x848b480e) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7 c26391x4623bef7;
        final java.lang.Object obj = new java.lang.Object();
        final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7[] c26391x4623bef7Arr = {null};
        final android.media.UnsupportedSchemeException[] unsupportedSchemeExceptionArr = {null};
        final boolean[] zArr = {false};
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "async create mediaDrm proxy start.");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.m102976x9cf0d20b().m102984x137f2902().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z18;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7 c26391x4623bef72;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "create system mediaDrm proxy start.");
                try {
                    c26391x4623bef7Arr[0] = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7(uuid, z17);
                } catch (android.media.UnsupportedSchemeException e17) {
                    unsupportedSchemeExceptionArr[0] = e17;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "create system mediaDrm proxy end.");
                synchronized (obj) {
                    z18 = zArr[0];
                    obj.notify();
                }
                if (!z18 || (c26391x4623bef72 = c26391x4623bef7Arr[0]) == null) {
                    return;
                }
                c26391x4623bef72.m102549x41012807();
            }
        });
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        while (c26391x4623bef7Arr[0] == null) {
            synchronized (obj) {
                try {
                    m102535x8ba6923b(interfaceC26385x848b480e);
                } catch (java.lang.InterruptedException e17) {
                    zArr[0] = true;
                    throw e17;
                }
            }
            long elapsedRealtime2 = f53072xdecae962 - (android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            if (elapsedRealtime2 <= 0) {
                break;
            }
            synchronized (obj) {
                try {
                    try {
                        obj.wait(java.lang.Math.min(elapsedRealtime2, 100L));
                    } catch (java.lang.InterruptedException e18) {
                        zArr[0] = true;
                        throw e18;
                    }
                } finally {
                }
            }
        }
        android.media.UnsupportedSchemeException unsupportedSchemeException = unsupportedSchemeExceptionArr[0];
        if (unsupportedSchemeException != null) {
            throw unsupportedSchemeException;
        }
        synchronized (obj) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7 c26391x4623bef72 = c26391x4623bef7Arr[0];
            if (c26391x4623bef72 == null) {
                zArr[0] = true;
                c26391x4623bef7 = null;
            } else {
                c26391x4623bef7 = c26391x4623bef72;
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "async create mediaDrm proxy end.");
        return c26391x4623bef7;
    }

    /* renamed from: isCryptoSchemeSupported */
    public static boolean m102538x84ee567e(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "isCryptoSchemeSupported, illegal argument.");
            return false;
        }
        try {
            boolean isCryptoSchemeSupported = android.media.MediaDrm.isCryptoSchemeSupported(java.util.UUID.fromString(str));
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "isCryptoSchemeSupported, supported:" + isCryptoSchemeSupported);
            return isCryptoSchemeSupported;
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: native_mediaDrmOnEvent */
    public native void m102539x5b46f038(byte[] bArr, int i17, int i18, byte[] bArr2);

    /* renamed from: setMediaDrmReuseEnable */
    public static void m102540x2f3e833a(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26390x234b6e73.m102528x9cf0d20b().m102532x2f3e833a(z17);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "setMediaDrmReuseEnable, reuse:".concat(z17 ? "true" : "false"));
    }

    /* renamed from: closeSession */
    public void m102541x2624157e(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.f53079xef4c8aa8.mo102508x2624157e(bArr);
    }

    /* renamed from: getKeyRequest */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.KeyRequest m102542x45e88b26(byte[] bArr, byte[] bArr2, java.lang.String str, int i17) {
        try {
            android.media.MediaDrm.KeyRequest mo102509x45e88b26 = this.f53079xef4c8aa8.mo102509x45e88b26(bArr, bArr2, str, i17, null);
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.KeyRequest(mo102509x45e88b26.getRequestType(), mo102509x45e88b26.getData(), 0);
        } catch (android.media.NotProvisionedException | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542 unused) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.KeyRequest(-1, null, -1);
        }
    }

    /* renamed from: getMediaCrypto */
    public android.media.MediaCrypto m102543xaa57188f(byte[] bArr) {
        try {
            return new android.media.MediaCrypto(this.f53081x627eda8, bArr);
        } catch (android.media.MediaCryptoException unused) {
            return null;
        }
    }

    /* renamed from: getPropertyString */
    public java.lang.String m102544x7e95833c(java.lang.String str) {
        return this.f53079xef4c8aa8.mo102510x7e95833c(str);
    }

    /* renamed from: getProvisionRequest */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.ProvisionRequest m102545x89baf70() {
        try {
            android.media.MediaDrm.ProvisionRequest mo102511x89baf70 = this.f53079xef4c8aa8.mo102511x89baf70();
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.ProvisionRequest(mo102511x89baf70.getDefaultUrl(), mo102511x89baf70.getData());
        } catch (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542 unused) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.ProvisionRequest("", new byte[0]);
        }
    }

    /* renamed from: openSession */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.DrmSessionId m102546x6a952cec() {
        int i17;
        byte[] bArr = null;
        try {
            bArr = this.f53079xef4c8aa8.mo102512x6a952cec();
            i17 = 0;
        } catch (android.media.NotProvisionedException unused) {
            i17 = -1;
        } catch (java.lang.Exception unused2) {
            i17 = -2;
        }
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.DrmSessionId(i17, bArr);
    }

    /* renamed from: provideKeyResponse */
    public int m102547xfa625f(byte[] bArr, byte[] bArr2) {
        try {
            this.f53079xef4c8aa8.mo102513xfa625f(bArr, bArr2);
            return 0;
        } catch (android.media.DeniedByServerException | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542 unused) {
            return -2;
        } catch (android.media.NotProvisionedException unused2) {
            return -1;
        }
    }

    /* renamed from: provideProvisionResponse */
    public int m102548xf850d395(byte[] bArr) {
        try {
            this.f53079xef4c8aa8.mo102514xf850d395(bArr);
            return 0;
        } catch (android.media.DeniedByServerException unused) {
            return -1;
        }
    }

    /* renamed from: release */
    public void m102549x41012807() {
        this.f53079xef4c8aa8.mo102507x5a5ddf8();
    }

    /* renamed from: setPropertyString */
    public void m102550x468beb48(java.lang.String str, java.lang.String str2) {
        this.f53079xef4c8aa8.mo102520x468beb48(str, str2);
    }

    private C26391x4623bef7(java.util.UUID uuid, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 m102529x6359e0bc;
        if (z17) {
            m102529x6359e0bc = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26390x234b6e73.m102528x9cf0d20b().m102530x41a2abb3(uuid);
        } else {
            m102529x6359e0bc = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26390x234b6e73.m102528x9cf0d20b().m102529x6359e0bc(uuid);
        }
        new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnEventListener() { // from class: com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.1
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnEventListener
            /* renamed from: onEvent */
            public void mo102521xaf8c47fb(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 interfaceC26386xc0dc0ec0, byte[] bArr, int i17, int i18, byte[] bArr2) {
                if (interfaceC26386xc0dc0ec0 == com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.this.f53079xef4c8aa8) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26391x4623bef7.this.m102539x5b46f038(bArr, i17, i18, bArr2);
                }
            }
        };
        this.f53079xef4c8aa8 = m102529x6359e0bc;
        this.f53081x627eda8 = uuid;
    }
}
