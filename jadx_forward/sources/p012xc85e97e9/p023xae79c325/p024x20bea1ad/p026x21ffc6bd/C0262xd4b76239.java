package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.StreamUseCaseUtil */
/* loaded from: classes14.dex */
public final class C0262xd4b76239 {

    /* renamed from: STREAM_USE_CASE_STREAM_SPEC_OPTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Long> f498x12e60192 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camera2.streamSpec.streamUseCase", java.lang.Long.TYPE);

    /* renamed from: STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP */
    private static final java.util.Map<java.lang.Long, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType>> f499xfbb4901;

    /* renamed from: STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP */
    private static final java.util.Map<java.lang.Long, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType>> f500x83823d1c;
    private static final java.lang.String TAG = "StreamUseCaseUtil";

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f499xfbb4901 = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        f500x83823d1c = hashMap2;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.util.HashSet hashSet = new java.util.HashSet();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.PREVIEW;
            hashSet.add(captureType);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.METERING_REPEATING;
            hashSet.add(captureType2);
            hashMap.put(4L, hashSet);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet2.add(captureType);
            hashSet2.add(captureType2);
            hashSet2.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            java.util.HashSet hashSet3 = new java.util.HashSet();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.IMAGE_CAPTURE;
            hashSet3.add(captureType3);
            hashMap.put(2L, hashSet3);
            java.util.HashSet hashSet4 = new java.util.HashSet();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.VIDEO_CAPTURE;
            hashSet4.add(captureType4);
            hashMap.put(3L, hashSet4);
            java.util.HashSet hashSet5 = new java.util.HashSet();
            hashSet5.add(captureType);
            hashSet5.add(captureType3);
            hashSet5.add(captureType4);
            hashMap2.put(4L, hashSet5);
            java.util.HashSet hashSet6 = new java.util.HashSet();
            hashSet6.add(captureType);
            hashSet6.add(captureType4);
            hashMap2.put(3L, hashSet6);
        }
    }

    private C0262xd4b76239() {
    }

    /* renamed from: areCaptureTypesEligible */
    public static boolean m3525x5ddd943e(java.util.Map<java.lang.Integer, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> map, java.util.Map<java.lang.Integer, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> map2, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> list) {
        for (int i17 = 0; i17 < list.size(); i17++) {
            long mo5205xd0b82e01 = list.get(i17).mo5205xd0b82e01();
            if (map.containsKey(java.lang.Integer.valueOf(i17))) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 abstractC0643xfc6b6a97 = map.get(java.lang.Integer.valueOf(i17));
                if (!m3531xd3a72fbf(abstractC0643xfc6b6a97.mo5093x8e12cf49().size() == 1 ? abstractC0643xfc6b6a97.mo5093x8e12cf49().get(0) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.STREAM_SHARING, mo5205xd0b82e01, abstractC0643xfc6b6a97.mo5093x8e12cf49())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(java.lang.Integer.valueOf(i17))) {
                    throw new java.lang.AssertionError("SurfaceConfig does not map to any use case");
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 = map2.get(java.lang.Integer.valueOf(i17));
                if (!m3531xd3a72fbf(interfaceC0768x83509b59.mo3493xe38cfe6a(), mo5205xd0b82e01, interfaceC0768x83509b59.mo3493xe38cfe6a() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.STREAM_SHARING ? ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0963xbe37237e) interfaceC0768x83509b59).m6582x8e12cf49() : java.util.Collections.emptyList())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: areStreamUseCasesAvailable */
    private static boolean m3526xe7b17399(java.util.Set<java.lang.Long> set, java.util.Set<java.lang.Long> set2) {
        java.util.Iterator<java.lang.Long> it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: areStreamUseCasesAvailableForSurfaceConfigs */
    public static boolean m3527xafaa7a94(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> list) {
        long[] jArr;
        if (android.os.Build.VERSION.SDK_INT < 33 || (jArr = (long[]) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (long j17 : jArr) {
            hashSet.add(java.lang.Long.valueOf(j17));
        }
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(java.lang.Long.valueOf(it.next().mo5205xd0b82e01()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: containsZslUseCase */
    public static boolean m3528xe5f05d03(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> list2) {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 abstractC0643xfc6b6a97 : list) {
            if (m3534xb485e24e(abstractC0643xfc6b6a97.mo5096xca0018d6(), abstractC0643xfc6b6a97.mo5093x8e12cf49().get(0))) {
                return true;
            }
        }
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 : list2) {
            if (m3534xb485e24e(interfaceC0768x83509b59, interfaceC0768x83509b59.mo3493xe38cfe6a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getStreamSpecImplementationOptions */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef m3529x8599cfbb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5524xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f112xb3c16ecd;
        if (interfaceC0768x83509b59.mo5374xdccd9774(option)) {
            m5524xaf65a0fc.mo5521x25e7888e(option, (java.lang.Long) interfaceC0768x83509b59.mo5379x77ba97d1(option));
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1838x83019c92;
        if (interfaceC0768x83509b59.mo5374xdccd9774(option2)) {
            m5524xaf65a0fc.mo5521x25e7888e(option2, (java.lang.Boolean) interfaceC0768x83509b59.mo5379x77ba97d1(option2));
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1674xa81db3aa;
        if (interfaceC0768x83509b59.mo5374xdccd9774(option3)) {
            m5524xaf65a0fc.mo5521x25e7888e(option3, (java.lang.Integer) interfaceC0768x83509b59.mo5379x77ba97d1(option3));
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6;
        if (interfaceC0768x83509b59.mo5374xdccd9774(option4)) {
            m5524xaf65a0fc.mo5521x25e7888e(option4, (java.lang.Integer) interfaceC0768x83509b59.mo5379x77ba97d1(option4));
        }
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef(m5524xaf65a0fc);
    }

    /* renamed from: getUpdatedImplementationOptionsWithUseCaseStreamSpecOption */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m3530x369003fa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, long j17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Long> option = f498x12e60192;
        if (interfaceC0692x78a46f62.mo5374xdccd9774(option) && ((java.lang.Long) interfaceC0692x78a46f62.mo5379x77ba97d1(option)).longValue() == j17) {
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5525x3017aa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa(interfaceC0692x78a46f62);
        m5525x3017aa.mo5521x25e7888e(option, java.lang.Long.valueOf(j17));
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef(m5525x3017aa);
    }

    /* renamed from: isEligibleCaptureType */
    private static boolean m3531xd3a72fbf(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType, long j17, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.STREAM_SHARING) {
            java.util.Map<java.lang.Long, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType>> map = f499xfbb4901;
            return map.containsKey(java.lang.Long.valueOf(j17)) && map.get(java.lang.Long.valueOf(j17)).contains(captureType);
        }
        java.util.Map<java.lang.Long, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType>> map2 = f500x83823d1c;
        if (!map2.containsKey(java.lang.Long.valueOf(j17))) {
            return false;
        }
        java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> set = map2.get(java.lang.Long.valueOf(j17));
        if (list.size() != set.size()) {
            return false;
        }
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isStreamUseCaseSupported */
    public static boolean m3532x918e9e81(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        long[] jArr;
        return (android.os.Build.VERSION.SDK_INT < 33 || (jArr = (long[]) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    /* renamed from: isValidCamera2InteropOverride */
    private static boolean m3533x1beeccce(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> list2, java.util.Set<java.lang.Long> set) {
        boolean z17;
        boolean z18;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> it = list.iterator();
        if (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 next = it.next();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5096xca0018d6 = next.mo5096xca0018d6();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Long> option = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f112xb3c16ecd;
            if (mo5096xca0018d6.mo5374xdccd9774(option) && ((java.lang.Long) next.mo5096xca0018d6().mo5379x77ba97d1(option)).longValue() != 0) {
                z17 = true;
                z18 = false;
            } else {
                z18 = true;
                z17 = false;
            }
        } else {
            z17 = false;
            z18 = false;
        }
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 : list2) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option2 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f112xb3c16ecd;
            if (interfaceC0768x83509b59.mo5374xdccd9774(option2)) {
                long longValue = ((java.lang.Long) interfaceC0768x83509b59.mo5379x77ba97d1(option2)).longValue();
                if (longValue != 0) {
                    if (z18) {
                        m3539xba34c02();
                    }
                    hashSet.add(java.lang.Long.valueOf(longValue));
                    z17 = true;
                } else if (z17) {
                    m3539xba34c02();
                }
            } else if (z17) {
                m3539xba34c02();
            }
            z18 = true;
        }
        return !z18 && m3526xe7b17399(set, hashSet);
    }

    /* renamed from: isZslUseCase */
    private static boolean m3534xb485e24e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType) {
        if (((java.lang.Boolean) interfaceC0692x78a46f62.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1838x83019c92, java.lang.Boolean.FALSE)).booleanValue()) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1674xa81db3aa;
        return interfaceC0692x78a46f62.mo5374xdccd9774(option) && p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0276xb19b2116.m3631xeb8ca9b6(captureType, ((java.lang.Integer) interfaceC0692x78a46f62.mo5379x77ba97d1(option)).intValue()) == 5;
    }

    /* renamed from: populateStreamUseCaseStreamSpecOptionWithInteropOverride */
    public static boolean m3535x89d97f06(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> map, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> map2) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo5096xca0018d6().getClass();
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b = map.get((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59) it6.next());
            abstractC0756x2f9ad77b.getClass();
            abstractC0756x2f9ad77b.mo5190xca0018d6().getClass();
        }
        long[] jArr = (long[]) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (long j17 : jArr) {
                hashSet.add(java.lang.Long.valueOf(j17));
            }
            if (m3533x1beeccce(list, arrayList, hashSet)) {
                for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 abstractC0643xfc6b6a97 : list) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5096xca0018d6 = abstractC0643xfc6b6a97.mo5096xca0018d6();
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m3530x369003fa = m3530x369003fa(mo5096xca0018d6, ((java.lang.Long) mo5096xca0018d6.mo5379x77ba97d1(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f112xb3c16ecd)).longValue());
                    if (m3530x369003fa != null) {
                        map2.put(abstractC0643xfc6b6a97, abstractC0643xfc6b6a97.m5100x3b434836(m3530x369003fa));
                    }
                }
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59) it7.next();
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2 = map.get(interfaceC0768x83509b59);
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5190xca0018d6 = abstractC0756x2f9ad77b2.mo5190xca0018d6();
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m3530x369003fa2 = m3530x369003fa(mo5190xca0018d6, ((java.lang.Long) mo5190xca0018d6.mo5379x77ba97d1(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f112xb3c16ecd)).longValue());
                    if (m3530x369003fa2 != null) {
                        map.put(interfaceC0768x83509b59, abstractC0756x2f9ad77b2.mo5194xaaa148a0().mo5199x9a12cb4a(m3530x369003fa2).mo5196x59bc66e());
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs */
    public static void m3536x58c4efaf(java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> map, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> map2, java.util.Map<java.lang.Integer, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> map3, java.util.Map<java.lang.Integer, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> map4, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> list) {
        for (int i17 = 0; i17 < list.size(); i17++) {
            long mo5205xd0b82e01 = list.get(i17).mo5205xd0b82e01();
            if (map3.containsKey(java.lang.Integer.valueOf(i17))) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 abstractC0643xfc6b6a97 = map3.get(java.lang.Integer.valueOf(i17));
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m3530x369003fa = m3530x369003fa(abstractC0643xfc6b6a97.mo5096xca0018d6(), mo5205xd0b82e01);
                if (m3530x369003fa != null) {
                    map2.put(abstractC0643xfc6b6a97, abstractC0643xfc6b6a97.m5100x3b434836(m3530x369003fa));
                }
            } else {
                if (!map4.containsKey(java.lang.Integer.valueOf(i17))) {
                    throw new java.lang.AssertionError("SurfaceConfig does not map to any use case");
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 = map4.get(java.lang.Integer.valueOf(i17));
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b = map.get(interfaceC0768x83509b59);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m3530x369003fa2 = m3530x369003fa(abstractC0756x2f9ad77b.mo5190xca0018d6(), mo5205xd0b82e01);
                if (m3530x369003fa2 != null) {
                    map.put(interfaceC0768x83509b59, abstractC0756x2f9ad77b.mo5194xaaa148a0().mo5199x9a12cb4a(m3530x369003fa2).mo5196x59bc66e());
                }
            }
        }
    }

    /* renamed from: populateSurfaceToStreamUseCaseMapping */
    public static void m3537xc1387a75(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> collection, java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> collection2, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293, java.lang.Long> map) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList(collection2);
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 next = it.next();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5592xca0018d6 = next.m5592xca0018d6();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Long> option = f498x12e60192;
            if (!m5592xca0018d6.mo5374xdccd9774(option) || next.m5601x1b8de6dc().size() == 1) {
                if (next.m5592xca0018d6().mo5374xdccd9774(option)) {
                    z17 = true;
                    break;
                }
            } else {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, java.lang.String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", java.lang.Integer.valueOf(next.m5601x1b8de6dc().size())));
                return;
            }
        }
        if (z17) {
            int i17 = 0;
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958 : collection) {
                if (((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59) arrayList.get(i17)).mo3493xe38cfe6a() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.METERING_REPEATING) {
                    m3.h.e(!c0750xb915958.m5601x1b8de6dc().isEmpty(), "MeteringRepeating should contain a surface");
                    map.put(c0750xb915958.m5601x1b8de6dc().get(0), 1L);
                } else {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5592xca0018d62 = c0750xb915958.m5592xca0018d6();
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Long> option2 = f498x12e60192;
                    if (m5592xca0018d62.mo5374xdccd9774(option2) && !c0750xb915958.m5601x1b8de6dc().isEmpty()) {
                        map.put(c0750xb915958.m5601x1b8de6dc().get(0), (java.lang.Long) c0750xb915958.m5592xca0018d6().mo5379x77ba97d1(option2));
                    }
                }
                i17++;
            }
        }
    }

    /* renamed from: shouldUseStreamUseCase */
    public static boolean m3538xc9ee343(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110.FeatureSettings featureSettings) {
        return featureSettings.mo2919x764f0e5e() == 0 && featureSettings.mo2920xd62912e5() == 8;
    }

    /* renamed from: throwInvalidCamera2InteropOverrideException */
    private static void m3539xba34c02() {
        throw new java.lang.IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
