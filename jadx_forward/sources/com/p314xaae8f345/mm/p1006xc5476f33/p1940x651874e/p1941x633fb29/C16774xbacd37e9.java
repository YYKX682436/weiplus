package com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29;

/* renamed from: com.tencent.mm.plugin.order.model.MallTransactionObject */
/* loaded from: classes9.dex */
public class C16774xbacd37e9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9> f37715x681a0c0c = new dp3.i();
    public java.lang.String A;
    public int A1;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public double f234313J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public int Q;
    public int R;
    public double S;
    public java.lang.String T;
    public int U;
    public java.lang.String V;
    public int W;
    public int X;
    public int Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public int f234314d;

    /* renamed from: e, reason: collision with root package name */
    public int f234315e;

    /* renamed from: f, reason: collision with root package name */
    public int f234316f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f234317g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f234318h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f234319i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f234320l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f234321m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f234322n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f234323o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f234324p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f234325p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f234326p1;

    /* renamed from: q, reason: collision with root package name */
    public double f234327q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f234328r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f234329s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f234330t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f234331u;

    /* renamed from: v, reason: collision with root package name */
    public int f234332v;

    /* renamed from: w, reason: collision with root package name */
    public int f234333w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f234334x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f234335x0;

    /* renamed from: x1, reason: collision with root package name */
    public double f234336x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f234337y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f234338y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f234339y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f234340z;

    /* renamed from: z1, reason: collision with root package name */
    public java.util.List f234341z1;

    public C16774xbacd37e9() {
        this.f234327q = 0.0d;
        this.f234341z1 = new java.util.LinkedList();
        this.A1 = -1;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9();
        jSONObject.optInt("rec_type", 1);
        c16774xbacd37e9.f234314d = jSONObject.optInt("sub_pay_type", 0);
        c16774xbacd37e9.f234315e = jSONObject.optInt("pay_scene");
        c16774xbacd37e9.f234316f = jSONObject.optInt("user_type");
        c16774xbacd37e9.f234317g = jSONObject.optString("buy_uin");
        c16774xbacd37e9.f234318h = jSONObject.optString("buy_name");
        c16774xbacd37e9.f234319i = jSONObject.optString("sale_uin");
        c16774xbacd37e9.f234321m = jSONObject.optString("sale_name");
        c16774xbacd37e9.f234334x = jSONObject.optString("trans_id");
        c16774xbacd37e9.f234337y = jSONObject.optString("sp_billno");
        c16774xbacd37e9.f234322n = jSONObject.optString("goods_name");
        c16774xbacd37e9.f234323o = jSONObject.optString("goods_detail");
        c16774xbacd37e9.f234327q = jSONObject.optDouble("fee") / 100.0d;
        c16774xbacd37e9.f234328r = jSONObject.optString("fee_color");
        c16774xbacd37e9.f234329s = jSONObject.optString("trade_state");
        c16774xbacd37e9.f234330t = jSONObject.optString("trade_state_name");
        c16774xbacd37e9.f234331u = jSONObject.optString("trade_state_color");
        c16774xbacd37e9.f234340z = jSONObject.optString("buy_bank_name");
        c16774xbacd37e9.A = jSONObject.optString("card_tail");
        c16774xbacd37e9.f234332v = jSONObject.optInt("create_timestamp");
        c16774xbacd37e9.f234333w = jSONObject.optInt("modify_timestamp");
        c16774xbacd37e9.B = jSONObject.optString("fee_type");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("appinfo");
        if (optJSONObject != null) {
            c16774xbacd37e9.C = optJSONObject.optString("app_username");
            c16774xbacd37e9.D = optJSONObject.optString("app_telephone");
            c16774xbacd37e9.E = optJSONObject.optString("app_nickname");
            c16774xbacd37e9.F = optJSONObject.optString("app_icon_url");
            c16774xbacd37e9.N = optJSONObject.optString("safeguard_url");
            c16774xbacd37e9.P = optJSONObject.optString("display_name");
        }
        c16774xbacd37e9.G = jSONObject.optString("deliver_price");
        c16774xbacd37e9.H = jSONObject.optString("preferential_price");
        c16774xbacd37e9.I = jSONObject.optString("discount");
        c16774xbacd37e9.f234313J = jSONObject.optDouble("original_total_fee") / 100.0d;
        c16774xbacd37e9.K = jSONObject.optString("total_price");
        c16774xbacd37e9.L = jSONObject.optString("receipt_company");
        c16774xbacd37e9.M = jSONObject.optString("biz_pledge");
        c16774xbacd37e9.Q = jSONObject.optInt("pre_fetch_timestamp");
        c16774xbacd37e9.R = jSONObject.optInt("arrived_timestamp");
        c16774xbacd37e9.S = jSONObject.optDouble("transfer_fee") / 100.0d;
        c16774xbacd37e9.T = jSONObject.optString("receiver_name");
        c16774xbacd37e9.U = jSONObject.optInt("allow_resend_msg");
        c16774xbacd37e9.V = jSONObject.optString("charge_fee");
        c16774xbacd37e9.W = jSONObject.optInt("receive_timestamp");
        c16774xbacd37e9.X = jSONObject.optInt("refund_timestamp");
        c16774xbacd37e9.Y = jSONObject.optInt("create_timestamp");
        c16774xbacd37e9.Z = jSONObject.optString("buy_bank_type");
        c16774xbacd37e9.f234325p0 = jSONObject.optString("payer_name");
        c16774xbacd37e9.f234335x0 = jSONObject.optString("true_name");
        c16774xbacd37e9.f234338y0 = jSONObject.optString("refund_bank_type");
        c16774xbacd37e9.f234320l1 = jSONObject.optString("rateinfo");
        c16774xbacd37e9.f234326p1 = jSONObject.optString("original_feeinfo");
        c16774xbacd37e9.f234336x1 = jSONObject.optDouble("fetch_total_fee") / 100.0d;
        c16774xbacd37e9.f234339y1 = jSONObject.optString("fetch_total_fee_color");
        c16774xbacd37e9.A1 = jSONObject.optInt("userroll_type");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("help_center");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16773xeeea2670 c16773xeeea2670 = new com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16773xeeea2670();
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                c16773xeeea2670.f234312f = jSONObject2.optBoolean("is_show_button");
                c16773xeeea2670.f234310d = jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                c16773xeeea2670.f234311e = jSONObject2.optString("url");
                linkedList.add(c16773xeeea2670);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallTransactionObject", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallTransactionObject", "parseHelpCenter error %s", e17.getMessage());
        }
        c16774xbacd37e9.f234341z1 = linkedList;
        return c16774xbacd37e9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f234314d);
        parcel.writeInt(this.f234315e);
        parcel.writeInt(this.f234316f);
        parcel.writeString(this.f234317g);
        parcel.writeString(this.f234318h);
        parcel.writeString(this.f234319i);
        parcel.writeString(this.f234321m);
        parcel.writeString(this.f234322n);
        parcel.writeString(this.f234323o);
        parcel.writeString(this.f234324p);
        parcel.writeDouble(this.f234327q);
        parcel.writeString(this.f234328r);
        parcel.writeString(this.f234329s);
        parcel.writeString(this.f234330t);
        parcel.writeString(this.f234331u);
        parcel.writeInt(this.f234332v);
        parcel.writeInt(this.f234333w);
        parcel.writeString(this.f234334x);
        parcel.writeString(this.f234337y);
        parcel.writeString(this.f234340z);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeDouble(this.f234313J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.W);
        parcel.writeDouble(this.S);
        parcel.writeString(this.T);
        parcel.writeInt(this.U);
        parcel.writeString(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.f234325p0);
        parcel.writeString(this.f234335x0);
        parcel.writeString(this.f234338y0);
        parcel.writeString(this.f234320l1);
        parcel.writeString(this.f234326p1);
        parcel.writeDouble(this.f234336x1);
        parcel.writeString(this.f234339y1);
        parcel.writeString(this.P);
        parcel.writeInt(this.A1);
        parcel.writeInt(this.f234341z1.size());
        java.util.Iterator it = this.f234341z1.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16773xeeea2670) it.next(), i17);
        }
    }

    public C16774xbacd37e9(android.os.Parcel parcel) {
        this.f234327q = 0.0d;
        this.f234341z1 = new java.util.LinkedList();
        this.A1 = -1;
        this.f234314d = parcel.readInt();
        this.f234315e = parcel.readInt();
        this.f234316f = parcel.readInt();
        this.f234317g = parcel.readString();
        this.f234318h = parcel.readString();
        this.f234319i = parcel.readString();
        this.f234321m = parcel.readString();
        this.f234322n = parcel.readString();
        this.f234323o = parcel.readString();
        this.f234324p = parcel.readString();
        this.f234327q = parcel.readDouble();
        this.f234328r = parcel.readString();
        this.f234329s = parcel.readString();
        this.f234330t = parcel.readString();
        this.f234331u = parcel.readString();
        this.f234332v = parcel.readInt();
        this.f234333w = parcel.readInt();
        this.f234334x = parcel.readString();
        this.f234337y = parcel.readString();
        this.f234340z = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.f234313J = parcel.readDouble();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.Q = parcel.readInt();
        this.W = parcel.readInt();
        this.S = parcel.readDouble();
        this.T = parcel.readString();
        this.U = parcel.readInt();
        this.V = parcel.readString();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readString();
        this.f234325p0 = parcel.readString();
        this.f234335x0 = parcel.readString();
        this.f234338y0 = parcel.readString();
        this.f234320l1 = parcel.readString();
        this.f234326p1 = parcel.readString();
        this.f234336x1 = parcel.readDouble();
        this.f234339y1 = parcel.readString();
        this.P = parcel.readString();
        this.A1 = parcel.readInt();
        int readInt = parcel.readInt();
        this.f234341z1 = new java.util.LinkedList();
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f234341z1.add((com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16773xeeea2670) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16773xeeea2670.class.getClassLoader()));
        }
    }
}
