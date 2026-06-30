package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectionCameraRiskState */
/* loaded from: classes14.dex */
public class C27910x7da4d992 extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c {

    /* renamed from: RISK_STAGE */
    private static final com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName f61988x5b53f96e = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName.stage_reflect;
    private static final java.lang.String TAG = "ReflectionCameraRiskState";

    /* renamed from: prepareTipsDisplaying */
    private boolean f61990xb5333a1f = true;

    /* renamed from: continuousDetectCount */
    private int f61989x908f8d9d = 0;

    /* renamed from: tipsTimer */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27887x52d8cd7b f61991xb82606ed = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27887x52d8cd7b("reflect cp tips timeout counter");

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enter */
    public void mo120689x5c306d8() {
        super.mo120689x5c306d8();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE));
        try {
            this.f61989x908f8d9d = ((java.lang.Integer) m120706x4137e3d.m120725x63c3c5c("continuous_detect_count")).intValue();
            this.f62280x5d20ee80 = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise) m120706x4137e3d.m120725x63c3c5c("pose_state");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "reflection cp enter failed " + e17.getLocalizedMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120568x9e70357b("reflection cp enter failed ", e17);
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName stateClassName = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;
        this.f62279xfcf93909 = stateClassName;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e m121018xd6e87247 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().m121018xd6e87247(f61988x5b53f96e);
        this.f62272x291cb5d1 = m121018xd6e87247;
        if (m121018xd6e87247 == null) {
            this.f62279xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECT_STATE;
            this.f62271x900ef6d1 = false;
            return;
        }
        this.f62271x900ef6d1 = true;
        m120969x3efd8740();
        m120959xac52fff9();
        this.f62278xd7d835ba = true;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(stateClassName)).mo120729x475c0edf("reset_timeout", null);
        this.f61991xb82606ed.m120585x6761d4f();
        try {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61794x2116f291.mo63474xbe543724(0L);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: loadStateWith */
    public void mo120730xc7c4b6b1(java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo120730xc7c4b6b1(str, jSONObject);
        try {
            if (jSONObject.has("reflect_tips_countdown_ms")) {
                this.f61991xb82606ed.m120583x316510(java.lang.Math.max(0, java.lang.Math.min(10000, jSONObject.getInt("reflect_tips_countdown_ms"))), false);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: moveToNextState */
    public void mo120731xb14ae492() {
        if (this.f62279xfcf93909 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120719x424c1dc8(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f62279xfcf93909));
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f62279xfcf93909));
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: reset */
    public void mo120664x6761d4f() {
        this.f61990xb5333a1f = true;
        super.mo120664x6761d4f();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: update */
    public void mo120735xce0038c9(byte[] bArr, int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName stateClassName = this.f62279xfcf93909;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName stateClassName2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;
        if (stateClassName != stateClassName2) {
            mo120731xb14ae492();
            return;
        }
        if (this.f61990xb5333a1f) {
            if (!this.f61991xb82606ed.m120584x39e05d35() || this.f61991xb82606ed.m120582xae11c739()) {
                this.f61991xb82606ed.m120581xae7a2e7a();
                this.f61990xb5333a1f = false;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectionCameraRiskState.2
                    {
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61584xfb5a423a);
                    }
                });
                m120968xb96b15b4(1, f61988x5b53f96e.f62304x6ac9171);
                m120958xa3e458db();
            } else if (this.f61989x908f8d9d <= 1) {
                this.f61991xb82606ed.m120585x6761d4f();
            } else {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectionCameraRiskState.1
                    {
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61587xecc5c7cc);
                    }
                });
            }
            this.f62279xfcf93909 = stateClassName2;
            mo120731xb14ae492();
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise = this.f62280x5d20ee80;
        if (facePreviewingAdvise != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS && facePreviewingAdvise != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
            this.f62279xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.IDLE_STATE;
            m120960xe1a99e42(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61507x4beb4f5b, "检测异常", "");
            mo120731xb14ae492();
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e c27917x3b01cd7e = this.f62272x291cb5d1;
        if (c27917x3b01cd7e.f62289xb0bc3534 < 0 && (c27917x3b01cd7e.f62286xa9fd6102.size() - this.f62284x78ca8393) - this.f62270x1fd8a1bb == 0) {
            m120965x8684a6c(1, f61988x5b53f96e.f62304x6ac9171, this.f62269xed5d29cb);
        }
        if (!m120961x22f9637f()) {
            mo120731xb14ae492();
            return;
        }
        if (this.f62284x78ca8393 >= this.f62272x291cb5d1.f62286xa9fd6102.size()) {
            this.f62279xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECT_STATE;
            int i27 = this.f62272x291cb5d1.f62289xb0bc3534;
            if (i27 >= 0) {
                if (i27 != 0) {
                    try {
                        java.lang.Thread.sleep(java.lang.Math.abs(i27));
                    } catch (java.lang.InterruptedException e17) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, android.util.Log.getStackTraceString(e17));
                    }
                }
                m120965x8684a6c(1, f61988x5b53f96e.f62304x6ac9171, 0L);
            }
        }
        m120962x9efab95a(bArr, i17, i18, j17);
        m120958xa3e458db();
        mo120731xb14ae492();
    }
}
