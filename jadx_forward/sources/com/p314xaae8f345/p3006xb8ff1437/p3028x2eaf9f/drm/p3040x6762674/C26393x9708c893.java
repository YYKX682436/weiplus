package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674;

/* renamed from: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm */
/* loaded from: classes16.dex */
public class C26393x9708c893 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 {

    /* renamed from: INIT_POOL_SIZE */
    private static final int f53103x61bf5d5 = 1;

    /* renamed from: KEEP_POOL_SIZE */
    private static final int f53104xf4e2ee0a = 2;
    private static final java.lang.String TAG = "[PlayerCore][TPReuseMediaDrm]";

    /* renamed from: WIDEVINE_UUID */
    private static final java.util.UUID f53105xac3481bd = new java.util.UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: mMediaDrmCachedPoolMap */
    private static java.util.HashMap<java.util.UUID, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo>> f53106x9bf1b256 = null;

    /* renamed from: mCanReUse */
    private final boolean f53107x1cb647f1;

    /* renamed from: mOnExpirationUpdateListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnExpirationUpdateListener f53108x6d8ec478;

    /* renamed from: mOnKeyStatusChangeListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnKeyStatusChangeListener f53109x6c57a949;

    /* renamed from: mTPMediaDrm */
    private final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 f53110xb10531e4;

    /* renamed from: mTPMediaDrmError */
    private boolean f53111x50a43e84 = false;

    /* renamed from: mTPMediaDrmInfo */
    private final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo f53112x65b478b2;

    /* renamed from: mUUID */
    private final java.util.UUID f53113x627eda8;

    /* renamed from: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm$TPMediaDrmInfo */
    /* loaded from: classes16.dex */
    public static class TPMediaDrmInfo {

        /* renamed from: sessionId */
        byte[] f53117x243a3e51;

        /* renamed from: tpMediaDrm */
        final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 f53118x5d6119b7;

        public TPMediaDrmInfo(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 interfaceC26386xc0dc0ec0, byte[] bArr) {
            this.f53118x5d6119b7 = interfaceC26386xc0dc0ec0;
            this.f53117x243a3e51 = bArr;
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm$TPObjectLifecycleMgr */
    /* loaded from: classes16.dex */
    public static class TPObjectLifecycleMgr implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22.ITPObjectLifecycleMgr<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo> {

        /* renamed from: mUUID */
        private final java.util.UUID f53119x627eda8;

        public TPObjectLifecycleMgr(java.util.UUID uuid) {
            this.f53119x627eda8 = uuid;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22.ITPObjectLifecycleMgr
        /* renamed from: create */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo mo102555xaf65a0fc(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo> c26392xec756b22) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0 c26387x8bfdb7c0 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0(this.f53119x627eda8);
                return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo(c26387x8bfdb7c0, c26387x8bfdb7c0.mo102512x6a952cec());
            } catch (android.media.MediaDrmException | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542 e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TAG, "createObject error:" + e17);
                return null;
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22.ITPObjectLifecycleMgr
        /* renamed from: release, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo102556x41012807(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo> c26392xec756b22, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo tPMediaDrmInfo) {
            tPMediaDrmInfo.f53118x5d6119b7.mo102507x5a5ddf8();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22.ITPObjectLifecycleMgr
        /* renamed from: reset, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo102557x6761d4f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo> c26392xec756b22, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo tPMediaDrmInfo) {
            tPMediaDrmInfo.f53118x5d6119b7.mo102508x2624157e(tPMediaDrmInfo.f53117x243a3e51);
            try {
                tPMediaDrmInfo.f53117x243a3e51 = tPMediaDrmInfo.f53118x5d6119b7.mo102512x6a952cec();
                return true;
            } catch (android.media.MediaDrmException | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542 e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TAG, "reset error:" + e17);
                return false;
            }
        }
    }

    public C26393x9708c893(java.util.UUID uuid) {
        m102568xed046e09();
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo m102566x2b17faac = m102566x2b17faac(uuid);
        this.f53107x1cb647f1 = m102566x2b17faac != null;
        if (m102566x2b17faac == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0 c26387x8bfdb7c0 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0(uuid);
            m102566x2b17faac = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo(c26387x8bfdb7c0, c26387x8bfdb7c0.mo102512x6a952cec());
        }
        this.f53112x65b478b2 = m102566x2b17faac;
        this.f53110xb10531e4 = m102566x2b17faac.f53118x5d6119b7;
        this.f53113x627eda8 = uuid;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "TPReuseMediaDrm constructor");
    }

    /* renamed from: allocTPMediaDrm */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo m102566x2b17faac(java.util.UUID uuid) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo> c26392xec756b22 = f53106x9bf1b256.get(uuid);
        if (c26392xec756b22 != null) {
            return c26392xec756b22.m102551x129336d4();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "allocTPMediaDrm error, this UUID DRM is not cached");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: freeTPMediaDrm */
    public void m102567x47ad1523(java.util.UUID uuid, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo tPMediaDrmInfo, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo> c26392xec756b22 = f53106x9bf1b256.get(uuid);
        if (c26392xec756b22 == null) {
            tPMediaDrmInfo.f53118x5d6119b7.mo102507x5a5ddf8();
        } else if (z17) {
            c26392xec756b22.m102552xc2ce24cb(tPMediaDrmInfo);
        } else {
            c26392xec756b22.m102553xdf4787b2(tPMediaDrmInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preload */
    public static void m102568xed046e09() {
        if (f53106x9bf1b256 != null) {
            return;
        }
        java.util.UUID uuid = f53105xac3481bd;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo> c26392xec756b22 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<>(1, 2, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPObjectLifecycleMgr(uuid));
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.class) {
            if (f53106x9bf1b256 == null) {
                java.util.HashMap<java.util.UUID, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.TPMediaDrmInfo>> hashMap = new java.util.HashMap<>();
                f53106x9bf1b256 = hashMap;
                hashMap.put(uuid, c26392xec756b22);
                c26392xec756b22 = null;
            }
        }
        if (c26392xec756b22 != null) {
            c26392xec756b22.m102554x41012807();
        }
    }

    /* renamed from: preloadAsync */
    public static void m102569x5db601f3() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.m102976x9cf0d20b().m102984x137f2902().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.m102568xed046e09();
            }
        });
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: close */
    public void mo102507x5a5ddf8() {
        this.f53110xb10531e4.mo102518x9021c82d(null, null);
        this.f53108x6d8ec478 = null;
        this.f53110xb10531e4.mo102519x442adaf4(null, null);
        this.f53109x6c57a949 = null;
        if (this.f53107x1cb647f1) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.m102976x9cf0d20b().m102984x137f2902().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.4
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893 c26393x9708c893 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.this;
                    c26393x9708c893.m102567x47ad1523(c26393x9708c893.f53113x627eda8, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.this.f53112x65b478b2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.this.f53111x50a43e84);
                }
            });
        } else {
            this.f53110xb10531e4.mo102507x5a5ddf8();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: closeSession */
    public synchronized void mo102508x2624157e(byte[] bArr) {
        if (!java.util.Arrays.equals(bArr, this.f53112x65b478b2.f53117x243a3e51)) {
            this.f53111x50a43e84 = true;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: getKeyRequest */
    public android.media.MediaDrm.KeyRequest mo102509x45e88b26(byte[] bArr, byte[] bArr2, java.lang.String str, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        return this.f53110xb10531e4.mo102509x45e88b26(bArr, bArr2, str, i17, hashMap);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: getPropertyString */
    public java.lang.String mo102510x7e95833c(java.lang.String str) {
        return this.f53110xb10531e4.mo102510x7e95833c(str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: getProvisionRequest */
    public android.media.MediaDrm.ProvisionRequest mo102511x89baf70() {
        return this.f53110xb10531e4.mo102511x89baf70();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: openSession */
    public synchronized byte[] mo102512x6a952cec() {
        return this.f53112x65b478b2.f53117x243a3e51;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: provideKeyResponse */
    public byte[] mo102513xfa625f(byte[] bArr, byte[] bArr2) {
        return this.f53110xb10531e4.mo102513xfa625f(bArr, bArr2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: provideProvisionResponse */
    public void mo102514xf850d395(byte[] bArr) {
        this.f53110xb10531e4.mo102514xf850d395(bArr);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: queryKeyStatus */
    public java.util.HashMap<java.lang.String, java.lang.String> mo102515x83543f49(byte[] bArr) {
        return this.f53110xb10531e4.mo102515x83543f49(bArr);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: removeKeys */
    public void mo102516x4176b898(byte[] bArr) {
        this.f53110xb10531e4.mo102516x4176b898(bArr);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: restoreKeys */
    public void mo102517x13a67da2(byte[] bArr, byte[] bArr2) {
        this.f53110xb10531e4.mo102517x13a67da2(bArr, bArr2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: setOnExpirationUpdateListener */
    public void mo102518x9021c82d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnExpirationUpdateListener onExpirationUpdateListener, android.os.Handler handler) {
        this.f53108x6d8ec478 = onExpirationUpdateListener;
        this.f53110xb10531e4.mo102518x9021c82d(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnExpirationUpdateListener() { // from class: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.3
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnExpirationUpdateListener
            /* renamed from: onExpirationUpdate */
            public void mo102522x2a402457(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 interfaceC26386xc0dc0ec0, byte[] bArr, long j17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnExpirationUpdateListener onExpirationUpdateListener2 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.this.f53108x6d8ec478;
                if (onExpirationUpdateListener2 != null) {
                    onExpirationUpdateListener2.mo102522x2a402457(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.this, bArr, j17);
                }
            }
        }, handler);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: setOnKeyStatusChangeListener */
    public void mo102519x442adaf4(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnKeyStatusChangeListener onKeyStatusChangeListener, android.os.Handler handler) {
        this.f53109x6c57a949 = onKeyStatusChangeListener;
        this.f53110xb10531e4.mo102519x442adaf4(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnKeyStatusChangeListener() { // from class: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.2
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnKeyStatusChangeListener
            /* renamed from: onKeyStatusChange */
            public void mo102523x7cad3e62(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 interfaceC26386xc0dc0ec0, byte[] bArr, java.util.List<android.media.MediaDrm.KeyStatus> list, boolean z17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnKeyStatusChangeListener onKeyStatusChangeListener2 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.this.f53109x6c57a949;
                if (onKeyStatusChangeListener2 != null) {
                    onKeyStatusChangeListener2.mo102523x7cad3e62(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26393x9708c893.this, bArr, list, z17);
                }
            }
        }, handler);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: setPropertyString */
    public void mo102520x468beb48(java.lang.String str, java.lang.String str2) {
        this.f53110xb10531e4.mo102520x468beb48(str, str2);
    }
}
