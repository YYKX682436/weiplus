package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.Camera1Enumerator */
/* loaded from: classes14.dex */
public class C29736xd4076e70 implements org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9 {
    private static final java.lang.String TAG = "Camera1Enumerator";

    /* renamed from: cachedSupportedFormats */
    private static java.util.List<java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat>> f75130xfd42cc10;

    /* renamed from: captureToTexture */
    private final boolean f75131x1ec2557a;

    public C29736xd4076e70() {
        this(true);
    }

    /* renamed from: convertFramerates */
    public static java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange> m155161x1e963859(java.util.List<int[]> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    /* renamed from: convertSizes */
    public static java.util.List<org.p3371xd0ce3e8d.C29857x275421> m155162x2d08aa9f(java.util.List<android.hardware.Camera.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.hardware.Camera.Size size : list) {
            arrayList.add(new org.p3371xd0ce3e8d.C29857x275421(size.width, size.height));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* renamed from: enumerateFormats */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat> m155163xaf6d7058(int r17) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3371xd0ce3e8d.C29736xd4076e70.m155163xaf6d7058(int):java.util.List");
    }

    /* renamed from: getCameraIndex */
    public static int m155164x5359eb77(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "getCameraIndex: " + str);
        for (int i17 = 0; i17 < android.hardware.Camera.getNumberOfCameras(); i17++) {
            if (str.equals(m155166x1ccda9f7(i17))) {
                return i17;
            }
        }
        throw new java.lang.IllegalArgumentException("No such camera: " + str);
    }

    /* renamed from: getCameraInfo */
    private static android.hardware.Camera.CameraInfo m155165x764d3969(int i17) {
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        try {
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            return cameraInfo;
        } catch (java.lang.Exception e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "getCameraInfo failed on index " + i17, e17);
            return null;
        }
    }

    /* renamed from: getDeviceName */
    public static java.lang.String m155166x1ccda9f7(int i17) {
        android.hardware.Camera.CameraInfo m155165x764d3969 = m155165x764d3969(i17);
        if (m155165x764d3969 == null) {
            return null;
        }
        return "Camera " + i17 + ", Facing " + (m155165x764d3969.facing == 1 ? "front" : "back") + ", Orientation " + m155165x764d3969.orientation;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: createCapturer */
    public org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842 mo155168x34066b08(java.lang.String str, org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler cameraEventsHandler) {
        return new org.p3371xd0ce3e8d.C29735xeffe7398(str, cameraEventsHandler, this.f75131x1ec2557a);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: getDeviceNames */
    public java.lang.String[] mo155169x7ce7955c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < android.hardware.Camera.getNumberOfCameras(); i17++) {
            java.lang.String m155166x1ccda9f7 = m155166x1ccda9f7(i17);
            if (m155166x1ccda9f7 != null) {
                arrayList.add(m155166x1ccda9f7);
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Index: " + i17 + ". " + m155166x1ccda9f7);
            } else {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Index: " + i17 + ". Failed to query camera name.");
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: getSupportedFormats */
    public java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat> mo155170xdaf43244(java.lang.String str) {
        return m155167xdaf43244(m155164x5359eb77(str));
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: isBackFacing */
    public boolean mo155171xf8be346b(java.lang.String str) {
        android.hardware.Camera.CameraInfo m155165x764d3969 = m155165x764d3969(m155164x5359eb77(str));
        return m155165x764d3969 != null && m155165x764d3969.facing == 0;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9
    /* renamed from: isFrontFacing */
    public boolean mo155172x298133d9(java.lang.String str) {
        android.hardware.Camera.CameraInfo m155165x764d3969 = m155165x764d3969(m155164x5359eb77(str));
        return m155165x764d3969 != null && m155165x764d3969.facing == 1;
    }

    public C29736xd4076e70(boolean z17) {
        this.f75131x1ec2557a = z17;
    }

    /* renamed from: getSupportedFormats */
    public static synchronized java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat> m155167xdaf43244(int i17) {
        java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat> list;
        synchronized (org.p3371xd0ce3e8d.C29736xd4076e70.class) {
            if (f75130xfd42cc10 == null) {
                f75130xfd42cc10 = new java.util.ArrayList();
                for (int i18 = 0; i18 < android.hardware.Camera.getNumberOfCameras(); i18++) {
                    f75130xfd42cc10.add(m155163xaf6d7058(i18));
                }
            }
            list = f75130xfd42cc10.get(i17);
        }
        return list;
    }
}
