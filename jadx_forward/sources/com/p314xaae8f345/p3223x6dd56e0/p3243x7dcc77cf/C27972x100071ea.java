package com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf;

/* renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface */
/* loaded from: classes14.dex */
public class C27972x100071ea {
    private static final java.lang.String TAG = "YoutuFaceDetect";

    /* renamed from: VERSION */
    public static final java.lang.String f62660x3fc0a8b8 = "3.5.6.4";

    /* renamed from: mCheckResult */
    private static com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectResult f62661xd555c498;

    /* renamed from: mInitModel */
    private static int f62662x6a5b9a0c;

    /* renamed from: mIsStarted */
    private static boolean f62663xe713d20a;

    /* renamed from: mModelRetainCount */
    public static int f62664xca335eae;

    /* renamed from: mPoseDetectProcessManager */
    private static com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 f62665xf241f7f;

    /* renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$PoseDetectGetBestImage */
    /* loaded from: classes6.dex */
    public interface PoseDetectGetBestImage {
        /* renamed from: onGetBestImage */
        void mo120827xc04faea0(byte[] bArr, int i17, int i18);
    }

    /* renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$PoseDetectGetImage */
    /* loaded from: classes6.dex */
    public interface PoseDetectGetImage {
        /* renamed from: onGetImage */
        void m121367x19b272a4(byte[] bArr, int i17, int i18);
    }

    /* renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$PoseDetectLiveType */
    /* loaded from: classes6.dex */
    public interface PoseDetectLiveType {

        /* renamed from: LIVETYPE_BLINK_EYE */
        public static final int f62666x432bd3b5 = 1;

        /* renamed from: LIVETYPE_NOD_HEAD */
        public static final int f62667x1cfa5ff5 = 3;

        /* renamed from: LIVETYPE_OPEN_MOUTH */
        public static final int f62668x5cbe2e2b = 2;

        /* renamed from: LIVETYPE_SHAKE_HEAD */
        public static final int f62669x22254f52 = 4;

        /* renamed from: LIVETYPE_SILENCE */
        public static final int f62670x8bf97b68 = 5;
    }

    /* renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$PoseDetectOnFrame */
    /* loaded from: classes14.dex */
    public interface PoseDetectOnFrame {

        /* renamed from: DETECT_AUTH_FAILED */
        public static final int f62671x50561f18 = 1;

        /* renamed from: DETECT_NOT_CALL_START */
        public static final int f62672xb1044549 = 3;

        /* renamed from: DETECT_NOT_INIT_MODEL */
        public static final int f62673x616e1942 = 2;

        /* renamed from: DETECT_SUCCESS */
        public static final int f62674xcde63a47 = 0;

        /* renamed from: onCanReflect */
        void mo120821xb41be40c();

        /* renamed from: onFailed */
        void mo120822x428b6afc(int i17, java.lang.String str, java.lang.String str2);

        /* renamed from: onRecordingDone */
        void mo120823x1259974(byte[][] bArr, int i17, int i18);

        /* renamed from: onSuccess */
        void mo120824xe05b4124(int i17);
    }

    /* renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$PoseDetectResult */
    /* loaded from: classes14.dex */
    public interface PoseDetectResult {

        /* renamed from: ERROR_AUTH_FAILED */
        public static final int f62675x9ff61edd = 1;

        /* renamed from: ERROR_NOT_INIT_MODEL */
        public static final int f62676x6db3475d = 2;

        /* renamed from: SUCCESS */
        public static final int f62677xbb80cbe3 = 0;

        /* renamed from: onFailed */
        void mo120825x428b6afc(int i17, java.lang.String str, java.lang.String str2);

        /* renamed from: onSuccess */
        void mo120826xe05b4124();
    }

    /* renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$PoseDetectSafetyLevel */
    /* loaded from: classes6.dex */
    public interface PoseDetectSafetyLevel {

        /* renamed from: SAFETY_COUNT */
        public static final int f62678x2f0fe942 = 3;

        /* renamed from: SAFETY_HIGH */
        public static final int f62679xcffa6eef = 2;

        /* renamed from: SAFETY_LOW */
        public static final int f62680x1739b047 = 1;

        /* renamed from: SAFETY_RECOMMAND */
        public static final int f62681xd112406b = 0;
    }

    /* renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$PoseImage */
    /* loaded from: classes6.dex */
    public class PoseImage {

        /* renamed from: data */
        byte[] f62682x2eefaa;

        /* renamed from: height */
        int f62683xb7389127;

        /* renamed from: width */
        int f62685x6be2dc6;

        public PoseImage() {
        }
    }

    /* renamed from: getActReflectData */
    public static com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3244x2eefaa.C27974x9ac85366 m121351xc391e10b() {
        return com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121372xba49673b(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27959xb3654810.m121252xb4f41989(f62665xf241f7f.f62696x5df6f5ed, 1));
    }

    /* renamed from: getBestImage */
    public static void m121353x4b0d2321(com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectGetBestImage poseDetectGetBestImage, boolean z17) {
        int m121252xb4f41989 = z17 ? com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27959xb3654810.m121252xb4f41989(f62665xf241f7f.f62696x5df6f5ed, 1) : 1;
        byte[] m121373x4b0d2321 = com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121373x4b0d2321(m121252xb4f41989);
        if (m121252xb4f41989 != 5 && m121252xb4f41989 != 6 && m121252xb4f41989 != 7 && m121252xb4f41989 != 8) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc6935612 = f62665xf241f7f;
            poseDetectGetBestImage.mo120827xc04faea0(m121373x4b0d2321, c27977xc6935612.f62698x935c60eb, c27977xc6935612.f62697xbe60c2a2);
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc69356122 = f62665xf241f7f;
            poseDetectGetBestImage.mo120827xc04faea0(m121373x4b0d2321, c27977xc69356122.f62697xbe60c2a2, c27977xc69356122.f62698x935c60eb);
        }
    }

    /* renamed from: getEyeImage */
    public static com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27973xbf9e366f m121354x29142320(int i17) {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27973xbf9e366f c27973xbf9e366f = new com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27973xbf9e366f();
        c27973xbf9e366f.f62688x53a2041f = com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121375x29142320(i17);
        if (i17 == 5 || i17 == 6 || i17 == 7 || i17 == 8) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc6935612 = f62665xf241f7f;
            c27973xbf9e366f.f62687x6be2dc6 = c27977xc6935612.f62697xbe60c2a2;
            c27973xbf9e366f.f62686xb7389127 = c27977xc6935612.f62698x935c60eb;
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc69356122 = f62665xf241f7f;
            c27973xbf9e366f.f62687x6be2dc6 = c27977xc69356122.f62698x935c60eb;
            c27973xbf9e366f.f62686xb7389127 = c27977xc69356122.f62697xbe60c2a2;
        }
        return c27973xbf9e366f;
    }

    /* renamed from: getMouthImage */
    public static com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27973xbf9e366f m121355x631e18ca(int i17) {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27973xbf9e366f c27973xbf9e366f = new com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27973xbf9e366f();
        c27973xbf9e366f.f62688x53a2041f = com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121378x631e18ca(i17);
        if (i17 == 5 || i17 == 6 || i17 == 7 || i17 == 8) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc6935612 = f62665xf241f7f;
            c27973xbf9e366f.f62687x6be2dc6 = c27977xc6935612.f62697xbe60c2a2;
            c27973xbf9e366f.f62686xb7389127 = c27977xc6935612.f62698x935c60eb;
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc69356122 = f62665xf241f7f;
            c27973xbf9e366f.f62687x6be2dc6 = c27977xc69356122.f62698x935c60eb;
            c27973xbf9e366f.f62686xb7389127 = c27977xc69356122.f62697xbe60c2a2;
        }
        return c27973xbf9e366f;
    }

    /* renamed from: getVersion */
    public static java.lang.String m121356x52c258a2() {
        return "jar3.5.6.4_native" + com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121379x52c258a2();
    }

    /* renamed from: initModel */
    public static int m121357xefa44ff9() {
        try {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[YTFacePreviewInterface.initModel] ---");
            if (f62662x6a5b9a0c > 0) {
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[YTFacePreviewInterface.initModel] has already inited.");
                f62662x6a5b9a0c++;
                return 0;
            }
            int m121380xefa44ff9 = com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121380xefa44ff9("");
            if (m121380xefa44ff9 != 0) {
                return m121380xefa44ff9;
            }
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc6935612 = new com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612();
            f62665xf241f7f = c27977xc6935612;
            c27977xc6935612.m121394x7420c271();
            f62662x6a5b9a0c++;
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "initModel failed. message: " + e17.getMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27960xbb5d3374.m121259xc84c5534(e17);
            return 10;
        }
    }

    /* renamed from: isDetecting */
    public static boolean m121358xd7250c55() {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc6935612 = f62665xf241f7f;
        return c27977xc6935612 != null && c27977xc6935612.f62699x81321da8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: noticeFailed */
    public static void m121359xe6bc9535(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[YTPoseDetectInterface.noticeFailed] resultCode: " + i17 + " \r\nmessage: " + str + " \r\ntips: " + str2);
        f62665xf241f7f.m121396xb618df53();
        f62661xd555c498.mo120825x428b6afc(i17, str, str2);
        f62661xd555c498 = null;
        f62663xe713d20a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: noticeSuccess */
    public static void m121360xc24f5e0b() {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[YTPoseDetectInterface.noticeSuccess] ---");
        f62661xd555c498.mo120826xe05b4124();
        f62661xd555c498 = null;
        f62663xe713d20a = true;
    }

    /* renamed from: poseDetect */
    public static void m121361x2c993a94(float[] fArr, float[] fArr2, int i17, byte[] bArr, android.hardware.Camera camera, float f17, float f18, float f19, com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame poseDetectOnFrame, int i18) {
        if (f62662x6a5b9a0c <= 0) {
            poseDetectOnFrame.mo120822x428b6afc(2, "Not init model on poseDetect.", "Call YTPoseDetectInterface.initModel() before.");
            return;
        }
        if (!f62663xe713d20a) {
            poseDetectOnFrame.mo120822x428b6afc(3, "Not call start() interface before.", "Call YTPoseDetectInterface.start() before.");
            return;
        }
        poseDetectOnFrame.mo120824xe05b4124(f62665xf241f7f.m121395x2c993a94(fArr, fArr2, i17, bArr, f17, f18, f19, i18));
        if (com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121369xecfe84cd()) {
            poseDetectOnFrame.mo120821xb41be40c();
        }
        if (com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121381x4f560c09()) {
            byte[][] m121376x1fe7c0f5 = com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121376x1fe7c0f5();
            int m121252xb4f41989 = com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27959xb3654810.m121252xb4f41989(f62665xf241f7f.f62696x5df6f5ed, 1);
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[YTPoseDetectInterface.poseDetect] list num: " + m121376x1fe7c0f5.length);
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc6935612 = f62665xf241f7f;
            int i19 = c27977xc6935612.f62698x935c60eb;
            int i27 = c27977xc6935612.f62697xbe60c2a2;
            if (i18 == 1 && (m121252xb4f41989 == 5 || m121252xb4f41989 == 6 || m121252xb4f41989 == 7 || m121252xb4f41989 == 8)) {
                i19 = i27;
                i27 = i19;
            }
            poseDetectOnFrame.mo120823x1259974(m121376x1fe7c0f5, i19, i27);
        }
    }

    /* renamed from: releaseModel */
    public static void m121362x89dacf62() {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[YTFacePreviewInterface.finalize] ---");
        int i17 = f62662x6a5b9a0c - 1;
        f62662x6a5b9a0c = i17;
        if (i17 <= 0) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc6935612 = f62665xf241f7f;
            if (c27977xc6935612 != null) {
                c27977xc6935612.m121392x2f1a8c14();
            }
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121385xa592081a();
            f62662x6a5b9a0c = 0;
        }
    }

    /* renamed from: reset */
    public static void m121363x6761d4f() {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121386xb787b8d2();
    }

    /* renamed from: setSafetyLevel */
    public static void m121364xbd12ba10(int i17) {
        if (i17 < 0 || i17 >= 3) {
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121389xbd12ba10(i17);
    }

    /* renamed from: start */
    public static int m121365x68ac462(android.content.Context context, android.hardware.Camera camera, int i17, com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectResult poseDetectResult) {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[YTPoseDetectInterface.start] ---");
        if (poseDetectResult == null) {
            return -1;
        }
        f62661xd555c498 = poseDetectResult;
        if (f62662x6a5b9a0c > 0) {
            f62665xf241f7f.m121397x68ac462(context, camera, i17, new com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectResult() { // from class: com.tencent.youtu.ytposedetect.YTPoseDetectInterface.1
                @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectResult
                /* renamed from: onFailed */
                public void mo120825x428b6afc(int i18, java.lang.String str, java.lang.String str2) {
                    com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121359xe6bc9535(i18, str, str2);
                }

                @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectResult
                /* renamed from: onSuccess */
                public void mo120826xe05b4124() {
                    com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121360xc24f5e0b();
                }
            });
            return 0;
        }
        m121359xe6bc9535(2, "Not init model.", "Call YTPoseDetectInterface.initModel() before.");
        return 0;
    }

    /* renamed from: stop */
    public static void m121366x360802() {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[YTPoseDetectInterface.stop] ---");
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc6935612 = f62665xf241f7f;
        if (c27977xc6935612 != null) {
            c27977xc6935612.m121398x360802();
        }
        f62663xe713d20a = false;
    }

    /* renamed from: getBestImage */
    public static com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27973xbf9e366f m121352x4b0d2321(int i17) {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27973xbf9e366f c27973xbf9e366f = new com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27973xbf9e366f();
        c27973xbf9e366f.f62688x53a2041f = com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121373x4b0d2321(i17);
        if (i17 != 5 && i17 != 6 && i17 != 7 && i17 != 8) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc6935612 = f62665xf241f7f;
            c27973xbf9e366f.f62687x6be2dc6 = c27977xc6935612.f62698x935c60eb;
            c27973xbf9e366f.f62686xb7389127 = c27977xc6935612.f62697xbe60c2a2;
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad.C27977xc6935612 c27977xc69356122 = f62665xf241f7f;
            c27973xbf9e366f.f62687x6be2dc6 = c27977xc69356122.f62697xbe60c2a2;
            c27973xbf9e366f.f62686xb7389127 = c27977xc69356122.f62698x935c60eb;
        }
        return c27973xbf9e366f;
    }
}
