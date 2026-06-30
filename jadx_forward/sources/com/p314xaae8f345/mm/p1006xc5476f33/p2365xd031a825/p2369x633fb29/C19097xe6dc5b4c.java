package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.ElementQuery */
/* loaded from: classes9.dex */
public class C19097xe6dc5b4c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c> f38677x681a0c0c = new at4.v();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f261179J;
    public java.lang.String K;
    public java.util.List L;
    public boolean M;
    public java.lang.String N;
    public int P;
    public java.util.ArrayList Q;
    public boolean R;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f261180d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261181e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261182f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f261183g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f261184h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f261185i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f261186m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f261187n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f261188o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f261189p;

    /* renamed from: q, reason: collision with root package name */
    public int f261190q;

    /* renamed from: r, reason: collision with root package name */
    public int f261191r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f261192s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f261193t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f261194u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f261195v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f261196w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f261197x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f261198y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f261199z;

    public C19097xe6dc5b4c() {
        this.L = null;
        this.R = false;
    }

    public java.util.List a() {
        java.util.List list = this.L;
        if (list != null) {
            return list;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261179J)) {
            return null;
        }
        this.L = new java.util.ArrayList();
        for (java.lang.String str : this.f261179J.split("\\|")) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
            if (P > 0) {
                this.L.add(java.lang.Integer.valueOf(P));
            }
        }
        return this.L;
    }

    public boolean b() {
        return 1 == this.f261191r;
    }

    public boolean c() {
        java.lang.String str = this.f261194u;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return "0".equals(str.trim());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(org.json.JSONObject jSONObject) {
        this.f261181e = jSONObject.optString("bank_name");
        this.f261192s = jSONObject.optString("bank_type");
        this.f261193t = jSONObject.optString("bankacc_type_name");
        this.f261195v = jSONObject.optString("bank_phone");
        this.f261198y = jSONObject.optString("forbid_word");
        this.f261197x = jSONObject.optString("bank_recommend_desc");
        this.f261196w = jSONObject.optString("bank_app_user_name");
        this.f261191r = jSONObject.optInt("bankacc_type", 1);
        this.f261183g = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "canModifyName");
        this.f261184h = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "canModifyCreID");
        this.f261189p = "0".equals(jSONObject.optString("is_sure"));
        this.f261185i = "1".equals(jSONObject.optString("needCVV"));
        this.f261186m = "1".equals(jSONObject.optString("needValiDate"));
        this.f261182f = jSONObject.optString("time_stamp");
        this.f261188o = jSONObject.optString("uesr_name");
        this.f261194u = jSONObject.optString("bank_flag");
        this.f261199z = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needFirstName");
        this.A = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needLastName");
        this.B = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needCountry");
        this.C = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needArea");
        this.D = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needCity");
        this.E = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needAddress");
        this.F = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needZip");
        this.G = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needPhone");
        this.H = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needEmail");
        this.M = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "needShowProtocol");
        this.f261179J = jSONObject.optString("support_cre_type");
        this.f261187n = jSONObject.optString("cre_id");
        int optInt = jSONObject.optInt("bank_card_tag", 1);
        this.I = optInt;
        if (optInt == 1) {
            if (!com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "IsSaveYfq")) {
                this.f261190q = 0;
            } else if (com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "canReturnYfq")) {
                this.f261190q = 4;
            } else {
                this.f261190q = 3;
            }
        } else if (jSONObject.optInt("auth_mode") == 1) {
            this.f261190q = 1;
        } else {
            this.f261190q = 2;
        }
        java.lang.String optString = jSONObject.optString("support_micropay");
        if (android.text.TextUtils.isEmpty(optString)) {
            this.R = true;
        } else if ("1".equals(optString)) {
            this.R = true;
        } else if ("0".equals(optString)) {
            this.R = false;
        }
        this.K = jSONObject.optString("arrive_type");
        this.N = jSONObject.optString("pre_auth_word");
        this.P = jSONObject.optInt("support_foreign_mobile", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("cre_rule_array");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19094x6e1bfd9 c19094x6e1bfd9 = null;
                if (optJSONObject != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19095xa9bd27fa c19095xa9bd27fa = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19095xa9bd27fa();
                    c19095xa9bd27fa.f261160d = optJSONObject.optInt("support_cre_type", 0);
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("cre_need_info");
                    if (optJSONObject2 != null) {
                        c19094x6e1bfd9 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19094x6e1bfd9();
                        c19094x6e1bfd9.f261156d = optJSONObject2.optInt("need_creid_renewal", 0);
                        c19094x6e1bfd9.f261157e = optJSONObject2.optInt("need_birth_date", 0);
                        c19094x6e1bfd9.f261158f = optJSONObject2.optInt("need_cre_expire_date", 0);
                        c19094x6e1bfd9.f261159g = optJSONObject2.optInt("need_show_cre_type", 0);
                    }
                    c19095xa9bd27fa.f261161e = c19094x6e1bfd9;
                    c19094x6e1bfd9 = c19095xa9bd27fa;
                }
                if (c19094x6e1bfd9 != null) {
                    arrayList.add(c19094x6e1bfd9);
                }
            }
        }
        this.Q = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = this.f261180d;
        parcel.writeString(str == null ? "" : str);
        java.lang.String str2 = this.f261181e;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f261182f;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        parcel.writeInt(this.f261183g ? 1 : 0);
        parcel.writeInt(this.f261184h ? 1 : 0);
        parcel.writeInt(this.f261185i ? 1 : 0);
        parcel.writeInt(this.f261186m ? 1 : 0);
        java.lang.String str4 = this.f261188o;
        if (str4 == null) {
            str4 = "";
        }
        parcel.writeString(str4);
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f261189p ? 1 : 0);
        parcel.writeInt(this.f261190q);
        parcel.writeInt(this.f261191r);
        java.lang.String str5 = this.f261192s;
        if (str5 == null) {
            str5 = "";
        }
        parcel.writeString(str5);
        java.lang.String str6 = this.f261193t;
        if (str6 == null) {
            str6 = "";
        }
        parcel.writeString(str6);
        java.lang.String str7 = this.f261194u;
        if (str7 == null) {
            str7 = "";
        }
        parcel.writeString(str7);
        java.lang.String str8 = this.f261195v;
        if (str8 == null) {
            str8 = "";
        }
        parcel.writeString(str8);
        java.lang.String str9 = this.f261198y;
        if (str9 == null) {
            str9 = "";
        }
        parcel.writeString(str9);
        java.lang.String str10 = this.f261197x;
        if (str10 == null) {
            str10 = "";
        }
        parcel.writeString(str10);
        java.lang.String str11 = this.f261196w;
        parcel.writeString(str11 != null ? str11 : "");
        parcel.writeInt(this.f261199z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I);
        parcel.writeString(this.f261179J);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeString(this.K);
        parcel.writeInt(this.M ? 1 : 0);
        parcel.writeString(this.N);
        parcel.writeInt(this.P);
        parcel.writeList(this.Q);
    }

    public C19097xe6dc5b4c(android.os.Parcel parcel) {
        this.L = null;
        this.R = false;
        this.f261180d = parcel.readString();
        this.f261181e = parcel.readString();
        this.f261182f = parcel.readString();
        this.f261183g = 1 == parcel.readInt();
        this.f261184h = 1 == parcel.readInt();
        this.f261185i = 1 == parcel.readInt();
        this.f261186m = 1 == parcel.readInt();
        this.f261188o = parcel.readString();
        this.f261180d = parcel.readString();
        this.f261189p = 1 == parcel.readInt();
        this.f261190q = parcel.readInt();
        this.f261191r = parcel.readInt();
        this.f261192s = parcel.readString();
        this.f261193t = parcel.readString();
        this.f261194u = parcel.readString();
        this.f261195v = parcel.readString();
        this.f261198y = parcel.readString();
        this.f261197x = parcel.readString();
        this.f261196w = parcel.readString();
        this.f261199z = 1 == parcel.readInt();
        this.A = 1 == parcel.readInt();
        this.B = 1 == parcel.readInt();
        this.C = 1 == parcel.readInt();
        this.D = 1 == parcel.readInt();
        this.E = 1 == parcel.readInt();
        this.G = 1 == parcel.readInt();
        this.F = 1 == parcel.readInt();
        this.H = 1 == parcel.readInt();
        this.I = parcel.readInt();
        this.f261179J = parcel.readString();
        this.R = 1 == parcel.readInt();
        this.K = parcel.readString();
        this.M = 1 == parcel.readInt();
        this.N = parcel.readString();
        this.P = parcel.readInt();
        this.Q = parcel.readArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19095xa9bd27fa.class.getClassLoader());
    }
}
