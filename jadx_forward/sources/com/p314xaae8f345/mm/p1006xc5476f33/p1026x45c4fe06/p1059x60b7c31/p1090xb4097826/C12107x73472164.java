package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiControlLiveShopShelf$ControlShopShelfTask */
/* loaded from: classes.dex */
class C12107x73472164 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12107x73472164> f34263x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.b();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162683f;

    /* renamed from: g, reason: collision with root package name */
    public final int f162684g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162685h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f162686i;

    public C12107x73472164(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        this.f162683f = e9Var;
        this.f162684g = i17;
        this.f162686i = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        try {
            this.f162686i = new org.json.JSONObject(parcel.readString());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("JsApiControlLiveShopShelf", e17, "parseFromParcel", new java.lang.Object[0]);
            this.f162686i = null;
        }
        this.f162685h = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162686i.toString());
        parcel.writeString(this.f162685h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162683f;
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        java.lang.String str = this.f162685h;
        int i17 = this.f162684g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiControlLiveShopShelf", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", mo48798x74292566, str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(e9Var.mo50262x39e05d35()));
        e9Var.a(i17, this.f162685h);
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        r45.nw1 nw1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiControlLiveShopShelf", "runInMainProcess data = " + this.f162686i.toString());
        java.lang.String liveId = this.f162686i.optString("liveID");
        if (this.f162686i.optBoolean("open")) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            boolean z17 = false;
            java.lang.Long valueOf = (e1Var == null || (nw1Var = e1Var.f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0));
            long Z = pm0.v.Z(liveId);
            if (valueOf != null && Z == valueOf.longValue()) {
                mm2.f6 f6Var = (mm2.f6) efVar.i(mm2.f6.class);
                if (f6Var != null && f6Var.f410568i) {
                    z17 = true;
                }
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                    if (k0Var != null) {
                        k0Var.mo46557x60d69242(qo0.b.f446882f2, null);
                    }
                } else {
                    pm0.v.X(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.u4.f148491d);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveFeatureService", "showShoppingList failed, liveId " + liveId + " does not match current liveId " + valueOf);
            }
        }
        c();
    }

    public C12107x73472164(android.os.Parcel parcel) {
        v(parcel);
    }
}
