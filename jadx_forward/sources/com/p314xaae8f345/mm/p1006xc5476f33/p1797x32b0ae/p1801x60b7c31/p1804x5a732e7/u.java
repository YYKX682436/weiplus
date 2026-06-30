package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes14.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("action", "resume");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChangeViewStatus", "Invoke changeViewStatus %s", optString);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(this.f224975e.f380557a);
        if (m65361xd4eb96cf == null) {
            this.f224976f.a("cannot find half screen view");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39 = m65361xd4eb96cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39) m65361xd4eb96cf : null;
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = m65361xd4eb96cf instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 ? (com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063) m65361xd4eb96cf : null;
        if (c16238x79483a39 == null && c3719xb0aa2063 == null) {
            this.f224976f.a("cannot find half screen view");
            return;
        }
        if (c16238x79483a39 != null) {
            if (optString.equals("fullscreen")) {
                if (c16238x79483a39.landscape) {
                    c16238x79483a39.i(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a.f225912e, 300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.b0(c16238x79483a39));
                } else if (c16238x79483a39.enablePullUp) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 m65893xe83cf4fb = c16238x79483a39.m65893xe83cf4fb();
                    if (m65893xe83cf4fb != null) {
                        m65893xe83cf4fb.i();
                    }
                } else if (c16238x79483a39.m65893xe83cf4fb() != null) {
                    c16238x79483a39.m65904x2d986ca5(true);
                    c16238x79483a39.needResetEnablePullUp = true;
                    new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c0(c16238x79483a39));
                }
            } else if (optString.equals("hide")) {
                c16238x79483a39.l();
            } else if (c16238x79483a39.landscape) {
                c16238x79483a39.i(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a.f225913f, 300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.z(c16238x79483a39));
            } else if (c16238x79483a39.needResetEnablePullUp) {
                c16238x79483a39.m65904x2d986ca5(!c16238x79483a39.enablePullUp);
                c16238x79483a39.needResetEnablePullUp = false;
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a0(c16238x79483a39));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 m65893xe83cf4fb2 = c16238x79483a39.m65893xe83cf4fb();
                if (m65893xe83cf4fb2 != null) {
                    m65893xe83cf4fb2.g();
                }
            }
        }
        if (c3719xb0aa2063 != null) {
            if (optString.equals("fullscreen")) {
                p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = c3719xb0aa2063.mo7430x19263085();
                if (mo7430x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) mo7430x19263085).mo65527xc117fe0e();
                }
            } else if (optString.equals("hide")) {
                p012xc85e97e9.p013x9d4bf30f.k mo7430x192630852 = c3719xb0aa2063.mo7430x19263085();
                if (mo7430x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) mo7430x192630852).mo65525x6851f6d2();
                }
            } else {
                p012xc85e97e9.p013x9d4bf30f.k mo7430x192630853 = c3719xb0aa2063.mo7430x19263085();
                if (mo7430x192630853 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) mo7430x192630853).mo65526x831224d4();
                }
            }
        }
        this.f224976f.d(false);
    }
}
