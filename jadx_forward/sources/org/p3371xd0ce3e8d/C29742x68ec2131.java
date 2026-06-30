package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.Camera2Enumerator */
/* loaded from: classes14.dex */
public class C29742x68ec2131 implements org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9 {

    /* renamed from: NANO_SECONDS_PER_SECOND */
    private static final double f75155x562b4741 = 1.0E9d;
    private static final java.lang.String TAG = "Camera2Enumerator";

    /* renamed from: cachedSupportedFormats */
    private static final java.util.Map<java.lang.String, java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat>> f75156xfd42cc10 = new java.util.HashMap();

    /* renamed from: cameraManager */
    final android.hardware.camera2.CameraManager f75157xe52200c8;

    /* renamed from: context */
    final android.content.Context f75158x38b735af;

    public C29742x68ec2131(android.content.Context context) {
        this.f75158x38b735af = context;
        this.f75157xe52200c8 = (android.hardware.camera2.CameraManager) context.getSystemService("camera");
    }

    /* renamed from: convertFramerates */
    public static java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange> m155204x1e963859(android.util.Range<java.lang.Integer>[] rangeArr, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Range<java.lang.Integer> range : rangeArr) {
            arrayList.add(new org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange(range.getLower().intValue() * i17, range.getUpper().intValue() * i17));
        }
        return arrayList;
    }

    /* renamed from: convertSizes */
    private static java.util.List<org.p3371xd0ce3e8d.C29857x275421> m155205x2d08aa9f(android.util.Size[] sizeArr) {
        if (sizeArr == null || sizeArr.length == 0) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(sizeArr.length);
        for (android.util.Size size : sizeArr) {
            arrayList.add(new org.p3371xd0ce3e8d.C29857x275421(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* renamed from: getCameraCharacteristics */
    private android.hardware.camera2.CameraCharacteristics m155206x9b962a9d(java.lang.String str) {
        try {
            return this.f75157xe52200c8.getCameraCharacteristics(str);
        } catch (android.util.AndroidException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Camera access exception", e17);
            return null;
        }
    }

    /* renamed from: getFpsUnitFactor */
    public static int m155207xe87a6206(android.util.Range<java.lang.Integer>[] rangeArr) {
        return (rangeArr.length != 0 && rangeArr[0].getUpper().intValue() >= 1000) ? 1 : 1000;
    }

    /* renamed from: getSupportedSizes */
    public static java.util.List<org.p3371xd0ce3e8d.C29857x275421> m155210x7b78e57a(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        ((java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        return m155205x2d08aa9f(streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class));
    }

    /* renamed from: isSupported */
    public static boolean m155211x450f16a4(android.content.Context context) {
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) context.getSystemService("camera");
        try {
            for (java.lang.String str : cameraManager.getCameraIdList()) {
                if (((java.lang.Integer) cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (android.util.AndroidException | java.lang.RuntimeException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Failed to check if camera2 is supported", e17);
            return false;
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: createCapturer */
    public org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842 mo155168x34066b08(java.lang.String str, org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler cameraEventsHandler) {
        return new org.p3371xd0ce3e8d.C29741x8442e299(this.f75158x38b735af, str, cameraEventsHandler);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: getDeviceNames */
    public java.lang.String[] mo155169x7ce7955c() {
        try {
            return this.f75157xe52200c8.getCameraIdList();
        } catch (android.util.AndroidException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Camera access exception", e17);
            return new java.lang.String[0];
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: getSupportedFormats */
    public java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat> mo155170xdaf43244(java.lang.String str) {
        return m155208xdaf43244(this.f75158x38b735af, str);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: isBackFacing */
    public boolean mo155171xf8be346b(java.lang.String str) {
        android.hardware.camera2.CameraCharacteristics m155206x9b962a9d = m155206x9b962a9d(str);
        return m155206x9b962a9d != null && ((java.lang.Integer) m155206x9b962a9d.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: isFrontFacing */
    public boolean mo155172x298133d9(java.lang.String str) {
        android.hardware.camera2.CameraCharacteristics m155206x9b962a9d = m155206x9b962a9d(str);
        return m155206x9b962a9d != null && ((java.lang.Integer) m155206x9b962a9d.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    /* renamed from: getSupportedFormats */
    public static java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat> m155208xdaf43244(android.content.Context context, java.lang.String str) {
        return m155209xdaf43244((android.hardware.camera2.CameraManager) context.getSystemService("camera"), str);
    }

    /* renamed from: getSupportedFormats */
    public static java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat> m155209xdaf43244(android.hardware.camera2.CameraManager cameraManager, java.lang.String str) {
        long j17;
        java.util.Map<java.lang.String, java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat>> map = f75156xfd42cc10;
        synchronized (map) {
            if (map.containsKey(str)) {
                return map.get(str);
            }
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Get supported formats for camera index " + str + ".");
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            try {
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                android.util.Range[] rangeArr = (android.util.Range[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange> m155204x1e963859 = m155204x1e963859(rangeArr, m155207xe87a6206(rangeArr));
                java.util.List<org.p3371xd0ce3e8d.C29857x275421> m155210x7b78e57a = m155210x7b78e57a(cameraCharacteristics);
                java.util.Iterator<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange> it = m155204x1e963859.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    i17 = java.lang.Math.max(i17, it.next().max);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (org.p3371xd0ce3e8d.C29857x275421 c29857x275421 : m155210x7b78e57a) {
                    try {
                        j17 = streamConfigurationMap.getOutputMinFrameDuration(android.graphics.SurfaceTexture.class, new android.util.Size(c29857x275421.f75950x6be2dc6, c29857x275421.f75949xb7389127));
                    } catch (java.lang.Exception unused) {
                        j17 = 0;
                    }
                    int round = j17 == 0 ? i17 : ((int) java.lang.Math.round(f75155x562b4741 / j17)) * 1000;
                    arrayList.add(new org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat(c29857x275421.f75950x6be2dc6, c29857x275421.f75949xb7389127, 0, round));
                    org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Format: " + c29857x275421.f75950x6be2dc6 + "x" + c29857x275421.f75949xb7389127 + "@" + round);
                }
                f75156xfd42cc10.put(str, arrayList);
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Get supported formats for camera index " + str + " done. Time spent: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
                return arrayList;
            } catch (java.lang.Exception e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "getCameraCharacteristics()", e17);
                return new java.util.ArrayList();
            }
        }
    }
}
