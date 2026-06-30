package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.BindCardOrder */
/* loaded from: classes9.dex */
public class C19093x748e2641 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641> f38673x681a0c0c = new at4.m();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f261143d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261144e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261145f;

    /* renamed from: g, reason: collision with root package name */
    public int f261146g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261147h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261148i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261149m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f261150n;

    /* renamed from: o, reason: collision with root package name */
    public int f261151o;

    /* renamed from: p, reason: collision with root package name */
    public int f261152p;

    /* renamed from: q, reason: collision with root package name */
    public at4.u0 f261153q;

    /* renamed from: r, reason: collision with root package name */
    public at4.s0 f261154r;

    /* renamed from: s, reason: collision with root package name */
    public at4.t0 f261155s;

    public C19093x748e2641() {
        this.f261143d = "";
        this.f261144e = "";
        this.f261145f = "";
        this.f261148i = "";
        this.f261149m = "";
        this.f261150n = "";
    }

    public void a(org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2 = jSONObject == null ? "" : jSONObject.toString();
        this.f261143d = jSONObject2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardOrder", "feed json %s", jSONObject2);
        try {
            jSONObject.optInt("show_bind_succ_page", 0);
            this.f261144e = jSONObject.optString("bind_succ_btn_wording", "");
            this.f261145f = jSONObject.optString("bind_succ_remind_wording", "");
            this.f261146g = jSONObject.optInt("jump_type", 0);
            this.f261150n = jSONObject.optString("bind_serial");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("activity_info");
            at4.u0 u0Var = new at4.u0();
            this.f261153q = u0Var;
            if (optJSONObject != null) {
                u0Var.a(optJSONObject);
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("h5_info");
            if (optJSONObject2 != null) {
                at4.s0 s0Var = new at4.s0();
                this.f261154r = s0Var;
                s0Var.a(optJSONObject2);
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("native_info");
            if (optJSONObject3 != null) {
                at4.s0 s0Var2 = new at4.s0();
                this.f261154r = s0Var2;
                s0Var2.a(optJSONObject3);
            }
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("tinyapp_info");
            if (optJSONObject4 != null) {
                at4.t0 t0Var = new at4.t0();
                this.f261155s = t0Var;
                t0Var.a(optJSONObject4);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BindCardOrder", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f261143d);
    }

    public C19093x748e2641(android.os.Parcel parcel) {
        this.f261143d = "";
        this.f261144e = "";
        this.f261145f = "";
        this.f261148i = "";
        this.f261149m = "";
        this.f261150n = "";
        this.f261143d = parcel.readString();
        try {
            a(new org.json.JSONObject(this.f261143d));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BindCardOrder", e17, "", new java.lang.Object[0]);
        }
    }
}
