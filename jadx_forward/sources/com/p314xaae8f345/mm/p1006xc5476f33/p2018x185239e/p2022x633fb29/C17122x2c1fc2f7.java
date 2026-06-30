package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* renamed from: com.tencent.mm.plugin.remittance.model.BusiRemittanceResp */
/* loaded from: classes9.dex */
public class C17122x2c1fc2f7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.C17122x2c1fc2f7> f37802x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c();

    /* renamed from: d, reason: collision with root package name */
    public final int f238288d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f238289e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f238290f;

    /* renamed from: g, reason: collision with root package name */
    public final int f238291g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f238292h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f238293i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f238294m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.wo f238295n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.e77 f238296o;

    /* renamed from: p, reason: collision with root package name */
    public final int f238297p;

    /* renamed from: q, reason: collision with root package name */
    public final int f238298q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f238299r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f238300s;

    /* renamed from: t, reason: collision with root package name */
    public final int f238301t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.mn0 f238302u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f238303v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f238304w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Boolean f238305x;

    public C17122x2c1fc2f7(org.json.JSONObject jSONObject) {
        this.f238288d = 0;
        this.f238289e = "";
        this.f238290f = "";
        this.f238294m = new java.util.LinkedList();
        this.f238297p = 0;
        this.f238298q = 0;
        this.f238301t = 400;
        this.f238288d = jSONObject.optInt("show_photo", 0);
        this.f238289e = jSONObject.optString("photo_url", "");
        this.f238290f = jSONObject.optString("favor_desc", "");
        this.f238291g = jSONObject.optInt("scan_scene", 0);
        this.f238292h = jSONObject.optString("favor_req_sign", "");
        this.f238293i = jSONObject.optString("favor_req_extend", "");
        this.f238299r = jSONObject.optString("paying_rcvr_info", "");
        this.f238300s = jSONObject.optString("succpage_rcvr_info", "");
        this.f238297p = jSONObject.optInt("get_favor_flag", 0);
        this.f238298q = jSONObject.optInt("photo_style", 0);
        this.f238301t = jSONObject.optInt("get_favor_interval", 400);
        this.f238294m = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b.b(jSONObject.optJSONArray("favor_list"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("favor_comm_resp");
        if (optJSONObject != null) {
            r45.wo woVar = new r45.wo();
            this.f238295n = woVar;
            woVar.f470861f = optJSONObject.optString("default_fav_compose_id");
            woVar.f470859d = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b.b(optJSONObject.optJSONArray("favor_info_list"));
            woVar.f470862g = optJSONObject.optString("favor_resp_sign");
            woVar.f470863h = optJSONObject.optString("no_compose_wording");
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("favor_compose_result_list");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    try {
                        org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                        r45.uq0 uq0Var = new r45.uq0();
                        uq0Var.f469097d = jSONObject2.optString("favor_compose_id");
                        uq0Var.f469099f = jSONObject2.optLong("show_favor_amount");
                        uq0Var.f469100g = jSONObject2.optLong("show_pay_amount");
                        uq0Var.f469101h = jSONObject2.optString("total_favor_amount");
                        uq0Var.f469102i = jSONObject2.optString("favor_desc");
                        uq0Var.f469103m = jSONObject2.optLong("compose_sort_flag");
                        uq0Var.f469104n = jSONObject2.optString("extend_str");
                        uq0Var.f469098e = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b.b(jSONObject2.optJSONArray("favor_info_list"));
                        linkedList.add(uq0Var);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiFavorInfoParser", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            woVar.f470860e = linkedList;
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("notice");
        if (optJSONObject2 != null) {
            r45.e77 e77Var = new r45.e77();
            this.f238296o = e77Var;
            e77Var.f454617d = optJSONObject2.optInt("is_show_notice");
            org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("text_info");
            r45.f77 f77Var = new r45.f77();
            optJSONObject3 = optJSONObject3 == null ? new org.json.JSONObject() : optJSONObject3;
            f77Var.f455614d = optJSONObject3.optString("wording");
            org.json.JSONObject optJSONObject4 = optJSONObject3.optJSONObject("jump_info");
            r45.d77 d77Var = new r45.d77();
            optJSONObject4 = optJSONObject4 == null ? new org.json.JSONObject() : optJSONObject4;
            d77Var.f453742d = optJSONObject4.optInt("type");
            d77Var.f453743e = optJSONObject4.optString("url");
            d77Var.f453744f = optJSONObject4.optString(dm.i4.f66875xa013b0d5);
            d77Var.f453745g = optJSONObject4.optString("pagepath");
            f77Var.f455615e = d77Var;
            e77Var.f454618e = f77Var;
            e77Var.f454619f = optJSONObject2.optString("text_color");
            e77Var.f454620g = optJSONObject2.optString("text_dark_color");
            e77Var.f454621h = optJSONObject2.optString("lefticon");
            e77Var.f454622i = optJSONObject2.optString("lefticon_dark");
            e77Var.f454623m = optJSONObject2.optString("righticon");
            e77Var.f454624n = optJSONObject2.optString("righticon_dark");
        }
        org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("extra_buy");
        if (optJSONObject5 != null) {
            r45.mn0 mn0Var = new r45.mn0();
            this.f238302u = mn0Var;
            mn0Var.f462221d = optJSONObject5.optString("select_wording");
            mn0Var.f462222e = optJSONObject5.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            org.json.JSONArray optJSONArray2 = optJSONObject5.optJSONArray("extra_buy_detail_infos");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (optJSONArray2 != null) {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    try {
                        org.json.JSONObject jSONObject3 = optJSONArray2.getJSONObject(i18);
                        r45.ln0 ln0Var = new r45.ln0();
                        ln0Var.f461182d = jSONObject3.optLong("extra_buy_id");
                        ln0Var.f461183e = jSONObject3.optString("extra_buy_name");
                        ln0Var.f461184f = jSONObject3.optLong("good_original_price");
                        ln0Var.f461185g = jSONObject3.optLong("good_add_price");
                        ln0Var.f461186h = jSONObject3.optString("extra_buy_good_name");
                        ln0Var.f461187i = jSONObject3.optString("extra_buy_good_pic");
                        ln0Var.f461188m = jSONObject3.optInt("unavailable");
                        ln0Var.f461189n = jSONObject3.optString("unavailable_reason");
                        ln0Var.f461190o = jSONObject3.optBoolean("selected");
                        linkedList2.add(ln0Var);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiExtraBuyInfoParser", e18, "", new java.lang.Object[0]);
                    }
                }
            }
            mn0Var.f462223f = linkedList2;
        }
        this.f238303v = jSONObject.optString("favor_title");
        this.f238304w = jSONObject.optString("extra_buy_title");
        this.f238305x = java.lang.Boolean.valueOf(jSONObject.optBoolean("enable_union_pay"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f238288d);
        parcel.writeString(this.f238289e);
        parcel.writeString(this.f238290f);
        parcel.writeInt(this.f238291g);
        parcel.writeString(this.f238292h);
        parcel.writeString(this.f238293i);
        parcel.writeInt(this.f238297p);
        parcel.writeInt(this.f238298q);
        parcel.writeString(this.f238299r);
        parcel.writeString(this.f238300s);
        parcel.writeInt(this.f238301t);
        java.util.List list = this.f238294m;
        parcel.writeInt(((java.util.LinkedList) list).size());
        if (((java.util.LinkedList) list).size() > 0) {
            for (int i18 = 0; i18 < ((java.util.LinkedList) list).size(); i18++) {
                byte[] bArr = new byte[0];
                try {
                    bArr = ((r45.vq0) ((java.util.LinkedList) list).get(i18)).mo14344x5f01b1f6();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiRemittanceResp", e17, "", new java.lang.Object[0]);
                }
                parcel.writeInt(bArr.length);
                if (bArr.length > 0) {
                    parcel.writeByteArray(bArr);
                }
            }
        }
        byte[] bArr2 = new byte[0];
        r45.wo woVar = this.f238295n;
        if (woVar != null) {
            try {
                bArr2 = woVar.mo14344x5f01b1f6();
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiRemittanceResp", e18, "", new java.lang.Object[0]);
            }
        }
        parcel.writeInt(bArr2.length);
        if (bArr2.length > 0) {
            parcel.writeByteArray(bArr2);
        }
        byte[] bArr3 = new byte[0];
        r45.e77 e77Var = this.f238296o;
        if (e77Var != null) {
            try {
                bArr3 = e77Var.mo14344x5f01b1f6();
            } catch (java.io.IOException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiRemittanceResp", e19, "", new java.lang.Object[0]);
            }
        }
        parcel.writeInt(bArr3.length);
        if (bArr3.length > 0) {
            parcel.writeByteArray(bArr3);
        }
        byte[] bArr4 = new byte[0];
        r45.mn0 mn0Var = this.f238302u;
        if (mn0Var != null) {
            try {
                bArr4 = mn0Var.mo14344x5f01b1f6();
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiRemittanceResp", e27, "", new java.lang.Object[0]);
            }
        }
        parcel.writeInt(bArr4.length);
        if (bArr4.length > 0) {
            parcel.writeByteArray(bArr4);
        }
        parcel.writeString(this.f238303v);
        parcel.writeString(this.f238304w);
        parcel.writeInt(this.f238305x.booleanValue() ? 1 : 0);
    }

    public C17122x2c1fc2f7(android.os.Parcel parcel) {
        this.f238288d = 0;
        this.f238289e = "";
        this.f238290f = "";
        this.f238294m = new java.util.LinkedList();
        this.f238297p = 0;
        this.f238298q = 0;
        this.f238301t = 400;
        this.f238288d = parcel.readInt();
        this.f238289e = parcel.readString();
        this.f238290f = parcel.readString();
        this.f238291g = parcel.readInt();
        this.f238292h = parcel.readString();
        this.f238293i = parcel.readString();
        this.f238297p = parcel.readInt();
        this.f238298q = parcel.readInt();
        this.f238299r = parcel.readString();
        this.f238300s = parcel.readString();
        this.f238301t = parcel.readInt();
        this.f238294m = new java.util.LinkedList();
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            int readInt2 = parcel.readInt();
            if (readInt2 > 0) {
                byte[] bArr = new byte[readInt2];
                parcel.readByteArray(bArr);
                try {
                    r45.vq0 vq0Var = new r45.vq0();
                    vq0Var.mo11468x92b714fd(bArr);
                    this.f238294m.add(vq0Var);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiRemittanceResp", e17, "", new java.lang.Object[0]);
                }
            }
        }
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            byte[] bArr2 = new byte[readInt3];
            parcel.readByteArray(bArr2);
            r45.wo woVar = new r45.wo();
            this.f238295n = woVar;
            try {
                woVar.mo11468x92b714fd(bArr2);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiRemittanceResp", e18, "", new java.lang.Object[0]);
            }
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            byte[] bArr3 = new byte[readInt4];
            parcel.readByteArray(bArr3);
            r45.e77 e77Var = new r45.e77();
            this.f238296o = e77Var;
            try {
                e77Var.mo11468x92b714fd(bArr3);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiRemittanceResp", e19, "", new java.lang.Object[0]);
            }
        }
        int readInt5 = parcel.readInt();
        if (readInt5 > 0) {
            byte[] bArr4 = new byte[readInt5];
            parcel.readByteArray(bArr4);
            r45.mn0 mn0Var = new r45.mn0();
            this.f238302u = mn0Var;
            try {
                mn0Var.mo11468x92b714fd(bArr4);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiRemittanceResp", e27, "", new java.lang.Object[0]);
            }
        }
        this.f238303v = parcel.readString();
        this.f238304w = parcel.readString();
        this.f238305x = java.lang.Boolean.valueOf(parcel.readInt() == 1);
    }
}
