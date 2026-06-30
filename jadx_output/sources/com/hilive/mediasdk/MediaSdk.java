package com.hilive.mediasdk;

/* loaded from: classes7.dex */
public class MediaSdk {
    private static final java.lang.String TAG = "[hilive][java]";
    private boolean mInited = false;
    private long mContext = 0;

    /* loaded from: classes7.dex */
    public interface MediaCallbacker {
        void onResult(byte[] bArr);
    }

    private boolean addAudio(int i17, byte[] bArr, int i18, int i19, int i27, long j17) {
        try {
            return nativeAddAudio(this.mContext, i17, bArr, i18, i19, i27, j17);
        } catch (java.lang.Exception e17) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "getFrame, error:" + e17.getMessage(), new java.lang.Object[0]);
            return false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "getFrame, error:" + e18.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    private boolean addVideo(int i17, byte[] bArr, int i18, int i19, int i27, boolean z17, boolean z18, long j17) {
        try {
            return nativeAddVideo(this.mContext, i17, bArr, i18, i19, i27, z17, z18, j17);
        } catch (java.lang.Exception e17) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "getFrame, error:" + e17.getMessage(), new java.lang.Object[0]);
            return false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "getFrame, error:" + e18.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    private boolean getFrame(int i17, boolean z17, byte[] bArr, com.hilive.mediasdk.SdkInfo.FrameInfo frameInfo) {
        try {
            return nativeGetFrame(this.mContext, i17, z17, bArr, frameInfo);
        } catch (java.lang.Exception e17) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "getFrame, error:" + e17.getMessage(), new java.lang.Object[0]);
            return false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "getFrame, error:" + e18.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    private native boolean nativeAddAudio(long j17, int i17, byte[] bArr, int i18, int i19, int i27, long j18);

    private native boolean nativeAddVideo(long j17, int i17, byte[] bArr, int i18, int i19, int i27, boolean z17, boolean z18, long j18);

    private native long nativeCreate(java.lang.String str);

    private native boolean nativeGetFrame(long j17, int i17, boolean z17, byte[] bArr, com.hilive.mediasdk.SdkInfo.FrameInfo frameInfo);

    private native void nativeRelease(long j17);

    private native boolean nativeRequest(long j17, int i17, byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker);

    private native boolean nativeSetConfig(long j17, int i17, int i18);

    private void request(int i17, byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        try {
            com.hilive.mediasdk.LogDelegate.i(TAG, "request, evtType:" + i17 + " bytes:" + bArr.length, new java.lang.Object[0]);
            if (!this.mInited) {
                com.hilive.mediasdk.LogDelegate.e(TAG, "request sdk not ready", new java.lang.Object[0]);
            } else if (!nativeRequest(this.mContext, i17, bArr, mediaCallbacker)) {
                com.hilive.mediasdk.LogDelegate.e(TAG, "request invoke failed", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e17) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "request, error:" + e17.getMessage(), new java.lang.Object[0]);
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "request, error:" + e18.getMessage(), new java.lang.Object[0]);
        }
    }

    public void Loging(int i17, byte[] bArr) {
        try {
            java.lang.String str = new java.lang.String(bArr);
            if (i17 == 1) {
                com.hilive.mediasdk.LogDelegate.e(TAG, str, new java.lang.Object[0]);
            } else if (i17 == 2) {
                com.hilive.mediasdk.LogDelegate.w(TAG, str, new java.lang.Object[0]);
            } else if (i17 == 3) {
                com.hilive.mediasdk.LogDelegate.i(TAG, str, new java.lang.Object[0]);
            } else if (i17 == 4 || i17 == 5) {
                com.hilive.mediasdk.LogDelegate.d(TAG, str, new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public synchronized void analysis(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "analysis", new java.lang.Object[0]);
        request(101, bArr, mediaCallbacker);
    }

    public synchronized void editorAddTrack(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "editorAddTrack", new java.lang.Object[0]);
        request(202, bArr, mediaCallbacker);
    }

    public synchronized void editorCreate(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "editorCreate", new java.lang.Object[0]);
        request(200, bArr, mediaCallbacker);
    }

    public synchronized void editorDelTrack(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "editorDelTrack", new java.lang.Object[0]);
        request(204, bArr, mediaCallbacker);
    }

    public synchronized void editorExport(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "editorExport", new java.lang.Object[0]);
        request(205, bArr, mediaCallbacker);
    }

    public synchronized void editorGetTrack(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "editorGetTrack", new java.lang.Object[0]);
        request(201, bArr, mediaCallbacker);
    }

    public synchronized void editorRemove(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "editorRemove", new java.lang.Object[0]);
        request(206, bArr, mediaCallbacker);
    }

    public synchronized void editorUpdateTrack(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "editorUpdateTrack", new java.lang.Object[0]);
        request(203, bArr, mediaCallbacker);
    }

    public void finalize() {
        uint();
    }

    public synchronized boolean init(android.content.Context context) {
        try {
            com.hilive.mediasdk.LogDelegate.i(TAG, "init sdk baseDir " + context.getCacheDir().getAbsolutePath(), new java.lang.Object[0]);
            com.hilive.mediasdk.LoadDelegate.loadLibraries();
            if (!this.mInited) {
                long nativeCreate = nativeCreate(context.getCacheDir().getAbsolutePath());
                this.mContext = nativeCreate;
                this.mInited = nativeCreate != 0;
            }
            com.hilive.mediasdk.LogDelegate.i(TAG, "init sdk, sdk:" + this.mContext, new java.lang.Object[0]);
            return this.mInited;
        } catch (java.lang.Exception e17) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "init failed, Exception error:" + e17.getMessage(), new java.lang.Object[0]);
            return false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "init failed, UnsatisfiedLinkError error:" + e18.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    public synchronized boolean isInited() {
        return this.mInited;
    }

    public synchronized void loaderCreate(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "loaderCreate", new java.lang.Object[0]);
        request(500, bArr, mediaCallbacker);
    }

    public synchronized void loaderRemove(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "loaderRemove", new java.lang.Object[0]);
        request(503, bArr, mediaCallbacker);
    }

    public synchronized void loaderStart(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "loaderStart", new java.lang.Object[0]);
        request(501, bArr, mediaCallbacker);
    }

    public synchronized void loaderStop(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "loaderStop", new java.lang.Object[0]);
        request(502, bArr, mediaCallbacker);
    }

    public synchronized void readerCreate(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "readerCreate", new java.lang.Object[0]);
        request(400, bArr, mediaCallbacker);
    }

    public synchronized boolean readerGetAudio(int i17, byte[] bArr, com.hilive.mediasdk.SdkInfo.FrameInfo frameInfo) {
        return getFrame(i17, false, bArr, frameInfo);
    }

    public synchronized boolean readerGetVideo(int i17, byte[] bArr, com.hilive.mediasdk.SdkInfo.FrameInfo frameInfo) {
        return getFrame(i17, true, bArr, frameInfo);
    }

    public synchronized void readerRemove(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "readerRemove", new java.lang.Object[0]);
        request(405, bArr, mediaCallbacker);
    }

    public synchronized void readerSeek(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "readerSeek", new java.lang.Object[0]);
        request(402, bArr, mediaCallbacker);
    }

    public synchronized void readerStart(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "readerStart", new java.lang.Object[0]);
        request(401, bArr, mediaCallbacker);
    }

    public synchronized void readerStop(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "readerStop", new java.lang.Object[0]);
        request(404, bArr, mediaCallbacker);
    }

    public synchronized void remux(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "remux", new java.lang.Object[0]);
        request(102, bArr, mediaCallbacker);
    }

    public synchronized boolean setConfig(int i17, int i18) {
        try {
        } catch (java.lang.Exception e17) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "getSdkVersion failed, error:" + e17.getMessage(), new java.lang.Object[0]);
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "getSdkVersion failed, error:" + e18.getMessage(), new java.lang.Object[0]);
        }
        if (!this.mInited) {
            return false;
        }
        return nativeSetConfig(this.mContext, i17, i18);
    }

    public synchronized void test(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "test", new java.lang.Object[0]);
        request(100, bArr, mediaCallbacker);
    }

    public synchronized void uint() {
        com.hilive.mediasdk.LogDelegate.i(TAG, "uint start", new java.lang.Object[0]);
        try {
            try {
                this.mInited = false;
                nativeRelease(this.mContext);
                this.mContext = 0L;
            } catch (java.lang.Exception e17) {
                com.hilive.mediasdk.LogDelegate.e(TAG, "release, Exception error:" + e17.getMessage(), new java.lang.Object[0]);
            }
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.hilive.mediasdk.LogDelegate.e(TAG, "release, UnsatisfiedLinkError error:" + e18.getMessage(), new java.lang.Object[0]);
        }
        com.hilive.mediasdk.LogDelegate.i(TAG, "uint end", new java.lang.Object[0]);
    }

    public synchronized boolean writerAudio(int i17, byte[] bArr, int i18, int i19, int i27, long j17) {
        return addAudio(i17, bArr, i18, i19, i27, j17);
    }

    public synchronized void writerCreate(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "writerCreate", new java.lang.Object[0]);
        request(300, bArr, mediaCallbacker);
    }

    public synchronized void writerRemove(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "writerRemove", new java.lang.Object[0]);
        request(304, bArr, mediaCallbacker);
    }

    public synchronized void writerStart(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "writerStart", new java.lang.Object[0]);
        request(301, bArr, mediaCallbacker);
    }

    public synchronized void writerStop(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "writerStop", new java.lang.Object[0]);
        request(303, bArr, mediaCallbacker);
    }

    public synchronized void writerUpdate(byte[] bArr, com.hilive.mediasdk.MediaSdk.MediaCallbacker mediaCallbacker) {
        com.hilive.mediasdk.LogDelegate.i(TAG, "writerUpdate", new java.lang.Object[0]);
        request(302, bArr, mediaCallbacker);
    }

    public synchronized boolean writerVideo(int i17, byte[] bArr, int i18, int i19, int i27, boolean z17, boolean z18, long j17) {
        return addVideo(i17, bArr, i18, i19, i27, z17, z18, j17);
    }
}
