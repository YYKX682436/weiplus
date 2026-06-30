package com.p314xaae8f345.p2936x80def495.jni;

/* renamed from: com.tencent.skyline.jni.SkylineResourceLoader */
/* loaded from: classes7.dex */
public final class C25605x34db0596 {
    private static final java.lang.String TAG = "SkylineResourceLoader";

    /* renamed from: isInit */
    public boolean f46928xb9a4415a = true;

    /* renamed from: mDelegate */
    private com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced f46929x55d38512;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeNotifyBitmapLoad */
    public native void m95959xae7c2d15(int i17, android.graphics.Bitmap bitmap, int i18, int i19);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeNotifyResourceLoad */
    public native void m95960x9f96074(long j17, byte[] bArr);

    /* renamed from: init */
    public void m95961x316510() {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        synchronized (this) {
            this.f46928xb9a4415a = true;
        }
    }

    /* renamed from: initResourceLoader */
    public void m95962x3ab432f1(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced interfaceC25597x90fd3ced) {
        this.f46929x55d38512 = interfaceC25597x90fd3ced;
    }

    /* renamed from: loadBitmap */
    public android.graphics.Bitmap m95963xd586ddb5(java.lang.String str) {
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced interfaceC25597x90fd3ced = this.f46929x55d38512;
        if (interfaceC25597x90fd3ced != null) {
            return interfaceC25597x90fd3ced.mo95912xd586ddb5(str);
        }
        return null;
    }

    /* renamed from: loadBitmapAsync */
    public void m95964x5e27dc7(final int i17, java.lang.String str) {
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced interfaceC25597x90fd3ced = this.f46929x55d38512;
        if (interfaceC25597x90fd3ced != null) {
            interfaceC25597x90fd3ced.mo95913x5e27dc7(str, new com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.BitmapLoadCallback() { // from class: com.tencent.skyline.jni.SkylineResourceLoader.2
                @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.BitmapLoadCallback
                /* renamed from: onBitmapLoaded */
                public void mo95916x5481b993(android.graphics.Bitmap bitmap) {
                    if (bitmap != null) {
                        com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596.this.m95959xae7c2d15(i17, bitmap, bitmap.getWidth(), bitmap.getHeight());
                        return;
                    }
                    com.p314xaae8f345.p2936x80def495.C25578x50634e8f c25578x50634e8f = com.p314xaae8f345.p2936x80def495.C25578x50634e8f.f46807x4fbc8495;
                    com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e(com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596.TAG, "requestId:" + i17 + " resource is null, return");
                    com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596.this.m95959xae7c2d15(i17, null, 0, 0);
                }
            });
        } else {
            m95959xae7c2d15(i17, null, 0, 0);
        }
    }

    /* renamed from: loadResource */
    public byte[] m95965x3830a714(java.lang.String str) {
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced interfaceC25597x90fd3ced = this.f46929x55d38512;
        return interfaceC25597x90fd3ced != null ? interfaceC25597x90fd3ced.mo95914x3830a714(str) : new byte[0];
    }

    /* renamed from: loadResourceAsync */
    public void m95966x850ab7c8(final long j17, java.lang.String str) {
        synchronized (this) {
            if (!this.f46928xb9a4415a) {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.w(TAG, "isInit is false, ignore");
                return;
            }
            com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced interfaceC25597x90fd3ced = this.f46929x55d38512;
            if (interfaceC25597x90fd3ced != null) {
                interfaceC25597x90fd3ced.mo95915x850ab7c8(str, new com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.ResourceLoadCallback() { // from class: com.tencent.skyline.jni.SkylineResourceLoader.1
                    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.ResourceLoadCallback
                    /* renamed from: onResourceLoaded */
                    public void mo95917x2027c572(byte[] bArr) {
                        synchronized (com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596.this) {
                            com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596 c25605x34db0596 = com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596.this;
                            if (!c25605x34db0596.f46928xb9a4415a) {
                                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.w(com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596.TAG, "isInit is false, ignore");
                                return;
                            }
                            if (bArr == null) {
                                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e(com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596.TAG, "resource is null, return");
                                com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596.this.m95960x9f96074(j17, new byte[0]);
                            } else {
                                c25605x34db0596.m95960x9f96074(j17, bArr);
                            }
                        }
                    }
                });
            } else {
                m95960x9f96074(j17, new byte[0]);
            }
        }
    }

    /* renamed from: release */
    public void m95967x41012807() {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, "release");
        synchronized (this) {
            this.f46928xb9a4415a = false;
        }
    }
}
