package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.ECardInfo */
/* loaded from: classes9.dex */
public class C19096xf9c99b43 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43> f38676x681a0c0c = new at4.u();

    /* renamed from: d, reason: collision with root package name */
    public int f261162d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261163e;

    /* renamed from: f, reason: collision with root package name */
    public int f261164f;

    /* renamed from: g, reason: collision with root package name */
    public int f261165g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261166h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261167i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261168m;

    /* renamed from: n, reason: collision with root package name */
    public int f261169n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f261170o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f261171p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f261172q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f261173r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f261174s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f261175t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f261176u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f261177v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f261178w;

    public C19096xf9c99b43() {
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 a() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("upload_reasons");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (optJSONArray != null) {
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        arrayList.add(optJSONArray.optString(i17));
                    }
                }
                if (!jSONObject.has("ecard_info")) {
                    return null;
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("ecard_info");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 c19096xf9c99b43 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43();
                c19096xf9c99b43.f261177v = jSONObject.optString("guide_flag");
                c19096xf9c99b43.f261171p = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                c19096xf9c99b43.f261178w = jSONObject.optString("subtitle");
                c19096xf9c99b43.f261172q = new java.util.ArrayList(arrayList);
                c19096xf9c99b43.f261174s = jSONObject.optString("protocol_url");
                c19096xf9c99b43.f261175t = jSONObject.optString("left_protocol_wording");
                c19096xf9c99b43.f261176u = jSONObject.optString("right_protocol_wording");
                c19096xf9c99b43.f261173r = jSONObject.optString("done_button_wording");
                c19096xf9c99b43.f261162d = optJSONObject.optInt("ecard_open_scene", 0);
                c19096xf9c99b43.f261163e = optJSONObject.optString("ecard_type", "");
                c19096xf9c99b43.f261164f = optJSONObject.optInt("show_check_box", 0);
                c19096xf9c99b43.f261165g = optJSONObject.optInt("check_box_selected", 0);
                c19096xf9c99b43.f261166h = optJSONObject.optString("check_box_left_wording", "");
                c19096xf9c99b43.f261167i = optJSONObject.optString("check_box_right_wording", "");
                c19096xf9c99b43.f261168m = optJSONObject.optString("check_box_url", "");
                c19096xf9c99b43.f261169n = optJSONObject.optInt("is_upload_credid", 0);
                c19096xf9c99b43.f261170o = optJSONObject.optString("upload_credit_url", "");
                return c19096xf9c99b43;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ECardInfo", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public static void b(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, jSONObject.toString());
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, "");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f261162d);
        parcel.writeString(this.f261163e);
        parcel.writeInt(this.f261164f);
        parcel.writeInt(this.f261165g);
        parcel.writeString(this.f261166h);
        parcel.writeString(this.f261167i);
        parcel.writeString(this.f261168m);
        parcel.writeInt(this.f261169n);
        parcel.writeString(this.f261171p);
        parcel.writeStringList(this.f261172q);
        parcel.writeString(this.f261173r);
        parcel.writeString(this.f261174s);
        parcel.writeString(this.f261175t);
        parcel.writeString(this.f261176u);
        parcel.writeString(this.f261177v);
        parcel.writeString(this.f261178w);
    }

    public C19096xf9c99b43(android.os.Parcel parcel) {
        this.f261162d = parcel.readInt();
        this.f261163e = parcel.readString();
        this.f261164f = parcel.readInt();
        this.f261165g = parcel.readInt();
        this.f261166h = parcel.readString();
        this.f261167i = parcel.readString();
        this.f261168m = parcel.readString();
        this.f261169n = parcel.readInt();
        this.f261171p = parcel.readString();
        parcel.readStringList(this.f261172q);
        this.f261173r = parcel.readString();
        this.f261174s = parcel.readString();
        this.f261175t = parcel.readString();
        this.f261176u = parcel.readString();
        this.f261177v = parcel.readString();
        this.f261178w = parcel.readString();
    }
}
