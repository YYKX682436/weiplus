package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166930a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166931b;

    /* renamed from: c, reason: collision with root package name */
    public final int f166932c;

    /* renamed from: d, reason: collision with root package name */
    public final int f166933d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f166934e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f166935f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 f166936g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w4 f166937h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f166938i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p f166939j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f166940k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f166941l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f166942m;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f c12333xba065a6f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w4 w4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = c12333xba065a6f.f165915f;
        this.f166930a = c11809xbc286be4.f128811x;
        this.f166931b = c11809xbc286be4.f158811d;
        this.f166932c = c11809xbc286be4.f128817z;
        this.f166933d = c12333xba065a6f.f165916g.f169323f;
        this.f166934e = c11809xbc286be4.f158816i;
        this.f166935f = c11809xbc286be4.f128814y;
        this.f166936g = c11809xbc286be4.N;
        this.f166937h = w4Var;
        this.f166938i = c11809xbc286be4.f158831k2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be42 = c12333xba065a6f.f165915f;
        this.f166939j = c11809xbc286be42.W1;
        this.f166940k = c11809xbc286be42.f128818z1;
        this.f166942m = false;
        this.f166941l = false;
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = this.f166936g;
        if (c11829x68027553 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "start with NULL WxaVersionInfo, notify NO_UPDATE with username(%s) appId(%s)", this.f166930a, this.f166931b);
            this.f166937h.a(ne1.j.NO_UPDATE, 0, null, null, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "start with WxaVersionInfo.appVersion(%d) username(%s) appId(%s) isWarmLaunch(%b)", java.lang.Integer.valueOf(c11829x68027553.f158977d), this.f166930a, this.f166931b, java.lang.Boolean.valueOf(this.f166941l));
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ContactSilentSyncProcess|%s|%s", this.f166930a, this.f166931b);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s4(this, format), format);
    }

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w4 w4Var) {
        this.f166930a = c11809xbc286be4.f128811x;
        this.f166931b = c11809xbc286be4.f158811d;
        this.f166932c = c11809xbc286be4.f128817z;
        this.f166933d = i17;
        this.f166934e = c11809xbc286be4.f158816i;
        this.f166935f = c11809xbc286be4.f128814y;
        this.f166936g = c11809xbc286be4.N;
        this.f166937h = w4Var;
        this.f166938i = c11809xbc286be4.f158831k2;
        this.f166939j = c11809xbc286be4.W1;
        this.f166940k = c11809xbc286be4.f128818z1;
        this.f166942m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_skip_event_on_warm_attrsync_freq_limit, 0) > 0;
        this.f166941l = true;
    }
}
