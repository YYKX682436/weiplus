package com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493;

/* renamed from: com.tencent.tav.extractor.wrapper.ExtractorLoader */
/* loaded from: classes16.dex */
public class C25825xcbc87737 {

    /* renamed from: loadHandler */
    private static android.os.Handler f48556xabafb84;

    /* renamed from: loadThread */
    private static android.os.HandlerThread f48557xf42efa90;

    /* renamed from: com.tencent.tav.extractor.wrapper.ExtractorLoader$ExtractorLoaderRunnable */
    /* loaded from: classes16.dex */
    public static class ExtractorLoaderRunnable implements java.lang.Runnable {

        /* renamed from: extractor */
        private com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 f48558xf0edce24;

        public ExtractorLoaderRunnable(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
            this.f48558xf0edce24 = c25820xcadb1d34;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.m98005xde2d761f(this.f48558xf0edce24.m97967xabff72d6())) {
                return;
            }
            com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef c25826xf84f21ef = new com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef(this.f48558xf0edce24.m97967xabff72d6());
            c25826xf84f21ef.m97998xc8f96935(this.f48558xf0edce24);
            com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.put(c25826xf84f21ef);
            this.f48558xf0edce24.m97958x63a5261f();
            this.f48558xf0edce24 = null;
        }
    }

    /* renamed from: com.tencent.tav.extractor.wrapper.ExtractorLoader$VideoPathLoaderRunnable */
    /* loaded from: classes16.dex */
    public static class VideoPathLoaderRunnable implements java.lang.Runnable {

        /* renamed from: videoPath */
        private java.lang.String f48559x4f713740;

        public VideoPathLoaderRunnable(java.lang.String str) {
            this.f48559x4f713740 = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.m98005xde2d761f(this.f48559x4f713740) || this.f48559x4f713740 == null) {
                return;
            }
            com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
            c25820xcadb1d34.m97977x683d6267(this.f48559x4f713740);
            com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef c25826xf84f21ef = new com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25826xf84f21ef(this.f48559x4f713740);
            c25826xf84f21ef.m97998xc8f96935(c25820xcadb1d34);
            com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.put(c25826xf84f21ef);
            c25820xcadb1d34.m97958x63a5261f();
        }
    }

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExtractorLoader");
        f48557xf42efa90 = handlerThread;
        handlerThread.start();
    }

    /* renamed from: cacheExtractor */
    public static void m97993xf85f90c2(java.lang.String str) {
        m97994x5698a9f3();
        f48556xabafb84.post(new com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25825xcbc87737.VideoPathLoaderRunnable(str));
    }

    /* renamed from: checkAndStart */
    private static void m97994x5698a9f3() {
        if (f48556xabafb84 != null || f48557xf42efa90.getLooper() == null) {
            return;
        }
        f48556xabafb84 = new android.os.Handler(f48557xf42efa90.getLooper());
    }

    /* renamed from: cacheExtractor */
    public static void m97992xf85f90c2(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
        m97994x5698a9f3();
        f48556xabafb84.post(new com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25825xcbc87737.ExtractorLoaderRunnable(c25820xcadb1d34));
    }
}
