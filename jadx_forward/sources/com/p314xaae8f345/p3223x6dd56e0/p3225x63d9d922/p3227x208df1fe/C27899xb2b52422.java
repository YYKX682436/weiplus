package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe;

/* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon */
/* loaded from: classes14.dex */
public class C27899xb2b52422 {

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon$ProcessHelper */
    /* loaded from: classes14.dex */
    public static class ProcessHelper {
        /* renamed from: calcEyeScore */
        public static float m120738x7b6a3456(float[] fArr) {
            float f17 = fArr[32] - fArr[40];
            float f18 = fArr[33] - fArr[41];
            float sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
            float f19 = fArr[44];
            float f27 = fArr[40];
            float f28 = fArr[45];
            float f29 = fArr[41];
            float abs = (java.lang.Math.abs(m120741xc90e048f(f17, f18, f19 - f27, f28 - f29)) + java.lang.Math.abs(m120741xc90e048f(f17, f18, fArr[36] - f27, fArr[37] - f29))) / (sqrt * sqrt);
            float f37 = fArr[56] - fArr[48];
            float f38 = fArr[57] - fArr[49];
            float sqrt2 = (float) java.lang.Math.sqrt((f37 * f37) + (f38 * f38));
            float f39 = fArr[60];
            float f47 = fArr[56];
            float f48 = fArr[61];
            float f49 = fArr[57];
            return abs + ((java.lang.Math.abs(m120741xc90e048f(f37, f38, f39 - f47, f48 - f49)) + java.lang.Math.abs(m120741xc90e048f(f37, f38, fArr[52] - f47, fArr[53] - f49))) / (sqrt2 * sqrt2));
        }

        /* renamed from: calcMouthScore */
        public static float m120739x78052640(float[] fArr) {
            return java.lang.Math.abs(((fArr[129] + fArr[109]) / 2.0f) - ((fArr[119] + fArr[97]) / 2.0f)) / java.lang.Math.abs(fArr[90] - fArr[102]);
        }

        /* renamed from: convert90PTo5P */
        public static float[] m120740x4a8aa11c(float[] fArr) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i("ProcessHelper", "90 to 5 convert size:" + fArr.length);
            return new float[]{fArr[176], fArr[177], fArr[178], fArr[179], fArr[64], fArr[65], fArr[90], fArr[91], fArr[102], fArr[103]};
        }

        /* renamed from: crossProduct */
        private static float m120741xc90e048f(float f17, float f18, float f19, float f27) {
            return (f17 * f27) - (f19 * f18);
        }

        /* renamed from: preCheckCloseEyeScore */
        public static float m120742x528028d4(float[] fArr) {
            float f17 = fArr[32] - fArr[40];
            float f18 = fArr[33] - fArr[41];
            float sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
            float f19 = fArr[44];
            float f27 = fArr[40];
            float f28 = fArr[45];
            float f29 = fArr[41];
            float abs = (java.lang.Math.abs(m120741xc90e048f(f17, f18, f19 - f27, f28 - f29)) + java.lang.Math.abs(m120741xc90e048f(f17, f18, fArr[36] - f27, fArr[37] - f29))) / (sqrt * sqrt);
            float f37 = fArr[56] - fArr[48];
            float f38 = fArr[57] - fArr[49];
            float sqrt2 = (float) java.lang.Math.sqrt((f37 * f37) + (f38 * f38));
            float f39 = fArr[60];
            float f47 = fArr[56];
            float f48 = fArr[61];
            float f49 = fArr[57];
            float abs2 = (java.lang.Math.abs(m120741xc90e048f(f37, f38, f39 - f47, f48 - f49)) + java.lang.Math.abs(m120741xc90e048f(f37, f38, fArr[52] - f47, fArr[53] - f49))) / (sqrt2 * sqrt2);
            return abs > abs2 ? abs2 : abs;
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon$StateNameHelper */
    /* loaded from: classes14.dex */
    public static class StateNameHelper {

        /* renamed from: _stateNameMap */
        private static java.util.HashMap<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName, java.lang.String> f61742xf395cadf = new java.util.HashMap<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName, java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.1
            {
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.UNKNOWN_STATE, "com.tencent.youtu.sdkkitframework.liveness.Unknown");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.TIMEOUT_STATE, "com.tencent.youtu.sdkkitframework.framework.TimeoutState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.IDLE_STATE, "com.tencent.youtu.sdkkitframework.framework.IdleState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE, "com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.START_CAMERA_RISK_STATE, "com.tencent.youtu.sdkkitframework.liveness.StartCameraRiskState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.ACTION_STATE, "com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECTION_CAMERA_RISK_STATE, "com.tencent.youtu.sdkkitframework.liveness.ReflectionCameraRiskState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECT_STATE, "com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECTION_END_CAMERA_RISK_STATE, "com.tencent.youtu.sdkkitframework.liveness.ReflectionEndCameraRiskState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.OCR_AUTO_DETECT_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrCardAutoDetectState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.OCR_MANUAL_DETECT_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrCardManualDetectState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_FETCH_STATE, "com.tencent.youtu.sdkkitframework.liveness.NetFetchState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE, "com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_OCR_REQ_RESULT_STATE, "com.tencent.youtu.sdkkitframework.ocr.NetOcrReqResultState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.DETECTONLY_STATE, "com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState");
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.OCR_VIID_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrVideoIdentState");
            }
        };

        /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon$StateNameHelper$StateClassName */
        /* loaded from: classes14.dex */
        public enum StateClassName {
            UNKNOWN_STATE,
            TIMEOUT_STATE,
            IDLE_STATE,
            SILENT_STATE,
            ACTION_STATE,
            REFLECT_STATE,
            OCR_AUTO_DETECT_STATE,
            OCR_MANUAL_DETECT_STATE,
            NET_FETCH_STATE,
            NET_LIVENESS_REQ_RESULT_STATE,
            NET_OCR_REQ_RESULT_STATE,
            DETECTONLY_STATE,
            OCR_VIID_STATE,
            STATE_COUNT,
            START_CAMERA_RISK_STATE,
            REFLECTION_CAMERA_RISK_STATE,
            REFLECTION_END_CAMERA_RISK_STATE
        }

        /* renamed from: classNameOfState */
        public static java.lang.String m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName stateClassName) {
            return f61742xf395cadf.get(stateClassName);
        }

        /* renamed from: typeOfClassName */
        public static com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName m120745x9a5b0072(java.lang.String str) {
            for (java.util.Map.Entry<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName, java.lang.String> entry : f61742xf395cadf.entrySet()) {
                if (entry.getValue().equals(str)) {
                    return entry.getKey();
                }
            }
            return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.UNKNOWN_STATE;
        }
    }
}
