package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm;

/* renamed from: com.tencent.thumbplayer.core.drm.TPDirectMediaDrm */
/* loaded from: classes16.dex */
public class C26387x8bfdb7c0 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0 {
    private static final java.lang.String TAG = "TPDirectMediaDrm";

    /* renamed from: mMediaDrm */
    private android.media.MediaDrm f53061xef4c8aa8;

    /* renamed from: mOnEventListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnEventListener f53062xe13375a2;

    /* renamed from: mOnExpirationUpdateListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnExpirationUpdateListener f53063x6d8ec478;

    /* renamed from: mOnKeyStatusChangeListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnKeyStatusChangeListener f53064x6c57a949;

    /* renamed from: mReleased */
    private boolean f53065x42180ca;

    public C26387x8bfdb7c0(java.util.UUID uuid) {
        this.f53065x42180ca = false;
        try {
            this.f53061xef4c8aa8 = new android.media.MediaDrm(uuid);
        } catch (android.media.UnsupportedSchemeException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            this.f53065x42180ca = true;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "new MediaDrm failed, e:" + th6);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "TPDirectMediaDrm constructor");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: close */
    public synchronized void mo102507x5a5ddf8() {
        if (this.f53065x42180ca) {
            return;
        }
        this.f53061xef4c8aa8.setOnEventListener(null);
        this.f53062xe13375a2 = null;
        int i17 = android.os.Build.VERSION.SDK_INT;
        this.f53061xef4c8aa8.setOnExpirationUpdateListener((android.media.MediaDrm.OnExpirationUpdateListener) null, (android.os.Handler) null);
        this.f53063x6d8ec478 = null;
        this.f53061xef4c8aa8.setOnKeyStatusChangeListener((android.media.MediaDrm.OnKeyStatusChangeListener) null, (android.os.Handler) null);
        this.f53064x6c57a949 = null;
        try {
            if (i17 >= 28) {
                this.f53061xef4c8aa8.release();
            } else {
                this.f53061xef4c8aa8.release();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
        }
        this.f53061xef4c8aa8 = null;
        this.f53065x42180ca = true;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: closeSession */
    public synchronized void mo102508x2624157e(byte[] bArr) {
        if (this.f53065x42180ca) {
            return;
        }
        try {
            this.f53061xef4c8aa8.closeSession(bArr);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: getKeyRequest */
    public synchronized android.media.MediaDrm.KeyRequest mo102509x45e88b26(byte[] bArr, byte[] bArr2, java.lang.String str, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        if (this.f53065x42180ca) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542("released");
        }
        try {
        } catch (android.media.MediaDrmException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542(th6.getMessage());
        }
        return this.f53061xef4c8aa8.getKeyRequest(bArr, bArr2, str, i17, hashMap);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: getPropertyString */
    public synchronized java.lang.String mo102510x7e95833c(java.lang.String str) {
        if (this.f53065x42180ca) {
            return "";
        }
        try {
            return this.f53061xef4c8aa8.getPropertyString(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
            return "";
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: getProvisionRequest */
    public synchronized android.media.MediaDrm.ProvisionRequest mo102511x89baf70() {
        if (this.f53065x42180ca) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542("released");
        }
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542(th6.getMessage());
        }
        return this.f53061xef4c8aa8.getProvisionRequest();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: openSession */
    public synchronized byte[] mo102512x6a952cec() {
        if (this.f53065x42180ca) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542("released");
        }
        try {
        } catch (android.media.MediaDrmException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542(th6.getMessage());
        }
        return this.f53061xef4c8aa8.openSession();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: provideKeyResponse */
    public synchronized byte[] mo102513xfa625f(byte[] bArr, byte[] bArr2) {
        if (this.f53065x42180ca) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542("released");
        }
        try {
        } catch (android.media.MediaDrmException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26389xaaa43542(th6.getMessage());
        }
        return this.f53061xef4c8aa8.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: provideProvisionResponse */
    public synchronized void mo102514xf850d395(byte[] bArr) {
        if (this.f53065x42180ca) {
            return;
        }
        try {
            this.f53061xef4c8aa8.provideProvisionResponse(bArr);
        } catch (android.media.MediaDrmException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: queryKeyStatus */
    public synchronized java.util.HashMap<java.lang.String, java.lang.String> mo102515x83543f49(byte[] bArr) {
        if (this.f53065x42180ca) {
            return new java.util.HashMap<>();
        }
        try {
            return this.f53061xef4c8aa8.queryKeyStatus(bArr);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
            return new java.util.HashMap<>();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: removeKeys */
    public synchronized void mo102516x4176b898(byte[] bArr) {
        if (this.f53065x42180ca) {
            return;
        }
        try {
            this.f53061xef4c8aa8.removeKeys(bArr);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: restoreKeys */
    public synchronized void mo102517x13a67da2(byte[] bArr, byte[] bArr2) {
        if (this.f53065x42180ca) {
            return;
        }
        try {
            this.f53061xef4c8aa8.restoreKeys(bArr, bArr2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: setOnExpirationUpdateListener */
    public synchronized void mo102518x9021c82d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnExpirationUpdateListener onExpirationUpdateListener, android.os.Handler handler) {
        if (this.f53065x42180ca) {
            return;
        }
        this.f53063x6d8ec478 = onExpirationUpdateListener;
        this.f53061xef4c8aa8.setOnExpirationUpdateListener(new android.media.MediaDrm.OnExpirationUpdateListener() { // from class: com.tencent.thumbplayer.core.drm.TPDirectMediaDrm.2
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public void onExpirationUpdate(android.media.MediaDrm mediaDrm, byte[] bArr, long j17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnExpirationUpdateListener onExpirationUpdateListener2 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0.this.f53063x6d8ec478;
                if (onExpirationUpdateListener2 != null) {
                    onExpirationUpdateListener2.mo102522x2a402457(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0.this, bArr, j17);
                }
            }
        }, handler);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: setOnKeyStatusChangeListener */
    public synchronized void mo102519x442adaf4(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnKeyStatusChangeListener onKeyStatusChangeListener, android.os.Handler handler) {
        if (this.f53065x42180ca) {
            return;
        }
        this.f53064x6c57a949 = onKeyStatusChangeListener;
        this.f53061xef4c8aa8.setOnKeyStatusChangeListener(new android.media.MediaDrm.OnKeyStatusChangeListener() { // from class: com.tencent.thumbplayer.core.drm.TPDirectMediaDrm.1
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public void onKeyStatusChange(android.media.MediaDrm mediaDrm, byte[] bArr, java.util.List<android.media.MediaDrm.KeyStatus> list, boolean z17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0.OnKeyStatusChangeListener onKeyStatusChangeListener2 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0.this.f53064x6c57a949;
                if (onKeyStatusChangeListener2 != null) {
                    onKeyStatusChangeListener2.mo102523x7cad3e62(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.C26387x8bfdb7c0.this, bArr, list, z17);
                }
            }
        }, handler);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26386xc0dc0ec0
    /* renamed from: setPropertyString */
    public synchronized void mo102520x468beb48(java.lang.String str, java.lang.String str2) {
        if (this.f53065x42180ca) {
            return;
        }
        try {
            this.f53061xef4c8aa8.setPropertyString(str, str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, th6.toString());
            mo102507x5a5ddf8();
        }
    }
}
