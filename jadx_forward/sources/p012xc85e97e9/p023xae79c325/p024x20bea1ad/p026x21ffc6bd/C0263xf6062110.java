package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.SupportedSurfaceCombination */
/* loaded from: classes14.dex */
public final class C0263xf6062110 {
    private static final java.lang.String TAG = "SupportedSurfaceCombination";

    /* renamed from: mCamcorderProfileHelper */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d f501xe4138c4a;

    /* renamed from: mCameraId */
    private final java.lang.String f502x1c133ead;

    /* renamed from: mCharacteristics */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f503x7488e20b;

    /* renamed from: mDisplayInfoManager */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d f505xee58804a;

    /* renamed from: mDynamicRangeResolver */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0227x50b6e84 f506x622bf671;

    /* renamed from: mExtraSupportedSurfaceCombinationsContainer */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0413x51755c6e f507xee51849b;

    /* renamed from: mHardwareLevel */
    private final int f509x6c803f0f;

    /* renamed from: mIsBurstCaptureSupported */
    private boolean f510x12a59711;

    /* renamed from: mIsConcurrentCameraModeSupported */
    private boolean f511x441528b8;

    /* renamed from: mIsPreviewStabilizationSupported */
    private boolean f512x9d88e040;

    /* renamed from: mIsRawSupported */
    private boolean f513xb57ce57d;

    /* renamed from: mIsStreamUseCaseSupported */
    private boolean f514x59ed8c0e;

    /* renamed from: mIsUltraHighResolutionSensorSupported */
    private boolean f515xe48f88d1;

    /* renamed from: mSurfaceSizeDefinition */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21 f522x12b9efd4;

    /* renamed from: mSurfaceCombinations */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> f518xc9b1d324 = new java.util.ArrayList();

    /* renamed from: mUltraHighSurfaceCombinations */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> f525x4b11f590 = new java.util.ArrayList();

    /* renamed from: mConcurrentSurfaceCombinations */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> f504x2466482d = new java.util.ArrayList();

    /* renamed from: mPreviewStabilizationSurfaceCombinations */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> f516x38b17b2d = new java.util.ArrayList();

    /* renamed from: mFeatureSettingsToSupportedCombinationsMap */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402>> f508x811aac71 = new java.util.HashMap();

    /* renamed from: mSurfaceCombinations10Bit */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> f519xebb1d9ca = new java.util.ArrayList();

    /* renamed from: mSurfaceCombinationsUltraHdr */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> f521x651926ee = new java.util.ArrayList();

    /* renamed from: mSurfaceCombinationsStreamUseCase */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> f520x114508f3 = new java.util.ArrayList();

    /* renamed from: mSurfaceSizeDefinitionFormats */
    java.util.List<java.lang.Integer> f523x955bf8e8 = new java.util.ArrayList();

    /* renamed from: mTargetAspectRatio */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0431xea6c422 f524xc0c40b55 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0431xea6c422();

    /* renamed from: mResolutionCorrector */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0427x8ce9b461 f517x2cd1fad4 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0427x8ce9b461();

    /* renamed from: androidx.camera.camera2.internal.SupportedSurfaceCombination$Api23Impl */
    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        /* renamed from: getHighResolutionOutputSizes */
        public static android.util.Size[] m3585xd229248d(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, int i17) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i17);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.SupportedSurfaceCombination$FeatureSettings */
    /* loaded from: classes14.dex */
    public static abstract class FeatureSettings {
        public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings of(int i17, int i18, boolean z17, boolean z18) {
            return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0112xa3713c0d(i17, i18, z17, z18);
        }

        /* renamed from: getCameraMode */
        public abstract int mo2919x764f0e5e();

        /* renamed from: getRequiredMaxBitDepth */
        public abstract int mo2920xd62912e5();

        /* renamed from: isPreviewStabilizationOn */
        public abstract boolean mo2922xe97c1500();

        /* renamed from: isUltraHdrOn */
        public abstract boolean mo2923xfe1517f3();
    }

    public C0263xf6062110(android.content.Context context, java.lang.String str, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d interfaceC0113x4cf54b9d) {
        this.f513xb57ce57d = false;
        this.f510x12a59711 = false;
        this.f511x441528b8 = false;
        this.f514x59ed8c0e = false;
        this.f515xe48f88d1 = false;
        this.f512x9d88e040 = false;
        str.getClass();
        this.f502x1c133ead = str;
        interfaceC0113x4cf54b9d.getClass();
        this.f501xe4138c4a = interfaceC0113x4cf54b9d;
        this.f507xee51849b = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0413x51755c6e();
        this.f505xee58804a = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d.m3381x9cf0d20b(context);
        try {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 m3757xc2a5207f = c0332x1ad8324a.m3757xc2a5207f(str);
            this.f503x7488e20b = m3757xc2a5207f;
            java.lang.Integer num = (java.lang.Integer) m3757xc2a5207f.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f509x6c803f0f = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) m3757xc2a5207f.get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i17 : iArr) {
                    if (i17 == 3) {
                        this.f513xb57ce57d = true;
                    } else if (i17 == 6) {
                        this.f510x12a59711 = true;
                    } else if (android.os.Build.VERSION.SDK_INT >= 31 && i17 == 16) {
                        this.f515xe48f88d1 = true;
                    }
                }
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0227x50b6e84 c0227x50b6e84 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0227x50b6e84(this.f503x7488e20b);
            this.f506x622bf671 = c0227x50b6e84;
            m3548x48c9fc14();
            if (this.f515xe48f88d1) {
                m3551x49ebac18();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f511x441528b8 = hasSystemFeature;
            if (hasSystemFeature) {
                m3545x599f9aab();
            }
            if (c0227x50b6e84.m3395x160998ec()) {
                m3544xa8fc9cb8();
            }
            if (m3570xd8750c1a()) {
                m3550x68dd30de();
            }
            boolean m3532x918e9e81 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0262xd4b76239.m3532x918e9e81(this.f503x7488e20b);
            this.f514x59ed8c0e = m3532x918e9e81;
            if (m3532x918e9e81) {
                m3547x421261e1();
            }
            boolean m3641x3e16b66d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0281x5c127766.m3641x3e16b66d(this.f503x7488e20b);
            this.f512x9d88e040 = m3641x3e16b66d;
            if (m3641x3e16b66d) {
                m3546x7d61dab();
            }
            m3549xd44ecfcc();
            m3540x80bc5fab();
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0212x8dc75992.m3316x51964ec6(e17);
        }
    }

    /* renamed from: checkCustomization */
    private void m3540x80bc5fab() {
    }

    /* renamed from: compareIntersectingRanges */
    private static android.util.Range<java.lang.Integer> m3541x9ad4d8de(android.util.Range<java.lang.Integer> range, android.util.Range<java.lang.Integer> range2, android.util.Range<java.lang.Integer> range3) {
        double m3558x9ecb054d = m3558x9ecb054d(range2.intersect(range));
        double m3558x9ecb054d2 = m3558x9ecb054d(range3.intersect(range));
        double m3558x9ecb054d3 = m3558x9ecb054d2 / m3558x9ecb054d(range3);
        double m3558x9ecb054d4 = m3558x9ecb054d / m3558x9ecb054d(range2);
        if (m3558x9ecb054d2 > m3558x9ecb054d) {
            if (m3558x9ecb054d3 >= 0.5d || m3558x9ecb054d3 >= m3558x9ecb054d4) {
                return range3;
            }
        } else if (m3558x9ecb054d2 == m3558x9ecb054d) {
            if (m3558x9ecb054d3 > m3558x9ecb054d4) {
                return range3;
            }
            if (m3558x9ecb054d3 == m3558x9ecb054d4 && range3.getLower().intValue() > range2.getLower().intValue()) {
                return range3;
            }
        } else if (m3558x9ecb054d4 < 0.5d && m3558x9ecb054d3 > m3558x9ecb054d4) {
            return range3;
        }
        return range2;
    }

    /* renamed from: createFeatureSettings */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings m3542x6877c49d(int i17, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> map, boolean z17, boolean z18) {
        int m3562xd62912e5 = m3562xd62912e5(map);
        if (i17 != 0 && z18) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f502x1c133ead, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0678xfee03288.m5296xd08312aa(i17)));
        }
        if (i17 == 0 || m3562xd62912e5 != 10) {
            return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings.of(i17, m3562xd62912e5, z17, z18);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f502x1c133ead, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0678xfee03288.m5296xd08312aa(i17)));
    }

    /* renamed from: filterSupportedSizes */
    private java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, java.util.List<android.util.Size>> m3543x734b3e1c(java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, java.util.List<android.util.Size>> map, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings featureSettings, android.util.Range<java.lang.Integer> range) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 : map.keySet()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (android.util.Size size : map.get(interfaceC0768x83509b59)) {
                int mo5446xb124032b = interfaceC0768x83509b59.mo5446xb124032b();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize mo5203x1fd01e59 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5683x501b1a43(featureSettings.mo2919x764f0e5e(), mo5446xb124032b, size, m3581x804cce0a(mo5446xb124032b)).mo5203x1fd01e59();
                int m3554x2c99c95f = range != null ? m3554x2c99c95f(this.f503x7488e20b, mo5446xb124032b, size) : Integer.MAX_VALUE;
                java.util.Set set = (java.util.Set) hashMap2.get(mo5203x1fd01e59);
                if (set == null) {
                    set = new java.util.HashSet();
                    hashMap2.put(mo5203x1fd01e59, set);
                }
                if (!set.contains(java.lang.Integer.valueOf(m3554x2c99c95f))) {
                    arrayList.add(size);
                    set.add(java.lang.Integer.valueOf(m3554x2c99c95f));
                }
            }
            hashMap.put(interfaceC0768x83509b59, arrayList);
        }
        return hashMap;
    }

    /* renamed from: generate10BitSupportedCombinationList */
    private void m3544xa8fc9cb8() {
        this.f519xebb1d9ca.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0250x2ffe8bfb.m3467x8c649a77());
    }

    /* renamed from: generateConcurrentSupportedCombinationList */
    private void m3545x599f9aab() {
        this.f504x2466482d.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0250x2ffe8bfb.m3469x7e9b5c4c());
    }

    /* renamed from: generatePreviewStabilizationSupportedCombinationList */
    private void m3546x7d61dab() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.f516x38b17b2d.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0250x2ffe8bfb.m3474x7da90a0c());
        }
    }

    /* renamed from: generateStreamUseCaseSupportedCombinationList */
    private void m3547x421261e1() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.f520x114508f3.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0250x2ffe8bfb.m3476xf3c30a0());
        }
    }

    /* renamed from: generateSupportedCombinationList */
    private void m3548x48c9fc14() {
        this.f518xc9b1d324.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0250x2ffe8bfb.m3466x48c9fc14(this.f509x6c803f0f, this.f513xb57ce57d, this.f510x12a59711));
        this.f518xc9b1d324.addAll(this.f507xee51849b.get(this.f502x1c133ead));
    }

    /* renamed from: generateSurfaceSizeDefinition */
    private void m3549xd44ecfcc() {
        this.f522x12b9efd4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21.m5694xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2129x8adda99d, new java.util.HashMap(), this.f505xee58804a.m3385x8cdf5ab3(), new java.util.HashMap(), m3559x1a0de7e8(), new java.util.HashMap(), new java.util.HashMap());
    }

    /* renamed from: generateUltraHdrSupportedCombinationList */
    private void m3550x68dd30de() {
        this.f521x651926ee.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0250x2ffe8bfb.m3477xeb6ee6bf());
    }

    /* renamed from: generateUltraHighSupportedCombinationList */
    private void m3551x49ebac18() {
        this.f525x4b11f590.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0250x2ffe8bfb.m3478x6d9add23());
    }

    /* renamed from: getAllPossibleSizeArrangements */
    private java.util.List<java.util.List<android.util.Size>> m3552xdb7a4266(java.util.List<java.util.List<android.util.Size>> list) {
        java.util.Iterator<java.util.List<android.util.Size>> it = list.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            i17 *= it.next().size();
        }
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Failed to find supported resolutions.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new java.util.ArrayList());
        }
        int size = i17 / list.get(0).size();
        int i19 = i17;
        for (int i27 = 0; i27 < list.size(); i27++) {
            java.util.List<android.util.Size> list2 = list.get(i27);
            for (int i28 = 0; i28 < i17; i28++) {
                ((java.util.List) arrayList.get(i28)).add(list2.get((i28 % i19) / size));
            }
            if (i27 < list.size() - 1) {
                i19 = size;
                size /= list.get(i27 + 1).size();
            }
        }
        return arrayList;
    }

    /* renamed from: getClosestSupportedDeviceFrameRate */
    private android.util.Range<java.lang.Integer> m3553xc6b314ec(android.util.Range<java.lang.Integer> range, int i17) {
        if (range != null) {
            android.util.Range<java.lang.Integer> range2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.f1796xf5f0b888;
            if (!range.equals(range2)) {
                android.util.Range<java.lang.Integer>[] rangeArr = (android.util.Range[]) this.f503x7488e20b.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return range2;
                }
                android.util.Range<java.lang.Integer> range3 = new android.util.Range<>(java.lang.Integer.valueOf(java.lang.Math.min(range.getLower().intValue(), i17)), java.lang.Integer.valueOf(java.lang.Math.min(range.getUpper().intValue(), i17)));
                int i18 = 0;
                for (android.util.Range<java.lang.Integer> range4 : rangeArr) {
                    if (i17 >= range4.getLower().intValue()) {
                        if (range2.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.f1796xf5f0b888)) {
                            range2 = range4;
                        }
                        if (range4.equals(range3)) {
                            return range4;
                        }
                        try {
                            int m3558x9ecb054d = m3558x9ecb054d(range4.intersect(range3));
                            if (i18 == 0) {
                                i18 = m3558x9ecb054d;
                            } else {
                                if (m3558x9ecb054d >= i18) {
                                    range2 = m3541x9ad4d8de(range3, range2, range4);
                                    i18 = m3558x9ecb054d(range3.intersect(range2));
                                }
                                range4 = range2;
                            }
                        } catch (java.lang.IllegalArgumentException unused) {
                            if (i18 == 0) {
                                if (m3557xb5e5589c(range4, range3) >= m3557xb5e5589c(range2, range3)) {
                                    if (m3557xb5e5589c(range4, range3) == m3557xb5e5589c(range2, range3)) {
                                        if (range4.getLower().intValue() <= range2.getUpper().intValue() && m3558x9ecb054d(range4) >= m3558x9ecb054d(range2)) {
                                        }
                                    }
                                }
                            }
                        }
                        range2 = range4;
                    }
                }
                return range2;
            }
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.f1796xf5f0b888;
    }

    /* renamed from: getMaxFrameRate */
    public static int m3554x2c99c95f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, int i17, android.util.Size size) {
        try {
            return (int) (1.0E9d / ((android.hardware.camera2.params.StreamConfigurationMap) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i17, size));
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    /* renamed from: getMaxOutputSizeByFormat */
    private android.util.Size m3555xb080dcbe(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, int i17, boolean z17) {
        android.util.Size[] m3585xd229248d;
        android.util.Size[] outputSizes = i17 == 34 ? streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i17);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1 c0783xf2f5bab1 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1();
        android.util.Size size = (android.util.Size) java.util.Collections.max(java.util.Arrays.asList(outputSizes), c0783xf2f5bab1);
        android.util.Size size2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2130xd0d9565b;
        if (z17 && (m3585xd229248d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.Api23Impl.m3585xd229248d(streamConfigurationMap, i17)) != null && m3585xd229248d.length > 0) {
            size2 = (android.util.Size) java.util.Collections.max(java.util.Arrays.asList(m3585xd229248d), c0783xf2f5bab1);
        }
        return (android.util.Size) java.util.Collections.max(java.util.Arrays.asList(size, size2), c0783xf2f5bab1);
    }

    /* renamed from: getMaxSupportedFpsFromAttachedSurfaces */
    private int m3556x86d0633d(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list) {
        int i17 = Integer.MAX_VALUE;
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 abstractC0643xfc6b6a97 : list) {
            i17 = m3566xa1d6010e(i17, abstractC0643xfc6b6a97.mo5095x450a23fc(), abstractC0643xfc6b6a97.mo5097xfb854877());
        }
        return i17;
    }

    /* renamed from: getRangeDistance */
    private static int m3557xb5e5589c(android.util.Range<java.lang.Integer> range, android.util.Range<java.lang.Integer> range2) {
        m3.h.e((range.contains((android.util.Range<java.lang.Integer>) range2.getUpper()) || range.contains((android.util.Range<java.lang.Integer>) range2.getLower())) ? false : true, "Ranges must not intersect");
        return range.getLower().intValue() > range2.getUpper().intValue() ? range.getLower().intValue() - range2.getUpper().intValue() : range2.getLower().intValue() - range.getUpper().intValue();
    }

    /* renamed from: getRangeLength */
    private static int m3558x9ecb054d(android.util.Range<java.lang.Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    /* renamed from: getRecordSize */
    private android.util.Size m3559x1a0de7e8() {
        try {
            int parseInt = java.lang.Integer.parseInt(this.f502x1c133ead);
            android.media.CamcorderProfile camcorderProfile = this.f501xe4138c4a.mo2925x66b24daf(parseInt, 1) ? this.f501xe4138c4a.get(parseInt, 1) : null;
            return camcorderProfile != null ? new android.util.Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : m3560x992956e(parseInt);
        } catch (java.lang.NumberFormatException unused) {
            return m3561x1588da78();
        }
    }

    /* renamed from: getRecordSizeByHasProfile */
    private android.util.Size m3560x992956e(int i17) {
        android.util.Size size = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2126xd0c7db57;
        android.media.CamcorderProfile camcorderProfile = this.f501xe4138c4a.mo2925x66b24daf(i17, 10) ? this.f501xe4138c4a.get(i17, 10) : this.f501xe4138c4a.mo2925x66b24daf(i17, 8) ? this.f501xe4138c4a.get(i17, 8) : this.f501xe4138c4a.mo2925x66b24daf(i17, 12) ? this.f501xe4138c4a.get(i17, 12) : this.f501xe4138c4a.mo2925x66b24daf(i17, 6) ? this.f501xe4138c4a.get(i17, 6) : this.f501xe4138c4a.mo2925x66b24daf(i17, 5) ? this.f501xe4138c4a.get(i17, 5) : this.f501xe4138c4a.mo2925x66b24daf(i17, 4) ? this.f501xe4138c4a.get(i17, 4) : null;
        return camcorderProfile != null ? new android.util.Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : size;
    }

    /* renamed from: getRecordSizeFromStreamConfigurationMap */
    private android.util.Size m3561x1588da78() {
        android.util.Size[] outputSizes = this.f503x7488e20b.m3734xbd9771be().m3786xaba27c81().getOutputSizes(android.media.MediaRecorder.class);
        if (outputSizes == null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2126xd0c7db57;
        }
        java.util.Arrays.sort(outputSizes, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1(true));
        for (android.util.Size size : outputSizes) {
            int width = size.getWidth();
            android.util.Size size2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2124x4805c086;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2126xd0c7db57;
    }

    /* renamed from: getRequiredMaxBitDepth */
    private static int m3562xd62912e5(java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> map) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().m4385xbc5bbb2c() == 10) {
                return 10;
            }
        }
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSurfaceCombinationsByFeatureSettings */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3563xdc7f87(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings featureSettings) {
        java.util.List list;
        if (this.f508x811aac71.containsKey(featureSettings)) {
            return this.f508x811aac71.get(featureSettings);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (featureSettings.mo2923xfe1517f3()) {
            list = arrayList;
            if (featureSettings.mo2919x764f0e5e() == 0) {
                arrayList.addAll(this.f521x651926ee);
                list = arrayList;
            }
        } else if (featureSettings.mo2920xd62912e5() == 8) {
            int mo2919x764f0e5e = featureSettings.mo2919x764f0e5e();
            if (mo2919x764f0e5e == 1) {
                list = this.f504x2466482d;
            } else if (mo2919x764f0e5e != 2) {
                arrayList.addAll(featureSettings.mo2922xe97c1500() ? this.f516x38b17b2d : this.f518xc9b1d324);
                list = arrayList;
            } else {
                arrayList.addAll(this.f525x4b11f590);
                arrayList.addAll(this.f518xc9b1d324);
                list = arrayList;
            }
        } else {
            list = arrayList;
            if (featureSettings.mo2920xd62912e5() == 10) {
                list = arrayList;
                if (featureSettings.mo2919x764f0e5e() == 0) {
                    arrayList.addAll(this.f519xebb1d9ca);
                    list = arrayList;
                }
            }
        }
        this.f508x811aac71.put(featureSettings, list);
        return list;
    }

    /* renamed from: getSurfaceConfigListAndFpsCeiling */
    private android.util.Pair<java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f>, java.lang.Integer> m3564x3998bf34(int i17, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.List<android.util.Size> list2, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> list3, java.util.List<java.lang.Integer> list4, int i18, java.util.Map<java.lang.Integer, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> map, java.util.Map<java.lang.Integer, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> map2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 abstractC0643xfc6b6a97 : list) {
            arrayList.add(abstractC0643xfc6b6a97.mo5098xbb032299());
            if (map != null) {
                map.put(java.lang.Integer.valueOf(arrayList.size() - 1), abstractC0643xfc6b6a97);
            }
        }
        for (int i19 = 0; i19 < list2.size(); i19++) {
            android.util.Size size = list2.get(i19);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 = list3.get(list4.get(i19).intValue());
            int mo5446xb124032b = interfaceC0768x83509b59.mo5446xb124032b();
            arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5683x501b1a43(i17, mo5446xb124032b, size, m3581x804cce0a(mo5446xb124032b)));
            if (map2 != null) {
                map2.put(java.lang.Integer.valueOf(arrayList.size() - 1), interfaceC0768x83509b59);
            }
            i18 = m3566xa1d6010e(i18, interfaceC0768x83509b59.mo5446xb124032b(), size);
        }
        return new android.util.Pair<>(arrayList, java.lang.Integer.valueOf(i18));
    }

    /* renamed from: getTargetFpsRange */
    private android.util.Range<java.lang.Integer> m3565xe112e77b(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> list2, java.util.List<java.lang.Integer> list3) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> it = list.iterator();
        android.util.Range<java.lang.Integer> range = null;
        while (it.hasNext()) {
            range = m3567x3a12b9f7(it.next().mo5099x871a9f26(), range);
        }
        java.util.Iterator<java.lang.Integer> it6 = list3.iterator();
        while (it6.hasNext()) {
            range = m3567x3a12b9f7(list2.get(it6.next().intValue()).m5754x871a9f26(null), range);
        }
        return range;
    }

    /* renamed from: getUpdatedMaximumFps */
    private int m3566xa1d6010e(int i17, int i18, android.util.Size size) {
        return java.lang.Math.min(i17, m3554x2c99c95f(this.f503x7488e20b, i18, size));
    }

    /* renamed from: getUpdatedTargetFramerate */
    private android.util.Range<java.lang.Integer> m3567x3a12b9f7(android.util.Range<java.lang.Integer> range, android.util.Range<java.lang.Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    /* renamed from: getUseCasesPriorityOrder */
    private static java.util.List<java.lang.Integer> m3568xa1a80db8(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> it = list.iterator();
        while (it.hasNext()) {
            int m5752xb7c2e55a = it.next().m5752xb7c2e55a(0);
            if (!arrayList2.contains(java.lang.Integer.valueOf(m5752xb7c2e55a))) {
                arrayList2.add(java.lang.Integer.valueOf(m5752xb7c2e55a));
            }
        }
        java.util.Collections.sort(arrayList2);
        java.util.Collections.reverse(arrayList2);
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Integer) it6.next()).intValue();
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 : list) {
                if (intValue == interfaceC0768x83509b59.m5752xb7c2e55a(0)) {
                    arrayList.add(java.lang.Integer.valueOf(list.indexOf(interfaceC0768x83509b59)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: isUltraHdrOn */
    private static boolean m3569xfe1517f3(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, java.util.List<android.util.Size>> map) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().mo5095x450a23fc() == 4101) {
                return true;
            }
        }
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> it6 = map.keySet().iterator();
        while (it6.hasNext()) {
            if (it6.next().mo5446xb124032b() == 4101) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isUltraHdrSupported */
    private boolean m3570xd8750c1a() {
        int[] m3783x14494f65 = this.f503x7488e20b.m3734xbd9771be().m3783x14494f65();
        if (m3783x14494f65 == null) {
            return false;
        }
        for (int i17 : m3783x14494f65) {
            if (i17 == 4101) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isUseCasesCombinationSupported */
    private boolean m3571xb7fe8105(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings featureSettings, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, java.util.List<android.util.Size>> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo5098xbb032299());
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1 c0783xf2f5bab1 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 : map.keySet()) {
            java.util.List<android.util.Size> list2 = map.get(interfaceC0768x83509b59);
            m3.h.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + interfaceC0768x83509b59 + ".");
            android.util.Size size = (android.util.Size) java.util.Collections.min(list2, c0783xf2f5bab1);
            int mo5446xb124032b = interfaceC0768x83509b59.mo5446xb124032b();
            arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5683x501b1a43(featureSettings.mo2919x764f0e5e(), mo5446xb124032b, size, m3581x804cce0a(mo5446xb124032b)));
        }
        return m3577x6c7d3886(featureSettings, arrayList);
    }

    /* renamed from: refreshPreviewSize */
    private void m3572xb7c9620e() {
        this.f505xee58804a.m3386x40b292db();
        if (this.f522x12b9efd4 == null) {
            m3549xd44ecfcc();
        } else {
            this.f522x12b9efd4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21.m5694xaf65a0fc(this.f522x12b9efd4.mo5209xf8bd4b73(), this.f522x12b9efd4.mo5214xa94b26e3(), this.f505xee58804a.m3385x8cdf5ab3(), this.f522x12b9efd4.mo5213x58ac6427(), this.f522x12b9efd4.mo5212x1a0de7e8(), this.f522x12b9efd4.mo5210x8e34c51(), this.f522x12b9efd4.mo5215x2f3ce2f1());
        }
    }

    /* renamed from: updateMaximumSizeByFormat */
    private void m3573x2e8d8106(java.util.Map<java.lang.Integer, android.util.Size> map, int i17) {
        android.util.Size m3555xb080dcbe = m3555xb080dcbe(this.f503x7488e20b.m3734xbd9771be().m3786xaba27c81(), i17, true);
        if (m3555xb080dcbe != null) {
            map.put(java.lang.Integer.valueOf(i17), m3555xb080dcbe);
        }
    }

    /* renamed from: updateS720pOrS1440pSizeByFormat */
    private void m3574xec43ee35(java.util.Map<java.lang.Integer, android.util.Size> map, android.util.Size size, int i17) {
        if (this.f511x441528b8) {
            android.util.Size m3555xb080dcbe = m3555xb080dcbe(this.f503x7488e20b.m3734xbd9771be().m3786xaba27c81(), i17, false);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            if (m3555xb080dcbe != null) {
                size = (android.util.Size) java.util.Collections.min(java.util.Arrays.asList(size, m3555xb080dcbe), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1());
            }
            map.put(valueOf, size);
        }
    }

    /* renamed from: updateUltraMaximumSizeByFormat */
    private void m3575xeed54b2c(java.util.Map<java.lang.Integer, android.util.Size> map, int i17) {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap;
        if (android.os.Build.VERSION.SDK_INT < 31 || !this.f515xe48f88d1 || (streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) this.f503x7488e20b.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(java.lang.Integer.valueOf(i17), m3555xb080dcbe(streamConfigurationMap, i17, true));
    }

    /* renamed from: applyResolutionSelectionOrderRelatedWorkarounds */
    public java.util.List<android.util.Size> m3576xe462d286(java.util.List<android.util.Size> list, int i17) {
        android.util.Rational rational;
        int i18 = this.f524xc0c40b55.get(this.f502x1c133ead, this.f503x7488e20b);
        if (i18 == 0) {
            rational = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1854x8750dd6d;
        } else if (i18 == 1) {
            rational = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1852x62c8deba;
        } else if (i18 != 2) {
            rational = null;
        } else {
            android.util.Size m5695x3e4f410b = m3581x804cce0a(256).m5695x3e4f410b(256);
            rational = new android.util.Rational(m5695x3e4f410b.getWidth(), m5695x3e4f410b.getHeight());
        }
        if (rational != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (android.util.Size size : list) {
                if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f517x2cd1fad4.m4106x17d9675b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5682x1fd0cd92(i17), list);
    }

    /* renamed from: checkSupported */
    public boolean m3577x6c7d3886(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings featureSettings, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> list) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> it = m3563xdc7f87(featureSettings).iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            z17 = it.next().m5677x4e7bd216(list) != null;
            if (z17) {
                break;
            }
        }
        return z17;
    }

    /* renamed from: getCameraId */
    public java.lang.String m3578x72efd496() {
        return this.f502x1c133ead;
    }

    /* renamed from: getOrderedSupportedStreamUseCaseSurfaceConfigList */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> m3579x82efead(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings featureSettings, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> list) {
        if (!p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0262xd4b76239.m3538xc9ee343(featureSettings)) {
            return null;
        }
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> it = this.f520x114508f3.iterator();
        while (it.hasNext()) {
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> m5677x4e7bd216 = it.next().m5677x4e7bd216(list);
            if (m5677x4e7bd216 != null) {
                return m5677x4e7bd216;
            }
        }
        return null;
    }

    /* renamed from: getSuggestedStreamSpecifications */
    public android.util.Pair<java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b>, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b>> m3580x29b7b37d(int i17, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, java.util.List<android.util.Size>> map, boolean z17, boolean z18) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        android.util.Range<java.lang.Integer> range;
        java.util.List<java.lang.Integer> list2;
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> map2;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        java.util.HashMap hashMap4;
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> list3;
        java.lang.String str3;
        java.lang.String str4;
        java.util.HashMap hashMap5;
        java.util.HashMap hashMap6;
        java.util.List<android.util.Size> list4;
        java.util.List<android.util.Size> list5;
        java.util.HashMap hashMap7;
        int i19;
        int i27;
        java.lang.String str5;
        m3572xb7c9620e();
        java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
        java.util.List<java.lang.Integer> m3568xa1a80db8 = m3568xa1a80db8(arrayList);
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> m3396xa383aef4 = this.f506x622bf671.m3396xa383aef4(list, arrayList, m3568xa1a80db8);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings m3542x6877c49d = m3542x6877c49d(i17, m3396xa383aef4, z17, m3569xfe1517f3(list, map));
        boolean m3571xb7fe8105 = m3571xb7fe8105(m3542x6877c49d, list, map);
        java.lang.String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        java.lang.String str7 = " New configs: ";
        java.lang.String str8 = "No supported surface combination is found for camera device - Id : ";
        if (!m3571xb7fe8105) {
            throw new java.lang.IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f502x1c133ead + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        android.util.Range<java.lang.Integer> m3565xe112e77b = m3565xe112e77b(list, arrayList, m3568xa1a80db8);
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, java.util.List<android.util.Size>> m3543x734b3e1c = m3543x734b3e1c(map, m3542x6877c49d, m3565xe112e77b);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = m3568xa1a80db8.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59 interfaceC0768x83509b59 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59) arrayList.get(it.next().intValue());
            arrayList2.add(m3576xe462d286(m3543x734b3e1c.get(interfaceC0768x83509b59), interfaceC0768x83509b59.mo5446xb124032b()));
        }
        java.util.List<java.util.List<android.util.Size>> m3552xdb7a4266 = m3552xdb7a4266(arrayList2);
        java.util.HashMap hashMap8 = new java.util.HashMap();
        java.util.HashMap hashMap9 = new java.util.HashMap();
        java.util.HashMap hashMap10 = new java.util.HashMap();
        java.util.HashMap hashMap11 = new java.util.HashMap();
        boolean m3528xe5f05d03 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0262xd4b76239.m3528xe5f05d03(list, arrayList);
        int m3556x86d0633d = m3556x86d0633d(list);
        java.util.HashMap hashMap12 = hashMap11;
        if (!this.f514x59ed8c0e || m3528xe5f05d03) {
            hashMap = hashMap10;
            hashMap2 = hashMap9;
            hashMap3 = hashMap8;
            range = m3565xe112e77b;
            list2 = m3568xa1a80db8;
            map2 = m3396xa383aef4;
            i18 = m3556x86d0633d;
            str = "No supported surface combination is found for camera device - Id : ";
            str2 = " New configs: ";
            hashMap4 = hashMap12;
            list3 = null;
        } else {
            java.util.Iterator<java.util.List<android.util.Size>> it6 = m3552xdb7a4266.iterator();
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> list6 = null;
            while (true) {
                if (!it6.hasNext()) {
                    hashMap2 = hashMap9;
                    hashMap3 = hashMap8;
                    range = m3565xe112e77b;
                    list2 = m3568xa1a80db8;
                    map2 = m3396xa383aef4;
                    i18 = m3556x86d0633d;
                    str = str8;
                    str2 = str7;
                    str5 = str6;
                    hashMap4 = hashMap12;
                    hashMap = hashMap10;
                    break;
                }
                java.util.HashMap hashMap13 = hashMap12;
                java.util.HashMap hashMap14 = hashMap10;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                map2 = m3396xa383aef4;
                android.util.Range<java.lang.Integer> range2 = m3565xe112e77b;
                java.util.List<java.lang.Integer> list7 = m3568xa1a80db8;
                range = range2;
                str = str8;
                int i28 = m3556x86d0633d;
                i18 = m3556x86d0633d;
                str2 = str7;
                list2 = m3568xa1a80db8;
                str5 = str6;
                list6 = m3579x82efead(m3542x6877c49d, (java.util.List) m3564x3998bf34(i17, list, it6.next(), arrayList, list7, i28, hashMap14, hashMap13).first);
                hashMap = hashMap14;
                hashMap4 = hashMap13;
                if (list6 != null && !p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0262xd4b76239.m3525x5ddd943e(hashMap, hashMap4, list6)) {
                    list6 = null;
                }
                if (list6 != null) {
                    if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0262xd4b76239.m3527xafaa7a94(this.f503x7488e20b, list6)) {
                        break;
                    }
                    list6 = null;
                }
                hashMap.clear();
                hashMap4.clear();
                hashMap12 = hashMap4;
                hashMap10 = hashMap;
                str6 = str5;
                str8 = str;
                str7 = str2;
                m3396xa383aef4 = map2;
                hashMap9 = hashMap2;
                hashMap8 = hashMap3;
                m3565xe112e77b = range;
                m3556x86d0633d = i18;
                m3568xa1a80db8 = list2;
            }
            if (list6 == null && !m3571xb7fe8105) {
                throw new java.lang.IllegalArgumentException(str + this.f502x1c133ead + str5 + list + str2 + arrayList);
            }
            list3 = list6;
        }
        java.util.Iterator<java.util.List<android.util.Size>> it7 = m3552xdb7a4266.iterator();
        boolean z19 = false;
        int i29 = Integer.MAX_VALUE;
        int i37 = Integer.MAX_VALUE;
        boolean z27 = false;
        boolean z28 = false;
        java.util.List<android.util.Size> list8 = null;
        java.util.List<android.util.Size> list9 = null;
        while (true) {
            if (!it7.hasNext()) {
                str3 = str;
                str4 = str2;
                hashMap5 = hashMap4;
                hashMap6 = hashMap;
                list4 = list8;
                list5 = list9;
                break;
            }
            java.util.List<android.util.Size> next = it7.next();
            int i38 = i29;
            int i39 = i37;
            str4 = str2;
            hashMap5 = hashMap4;
            str3 = str;
            hashMap6 = hashMap;
            android.util.Pair<java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f>, java.lang.Integer> m3564x3998bf34 = m3564x3998bf34(i17, list, next, arrayList, list2, i18, null, null);
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> list10 = (java.util.List) m3564x3998bf34.first;
            i37 = ((java.lang.Integer) m3564x3998bf34.second).intValue();
            int i47 = i18;
            boolean z29 = range == null || i47 <= i37 || i37 >= range.getLower().intValue();
            if (z27 || !m3577x6c7d3886(m3542x6877c49d, list10)) {
                i19 = i39;
                i27 = Integer.MAX_VALUE;
            } else {
                i19 = i39;
                i27 = Integer.MAX_VALUE;
                if (i19 == Integer.MAX_VALUE || i19 < i37) {
                    i19 = i37;
                    list8 = next;
                }
                if (z29) {
                    if (z28) {
                        list5 = list9;
                        list4 = next;
                        i29 = i38;
                        break;
                    }
                    i19 = i37;
                    z27 = true;
                    list8 = next;
                }
            }
            if (list3 == null || z28 || m3579x82efead(m3542x6877c49d, list10) == null) {
                i29 = i38;
            } else {
                if (i38 != i27 && i38 >= i37) {
                    i29 = i38;
                } else {
                    i29 = i37;
                    list9 = next;
                }
                if (z29) {
                    i29 = i37;
                    if (z27) {
                        i37 = i19;
                        list4 = list8;
                        list5 = next;
                        break;
                    }
                    z28 = true;
                    list9 = next;
                } else {
                    continue;
                }
            }
            i18 = i47;
            i37 = i19;
            hashMap = hashMap6;
            hashMap4 = hashMap5;
            str = str3;
            str2 = str4;
        }
        if (list4 == null) {
            throw new java.lang.IllegalArgumentException(str3 + this.f502x1c133ead + " and Hardware level: " + this.f509x6c803f0f + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str4 + arrayList);
        }
        android.util.Range<java.lang.Integer> m3553xc6b314ec = range != null ? m3553xc6b314ec(range, i37) : null;
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59 interfaceC0768x83509b592 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59) it8.next();
            java.util.List<java.lang.Integer> list11 = list2;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder m5673xdc3ef9b = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.m5673xdc3ef9b(list4.get(list11.indexOf(java.lang.Integer.valueOf(arrayList.indexOf(interfaceC0768x83509b592)))));
            java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> map3 = map2;
            java.util.Iterator it9 = it8;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e = map3.get(interfaceC0768x83509b592);
            c0491x2bb48c5e.getClass();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5201xc3162e2d = m5673xdc3ef9b.mo5197xb924c5c0(c0491x2bb48c5e).mo5199x9a12cb4a(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0262xd4b76239.m3529x8599cfbb(interfaceC0768x83509b592)).mo5201xc3162e2d(z18);
            if (m3553xc6b314ec != null) {
                mo5201xc3162e2d.mo5198xe875cd2a(m3553xc6b314ec);
            }
            hashMap2.put(interfaceC0768x83509b592, mo5201xc3162e2d.mo5196x59bc66e());
            it8 = it9;
            list2 = list11;
            map2 = map3;
            m3553xc6b314ec = m3553xc6b314ec;
        }
        java.util.HashMap hashMap15 = hashMap2;
        if (list3 != null && i37 == i29 && list4.size() == list5.size()) {
            int i48 = 0;
            while (true) {
                if (i48 >= list4.size()) {
                    break;
                }
                if (!list4.get(i48).equals(list5.get(i48))) {
                    z19 = true;
                    break;
                }
                i48++;
            }
            if (!z19) {
                hashMap7 = hashMap3;
                if (!p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0262xd4b76239.m3535x89d97f06(this.f503x7488e20b, list, hashMap15, hashMap7)) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0262xd4b76239.m3536x58c4efaf(hashMap15, hashMap7, hashMap6, hashMap5, list3);
                }
                return new android.util.Pair<>(hashMap15, hashMap7);
            }
        }
        hashMap7 = hashMap3;
        return new android.util.Pair<>(hashMap15, hashMap7);
    }

    /* renamed from: getUpdatedSurfaceSizeDefinitionByFormat */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21 m3581x804cce0a(int i17) {
        if (!this.f523x955bf8e8.contains(java.lang.Integer.valueOf(i17))) {
            m3574xec43ee35(this.f522x12b9efd4.mo5214xa94b26e3(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2127xd0c921ee, i17);
            m3574xec43ee35(this.f522x12b9efd4.mo5213x58ac6427(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2125x480782fe, i17);
            m3573x2e8d8106(this.f522x12b9efd4.mo5210x8e34c51(), i17);
            m3575xeed54b2c(this.f522x12b9efd4.mo5215x2f3ce2f1(), i17);
            this.f523x955bf8e8.add(java.lang.Integer.valueOf(i17));
        }
        return this.f522x12b9efd4;
    }

    /* renamed from: isBurstCaptureSupported */
    public boolean m3582xc2eea3e() {
        return this.f510x12a59711;
    }

    /* renamed from: isRawSupported */
    public boolean m3583xaec9dbb0() {
        return this.f513xb57ce57d;
    }

    /* renamed from: transformSurfaceConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f m3584x501b1a43(int i17, int i18, android.util.Size size) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5683x501b1a43(i17, i18, size, m3581x804cce0a(i18));
    }
}
