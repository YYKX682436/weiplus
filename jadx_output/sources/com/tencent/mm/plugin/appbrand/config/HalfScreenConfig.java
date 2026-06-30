package com.tencent.mm.plugin.appbrand.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig;", "Landroid/os/Parcelable;", "k91/s2", "BackgroundShapeConfig", "com/tencent/mm/plugin/appbrand/config/l", "k91/t2", "CloseWhenClickEmptyAreaConfig", "CustomSubjectInfo", "k91/v2", "HalfScreenHeaderTipsListenerProxy", "k91/w2", "k91/x2", "ShareActionConfig", "k91/y2", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class HalfScreenConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.HalfScreenConfig> CREATOR = new k91.u2();
    public static final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig Y = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(false, 0, null, false, null, false, null, null, false, false, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -4, 2047, null);
    public static final int Z = android.graphics.Color.parseColor("#66000000");
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final k91.x2 D;
    public final boolean E;
    public final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo F;
    public final int G;
    public final boolean H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f77356J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean P;
    public final k91.v2 Q;
    public java.lang.String R;
    public com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener S;
    public final boolean T;
    public final java.lang.String U;
    public final java.lang.String V;
    public final boolean W;
    public final boolean X;

    /* renamed from: d, reason: collision with root package name */
    public final int f77357d;

    /* renamed from: e, reason: collision with root package name */
    public final k91.s2 f77358e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f77359f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig f77360g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f77361h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig f77362i;

    /* renamed from: m, reason: collision with root package name */
    public final k91.t2 f77363m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f77364n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f77365o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener f77366p;

    /* renamed from: q, reason: collision with root package name */
    public final k91.y2 f77367q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f77368r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f77369s;

    /* renamed from: t, reason: collision with root package name */
    public final k91.b1 f77370t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f77371u;

    /* renamed from: v, reason: collision with root package name */
    public final int f77372v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig f77373w;

    /* renamed from: x, reason: collision with root package name */
    public final int f77374x;

    /* renamed from: y, reason: collision with root package name */
    public final int f77375y;

    /* renamed from: z, reason: collision with root package name */
    public final int f77376z;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig$CloseWhenClickEmptyAreaConfig;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static final /* data */ class CloseWhenClickEmptyAreaConfig implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig> CREATOR = new com.tencent.mm.plugin.appbrand.config.m();

        /* renamed from: f, reason: collision with root package name */
        public static final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig f77383f = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig("", k91.s2.f305760d);

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f77384d;

        /* renamed from: e, reason: collision with root package name */
        public final k91.s2 f77385e;

        public CloseWhenClickEmptyAreaConfig(java.lang.String activityClassName, k91.s2 closeAnimStyle) {
            kotlin.jvm.internal.o.g(activityClassName, "activityClassName");
            kotlin.jvm.internal.o.g(closeAnimStyle, "closeAnimStyle");
            this.f77384d = activityClassName;
            this.f77385e = closeAnimStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig)) {
                return false;
            }
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig) obj;
            return kotlin.jvm.internal.o.b(this.f77384d, closeWhenClickEmptyAreaConfig.f77384d) && this.f77385e == closeWhenClickEmptyAreaConfig.f77385e;
        }

        public int hashCode() {
            return (this.f77384d.hashCode() * 31) + this.f77385e.hashCode();
        }

        public java.lang.String toString() {
            return "CloseWhenClickEmptyAreaConfig(activityClassName=" + this.f77384d + ", closeAnimStyle=" + this.f77385e + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            kotlin.jvm.internal.o.g(parcel, "parcel");
            parcel.writeString(this.f77384d);
            parcel.writeString(this.f77385e.name());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig$CustomSubjectInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/config/n", "data-model_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final /* data */ class CustomSubjectInfo implements android.os.Parcelable {
        public static final com.tencent.mm.plugin.appbrand.config.n CREATOR = new com.tencent.mm.plugin.appbrand.config.n(null);

        /* renamed from: f, reason: collision with root package name */
        public static final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo f77386f = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo("", "");

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f77387d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f77388e;

        public CustomSubjectInfo(java.lang.String name, java.lang.String iconUrl) {
            kotlin.jvm.internal.o.g(name, "name");
            kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
            this.f77387d = name;
            this.f77388e = iconUrl;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo)) {
                return false;
            }
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo) obj;
            return kotlin.jvm.internal.o.b(this.f77387d, customSubjectInfo.f77387d) && kotlin.jvm.internal.o.b(this.f77388e, customSubjectInfo.f77388e);
        }

        public int hashCode() {
            return (this.f77387d.hashCode() * 31) + this.f77388e.hashCode();
        }

        public java.lang.String toString() {
            return "CustomSubjectInfo(name=" + this.f77387d + ", iconUrl=" + this.f77388e + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            kotlin.jvm.internal.o.g(parcel, "parcel");
            parcel.writeString(this.f77387d);
            parcel.writeString(this.f77388e);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig$HalfScreenHeaderTipsListenerProxy;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/config/o", "data-model_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes15.dex */
    public static final class HalfScreenHeaderTipsListenerProxy implements android.os.Parcelable {
        public static final com.tencent.mm.plugin.appbrand.config.o CREATOR = new com.tencent.mm.plugin.appbrand.config.o(null);

        public HalfScreenHeaderTipsListenerProxy(k91.w2 w2Var) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            kotlin.jvm.internal.o.g(parcel, "parcel");
            parcel.writeStrongBinder(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig$ShareActionConfig;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final /* data */ class ShareActionConfig implements android.os.Parcelable {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f77390d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f77391e;

        /* renamed from: f, reason: collision with root package name */
        public static final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig f77389f = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig(false, "");
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig> CREATOR = new com.tencent.mm.plugin.appbrand.config.p();

        public ShareActionConfig(boolean z17, java.lang.String token) {
            kotlin.jvm.internal.o.g(token, "token");
            this.f77390d = z17;
            this.f77391e = token;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig)) {
                return false;
            }
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig) obj;
            return this.f77390d == shareActionConfig.f77390d && kotlin.jvm.internal.o.b(this.f77391e, shareActionConfig.f77391e);
        }

        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.f77390d) * 31) + this.f77391e.hashCode();
        }

        public java.lang.String toString() {
            return "ShareActionConfig(showShare=" + this.f77390d + ", token=" + this.f77391e + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            kotlin.jvm.internal.o.g(parcel, "parcel");
            parcel.writeByte(this.f77390d ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f77391e);
        }
    }

    public HalfScreenConfig(boolean z17, int i17, k91.s2 activityAnimStyle, boolean z18, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig bgShapeConf, boolean z19, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig, k91.t2 capsuleType, boolean z27, boolean z28, com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener, k91.y2 splashLoadingType, boolean z29, boolean z37, k91.b1 loadingDarkModeStyle, boolean z38, int i18, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig, int i19, int i27, int i28, boolean z39, boolean z47, boolean z48, k91.x2 mode, boolean z49, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo, int i29, boolean z57, java.lang.String headerIndicatorColor, boolean z58, int i37, boolean z59, boolean z66, boolean z67, boolean z68, k91.v2 embedHost, java.lang.String headerTips, com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener, boolean z69, java.lang.String externalWidgetClassName, java.lang.String externalWidgetData, boolean z76) {
        kotlin.jvm.internal.o.g(activityAnimStyle, "activityAnimStyle");
        kotlin.jvm.internal.o.g(bgShapeConf, "bgShapeConf");
        kotlin.jvm.internal.o.g(closeWhenClickEmptyAreaConfig, "closeWhenClickEmptyAreaConfig");
        kotlin.jvm.internal.o.g(capsuleType, "capsuleType");
        kotlin.jvm.internal.o.g(splashLoadingType, "splashLoadingType");
        kotlin.jvm.internal.o.g(loadingDarkModeStyle, "loadingDarkModeStyle");
        kotlin.jvm.internal.o.g(shareActionConfig, "shareActionConfig");
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(customSubjectInfo, "customSubjectInfo");
        kotlin.jvm.internal.o.g(headerIndicatorColor, "headerIndicatorColor");
        kotlin.jvm.internal.o.g(embedHost, "embedHost");
        kotlin.jvm.internal.o.g(headerTips, "headerTips");
        kotlin.jvm.internal.o.g(externalWidgetClassName, "externalWidgetClassName");
        kotlin.jvm.internal.o.g(externalWidgetData, "externalWidgetData");
        this.f77357d = i17;
        this.f77358e = activityAnimStyle;
        this.f77359f = z18;
        this.f77360g = bgShapeConf;
        this.f77361h = z19;
        this.f77362i = closeWhenClickEmptyAreaConfig;
        this.f77363m = capsuleType;
        this.f77364n = z27;
        this.f77365o = z28;
        this.f77366p = weAppHalfScreenStatusChangeListener;
        this.f77367q = splashLoadingType;
        this.f77368r = z29;
        this.f77369s = z37;
        this.f77370t = loadingDarkModeStyle;
        this.f77371u = z38;
        this.f77372v = i18;
        this.f77373w = shareActionConfig;
        this.f77374x = i19;
        this.f77375y = i27;
        int i38 = i28;
        this.f77376z = i38;
        this.A = z39;
        this.B = z47;
        this.C = z48;
        this.D = mode;
        this.E = z49;
        this.F = customSubjectInfo;
        this.G = i29;
        this.H = z57;
        this.I = headerIndicatorColor;
        this.f77356J = z58;
        this.K = i37;
        this.L = z59;
        this.M = z66;
        this.N = z67;
        this.P = z68;
        this.Q = embedHost;
        this.R = headerTips;
        this.S = weAppHalfScreenHeaderTipsListener;
        this.T = z69;
        this.U = externalWidgetClassName;
        this.V = externalWidgetData;
        this.W = z76;
        this.X = z17;
        this.f77376z = z49 ? -1 : i38;
        this.f77375y = z49 ? -1 : i27;
    }

    public final k91.s2 a(android.content.Context context) {
        return (context == null || context.getResources().getConfiguration().orientation != 2) ? this.f77358e : k91.s2.f305761e;
    }

    public final k91.b1 b() {
        k91.b1 b1Var = k91.b1.f305540d;
        k91.b1 b1Var2 = this.f77370t;
        return (b1Var2 == b1Var && this.f77361h) ? k91.b1.f305541e : b1Var2;
    }

    public final boolean c() {
        return this.X && this.f77357d != 0;
    }

    public final boolean d() {
        if (c()) {
            if ((this.D == k91.x2.f305816d || this.T) && this.H) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final com.tencent.mm.plugin.appbrand.config.l e() {
        com.tencent.mm.plugin.appbrand.config.l lVar = new com.tencent.mm.plugin.appbrand.config.l();
        lVar.f77521a = c();
        lVar.f77522b = this.f77357d;
        lVar.f77523c = this.f77374x;
        lVar.f77524d = this.f77375y;
        lVar.f77525e = this.f77376z;
        k91.s2 activityAnimStyle = this.f77358e;
        kotlin.jvm.internal.o.g(activityAnimStyle, "activityAnimStyle");
        lVar.f77526f = activityAnimStyle;
        lVar.f77527g = this.f77359f;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = this.f77362i;
        kotlin.jvm.internal.o.g(closeWhenClickEmptyAreaConfig, "closeWhenClickEmptyAreaConfig");
        lVar.f77528h = closeWhenClickEmptyAreaConfig;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig bgShapeConf = this.f77360g;
        kotlin.jvm.internal.o.g(bgShapeConf, "bgShapeConf");
        lVar.f77529i = bgShapeConf;
        lVar.f77530j = this.f77361h;
        lVar.f77528h = closeWhenClickEmptyAreaConfig;
        k91.t2 capsuleType = this.f77363m;
        kotlin.jvm.internal.o.g(capsuleType, "capsuleType");
        lVar.f77531k = capsuleType;
        lVar.f77532l = this.f77364n;
        lVar.f77534n = this.f77365o;
        lVar.f77535o = this.f77366p;
        k91.y2 splashLoadingType = this.f77367q;
        kotlin.jvm.internal.o.g(splashLoadingType, "splashLoadingType");
        lVar.f77536p = splashLoadingType;
        lVar.f77537q = this.f77368r;
        lVar.f77533m = this.f77369s;
        k91.b1 loadingDarkModeStyle = this.f77370t;
        kotlin.jvm.internal.o.g(loadingDarkModeStyle, "loadingDarkModeStyle");
        lVar.f77538r = loadingDarkModeStyle;
        lVar.f77539s = this.f77371u;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig = this.f77373w;
        kotlin.jvm.internal.o.g(shareActionConfig, "shareActionConfig");
        lVar.f77541u = shareActionConfig;
        lVar.f77542v = this.A;
        lVar.f77543w = this.B;
        lVar.f77544x = this.C;
        k91.x2 mode = this.D;
        kotlin.jvm.internal.o.g(mode, "mode");
        lVar.f77545y = mode;
        lVar.f77546z = this.E;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = this.F;
        kotlin.jvm.internal.o.g(customSubjectInfo, "customSubjectInfo");
        lVar.A = customSubjectInfo;
        lVar.B = this.G;
        lVar.C = this.H;
        java.lang.String headerIndicatorColor = this.I;
        kotlin.jvm.internal.o.g(headerIndicatorColor, "headerIndicatorColor");
        lVar.D = headerIndicatorColor;
        lVar.E = this.f77356J;
        lVar.F = this.K;
        lVar.G = this.L;
        lVar.H = this.M;
        lVar.I = this.N;
        lVar.f77520J = this.P;
        java.lang.String headerTips = this.R;
        kotlin.jvm.internal.o.g(headerTips, "headerTips");
        lVar.L = headerTips;
        lVar.M = this.S;
        lVar.N = this.T;
        java.lang.String externalWidgetClassName = this.U;
        kotlin.jvm.internal.o.g(externalWidgetClassName, "externalWidgetClassName");
        lVar.O = externalWidgetClassName;
        java.lang.String externalWidgetData = this.V;
        kotlin.jvm.internal.o.g(externalWidgetData, "externalWidgetData");
        lVar.P = externalWidgetData;
        lVar.Q = this.W;
        return lVar;
    }

    public java.lang.String toString() {
        return "HalfScreenConfig(height=" + this.f77357d + ", activityAnimStyle=" + this.f77358e + ", closeWhenClickEmptyArea=" + this.f77359f + ", bgShapeConf=" + this.f77360g + ", forceLightMode=" + this.f77361h + ", closeWhenClickEmptyAreaConfig=" + this.f77362i + ", capsuleType=" + this.f77363m + ", supportGesture=" + this.f77364n + ", showHalfScreenCommonHeader=" + this.f77365o + ", halfScreenStatusChangeListener=" + this.f77366p + ", splashLoadingType=" + this.f77367q + ", showHalfScreenCustomHeader=" + this.f77368r + ", forbidSlidingUpGesture=" + this.f77369s + ", loadingDarkModeStyle=" + this.f77370t + ", showBgMask=" + this.f77371u + ", shareActionConfig=" + this.f77373w + ", autoFullScreenWhenTap=" + this.A + ", consumeNavigationBarHeight=" + this.C + ", enableExpandToStatusBarTop: " + this.W + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(this.f77357d);
        parcel.writeString(this.f77358e.name());
        parcel.writeByte(this.f77359f ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f77360g, i17);
        parcel.writeByte(this.f77361h ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f77362i, i17);
        parcel.writeString(this.f77363m.name());
        parcel.writeByte(this.f77364n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f77365o ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f77366p, i17);
        parcel.writeString(this.f77367q.name());
        parcel.writeByte(this.f77368r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f77369s ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f77370t.name());
        parcel.writeByte(this.f77371u ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f77372v);
        parcel.writeParcelable(this.f77373w, i17);
        parcel.writeInt(this.f77374x);
        parcel.writeInt(this.f77375y);
        parcel.writeInt(this.f77376z);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.C ? (byte) 1 : (byte) 0);
        parcel.writeString(this.D.name());
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.F, i17);
        parcel.writeInt(this.G);
        parcel.writeByte(this.H ? (byte) 1 : (byte) 0);
        parcel.writeString(this.I);
        parcel.writeByte(this.f77356J ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.K);
        parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.N ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.P ? (byte) 1 : (byte) 0);
        parcel.writeString(this.Q.name());
        parcel.writeString(this.R);
        parcel.writeParcelable(this.S, i17);
        parcel.writeByte(this.T ? (byte) 1 : (byte) 0);
        parcel.writeString(this.U);
        parcel.writeString(this.V);
        parcel.writeByte(this.W ? (byte) 1 : (byte) 0);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig$BackgroundShapeConfig;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static final /* data */ class BackgroundShapeConfig implements android.os.Parcelable {

        /* renamed from: d, reason: collision with root package name */
        public final float f77378d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f77379e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f77380f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f77381g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f77382h;

        /* renamed from: i, reason: collision with root package name */
        public static final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig f77377i = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(0.0f, false, false, false, false, 31, null);
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig> CREATOR = new com.tencent.mm.plugin.appbrand.config.k();

        public BackgroundShapeConfig(float f17, boolean z17, boolean z18, boolean z19, boolean z27) {
            this.f77378d = f17;
            this.f77379e = z17;
            this.f77380f = z18;
            this.f77381g = z19;
            this.f77382h = z27;
        }

        public final float[] a(int i17) {
            float[] fArr;
            boolean z17 = this.f77381g;
            boolean z18 = this.f77382h;
            boolean z19 = this.f77380f;
            boolean z27 = this.f77379e;
            float f17 = this.f77378d;
            if (i17 == 2) {
                fArr = new float[8];
                fArr[0] = z19 ? f17 : 0.0f;
                fArr[1] = z19 ? f17 : 0.0f;
                fArr[2] = z18 ? f17 : 0.0f;
                fArr[3] = z18 ? f17 : 0.0f;
                fArr[4] = z17 ? f17 : 0.0f;
                fArr[5] = z17 ? f17 : 0.0f;
                fArr[6] = z27 ? f17 : 0.0f;
                if (!z27) {
                    f17 = 0.0f;
                }
                fArr[7] = f17;
            } else {
                fArr = new float[8];
                fArr[0] = z27 ? f17 : 0.0f;
                fArr[1] = z27 ? f17 : 0.0f;
                fArr[2] = z19 ? f17 : 0.0f;
                fArr[3] = z19 ? f17 : 0.0f;
                fArr[4] = z18 ? f17 : 0.0f;
                fArr[5] = z18 ? f17 : 0.0f;
                fArr[6] = z17 ? f17 : 0.0f;
                if (!z17) {
                    f17 = 0.0f;
                }
                fArr[7] = f17;
            }
            return fArr;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig)) {
                return false;
            }
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig) obj;
            return java.lang.Float.compare(this.f77378d, backgroundShapeConfig.f77378d) == 0 && this.f77379e == backgroundShapeConfig.f77379e && this.f77380f == backgroundShapeConfig.f77380f && this.f77381g == backgroundShapeConfig.f77381g && this.f77382h == backgroundShapeConfig.f77382h;
        }

        public int hashCode() {
            return (((((((java.lang.Float.hashCode(this.f77378d) * 31) + java.lang.Boolean.hashCode(this.f77379e)) * 31) + java.lang.Boolean.hashCode(this.f77380f)) * 31) + java.lang.Boolean.hashCode(this.f77381g)) * 31) + java.lang.Boolean.hashCode(this.f77382h);
        }

        public java.lang.String toString() {
            return "BackgroundShapeConfig(cornerRadius=" + this.f77378d + ", topLeft=" + this.f77379e + ", topRight=" + this.f77380f + ", bottomLeft=" + this.f77381g + ", bottomRight=" + this.f77382h + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            kotlin.jvm.internal.o.g(parcel, "parcel");
            parcel.writeFloat(this.f77378d);
            parcel.writeByte(this.f77379e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f77380f ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f77381g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f77382h ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ BackgroundShapeConfig(float f17, boolean z17, boolean z18, boolean z19, boolean z27, int i17, kotlin.jvm.internal.i iVar) {
            this((i17 & 1) != 0 ? 0.0f : f17, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? false : z18, (i17 & 8) != 0 ? false : z19, (i17 & 16) == 0 ? z27 : false);
        }
    }

    public /* synthetic */ HalfScreenConfig(boolean z17, int i17, k91.s2 s2Var, boolean z18, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig, boolean z19, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig, k91.t2 t2Var, boolean z27, boolean z28, com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener, k91.y2 y2Var, boolean z29, boolean z37, k91.b1 b1Var, boolean z38, int i18, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig, int i19, int i27, int i28, boolean z39, boolean z47, boolean z48, k91.x2 x2Var, boolean z49, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo, int i29, boolean z57, java.lang.String str, boolean z58, int i37, boolean z59, boolean z66, boolean z67, boolean z68, k91.v2 v2Var, java.lang.String str2, com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener, boolean z69, java.lang.String str3, java.lang.String str4, boolean z76, int i38, int i39, kotlin.jvm.internal.i iVar) {
        this(z17, (i38 & 2) != 0 ? -1 : i17, (i38 & 4) != 0 ? k91.s2.f305760d : s2Var, (i38 & 8) != 0 ? false : z18, (i38 & 16) != 0 ? com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig.f77377i : backgroundShapeConfig, (i38 & 32) != 0 ? false : z19, (i38 & 64) != 0 ? com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig.f77383f : closeWhenClickEmptyAreaConfig, (i38 & 128) != 0 ? k91.t2.f305766d : t2Var, (i38 & 256) != 0 ? false : z27, (i38 & 512) != 0 ? false : z28, (i38 & 1024) != 0 ? null : weAppHalfScreenStatusChangeListener, (i38 & 2048) != 0 ? k91.y2.f305828e : y2Var, (i38 & 4096) != 0 ? false : z29, (i38 & 8192) != 0 ? false : z37, (i38 & 16384) != 0 ? k91.b1.f305540d : b1Var, (i38 & 32768) != 0 ? false : z38, (i38 & 65536) != 0 ? Z : i18, (i38 & 131072) != 0 ? com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig.f77389f : shareActionConfig, (i38 & 262144) != 0 ? -1 : i19, (i38 & 524288) != 0 ? -2 : i27, (i38 & 1048576) == 0 ? i28 : -2, (i38 & 2097152) != 0 ? true : z39, (i38 & 4194304) != 0 ? true : z47, (i38 & 8388608) != 0 ? true : z48, (i38 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? k91.x2.f305816d : x2Var, (i38 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? false : z49, (i38 & 67108864) != 0 ? com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo.f77386f : customSubjectInfo, (i38 & 134217728) != 0 ? -1 : i29, (i38 & 268435456) != 0 ? false : z57, (i38 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? "#FFFFFF" : str, (i38 & 1073741824) != 0 ? false : z58, (i38 & Integer.MIN_VALUE) != 0 ? -1 : i37, (i39 & 1) == 0 ? z59 : true, (i39 & 2) != 0 ? false : z66, (i39 & 4) != 0 ? false : z67, (i39 & 8) != 0 ? false : z68, (i39 & 16) != 0 ? k91.v2.f305791e : v2Var, (i39 & 32) != 0 ? "" : str2, (i39 & 64) != 0 ? null : weAppHalfScreenHeaderTipsListener, (i39 & 128) != 0 ? false : z69, (i39 & 256) != 0 ? "" : str3, (i39 & 512) == 0 ? str4 : "", (i39 & 1024) != 0 ? false : z76);
    }
}
