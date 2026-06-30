package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b
    public java.lang.String b() {
        return "sdk_openAppProfile";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 invokeArgs, l81.b1 appOpenBundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeArgs, "invokeArgs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appOpenBundle, "appOpenBundle");
        try {
            java.lang.String optString = new org.json.JSONObject(invokeArgs.f167093f).optString(dm.i4.f66875xa013b0d5, null);
            if (optString == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b.a(this, invokeArgs, null, null, 6, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.d.a(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.f(optString, appOpenBundle, this, invokeArgs));
            }
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b.a(this, invokeArgs, null, null, 6, null);
        }
    }
}
