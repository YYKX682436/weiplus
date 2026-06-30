package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public final class AppBrandLaunchReferrer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer> CREATOR = new k91.l0();

    /* renamed from: d, reason: collision with root package name */
    public int f77322d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77323e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f77324f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f77325g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f77326h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f77327i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f77328m;

    /* renamed from: n, reason: collision with root package name */
    public int f77329n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f77330o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.OpenBusinessViewExtraArgs f77331p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f77332q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f77333r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f77334s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f77335t;

    /* loaded from: classes7.dex */
    public static final class OpenBusinessViewExtraArgs implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.OpenBusinessViewExtraArgs> CREATOR = new com.tencent.mm.plugin.appbrand.config.j();

        /* renamed from: d, reason: collision with root package name */
        public boolean f77336d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f77337e;

        public OpenBusinessViewExtraArgs(android.os.Parcel parcel, k91.l0 l0Var) {
            this.f77336d = parcel.readByte() != 0;
            this.f77337e = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            return "OpenBusinessViewExtraArgs{sticky=" + this.f77336d + ", disableVisibilityEvent=" + this.f77337e + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeByte(this.f77336d ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f77337e ? (byte) 1 : (byte) 0);
        }
    }

    public AppBrandLaunchReferrer(android.os.Parcel parcel, k91.l0 l0Var) {
        a(parcel);
    }

    public void a(android.os.Parcel parcel) {
        this.f77322d = parcel.readInt();
        this.f77323e = parcel.readString();
        this.f77324f = parcel.readString();
        this.f77325g = parcel.readString();
        this.f77327i = parcel.readString();
        this.f77328m = parcel.readString();
        this.f77329n = parcel.readInt();
        this.f77330o = parcel.readString();
        this.f77326h = parcel.readString();
        this.f77332q = parcel.readString();
        this.f77333r = parcel.readString();
        this.f77334s = parcel.readString();
        this.f77331p = (com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.OpenBusinessViewExtraArgs) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.OpenBusinessViewExtraArgs.class.getClassLoader());
        this.f77335t = parcel.readString();
    }

    public void b(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer) {
        if (appBrandLaunchReferrer == null) {
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        appBrandLaunchReferrer.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        a(obtain);
        obtain.recycle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandLaunchReferrer{launchScene=");
        sb6.append(this.f77322d);
        sb6.append(", appId='");
        sb6.append(this.f77323e);
        sb6.append("', extraData='");
        sb6.append(this.f77324f);
        sb6.append("', url='");
        sb6.append(this.f77327i);
        sb6.append("', agentId='");
        sb6.append(this.f77328m);
        sb6.append("', sourceType='");
        sb6.append(this.f77329n);
        sb6.append("', businessType='");
        sb6.append(this.f77330o);
        sb6.append('\'');
        if (this.f77331p != null) {
            str = ", openBusinessViewExtraArgs=" + this.f77331p;
        } else {
            str = "";
        }
        sb6.append(str);
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f77322d);
        parcel.writeString(this.f77323e);
        parcel.writeString(this.f77324f);
        parcel.writeString(this.f77325g);
        parcel.writeString(this.f77327i);
        parcel.writeString(this.f77328m);
        parcel.writeInt(this.f77329n);
        parcel.writeString(this.f77330o);
        parcel.writeString(this.f77326h);
        parcel.writeString(this.f77332q);
        parcel.writeString(this.f77333r);
        parcel.writeString(this.f77334s);
        parcel.writeParcelable(this.f77331p, i17);
        parcel.writeString(this.f77335t);
    }
}
