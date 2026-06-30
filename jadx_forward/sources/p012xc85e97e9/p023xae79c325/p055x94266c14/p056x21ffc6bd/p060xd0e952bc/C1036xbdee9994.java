package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor */
/* loaded from: classes14.dex */
public class C1036xbdee9994 {
    private static final java.lang.String TAG = "StillCaptureProcessor";

    /* renamed from: UNSPECIFIED_TIMESTAMP */
    private static final long f2598xfab9a1ce = -1;

    /* renamed from: mCaptureOutputSurface */
    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1010x6cc09e0f f2599xef2a1ed3;

    /* renamed from: mCaptureProcessorImpl */
    final androidx.camera.extensions.impl.CaptureProcessorImpl f2600x5cbb3039;

    /* renamed from: mIsPostviewConfigured */
    private boolean f2604x18d0163a;

    /* renamed from: mCaptureResultImageMatcher */
    final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da f2601x4151660d = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da();

    /* renamed from: mLock */
    final java.lang.Object f2605x6243b38 = new java.lang.Object();

    /* renamed from: mCaptureResults */
    java.util.HashMap<java.lang.Integer, android.util.Pair<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult>> f2602xe0fb7b9d = new java.util.HashMap<>();

    /* renamed from: mOnCaptureResultCallback */
    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback f2606xc39e09c = null;

    /* renamed from: mSourceCaptureResult */
    android.hardware.camera2.TotalCaptureResult f2607x585d88fb = null;

    /* renamed from: mIsClosed */
    boolean f2603xfc407ac3 = false;

    /* renamed from: mTimeStampForOutputImage */
    long f2608x93057ba = -1;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$OnCaptureResultCallback */
    /* loaded from: classes14.dex */
    public interface OnCaptureResultCallback {
        /* renamed from: onCaptureCompleted */
        void mo6816x34cad1a4(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list);

        /* renamed from: onCaptureProcessProgressed */
        void mo6817x1c9165b4(int i17);

        /* renamed from: onError */
        void mo6818xaf8aa769(java.lang.Exception exc);

        /* renamed from: onProcessCompleted */
        void mo6819x5e02789b();
    }

    public C1036xbdee9994(androidx.camera.extensions.impl.CaptureProcessorImpl captureProcessorImpl, android.view.Surface surface, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0737x4073a84c abstractC0737x4073a84c, boolean z17) {
        this.f2600x5cbb3039 = captureProcessorImpl;
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1010x6cc09e0f c1010x6cc09e0f = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1010x6cc09e0f(surface, size, z17);
        this.f2599xef2a1ed3 = c1010x6cc09e0f;
        captureProcessorImpl.onOutputSurface(c1010x6cc09e0f.m6743xcf572877(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.f2604x18d0163a = abstractC0737x4073a84c != null;
        if (abstractC0737x4073a84c != null) {
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
            if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8)) {
                m3.h.a(abstractC0737x4073a84c.mo5155x450a23fc() == 35);
                captureProcessorImpl.onResolutionUpdate(size, abstractC0737x4073a84c.mo5156xfb854877());
                captureProcessorImpl.onPostviewOutputSurface(abstractC0737x4073a84c.mo5157xcf572877());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$process$1 */
    public /* synthetic */ void m6871x3463b29f(boolean z17, java.util.HashMap hashMap, final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.f2605x6243b38) {
            try {
                try {
                } catch (java.lang.Exception e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "mCaptureProcessorImpl.process exception ", e17);
                    this.f2606xc39e09c = null;
                    if (onCaptureResultCallback != null) {
                        onCaptureResultCallback.mo6818xaf8aa769(e17);
                    }
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "CaptureProcessorImpl.process() finish");
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback onCaptureResultCallback2 = this.f2606xc39e09c;
                    if (onCaptureResultCallback2 != null) {
                        onCaptureResultCallback2.mo6819x5e02789b();
                        this.f2606xc39e09c = null;
                    }
                }
                if (this.f2603xfc407ac3) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Ignore process() in closed state.");
                    return;
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "CaptureProcessorImpl.process() begin");
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2443xa9797f9f;
                if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b8) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b8) && z17 && this.f2604x18d0163a) {
                    this.f2600x5cbb3039.processWithPostview(hashMap, new androidx.camera.extensions.impl.ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                        /* renamed from: onCaptureCompleted */
                        public void m6879x34cad1a4(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
                            onCaptureResultCallback.mo6816x34cad1a4(j17, list);
                        }

                        /* renamed from: onCaptureProcessProgressed */
                        public void m6880x1c9165b4(int i17) {
                            onCaptureResultCallback.mo6817x1c9165b4(i17);
                        }
                    }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
                } else {
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b82 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2442xa9797f9e;
                    if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(abstractC1001x782db4b82) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6690x18d7a440(abstractC1001x782db4b82)) {
                        this.f2600x5cbb3039.process(hashMap, new androidx.camera.extensions.impl.ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                            /* renamed from: onCaptureCompleted */
                            public void m6881x34cad1a4(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
                                onCaptureResultCallback.mo6816x34cad1a4(j17, list);
                            }

                            /* renamed from: onCaptureProcessProgressed */
                            public void m6882x1c9165b4(int i17) {
                                onCaptureResultCallback.mo6817x1c9165b4(i17);
                            }
                        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
                    } else {
                        this.f2600x5cbb3039.process(hashMap);
                    }
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "CaptureProcessorImpl.process() finish");
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback onCaptureResultCallback3 = this.f2606xc39e09c;
                if (onCaptureResultCallback3 != null) {
                    onCaptureResultCallback3.mo6819x5e02789b();
                    this.f2606xc39e09c = null;
                }
                m6873x63fd697d();
            } finally {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "CaptureProcessorImpl.process() finish");
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback onCaptureResultCallback4 = this.f2606xc39e09c;
                if (onCaptureResultCallback4 != null) {
                    onCaptureResultCallback4.mo6819x5e02789b();
                    this.f2606xc39e09c = null;
                }
                m6873x63fd697d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startCapture$0 */
    public /* synthetic */ void m6872x12b4f28d(java.util.List list, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback onCaptureResultCallback, boolean z17, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
        synchronized (this.f2605x6243b38) {
            if (this.f2603xfc407ac3) {
                interfaceC1027x69a2d850.mo6848x23e5cc93();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Ignore image in closed state");
                return;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "onImageReferenceIncoming  captureStageId=" + i17);
            this.f2602xe0fb7b9d.put(java.lang.Integer.valueOf(i17), new android.util.Pair<>(interfaceC1027x69a2d850, totalCaptureResult));
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "mCaptureResult has capture stage Id: " + this.f2602xe0fb7b9d.keySet());
            if (this.f2602xe0fb7b9d.keySet().containsAll(list)) {
                m6877xed8d1e6f(this.f2602xe0fb7b9d, onCaptureResultCallback, z17);
            }
        }
    }

    /* renamed from: clearCaptureResults */
    public void m6873x63fd697d() {
        synchronized (this.f2605x6243b38) {
            java.util.Iterator<android.util.Pair<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult>> it = this.f2602xe0fb7b9d.values().iterator();
            while (it.hasNext()) {
                ((p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850) it.next().first).mo6848x23e5cc93();
            }
            this.f2602xe0fb7b9d.clear();
        }
    }

    /* renamed from: close */
    public void m6874x5a5ddf8() {
        synchronized (this.f2605x6243b38) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Close the StillCaptureProcessor");
            this.f2603xfc407ac3 = true;
            m6873x63fd697d();
            this.f2601x4151660d.m6842xae88ffb1();
            this.f2601x4151660d.m6841x5a5b64d();
            this.f2599xef2a1ed3.m6742x5a5ddf8();
        }
    }

    /* renamed from: notifyCaptureResult */
    public void m6875xdd88e63a(android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
        java.lang.Long l17;
        this.f2601x4151660d.m6840xafb61849(totalCaptureResult, i17);
        if (this.f2608x93057ba == -1 && (l17 = (java.lang.Long) totalCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long longValue = l17.longValue();
            this.f2608x93057ba = longValue;
            this.f2599xef2a1ed3.m6744x65bc70de(longValue);
        }
        synchronized (this.f2605x6243b38) {
            if (this.f2607x585d88fb == null) {
                this.f2607x585d88fb = totalCaptureResult;
            }
        }
    }

    /* renamed from: notifyImage */
    public void m6876x96e84792(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850) {
        this.f2601x4151660d.m6843x56f77aa1(interfaceC1027x69a2d850);
    }

    /* renamed from: process */
    public void m6877xed8d1e6f(java.util.Map<java.lang.Integer, android.util.Pair<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult>> map, final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback onCaptureResultCallback, final boolean z17) {
        final java.util.HashMap hashMap = new java.util.HashMap();
        synchronized (this.f2605x6243b38) {
            for (java.lang.Integer num : map.keySet()) {
                android.util.Pair<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult> pair = map.get(num);
                hashMap.put(num, new android.util.Pair(((p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850) pair.first).get(), (android.hardware.camera2.TotalCaptureResult) pair.second));
            }
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5980xf96be419().execute(new java.lang.Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.this.m6871x3463b29f(z17, hashMap, onCaptureResultCallback);
            }
        });
    }

    /* renamed from: startCapture */
    public void m6878x18ec4884(final boolean z17, final java.util.List<java.lang.Integer> list, final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.OnCaptureResultCallback onCaptureResultCallback) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Start the capture: enablePostview=" + z17);
        this.f2608x93057ba = -1L;
        synchronized (this.f2605x6243b38) {
            m3.h.e(!this.f2603xfc407ac3, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.f2606xc39e09c = onCaptureResultCallback;
            m6873x63fd697d();
        }
        this.f2601x4151660d.m6841x5a5b64d();
        this.f2601x4151660d.m6844x7b8e1806(new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da.ImageReferenceListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$$a
            @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da.ImageReferenceListener
            /* renamed from: onImageReferenceIncoming */
            public final void mo6845xea0cb135(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1036xbdee9994.this.m6872x12b4f28d(list, onCaptureResultCallback, z17, interfaceC1027x69a2d850, totalCaptureResult, i17);
            }
        });
    }
}
