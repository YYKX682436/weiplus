package com.tencent.mm.plugin.ball.model;

/* loaded from: classes14.dex */
public class BallInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.model.BallInfo> CREATOR = new np1.b();
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
    public boolean f93045J;
    public boolean K;
    public boolean L;
    public final com.tencent.mm.plugin.ball.model.BallReportInfo M;
    public boolean N;
    public np1.c P;
    public boolean Q;

    /* renamed from: d, reason: collision with root package name */
    public int f93046d;

    /* renamed from: e, reason: collision with root package name */
    public int f93047e;

    /* renamed from: f, reason: collision with root package name */
    public int f93048f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f93049g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f93050h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Point f93051i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f93052m;

    /* renamed from: n, reason: collision with root package name */
    public int f93053n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo f93054o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo f93055p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo f93056q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f93057r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f93058s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f93059t;

    /* renamed from: u, reason: collision with root package name */
    public int f93060u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f93061v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.drawable.Drawable f93062w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f93063x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f93064y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f93065z;

    /* loaded from: classes7.dex */
    public static class BallBlurInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo> CREATOR = new com.tencent.mm.plugin.ball.model.a();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f93066d;

        /* renamed from: e, reason: collision with root package name */
        public android.graphics.Bitmap f93067e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.Integer f93068f;

        public BallBlurInfo(android.os.Parcel parcel) {
            this.f93066d = parcel.readString();
            this.f93067e = (android.graphics.Bitmap) parcel.readParcelable(android.graphics.Bitmap.class.getClassLoader());
            if (parcel.readByte() == 0) {
                this.f93068f = null;
            } else {
                this.f93068f = java.lang.Integer.valueOf(parcel.readInt());
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo)) {
                return false;
            }
            com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo = (com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo) obj;
            return java.util.Objects.equals(ballBlurInfo.f93066d, this.f93066d) && this.f93067e == ballBlurInfo.f93067e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f93066d);
            parcel.writeParcelable(this.f93067e, i17);
            if (this.f93068f == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeInt(this.f93068f.intValue());
            }
        }
    }

    public BallInfo(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f93048f = 0;
        this.f93051i = null;
        this.f93054o = new com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo();
        this.f93055p = new com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo();
        this.f93056q = new com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo();
        this.f93058s = true;
        this.f93059t = true;
        this.f93060u = -1;
        this.f93061v = null;
        this.f93062w = null;
        this.A = -2147483648L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = false;
        this.G = new android.os.Bundle();
        this.H = 0;
        this.I = false;
        this.f93045J = false;
        this.K = true;
        this.L = false;
        this.N = true;
        this.P = null;
        this.Q = false;
        this.f93046d = i17;
        this.f93049g = str;
        this.M = jSONObject == null ? new com.tencent.mm.plugin.ball.model.BallReportInfo() : new com.tencent.mm.plugin.ball.model.BallReportInfo(jSONObject);
        this.f93047e = i17;
    }

    public static org.json.JSONObject a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", ballInfo.f93046d);
            jSONObject.put("groupType", ballInfo.f93048f);
            jSONObject.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE, ballInfo.f93047e);
            jSONObject.put("key", ballInfo.f93049g);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, ballInfo.f93063x);
            jSONObject.put("desc", ballInfo.f93064y);
            jSONObject.put("tag", ballInfo.f93065z);
            jSONObject.put("progress", ballInfo.A);
            jSONObject.put("icon", ballInfo.f93057r);
            jSONObject.put("iconResId", ballInfo.f93060u);
            jSONObject.put("state", ballInfo.H);
            jSONObject.put("activeTime", ballInfo.B);
            jSONObject.put("createTime", ballInfo.C);
            jSONObject.put("passive", ballInfo.I);
            jSONObject.put("hidden", ballInfo.f93045J);
            jSONObject.put("canClick", ballInfo.K);
            jSONObject.put("hasBizEnterPage", ballInfo.N);
            jSONObject.put("extra", b(ballInfo.G));
            com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = ballInfo.M;
            ballReportInfo.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("r_internal_sessionId", ballReportInfo.f93092o);
                jSONObject2.put("r_internal_aggregationSessionId", ballReportInfo.f93093p);
                jSONObject2.put("r_internal_taskOrder", ballReportInfo.f93094q);
            } catch (org.json.JSONException unused) {
            }
            jSONObject.put("reportInfo", jSONObject2);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BallInfo", e17, "convertBallInfoToJSONObject fail, exception:%s", e17);
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
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BallInfo", e17, "convertBallInfoToJSONObject fail, exception:%s", e17);
            }
        }
        return jSONObject;
    }

    public static com.tencent.mm.plugin.ball.model.BallInfo c(org.json.JSONObject jSONObject) {
        try {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = new com.tencent.mm.plugin.ball.model.BallInfo(jSONObject.getInt("type"), jSONObject.getString("key"), jSONObject.optJSONObject("reportInfo"));
            ballInfo.f93048f = jSONObject.optInt("groupType");
            ballInfo.f93047e = jSONObject.optInt(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE, 0);
            ballInfo.f93045J = jSONObject.optBoolean("hidden", false);
            ballInfo.K = jSONObject.optBoolean("canClick", true);
            ballInfo.I = jSONObject.optBoolean("passive", false);
            ballInfo.N = jSONObject.optBoolean("hasBizEnterPage", true);
            ballInfo.H = jSONObject.optInt("state", 0);
            ballInfo.f93057r = jSONObject.optString("icon");
            ballInfo.f93060u = jSONObject.optInt("iconResId", -1);
            ballInfo.f93063x = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            ballInfo.f93064y = jSONObject.optString("desc");
            ballInfo.f93065z = jSONObject.optString("tag");
            ballInfo.A = jSONObject.optLong("progress");
            ballInfo.B = jSONObject.optLong("activeTime", 0L);
            ballInfo.C = jSONObject.optLong("createTime", 0L);
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
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BallInfo", e17, "convertJSONObjectToBundle fail, exception:%s", e17);
                }
            }
            ballInfo.G = bundle;
            return ballInfo;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BallInfo", e18, "convertJSONObjectToBallInfo fail, exception:%s", e18);
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
        return java.lang.String.format("%s#%s", java.lang.Integer.valueOf(this.f93046d), this.f93049g);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.plugin.ball.model.BallInfo)) {
            return false;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
        return this.f93046d == ballInfo.f93046d && this.f93048f == ballInfo.f93048f && !com.tencent.mm.sdk.platformtools.t8.K0(this.f93049g) && !com.tencent.mm.sdk.platformtools.t8.K0(ballInfo.f93049g) && this.f93049g.equals(ballInfo.f93049g);
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
        int i17 = this.f93046d;
        if (i17 == 57) {
            return "SEARCH";
        }
        switch (i17) {
            case 0:
                return com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN;
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
                return com.google.android.gms.stats.CodePackage.LOCATION;
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
        if (this.G == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return this.G.containsKey(str);
    }

    public synchronized void m(java.lang.String str, int i17) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            d();
            this.G.putInt(str, i17);
        }
    }

    public synchronized void n(java.lang.String str, java.lang.String str2) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            d();
            this.G.putString(str, str2);
        }
    }

    public synchronized void o(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17;
        android.graphics.Point point;
        if (ballInfo != null) {
            this.f93057r = ballInfo.f93057r;
            this.f93060u = ballInfo.f93060u;
            this.f93063x = ballInfo.f93063x;
            this.f93064y = ballInfo.f93064y;
            this.f93065z = ballInfo.f93065z;
            this.A = ballInfo.A;
            this.G = ballInfo.G;
            this.H = ballInfo.H;
            this.I = ballInfo.I;
            this.f93061v = ballInfo.f93061v;
            this.f93062w = ballInfo.f93062w;
            this.f93047e = ballInfo.f93047e;
            if (this.f93046d == 40) {
                android.view.View view = ballInfo.f93050h;
                if (view != null) {
                    this.f93050h = view;
                }
                if (this.f93051i == null && (point = ballInfo.f93051i) != null) {
                    this.f93051i = point;
                }
                if (this.f93053n == 0 && (i17 = ballInfo.f93053n) != 0) {
                    this.f93053n = i17;
                }
            } else {
                this.f93050h = ballInfo.f93050h;
                this.f93051i = ballInfo.f93051i;
                this.f93053n = ballInfo.f93053n;
            }
            this.f93054o.a(ballInfo.f93054o);
            com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo = this.f93055p;
            com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo2 = ballInfo.f93055p;
            ballBlurInfo.getClass();
            ballBlurInfo.f93066d = ballBlurInfo2.f93066d;
            ballBlurInfo.f93067e = ballBlurInfo2.f93067e;
            ballBlurInfo.f93068f = ballBlurInfo2.f93068f;
            com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo ballCollapseInfo = this.f93056q;
            com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo ballCollapseInfo2 = ballInfo.f93056q;
            ballCollapseInfo.getClass();
            ballCollapseInfo.f93082d = ballCollapseInfo2.f93082d;
            ballCollapseInfo.f93083e = ballCollapseInfo2.f93083e;
            q(ballInfo.M);
        }
    }

    public final void q(com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo) {
        java.lang.String str = ballReportInfo.f93087g;
        com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo2 = this.M;
        ballReportInfo2.f93087g = str;
        ballReportInfo2.f93089i = ballReportInfo.f93089i;
        ballReportInfo2.f93088h = ballReportInfo.f93088h;
        ballReportInfo2.f93086f = ballReportInfo.f93086f;
        ballReportInfo2.f93085e = ballReportInfo.f93085e;
        ballReportInfo2.f93084d = ballReportInfo.f93084d;
        ballReportInfo2.f93090m = ballReportInfo.f93090m;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BallInfo{type=");
        sb6.append(this.f93046d);
        sb6.append(", groupType=");
        sb6.append(this.f93048f);
        sb6.append(", key='");
        sb6.append(this.f93049g);
        sb6.append("', contentType='");
        sb6.append(this.f93047e);
        sb6.append("', customView=");
        android.view.View view = this.f93050h;
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        sb6.append(", customViewSize=");
        sb6.append(this.f93051i);
        sb6.append(", passive=");
        sb6.append(this.I);
        sb6.append(", hidden=");
        sb6.append(this.f93045J);
        sb6.append(", isPlaying=");
        sb6.append(this.f93054o.f93069d);
        sb6.append(", name='");
        sb6.append(this.f93063x);
        sb6.append("', state=");
        sb6.append(this.H);
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            parcel.writeInt(this.f93046d);
            parcel.writeInt(this.f93048f);
            parcel.writeString(this.f93049g);
            parcel.writeString(this.f93057r);
            parcel.writeInt(this.f93060u);
            parcel.writeString(this.f93063x);
            parcel.writeString(this.f93064y);
            parcel.writeString(this.f93065z);
            parcel.writeLong(this.A);
            android.os.Bundle bundle = this.G;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            parcel.writeBundle(bundle);
            parcel.writeInt(this.H);
            int i18 = 1;
            parcel.writeInt(this.I ? 1 : 0);
            parcel.writeInt(this.f93045J ? 1 : 0);
            parcel.writeInt(this.K ? 1 : 0);
            if (!this.N) {
                i18 = 0;
            }
            parcel.writeInt(i18);
            parcel.writeParcelable(this.M, i17);
            parcel.writeInt(this.f93047e);
            parcel.writeParcelable(this.f93054o, i17);
            parcel.writeParcelable(this.f93055p, i17);
            parcel.writeParcelable(this.f93056q, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BallInfo", e17, "writeToParcel fail, exception:%s", e17);
        }
    }

    /* loaded from: classes11.dex */
    public static class BallCollapseInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo> CREATOR = new com.tencent.mm.plugin.ball.model.c();

        /* renamed from: d, reason: collision with root package name */
        public boolean f93082d;

        /* renamed from: e, reason: collision with root package name */
        public long f93083e;

        public BallCollapseInfo() {
            this.f93082d = false;
            this.f93083e = 0L;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeByte(this.f93082d ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f93083e);
        }

        public BallCollapseInfo(android.os.Parcel parcel) {
            this.f93082d = false;
            this.f93083e = 0L;
            this.f93082d = parcel.readByte() != 0;
            this.f93083e = parcel.readLong();
        }
    }

    /* loaded from: classes10.dex */
    public static class BallButtonInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo> CREATOR = new com.tencent.mm.plugin.ball.model.b();

        /* renamed from: d, reason: collision with root package name */
        public boolean f93069d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f93070e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f93071f;

        /* renamed from: g, reason: collision with root package name */
        public int f93072g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f93073h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f93074i;

        /* renamed from: m, reason: collision with root package name */
        public int f93075m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f93076n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f93077o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f93078p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f93079q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f93080r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f93081s;

        public BallButtonInfo() {
            this.f93069d = true;
            this.f93070e = true;
            this.f93071f = true;
            this.f93072g = -1;
            this.f93073h = true;
            this.f93074i = true;
            this.f93075m = -1;
            this.f93076n = false;
            this.f93077o = true;
            this.f93078p = true;
            this.f93079q = true;
            this.f93080r = false;
            this.f93081s = false;
        }

        public void a(com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo) {
            this.f93069d = ballButtonInfo.f93069d;
            this.f93070e = ballButtonInfo.f93070e;
            this.f93071f = ballButtonInfo.f93071f;
            this.f93072g = ballButtonInfo.f93072g;
            this.f93073h = ballButtonInfo.f93073h;
            this.f93074i = ballButtonInfo.f93074i;
            this.f93075m = ballButtonInfo.f93075m;
            this.f93076n = ballButtonInfo.f93076n;
            this.f93077o = ballButtonInfo.f93077o;
            this.f93078p = ballButtonInfo.f93078p;
            this.f93079q = ballButtonInfo.f93079q;
            this.f93080r = ballButtonInfo.f93080r;
            this.f93081s = ballButtonInfo.f93081s;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeByte(this.f93069d ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93070e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93071f ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f93072g);
            parcel.writeByte(this.f93073h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93074i ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f93075m);
            parcel.writeByte(this.f93076n ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93077o ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93078p ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93079q ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93080r ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93081s ? (byte) 1 : (byte) 0);
        }

        public BallButtonInfo(android.os.Parcel parcel) {
            this.f93069d = true;
            this.f93070e = true;
            this.f93071f = true;
            this.f93072g = -1;
            this.f93073h = true;
            this.f93074i = true;
            this.f93075m = -1;
            this.f93076n = false;
            this.f93077o = true;
            this.f93078p = true;
            this.f93079q = true;
            this.f93080r = false;
            this.f93081s = false;
            this.f93069d = parcel.readByte() != 0;
            this.f93070e = parcel.readByte() != 0;
            this.f93071f = parcel.readByte() != 0;
            this.f93072g = parcel.readInt();
            this.f93073h = parcel.readByte() != 0;
            this.f93074i = parcel.readByte() != 0;
            this.f93075m = parcel.readInt();
            this.f93076n = parcel.readByte() != 0;
            this.f93077o = parcel.readByte() != 0;
            this.f93078p = parcel.readByte() != 0;
            this.f93079q = parcel.readByte() != 0;
            this.f93080r = parcel.readByte() != 0;
            this.f93081s = parcel.readByte() != 0;
        }
    }

    public BallInfo(android.os.Parcel parcel) {
        this.f93048f = 0;
        this.f93051i = null;
        this.f93054o = new com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo();
        this.f93055p = new com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo();
        this.f93056q = new com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo();
        this.f93058s = true;
        this.f93059t = true;
        this.f93060u = -1;
        this.f93061v = null;
        this.f93062w = null;
        this.A = -2147483648L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = false;
        this.G = new android.os.Bundle();
        this.H = 0;
        this.I = false;
        this.f93045J = false;
        this.K = true;
        this.L = false;
        this.N = true;
        this.P = null;
        this.Q = false;
        try {
            this.f93046d = parcel.readInt();
            this.f93048f = parcel.readInt();
            this.f93049g = parcel.readString();
            this.f93057r = parcel.readString();
            this.f93060u = parcel.readInt();
            this.f93063x = parcel.readString();
            this.f93064y = parcel.readString();
            this.f93065z = parcel.readString();
            this.A = parcel.readLong();
            this.G = parcel.readBundle(getClass().getClassLoader());
            this.H = parcel.readInt();
            this.I = parcel.readInt() == 1;
            this.f93045J = parcel.readInt() == 1;
            this.K = parcel.readInt() == 1;
            this.N = parcel.readInt() == 1;
            com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = (com.tencent.mm.plugin.ball.model.BallReportInfo) parcel.readParcelable(getClass().getClassLoader());
            if (ballReportInfo == null) {
                ballReportInfo = new com.tencent.mm.plugin.ball.model.BallReportInfo();
            }
            this.M = ballReportInfo;
            this.f93047e = parcel.readInt();
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = (com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo) parcel.readParcelable(getClass().getClassLoader());
            if (ballButtonInfo == null) {
                ballButtonInfo = new com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo();
            }
            this.f93054o = ballButtonInfo;
            com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo = (com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo) parcel.readParcelable(getClass().getClassLoader());
            if (ballBlurInfo == null) {
                ballBlurInfo = new com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo();
            }
            this.f93055p = ballBlurInfo;
            com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo ballCollapseInfo = (com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo) parcel.readParcelable(getClass().getClassLoader());
            if (ballCollapseInfo == null) {
                ballCollapseInfo = new com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo();
            }
            this.f93056q = ballCollapseInfo;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BallInfo", e17, "readFromParcel fail, exception:%s", e17);
        }
    }
}
