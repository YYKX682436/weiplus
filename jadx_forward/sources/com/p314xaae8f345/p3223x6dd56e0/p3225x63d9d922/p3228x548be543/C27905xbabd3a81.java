package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.FaceQualityForBestImageState */
/* loaded from: classes14.dex */
public class C27905xbabd3a81 extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb {
    private static final java.lang.String TAG = "FaceQualityForBestImageState";

    /* renamed from: continuousCount */
    private int f61865x74701f40;

    /* renamed from: nextStateName */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName f61868xfcf93909;

    /* renamed from: previousFaceRect */
    private android.graphics.Rect f61869xd93565f8 = null;

    /* renamed from: secondaryYawThreshold */
    private float f61873xb363b650 = 16.0f;

    /* renamed from: secondaryPitchThreshold */
    private float f61871x2cbd8b9f = 16.0f;

    /* renamed from: secondaryRollThreshold */
    private float f61872x14847b5a = 16.0f;

    /* renamed from: secondaryCloseMouthThreshold */
    private float f61870x5993e968 = 0.38f;

    /* renamed from: continuousQualityNumThreshold */
    private int f61866x7ebb2295 = 10;

    /* renamed from: needFaceQuality */
    private boolean f61867xf692156c = false;

    /* renamed from: stableRoiThreshold */
    public float f61874x6f8b6eda = 0.98f;

    /* renamed from: convertAdvise */
    public static java.lang.String m120828x550d367b(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise) {
        return (facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61584xfb5a423a : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NOT_IN_RECT ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61585xb1de3edd : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_TOO_FAR ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61581x80931aef : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_TOO_CLOSE ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61582x6fa5edcf : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INCORRECT_POSTURE ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61583x274251f0 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NO_FACE ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61574x745f7a2 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_EYE_CLOSE ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61586x4913e2d1 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_LEFT ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61569x640110ec : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_RIGHT ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61570x1c776db7 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_UP ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61571xf24078c0 : facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.FACE_MOVE_DOWN ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61568x63fd9587 : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61566x44bffbb;
    }

    /* renamed from: detectScreenShaking */
    private boolean m120829x8461b254(android.graphics.Rect rect) {
        android.graphics.Rect m120831xca82f383 = m120831xca82f383(rect, this.f61869xd93565f8);
        float abs = java.lang.Math.abs(((m120831xca82f383.width() * m120831xca82f383.height()) / rect.height()) / rect.width());
        this.f61869xd93565f8 = rect;
        return abs > this.f61874x6f8b6eda;
    }

    /* renamed from: getFaceRect */
    public static android.graphics.Rect m120830x99746b57(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus, int i17, int i18) {
        float[] fArr = faceStatus.xys;
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = f17;
        float f27 = f19;
        int i19 = 0;
        float f28 = f18;
        while (i19 < 180) {
            f19 = java.lang.Math.min(f19, faceStatus.xys[i19]);
            f27 = java.lang.Math.max(f27, faceStatus.xys[i19]);
            int i27 = i19 + 1;
            f18 = java.lang.Math.min(f18, faceStatus.xys[i27]);
            f28 = java.lang.Math.max(f28, faceStatus.xys[i27]);
            i19 = i27 + 1;
        }
        float f29 = i17 - 1;
        float f37 = (float) ((f29 - f27) - (((r13 - r2) * 0.1d) / 2.0d));
        float f38 = (float) ((f29 - f19) + (((r13 - f37) * 0.1d) / 2.0d));
        float f39 = (float) (f18 - (((f28 - f18) * 0.1d) / 2.0d));
        float f47 = (float) (f28 + (((f28 - f39) * 0.1d) / 2.0d));
        if (f37 < 0.0f) {
            f37 = 0.0f;
        }
        if (f38 < 0.0f) {
            f38 = 0.0f;
        }
        if (f37 > f29) {
            f37 = f29;
        }
        if (f38 <= f29) {
            f29 = f38;
        }
        if (f39 < 0.0f) {
            f39 = 0.0f;
        }
        if (f47 < 0.0f) {
            f47 = 0.0f;
        }
        float f48 = i18 - 1;
        if (f39 > f48) {
            f39 = f48;
        }
        if (f47 > f48) {
            f47 = f48;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = (int) f37;
        rect.top = (int) f39;
        rect.right = (int) f29;
        rect.bottom = (int) f47;
        return rect;
    }

    /* renamed from: getIntersectionRect */
    public static android.graphics.Rect m120831xca82f383(android.graphics.Rect rect, android.graphics.Rect rect2) {
        return new android.graphics.Rect(java.lang.Math.max(rect.left, rect2.left), java.lang.Math.max(rect.top, rect2.top), java.lang.Math.min(rect.right, rect2.right), java.lang.Math.min(rect.bottom, rect2.bottom));
    }

    /* renamed from: sendFSMEvent */
    private void m120832x2af1ece2(java.lang.String str, java.lang.String str2) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, str);
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, str2);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
    }

    /* renamed from: convertPrevJudge */
    public java.lang.String m120833x7b960031(int i17) {
        return i17 == 1 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61576x2413b570 : i17 == 2 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61573x744b58f : i17 == 3 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61577xe1e24402 : i17 == 4 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61580x44e0fc45 : i17 == 5 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61578x749d118 : i17 == 6 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61579x5d0f8329 : i17 == 7 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61575xc75b789e : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61566x44bffbb;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enter */
    public void mo120689x5c306d8() {
        super.mo120689x5c306d8();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: loadStateWith */
    public void mo120730xc7c4b6b1(java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo120730xc7c4b6b1(str, jSONObject);
        this.f61868xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;
        try {
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f61873xb363b650 = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f61871x2cbd8b9f = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f61872x14847b5a = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("secondary_close_mouth_threshold")) {
                this.f61870x5993e968 = (float) jSONObject.getDouble("secondary_close_mouth_threshold");
            }
            if (jSONObject.has("continuous_quality_num_threshold")) {
                this.f61866x7ebb2295 = jSONObject.getInt("continuous_quality_num_threshold");
            }
            if (jSONObject.has("need_face_quality")) {
                this.f61867xf692156c = jSONObject.getBoolean("need_face_quality");
            }
            if (jSONObject.has("stable_roi_threshold")) {
                this.f61874x6f8b6eda = (float) jSONObject.getDouble("stable_roi_threshold");
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "get json config error:" + android.util.Log.getStackTraceString(e17));
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: moveToNextState */
    public void mo120731xb14ae492() {
        super.mo120731xb14ae492();
        if (this.f61868xfcf93909 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120719x424c1dc8(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f61868xfcf93909));
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f61868xfcf93909));
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: update */
    public void mo120735xce0038c9(byte[] bArr, int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise;
        super.mo120735xce0038c9(bArr, i17, i18, i19, j17);
        if (!this.f61867xf692156c) {
            this.f61868xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.ACTION_STATE;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName stateClassName = this.f61868xfcf93909;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName stateClassName2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;
        if (stateClassName != stateClassName2) {
            mo120731xb14ae492();
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(stateClassName2));
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus = null;
        try {
            com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] faceStatusArr = (com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[]) m120706x4137e3d.m120725x63c3c5c("face_status");
            if (faceStatusArr != null && faceStatusArr.length != 0) {
                faceStatus = faceStatusArr[0];
                android.graphics.Rect m120830x99746b57 = m120830x99746b57(faceStatus, i17, i18);
                if (this.f61869xd93565f8 == null) {
                    this.f61869xd93565f8 = m120830x99746b57;
                    this.f61865x74701f40 = 0;
                }
                if (!m120829x8461b254(m120830x99746b57)) {
                    m120832x2af1ece2(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61564x600e48d6, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
                    this.f61865x74701f40 = 0;
                    mo120731xb14ae492();
                    return;
                }
                if (java.lang.Math.abs(faceStatus.yaw) < this.f61873xb363b650 && java.lang.Math.abs(faceStatus.f62629x65bc340) < this.f61871x2cbd8b9f && java.lang.Math.abs(faceStatus.f62631x35807d) < this.f61872x14847b5a) {
                    if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.ProcessHelper.m120739x78052640(faceStatus.xys) > this.f61870x5993e968) {
                        this.f61865x74701f40 = 0;
                        m120832x2af1ece2(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61567x1c2592f7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
                        mo120731xb14ae492();
                        return;
                    }
                }
                this.f61865x74701f40 = 0;
                m120832x2af1ece2(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61583x274251f0, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
                mo120731xb14ae492();
                return;
            }
            facePreviewingAdvise = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise) m120706x4137e3d.m120725x63c3c5c("pose_state");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "quality for best image detect get data error:" + android.util.Log.getStackTraceString(e17));
        }
        if (facePreviewingAdvise != null && facePreviewingAdvise != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS && facePreviewingAdvise != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
            this.f61865x74701f40 = 0;
            m120832x2af1ece2(m120828x550d367b(facePreviewingAdvise), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
            mo120731xb14ae492();
            return;
        }
        int intValue = ((java.lang.Integer) m120706x4137e3d.m120725x63c3c5c("shelter_state")).intValue();
        if (intValue != 0) {
            this.f61865x74701f40 = 0;
            m120832x2af1ece2(m120833x7b960031(intValue), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3);
            mo120731xb14ae492();
            return;
        }
        int i27 = this.f61865x74701f40;
        if (i27 <= this.f61866x7ebb2295 || faceStatus == null) {
            this.f61865x74701f40 = i27 + 1;
            m120832x2af1ece2(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61584xfb5a423a, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2);
            mo120731xb14ae492();
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca c27890x2eae4aca = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca();
        c27890x2eae4aca.f61647x723a620d = bArr;
        c27890x2eae4aca.f61648x6be2dc6 = i17;
        c27890x2eae4aca.f61646xb7389127 = i18;
        try {
            c27890x2eae4aca.f61647x723a620d = c27890x2eae4aca.m120629x12e69300(95);
            c27890x2eae4aca.xys = faceStatus.xys;
            this.f61739x83a477db.put("quality_best_image", c27890x2eae4aca);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "quality best img yuv to JPEG error:" + android.util.Log.getStackTraceString(e18));
        }
        this.f61868xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.ACTION_STATE;
        mo120731xb14ae492();
    }
}
