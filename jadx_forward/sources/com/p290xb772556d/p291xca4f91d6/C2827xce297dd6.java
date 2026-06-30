package com.p290xb772556d.p291xca4f91d6;

/* renamed from: com.hilive.mediasdk.MediaSdk */
/* loaded from: classes7.dex */
public class C2827xce297dd6 {
    private static final java.lang.String TAG = "[hilive][java]";

    /* renamed from: mInited */
    private boolean f9493x8d8947c = false;

    /* renamed from: mContext */
    private long f9492xd6cfe882 = 0;

    /* renamed from: com.hilive.mediasdk.MediaSdk$MediaCallbacker */
    /* loaded from: classes7.dex */
    public interface MediaCallbacker {
        /* renamed from: onResult */
        void mo21053x57429edc(byte[] bArr);
    }

    /* renamed from: addAudio */
    private boolean m21008xb4b06fb5(int i17, byte[] bArr, int i18, int i19, int i27, long j17) {
        try {
            return m21011xcca31cec(this.f9492xd6cfe882, i17, bArr, i18, i19, i27, j17);
        } catch (java.lang.Exception e17) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "getFrame, error:" + e17.getMessage(), new java.lang.Object[0]);
            return false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "getFrame, error:" + e18.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: addVideo */
    private boolean m21009xb5d2e85a(int i17, byte[] bArr, int i18, int i19, int i27, boolean z17, boolean z18, long j17) {
        try {
            return m21012xcdc59591(this.f9492xd6cfe882, i17, bArr, i18, i19, i27, z17, z18, j17);
        } catch (java.lang.Exception e17) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "getFrame, error:" + e17.getMessage(), new java.lang.Object[0]);
            return false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "getFrame, error:" + e18.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: getFrame */
    private boolean m21010x74704fb7(int i17, boolean z17, byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.FrameInfo frameInfo) {
        try {
            return m21014x8c62fcee(this.f9492xd6cfe882, i17, z17, bArr, frameInfo);
        } catch (java.lang.Exception e17) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "getFrame, error:" + e17.getMessage(), new java.lang.Object[0]);
            return false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "getFrame, error:" + e18.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: nativeAddAudio */
    private native boolean m21011xcca31cec(long j17, int i17, byte[] bArr, int i18, int i19, int i27, long j18);

    /* renamed from: nativeAddVideo */
    private native boolean m21012xcdc59591(long j17, int i17, byte[] bArr, int i18, int i19, int i27, boolean z17, boolean z18, long j18);

    /* renamed from: nativeCreate */
    private native long m21013x73c02ff3(java.lang.String str);

    /* renamed from: nativeGetFrame */
    private native boolean m21014x8c62fcee(long j17, int i17, boolean z17, byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.FrameInfo frameInfo);

    /* renamed from: nativeRelease */
    private native void m21015x7f877f0(long j17);

    /* renamed from: nativeRequest */
    private native boolean m21016x8464278(long j17, int i17, byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker);

    /* renamed from: nativeSetConfig */
    private native boolean m21017xedeed3ed(long j17, int i17, int i18);

    /* renamed from: request */
    private void m21018x414ef28f(int i17, byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        try {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "request, evtType:" + i17 + " bytes:" + bArr.length, new java.lang.Object[0]);
            if (!this.f9493x8d8947c) {
                com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "request sdk not ready", new java.lang.Object[0]);
            } else if (!m21016x8464278(this.f9492xd6cfe882, i17, bArr, mediaCallbacker)) {
                com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "request invoke failed", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e17) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "request, error:" + e17.getMessage(), new java.lang.Object[0]);
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "request, error:" + e18.getMessage(), new java.lang.Object[0]);
        }
    }

    /* renamed from: Loging */
    public void m21019x87fcea3e(int i17, byte[] bArr) {
        try {
            java.lang.String str = new java.lang.String(bArr);
            if (i17 == 1) {
                com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, str, new java.lang.Object[0]);
            } else if (i17 == 2) {
                com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.w(TAG, str, new java.lang.Object[0]);
            } else if (i17 == 3) {
                com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, str, new java.lang.Object[0]);
            } else if (i17 == 4 || i17 == 5) {
                com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.d(TAG, str, new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: analysis */
    public synchronized void m21020xc2f032dc(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "analysis", new java.lang.Object[0]);
        m21018x414ef28f(101, bArr, mediaCallbacker);
    }

    /* renamed from: editorAddTrack */
    public synchronized void m21021x93138db7(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "editorAddTrack", new java.lang.Object[0]);
        m21018x414ef28f(202, bArr, mediaCallbacker);
    }

    /* renamed from: editorCreate */
    public synchronized void m21022xa58128c9(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "editorCreate", new java.lang.Object[0]);
        m21018x414ef28f(200, bArr, mediaCallbacker);
    }

    /* renamed from: editorDelTrack */
    public synchronized void m21023xd44148d(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "editorDelTrack", new java.lang.Object[0]);
        m21018x414ef28f(204, bArr, mediaCallbacker);
    }

    /* renamed from: editorExport */
    public synchronized void m21024xa9449b81(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "editorExport", new java.lang.Object[0]);
        m21018x414ef28f(205, bArr, mediaCallbacker);
    }

    /* renamed from: editorGetTrack */
    public synchronized void m21025x528e6022(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "editorGetTrack", new java.lang.Object[0]);
        m21018x414ef28f(201, bArr, mediaCallbacker);
    }

    /* renamed from: editorRemove */
    public synchronized void m21026xbe668051(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "editorRemove", new java.lang.Object[0]);
        m21018x414ef28f(206, bArr, mediaCallbacker);
    }

    /* renamed from: editorUpdateTrack */
    public synchronized void m21027x3c082e55(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "editorUpdateTrack", new java.lang.Object[0]);
        m21018x414ef28f(203, bArr, mediaCallbacker);
    }

    /* renamed from: finalize */
    public void m21028xd764dc1e() {
        m21045x36c75a();
    }

    /* renamed from: init */
    public synchronized boolean m21029x316510(android.content.Context context) {
        try {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "init sdk baseDir " + context.getCacheDir().getAbsolutePath(), new java.lang.Object[0]);
            com.p290xb772556d.p291xca4f91d6.C2825x872614ab.m20997x74893053();
            if (!this.f9493x8d8947c) {
                long m21013x73c02ff3 = m21013x73c02ff3(context.getCacheDir().getAbsolutePath());
                this.f9492xd6cfe882 = m21013x73c02ff3;
                this.f9493x8d8947c = m21013x73c02ff3 != 0;
            }
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "init sdk, sdk:" + this.f9492xd6cfe882, new java.lang.Object[0]);
            return this.f9493x8d8947c;
        } catch (java.lang.Exception e17) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "init failed, Exception error:" + e17.getMessage(), new java.lang.Object[0]);
            return false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "init failed, UnsatisfiedLinkError error:" + e18.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: isInited */
    public synchronized boolean m21030xe1995f79() {
        return this.f9493x8d8947c;
    }

    /* renamed from: loaderCreate */
    public synchronized void m21031x4bd222ef(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "loaderCreate", new java.lang.Object[0]);
        m21018x414ef28f(500, bArr, mediaCallbacker);
    }

    /* renamed from: loaderRemove */
    public synchronized void m21032x64b77a77(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "loaderRemove", new java.lang.Object[0]);
        m21018x414ef28f(503, bArr, mediaCallbacker);
    }

    /* renamed from: loaderStart */
    public synchronized void m21033x245cb80f(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "loaderStart", new java.lang.Object[0]);
        m21018x414ef28f(501, bArr, mediaCallbacker);
    }

    /* renamed from: loaderStop */
    public synchronized void m21034x11b06ab5(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "loaderStop", new java.lang.Object[0]);
        m21018x414ef28f(502, bArr, mediaCallbacker);
    }

    /* renamed from: readerCreate */
    public synchronized void m21035xa90d079f(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "readerCreate", new java.lang.Object[0]);
        m21018x414ef28f(400, bArr, mediaCallbacker);
    }

    /* renamed from: readerGetAudio */
    public synchronized boolean m21036xa1938c03(int i17, byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.FrameInfo frameInfo) {
        return m21010x74704fb7(i17, false, bArr, frameInfo);
    }

    /* renamed from: readerGetVideo */
    public synchronized boolean m21037xa2b604a8(int i17, byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.FrameInfo frameInfo) {
        return m21010x74704fb7(i17, true, bArr, frameInfo);
    }

    /* renamed from: readerRemove */
    public synchronized void m21038xc1f25f27(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "readerRemove", new java.lang.Object[0]);
        m21018x414ef28f(405, bArr, mediaCallbacker);
    }

    /* renamed from: readerSeek */
    public synchronized void m21039xbc81db(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "readerSeek", new java.lang.Object[0]);
        m21018x414ef28f(402, bArr, mediaCallbacker);
    }

    /* renamed from: readerStart */
    public synchronized void m21040x16da7d5f(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "readerStart", new java.lang.Object[0]);
        m21018x414ef28f(401, bArr, mediaCallbacker);
    }

    /* renamed from: readerStop */
    public synchronized void m21041xbcbb65(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "readerStop", new java.lang.Object[0]);
        m21018x414ef28f(404, bArr, mediaCallbacker);
    }

    /* renamed from: remux */
    public synchronized void m21042x67608bd(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "remux", new java.lang.Object[0]);
        m21018x414ef28f(102, bArr, mediaCallbacker);
    }

    /* renamed from: setConfig */
    public synchronized boolean m21043x78bda44(int i17, int i18) {
        try {
        } catch (java.lang.Exception e17) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "getSdkVersion failed, error:" + e17.getMessage(), new java.lang.Object[0]);
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "getSdkVersion failed, error:" + e18.getMessage(), new java.lang.Object[0]);
        }
        if (!this.f9493x8d8947c) {
            return false;
        }
        return m21017xedeed3ed(this.f9492xd6cfe882, i17, i18);
    }

    /* renamed from: test */
    public synchronized void m21044x364492(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "test", new java.lang.Object[0]);
        m21018x414ef28f(100, bArr, mediaCallbacker);
    }

    /* renamed from: uint */
    public synchronized void m21045x36c75a() {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "uint start", new java.lang.Object[0]);
        try {
            try {
                this.f9493x8d8947c = false;
                m21015x7f877f0(this.f9492xd6cfe882);
                this.f9492xd6cfe882 = 0L;
            } catch (java.lang.Exception e17) {
                com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "release, Exception error:" + e17.getMessage(), new java.lang.Object[0]);
            }
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(TAG, "release, UnsatisfiedLinkError error:" + e18.getMessage(), new java.lang.Object[0]);
        }
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "uint end", new java.lang.Object[0]);
    }

    /* renamed from: writerAudio */
    public synchronized boolean m21046x8645d723(int i17, byte[] bArr, int i18, int i19, int i27, long j17) {
        return m21008xb4b06fb5(i17, bArr, i18, i19, i27, j17);
    }

    /* renamed from: writerCreate */
    public synchronized void m21047x45b4cf4f(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "writerCreate", new java.lang.Object[0]);
        m21018x414ef28f(300, bArr, mediaCallbacker);
    }

    /* renamed from: writerRemove */
    public synchronized void m21048x5e9a26d7(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "writerRemove", new java.lang.Object[0]);
        m21018x414ef28f(304, bArr, mediaCallbacker);
    }

    /* renamed from: writerStart */
    public synchronized void m21049x8742ffaf(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "writerStart", new java.lang.Object[0]);
        m21018x414ef28f(301, bArr, mediaCallbacker);
    }

    /* renamed from: writerStop */
    public synchronized void m21050xdb12af15(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "writerStop", new java.lang.Object[0]);
        m21018x414ef28f(303, bArr, mediaCallbacker);
    }

    /* renamed from: writerUpdate */
    public synchronized void m21051x644f671c(byte[] bArr, com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker mediaCallbacker) {
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(TAG, "writerUpdate", new java.lang.Object[0]);
        m21018x414ef28f(302, bArr, mediaCallbacker);
    }

    /* renamed from: writerVideo */
    public synchronized boolean m21052x87684fc8(int i17, byte[] bArr, int i18, int i19, int i27, boolean z17, boolean z18, long j17) {
        return m21009xb5d2e85a(i17, bArr, i18, i19, i27, z17, z18, j17);
    }
}
