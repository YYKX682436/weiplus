package com.p314xaae8f345.p2936x80def495.jni;

/* renamed from: com.tencent.skyline.jni.SkylineFileSystem */
/* loaded from: classes7.dex */
public final class C25601xf41a6120 {
    private static final java.lang.String TAG = "SkylineFileSystem";

    /* renamed from: isInit */
    public boolean f46918xb9a4415a = true;

    /* renamed from: mDelegate */
    private com.p314xaae8f345.p2936x80def495.jni.InterfaceC25594x1b3dbf7 f46919x55d38512;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeNotifyWriteTempFile */
    public native void m95926x3ef9420f(long j17, int i17, java.lang.String str);

    /* renamed from: init */
    public void m95927x316510() {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        synchronized (this) {
            this.f46918xb9a4415a = true;
        }
    }

    /* renamed from: initFileSystem */
    public void m95928xa23e73fb(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25594x1b3dbf7 interfaceC25594x1b3dbf7) {
        this.f46919x55d38512 = interfaceC25594x1b3dbf7;
    }

    /* renamed from: release */
    public void m95929x41012807() {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, "release");
        synchronized (this) {
            this.f46918xb9a4415a = false;
        }
    }

    /* renamed from: writeTempFileAsync */
    public void m95930x5d21ef4d(final long j17, byte[] bArr, java.lang.String str) {
        if (bArr == null || bArr.length <= 0) {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f c25578x50634e8f = com.p314xaae8f345.p2936x80def495.C25578x50634e8f.f46807x4fbc8495;
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e(TAG, java.lang.String.format("writeTempFileAsync onWriteTempFile callbackPtr:%d fail, bytes is null", java.lang.Long.valueOf(j17)));
            m95926x3ef9420f(j17, -1, "");
            return;
        }
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f c25578x50634e8f2 = com.p314xaae8f345.p2936x80def495.C25578x50634e8f.f46807x4fbc8495;
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, java.lang.String.format("writeTempFileAsync callbackPtr:%d bytes:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(bArr.length)));
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25594x1b3dbf7 interfaceC25594x1b3dbf7 = this.f46919x55d38512;
        if (interfaceC25594x1b3dbf7 != null) {
            interfaceC25594x1b3dbf7.mo95907x5d21ef4d(bArr, str, new com.p314xaae8f345.p2936x80def495.jni.InterfaceC25595x3146795c() { // from class: com.tencent.skyline.jni.SkylineFileSystem.1
                @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25595x3146795c
                /* renamed from: onWriteTempFile */
                public void mo95908x762af4d0(int i17, java.lang.String str2) {
                    com.p314xaae8f345.p2936x80def495.C25578x50634e8f c25578x50634e8f3 = com.p314xaae8f345.p2936x80def495.C25578x50634e8f.f46807x4fbc8495;
                    com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(com.p314xaae8f345.p2936x80def495.jni.C25601xf41a6120.TAG, java.lang.String.format("writeTempFileAsync onWriteTempFile callbackPtr:%d path:%s", java.lang.Long.valueOf(j17), str2));
                    com.p314xaae8f345.p2936x80def495.jni.C25601xf41a6120.this.m95926x3ef9420f(j17, i17, str2);
                }
            });
        } else {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, java.lang.String.format("writeTempFileAsync onWriteTempFile callbackPtr:%d fail", java.lang.Long.valueOf(j17)));
            m95926x3ef9420f(j17, -1, "");
        }
    }
}
