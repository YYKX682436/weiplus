package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29;

/* renamed from: com.tencent.mm.plugin.ball.model.BallInfo */
/* loaded from: classes14.dex */
public class C12886x91aa2b6d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d> f35354x681a0c0c = new np1.b();
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public boolean F;
    public android.os.Bundle G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f174578J;
    public boolean K;
    public boolean L;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 M;
    public boolean N;
    public np1.c P;
    public boolean Q;

    /* renamed from: d, reason: collision with root package name */
    public int f174579d;

    /* renamed from: e, reason: collision with root package name */
    public int f174580e;

    /* renamed from: f, reason: collision with root package name */
    public int f174581f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f174582g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f174583h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Point f174584i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f174585m;

    /* renamed from: n, reason: collision with root package name */
    public int f174586n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo f174587o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo f174588p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo f174589q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f174590r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f174591s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f174592t;

    /* renamed from: u, reason: collision with root package name */
    public int f174593u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f174594v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.drawable.Drawable f174595w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f174596x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f174597y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f174598z;

    /* renamed from: com.tencent.mm.plugin.ball.model.BallInfo$BallBlurInfo */
    /* loaded from: classes7.dex */
    public static class BallBlurInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo> f35355x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.a();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f174599d;

        /* renamed from: e, reason: collision with root package name */
        public android.graphics.Bitmap f174600e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.Integer f174601f;

        public BallBlurInfo(android.os.Parcel parcel) {
            this.f174599d = parcel.readString();
            this.f174600e = (android.graphics.Bitmap) parcel.readParcelable(android.graphics.Bitmap.class.getClassLoader());
            if (parcel.readByte() == 0) {
                this.f174601f = null;
            } else {
                this.f174601f = java.lang.Integer.valueOf(parcel.readInt());
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: equals */
        public boolean m54057xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo)) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo) obj;
            return java.util.Objects.equals(ballBlurInfo.f174599d, this.f174599d) && this.f174600e == ballBlurInfo.f174600e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f174599d);
            parcel.writeParcelable(this.f174600e, i17);
            if (this.f174601f == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeInt(this.f174601f.intValue());
            }
        }
    }

    public C12886x91aa2b6d(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f174581f = 0;
        this.f174584i = null;
        this.f174587o = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo();
        this.f174588p = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo();
        this.f174589q = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo();
        this.f174591s = true;
        this.f174592t = true;
        this.f174593u = -1;
        this.f174594v = null;
        this.f174595w = null;
        this.A = -2147483648L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = false;
        this.G = new android.os.Bundle();
        this.H = 0;
        this.I = false;
        this.f174578J = false;
        this.K = true;
        this.L = false;
        this.N = true;
        this.P = null;
        this.Q = false;
        this.f174579d = i17;
        this.f174582g = str;
        this.M = jSONObject == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81() : new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81(jSONObject);
        this.f174580e = i17;
    }

    public static org.json.JSONObject a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", c12886x91aa2b6d.f174579d);
            jSONObject.put("groupType", c12886x91aa2b6d.f174581f);
            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56081x69307313, c12886x91aa2b6d.f174580e);
            jSONObject.put("key", c12886x91aa2b6d.f174582g);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c12886x91aa2b6d.f174596x);
            jSONObject.put("desc", c12886x91aa2b6d.f174597y);
            jSONObject.put("tag", c12886x91aa2b6d.f174598z);
            jSONObject.put("progress", c12886x91aa2b6d.A);
            jSONObject.put("icon", c12886x91aa2b6d.f174590r);
            jSONObject.put("iconResId", c12886x91aa2b6d.f174593u);
            jSONObject.put("state", c12886x91aa2b6d.H);
            jSONObject.put("activeTime", c12886x91aa2b6d.B);
            jSONObject.put("createTime", c12886x91aa2b6d.C);
            jSONObject.put("passive", c12886x91aa2b6d.I);
            jSONObject.put("hidden", c12886x91aa2b6d.f174578J);
            jSONObject.put("canClick", c12886x91aa2b6d.K);
            jSONObject.put("hasBizEnterPage", c12886x91aa2b6d.N);
            jSONObject.put("extra", b(c12886x91aa2b6d.G));
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = c12886x91aa2b6d.M;
            c12887x942bef81.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("r_internal_sessionId", c12887x942bef81.f174625o);
                jSONObject2.put("r_internal_aggregationSessionId", c12887x942bef81.f174626p);
                jSONObject2.put("r_internal_taskOrder", c12887x942bef81.f174627q);
            } catch (org.json.JSONException unused) {
            }
            jSONObject.put("reportInfo", jSONObject2);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BallInfo", e17, "convertBallInfoToJSONObject fail, exception:%s", e17);
            return null;
        }
    }

    public static org.json.JSONObject b(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (bundle != null) {
            try {
                if (!bundle.isEmpty()) {
                    for (java.lang.String str : bundle.keySet()) {
                        jSONObject.put(str, new np1.d(bundle.get(str)));
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BallInfo", e17, "convertBallInfoToJSONObject fail, exception:%s", e17);
            }
        }
        return jSONObject;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c(org.json.JSONObject jSONObject) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(jSONObject.getInt("type"), jSONObject.getString("key"), jSONObject.optJSONObject("reportInfo"));
            c12886x91aa2b6d.f174581f = jSONObject.optInt("groupType");
            c12886x91aa2b6d.f174580e = jSONObject.optInt(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56081x69307313, 0);
            c12886x91aa2b6d.f174578J = jSONObject.optBoolean("hidden", false);
            c12886x91aa2b6d.K = jSONObject.optBoolean("canClick", true);
            c12886x91aa2b6d.I = jSONObject.optBoolean("passive", false);
            c12886x91aa2b6d.N = jSONObject.optBoolean("hasBizEnterPage", true);
            c12886x91aa2b6d.H = jSONObject.optInt("state", 0);
            c12886x91aa2b6d.f174590r = jSONObject.optString("icon");
            c12886x91aa2b6d.f174593u = jSONObject.optInt("iconResId", -1);
            c12886x91aa2b6d.f174596x = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            c12886x91aa2b6d.f174597y = jSONObject.optString("desc");
            c12886x91aa2b6d.f174598z = jSONObject.optString("tag");
            c12886x91aa2b6d.A = jSONObject.optLong("progress");
            c12886x91aa2b6d.B = jSONObject.optLong("activeTime", 0L);
            c12886x91aa2b6d.C = jSONObject.optLong("createTime", 0L);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            android.os.Bundle bundle = new android.os.Bundle();
            if (optJSONObject != null) {
                try {
                    if (optJSONObject.length() > 0) {
                        java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            np1.d.a(bundle, next, optJSONObject.getJSONObject(next));
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BallInfo", e17, "convertJSONObjectToBundle fail, exception:%s", e17);
                }
            }
            c12886x91aa2b6d.G = bundle;
            return c12886x91aa2b6d;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BallInfo", e18, "convertJSONObjectToBallInfo fail, exception:%s", e18);
            return null;
        }
    }

    public final synchronized void d() {
        if (this.G == null) {
            this.G = new android.os.Bundle();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String e() {
        return java.lang.String.format("%s#%s", java.lang.Integer.valueOf(this.f174579d), this.f174582g);
    }

    /* renamed from: equals */
    public boolean m54054xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) obj;
        return this.f174579d == c12886x91aa2b6d.f174579d && this.f174581f == c12886x91aa2b6d.f174581f && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f174582g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12886x91aa2b6d.f174582g) && this.f174582g.equals(c12886x91aa2b6d.f174582g);
    }

    public synchronized int f(java.lang.String str, int i17) {
        if (!i(str)) {
            return i17;
        }
        return this.G.getInt(str, i17);
    }

    public synchronized java.lang.String g(java.lang.String str, java.lang.String str2) {
        if (!i(str)) {
            return str2;
        }
        return this.G.getString(str, str2);
    }

    public java.lang.String h() {
        int i17 = this.f174579d;
        if (i17 == 57) {
            return "SEARCH";
        }
        switch (i17) {
            case 0:
                return com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.f7430xad573197;
            case 1:
                return "APPBRAND";
            case 2:
                return "WEBPAGE";
            case 3:
                return "FAV";
            case 4:
                return "FILES";
            case 5:
                return "LUGGAGE";
            case 6:
                return "MUSIC";
            case 7:
                return com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.InterfaceC2422xfd62b179.f7379x9ff58fb5;
            case 8:
                return "TOPSTORY_VIDEO";
            case 9:
                return "VOIP";
            default:
                switch (i17) {
                    case 16:
                        return "GAME_DOWNLOAD";
                    case 17:
                        return "APPBRAND_VOIP";
                    case 18:
                        return "AUDIO_OF_VIDEO_BACKGROUND_PLAY";
                    case 19:
                        return "APPBRAND_VOIP_1V1";
                    case 20:
                        return "MESSAGE";
                    case 21:
                        return "LIVE";
                    case 22:
                        return "FINDER_MEGA_VIDEO";
                    case 23:
                        return "MUSIC_PLAYER";
                    case 24:
                        return "FESTIVAL_LIVE";
                    case 25:
                        return "REPAIRER";
                    default:
                        switch (i17) {
                            case 32:
                                return "FINDER_FEED";
                            case 33:
                                return "APPBRAND_BLUETOOTH";
                            case 34:
                                return "LIVE_REPLAY";
                            case 35:
                                return "LIVE_CHATTING";
                            case 36:
                                return "TING";
                            case 37:
                                return "REPAIRER_MONITOR";
                            default:
                                switch (i17) {
                                    case 39:
                                        return "TING_RADIO_CHANNEL";
                                    case 40:
                                        return "APPBRAND_VIDEO_BACKGROUND_PLAY";
                                    case 41:
                                        return "VOICE_BACK_PLAY";
                                    default:
                                        switch (i17) {
                                            case 50:
                                                return "MP_WEBPAGE";
                                            case 51:
                                                return "MSG_PIC";
                                            case 52:
                                                return "FINDER_AUDIO";
                                            case 53:
                                                return "TING_CHATROOM_CHANNEL";
                                            case 54:
                                                return "LITEAPP";
                                            case 55:
                                                return "ASK";
                                            default:
                                                switch (i17) {
                                                    case 64:
                                                        return "TING_MUSIC";
                                                    case 65:
                                                        return "BIZ_AUDIO";
                                                    case 66:
                                                        return "TING_QUICK_PLAYER";
                                                    case 67:
                                                        return "TING_BASIC_PLAYER";
                                                    case 68:
                                                        return "TING_STAND_ALONE";
                                                    default:
                                                        return "Unknown";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public synchronized boolean i(java.lang.String str) {
        if (this.G == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        return this.G.containsKey(str);
    }

    public synchronized void m(java.lang.String str, int i17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            d();
            this.G.putInt(str, i17);
        }
    }

    public synchronized void n(java.lang.String str, java.lang.String str2) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            d();
            this.G.putString(str, str2);
        }
    }

    public synchronized void o(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        int i17;
        android.graphics.Point point;
        if (c12886x91aa2b6d != null) {
            this.f174590r = c12886x91aa2b6d.f174590r;
            this.f174593u = c12886x91aa2b6d.f174593u;
            this.f174596x = c12886x91aa2b6d.f174596x;
            this.f174597y = c12886x91aa2b6d.f174597y;
            this.f174598z = c12886x91aa2b6d.f174598z;
            this.A = c12886x91aa2b6d.A;
            this.G = c12886x91aa2b6d.G;
            this.H = c12886x91aa2b6d.H;
            this.I = c12886x91aa2b6d.I;
            this.f174594v = c12886x91aa2b6d.f174594v;
            this.f174595w = c12886x91aa2b6d.f174595w;
            this.f174580e = c12886x91aa2b6d.f174580e;
            if (this.f174579d == 40) {
                android.view.View view = c12886x91aa2b6d.f174583h;
                if (view != null) {
                    this.f174583h = view;
                }
                if (this.f174584i == null && (point = c12886x91aa2b6d.f174584i) != null) {
                    this.f174584i = point;
                }
                if (this.f174586n == 0 && (i17 = c12886x91aa2b6d.f174586n) != 0) {
                    this.f174586n = i17;
                }
            } else {
                this.f174583h = c12886x91aa2b6d.f174583h;
                this.f174584i = c12886x91aa2b6d.f174584i;
                this.f174586n = c12886x91aa2b6d.f174586n;
            }
            this.f174587o.a(c12886x91aa2b6d.f174587o);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo = this.f174588p;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo2 = c12886x91aa2b6d.f174588p;
            ballBlurInfo.getClass();
            ballBlurInfo.f174599d = ballBlurInfo2.f174599d;
            ballBlurInfo.f174600e = ballBlurInfo2.f174600e;
            ballBlurInfo.f174601f = ballBlurInfo2.f174601f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo ballCollapseInfo = this.f174589q;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo ballCollapseInfo2 = c12886x91aa2b6d.f174589q;
            ballCollapseInfo.getClass();
            ballCollapseInfo.f174615d = ballCollapseInfo2.f174615d;
            ballCollapseInfo.f174616e = ballCollapseInfo2.f174616e;
            q(c12886x91aa2b6d.M);
        }
    }

    public final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81) {
        java.lang.String str = c12887x942bef81.f174620g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef812 = this.M;
        c12887x942bef812.f174620g = str;
        c12887x942bef812.f174622i = c12887x942bef81.f174622i;
        c12887x942bef812.f174621h = c12887x942bef81.f174621h;
        c12887x942bef812.f174619f = c12887x942bef81.f174619f;
        c12887x942bef812.f174618e = c12887x942bef81.f174618e;
        c12887x942bef812.f174617d = c12887x942bef81.f174617d;
        c12887x942bef812.f174623m = c12887x942bef81.f174623m;
    }

    /* renamed from: toString */
    public java.lang.String m54055x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BallInfo{type=");
        sb6.append(this.f174579d);
        sb6.append(", groupType=");
        sb6.append(this.f174581f);
        sb6.append(", key='");
        sb6.append(this.f174582g);
        sb6.append("', contentType='");
        sb6.append(this.f174580e);
        sb6.append("', customView=");
        android.view.View view = this.f174583h;
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        sb6.append(", customViewSize=");
        sb6.append(this.f174584i);
        sb6.append(", passive=");
        sb6.append(this.I);
        sb6.append(", hidden=");
        sb6.append(this.f174578J);
        sb6.append(", isPlaying=");
        sb6.append(this.f174587o.f174602d);
        sb6.append(", name='");
        sb6.append(this.f174596x);
        sb6.append("', state=");
        sb6.append(this.H);
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            parcel.writeInt(this.f174579d);
            parcel.writeInt(this.f174581f);
            parcel.writeString(this.f174582g);
            parcel.writeString(this.f174590r);
            parcel.writeInt(this.f174593u);
            parcel.writeString(this.f174596x);
            parcel.writeString(this.f174597y);
            parcel.writeString(this.f174598z);
            parcel.writeLong(this.A);
            android.os.Bundle bundle = this.G;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            parcel.writeBundle(bundle);
            parcel.writeInt(this.H);
            int i18 = 1;
            parcel.writeInt(this.I ? 1 : 0);
            parcel.writeInt(this.f174578J ? 1 : 0);
            parcel.writeInt(this.K ? 1 : 0);
            if (!this.N) {
                i18 = 0;
            }
            parcel.writeInt(i18);
            parcel.writeParcelable(this.M, i17);
            parcel.writeInt(this.f174580e);
            parcel.writeParcelable(this.f174587o, i17);
            parcel.writeParcelable(this.f174588p, i17);
            parcel.writeParcelable(this.f174589q, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BallInfo", e17, "writeToParcel fail, exception:%s", e17);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.model.BallInfo$BallCollapseInfo */
    /* loaded from: classes11.dex */
    public static class BallCollapseInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo> f35357x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.c();

        /* renamed from: d, reason: collision with root package name */
        public boolean f174615d;

        /* renamed from: e, reason: collision with root package name */
        public long f174616e;

        public BallCollapseInfo() {
            this.f174615d = false;
            this.f174616e = 0L;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeByte(this.f174615d ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f174616e);
        }

        public BallCollapseInfo(android.os.Parcel parcel) {
            this.f174615d = false;
            this.f174616e = 0L;
            this.f174615d = parcel.readByte() != 0;
            this.f174616e = parcel.readLong();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.model.BallInfo$BallButtonInfo */
    /* loaded from: classes10.dex */
    public static class BallButtonInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo> f35356x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.b();

        /* renamed from: d, reason: collision with root package name */
        public boolean f174602d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f174603e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f174604f;

        /* renamed from: g, reason: collision with root package name */
        public int f174605g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f174606h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f174607i;

        /* renamed from: m, reason: collision with root package name */
        public int f174608m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f174609n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f174610o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f174611p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f174612q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f174613r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f174614s;

        public BallButtonInfo() {
            this.f174602d = true;
            this.f174603e = true;
            this.f174604f = true;
            this.f174605g = -1;
            this.f174606h = true;
            this.f174607i = true;
            this.f174608m = -1;
            this.f174609n = false;
            this.f174610o = true;
            this.f174611p = true;
            this.f174612q = true;
            this.f174613r = false;
            this.f174614s = false;
        }

        public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo) {
            this.f174602d = ballButtonInfo.f174602d;
            this.f174603e = ballButtonInfo.f174603e;
            this.f174604f = ballButtonInfo.f174604f;
            this.f174605g = ballButtonInfo.f174605g;
            this.f174606h = ballButtonInfo.f174606h;
            this.f174607i = ballButtonInfo.f174607i;
            this.f174608m = ballButtonInfo.f174608m;
            this.f174609n = ballButtonInfo.f174609n;
            this.f174610o = ballButtonInfo.f174610o;
            this.f174611p = ballButtonInfo.f174611p;
            this.f174612q = ballButtonInfo.f174612q;
            this.f174613r = ballButtonInfo.f174613r;
            this.f174614s = ballButtonInfo.f174614s;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeByte(this.f174602d ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f174603e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f174604f ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f174605g);
            parcel.writeByte(this.f174606h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f174607i ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f174608m);
            parcel.writeByte(this.f174609n ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f174610o ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f174611p ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f174612q ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f174613r ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f174614s ? (byte) 1 : (byte) 0);
        }

        public BallButtonInfo(android.os.Parcel parcel) {
            this.f174602d = true;
            this.f174603e = true;
            this.f174604f = true;
            this.f174605g = -1;
            this.f174606h = true;
            this.f174607i = true;
            this.f174608m = -1;
            this.f174609n = false;
            this.f174610o = true;
            this.f174611p = true;
            this.f174612q = true;
            this.f174613r = false;
            this.f174614s = false;
            this.f174602d = parcel.readByte() != 0;
            this.f174603e = parcel.readByte() != 0;
            this.f174604f = parcel.readByte() != 0;
            this.f174605g = parcel.readInt();
            this.f174606h = parcel.readByte() != 0;
            this.f174607i = parcel.readByte() != 0;
            this.f174608m = parcel.readInt();
            this.f174609n = parcel.readByte() != 0;
            this.f174610o = parcel.readByte() != 0;
            this.f174611p = parcel.readByte() != 0;
            this.f174612q = parcel.readByte() != 0;
            this.f174613r = parcel.readByte() != 0;
            this.f174614s = parcel.readByte() != 0;
        }
    }

    public C12886x91aa2b6d(android.os.Parcel parcel) {
        this.f174581f = 0;
        this.f174584i = null;
        this.f174587o = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo();
        this.f174588p = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo();
        this.f174589q = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo();
        this.f174591s = true;
        this.f174592t = true;
        this.f174593u = -1;
        this.f174594v = null;
        this.f174595w = null;
        this.A = -2147483648L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = false;
        this.G = new android.os.Bundle();
        this.H = 0;
        this.I = false;
        this.f174578J = false;
        this.K = true;
        this.L = false;
        this.N = true;
        this.P = null;
        this.Q = false;
        try {
            this.f174579d = parcel.readInt();
            this.f174581f = parcel.readInt();
            this.f174582g = parcel.readString();
            this.f174590r = parcel.readString();
            this.f174593u = parcel.readInt();
            this.f174596x = parcel.readString();
            this.f174597y = parcel.readString();
            this.f174598z = parcel.readString();
            this.A = parcel.readLong();
            this.G = parcel.readBundle(getClass().getClassLoader());
            this.H = parcel.readInt();
            this.I = parcel.readInt() == 1;
            this.f174578J = parcel.readInt() == 1;
            this.K = parcel.readInt() == 1;
            this.N = parcel.readInt() == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81) parcel.readParcelable(getClass().getClassLoader());
            if (c12887x942bef81 == null) {
                c12887x942bef81 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81();
            }
            this.M = c12887x942bef81;
            this.f174580e = parcel.readInt();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo) parcel.readParcelable(getClass().getClassLoader());
            if (ballButtonInfo == null) {
                ballButtonInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo();
            }
            this.f174587o = ballButtonInfo;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo) parcel.readParcelable(getClass().getClassLoader());
            if (ballBlurInfo == null) {
                ballBlurInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo();
            }
            this.f174588p = ballBlurInfo;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo ballCollapseInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo) parcel.readParcelable(getClass().getClassLoader());
            if (ballCollapseInfo == null) {
                ballCollapseInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo();
            }
            this.f174589q = ballCollapseInfo;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BallInfo", e17, "readFromParcel fail, exception:%s", e17);
        }
    }
}
