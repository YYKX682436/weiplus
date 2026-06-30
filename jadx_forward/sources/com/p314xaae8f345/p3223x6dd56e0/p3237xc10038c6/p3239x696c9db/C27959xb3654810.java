package com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db;

/* renamed from: com.tencent.youtu.ytcommon.tools.YTCameraSetting */
/* loaded from: classes14.dex */
public class C27959xb3654810 {
    private static final java.lang.String TAG = "YTCameraSetting";

    /* renamed from: mCameraFacing */
    public static int f62596x48afe86c = 1;

    /* renamed from: mDesiredPreviewHeight */
    static int f62597xbe60c2a2 = 480;

    /* renamed from: mDesiredPreviewWidth */
    static int f62598x935c60eb = 640;

    /* renamed from: mRotate */
    public static int f62599x18470428;

    /* renamed from: chooseFixedPreviewFps */
    private static int m121247x4606af7e(android.hardware.Camera.Parameters parameters, int i17) {
        int parseInt;
        java.util.Iterator<int[]> it = parameters.getSupportedPreviewFpsRange().iterator();
        while (true) {
            if (!it.hasNext()) {
                int[] iArr = new int[2];
                parameters.getPreviewFpsRange(iArr);
                int i18 = iArr[0];
                int i19 = iArr[1];
                if (i18 != i19) {
                    if (i17 > i19) {
                        i17 = i19;
                    }
                    if (i17 >= i18) {
                        i18 = i17;
                    }
                }
                java.lang.String str = parameters.get("preview-frame-rate-values");
                if (!android.text.TextUtils.isEmpty(str)) {
                    if (!str.contains("" + (i18 / 1000))) {
                        java.lang.String[] split = str.split(",");
                        for (java.lang.String str2 : split) {
                            int parseInt2 = java.lang.Integer.parseInt(str2) * 1000;
                            if (i18 < parseInt2) {
                                parameters.setPreviewFrameRate(parseInt2 / 1000);
                                return parseInt2;
                            }
                        }
                        if (split.length > 0 && i18 > (parseInt = java.lang.Integer.parseInt(split[split.length - 1]) * 1000)) {
                            i18 = parseInt;
                        }
                    }
                }
                parameters.setPreviewFrameRate(i18 / 1000);
                return i18;
            }
            int[] next = it.next();
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "entry: " + next[0] + " - " + next[1]);
            int i27 = next[0];
            int i28 = next[1];
            if (i27 == i28 && i27 == i17) {
                parameters.setPreviewFpsRange(i27, i28);
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "use preview fps range: " + next[0] + " " + next[1]);
                return next[0];
            }
        }
    }

    /* renamed from: getDesiredPreviewHeight */
    public static int m121248x346c30b() {
        return f62597xbe60c2a2;
    }

    /* renamed from: getDesiredPreviewWidth */
    public static int m121249xf02f62() {
        return f62598x935c60eb;
    }

    /* renamed from: getOptimalPreviewSize */
    private static android.hardware.Camera.Size m121250x8a7e7afd(java.util.List<android.hardware.Camera.Size> list, int i17, int i18) {
        android.hardware.Camera.Size size = null;
        if (list == null) {
            return null;
        }
        int max = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        double d17 = max / min;
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "sizes size=" + list.size());
        double d18 = Double.MAX_VALUE;
        double d19 = Double.MAX_VALUE;
        for (android.hardware.Camera.Size size2 : list) {
            if (java.lang.Math.abs((size2.width / size2.height) - d17) <= 0.001d && java.lang.Math.abs(size2.height - min) < d19) {
                d19 = java.lang.Math.abs(size2.height - min);
                size = size2;
            }
        }
        if (size == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "No preview size match the aspect ratio");
            for (android.hardware.Camera.Size size3 : list) {
                if (java.lang.Math.abs(size3.height - min) < d18) {
                    d18 = java.lang.Math.abs(size3.height - min);
                    size = size3;
                }
            }
        }
        return size;
    }

    /* renamed from: getRotate */
    public static int m121251x2df20051(android.content.Context context, int i17, int i18) {
        return m121252xb4f41989(m121253x16059c80(context, i17), i18);
    }

    /* renamed from: getRotateTag */
    public static int m121252xb4f41989(int i17, int i18) {
        int i19;
        if (i17 == 90) {
            i19 = 7;
        } else if (i17 == 180) {
            i19 = 3;
        } else if (i17 == 270) {
            i19 = 5;
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "camera rotate not 90degree or 180degree, input: " + i17);
            i19 = 1;
        }
        return i18 == 1 ? i19 : m121258xbacfaebf(i19);
    }

    /* renamed from: getVideoRotate */
    public static int m121253x16059c80(android.content.Context context, int i17) {
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        android.hardware.Camera.getCameraInfo(i17, cameraInfo);
        int rotation = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i18 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i18 = 90;
            } else if (rotation == 2) {
                i18 = 180;
            } else if (rotation == 3) {
                i18 = 270;
            }
        }
        int i19 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i18) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3)) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 : ((cameraInfo.orientation - i18) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "debug camera orientation is " + cameraInfo.orientation + " ui degrees is " + i18);
        return i19;
    }

    /* renamed from: initCamera */
    public static int m121254xf3140855(android.content.Context context, android.hardware.Camera camera, int i17) {
        android.hardware.Camera.Parameters parameters;
        android.hardware.Camera.Parameters parameters2;
        android.media.CamcorderProfile camcorderProfile;
        try {
            java.util.List<java.lang.String> supportedFocusModes = parameters.getSupportedFocusModes();
            for (int i18 = 0; i18 < supportedFocusModes.size(); i18++) {
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.v(TAG, "suporrtedFocusModes " + i18 + " :" + supportedFocusModes.get(i18));
            }
            if (supportedFocusModes.indexOf("continuous-video") >= 0) {
                parameters.setFocusMode("continuous-video");
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "set camera focus mode continuous video");
            } else if (supportedFocusModes.indexOf("auto") >= 0) {
                parameters.setFocusMode("auto");
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "set camera focus mode auto");
            } else {
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "NOT set camera focus mode");
            }
            try {
                try {
                    camera.setParameters(parameters);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.w(TAG, "Camera.setParameters.setPreviewSize failed!!: " + e17.getLocalizedMessage());
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27960xbb5d3374.m121259xc84c5534(e17);
                }
                int m121253x16059c80 = m121253x16059c80(context, i17);
                camera.setDisplayOrientation(m121253x16059c80);
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "videoOrietation is" + m121253x16059c80);
                if (android.media.CamcorderProfile.hasProfile(i17, 4)) {
                    camcorderProfile = android.media.CamcorderProfile.get(i17, 4);
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "480P camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
                } else if (android.media.CamcorderProfile.hasProfile(i17, 5)) {
                    camcorderProfile = android.media.CamcorderProfile.get(i17, 5);
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "720P camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
                } else {
                    camcorderProfile = android.media.CamcorderProfile.get(i17, 1);
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "High camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
                }
                m121257xab33e4da(parameters2, camcorderProfile);
                parameters2.setPreviewSize(f62598x935c60eb, f62597xbe60c2a2);
                parameters2.setPreviewFormat(17);
                try {
                    camera.setParameters(parameters2);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.w(TAG, "Camera.setParameters.setPreviewSize failed!!: " + e18.getLocalizedMessage());
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27960xbb5d3374.m121259xc84c5534(e18);
                }
                android.hardware.Camera.Parameters parameters3 = camera.getParameters();
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "choose camera fps is : " + m121247x4606af7e(parameters3, 30000));
                try {
                    camera.setParameters(parameters3);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.w(TAG, "Camera.setParameters.preview fps failed!!: " + e19.getLocalizedMessage());
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27960xbb5d3374.m121259xc84c5534(e19);
                }
                android.hardware.Camera.Parameters parameters4 = camera.getParameters();
                int[] iArr = new int[2];
                parameters4.getPreviewFpsRange(iArr);
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "after set parameters getPreviewFpsRange=" + iArr[0] + "-" + iArr[1] + " ;after set parameter fps=" + parameters4.getPreviewFrameRate());
                android.hardware.Camera.Size previewSize = parameters4.getPreviewSize();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("camera preview size is ");
                sb6.append(previewSize.width);
                sb6.append(" ");
                sb6.append(previewSize.height);
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, sb6.toString());
                return 0;
            } finally {
                camera.getParameters();
            }
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.w(TAG, "get camera parameters failed. 1. Check Camera.getParameters() interface. 2. Get logs for more detail.");
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27960xbb5d3374.m121259xc84c5534(e27);
            return 1;
        }
    }

    /* renamed from: setCameraFacing */
    public static void m121255x48565ce1(int i17) {
        f62596x48afe86c = i17;
    }

    /* renamed from: setCameraRotate */
    public static void m121256x5d9d6a62(int i17) {
        f62599x18470428 = i17;
    }

    /* renamed from: setVideoSize */
    public static void m121257xab33e4da(android.hardware.Camera.Parameters parameters, android.media.CamcorderProfile camcorderProfile) {
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (parameters.getSupportedVideoSizes() == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "video size from profile is : " + camcorderProfile.videoFrameWidth + " " + camcorderProfile.videoFrameHeight);
            if (m121250x8a7e7afd(supportedPreviewSizes, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) == null) {
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "do not find proper preview size, use default");
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        java.util.List<android.hardware.Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            boolean z17 = false;
            for (int i17 = 0; i17 < supportedVideoSizes.size(); i17++) {
                android.hardware.Camera.Size size = supportedVideoSizes.get(i17);
                if (size.width == camcorderProfile.videoFrameWidth && size.height == camcorderProfile.videoFrameHeight) {
                    z17 = true;
                }
            }
            if (!z17) {
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "select video size camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
    }

    /* renamed from: transBackFacingCameraRatateTag */
    public static int m121258xbacfaebf(int i17) {
        if (i17 == 1) {
            return 2;
        }
        if (i17 == 2) {
            return 1;
        }
        if (i17 == 3) {
            return 4;
        }
        if (i17 == 4) {
            return 3;
        }
        if (i17 == 5) {
            return 8;
        }
        if (i17 == 6) {
            return 7;
        }
        if (i17 == 7) {
            return 6;
        }
        if (i17 == 8) {
            return 5;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.w(TAG, "[YTCameraSetting.transBackFacingCameraRatateTag] unsurported rotateTag: " + i17);
        return 0;
    }
}
