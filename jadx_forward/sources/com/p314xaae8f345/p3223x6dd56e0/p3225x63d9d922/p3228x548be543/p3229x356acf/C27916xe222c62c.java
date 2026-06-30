package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState */
/* loaded from: classes14.dex */
public class C27916xe222c62c extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb {

    /* renamed from: MESSAGE_NO_REFLECTION_EVENT */
    protected static final int f62261x6683bbcc = 0;

    /* renamed from: MESSAGE_REFLECTION_EVENT */
    protected static final int f62262x9af1eabe = 1;

    /* renamed from: SEND_CAMERA_RISK_END_EVENT */
    protected static final int f62263x7dd8b369 = 3000;

    /* renamed from: SEND_CAMERA_RISK_START_EVENT */
    protected static final int f62264x6e53e0f0 = 2500;

    /* renamed from: SEND_COLOR_FILTER_DELAY_TIME */
    private static final int f62265x9a1d0d9d = 500;

    /* renamed from: SEND_COLOR_FILTER_EVENT */
    protected static final int f62266x37c67c86 = 1500;

    /* renamed from: SEND_HANDLER_CHANGE_CAMERA_PARAMS */
    protected static final int f62267x85f5bcdd = 1000;

    /* renamed from: SEND_REVERT_COLOR_FILTER_EVENT */
    protected static final int f62268xaa2376b3 = 2000;
    private static final java.lang.String TAG = "BaseCameraRiskState";

    /* renamed from: actualDelaySendEndTime */
    protected long f62269xed5d29cb;

    /* renamed from: beforeSendEndCount */
    protected int f62270x1fd8a1bb;

    /* renamed from: currentStateHasRisk */
    protected boolean f62271x900ef6d1;

    /* renamed from: currentStateRiskData */
    protected com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e f62272x291cb5d1;

    /* renamed from: handler */
    protected android.os.Handler f62273x294b574a;

    /* renamed from: handlerThread */
    private android.os.HandlerThread f62274xe30131f4;

    /* renamed from: isCameraRiskChanged */
    protected boolean f62275x353a7076;

    /* renamed from: lastMarkTime */
    protected long f62277xa8249ff0;

    /* renamed from: needRiskStateCheckFaces */
    protected boolean f62278xd7d835ba;

    /* renamed from: nextStateName */
    protected com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName f62279xfcf93909;

    /* renamed from: riskData */
    protected com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData f62281xbef5cf19;

    /* renamed from: runCameraRiskIndex */
    protected int f62284x78ca8393;

    /* renamed from: poseState */
    protected com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise f62280x5d20ee80 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NAN;

    /* renamed from: isFirstJumpNextState */
    boolean f62276xde67f6ca = true;

    /* renamed from: riskImageResizeScale */
    protected float f62283xde7da58a = 2.0f;

    /* renamed from: riskImageResizeQuality */
    protected int f62282xea954d3f = 95;

    /* renamed from: stopHandler */
    private void m120957xdcb740e8() {
        if (this.f62278xd7d835ba) {
            android.os.Handler handler = this.f62273x294b574a;
            if (handler != null) {
                handler.removeMessages(1500);
            }
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61794x2116f291.mo63473xbd8fe55c(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().f62322xddca4ba, 1.0f);
        }
        this.f62273x294b574a = null;
        android.os.HandlerThread handlerThread = this.f62274xe30131f4;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f62274xe30131f4.quitSafely();
    }

    /* renamed from: changeCameraParams */
    public void m120958xa3e458db() {
        if (this.f62284x78ca8393 < this.f62272x291cb5d1.f62286xa9fd6102.size()) {
            java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData> arrayList = this.f62272x291cb5d1.f62286xa9fd6102;
            int i17 = this.f62284x78ca8393;
            this.f62284x78ca8393 = i17 + 1;
            this.f62281xbef5cf19 = arrayList.get(i17);
        }
        if (this.f62281xbef5cf19.f62293xa9fe2aef.equalsIgnoreCase(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.f62305x6781f5ad)) {
            m120964x439eebfa();
            this.f62272x291cb5d1.f62286xa9fd6102.remove(this.f62281xbef5cf19);
        } else {
            this.f62275x353a7076 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().m121014xf5776ebf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120766x76565f86().f61788x695aadfe, this.f62281xbef5cf19);
        }
        this.f62277xa8249ff0 = java.lang.System.currentTimeMillis();
    }

    /* renamed from: computeTimeOffsetNode */
    public void m120959xac52fff9() {
        int i17 = this.f62272x291cb5d1.f62289xb0bc3534;
        if (i17 < 0) {
            int abs = java.lang.Math.abs(i17);
            long j17 = 0;
            for (int size = this.f62272x291cb5d1.f62286xa9fd6102.size() - 1; size >= 0; size--) {
                j17 += this.f62272x291cb5d1.f62286xa9fd6102.get(size).f62297x322db5;
                this.f62270x1fd8a1bb++;
                if (j17 >= abs) {
                    break;
                }
            }
            long j18 = abs;
            this.f62269xed5d29cb = j17 >= j18 ? j17 - j18 : 0L;
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
    }

    /* renamed from: handleFailure */
    public void m120960xe1a99e42(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(str3, "failed :" + ("message:" + str + "\ntips:" + str2 + "\ncode:" + i17));
        java.lang.String m120909x550d367b = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.m120909x550d367b(this.f62280x5d20ee80);
        java.lang.String m120567xc0aa46c1 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61507x4beb4f5b, m120909x550d367b, str);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(i17, m120909x550d367b);
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9);
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61535x8c7929fb);
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61507x4beb4f5b));
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61548x750ebf31, java.lang.Integer.valueOf(i17));
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, m120567xc0aa46c1);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
        m120971xfb96e4cd();
    }

    /* renamed from: isShouldTakeImg */
    public boolean m120961x22f9637f() {
        return (java.lang.System.currentTimeMillis() - this.f62277xa8249ff0 <= this.f62281xbef5cf19.f62297x322db5 && this.f62275x353a7076 && com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().f62321x91a803a9 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.SUCCESS) ? false : true;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: loadStateWith */
    public void mo120730xc7c4b6b1(java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo120730xc7c4b6b1(str, jSONObject);
        try {
            if (jSONObject.has("risk_image_resize_scale")) {
                this.f62283xde7da58a = (float) jSONObject.getDouble("risk_image_resize_scale");
            }
            if (jSONObject.has("risk_image_resize_quality")) {
                this.f62282xea954d3f = jSONObject.getInt("risk_image_resize_quality");
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "action load failed1:" + android.util.Log.getStackTraceString(e17));
        }
    }

    /* renamed from: makeRiskFrameData */
    public void m120962x9efab95a(byte[] bArr, int i17, int i18, long j17) {
        if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().f62321x91a803a9 != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.EnumC27920xf511ab89.SUCCESS) {
            return;
        }
        byte[] m121344x2cf8d95f = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121344x2cf8d95f(bArr, i17, i18, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61790x3fe50cbd);
        if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61790x3fe50cbd > 4) {
            i18 = i17;
            i17 = i18;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, java.lang.String.format("choose frame, now%s-frame%s=delay%sms", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis - j17)));
        this.f62281xbef5cf19.f62292x5faa95b = m120963x2cdff8d4(m121344x2cf8d95f, i17, i18);
        java.lang.String str = this.f62281xbef5cf19.f62292x5faa95b;
        if (str != null && !str.isEmpty()) {
            this.f62281xbef5cf19.f62299x3492916 = j17;
            return;
        }
        m120960xe1a99e42(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61508x29b6e1b9, "检测异常", "");
        m120971xfb96e4cd();
        this.f62279xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.IDLE_STATE;
        mo120731xb14ae492();
    }

    /* renamed from: makeYUVFrameToJPGBase64 */
    public java.lang.String m120963x2cdff8d4(byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca c27890x2eae4aca = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca(bArr, i17, i18);
        try {
            c27890x2eae4aca.f61647x723a620d = c27890x2eae4aca.m120629x12e69300(100);
            float f17 = c27890x2eae4aca.f61648x6be2dc6;
            float f18 = this.f62283xde7da58a;
            c27890x2eae4aca.m120619xc84d9cb4((int) (f17 / f18), (int) (c27890x2eae4aca.f61646xb7389127 / f18), this.f62282xea954d3f);
            return android.util.Base64.encodeToString(c27890x2eae4aca.f61647x723a620d, 2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, android.util.Log.getStackTraceString(e17));
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: reset */
    public void mo120664x6761d4f() {
        super.mo120664x6761d4f();
        this.f62284x78ca8393 = 0;
        this.f62270x1fd8a1bb = 0;
        this.f62269xed5d29cb = 0L;
        this.f62275x353a7076 = false;
        if (this.f62271x900ef6d1) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().m121020x439eebfa();
        }
        this.f62271x900ef6d1 = false;
        m120957xdcb740e8();
    }

    /* renamed from: resetCameraParams */
    public void m120964x439eebfa() {
        if (this.f62276xde67f6ca && this.f62271x900ef6d1) {
            this.f62276xde67f6ca = false;
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().m121020x439eebfa();
        }
    }

    /* renamed from: sendCameraEndEvent */
    public void m120965x8684a6c(int i17, int i18, long j17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 3000;
        obtain.arg1 = i17;
        obtain.arg2 = i18;
        android.os.Handler handler = this.f62273x294b574a;
        if (handler != null) {
            if (j17 != 0) {
                handler.sendMessageDelayed(obtain, j17);
            } else {
                handler.sendMessage(obtain);
            }
        }
    }

    /* renamed from: sendCameraRiskEndEvent */
    public void m120966x61b81bdb(int i17) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61541x590a5325, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
    }

    /* renamed from: sendCameraRiskStartEvent */
    public void m120968xb96b15b4(int i17, int i18) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = f62264x6e53e0f0;
        obtain.arg1 = i17;
        obtain.arg2 = i18;
        android.os.Handler handler = this.f62273x294b574a;
        if (handler == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "error,sendCameraRiskStartEvent handler is null");
            return;
        }
        int i19 = this.f62272x291cb5d1.f62290x8d5ebe3b;
        if (i19 > 0) {
            handler.sendMessageDelayed(obtain, i19);
            return;
        }
        if (i19 == 0) {
            handler.sendMessage(obtain);
            return;
        }
        try {
            handler.sendMessage(obtain);
            java.lang.Thread.sleep(java.lang.Math.abs(this.f62272x291cb5d1.f62290x8d5ebe3b));
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, android.util.Log.getStackTraceString(e17));
        }
    }

    /* renamed from: startCameraRiskThread */
    public void m120969x3efd8740() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("cameraRisk");
        this.f62274xe30131f4 = handlerThread;
        handlerThread.start();
        this.f62273x294b574a = new android.os.Handler(this.f62274xe30131f4.getLooper()) { // from class: com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                int i17 = message.what;
                if (i17 == 1500) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61794x2116f291.mo63473xbd8fe55c(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().m121017x51adc80d(), 1.0f);
                    android.os.Handler handler = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c.this.f62273x294b574a;
                    if (handler != null) {
                        android.os.Message obtainMessage = handler.obtainMessage();
                        obtainMessage.what = 1500;
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c.this.f62273x294b574a.sendMessageDelayed(obtainMessage, 500L);
                        return;
                    }
                    return;
                }
                if (i17 == 2000) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61794x2116f291.mo63473xbd8fe55c(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().f62322xddca4ba, 1.0f);
                    return;
                }
                if (i17 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c.f62264x6e53e0f0) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c.this.m120967xb96b15b4(message.arg2);
                    if (message.arg1 == 1) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c.this.m120970xb865dc6d();
                        return;
                    }
                    return;
                }
                if (i17 != 3000) {
                    return;
                }
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c.this.m120966x61b81bdb(message.arg2);
                if (message.arg1 == 1) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c.this.m120971xfb96e4cd();
                }
            }
        };
    }

    /* renamed from: startReflectionEvent */
    public void m120970xb865dc6d() {
        if (this.f62273x294b574a != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1500;
            this.f62273x294b574a.sendMessage(obtain);
        }
    }

    /* renamed from: stopReflectionEvent */
    public void m120971xfb96e4cd() {
        android.os.Handler handler = this.f62273x294b574a;
        if (handler != null) {
            handler.removeMessages(1500);
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 2000;
            this.f62273x294b574a.sendMessage(obtain);
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: unload */
    public void mo120734xcde7deff() {
        super.mo120734xcde7deff();
        if (this.f62271x900ef6d1) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().m121020x439eebfa();
        }
        m120957xdcb740e8();
    }

    /* renamed from: sendCameraRiskStartEvent */
    public void m120967xb96b15b4(int i17) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61542x408a202c, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
    }
}
