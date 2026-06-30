package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.CameraSession */
/* loaded from: classes14.dex */
public interface InterfaceC29748x5948a391 {

    /* renamed from: org.webrtc.CameraSession$CreateSessionCallback */
    /* loaded from: classes14.dex */
    public interface CreateSessionCallback {
        /* renamed from: onDone */
        void mo155291xc3989e01(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391);

        /* renamed from: onFailure */
        void mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType failureType, java.lang.String str);
    }

    /* renamed from: org.webrtc.CameraSession$Events */
    /* loaded from: classes14.dex */
    public interface Events {
        /* renamed from: onCameraClosed */
        void mo155293x21df6c70(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391);

        /* renamed from: onCameraDisconnected */
        void mo155294xfb77e63f(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391);

        /* renamed from: onCameraError */
        void mo155295x95dbd684(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391, java.lang.String str);

        /* renamed from: onCameraOpening */
        void mo155296x9b1d2ad4();

        /* renamed from: onFrameCaptured */
        void mo155297x962f56cc(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391, org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2);
    }

    /* renamed from: org.webrtc.CameraSession$FailureType */
    /* loaded from: classes6.dex */
    public enum FailureType {
        ERROR,
        DISCONNECTED
    }

    /* renamed from: createTextureBufferWithModifiedTransformMatrix */
    static org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer m155321x9f4b7f7f(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db, boolean z17, int i17) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z17) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i17);
        matrix.preTranslate(-0.5f, -0.5f);
        return c29875x346d5db.m156444xf5f3d8ff(matrix, c29875x346d5db.mo155645x755bd410(), c29875x346d5db.mo155641x1c4fb41d());
    }

    /* renamed from: getDeviceOrientation */
    static int m155322x3694d4e4(android.content.Context context) {
        int rotation = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    /* renamed from: stop */
    void mo155197x360802();
}
