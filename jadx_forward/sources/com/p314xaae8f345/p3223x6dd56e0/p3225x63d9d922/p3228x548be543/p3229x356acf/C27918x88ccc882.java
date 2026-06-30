package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper */
/* loaded from: classes14.dex */
public class C27918x88ccc882 {

    /* renamed from: CLIENT_DEFAULT */
    public static final java.lang.String f62305x6781f5ad = "client_default";
    private static final java.lang.String TAG = "CameraRiskHelper";

    /* renamed from: cameraRiskDataList */
    protected java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e> f62306xb4a3471c;

    /* renamed from: cameraRiskOriginalDataList */
    protected java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e> f62307x860ce00d;

    /* renamed from: changeColor */
    private java.util.List<android.graphics.ColorMatrixColorFilter> f62308x9bd5f993;

    /* renamed from: isHasExposureRisk */
    private boolean f62309x114fc1a6;

    /* renamed from: isHasWhiteBalanceRisk */
    private boolean f62310xf7a18112;

    /* renamed from: isHasZoomRisk */
    private boolean f62311x8bfd3a72;

    /* renamed from: isSupportExposure */
    private boolean f62312x95ac936c;

    /* renamed from: isSupportWH */
    private boolean f62313x450f14d6;

    /* renamed from: isSupportZoom */
    private boolean f62314x3d9f34b8;

    /* renamed from: originalExposureIndex */
    protected int f62315xae41a9ba;

    /* renamed from: originalWhiteBalance */
    protected java.lang.String f62316x34e696e4;

    /* renamed from: originalZoomIndex */
    protected int f62317x9c4a91ee;

    /* renamed from: realExposureIndexMap */
    private final java.util.Map<java.lang.Float, java.lang.Integer> f62318xc7d3070f;

    /* renamed from: realWhiteBalanceMap */
    private final java.util.Map<java.lang.Integer, java.lang.String> f62319xffe6786b;

    /* renamed from: realZoomIndexMap */
    private final java.util.Map<java.lang.Integer, java.lang.Integer> f62320x75fdb0db;

    /* renamed from: supportType */
    public volatile com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89 f62321x91a803a9;

    /* renamed from: whiteColor */
    public android.graphics.ColorMatrixColorFilter f62322xddca4ba;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper$CameraRiskHelperHolder */
    /* loaded from: classes14.dex */
    public static final class CameraRiskHelperHolder {

        /* renamed from: INSTANCE */
        private static final com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882 f62327x4fbc8495 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882();

        private CameraRiskHelperHolder() {
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882 m121008x9cf0d20b() {
        return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.CameraRiskHelperHolder.f62327x4fbc8495;
    }

    /* renamed from: makeExposureRealData */
    private void m121009x4a0d569d(java.util.Map<java.lang.Float, java.lang.Integer> map, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData riskData) {
        float f17 = riskData.f62294x322db2;
        float f18 = 0.0f;
        int i17 = 0;
        if (f17 == 0.0f) {
            this.f62318xc7d3070f.put(java.lang.Float.valueOf(f17), 0);
            return;
        }
        if (java.lang.Math.abs(f17 - (-10.0f)) < 1.0E-6f) {
            riskData.f62294x322db2 = 0.0f;
        }
        float f19 = 99.0f;
        for (java.util.Map.Entry<java.lang.Float, java.lang.Integer> entry : map.entrySet()) {
            float floatValue = entry.getKey().floatValue();
            float abs = java.lang.Math.abs(floatValue - riskData.f62294x322db2);
            if (abs < f19) {
                i17 = entry.getValue().intValue();
                f18 = floatValue;
                f19 = abs;
            }
        }
        if (i17 != 0) {
            riskData.f62294x322db2 = f18;
            this.f62318xc7d3070f.put(java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: makeRealWhiteBalanceData */
    private void m121010xa45c7589(java.util.List<java.lang.String> list, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData riskData) {
        if (list == null || list.isEmpty()) {
            if (this.f62310xf7a18112) {
                this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_WH_ERROR;
            } else {
                this.f62313x450f14d6 = false;
            }
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "wb not support");
            return;
        }
        int i17 = riskData.f62295x322db3;
        boolean z17 = true;
        if (i17 == 0) {
            if (!list.contains("auto")) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make wb 0 error");
                z17 = false;
            }
            this.f62319xffe6786b.put(java.lang.Integer.valueOf(riskData.f62295x322db3), "auto");
        } else if (i17 == 1) {
            if (!list.contains("cloudy-daylight")) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make wb 1 error");
                z17 = false;
            }
            this.f62319xffe6786b.put(java.lang.Integer.valueOf(riskData.f62295x322db3), "cloudy-daylight");
        } else if (i17 == 2) {
            if (!list.contains("daylight")) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make wb 2 error");
                z17 = false;
            }
            this.f62319xffe6786b.put(java.lang.Integer.valueOf(riskData.f62295x322db3), "daylight");
        } else if (i17 == 3) {
            if (!list.contains("warm-fluorescent")) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make wb 3 error");
                z17 = false;
            }
            this.f62319xffe6786b.put(java.lang.Integer.valueOf(riskData.f62295x322db3), "warm-fluorescent");
        } else if (i17 == 4) {
            if (!list.contains("fluorescent")) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make wb 4 error");
                z17 = false;
            }
            this.f62319xffe6786b.put(java.lang.Integer.valueOf(riskData.f62295x322db3), "fluorescent");
        } else if (i17 == 5) {
            if (!list.contains("incandescent")) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make wb 5 error");
                z17 = false;
            }
            this.f62319xffe6786b.put(java.lang.Integer.valueOf(riskData.f62295x322db3), "incandescent");
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "wb not support");
        if (this.f62310xf7a18112) {
            this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_WH_ERROR;
        } else {
            this.f62313x450f14d6 = false;
        }
    }

    /* renamed from: makeZoomRealData */
    private void m121011xb9caa869(java.util.List<java.lang.Integer> list, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData riskData) {
        int intValue;
        int i17 = 999;
        int i18 = 100;
        int i19 = 0;
        for (int i27 = 0; i27 < list.size() && (intValue = list.get(i27).intValue()) <= 200; i27++) {
            if (java.lang.Math.abs(intValue - riskData.f62296x322db4) < i17) {
                i17 = java.lang.Math.abs(intValue - riskData.f62296x322db4);
                i19 = i27;
                i18 = intValue;
            }
        }
        riskData.f62296x322db4 = i18;
        this.f62320x75fdb0db.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: paramToStr */
    public static java.lang.String m121012x1a65a929(android.hardware.Camera.Parameters parameters) {
        if (parameters == null) {
            return "null params";
        }
        try {
            return java.lang.String.format("[e=(min%s,cur%s,max%s), w=%s, z=%s]", java.lang.Integer.valueOf(parameters.getMinExposureCompensation()), java.lang.Integer.valueOf(parameters.getExposureCompensation()), java.lang.Integer.valueOf(parameters.getMaxExposureCompensation()), parameters.getWhiteBalance(), java.lang.Integer.valueOf(parameters.getZoom()));
        } catch (java.lang.Exception e17) {
            return e17.getLocalizedMessage();
        }
    }

    /* renamed from: sendChangeCameraParamsEvent */
    private void m121013x401d89d7(android.hardware.Camera camera, android.hardware.Camera.Parameters parameters) {
        java.lang.Runnable runnable = new java.lang.Runnable(parameters, camera) { // from class: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.1

            /* renamed from: sendChangeTime */
            long f62323xffbd6445 = java.lang.System.currentTimeMillis();

            /* renamed from: val$camera */
            final /* synthetic */ android.hardware.Camera f62325xb9a13a08;

            /* renamed from: val$parameters */
            final /* synthetic */ android.hardware.Camera.Parameters f62326xc6530f4d;

            {
                this.f62326xc6530f4d = parameters;
                this.f62325xb9a13a08 = camera;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.w(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.TAG, "SendChange: param=" + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121012x1a65a929(parameters));
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.w(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.TAG, java.lang.String.format("PreChange%s - SendChange%s = delay%sms, param=%s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f62323xffbd6445), java.lang.Long.valueOf(currentTimeMillis - this.f62323xffbd6445), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121012x1a65a929(this.f62326xc6530f4d)));
                    this.f62325xb9a13a08.setParameters(this.f62326xc6530f4d);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.w(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.TAG, java.lang.String.format("PostChange%s-PreChange%s=cost%sms, param=%s", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121012x1a65a929(this.f62326xc6530f4d)));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.CAMERA_PARAM_TRANSFORM_ERROR;
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.TAG, "device not support:" + android.util.Log.getStackTraceString(e17));
                }
            }
        };
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61540xe152369c, runnable);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
    }

    /* renamed from: changeCameraParameters */
    public boolean m121014xf5776ebf(android.hardware.Camera camera, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData riskData) {
        boolean z17 = false;
        if (this.f62321x91a803a9 != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.SUCCESS) {
            return false;
        }
        java.lang.Integer num = this.f62318xc7d3070f.get(java.lang.Float.valueOf(riskData.f62294x322db2));
        java.lang.Integer num2 = this.f62320x75fdb0db.get(java.lang.Integer.valueOf(riskData.f62296x322db4));
        java.lang.String str = this.f62319xffe6786b.get(java.lang.Integer.valueOf(riskData.f62295x322db3));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "change param e:" + riskData.f62294x322db2 + ",z:" + riskData.f62296x322db4 + ",wb:" + riskData.f62295x322db3 + ",ei:" + num + ",zi:" + num2 + ",wbi:" + str);
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            z17 = m121007xf5776ebf(parameters, num, num2, str);
            if (z17) {
                m121013x401d89d7(camera, parameters);
            }
        } catch (java.lang.Exception e17) {
            this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.CAMERA_PARAM_TRANSFORM_ERROR;
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "device not support:" + android.util.Log.getStackTraceString(e17));
        }
        return z17;
    }

    /* renamed from: getCameraRiskDataList */
    public java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e> m121015xc7ffa912() {
        return this.f62306xb4a3471c;
    }

    /* renamed from: getCameraRiskOriginalDataList */
    public java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e> m121016xe53aec03() {
        return this.f62307x860ce00d;
    }

    /* renamed from: getColorMatrixColorFilter */
    public android.graphics.ColorMatrixColorFilter m121017x51adc80d() {
        android.graphics.ColorMatrixColorFilter remove = this.f62308x9bd5f993.remove(0);
        this.f62308x9bd5f993.add(remove);
        return remove;
    }

    /* renamed from: getCurrentStateRiskData */
    public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e m121018xd6e87247(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName stageName) {
        java.util.Iterator<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e> it = this.f62306xb4a3471c.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e next = it.next();
            if (next.f62287x42bb9f2c.equalsIgnoreCase(stageName.name())) {
                return next;
            }
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "not find risk data:" + stageName.name());
        return null;
    }

    /* renamed from: makeRiskRealData */
    public void m121019xa77e3365(java.util.List<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e> list, android.hardware.Camera camera) {
        java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData> arrayList;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            if (parameters == null) {
                this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_ERROR;
                return;
            }
            try {
                int minExposureCompensation = parameters.getMinExposureCompensation();
                int maxExposureCompensation = parameters.getMaxExposureCompensation();
                if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
                    if (this.f62309x114fc1a6) {
                        this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_EXPOSURE_ERROR;
                        return;
                    }
                    this.f62312x95ac936c = false;
                }
                while (minExposureCompensation <= maxExposureCompensation) {
                    if (minExposureCompensation != 0) {
                        hashMap.put(java.lang.Float.valueOf(minExposureCompensation * parameters.getExposureCompensationStep()), java.lang.Integer.valueOf(minExposureCompensation));
                    }
                    minExposureCompensation++;
                }
            } catch (java.lang.Exception e17) {
                if (this.f62309x114fc1a6) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make risk error:" + android.util.Log.getStackTraceString(e17));
                    this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_EXPOSURE_ERROR;
                    return;
                }
                this.f62312x95ac936c = false;
            }
            java.util.List<java.lang.Integer> list2 = null;
            try {
                if (parameters.isZoomSupported()) {
                    list2 = parameters.getZoomRatios();
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make risk error:" + android.util.Log.getStackTraceString(e18));
            }
            if (list2 == null || list2.isEmpty()) {
                if (this.f62311x8bfd3a72) {
                    this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_ZOOM_ERROR;
                    return;
                }
                this.f62314x3d9f34b8 = false;
            }
            try {
                for (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e c27917x3b01cd7e : list) {
                    java.util.Iterator<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData> it = c27917x3b01cd7e.f62286xa9fd6102.iterator();
                    long j17 = 0;
                    int i17 = 0;
                    while (it.hasNext()) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData next = it.next();
                        if (this.f62312x95ac936c || this.f62321x91a803a9 != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_EXPOSURE_ERROR) {
                            m121009x4a0d569d(hashMap, next);
                        }
                        if ((this.f62314x3d9f34b8 || this.f62321x91a803a9 != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_ZOOM_ERROR) && list2 != null) {
                            m121011xb9caa869(list2, next);
                        }
                        if (this.f62313x450f14d6 || this.f62321x91a803a9 != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_WH_ERROR) {
                            m121010xa45c7589(parameters.getSupportedWhiteBalance(), next);
                        }
                        j17 += next.f62297x322db5;
                        i17++;
                    }
                    if (c27917x3b01cd7e.f62287x42bb9f2c.equalsIgnoreCase(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName.stage_reflect.name()) && (arrayList = c27917x3b01cd7e.f62286xa9fd6102) != null && !arrayList.isEmpty()) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData riskData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData();
                        riskData.f62293xa9fe2aef = f62305x6781f5ad;
                        riskData.f62297x322db5 = j17 / i17;
                        c27917x3b01cd7e.f62286xa9fd6102.add(riskData);
                    }
                }
                this.f62315xae41a9ba = parameters.getExposureCompensation();
                if (parameters.isZoomSupported()) {
                    this.f62317x9c4a91ee = parameters.getZoom();
                } else {
                    if (this.f62311x8bfd3a72) {
                        this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_ZOOM_ERROR;
                        return;
                    }
                    this.f62314x3d9f34b8 = false;
                }
                java.lang.String whiteBalance = parameters.getWhiteBalance();
                this.f62316x34e696e4 = whiteBalance;
                if (android.text.TextUtils.isEmpty(whiteBalance)) {
                    if (this.f62310xf7a18112) {
                        this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_WH_ERROR;
                    } else {
                        this.f62313x450f14d6 = false;
                    }
                }
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make risk error:" + android.util.Log.getStackTraceString(e19));
                this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_ERROR;
            }
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "make risk error:" + android.util.Log.getStackTraceString(e27));
            this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.GET_CAMERA_PARAM_ERROR;
        }
    }

    /* renamed from: resetCameraParams */
    public void m121020x439eebfa() {
        android.hardware.Camera camera = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120766x76565f86().f61788x695aadfe;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "change param oei:" + this.f62315xae41a9ba + ",zi:" + this.f62317x9c4a91ee + ",wbi:" + this.f62316x34e696e4);
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            if (m121007xf5776ebf(parameters, java.lang.Integer.valueOf(this.f62315xae41a9ba), java.lang.Integer.valueOf(this.f62317x9c4a91ee), this.f62316x34e696e4)) {
                m121013x401d89d7(camera, parameters);
            }
        } catch (java.lang.Exception e17) {
            this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.CAMERA_PARAM_TRANSFORM_ERROR;
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "device not support:" + android.util.Log.getStackTraceString(e17));
        }
    }

    /* renamed from: transformRiskData */
    public boolean m121021x8ad272a5(org.json.JSONArray jSONArray) {
        m121022xcde7deff();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e c27917x3b01cd7e = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e();
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                c27917x3b01cd7e.f62287x42bb9f2c = jSONObject.getString("stage_name");
                c27917x3b01cd7e.f62290x8d5ebe3b = jSONObject.getInt("ui_start_delay");
                c27917x3b01cd7e.f62289xb0bc3534 = jSONObject.getInt("ui_end_delay");
                c27917x3b01cd7e.f62286xa9fd6102 = new java.util.ArrayList<>();
                org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("image_list");
                for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                    org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i18);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData riskData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData();
                    riskData.f62298xac8bdb4 = new java.util.ArrayList<>();
                    org.json.JSONArray jSONArray3 = jSONObject2.getJSONArray("task_type");
                    for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                        riskData.f62298xac8bdb4.add(java.lang.Integer.valueOf(jSONArray3.getInt(i19)));
                    }
                    riskData.f62293xa9fe2aef = jSONObject2.getString("image_name");
                    float f17 = (float) jSONObject2.getDouble("key1");
                    riskData.f62294x322db2 = f17;
                    if (f17 != 0.0f && !this.f62309x114fc1a6) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "has e risk");
                        this.f62309x114fc1a6 = true;
                    }
                    int i27 = jSONObject2.getInt("key2");
                    riskData.f62295x322db3 = i27;
                    if (i27 != 0 && !this.f62310xf7a18112) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "has wb risk");
                        this.f62310xf7a18112 = true;
                    }
                    int i28 = jSONObject2.getInt("key3");
                    riskData.f62296x322db4 = i28;
                    if (i28 != 100 && !this.f62311x8bfd3a72) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "has z risk");
                        this.f62311x8bfd3a72 = true;
                    }
                    riskData.f62297x322db5 = jSONObject2.getInt("key4");
                    c27917x3b01cd7e.f62286xa9fd6102.add(riskData);
                }
                this.f62306xb4a3471c.add(c27917x3b01cd7e);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "transform json to risk error:" + android.util.Log.getStackTraceString(e17));
                return false;
            }
        }
        this.f62307x860ce00d = new java.util.ArrayList<>();
        java.util.Iterator<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e> it = this.f62306xb4a3471c.iterator();
        while (it.hasNext()) {
            this.f62307x860ce00d.add(it.next().m120973x5a5dd5d());
        }
        m121019xa77e3365(this.f62306xb4a3471c, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120766x76565f86().f61788x695aadfe);
        return true;
    }

    /* renamed from: unload */
    public void m121022xcde7deff() {
        this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.SUCCESS;
        this.f62306xb4a3471c.clear();
        this.f62307x860ce00d.clear();
        this.f62318xc7d3070f.clear();
        this.f62320x75fdb0db.clear();
        this.f62319xffe6786b.clear();
        this.f62312x95ac936c = true;
        this.f62313x450f14d6 = true;
        this.f62314x3d9f34b8 = true;
        this.f62311x8bfd3a72 = false;
        this.f62310xf7a18112 = false;
        this.f62309x114fc1a6 = false;
    }

    private C27918x88ccc882() {
        this.f62306xb4a3471c = new java.util.ArrayList<>();
        this.f62307x860ce00d = new java.util.ArrayList<>();
        this.f62318xc7d3070f = new java.util.HashMap();
        this.f62320x75fdb0db = new java.util.HashMap();
        this.f62319xffe6786b = new java.util.HashMap();
        this.f62308x9bd5f993 = new java.util.LinkedList();
        this.f62315xae41a9ba = 0;
        this.f62317x9c4a91ee = 0;
        this.f62316x34e696e4 = "auto";
        this.f62321x91a803a9 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.SUCCESS;
        this.f62314x3d9f34b8 = true;
        this.f62313x450f14d6 = true;
        this.f62312x95ac936c = true;
        this.f62311x8bfd3a72 = false;
        this.f62309x114fc1a6 = false;
        this.f62310xf7a18112 = false;
        this.f62308x9bd5f993.add(new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 230.0f, 0.0f, 0.0f, 0.0f, 0.0f, 53.0f, 0.0f, 0.0f, 0.0f, 0.0f, 135.0f, 0.0f, 0.0f, 0.0f, 0.0f, 242.0f}));
        this.f62308x9bd5f993.add(new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 31.0f, 0.0f, 0.0f, 0.0f, 0.0f, 191.0f, 0.0f, 0.0f, 0.0f, 0.0f, 70.0f, 0.0f, 0.0f, 0.0f, 0.0f, 242.0f}));
        this.f62308x9bd5f993.add(new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 55.0f, 0.0f, 0.0f, 0.0f, 0.0f, 30.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 242.0f}));
        this.f62322xddca4ba = new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    /* renamed from: changeCameraParameters */
    private boolean m121007xf5776ebf(android.hardware.Camera.Parameters parameters, java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
        boolean z17;
        if (this.f62312x95ac936c && this.f62309x114fc1a6 && parameters.getExposureCompensation() != num.intValue()) {
            parameters.setExposureCompensation(num.intValue());
            z17 = true;
        } else {
            z17 = false;
        }
        if (this.f62314x3d9f34b8 && this.f62311x8bfd3a72 && parameters.getZoom() != num2.intValue()) {
            parameters.setZoom(num2.intValue());
            z17 = true;
        }
        if (!this.f62313x450f14d6 || !this.f62310xf7a18112 || parameters.getWhiteBalance().equalsIgnoreCase(str)) {
            return z17;
        }
        parameters.setWhiteBalance(str);
        return true;
    }
}
