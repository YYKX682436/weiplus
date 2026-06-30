package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.CaptureSession */
/* loaded from: classes14.dex */
public final class C0216xd3748490 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89 {
    private static final java.lang.String TAG = "CaptureSession";

    /* renamed from: TIMEOUT_GET_SURFACE_IN_MS */
    private static final long f362x9f667807 = 5000;

    /* renamed from: mCanUseMultiResolutionImageReader */
    private final boolean f363x27b97b7d;

    /* renamed from: mCaptureConfigs */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> f364xd8412518;

    /* renamed from: mCaptureSessionStateCallback */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.StateCallback f365xc042e0b9;

    /* renamed from: mConfiguredDeferrableSurfaces */
    java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f366x39b1d60b;

    /* renamed from: mConfiguredSurfaceMap */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293, android.view.Surface> f367xb37c25a;

    /* renamed from: mDynamicRangesCompat */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 f368x26fd722a;

    /* renamed from: mReleaseCompleter */
    t2.k f369xc1b8d09f;

    /* renamed from: mReleaseFuture */
    wa.a f370xf7493d;

    /* renamed from: mRequestMonitor */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0423x9f54ffeb f371xe1c13d98;

    /* renamed from: mSessionConfig */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 f372x3700320b;

    /* renamed from: mSessionLock */
    final java.lang.Object f373xa8b29234;

    /* renamed from: mSessionOpener */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener f374x4b847740;

    /* renamed from: mState */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State f375xbec81024;

    /* renamed from: mStillCaptureFlow */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0429xc9011aec f376x2154a159;

    /* renamed from: mStreamUseCaseMap */
    private java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293, java.lang.Long> f377x677216b2;

    /* renamed from: mSynchronizedCaptureSession */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 f378x82fb54f1;

    /* renamed from: mTemplateParamsOverride */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0432x6c6b7aac f379x389bb59;

    /* renamed from: mTorchStateReset */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0433x80a1383a f380x8bbcb02d;

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$State */
    /* loaded from: classes14.dex */
    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$StateCallback */
    /* loaded from: classes14.dex */
    public final class StateCallback extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback {
        public StateCallback() {
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onConfigureFailed */
        public void mo3355xa3b7eee4(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f373xa8b29234) {
                switch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                        throw new java.lang.IllegalStateException("onConfigureFailed() should not be possible in state: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024);
                    case OPENING:
                    case CLOSED:
                    case RELEASING:
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.m3337x4ec94525();
                        break;
                    case RELEASED:
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.TAG, "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.TAG, "CameraCaptureSession.onConfigureFailed() " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onConfigured */
        public void mo3356xf8bc597d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f373xa8b29234) {
                switch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                    case RELEASED:
                        throw new java.lang.IllegalStateException("onConfigured() should not be possible in state: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024);
                    case OPENING:
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd3748490 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this;
                        c0216xd3748490.f375xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENED;
                        c0216xd3748490.f378x82fb54f1 = interfaceC0264x1b7732c4;
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.TAG, "Attempting to send capture request onConfigured");
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd37484902 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this;
                        c0216xd37484902.m3345xdf5833bc(c0216xd37484902.f372x3700320b);
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.m3344x96e34287();
                        break;
                    case CLOSED:
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f378x82fb54f1 = interfaceC0264x1b7732c4;
                        break;
                    case RELEASING:
                        interfaceC0264x1b7732c4.mo3591x5a5ddf8();
                        break;
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.TAG, "CameraCaptureSession.onConfigured() mState=" + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onReady */
        public void mo3357xb03baf04(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f373xa8b29234) {
                if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024.ordinal() == 0) {
                    throw new java.lang.IllegalStateException("onReady() should not be possible in state: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024);
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.TAG, "CameraCaptureSession.onReady() " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onSessionFinished */
        public void mo3358x4d620149(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f373xa8b29234) {
                if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.UNINITIALIZED) {
                    throw new java.lang.IllegalStateException("onSessionFinished() should not be possible in state: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024);
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.TAG, "onSessionFinished()");
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.m3337x4ec94525();
            }
        }
    }

    public C0216xd3748490(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 c0345x87152bb7) {
        this(c0345x87152bb7, false);
    }

    /* renamed from: createCamera2CaptureCallback */
    private android.hardware.camera2.CameraCaptureSession.CaptureCallback m3323x123fb45a(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + captureCallbackArr.length);
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0215xb27a5855.m3320x985029b0(it.next()));
        }
        java.util.Collections.addAll(arrayList, captureCallbackArr);
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0163x5be7d3d5.m3197x20225057(arrayList);
    }

    /* renamed from: createInstancesForMultiResolutionOutput */
    private static java.util.List<android.hardware.camera2.params.OutputConfiguration> m3324x5cb195df(java.util.List<android.hardware.camera2.params.MultiResolutionStreamInfo> list, int i17) {
        try {
            return (java.util.List) android.hardware.camera2.params.OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", java.util.Collection.class, java.lang.Integer.TYPE).invoke(null, list, java.lang.Integer.valueOf(i17));
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to create instances for multi-resolution output, " + e17.getMessage());
            return null;
        }
    }

    /* renamed from: createMultiResolutionOutputConfigurationCompats */
    private static java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> m3325x5824c305(java.util.Map<java.lang.Integer, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig>> map, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293, android.view.Surface> map2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 0;
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig : map.get(java.lang.Integer.valueOf(intValue))) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0798xfcbda2f.SurfaceInfo m5936x8632edc5 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0798xfcbda2f.m5936x8632edc5(map2.get(outputConfig.mo5172xcf572877()));
                if (i17 == 0) {
                    i17 = m5936x8632edc5.f1972xb45ff7f7;
                }
                int i18 = m5936x8632edc5.f1974x6be2dc6;
                int i19 = m5936x8632edc5.f1973xb7389127;
                java.lang.String mo5170x936d7c8d = outputConfig.mo5170x936d7c8d();
                java.util.Objects.requireNonNull(mo5170x936d7c8d);
                arrayList.add(new android.hardware.camera2.params.MultiResolutionStreamInfo(i18, i19, mo5170x936d7c8d));
            }
            if (i17 == 0 || arrayList.isEmpty()) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Skips to create instances for multi-resolution output. imageFormat: " + i17 + ", streamInfos size: " + arrayList.size());
            } else {
                java.util.List<android.hardware.camera2.params.OutputConfiguration> m3324x5cb195df = m3324x5cb195df(arrayList, i17);
                if (m3324x5cb195df != null) {
                    for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig2 : map.get(java.lang.Integer.valueOf(intValue))) {
                        android.hardware.camera2.params.OutputConfiguration remove = m3324x5cb195df.remove(0);
                        remove.addSurface(map2.get(outputConfig2.mo5172xcf572877()));
                        hashMap.put(outputConfig2, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937(remove));
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: getOutputConfigurationCompat */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937 m3326x6bc706a1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293, android.view.Surface> map, java.lang.String str) {
        long j17;
        android.hardware.camera2.params.DynamicRangeProfiles m3803x48916163;
        android.view.Surface surface = map.get(outputConfig.mo5172xcf572877());
        m3.h.d(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937 c0349x1437c937 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937(outputConfig.mo5173x7e2da783(), surface);
        if (str != null) {
            c0349x1437c937.m3848x376a1199(str);
        } else {
            c0349x1437c937.m3848x376a1199(outputConfig.mo5170x936d7c8d());
        }
        if (outputConfig.mo5169x5638d9f8() == 0) {
            c0349x1437c937.m3847x845d2804(1);
        } else if (outputConfig.mo5169x5638d9f8() == 1) {
            c0349x1437c937.m3847x845d2804(2);
        }
        if (!outputConfig.mo5171x71de51e1().isEmpty()) {
            c0349x1437c937.m3834x7847ffd2();
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = outputConfig.mo5171x71de51e1().iterator();
            while (it.hasNext()) {
                android.view.Surface surface2 = map.get(it.next());
                m3.h.d(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                c0349x1437c937.m3833x34744cc(surface2);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && (m3803x48916163 = this.f368x26fd722a.m3803x48916163()) != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e mo5168x82dbcab4 = outputConfig.mo5168x82dbcab4();
            java.lang.Long m3796xce3eea12 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0344x583fb2df.m3796xce3eea12(mo5168x82dbcab4, m3803x48916163);
            if (m3796xce3eea12 != null) {
                j17 = m3796xce3eea12.longValue();
                c0349x1437c937.m3846xf78c63c9(j17);
                return c0349x1437c937;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + mo5168x82dbcab4);
        }
        j17 = 1;
        c0349x1437c937.m3846xf78c63c9(j17);
        return c0349x1437c937;
    }

    /* renamed from: getUniqueOutputConfigurations */
    private java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> m3327xf1157305(java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937 c0349x1437c937 : list) {
            if (!arrayList.contains(c0349x1437c937.m3841xcf572877())) {
                arrayList.add(c0349x1437c937.m3841xcf572877());
                arrayList2.add(c0349x1437c937);
            }
        }
        return arrayList2;
    }

    /* renamed from: groupMrirOutputConfigs */
    private static java.util.Map<java.lang.Integer, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig>> m3328x37328983(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig> collection) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig : collection) {
            if (outputConfig.mo5173x7e2da783() > 0 && outputConfig.mo5171x71de51e1().isEmpty()) {
                java.util.List list = (java.util.List) hashMap.get(java.lang.Integer.valueOf(outputConfig.mo5173x7e2da783()));
                if (list == null) {
                    list = new java.util.ArrayList();
                    hashMap.put(java.lang.Integer.valueOf(outputConfig.mo5173x7e2da783()), list);
                }
                list.add(outputConfig);
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (((java.util.List) hashMap.get(java.lang.Integer.valueOf(intValue))).size() >= 2) {
                hashMap2.put(java.lang.Integer.valueOf(intValue), (java.util.List) hashMap.get(java.lang.Integer.valueOf(intValue)));
            }
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$issueBurstCaptureRequest$3 */
    public /* synthetic */ void m3329xfa975f9c(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, boolean z17) {
        synchronized (this.f373xa8b29234) {
            if (this.f375xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENED) {
                m3345xdf5833bc(this.f372x3700320b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$issuePendingCaptureRequest$2 */
    public /* synthetic */ void m3330xea81d912() {
        synchronized (this.f373xa8b29234) {
            if (this.f364xd8412518.isEmpty()) {
                return;
            }
            try {
                m3342xb6643c10(this.f364xd8412518);
            } finally {
                this.f364xd8412518.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$1 */
    public /* synthetic */ java.lang.Object m3332x7afbb637(t2.k kVar) {
        java.lang.String str;
        synchronized (this.f373xa8b29234) {
            m3.h.e(this.f369xc1b8d09f == null, "Release completer expected to be null");
            this.f369xc1b8d09f = kVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openCaptureSession, reason: merged with bridge method [inline-methods] */
    public wa.a m3331xee4543d3(java.util.List<android.view.Surface> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, android.hardware.camera2.CameraDevice cameraDevice) {
        synchronized (this.f373xa8b29234) {
            int ordinal = this.f375xbec81024.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2) {
                    this.f367xb37c25a.clear();
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        this.f367xb37c25a.put(this.f366x39b1d60b.get(i17), list.get(i17));
                    }
                    this.f375xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENING;
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Opening capture session.");
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback m3629x20225057 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0275x3060af21.m3629x20225057(this.f365xc042e0b9, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0275x3060af21.Adapter(c0750xb915958.m5598x92ecb9bd()));
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef c0108x2f5802ef = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef(c0750xb915958.m5592xca0018d6());
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder m5342x3017aa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder.m5342x3017aa(c0750xb915958.m5597x57482ff7());
                    java.util.Map hashMap = new java.util.HashMap();
                    if (this.f363x27b97b7d && android.os.Build.VERSION.SDK_INT >= 35) {
                        hashMap = m3325x5824c305(m3328x37328983(c0750xb915958.m5594x755b2d7a()), this.f367xb37c25a);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.String m2884x936d7c8d = c0108x2f5802ef.m2884x936d7c8d(null);
                    for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig : c0750xb915958.m5594x755b2d7a()) {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937 c0349x1437c937 = (!this.f363x27b97b7d || android.os.Build.VERSION.SDK_INT < 35) ? null : (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937) hashMap.get(outputConfig);
                        if (c0349x1437c937 == null) {
                            c0349x1437c937 = m3326x6bc706a1(outputConfig, this.f367xb37c25a, m2884x936d7c8d);
                            if (this.f377x677216b2.containsKey(outputConfig.mo5172xcf572877())) {
                                c0349x1437c937.m3849x638e9475(this.f377x677216b2.get(outputConfig.mo5172xcf572877()).longValue());
                            }
                        }
                        arrayList.add(c0349x1437c937);
                    }
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 mo3604x200dfbe = this.f374x4b847740.mo3604x200dfbe(c0750xb915958.m5599xd87f91ba(), m3327xf1157305(arrayList), m3629x20225057);
                    if (c0750xb915958.m5602x26c6954a() == 5 && c0750xb915958.m5593x189a2742() != null) {
                        mo3604x200dfbe.m3898xafc5a94e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.m3812x37d04a(c0750xb915958.m5593x189a2742()));
                    }
                    try {
                        android.hardware.camera2.CaptureRequest m3265x22974ab = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0198x8f2e4765.m3265x22974ab(m5342x3017aa.m5350x59bc66e(), cameraDevice, this.f379x389bb59);
                        if (m3265x22974ab != null) {
                            mo3604x200dfbe.m3899xf40af0de(m3265x22974ab);
                        }
                        return this.f374x4b847740.mo3606xf3dae15a(cameraDevice, mo3604x200dfbe, this.f366x39b1d60b);
                    } catch (android.hardware.camera2.CameraAccessException e17) {
                        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(e17);
                    }
                }
                if (ordinal != 4) {
                    return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.util.concurrent.CancellationException("openCaptureSession() not execute in state: " + this.f375xbec81024));
                }
            }
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalStateException("openCaptureSession() should not be possible in state: " + this.f375xbec81024));
        }
    }

    /* renamed from: abortCaptures */
    public void m3334xd96a793d() {
        synchronized (this.f373xa8b29234) {
            if (this.f375xbec81024 != p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENED) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to abort captures. Incorrect state:" + this.f375xbec81024);
            } else {
                try {
                    this.f378x82fb54f1.mo3586xd96a793d();
                } catch (android.hardware.camera2.CameraAccessException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to abort captures.", e17);
                }
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: cancelIssuedCaptureRequests */
    public void mo3335x247bf0a5() {
        java.util.ArrayList<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> arrayList;
        synchronized (this.f373xa8b29234) {
            if (this.f364xd8412518.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(this.f364xd8412518);
                this.f364xd8412518.clear();
            }
        }
        if (arrayList != null) {
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08 : arrayList) {
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = c0690x88f65a08.m5329x78e2a463().iterator();
                while (it.hasNext()) {
                    it.next().mo3015xa4d204aa(c0690x88f65a08.m5332x5db1b11());
                }
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: close */
    public void mo3336x5a5ddf8() {
        synchronized (this.f373xa8b29234) {
            int ordinal = this.f375xbec81024.ordinal();
            if (ordinal == 0) {
                throw new java.lang.IllegalStateException("close() should not be possible in state: " + this.f375xbec81024);
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m3.h.d(this.f374x4b847740, "The Opener shouldn't null in state:" + this.f375xbec81024);
                    this.f374x4b847740.mo3608x360802();
                } else if (ordinal == 3 || ordinal == 4) {
                    m3.h.d(this.f374x4b847740, "The Opener shouldn't null in state:" + this.f375xbec81024);
                    this.f374x4b847740.mo3608x360802();
                    this.f375xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.CLOSED;
                    this.f371xe1c13d98.m4103x360802();
                    this.f372x3700320b = null;
                }
            }
            this.f375xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.RELEASED;
        }
    }

    /* renamed from: finishClose */
    public void m3337x4ec94525() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State state = this.f375xbec81024;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State state2 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.RELEASED;
        if (state == state2) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f375xbec81024 = state2;
        this.f378x82fb54f1 = null;
        t2.k kVar = this.f369xc1b8d09f;
        if (kVar != null) {
            kVar.a(null);
            this.f369xc1b8d09f = null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: getCaptureConfigs */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> mo3338xc025e841() {
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> unmodifiableList;
        synchronized (this.f373xa8b29234) {
            unmodifiableList = java.util.Collections.unmodifiableList(this.f364xd8412518);
        }
        return unmodifiableList;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: getSessionConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 mo3339x9951e5c2() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958;
        synchronized (this.f373xa8b29234) {
            c0750xb915958 = this.f372x3700320b;
        }
        return c0750xb915958;
    }

    /* renamed from: getState */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State m3340x75286adb() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State state;
        synchronized (this.f373xa8b29234) {
            state = this.f375xbec81024;
        }
        return state;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: isInOpenState */
    public boolean mo3341x8844b538() {
        boolean z17;
        synchronized (this.f373xa8b29234) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State state = this.f375xbec81024;
            z17 = state == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENED || state == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENING;
        }
        return z17;
    }

    /* renamed from: issueBurstCaptureRequest */
    public int m3342xb6643c10(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0205xc0f99f50 c0205xc0f99f50;
        java.util.ArrayList arrayList;
        boolean z17;
        boolean z18;
        synchronized (this.f373xa8b29234) {
            if (this.f375xbec81024 != p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENED) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping issueBurstCaptureRequest due to session closed");
                return -1;
            }
            if (list.isEmpty()) {
                return -1;
            }
            try {
                c0205xc0f99f50 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0205xc0f99f50();
                arrayList = new java.util.ArrayList();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Issuing capture request.");
                z17 = false;
                for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08 : list) {
                    if (c0690x88f65a08.m5335x1b8de6dc().isEmpty()) {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping issuing empty capture request.");
                    } else {
                        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = c0690x88f65a08.m5335x1b8de6dc().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z18 = true;
                                break;
                            }
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 next = it.next();
                            if (!this.f367xb37c25a.containsKey(next)) {
                                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping capture request with invalid surface: " + next);
                                z18 = false;
                                break;
                            }
                        }
                        if (z18) {
                            if (c0690x88f65a08.m5337x26c6954a() == 2) {
                                z17 = true;
                            }
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder m5342x3017aa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder.m5342x3017aa(c0690x88f65a08);
                            if (c0690x88f65a08.m5337x26c6954a() == 5 && c0690x88f65a08.m5330xedfdbca8() != null) {
                                m5342x3017aa.m5360x3c427c1c(c0690x88f65a08.m5330xedfdbca8());
                            }
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958 = this.f372x3700320b;
                            if (c0750xb915958 != null) {
                                m5342x3017aa.m5347x2f697c6b(c0750xb915958.m5597x57482ff7().m5333xca0018d6());
                            }
                            m5342x3017aa.m5347x2f697c6b(c0690x88f65a08.m5333xca0018d6());
                            android.hardware.camera2.CaptureRequest m3264x59bc66e = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0198x8f2e4765.m3264x59bc66e(m5342x3017aa.m5350x59bc66e(), this.f378x82fb54f1.mo3593x1582414c(), this.f367xb37c25a, false, this.f379x389bb59);
                            if (m3264x59bc66e == null) {
                                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping issuing request without surface.");
                                return -1;
                            }
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it6 = c0690x88f65a08.m5329x78e2a463().iterator();
                            while (it6.hasNext()) {
                                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0215xb27a5855.m3321x985029b0(it6.next(), arrayList2);
                            }
                            c0205xc0f99f50.m3299x5aac5462(m3264x59bc66e, arrayList2);
                            arrayList.add(m3264x59bc66e);
                        }
                    }
                }
            } catch (android.hardware.camera2.CameraAccessException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to access camera: " + e17.getMessage());
                java.lang.Thread.dumpStack();
            }
            if (arrayList.isEmpty()) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping issuing burst request due to no valid request elements");
                return -1;
            }
            if (this.f376x2154a159.m4108xee4c2055(arrayList, z17)) {
                this.f378x82fb54f1.mo3602x6108ba85();
                c0205xc0f99f50.m3300xa220b7ca(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0205xc0f99f50.CaptureSequenceCallback() { // from class: androidx.camera.camera2.internal.CaptureSession$$a
                    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0205xc0f99f50.CaptureSequenceCallback
                    /* renamed from: onCaptureSequenceCompletedOrAborted */
                    public final void mo3301xa0352dc9(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, boolean z19) {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.m3329xfa975f9c(cameraCaptureSession, i17, z19);
                    }
                });
            }
            if (this.f380x8bbcb02d.m4113xa18b363c(arrayList, z17)) {
                c0205xc0f99f50.m3299x5aac5462((android.hardware.camera2.CaptureRequest) arrayList.get(arrayList.size() - 1), java.util.Collections.singletonList(new android.hardware.camera2.CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.CaptureSession.2
                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                        synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f373xa8b29234) {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb9159582 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f372x3700320b;
                            if (c0750xb9159582 == null) {
                                return;
                            }
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5597x57482ff7 = c0750xb9159582.m5597x57482ff7();
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.TAG, "Submit FLASH_MODE_OFF request");
                            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd3748490 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this;
                            c0216xd3748490.mo3343xbe8e0711(java.util.Collections.singletonList(c0216xd3748490.f380x8bbcb02d.m4112xc388eac0(m5597x57482ff7)));
                        }
                    }
                }));
            }
            return this.f378x82fb54f1.mo3587x6e0a775e(arrayList, c0205xc0f99f50);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: issueCaptureRequests */
    public void mo3343xbe8e0711(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list) {
        synchronized (this.f373xa8b29234) {
            switch (this.f375xbec81024) {
                case UNINITIALIZED:
                    throw new java.lang.IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f375xbec81024);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.f364xd8412518.addAll(list);
                    break;
                case OPENED:
                    this.f364xd8412518.addAll(list);
                    m3344x96e34287();
                    break;
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new java.lang.IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    /* renamed from: issuePendingCaptureRequest */
    public void m3344x96e34287() {
        this.f371xe1c13d98.m4101xf4435217().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.CaptureSession$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.m3330xea81d912();
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }

    /* renamed from: issueRepeatingCaptureRequests */
    public int m3345xdf5833bc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        synchronized (this.f373xa8b29234) {
            if (c0750xb915958 == null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f375xbec81024 != p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENED) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5597x57482ff7 = c0750xb915958.m5597x57482ff7();
            if (m5597x57482ff7.m5335x1b8de6dc().isEmpty()) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f378x82fb54f1.mo3602x6108ba85();
                } catch (android.hardware.camera2.CameraAccessException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to access camera: " + e17.getMessage());
                    java.lang.Thread.dumpStack();
                }
                return -1;
            }
            try {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Issuing request for session.");
                android.hardware.camera2.CaptureRequest m3264x59bc66e = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0198x8f2e4765.m3264x59bc66e(m5597x57482ff7, this.f378x82fb54f1.mo3593x1582414c(), this.f367xb37c25a, true, this.f379x389bb59);
                if (m3264x59bc66e == null) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f378x82fb54f1.mo3600x95252392(m3264x59bc66e, this.f371xe1c13d98.m4100x88996b92(m3323x123fb45a(m5597x57482ff7.m5329x78e2a463(), new android.hardware.camera2.CameraCaptureSession.CaptureCallback[0])));
            } catch (android.hardware.camera2.CameraAccessException e18) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to access camera: " + e18.getMessage());
                java.lang.Thread.dumpStack();
                return -1;
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: open */
    public wa.a mo3346x34264a(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, final android.hardware.camera2.CameraDevice cameraDevice, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener opener) {
        synchronized (this.f373xa8b29234) {
            if (this.f375xbec81024.ordinal() != 1) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Open not allowed in state: " + this.f375xbec81024);
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalStateException("open() should not allow the state: " + this.f375xbec81024));
            }
            this.f375xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.GET_SURFACE;
            java.util.ArrayList arrayList = new java.util.ArrayList(c0750xb915958.m5601x1b8de6dc());
            this.f366x39b1d60b = arrayList;
            this.f374x4b847740 = opener;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e m6005x9aa1ea70 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(opener.mo3607xf0e7b34b(arrayList, f362x9f667807)).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.CaptureSession$$d
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
                /* renamed from: apply */
                public final wa.a mo3010x58b836e(java.lang.Object obj) {
                    wa.a m3331xee4543d3;
                    m3331xee4543d3 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.m3331xee4543d3(c0750xb915958, cameraDevice, (java.util.List) obj);
                    return m3331xee4543d3;
                }
            }, this.f374x4b847740.mo3605xf5a03649());
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(m6005x9aa1ea70, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.camera2.internal.CaptureSession.1
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                /* renamed from: onFailure */
                public void mo3120xee232ab(java.lang.Throwable th6) {
                    synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f373xa8b29234) {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f374x4b847740.mo3608x360802();
                        int ordinal = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024.ordinal();
                        if ((ordinal == 3 || ordinal == 5 || ordinal == 6) && !(th6 instanceof java.util.concurrent.CancellationException)) {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.TAG, "Opening session with fail " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.f375xbec81024, th6);
                            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.m3337x4ec94525();
                        }
                    }
                }

                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo3121xe05b4124(java.lang.Void r17) {
                }
            }, this.f374x4b847740.mo3605xf5a03649());
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(m6005x9aa1ea70);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: release */
    public wa.a mo3347x41012807(boolean z17) {
        synchronized (this.f373xa8b29234) {
            switch (this.f375xbec81024) {
                case UNINITIALIZED:
                    throw new java.lang.IllegalStateException("release() should not be possible in state: " + this.f375xbec81024);
                case GET_SURFACE:
                    m3.h.d(this.f374x4b847740, "The Opener shouldn't null in state:" + this.f375xbec81024);
                    this.f374x4b847740.mo3608x360802();
                case INITIALIZED:
                    this.f375xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.RELEASED;
                    return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
                case OPENED:
                case CLOSED:
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4 = this.f378x82fb54f1;
                    if (interfaceC0264x1b7732c4 != null) {
                        if (z17) {
                            try {
                                interfaceC0264x1b7732c4.mo3586xd96a793d();
                            } catch (android.hardware.camera2.CameraAccessException e17) {
                                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to abort captures.", e17);
                            }
                        }
                        this.f378x82fb54f1.mo3591x5a5ddf8();
                    }
                case OPENING:
                    this.f375xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.RELEASING;
                    this.f371xe1c13d98.m4103x360802();
                    m3.h.d(this.f374x4b847740, "The Opener shouldn't null in state:" + this.f375xbec81024);
                    if (this.f374x4b847740.mo3608x360802()) {
                        m3337x4ec94525();
                        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
                    }
                case RELEASING:
                    if (this.f370xf7493d == null) {
                        this.f370xf7493d = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.CaptureSession$$c
                            @Override // t2.m
                            /* renamed from: attachCompleter */
                            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                                java.lang.Object m3332x7afbb637;
                                m3332x7afbb637 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this.m3332x7afbb637(kVar);
                                return m3332x7afbb637;
                            }
                        });
                    }
                    return this.f370xf7493d;
                default:
                    return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: setSessionConfig */
    public void mo3348x2c284c36(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        synchronized (this.f373xa8b29234) {
            switch (this.f375xbec81024) {
                case UNINITIALIZED:
                    throw new java.lang.IllegalStateException("setSessionConfig() should not be possible in state: " + this.f375xbec81024);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.f372x3700320b = c0750xb915958;
                    break;
                case OPENED:
                    this.f372x3700320b = c0750xb915958;
                    if (c0750xb915958 != null) {
                        if (!this.f367xb37c25a.keySet().containsAll(c0750xb915958.m5601x1b8de6dc())) {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Does not have the proper configured lists");
                            return;
                        } else {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Attempting to submit CaptureRequest after setting");
                            m3345xdf5833bc(this.f372x3700320b);
                            break;
                        }
                    } else {
                        return;
                    }
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new java.lang.IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89
    /* renamed from: setStreamUseCaseMap */
    public void mo3349x8d2f48a7(java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293, java.lang.Long> map) {
        synchronized (this.f373xa8b29234) {
            this.f377x677216b2 = map;
        }
    }

    /* renamed from: stopRepeating */
    public void m3350x6108ba85() {
        synchronized (this.f373xa8b29234) {
            if (this.f375xbec81024 != p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.OPENED) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to stop repeating. Incorrect state:" + this.f375xbec81024);
            } else {
                try {
                    this.f378x82fb54f1.mo3602x6108ba85();
                } catch (android.hardware.camera2.CameraAccessException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unable to stop repeating.", e17);
                }
            }
        }
    }

    public C0216xd3748490(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 c0345x87152bb7, boolean z17) {
        this(c0345x87152bb7, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95(java.util.Collections.emptyList()), z17);
    }

    public C0216xd3748490(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 c0345x87152bb7, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this(c0345x87152bb7, c0744x90dabc95, false);
    }

    public C0216xd3748490(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 c0345x87152bb7, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95, boolean z17) {
        this.f373xa8b29234 = new java.lang.Object();
        this.f364xd8412518 = new java.util.ArrayList();
        this.f367xb37c25a = new java.util.HashMap();
        this.f366x39b1d60b = java.util.Collections.emptyList();
        this.f375xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.UNINITIALIZED;
        this.f377x677216b2 = new java.util.HashMap();
        this.f376x2154a159 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0429xc9011aec();
        this.f380x8bbcb02d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0433x80a1383a();
        this.f375xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.State.INITIALIZED;
        this.f368x26fd722a = c0345x87152bb7;
        this.f365xc042e0b9 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.StateCallback();
        this.f371xe1c13d98 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0423x9f54ffeb(c0744x90dabc95.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0364x26a54fb6.class));
        this.f379x389bb59 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0432x6c6b7aac(c0744x90dabc95);
        this.f363x27b97b7d = z17;
    }
}
