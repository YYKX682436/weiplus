package com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3245x31c90fad;

/* renamed from: com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager */
/* loaded from: classes14.dex */
public class C27977xc6935612 {
    private static final java.lang.String TAG = "FaceDetectProcess";

    /* renamed from: mCameraRotate */
    public int f62696x5df6f5ed;

    /* renamed from: mIsDetecting */
    public boolean f62699x81321da8 = false;

    /* renamed from: mCamera */
    private android.hardware.Camera f62694xfde5e9f2 = null;

    /* renamed from: mCameraParameters */
    private android.hardware.Camera.Parameters f62695x1cb1417c = null;

    /* renamed from: mDesiredPreviewWidth */
    public int f62698x935c60eb = 640;

    /* renamed from: mDesiredPreviewHeight */
    public int f62697xbe60c2a2 = 480;

    /* renamed from: setCamera */
    private int m121391x6c61a27(android.content.Context context, android.hardware.Camera camera, int i17) {
        this.f62694xfde5e9f2 = camera;
        int i18 = 3;
        int i19 = 0;
        while (i18 > 0) {
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                this.f62695x1cb1417c = parameters;
                this.f62697xbe60c2a2 = parameters.getPreviewSize().height;
                this.f62698x935c60eb = this.f62695x1cb1417c.getPreviewSize().width;
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[PoseDetectProcessManager.setCamera] mDesiredPreviewWidth: " + this.f62698x935c60eb + " mDesiredPreviewHeight: " + this.f62697xbe60c2a2);
                i18 = 0;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[PoseDetectProcessManager.setCamera] failed:" + e17 + " retry " + i18);
                i18 += -1;
                try {
                    java.lang.Thread.sleep(10L);
                } catch (java.lang.InterruptedException e18) {
                    com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "[PoseDetectProcessManager.setCamera] sleep failed:" + e18);
                }
                if (i18 == 0) {
                    i19 = 3;
                }
            }
        }
        return i19;
    }

    /* renamed from: clearAll */
    public void m121392x2f1a8c14() {
        m121396xb618df53();
    }

    /* renamed from: finalize */
    public void m121393xd764dc1e() {
        super.finalize();
    }

    /* renamed from: initAll */
    public void m121394x7420c271() {
    }

    /* renamed from: poseDetect */
    public int m121395x2c993a94(float[] fArr, float[] fArr2, int i17, byte[] bArr, float f17, float f18, float f19, int i18) {
        return com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121384x2c993a94(fArr, fArr2, i17, bArr, this.f62698x935c60eb, this.f62697xbe60c2a2, com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27959xb3654810.m121252xb4f41989(this.f62696x5df6f5ed, 1), f17, f18, f19, i18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: restoreCamera */
    public void m121396xb618df53() {
        android.hardware.Camera.Parameters parameters;
        android.hardware.Camera camera = this.f62694xfde5e9f2;
        if (camera == null || (parameters = this.f62695x1cb1417c) == null) {
            return;
        }
        try {
            try {
                camera.setParameters(parameters);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "restoreCamera failed. ");
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27960xbb5d3374.m121259xc84c5534(e17);
            }
        } finally {
            this.f62694xfde5e9f2 = null;
            this.f62695x1cb1417c = null;
        }
    }

    /* renamed from: start */
    public void m121397x68ac462(android.content.Context context, android.hardware.Camera camera, int i17, com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectResult poseDetectResult) {
        if (this.f62699x81321da8) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121383xc3e74fad(TAG, "Restart FaceDetect process. YTPoseDetectInterface.stop() should be called before the next start, or maybe camera's parameter may be setting wrong.");
        }
        int m121391x6c61a27 = m121391x6c61a27(context, camera, i17);
        if (m121391x6c61a27 != 0) {
            poseDetectResult.mo120825x428b6afc(m121391x6c61a27, "set camera failed", "reset again");
            return;
        }
        this.f62696x5df6f5ed = com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27959xb3654810.m121253x16059c80(context, i17);
        this.f62699x81321da8 = true;
        poseDetectResult.mo120826xe05b4124();
    }

    /* renamed from: stop */
    public void m121398x360802() {
        if (this.f62699x81321da8) {
            this.f62699x81321da8 = false;
            m121396xb618df53();
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121386xb787b8d2();
        }
    }
}
