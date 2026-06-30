package com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9;

/* renamed from: com.tencent.mm.pluginsdk.wallet.WalletJsapiData */
/* loaded from: classes.dex */
public class C19761xc2874b62 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62> f38858x681a0c0c = new h45.z();
    public int A;
    public final java.lang.String B;
    public final int C;
    public final java.lang.String D;
    public final java.lang.String E;
    public java.lang.String F;
    public boolean G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f273661J;
    public int K;
    public int L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public long T;
    public final java.lang.String U;
    public java.util.Map V;
    public java.lang.String W;
    public p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c X;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f273662d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f273663e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f273664f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f273665g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f273666h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f273667i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f273668m;

    /* renamed from: n, reason: collision with root package name */
    public final int f273669n;

    /* renamed from: o, reason: collision with root package name */
    public final int f273670o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f273671p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f273672q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f273673r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f273674s;

    /* renamed from: t, reason: collision with root package name */
    public int f273675t;

    /* renamed from: u, reason: collision with root package name */
    public int f273676u;

    /* renamed from: v, reason: collision with root package name */
    public int f273677v;

    /* renamed from: w, reason: collision with root package name */
    public int f273678w;

    /* renamed from: x, reason: collision with root package name */
    public int f273679x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f273680y;

    /* renamed from: z, reason: collision with root package name */
    public int f273681z;

    public C19761xc2874b62() {
        this.A = 0;
        this.C = 0;
        this.P = "";
        this.S = "";
        this.U = "";
    }

    public static int a(int i17, int i18) {
        int i19 = (i17 == 1000 || i17 == 1018 || i17 == 1017 || i17 == 1033) ? 0 : i17 == 1019 ? 1 : i17 == 1010 ? 5 : (i17 == 1007 || i17 == 1008) ? 6 : i17 == 1009 ? 7 : (i17 == 1035 || i17 == 1020) ? 8 : (i17 == 1011 || i17 == 1047 || i17 == 1025) ? 12 : (i17 == 1012 || i17 == 1032 || i17 == 1048 || i17 == 1050) ? 13 : (i17 == 1005 || i17 == 1027 || i17 == 1042 || i17 == 1006) ? 15 : (i17 == 1024 || i17 == 1021) ? 16 : (i17 == 1029 || i17 == 1028) ? 23 : (i17 == 1013 || i17 == 1031 || i17 == 1049) ? 24 : (i17 == 1001 || i17 == 1003) ? 25 : (i17 == 1045 || i17 == 1046) ? 26 : i17 == 1022 ? 27 : i17 == 1023 ? 28 : i17 == 1026 ? 29 : i17 == 1039 ? 30 : (i17 == 1034 || i17 == 1060) ? 31 : (i17 == 1014 || i17 == 1043 || i17 == 1044 || i17 == 1036 || i17 == 1346) ? 32 : i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJsapiData", "parsePayChannelByScene, scene: %s, rawScene: %s, resultChannel: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        return i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f273662d);
        parcel.writeString(this.f273663e);
        parcel.writeString(this.f273664f);
        parcel.writeString(this.f273665g);
        parcel.writeString(this.f273666h);
        parcel.writeString(this.f273667i);
        parcel.writeString(this.f273668m);
        parcel.writeInt(this.f273669n);
        parcel.writeInt(this.f273670o);
        parcel.writeString(this.f273671p);
        parcel.writeString(this.f273672q);
        parcel.writeString(this.f273673r);
        parcel.writeString(this.f273674s);
        parcel.writeInt(this.f273675t);
        parcel.writeInt(this.f273676u);
        parcel.writeInt(this.f273677v);
        parcel.writeInt(this.f273678w);
        parcel.writeInt(this.f273679x);
        parcel.writeString(this.f273680y);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.f273681z);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeString(this.W);
        java.util.Map map = this.V;
        if (map != null) {
            parcel.writeInt(map.size());
            for (java.util.Map.Entry entry : this.V.entrySet()) {
                parcel.writeString((java.lang.String) entry.getKey());
                parcel.writeString((java.lang.String) entry.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeInt(this.f273661J);
        if (this.X != null) {
            parcel.writeString("PAY_SUCCESS_AHEAD_CALLBACK_RESULT_RECEIVER_MAGIC_WORD");
            this.X.writeToParcel(parcel, i17);
        } else {
            parcel.writeString(null);
        }
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        parcel.writeString(this.S);
        parcel.writeLong(this.T);
        parcel.writeString(this.U);
    }

    public C19761xc2874b62(java.util.Map map) {
        this.A = 0;
        this.C = 0;
        this.P = "";
        this.S = "";
        this.U = "";
        this.f273662d = (java.lang.String) map.get("appId");
        this.f273663e = (java.lang.String) map.get("partnerId");
        this.f273664f = (java.lang.String) map.get("signType");
        this.f273665g = (java.lang.String) map.get("nonceStr");
        this.f273666h = (java.lang.String) map.get("timeStamp");
        this.f273667i = (java.lang.String) map.get("package");
        this.f273668m = (java.lang.String) map.get("reqKey");
        this.f273669n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("payScene"), 1);
        this.f273670o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("businessScene"), 1);
        this.f273671p = (java.lang.String) map.get("paySign");
        this.f273673r = (java.lang.String) map.get("url");
        this.f273674s = (java.lang.String) map.get("src_username");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0);
        this.f273675t = P;
        if (P == 0) {
            this.f273675t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("pay_scene"), 0);
        }
        this.f273677v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("pay_channel"), 0);
        this.f273678w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("pay_code_scene"), 0);
        java.lang.String str = (java.lang.String) map.get("ext_info");
        this.f273680y = str == null ? "" : str;
        java.lang.String str2 = (java.lang.String) map.get("token");
        this.B = str2 == null ? "" : str2;
        java.lang.String str3 = (java.lang.String) map.get("result_jump_mode");
        this.C = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3 == null ? "0" : str3, 0);
        java.lang.String str4 = (java.lang.String) map.get("key_appbrand_from_path");
        this.D = str4 == null ? "" : str4;
        java.lang.String str5 = (java.lang.String) map.get("key_appbrand_from_username");
        this.E = str5 == null ? "" : str5;
        java.lang.String str6 = (java.lang.String) map.get("key_appbrand_from_scene");
        this.F = str6 == null ? "" : str6;
        this.f273661J = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("key_chat_type"), 0);
        this.K = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("key_send_type"), 0);
        this.L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("key_qrcode_session_type"), 0);
        java.lang.String str7 = (java.lang.String) map.get("key_qrcode_session_name");
        this.M = str7 == null ? "" : str7;
        java.lang.String str8 = (java.lang.String) map.get("key_qrcode_timeline_objid");
        this.N = str8 == null ? "" : str8;
        java.lang.String str9 = (java.lang.String) map.get("is_select_payment");
        this.U = str9 != null ? str9 : "";
    }

    public C19761xc2874b62(org.json.JSONObject jSONObject) {
        this.A = 0;
        this.C = 0;
        this.P = "";
        this.S = "";
        this.U = "";
        this.f273662d = jSONObject.optString("appId");
        this.f273663e = jSONObject.optString("partnerId");
        this.f273664f = jSONObject.optString("signType");
        this.f273665g = jSONObject.optString("nonceStr");
        this.f273666h = jSONObject.optString("timeStamp");
        this.f273667i = jSONObject.optString("package");
        this.f273668m = jSONObject.optString("reqKey");
        this.f273669n = jSONObject.optInt("payScene", 1);
        this.f273670o = jSONObject.optInt("businessScene", 1);
        this.f273671p = jSONObject.optString("paySign");
        this.f273672q = jSONObject.optString("cookie");
        this.f273673r = jSONObject.optString("url");
        this.f273674s = jSONObject.optString("src_username");
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.f273675t = optInt;
        if (optInt == 0) {
            this.f273675t = jSONObject.optInt("pay_scene", 0);
        }
        this.f273677v = jSONObject.optInt("pay_channel", 0);
        this.f273678w = jSONObject.optInt("pay_code_scene", 0);
        this.f273680y = jSONObject.optString("ext_info", "");
        this.B = jSONObject.optString("token", "");
        this.C = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("result_jump_mode", "0"), 0);
        this.A = jSONObject.optInt("pay_for_wallet_type", 0);
        java.lang.String optString = jSONObject.optString("key_appbrand_from_path");
        this.D = optString == null ? "" : optString;
        java.lang.String optString2 = jSONObject.optString("key_appbrand_from_username");
        this.E = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject.optString("key_appbrand_from_scene");
        this.F = optString3 == null ? "" : optString3;
        this.G = jSONObject.optBoolean("key_joint_pay", false);
        this.f273661J = jSONObject.optInt("key_chat_type", 0);
        this.K = jSONObject.optInt("key_send_type", 0);
        this.L = jSONObject.optInt("key_qrcode_session_type", 0);
        this.M = jSONObject.optString("key_qrcode_session_name", "");
        this.N = jSONObject.optString("key_qrcode_timeline_objid", "");
        this.Q = jSONObject.optString("key_qrcode_msg_send_user", "");
        this.R = jSONObject.optString("key_qrcode_msg_svrid", "");
        this.S = jSONObject.optString("key_init_raw_url", "");
        this.T = jSONObject.optLong("key_init_timestamp", 0L);
        this.U = jSONObject.optString("is_select_payment");
    }

    public C19761xc2874b62(android.os.Parcel parcel) {
        this.A = 0;
        this.C = 0;
        this.P = "";
        this.S = "";
        this.U = "";
        this.f273662d = parcel.readString();
        this.f273663e = parcel.readString();
        this.f273664f = parcel.readString();
        this.f273665g = parcel.readString();
        this.f273666h = parcel.readString();
        this.f273667i = parcel.readString();
        this.f273668m = parcel.readString();
        this.f273669n = parcel.readInt();
        this.f273670o = parcel.readInt();
        this.f273671p = parcel.readString();
        this.f273672q = parcel.readString();
        this.f273673r = parcel.readString();
        this.f273674s = parcel.readString();
        this.f273675t = parcel.readInt();
        this.f273676u = parcel.readInt();
        this.f273677v = parcel.readInt();
        this.f273678w = parcel.readInt();
        this.f273679x = parcel.readInt();
        this.f273680y = parcel.readString();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.f273681z = parcel.readInt();
        this.G = parcel.readInt() == 1;
        this.W = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.V = new java.util.HashMap();
            for (int i17 = 0; i17 < readInt; i17++) {
                this.V.put(parcel.readString(), parcel.readString());
            }
        }
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.f273661J = parcel.readInt();
        if ("PAY_SUCCESS_AHEAD_CALLBACK_RESULT_RECEIVER_MAGIC_WORD".equals(parcel.readString())) {
            this.X = p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c.f74x681a0c0c.createFromParcel(parcel);
        }
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readString();
        this.S = parcel.readString();
        this.T = parcel.readLong();
        this.U = parcel.readString();
    }
}
