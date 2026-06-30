package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState */
/* loaded from: classes14.dex */
public class C27902x88c08258 extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb {
    private static final java.lang.String TAG = "ActionLivenessState";

    /* renamed from: actReflectData */
    private com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3244x2eefaa.C27974x9ac85366 f61795xd4fa1415;

    /* renamed from: actionCurrentIndex */
    private int f61798x89a6302f;

    /* renamed from: actionDataParsed */
    private java.lang.String[] f61799x716cbf31;

    /* renamed from: actionFrameHandler */
    private com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame f61800xcb427273;

    /* renamed from: actionVideoShortenStrategy */
    private int f61802x7cddae13;

    /* renamed from: anchorWidths */
    private java.lang.String f61803xcc5d9e82;

    /* renamed from: currentRotateState */
    private int f61809x3fe50cbd;

    /* renamed from: faceStatus */
    private com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] f61811x224d98af;

    /* renamed from: isReportEncodeVideoError */
    private boolean f61815x5a782821;

    /* renamed from: mOriginParam */
    private com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27971x7d063c3a f61817x104e125a;

    /* renamed from: nextStateName */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName f61822xfcf93909;

    /* renamed from: videoEncoder */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27915x648245ca f61831x976c1821;

    /* renamed from: legitimatePoseVersion */
    private java.lang.String f61816x9a8dd4f2 = "3.5.4";

    /* renamed from: continuousDetectCount */
    private int f61807x908f8d9d = 0;

    /* renamed from: poseState */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise f61824x5d20ee80 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NAN;

    /* renamed from: actionLiveType */
    private int f61801x599baa9c = 1;

    /* renamed from: actionContinuousFailedCount */
    private int f61797xc70b7fad = 0;

    /* renamed from: isActionFinished */
    private boolean f61813x839f9492 = false;

    /* renamed from: isLoadResourceOnline */
    private boolean f61814x6923d51 = false;

    /* renamed from: innerMp4Path */
    private java.lang.String f61812x86573b80 = android.os.Environment.getExternalStorageDirectory().getPath() + "/temp.mp4";

    /* renamed from: securityLevel */
    private int f61829xd4f4bc24 = 1;

    /* renamed from: needLocalConfig */
    private boolean f61820x7029d817 = false;

    /* renamed from: codecSettingBitRate */
    private int f61804x5dd1bcd3 = 2097152;

    /* renamed from: codecSettingFrameRate */
    private int f61805x69777fb3 = 30;

    /* renamed from: codecSettingiFrameInterval */
    private int f61806x4f02343 = 1;

    /* renamed from: extraTips */
    private java.lang.String f61810xf0e6d368 = "";

    /* renamed from: needManualTrigger */
    private boolean f61821xc244a61c = false;

    /* renamed from: poseReadyCount */
    private int f61823x605c89d = 0;

    /* renamed from: stableCountNum */
    private int f61830xef859852 = 5;

    /* renamed from: controlConfig */
    private java.lang.String f61808x191f9aff = "";

    /* renamed from: actReflectUXMode */
    int f61796x9b377871 = 0;

    /* renamed from: needCheckMultiFaces */
    private boolean f61819x3229d3af = false;

    /* renamed from: secondaryYawThreshold */
    private float f61828xb363b650 = 16.0f;

    /* renamed from: secondaryPitchThreshold */
    private float f61826x2cbd8b9f = 18.0f;

    /* renamed from: secondaryRollThreshold */
    private float f61827x14847b5a = 16.0f;

    /* renamed from: secondaryCloseMouthThreshold */
    private float f61825x5993e968 = 0.38f;

    /* renamed from: needActionBestImageRigorous */
    boolean f61818xd60bad65 = false;

    /* renamed from: access$808 */
    public static /* synthetic */ int m120811xbbd79900(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258 c27902x88c08258) {
        int i17 = c27902x88c08258.f61797xc70b7fad;
        c27902x88c08258.f61797xc70b7fad = i17 + 1;
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: changeToNextAction */
    public boolean m120814xf92f5fb4(java.lang.String[] strArr, int i17) {
        java.lang.String str = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "currentIndex: " + i17);
        if (strArr.length == 0) {
            return false;
        }
        this.f61798x89a6302f = i17;
        if (i17 >= strArr.length) {
            return false;
        }
        int parseInt = java.lang.Integer.parseInt(strArr[i17]);
        if (parseInt == 0 || parseInt == 1) {
            this.f61801x599baa9c = 1;
        } else if (parseInt == 2) {
            this.f61801x599baa9c = 2;
        } else if (parseInt == 3) {
            this.f61801x599baa9c = 3;
        } else if (parseInt == 4) {
            this.f61801x599baa9c = 4;
        } else if (parseInt == 5) {
            this.f61801x599baa9c = 5;
        }
        this.f61739x83a477db.put("current_action_type", java.lang.Integer.valueOf(parseInt));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "action check rounds: " + this.f61798x89a6302f + "start check pose: " + this.f61801x599baa9c);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE)).mo120729x475c0edf("reset_timeout", null);
        this.f61823x605c89d = 0;
        return true;
    }

    /* renamed from: clearData */
    private void m120815xb4382b97() {
        this.f61797xc70b7fad = 0;
        this.f61813x839f9492 = false;
        this.f61798x89a6302f = -1;
        this.f61823x605c89d = 0;
        this.f61824x5d20ee80 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NAN;
        m120814xf92f5fb4(this.f61799x716cbf31, (-1) + 1);
        this.f61822xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;
        try {
            this.f61831x976c1821.m120953x6761d4f();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "video error:" + android.util.Log.getStackTraceString(e17));
        }
        m120820x8113d013();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getTipsByPoseType */
    public java.lang.String m120816x9ab76b30(int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61559xcc75bcf6;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61563x6752e4f8;
        }
        if (i17 == 4) {
            return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61565x2cba061f;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61562xaef86602;
        }
        if (i17 == 5) {
            return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61566x44bffbb;
        }
        return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61560xcca2dfa2 + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: makeActionStr */
    public java.lang.String m120817x97ed79cd(java.lang.String[] strArr) {
        java.lang.String str = "";
        for (int i17 = 0; i17 < strArr.length; i17++) {
            int parseInt = java.lang.Integer.parseInt(strArr[i17]);
            if (parseInt == 0 || parseInt == 1) {
                str = str + "blink";
            } else if (parseInt == 2) {
                str = str + "mouth";
            } else if (parseInt == 3) {
                str = str + "node";
            } else if (parseInt == 4) {
                str = str + "shake";
            } else if (parseInt == 5) {
                str = str + "silence";
            }
            if (i17 != strArr.length - 1) {
                str = str + ",";
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: putBestImageAndMoveNextState */
    public void m120818x2ed4c79e(final byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode m120707x7deac1ca = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        if (m120707x7deac1ca != ytSDKKitFrameworkWorkMode) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121353x4b0d2321(new com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectGetBestImage() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.8
                @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectGetBestImage
                /* renamed from: onGetBestImage */
                public void mo120827xc04faea0(byte[] bArr2, int i19, int i27) {
                    if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca() == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE || com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca() == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE) {
                        ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this).f61739x83a477db.put("best_frame", new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca(bArr2, i19, i27));
                    } else {
                        ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this).f61739x83a477db.put("best_frame", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE)).m120725x63c3c5c("best_image"));
                    }
                    byte[] bArr3 = bArr;
                    if (bArr3 != null && bArr3.length > 0) {
                        long time = new java.util.Date().getTime();
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258 c27902x88c08258 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this;
                        ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this).f61739x83a477db.put("config", com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121374x1fc92e02(bArr, c27902x88c08258.m120817x97ed79cd(c27902x88c08258.f61799x716cbf31), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120775x14f51cd8().split("-")[0], java.lang.Long.toString(time)));
                    }
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61822xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
                }
            }, true);
        } else if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca() == ytSDKKitFrameworkWorkMode) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121353x4b0d2321(new com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectGetBestImage() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.9
                @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectGetBestImage
                /* renamed from: onGetBestImage */
                public void mo120827xc04faea0(byte[] bArr2, int i19, int i27) {
                    ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this).f61739x83a477db.put("best_frame", new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca(bArr2, i19, i27));
                    ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this).f61739x83a477db.put("act_reflect_data", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61795xd4fa1415);
                    byte[] bArr3 = bArr;
                    if (bArr3 != null && bArr3.length > 0) {
                        long time = new java.util.Date().getTime();
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258 c27902x88c08258 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this;
                        ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this).f61739x83a477db.put("config", com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121374x1fc92e02(bArr, c27902x88c08258.m120817x97ed79cd(c27902x88c08258.f61799x716cbf31), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120775x14f51cd8().split("-")[0], java.lang.Long.toString(time)));
                    }
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61822xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECTION_CAMERA_RISK_STATE;
                }
            }, true);
        }
    }

    /* renamed from: sendFSMEvent */
    private void m120819x2af1ece2(java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
    }

    /* renamed from: startPose */
    private void m120820x8113d013() {
        this.f61800xcb427273 = new com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.6
            @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame
            /* renamed from: onCanReflect */
            public void mo120821xb41be40c() {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61795xd4fa1415 = com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121351xc391e10b();
            }

            @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame
            /* renamed from: onFailed */
            public void mo120822x428b6afc(int i17, java.lang.String str, java.lang.String str2) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402("pose state " + i17);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "YTPoseDetectInterface.poseDetect.onFailed: " + i17 + " s: " + str);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.m120811xbbd79900(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this);
                int unused = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61797xc70b7fad;
            }

            @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame
            /* renamed from: onRecordingDone */
            public void mo120823x1259974(byte[][] bArr, int i17, int i18) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "收到视频上传通知，帧数：" + bArr.length + " 每帧width：" + i17 + " 每帧height: " + i18);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61831x976c1821.m120952x74ab5961(bArr, i17, i18);
                if (!com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61813x839f9492) {
                    com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121363x6761d4f();
                    return;
                }
                try {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61831x976c1821.m120955x360802();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "encode stop error! " + android.util.Log.getStackTraceString(e17));
                }
                if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61831x976c1821.f62250x6b8f48eb == null) {
                    byte[] m120951xc06781b4 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61831x976c1821.m120951xc06781b4();
                    ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this).f61739x83a477db.put("frames", m120951xc06781b4);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.m120818x2ed4c79e(m120951xc06781b4, i17, i18);
                } else {
                    ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this).f61739x83a477db.put("frames", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61831x976c1821.f62250x6b8f48eb.toString().replace("\n", ""));
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258 c27902x88c08258 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this;
                    c27902x88c08258.f61808x191f9aff = c27902x88c08258.f61831x976c1821.f62254xaf3f8342;
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_FETCH_STATE)).m120736xad515fca("control_config", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61808x191f9aff);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.m120818x2ed4c79e(null, i17, i18);
                }
            }

            @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame
            /* renamed from: onSuccess */
            public void mo120824xe05b4124(int i17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61810xf0e6d368 = "";
                if (i17 == 1) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "Detect pose with sequence " + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61799x716cbf31.length);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258 c27902x88c08258 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this;
                    if (c27902x88c08258.m120814xf92f5fb4(c27902x88c08258.f61799x716cbf31, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61798x89a6302f + 1)) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "start check pose: " + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61801x599baa9c);
                    } else {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "action seq all done");
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61813x839f9492 = true;
                    }
                } else if (i17 == -4) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.w(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "Act failed " + i17);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61810xf0e6d368 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61561x77f6eaa1;
                } else if (i17 == -5) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.w(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "Act failed " + i17);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61810xf0e6d368 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61564x600e48d6;
                } else if (i17 != -1 && i17 != 0) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.w(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "Act failed " + i17);
                }
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402("pose state " + i17);
            }
        };
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121365x68ac462(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61787xb485b2a7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61788x695aadfe, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61789x7d672fb9, new com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectResult() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.7
            @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectResult
            /* renamed from: onFailed */
            public void mo120825x428b6afc(int i17, java.lang.String str, java.lang.String str2) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(i17, "failed to init pose sdk");
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(i17) { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.7.1

                    /* renamed from: val$initR */
                    final /* synthetic */ int f61847x4867ddff;

                    {
                        this.f61847x4867ddff = i17;
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61515xf813166a));
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61515xf813166a, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61592x3eaf17b8, "Init YtPose SDK failed with " + i17));
                    }
                });
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61822xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.IDLE_STATE;
            }

            @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectResult
            /* renamed from: onSuccess */
            public void mo120826xe05b4124() {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.TAG, "start success");
            }
        });
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enter */
    public void mo120689x5c306d8() {
        super.mo120689x5c306d8();
        try {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE));
            this.f61807x908f8d9d = ((java.lang.Integer) m120706x4137e3d.m120725x63c3c5c("continuous_detect_count")).intValue();
            this.f61811x224d98af = (com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[]) m120706x4137e3d.m120725x63c3c5c("face_status");
            this.f61824x5d20ee80 = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise) m120706x4137e3d.m120725x63c3c5c("pose_state");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (m120706x4137e3d2 != null && !this.f61820x7029d817) {
                java.lang.String str = (java.lang.String) m120706x4137e3d2.m120725x63c3c5c("action_data");
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "action data :" + str);
                java.lang.String[] split = str.split(",");
                this.f61799x716cbf31 = split;
                int length = split.length;
                int i17 = this.f61798x89a6302f;
                if (length > i17) {
                    int parseInt = java.lang.Integer.parseInt(split[i17]);
                    if (parseInt == 0 || parseInt == 1) {
                        this.f61801x599baa9c = 1;
                    } else if (parseInt == 2) {
                        this.f61801x599baa9c = 2;
                    } else if (parseInt == 3) {
                        this.f61801x599baa9c = 3;
                    } else if (parseInt == 4) {
                        this.f61801x599baa9c = 4;
                    } else if (parseInt == 5) {
                        this.f61801x599baa9c = 5;
                    }
                    this.f61739x83a477db.put("current_action_type", java.lang.Integer.valueOf(parseInt));
                }
            }
            if (this.f61796x9b377871 == 1) {
                this.f61801x599baa9c = 5;
                this.f61799x716cbf31 = new java.lang.String[]{"5"};
            }
            this.f61739x83a477db.put("action_seq", this.f61799x716cbf31);
            if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca() == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                java.lang.String[] split2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120775x14f51cd8().split("-");
                java.lang.String m120870x97ed79cd = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.m120870x97ed79cd(this.f61799x716cbf31);
                if (m120706x4137e3d2 != null) {
                    com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121387xd1cc5b6b((java.lang.String) m120706x4137e3d2.m120725x63c3c5c("color_data"), split2[0], m120870x97ed79cd);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "action enter failed " + e17.getLocalizedMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120568x9e70357b("action enter failed ", e17);
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE)).mo120729x475c0edf("reset_timeout", null);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_FETCH_STATE));
        if (m120706x4137e3d != null) {
            try {
                java.lang.Object m120725x63c3c5c = m120706x4137e3d.m120725x63c3c5c("video_bitrate");
                if (m120725x63c3c5c != null) {
                    this.f61804x5dd1bcd3 = ((java.lang.Integer) m120725x63c3c5c).intValue();
                }
                java.lang.Object m120725x63c3c5c2 = m120706x4137e3d.m120725x63c3c5c("video_framerate");
                if (m120725x63c3c5c2 != null) {
                    this.f61805x69777fb3 = ((java.lang.Integer) m120725x63c3c5c2).intValue();
                }
                java.lang.Object m120725x63c3c5c3 = m120706x4137e3d.m120725x63c3c5c("video_iframeinterval");
                if (m120725x63c3c5c3 != null) {
                    this.f61806x4f02343 = ((java.lang.Integer) m120725x63c3c5c3).intValue();
                }
                java.lang.String str = (java.lang.String) m120706x4137e3d.m120725x63c3c5c("control_config");
                if (str != null) {
                    this.f61808x191f9aff = str;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "action enter first failed:" + e17.getLocalizedMessage());
            }
        }
        this.f61831x976c1821 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27915x648245ca(this.f61812x86573b80, this.f61804x5dd1bcd3, this.f61805x69777fb3, this.f61806x4f02343, this.f61808x191f9aff);
        if (!android.text.TextUtils.isEmpty(this.f61808x191f9aff)) {
            java.lang.String[] split = this.f61808x191f9aff.split("&");
            if (split.length > 0) {
                for (java.lang.String str2 : split) {
                    java.lang.String[] split2 = str2.split("=");
                    if (split2.length > 1 && split2[0].equals("actref_ux_mode")) {
                        this.f61796x9b377871 = java.lang.Integer.parseInt(split2[1]);
                    }
                    if (split2.length > 1 && split2[0].equals("action_video_shorten_strategy")) {
                        int parseInt = java.lang.Integer.parseInt(split2[1]);
                        this.f61802x7cddae13 = parseInt;
                        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121390xdcf60544("action_video_shorten_strategy", java.lang.String.valueOf(parseInt));
                    }
                }
            }
        }
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27971x7d063c3a c27971x7d063c3a = this.f61817x104e125a;
        c27971x7d063c3a.f62657xbfc8b6e1 = 30;
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121348x725ce521(c27971x7d063c3a);
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: handleEvent */
    public void mo120728x5797ad52(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        super.mo120728x5797ad52(ytFrameworkFireEventType, obj);
        if (this.f61821xc244a61c && ytFrameworkFireEventType == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            m120815xb4382b97();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: loadStateWith */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo120730xc7c4b6b1(java.lang.String r23, org.json.JSONObject r24) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.mo120730xc7c4b6b1(java.lang.String, org.json.JSONObject):void");
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: moveToNextState */
    public void mo120731xb14ae492() {
        super.mo120731xb14ae492();
        if (this.f61822xfcf93909 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120719x424c1dc8(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f61822xfcf93909));
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121348x725ce521(this.f61817x104e125a);
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121366x360802();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f61822xfcf93909));
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: reset */
    public void mo120664x6761d4f() {
        m120815xb4382b97();
        super.mo120664x6761d4f();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: unload */
    public void mo120734xcde7deff() {
        super.mo120734xcde7deff();
        if (com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121358xd7250c55()) {
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121366x360802();
        }
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121362x89dacf62();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27915x648245ca c27915x648245ca = this.f61831x976c1821;
        if (c27915x648245ca != null) {
            c27915x648245ca.m120956xcde7deff();
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: update */
    public void mo120735xce0038c9(byte[] bArr, int i17, int i18, int i19, long j17) {
        int i27;
        int i28;
        super.mo120735xce0038c9(bArr, i17, i18, i19, j17);
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] faceStatusArr = this.f61811x224d98af;
        if (faceStatusArr != null && faceStatusArr.length > 0 && (i27 = this.f61807x908f8d9d) > 0) {
            if (i27 <= 1 || (this.f61819x3229d3af && faceStatusArr.length > 1)) {
                this.f61823x605c89d = this.f61830xef859852;
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121363x6761d4f();
            }
            if (this.f61818xd60bad65 && (((i28 = this.f61801x599baa9c) == 1 || i28 == 2) && (java.lang.Math.abs(this.f61811x224d98af[0].f62629x65bc340) >= this.f61826x2cbd8b9f || java.lang.Math.abs(this.f61811x224d98af[0].yaw) >= this.f61828xb363b650 || java.lang.Math.abs(this.f61811x224d98af[0].f62631x35807d) >= this.f61827x14847b5a))) {
                m120819x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.10
                    {
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61583x274251f0);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
                    }
                });
                mo120731xb14ae492();
                return;
            }
            if (this.f61818xd60bad65 && this.f61801x599baa9c == 1 && com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.ProcessHelper.m120739x78052640(this.f61811x224d98af[0].xys) > this.f61825x5993e968) {
                m120819x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.11
                    {
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61567x1c2592f7);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
                    }
                });
                mo120731xb14ae492();
                return;
            }
            if (this.f61800xcb427273 == null) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "FrameHandle is null, check init first");
                return;
            }
            if (this.f61823x605c89d > this.f61830xef859852 + 10 && !this.f61813x839f9492) {
                m120819x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.12
                    {
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61554xef4804b2, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61810xf0e6d368);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.m120816x9ab76b30(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27902x88c08258.this.f61801x599baa9c));
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2);
                    }
                });
            }
            this.f61823x605c89d++;
            com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus = this.f61811x224d98af[0];
            float[] fArr = faceStatus.xys;
            float[] fArr2 = faceStatus.f62630x5d4ea43d;
            int i29 = this.f61801x599baa9c;
            android.hardware.Camera camera = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61788x695aadfe;
            com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus2 = this.f61811x224d98af[0];
            com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121361x2c993a94(fArr, fArr2, i29, bArr, camera, faceStatus2.f62629x65bc340, faceStatus2.yaw, faceStatus2.f62631x35807d, this.f61800xcb427273, 1);
        }
        mo120731xb14ae492();
    }
}
