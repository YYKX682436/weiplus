package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.StartCameraRiskState */
/* loaded from: classes14.dex */
public class C27913xdc480bb extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c {

    /* renamed from: RISK_STAGE */
    private static final com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName f62077x5b53f96e = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName.stage_start;
    private static final java.lang.String TAG = "StartCameraRiskState";

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enter */
    public void mo120689x5c306d8() {
        super.mo120689x5c306d8();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27916xe222c62c, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName stateClassName = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;
        this.f62279xfcf93909 = stateClassName;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882 m121008x9cf0d20b = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName stageName = f62077x5b53f96e;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e m121018xd6e87247 = m121008x9cf0d20b.m121018xd6e87247(stageName);
        this.f62272x291cb5d1 = m121018xd6e87247;
        if (m121018xd6e87247 == null) {
            this.f62279xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.ACTION_STATE;
            this.f62271x900ef6d1 = false;
            return;
        }
        this.f62271x900ef6d1 = true;
        m120969x3efd8740();
        m120959xac52fff9();
        m120968xb96b15b4(0, stageName.f62304x6ac9171);
        this.f62278xd7d835ba = false;
        m120958xa3e458db();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(stateClassName)).mo120729x475c0edf("reset_timeout", null);
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: moveToNextState */
    public void mo120731xb14ae492() {
        if (this.f62279xfcf93909 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120719x424c1dc8(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f62279xfcf93909));
        } else {
            m120964x439eebfa();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f62279xfcf93909));
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: update */
    public void mo120735xce0038c9(byte[] bArr, int i17, int i18, int i19, long j17) {
        if (this.f62279xfcf93909 != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE) {
            mo120731xb14ae492();
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e c27917x3b01cd7e = this.f62272x291cb5d1;
        if (c27917x3b01cd7e.f62289xb0bc3534 < 0 && (c27917x3b01cd7e.f62286xa9fd6102.size() - this.f62284x78ca8393) - this.f62270x1fd8a1bb == 0) {
            m120965x8684a6c(0, f62077x5b53f96e.f62304x6ac9171, this.f62269xed5d29cb);
        }
        if (!m120961x22f9637f()) {
            mo120731xb14ae492();
            return;
        }
        if (this.f62284x78ca8393 == this.f62272x291cb5d1.f62286xa9fd6102.size()) {
            this.f62279xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.ACTION_STATE;
            int i27 = this.f62272x291cb5d1.f62289xb0bc3534;
            if (i27 >= 0) {
                if (i27 != 0) {
                    try {
                        java.lang.Thread.sleep(i27);
                    } catch (java.lang.InterruptedException e17) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, android.util.Log.getStackTraceString(e17));
                    }
                }
                m120965x8684a6c(0, f62077x5b53f96e.f62304x6ac9171, 0L);
            }
        }
        m120962x9efab95a(bArr, i17, i18, j17);
        m120958xa3e458db();
        mo120731xb14ae492();
    }
}
