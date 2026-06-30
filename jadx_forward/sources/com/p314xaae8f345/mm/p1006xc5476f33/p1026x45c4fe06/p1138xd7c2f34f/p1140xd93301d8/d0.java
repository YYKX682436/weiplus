package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public final class d0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final int f166481d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc f166482e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f166483f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f166484g;

    /* renamed from: h, reason: collision with root package name */
    public final l81.v0 f166485h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f166486i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p f166487m;

    public d0(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc parcel, java.lang.String instanceId, yz5.p pVar, l81.v0 v0Var, boolean z17, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p wxaColdStartMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaColdStartMode, "wxaColdStartMode");
        this.f166481d = i17;
        this.f166482e = parcel;
        this.f166483f = instanceId;
        this.f166484g = pVar;
        this.f166485h = v0Var;
        this.f166486i = z17;
        this.f166487m = wxaColdStartMode;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AppBrandPreRenderColdStartService.Loader-" + this.f166481d;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run()-start, id:");
        sb6.append(this.f166481d);
        sb6.append(", username:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = this.f166482e;
        sb6.append(c12362x460991bc.f166434d);
        sb6.append(", appId:");
        sb6.append(c12362x460991bc.f166435e);
        sb6.append(", versionType:");
        sb6.append(c12362x460991bc.f166437g);
        sb6.append(", instanceId:");
        sb6.append(this.f166483f);
        sb6.append(", path:");
        sb6.append(c12362x460991bc.f166439i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreRenderColdStartService.Loader", sb6.toString());
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.c0(this, null), 2, null);
    }
}
