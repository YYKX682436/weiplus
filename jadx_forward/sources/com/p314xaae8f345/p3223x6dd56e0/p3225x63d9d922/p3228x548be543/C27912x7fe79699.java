package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState */
/* loaded from: classes14.dex */
public class C27912x7fe79699 extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb {

    /* renamed from: CONTINUOUS_DETECT_COUNT */
    private static final int f61995xc494eb83 = 3;

    /* renamed from: FIX_EYE_MOUTH */
    private static int f61996x3ba1812f = 5;

    /* renamed from: REFINE_CONFIG_OFF */
    private static int f61997xeb30bfe4 = 8197;
    private static final java.lang.String TAG = "SilentLivenessState";

    /* renamed from: cameraRotateState */
    private int f62001xfb6d0391;

    /* renamed from: invalidPointCount */
    private int f62016xb3be0ab6;

    /* renamed from: maskHeightRatio */
    private float f62019x58b3c498;

    /* renamed from: maskWidthRatio */
    private float f62020x52f109f1;

    /* renamed from: previewHeight */
    private int f62040x20e6b0f;

    /* renamed from: previewWidth */
    private int f62041xae5176de;

    /* renamed from: detectAvailableCount */
    private int f62009xbfb24549 = 0;

    /* renamed from: prevAdvise */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise f62038xb9345afb = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NAN;

    /* renamed from: prevJudge */
    private int f62039xccb144a4 = -1;

    /* renamed from: isLoadResourceOnline */
    private boolean f62018x6923d51 = false;

    /* renamed from: resourceDownloadPath */
    private java.lang.String f62044x6b348ffb = "";

    /* renamed from: isFirstStablePass */
    private boolean f62017x8037d232 = false;

    /* renamed from: countdowner */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27887x52d8cd7b f62006x8f9c9a9e = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27887x52d8cd7b("Liveness timeout counter");

    /* renamed from: predetectCountdowner */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27887x52d8cd7b f62037x7b402fb8 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27887x52d8cd7b("Predetect timeout counter");

    /* renamed from: needManualTrigger */
    private boolean f62033xc244a61c = false;

    /* renamed from: eyeOpenThreshold */
    private float f62012x5d06ce90 = 0.22f;

    /* renamed from: needCheckEyeOpen */
    private boolean f62028x611fc9a9 = false;

    /* renamed from: pitchThreshold */
    private int f62035xedfe90b = 30;

    /* renamed from: yawThreshold */
    private int f62055xb7167ebc = 25;

    /* renamed from: rollThreshold */
    private int f62045x872ac06e = 25;

    /* renamed from: blurDetectThreshold */
    private float f62000x71a671a1 = 0.3f;

    /* renamed from: bigfaceThreshold */
    private float f61999x1854a98e = 0.8f;

    /* renamed from: smallfaceThreshold */
    private float f62048x538614e7 = 0.5f;

    /* renamed from: needTimeoutTimer */
    private boolean f62034xc4e8aa1a = false;

    /* renamed from: continueCloseEyeCount */
    private int f62002x16e9620f = 0;

    /* renamed from: sameFaceTipCount */
    private int f62046xadc00237 = 0;

    /* renamed from: triggerLiveBeginEventFlag */
    private boolean f62053x84c6e261 = false;

    /* renamed from: needBigFaceMode */
    private boolean f62027x31eef44a = true;

    /* renamed from: detectIntervalCount */
    private int f62010x61f7d967 = 5;

    /* renamed from: stableCountNum */
    private int f62049xef859852 = 5;

    /* renamed from: maxEyeScore */
    private float f62021x26e4e065 = -1.0E10f;

    /* renamed from: minEyeScore */
    private float f62025xfe841353 = 1.0E10f;

    /* renamed from: maxMouthScore */
    private float f62023x2f850a8f = -1.0E10f;

    /* renamed from: minMouthScore */
    private float f62026x9c2339fd = 1.0E10f;

    /* renamed from: maxInRectRatio */
    private float f62022x4c8e1cde = -1.0E10f;

    /* renamed from: tipFilterFlag */
    private boolean f62052x798399ff = true;

    /* renamed from: inRectThreshold */
    private float f62014xb865f1c2 = 0.7f;

    /* renamed from: maxShelterScore */
    private float f62024x4660dc31 = -1.0E10f;

    /* renamed from: bigFaceThresholdBuffer */
    private float f61998xa01b0f4e = 0.05f;

    /* renamed from: smallFaceThresholdBuffer */
    private float f62047x915ad3e7 = 0.05f;

    /* renamed from: poseThresholdBuffer */
    private float f62036x4c9bf3ba = 0.05f;

    /* renamed from: stableRoiThreshold */
    private float f62051x6f8b6eda = 0.9f;

    /* renamed from: stableFaceCount */
    private int f62050x457b03b7 = 0;

    /* renamed from: unstableCount */
    private int f62054xd7baaa5b = 0;

    /* renamed from: previousFaceRect */
    private android.graphics.Rect f62042xd93565f8 = null;

    /* renamed from: needCheckShelter */
    private boolean f62031x28c1e273 = true;

    /* renamed from: needCheckPose */
    private boolean f62030x3f800dc3 = false;

    /* renamed from: continueNoValidFaceCount */
    private int f62003xe7a33efe = 0;

    /* renamed from: continueNovalidFaceCountThreshold */
    private int f62004x8b87eb2d = 5;

    /* renamed from: intersectRatio */
    float f62015xf9f3562c = -1.0E10f;

    /* renamed from: currentShelterJudge */
    private int f62008xf36fad4b = -1;

    /* renamed from: continueShelterJudgeCount */
    private int f62005x57115d16 = 0;

    /* renamed from: currentAdviseTip */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise f62007x2194fb1a = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS;

    /* renamed from: extraTips */
    private java.lang.String f62011xf0e6d368 = "";

    /* renamed from: frameNum */
    private int f62013x9df376d9 = 0;

    /* renamed from: needCheckMultiFaces */
    private boolean f62029x3229d3af = false;

    /* renamed from: needFaceDirectionDetect */
    private boolean f62032x6695d66f = false;

    /* renamed from: previousShelterJudge */
    private int f62043x23c15dc9 = 0;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$3, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode */
        static final /* synthetic */ int[] f62059x75f35c10;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.m120783xcee59d22().length];
            f62059x75f35c10 = iArr;
            try {
                iArr[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f62059x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f62059x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f62059x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise */
    /* loaded from: classes14.dex */
    public enum FacePreviewingAdvise {
        ADVISE_PASS,
        ADVISE_NO_FACE,
        ADVISE_TOO_FAR,
        ADVISE_TOO_CLOSE,
        ADVISE_NOT_IN_RECT,
        ADVISE_INCORRECT_POSTURE,
        ADVISE_EYE_CLOSE,
        ADVISE_TOO_MANY_FACE,
        ADVISE_INCOMPLETE_FACE,
        ADVISE_INBUFFER_PASS,
        ADVISE_NAN,
        FACE_INSIDE,
        FACE_MOVE_LEFT,
        FACE_MOVE_RIGHT,
        FACE_MOVE_UP,
        FACE_MOVE_DOWN
    }

    /* renamed from: checkBestImage */
    private void m120908xb94b15af(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus, android.graphics.YuvImage yuvImage, float f17) {
        float m120738x7b6a3456 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.ProcessHelper.m120738x7b6a3456(faceStatus.xys);
        float m120739x78052640 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.ProcessHelper.m120739x78052640(faceStatus.xys);
        float f18 = 0.0f;
        int i17 = 0;
        while (true) {
            float[] fArr = faceStatus.f62630x5d4ea43d;
            if (i17 >= fArr.length) {
                break;
            }
            f18 += fArr[i17];
            i17++;
        }
        if (this.f62050x457b03b7 < this.f62049xef859852) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "stable count " + this.f62050x457b03b7);
            return;
        }
        float f19 = this.f62015xf9f3562c;
        if (f19 < this.f62022x4c8e1cde - 0.05d) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "test3 shelter score " + f18 + " inRectThreshold " + this.f62015xf9f3562c + " (" + this.f62022x4c8e1cde + ") eye " + m120738x7b6a3456 + " mouth " + m120739x78052640);
            return;
        }
        this.f62022x4c8e1cde = f19;
        if (this.f62031x28c1e273) {
            if (this.f62024x4660dc31 > f18) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "test1 shelter score " + f18 + " inRectThreshold " + this.f62015xf9f3562c + " eye " + m120738x7b6a3456 + " mouth " + m120739x78052640);
                return;
            }
            this.f62024x4660dc31 = f18;
        }
        java.lang.String str = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "test2 shelter score " + f18 + " inRectThreshold " + this.f62015xf9f3562c + " eye " + m120738x7b6a3456 + " mouth " + m120739x78052640);
        if (m120738x7b6a3456 >= this.f62021x26e4e065 - 0.05d && m120739x78052640 <= java.lang.Math.max(this.f62026x9c2339fd, 15.0f)) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "best shelter score " + f18 + " inRectThreshold " + this.f62015xf9f3562c);
            this.f62021x26e4e065 = m120738x7b6a3456;
            this.f62026x9c2339fd = m120739x78052640;
            this.f61739x83a477db.put("best_image", yuvImage);
            this.f61739x83a477db.put("best_shape", faceStatus.xys);
            this.f61739x83a477db.put("best_face_status", faceStatus);
        }
        if (m120738x7b6a3456 < this.f62025xfe841353) {
            this.f62025xfe841353 = m120738x7b6a3456;
            this.f61739x83a477db.put("closeeye_image", yuvImage);
            this.f61739x83a477db.put("closeeye_shape", faceStatus.xys);
            this.f61739x83a477db.put("closeeye_face_status", faceStatus);
        }
        if (m120739x78052640 > this.f62023x2f850a8f) {
            this.f62023x2f850a8f = m120739x78052640;
            this.f61739x83a477db.put("openmouth_image", yuvImage);
            this.f61739x83a477db.put("openmouth_shape", faceStatus.xys);
            this.f61739x83a477db.put("openmouth_face_status", faceStatus);
        }
    }

    /* renamed from: convertAdvise */
    public static java.lang.String m120909x550d367b(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise) {
        return (facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61584xfb5a423a : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NOT_IN_RECT ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61585xb1de3edd : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_TOO_FAR ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61581x80931aef : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_TOO_CLOSE ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61582x6fa5edcf : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INCORRECT_POSTURE ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61583x274251f0 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NO_FACE ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61574x745f7a2 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_EYE_CLOSE ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61586x4913e2d1 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_LEFT ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61569x640110ec : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_RIGHT ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61570x1c776db7 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_UP ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61571xf24078c0 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_DOWN ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61568x63fd9587 : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61566x44bffbb;
    }

    /* renamed from: faceLocationDetect */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise m120910x2f311275(android.graphics.Rect rect, android.graphics.Rect rect2) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_INSIDE;
        int i17 = rect.left;
        int i18 = rect2.left;
        if (i17 >= i18 && rect.right <= rect2.right && rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
            return facePreviewingAdvise;
        }
        int i19 = ((i17 + rect.right) / 2) - ((i18 + rect2.right) / 2);
        int i27 = ((rect.top + rect.bottom) / 2) - ((rect2.top + rect2.bottom) / 2);
        return (i19 >= 0 || i27 <= 0) ? (i19 <= 0 || i27 >= 0) ? (i19 <= 0 || i27 <= 0) ? (i19 >= 0 || i27 >= 0) ? facePreviewingAdvise : java.lang.Math.abs(i19) > java.lang.Math.abs(i27) ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_RIGHT : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_UP : java.lang.Math.abs(i19) > java.lang.Math.abs(i27) ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_LEFT : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_DOWN : java.lang.Math.abs(i19) > java.lang.Math.abs(i27) ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_LEFT : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_UP : java.lang.Math.abs(i19) > java.lang.Math.abs(i27) ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_RIGHT : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_DOWN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01af, code lost:
    
        if (r11 <= (r9.f61999x1854a98e + r9.f61998xa01b0f4e)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b1, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f3, code lost:
    
        if (r11 >= (r9.f62048x538614e7 - r9.f62047x915ad3e7)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0279, code lost:
    
        if (java.lang.Math.abs(r12.f62631x35807d) <= (r9.f62045x872ac06e + r9.f62036x4c9bf3ba)) goto L42;
     */
    /* renamed from: getFacePreviewAdvise */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise m120911xf13638bd(android.graphics.Rect r10, android.graphics.Rect r11, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus r12) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.m120911xf13638bd(android.graphics.Rect, android.graphics.Rect, com.tencent.youtu.ytfacetrack.YTFaceTrack$FaceStatus):com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise");
    }

    /* renamed from: getFaceRect */
    private android.graphics.Rect m120912x99746b57(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus) {
        float[] fArr = faceStatus.xys;
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = f17;
        float f27 = f19;
        int i17 = 0;
        float f28 = f18;
        while (i17 < 180) {
            f19 = java.lang.Math.min(f19, faceStatus.xys[i17]);
            f27 = java.lang.Math.max(f27, faceStatus.xys[i17]);
            int i18 = i17 + 1;
            f18 = java.lang.Math.min(f18, faceStatus.xys[i18]);
            f28 = java.lang.Math.max(f28, faceStatus.xys[i18]);
            i17 = i18 + 1;
        }
        int i19 = this.f62041xae5176de;
        float f29 = (i19 - 1) - f19;
        float f37 = (float) (((i19 - 1) - f27) - (((f29 - r4) * 0.1d) / 2.0d));
        float f38 = (float) (f29 + (((f29 - f37) * 0.1d) / 2.0d));
        float f39 = (float) (f18 - (((f28 - f18) * 0.1d) / 2.0d));
        float f47 = (float) (f28 + (((f28 - f39) * 0.1d) / 2.0d));
        if (f37 < 0.0f) {
            f37 = 0.0f;
        }
        if (f38 < 0.0f) {
            f38 = 0.0f;
        }
        if (f37 > i19 - 1) {
            f37 = i19 - 1;
        }
        if (f38 > i19 - 1) {
            f38 = i19 - 1;
        }
        if (f39 < 0.0f) {
            f39 = 0.0f;
        }
        if (f47 < 0.0f) {
            f47 = 0.0f;
        }
        int i27 = this.f62040x20e6b0f;
        if (f39 > i27 - 1) {
            f39 = i27 - 1;
        }
        if (f47 > i27 - 1) {
            f47 = i27 - 1;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = (int) f37;
        rect.top = (int) f39;
        rect.right = (int) f38;
        rect.bottom = (int) f47;
        return rect;
    }

    /* renamed from: getPoseJudge */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise m120913x5c100a50(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] faceStatusArr) {
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus = faceStatusArr[0];
        android.graphics.Rect m120912x99746b57 = m120912x99746b57(faceStatus);
        android.graphics.Rect rect = this.f62042xd93565f8;
        if (rect == null) {
            this.f62042xd93565f8 = m120912x99746b57;
            this.f62050x457b03b7 = 0;
        } else {
            android.graphics.Rect m120920xca82f383 = m120920xca82f383(m120912x99746b57, rect);
            if (m120912x99746b57.height() != 0 && m120912x99746b57.width() != 0) {
                float abs = java.lang.Math.abs(((m120920xca82f383.width() * m120920xca82f383.height()) / m120912x99746b57.height()) / m120912x99746b57.width());
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "pose ratio " + abs);
                if (abs < this.f62051x6f8b6eda) {
                    this.f62011xf0e6d368 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61564x600e48d6;
                    this.f62050x457b03b7 = 0;
                } else {
                    this.f62011xf0e6d368 = "";
                    this.f62050x457b03b7++;
                }
            }
            this.f62042xd93565f8 = m120912x99746b57;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "rect is: " + m120912x99746b57.left + ", " + m120912x99746b57.top + ", " + m120912x99746b57.right + ", " + m120912x99746b57.bottom);
        return m120911xf13638bd(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120764x7a47a31d(), m120912x99746b57, faceStatus);
    }

    /* renamed from: getShelterJudge */
    private int m120914xf8309ba8(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] faceStatusArr) {
        int m121262x973e0932 = com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27961xf8ea1f79.m121262x973e0932(faceStatusArr[0].f62630x5d4ea43d);
        if (this.f62008xf36fad4b != m121262x973e0932) {
            this.f62005x57115d16 = 0;
            this.f62008xf36fad4b = m121262x973e0932;
        } else {
            this.f62005x57115d16++;
        }
        if (this.f62013x9df376d9 >= 7 && this.f62005x57115d16 < 7) {
            return this.f62043x23c15dc9;
        }
        this.f62043x23c15dc9 = this.f62008xf36fad4b;
        return m121262x973e0932;
    }

    /* renamed from: initYoutuInstance */
    private void m120915x1d6ff465() {
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121325x26f6c366(new com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.IYtLoggerListener() { // from class: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.1
            @Override // com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.IYtLoggerListener
            public void log(java.lang.String str, java.lang.String str2) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, str2);
            }
        });
        android.content.Context context = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61787xb485b2a7;
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        if (this.f62018x6923d51) {
            absolutePath = this.f62044x6b348ffb;
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "Use online path:" + absolutePath);
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "Use local path:" + absolutePath);
        }
        java.lang.String[] strArr = {"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"};
        if (!this.f62018x6923d51) {
            for (int i17 = 0; i17 < 4; i17++) {
                java.lang.String str = strArr[i17];
                android.content.res.AssetManager assets = context.getAssets();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120573x5817ac7b(assets, "FaceTrackModels/detector/" + str, absolutePath + "/" + str);
            }
        }
        java.lang.String[] strArr2 = {"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"};
        if (!this.f62018x6923d51) {
            for (int i18 = 0; i18 < 5; i18++) {
                java.lang.String str2 = strArr2[i18];
                android.content.res.AssetManager assets2 = context.getAssets();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120573x5817ac7b(assets2, "FaceTrackModels/ufa/" + str2, absolutePath + "/" + str2);
            }
        }
        java.lang.String[] strArr3 = {"rotBasis.bin"};
        if (!this.f62018x6923d51) {
            java.lang.String str3 = strArr3[0];
            android.content.res.AssetManager assets3 = context.getAssets();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120573x5817ac7b(assets3, "FaceTrackModels/poseest/" + str3, absolutePath + "/" + str3);
        }
        int m121314x439d2f73 = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121314x439d2f73(absolutePath + "/");
        if (m121314x439d2f73 != 0) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61521x42fe50da, "模式初始化失败");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(m121314x439d2f73) { // from class: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.2

                /* renamed from: val$r */
                final /* synthetic */ int f62058x6ac87af;

                {
                    this.f62058x6ac87af = m121314x439d2f73;
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61509xe4062eec));
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61509xe4062eec, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61592x3eaf17b8, "Init YTFaceTrack SDK failed with " + m121314x439d2f73));
                }
            });
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27969xf9b91ac0 m121332x27195b9b = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121332x27195b9b();
        m121332x27195b9b.f62641xbec9a8e = f61996x3ba1812f;
        m121332x27195b9b.f62642xc69ba954 = f61997xeb30bfe4;
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121346xef0fc3a7(m121332x27195b9b);
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27970xd3d78872 m121333x527f62f7 = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121333x527f62f7();
        java.lang.String str4 = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str4, "big face mode" + this.f62027x31eef44a);
        m121333x527f62f7.f62654xa05ea21a = this.f62027x31eef44a;
        m121333x527f62f7.f62656xed9596f6 = java.lang.Math.max(java.lang.Math.min(this.f62041xae5176de, this.f62040x20e6b0f) / 5, 40);
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121347x8955fc6b(m121333x527f62f7);
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27971x7d063c3a m121335xaa667d15 = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121335xaa667d15();
        m121335xaa667d15.f62658xb6e86d2d = true;
        m121335xaa667d15.f62657xbfc8b6e1 = this.f62010x61f7d967;
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121348x725ce521(m121335xaa667d15);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str4, "Detect version:" + com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.f62624x782db4b8);
    }

    /* renamed from: isActionStage */
    private boolean m120916x9b162de() {
        return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca() == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE || com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca() == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
    }

    /* renamed from: sendFSMEvent */
    private void m120917x2af1ece2(java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
    }

    /* renamed from: sendFaceStatusUITips */
    private void m120918xdf108503(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise, int i17) {
        int i18;
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS;
        if ((facePreviewingAdvise == facePreviewingAdvise2 || facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && i17 == 0) {
            this.f62009xbfb24549++;
        } else {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
            this.f62009xbfb24549 = 0;
        }
        if (facePreviewingAdvise == this.f62038xb9345afb && i17 == this.f62039xccb144a4) {
            this.f62046xadc00237++;
        } else {
            this.f62046xadc00237 = 0;
        }
        if (this.f62052x798399ff && this.f62046xadc00237 > 3 && this.f62007x2194fb1a == facePreviewingAdvise) {
            return;
        }
        this.f62038xb9345afb = facePreviewingAdvise;
        this.f62039xccb144a4 = i17;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, " tips:" + m120909x550d367b(this.f62007x2194fb1a));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise3 = this.f62007x2194fb1a;
        if (facePreviewingAdvise3 != facePreviewingAdvise2 && facePreviewingAdvise3 != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, m120909x550d367b(facePreviewingAdvise3));
        } else if (i17 == 1) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61576x2413b570);
        } else if (i17 == 2) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61573x744b58f);
        } else if (i17 == 3) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61577xe1e24402);
        } else if (i17 == 4) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61580x44e0fc45);
        } else if (i17 == 5) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61578x749d118);
        } else if (i17 == 6) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61579x5d0f8329);
        } else if (i17 == 7) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61575xc75b789e);
        } else if (i17 == 0 && (i18 = this.f62046xadc00237) > 2 && i18 < 5) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61584xfb5a423a);
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2);
        }
        java.lang.String str = this.f62011xf0e6d368;
        if (str != "") {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61554xef4804b2, str);
        }
        m120917x2af1ece2(hashMap);
    }

    /* renamed from: sendUITipEvent */
    private void m120919xf7578afb(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] faceStatusArr) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        if (faceStatusArr == null) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61574x745f7a2);
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
            this.f62009xbfb24549 = 0;
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NO_FACE;
            this.f62038xb9345afb = facePreviewingAdvise;
            this.f62007x2194fb1a = facePreviewingAdvise;
        } else if (faceStatusArr.length > 1) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61588x8645643a);
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
            hashMap.put("ui_error", "Failed");
            if (this.f62029x3229d3af) {
                this.f62009xbfb24549 = 0;
                this.f62038xb9345afb = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_TOO_MANY_FACE;
            }
            this.f62007x2194fb1a = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_TOO_MANY_FACE;
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise m120913x5c100a50 = m120913x5c100a50(faceStatusArr);
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "advise " + m120913x5c100a50);
            m120918xdf108503(m120913x5c100a50, m120914xf8309ba8(faceStatusArr));
        }
        if (hashMap.size() > 0) {
            m120917x2af1ece2(hashMap);
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enter */
    public void mo120689x5c306d8() {
        super.mo120689x5c306d8();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
        if (this.f62033xc244a61c) {
            this.f62037x7b402fb8.m120586x68ac462();
        } else {
            this.f62006x8f9c9a9e.m120586x68ac462();
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: exit */
    public void mo120724x2fb91e() {
        super.mo120724x2fb91e();
    }

    /* renamed from: getIntersectionRect */
    public android.graphics.Rect m120920xca82f383(android.graphics.Rect rect, android.graphics.Rect rect2) {
        return new android.graphics.Rect(java.lang.Math.max(rect.left, rect2.left), java.lang.Math.max(rect.top, rect2.top), java.lang.Math.min(rect.right, rect2.right), java.lang.Math.min(rect.bottom, rect2.bottom));
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: handleEvent */
    public void mo120728x5797ad52(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        super.mo120728x5797ad52(ytFrameworkFireEventType, obj);
        if (this.f62033xc244a61c) {
            if (ytFrameworkFireEventType == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS) {
                this.f62009xbfb24549 = 0;
                this.f62053x84c6e261 = true;
                m120921x8e440112();
            } else if (ytFrameworkFireEventType == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
                this.f62009xbfb24549 = 0;
                this.f62053x84c6e261 = false;
                this.f62006x8f9c9a9e.m120581xae7a2e7a();
                this.f62037x7b402fb8.m120585x6761d4f();
            }
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: handleStateAction */
    public void mo120729x475c0edf(java.lang.String str, java.lang.Object obj) {
        super.mo120729x475c0edf(str, obj);
        if (!str.equals("reset_timeout")) {
            if (str.equals("reset_manual_trigger")) {
                this.f62053x84c6e261 = false;
                this.f62006x8f9c9a9e.m120581xae7a2e7a();
                return;
            }
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "predetect status:" + this.f62037x7b402fb8.m120584x39e05d35());
        if (this.f62037x7b402fb8.m120584x39e05d35()) {
            return;
        }
        m120921x8e440112();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: loadStateWith */
    public void mo120730xc7c4b6b1(java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo120730xc7c4b6b1(str, jSONObject);
        try {
            if (jSONObject.has("need_face_direction_detect")) {
                this.f62032x6695d66f = jSONObject.getBoolean("need_face_direction_detect");
            }
            if (jSONObject.has("resource_online")) {
                this.f62018x6923d51 = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.f62044x6b348ffb = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("timeout_countdown_ms")) {
                this.f62006x8f9c9a9e.m120583x316510(java.lang.Math.max(0, java.lang.Math.min(30000, jSONObject.getInt("timeout_countdown_ms"))), true);
            }
            if (jSONObject.has("predetect_countdown_ms")) {
                this.f62037x7b402fb8.m120583x316510(jSONObject.getInt("predetect_countdown_ms"), true);
            } else {
                this.f62037x7b402fb8.m120583x316510(25000L, true);
            }
            if (jSONObject.has("same_tips_filter")) {
                this.f62052x798399ff = jSONObject.getBoolean("same_tips_filter");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f62033xc244a61c = jSONObject.getBoolean("manual_trigger");
            }
            this.f62029x3229d3af = jSONObject.optBoolean("need_check_multiface", false);
            mo120737x1b37865f(jSONObject);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
        if (!this.f62018x6923d51) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120577xeb57c8f5("YTAGReflectLiveCheck");
        }
        android.hardware.Camera.Size previewSize = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61788x695aadfe.getParameters().getPreviewSize();
        int i17 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61790x3fe50cbd;
        this.f62001xfb6d0391 = i17;
        if (i17 >= 5) {
            this.f62041xae5176de = previewSize.height;
            this.f62040x20e6b0f = previewSize.width;
        } else {
            this.f62041xae5176de = previewSize.width;
            this.f62040x20e6b0f = previewSize.height;
        }
        this.f62020x52f109f1 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120767x8cded496().width() / this.f62041xae5176de;
        this.f62019x58b3c498 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120767x8cded496().height() / this.f62040x20e6b0f;
        m120915x1d6ff465();
        mo120664x6761d4f();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: moveToNextState */
    public void mo120731xb14ae492() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise2;
        super.mo120731xb14ae492();
        boolean z17 = this.f62033xc244a61c;
        if (!z17 || ((!this.f62030x3f800dc3 || (facePreviewingAdvise2 = this.f62038xb9345afb) == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise2 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && !((this.f62029x3229d3af && this.f62038xb9345afb == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_TOO_MANY_FACE) || (facePreviewingAdvise = this.f62038xb9345afb) == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INCOMPLETE_FACE || facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NO_FACE))) {
            this.f62003xe7a33efe = 0;
        } else {
            int i17 = this.f62003xe7a33efe + 1;
            this.f62003xe7a33efe = i17;
            if (i17 > this.f62004x8b87eb2d) {
                java.lang.String m120909x550d367b = m120909x550d367b(this.f62038xb9345afb);
                java.lang.String m120567xc0aa46c1 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(4194304, m120909x550d367b, "action check failed");
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(4194304, m120909x550d367b);
                java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
                hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9);
                hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61535x8c7929fb);
                hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, 4194304);
                hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61548x750ebf31, 4194304);
                hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, m120567xc0aa46c1);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.IDLE_STATE));
                return;
            }
        }
        if (z17 && this.f62037x7b402fb8.m120582xae11c739()) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "predectcountdowner.checkTimeout(): " + this.f62037x7b402fb8.m120582xae11c739());
            this.f62037x7b402fb8.m120581xae7a2e7a();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61524x21f021e4, "yt_verify_step_timeout");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (this.f62006x8f9c9a9e.m120582xae11c739()) {
            this.f62006x8f9c9a9e.m120581xae7a2e7a();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "liveness timeout");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61524x21f021e4, "yt_verify_step_timeout");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (this.f62033xc244a61c || this.f62017x8037d232 || this.f62009xbfb24549 > this.f62049xef859852) {
            this.f62017x8037d232 = true;
            this.f62037x7b402fb8.m120581xae7a2e7a();
            int i18 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.AnonymousClass3.f62059x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca().ordinal()];
            if (i18 == 1 || i18 == 2) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.ACTION_STATE));
            } else if (i18 == 3) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.START_CAMERA_RISK_STATE));
            } else {
                if (i18 != 4) {
                    return;
                }
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECT_STATE));
            }
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: reset */
    public void mo120664x6761d4f() {
        this.f62038xb9345afb = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NAN;
        this.f62009xbfb24549 = 0;
        this.f62002x16e9620f = 0;
        this.f62013x9df376d9 = 0;
        this.f62053x84c6e261 = false;
        this.f62046xadc00237 = 0;
        this.f62021x26e4e065 = -1.0E10f;
        this.f62026x9c2339fd = 1.0E10f;
        this.f62025xfe841353 = 1.0E10f;
        this.f62023x2f850a8f = -1.0E10f;
        this.f62024x4660dc31 = -1.0E10f;
        this.f62017x8037d232 = false;
        this.f62003xe7a33efe = 0;
        this.f62016xb3be0ab6 = 0;
        this.f62054xd7baaa5b = 0;
        this.f62022x4c8e1cde = -1.0E10f;
        this.f62006x8f9c9a9e.m120581xae7a2e7a();
        this.f62037x7b402fb8.m120581xae7a2e7a();
        this.f62050x457b03b7 = 0;
        this.f62008xf36fad4b = -1;
        this.f62042xd93565f8 = null;
        if (this.f62033xc244a61c) {
            this.f62037x7b402fb8.m120585x6761d4f();
        } else {
            this.f62006x8f9c9a9e.m120585x6761d4f();
        }
        super.mo120664x6761d4f();
    }

    /* renamed from: resetTimeout */
    public void m120921x8e440112() {
        this.f62006x8f9c9a9e.m120585x6761d4f();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: unload */
    public void mo120734xcde7deff() {
        super.mo120734xcde7deff();
        try {
            com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121317x1db61ec4();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "SDK inner bug");
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: update */
    public void mo120735xce0038c9(byte[] bArr, int i17, int i18, int i19, long j17) {
        super.mo120735xce0038c9(bArr, i17, i18, i19, j17);
        if (this.f62006x8f9c9a9e.m120582xae11c739() || (this.f62033xc244a61c && this.f62037x7b402fb8.m120582xae11c739())) {
            mo120731xb14ae492();
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013 m121322x9cf0d20b = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b();
        if (m121322x9cf0d20b == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Tracker is null, please check facetrack init result");
            return;
        }
        this.f62013x9df376d9++;
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage = new com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage();
        yTImage.f62640x6be2dc6 = i17;
        yTImage.f62639xb7389127 = i18;
        float[] fArr = new float[1];
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120562xef0abd8c("detect");
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] m121331x61a75712 = m121322x9cf0d20b.m121331x61a75712(bArr, i17, i18, this.f62001xfb6d0391, true, fArr, yTImage);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120563xc6f9aa7e("detect");
        java.lang.String str = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120564xd5a221d4("detect"));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "Blur score:" + java.util.Arrays.toString(fArr));
        if (m121331x61a75712 != null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "face status count " + m121331x61a75712.length);
            if (m121331x61a75712.length > 1) {
                int i27 = Integer.MIN_VALUE;
                int i28 = 0;
                for (int i29 = 0; i29 < m121331x61a75712.length; i29++) {
                    android.graphics.Rect m120912x99746b57 = m120912x99746b57(m121331x61a75712[i29]);
                    int width = m120912x99746b57.width() * m120912x99746b57.height();
                    if (width >= i27) {
                        i28 = i29;
                        i27 = width;
                    }
                }
                if (i28 != 0) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "Found max face id:" + i28);
                    m121331x61a75712[0] = m121331x61a75712[i28];
                }
            }
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "face status is null");
        }
        m120919xf7578afb(m121331x61a75712);
        this.f61739x83a477db.put("pose_state", this.f62038xb9345afb);
        this.f61739x83a477db.put("shelter_state", java.lang.Integer.valueOf(this.f62039xccb144a4));
        this.f61739x83a477db.put("face_status", m121331x61a75712);
        this.f61739x83a477db.put("continuous_detect_count", java.lang.Integer.valueOf(this.f62009xbfb24549));
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(yTImage.f62638x2eefaa, 17, i18, i17, null);
        this.f61739x83a477db.put("last_face_status", m121331x61a75712);
        this.f61739x83a477db.put("last_frame", yuvImage);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise = this.f62038xb9345afb;
        if (facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
            m120908xb94b15af(m121331x61a75712[0], yuvImage, fArr[0]);
        }
        if (this.f61739x83a477db.get("best_image") != null) {
            boolean z17 = this.f62033xc244a61c;
            if (!z17 || (z17 && this.f62053x84c6e261)) {
                mo120731xb14ae492();
            }
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: updateSDKSetting */
    public void mo120737x1b37865f(org.json.JSONObject jSONObject) {
        try {
            if (jSONObject.has("check_eye_open")) {
                this.f62028x611fc9a9 = jSONObject.getBoolean("check_eye_open");
            }
            if (jSONObject.has("open_eye_threshold")) {
                this.f62012x5d06ce90 = (float) jSONObject.getDouble("open_eye_threshold");
            }
            if (jSONObject.has("pitch_threshold")) {
                this.f62035xedfe90b = jSONObject.getInt("pitch_threshold");
            }
            if (jSONObject.has("yaw_threshold")) {
                this.f62055xb7167ebc = jSONObject.getInt("yaw_threshold");
            }
            if (jSONObject.has("roll_threshold")) {
                this.f62045x872ac06e = jSONObject.getInt("roll_threshold");
            }
            if (jSONObject.has("smallface_ratio_threshold")) {
                this.f62048x538614e7 = (float) jSONObject.getDouble("smallface_ratio_threshold");
            }
            if (jSONObject.has("bigface_ratio_threshold")) {
                this.f61999x1854a98e = (float) jSONObject.getDouble("bigface_ratio_threshold");
            }
            if (jSONObject.has("blur_detect_threshold")) {
                this.f62000x71a671a1 = (float) jSONObject.getDouble("blur_detect_threshold");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.f62027x31eef44a = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("detect_interval")) {
                this.f62010x61f7d967 = jSONObject.getInt("detect_interval");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f62049xef859852 = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120771x2952f084(jSONObject.getInt("net_request_timeout_ms"));
            }
            if (jSONObject.has("force_pose_check")) {
                this.f62030x3f800dc3 = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("novalid_face_count")) {
                this.f62004x8b87eb2d = jSONObject.getInt("novalid_face_count");
            }
            if (jSONObject.has("in_rect_ratio_threshold")) {
                this.f62014xb865f1c2 = (float) jSONObject.getDouble("in_rect_ratio_threshold");
            }
            if (jSONObject.has("need_check_shelter")) {
                this.f62031x28c1e273 = jSONObject.getBoolean("need_check_shelter");
            }
            if (jSONObject.has("stable_roi_threshold")) {
                this.f62051x6f8b6eda = (float) jSONObject.getDouble("stable_roi_threshold");
            }
            this.f61998xa01b0f4e = (float) jSONObject.optDouble("bigface_ratio_buffer", this.f61998xa01b0f4e);
            this.f62047x915ad3e7 = (float) jSONObject.optDouble("smallface_ratio_buffer", this.f62047x915ad3e7);
            this.f62036x4c9bf3ba = (float) jSONObject.optDouble("pose_ratio_buffer", this.f62036x4c9bf3ba);
            this.f62051x6f8b6eda = (float) jSONObject.optDouble("stable_roi_threshold", this.f62051x6f8b6eda);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
    }
}
