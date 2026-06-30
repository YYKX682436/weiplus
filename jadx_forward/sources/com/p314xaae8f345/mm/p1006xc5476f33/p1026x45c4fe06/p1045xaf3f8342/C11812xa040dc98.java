package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer */
/* loaded from: classes7.dex */
public final class C11812xa040dc98 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98> f33586x681a0c0c = new k91.l0();

    /* renamed from: d, reason: collision with root package name */
    public int f158855d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158856e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158857f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f158858g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f158859h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f158860i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f158861m;

    /* renamed from: n, reason: collision with root package name */
    public int f158862n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f158863o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98.OpenBusinessViewExtraArgs f158864p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f158865q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f158866r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f158867s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f158868t;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer$OpenBusinessViewExtraArgs */
    /* loaded from: classes7.dex */
    public static final class OpenBusinessViewExtraArgs implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98.OpenBusinessViewExtraArgs> f33587x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.j();

        /* renamed from: d, reason: collision with root package name */
        public boolean f158869d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f158870e;

        public OpenBusinessViewExtraArgs(android.os.Parcel parcel, k91.l0 l0Var) {
            this.f158869d = parcel.readByte() != 0;
            this.f158870e = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: toString */
        public java.lang.String m50100x9616526c() {
            return "OpenBusinessViewExtraArgs{sticky=" + this.f158869d + ", disableVisibilityEvent=" + this.f158870e + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeByte(this.f158869d ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f158870e ? (byte) 1 : (byte) 0);
        }
    }

    public C11812xa040dc98(android.os.Parcel parcel, k91.l0 l0Var) {
        a(parcel);
    }

    public void a(android.os.Parcel parcel) {
        this.f158855d = parcel.readInt();
        this.f158856e = parcel.readString();
        this.f158857f = parcel.readString();
        this.f158858g = parcel.readString();
        this.f158860i = parcel.readString();
        this.f158861m = parcel.readString();
        this.f158862n = parcel.readInt();
        this.f158863o = parcel.readString();
        this.f158859h = parcel.readString();
        this.f158865q = parcel.readString();
        this.f158866r = parcel.readString();
        this.f158867s = parcel.readString();
        this.f158864p = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98.OpenBusinessViewExtraArgs) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98.OpenBusinessViewExtraArgs.class.getClassLoader());
        this.f158868t = parcel.readString();
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98) {
        if (c11812xa040dc98 == null) {
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        c11812xa040dc98.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        a(obtain);
        obtain.recycle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m50098x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandLaunchReferrer{launchScene=");
        sb6.append(this.f158855d);
        sb6.append(", appId='");
        sb6.append(this.f158856e);
        sb6.append("', extraData='");
        sb6.append(this.f158857f);
        sb6.append("', url='");
        sb6.append(this.f158860i);
        sb6.append("', agentId='");
        sb6.append(this.f158861m);
        sb6.append("', sourceType='");
        sb6.append(this.f158862n);
        sb6.append("', businessType='");
        sb6.append(this.f158863o);
        sb6.append('\'');
        if (this.f158864p != null) {
            str = ", openBusinessViewExtraArgs=" + this.f158864p;
        } else {
            str = "";
        }
        sb6.append(str);
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f158855d);
        parcel.writeString(this.f158856e);
        parcel.writeString(this.f158857f);
        parcel.writeString(this.f158858g);
        parcel.writeString(this.f158860i);
        parcel.writeString(this.f158861m);
        parcel.writeInt(this.f158862n);
        parcel.writeString(this.f158863o);
        parcel.writeString(this.f158859h);
        parcel.writeString(this.f158865q);
        parcel.writeString(this.f158866r);
        parcel.writeString(this.f158867s);
        parcel.writeParcelable(this.f158864p, i17);
        parcel.writeString(this.f158868t);
    }
}
