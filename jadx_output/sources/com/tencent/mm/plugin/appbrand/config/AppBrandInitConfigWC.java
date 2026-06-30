package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class AppBrandInitConfigWC extends com.tencent.luggage.sdk.config.AppBrandInitConfigLU {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC> CREATOR = new k91.i0();
    public boolean A2;
    public com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData B2;
    public java.lang.String C2;
    public java.lang.String D2;
    public k91.b1 E2;
    public boolean F2;
    public int G2;
    public boolean H2;
    public boolean I2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f77292e2;

    /* renamed from: f2, reason: collision with root package name */
    public long f77293f2;

    /* renamed from: g2, reason: collision with root package name */
    public java.lang.String f77294g2;

    /* renamed from: h2, reason: collision with root package name */
    public java.lang.String f77295h2;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f77296i2;

    /* renamed from: j2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor f77297j2;

    /* renamed from: k2, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.report.quality.QualitySession f77298k2;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f77299l2;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f77300m2;

    /* renamed from: n2, reason: collision with root package name */
    public int f77301n2;

    /* renamed from: o2, reason: collision with root package name */
    public final java.lang.String f77302o2;

    /* renamed from: p2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer f77303p2;

    /* renamed from: q2, reason: collision with root package name */
    public java.lang.String f77304q2;

    /* renamed from: r2, reason: collision with root package name */
    public int f77305r2;

    /* renamed from: s2, reason: collision with root package name */
    public int f77306s2;

    /* renamed from: t2, reason: collision with root package name */
    public int f77307t2;

    /* renamed from: u2, reason: collision with root package name */
    public int f77308u2;

    /* renamed from: v2, reason: collision with root package name */
    public boolean f77309v2;

    /* renamed from: w2, reason: collision with root package name */
    public long f77310w2;

    /* renamed from: x2, reason: collision with root package name */
    public java.util.List f77311x2;

    /* renamed from: y2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle f77312y2;

    /* renamed from: z2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy f77313z2;

    public AppBrandInitConfigWC() {
        this.f77296i2 = false;
        this.f77309v2 = false;
        this.f77310w2 = 0L;
        this.f77311x2 = new java.util.ArrayList();
        this.A2 = false;
        this.B2 = null;
        this.C2 = "";
        this.D2 = "";
        this.E2 = k91.b1.f305540d;
        this.F2 = false;
        this.G2 = 0;
        this.H2 = false;
        this.I2 = false;
    }

    @Override // com.tencent.luggage.sdk.config.AppBrandInitConfigLU, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig
    /* renamed from: a */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig clone() {
        android.os.Parcel b17 = b();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = new com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC(b17);
        b17.recycle();
        return appBrandInitConfigWC;
    }

    @Override // com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig
    public android.os.Parcel b() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return obtain;
    }

    @Override // com.tencent.luggage.sdk.config.AppBrandInitConfigLU, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig
    public java.lang.Object clone() {
        android.os.Parcel b17 = b();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = new com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC(b17);
        b17.recycle();
        return appBrandInitConfigWC;
    }

    @Override // com.tencent.luggage.sdk.config.AppBrandInitConfigLU
    /* renamed from: e */
    public com.tencent.luggage.sdk.config.AppBrandInitConfigLU clone() {
        android.os.Parcel b17 = b();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = new com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC(b17);
        b17.recycle();
        return appBrandInitConfigWC;
    }

    @Override // com.tencent.luggage.sdk.config.AppBrandInitConfigLU
    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandInitConfigWC {visitingSessionId='");
        sb6.append(this.f47276v);
        sb6.append("', wxaLaunchInstanceId=");
        sb6.append(this.f47277w);
        sb6.append(", clickTimestamp=");
        sb6.append(this.I);
        sb6.append(", username='");
        sb6.append(this.f47278x);
        sb6.append("', appId='");
        sb6.append(this.f77278d);
        sb6.append("', brandName='");
        sb6.append(this.f77279e);
        sb6.append("', debugType=");
        sb6.append(this.f77281g);
        sb6.append(", uin=");
        sb6.append(kk.v.a(this.f47279x0));
        sb6.append(", isPluginApp=");
        sb6.append(this.f77292e2);
        sb6.append(", appServiceType=");
        sb6.append(this.f47284z);
        sb6.append(", isAdContact=");
        sb6.append(this.f77299l2);
        sb6.append(", isGameAdContact=");
        sb6.append(this.f77300m2);
        sb6.append(", performanceValue=");
        sb6.append(this.f77301n2);
        sb6.append(", orientation='");
        sb6.append(this.f77282h);
        sb6.append("', enterPath='");
        sb6.append(this.f77283i);
        sb6.append("', shareName='");
        sb6.append(this.B);
        sb6.append("', shareKey='");
        sb6.append(this.C);
        sb6.append("', startTime=");
        sb6.append(this.I);
        sb6.append(", attrsFromCgi=");
        sb6.append(this.S1);
        sb6.append(", referrer=");
        sb6.append(this.D);
        sb6.append(", extInfo=");
        sb6.append(this.F);
        sb6.append(", appVersion=");
        sb6.append(this.L);
        sb6.append(", launchMode=");
        sb6.append(this.K1);
        sb6.append(", reloadIfExists=");
        sb6.append(this.f47283y1);
        sb6.append("， triggerServiceName=");
        sb6.append(this.f77295h2);
        sb6.append("， createdAsHalfScreen=");
        sb6.append(this.M1);
        sb6.append(", halfScreenConfig=");
        sb6.append(this.L1.c() ? this.L1.toString() : "dummy");
        sb6.append(", secFlagForSinglePageMode=");
        sb6.append(this.N1);
        sb6.append(", showRelievedBuyFlag=");
        sb6.append(this.f77305r2);
        sb6.append(", showFlagshipFlag=");
        sb6.append(this.f77306s2);
        sb6.append(", showFinancialLicenseFlag=");
        sb6.append(this.f77308u2);
        sb6.append(", dependLibBitFlag=");
        sb6.append(this.f77310w2);
        sb6.append(", wxAppWeakNetTypeFlags=");
        sb6.append(this.Y1);
        sb6.append(", wxAppLibServerMode=");
        sb6.append(this.X1);
        sb6.append(", useAndroid12PluginAdapter=");
        sb6.append(this.H2);
        sb6.append('}');
        return sb6.toString();
    }

    @Override // com.tencent.luggage.sdk.config.AppBrandInitConfigLU, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeByte(this.f77292e2 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f77299l2 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f77300m2 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f77301n2);
        parcel.writeLong(this.f77293f2);
        parcel.writeString(this.f77294g2);
        parcel.writeParcelable(this.f77298k2, i17);
        parcel.writeByte(this.f77296i2 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f77295h2);
        parcel.writeParcelable(this.f77297j2, i17);
        parcel.writeString(this.f77302o2);
        parcel.writeParcelable(this.f77303p2, i17);
        parcel.writeString(this.f77304q2);
        parcel.writeInt(this.f77305r2);
        parcel.writeInt(this.f77306s2);
        parcel.writeInt(this.f77307t2);
        parcel.writeByte(this.f77309v2 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f77312y2, i17);
        parcel.writeStringList(this.f77311x2);
        parcel.writeParcelable(this.f77313z2, i17);
        parcel.writeByte(this.A2 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.B2, i17);
        parcel.writeString(this.C2);
        parcel.writeString(this.D2);
        parcel.writeString(this.E2.name());
        parcel.writeByte(this.F2 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f77310w2);
        parcel.writeDouble(this.K);
        parcel.writeString(this.f47270c2);
        parcel.writeString(this.F1);
        parcel.writeString(this.f47282y0);
        parcel.writeInt(this.G1);
        parcel.writeInt(this.G2);
        parcel.writeParcelable(this.f47271d2, i17);
        parcel.writeByte(this.H2 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f77308u2);
        parcel.writeString(this.T);
        parcel.writeByte(this.f47285z1 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.Z1);
        parcel.writeLong(this.T1);
        parcel.writeLong(this.U1);
        parcel.writeParcelable(this.A1, i17);
    }

    public AppBrandInitConfigWC(android.os.Parcel parcel) {
        super(parcel);
        this.f77296i2 = false;
        this.f77309v2 = false;
        this.f77310w2 = 0L;
        this.f77311x2 = new java.util.ArrayList();
        this.A2 = false;
        this.B2 = null;
        this.C2 = "";
        this.D2 = "";
        k91.b1 b1Var = k91.b1.f305540d;
        this.E2 = b1Var;
        this.F2 = false;
        this.G2 = 0;
        this.H2 = false;
        this.I2 = false;
        this.f77292e2 = parcel.readByte() != 0;
        this.f77299l2 = parcel.readByte() != 0;
        this.f77300m2 = parcel.readByte() != 0;
        this.f77301n2 = parcel.readInt();
        this.f77293f2 = parcel.readLong();
        this.f77294g2 = parcel.readString();
        this.f77298k2 = (com.tencent.mm.plugin.appbrand.report.quality.QualitySession) parcel.readParcelable(com.tencent.mm.plugin.appbrand.report.quality.QualitySession.class.getClassLoader());
        this.f77296i2 = parcel.readByte() > 0;
        this.f77295h2 = parcel.readString();
        this.f77297j2 = (com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor) parcel.readParcelable(com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor.class.getClassLoader());
        this.f77302o2 = parcel.readString();
        this.f77303p2 = (com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer.class.getClassLoader());
        this.f77304q2 = parcel.readString();
        this.f77305r2 = parcel.readInt();
        this.f77306s2 = parcel.readInt();
        this.f77307t2 = parcel.readInt();
        this.f77309v2 = parcel.readByte() > 0;
        this.f77312y2 = (com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle) parcel.readParcelable(com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle.class.getClassLoader());
        parcel.readStringList(this.f77311x2);
        this.f77313z2 = (com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy.class.getClassLoader());
        this.A2 = parcel.readByte() > 0;
        this.B2 = (com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData) parcel.readParcelable(com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData.class.getClassLoader());
        this.C2 = parcel.readString();
        this.D2 = parcel.readString();
        java.lang.String readString = parcel.readString();
        this.E2 = android.text.TextUtils.isEmpty(readString) ? b1Var : k91.b1.valueOf(readString);
        this.F2 = parcel.readByte() > 0;
        this.f77310w2 = parcel.readLong();
        if (parcel.dataAvail() > 0) {
            this.K = parcel.readDouble();
        }
        if (parcel.dataAvail() > 0) {
            this.f47270c2 = parcel.readString();
            this.F1 = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.f47282y0 = parcel.readString();
            this.G1 = parcel.readInt();
        }
        if (parcel.dataAvail() > 0) {
            this.G2 = parcel.readInt();
        }
        if (parcel.dataAvail() > 0) {
            this.f47271d2 = (com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams.class.getClassLoader());
        }
        if (parcel.dataAvail() > 0) {
            this.H2 = parcel.readByte() != 0;
        }
        if (parcel.dataAvail() > 0) {
            this.f77308u2 = parcel.readInt();
        }
        if (parcel.dataAvail() > 0) {
            this.T = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.f47285z1 = parcel.readByte() > 0;
        }
        if (parcel.dataAvail() > 0) {
            this.Z1 = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.T1 = parcel.readLong();
            this.U1 = parcel.readLong();
        }
        if (parcel.dataAvail() > 0) {
            this.A1 = (com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams.class.getClassLoader());
        }
    }
}
