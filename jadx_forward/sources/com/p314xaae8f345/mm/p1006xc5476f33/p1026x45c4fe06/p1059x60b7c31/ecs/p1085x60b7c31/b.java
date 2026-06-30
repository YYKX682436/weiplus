package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31;

/* loaded from: classes7.dex */
public final class b implements c00.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f162323a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 env) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        this.f162323a = env;
    }

    @Override // c00.q3
    /* renamed from: allocTempFile */
    public com.p314xaae8f345.mm.vfs.r6 mo13730x6665a5c5(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = this.f162323a.mo50354x59eafec1();
        if (mo50354x59eafec1 != null) {
            return mo50354x59eafec1.mo49614x6665a5c5(name);
        }
        return null;
    }

    @Override // c00.q3
    /* renamed from: getAbsoluteFilePath */
    public java.lang.String mo13731xbb4d21ce(java.lang.String rawPath) {
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawPath, "rawPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = this.f162323a.mo50354x59eafec1();
        if (mo50354x59eafec1 == null || (mo49620x1d537609 = mo50354x59eafec1.mo49620x1d537609(rawPath)) == null) {
            return null;
        }
        return mo49620x1d537609.o();
    }

    @Override // c00.q3
    /* renamed from: getConfig */
    public org.json.JSONObject mo13732x1456a638() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = this.f162323a.t3().E0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = this.f162323a.t3().u0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sourceAppID", E0.f387375e);
        jSONObject.put("sourceAppName", E0.f387374d);
        jSONObject.put("sourceUsername", u07.f128811x);
        jSONObject.put("sourceVersion", E0.f387385r.f33456x1c82a56c);
        jSONObject.put("sourceBrandIconUrl", E0.f387376f);
        jSONObject.put("sourceMD5", E0.f387385r.f156905md5);
        jSONObject.put("sourcePkgType", E0.f387385r.f156932d);
        jSONObject.put("isHalfScreenApp", this.f162323a.t3().Q0());
        jSONObject.put("enableExpandToStatusBarTop", u07.L1.W);
        return jSONObject;
    }
}
