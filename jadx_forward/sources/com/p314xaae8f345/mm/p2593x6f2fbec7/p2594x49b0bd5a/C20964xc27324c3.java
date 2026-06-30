package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* renamed from: com.tencent.mm.sandbox.monitor.ErrLog$Error */
/* loaded from: classes11.dex */
class C20964xc27324c3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3> f39170x681a0c0c = new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f273806d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f273807e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f273808f;

    /* renamed from: g, reason: collision with root package name */
    public final long f273809g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f273810h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f273811i;

    public C20964xc27324c3(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = o45.wf.f424556a;
        sb6.append(wo.q.f529313a);
        sb6.append("_");
        sb6.append(o45.wf.f424562g);
        sb6.append("_");
        sb6.append(android.os.Build.CPU_ABI);
        this.f273806d = sb6.toString();
        this.f273807e = str;
        this.f273808f = str2;
        this.f273809g = j17;
        this.f273810h = str3;
        this.f273811i = false;
        this.f273811i = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m77654x9616526c() {
        return this.f273807e + "," + this.f273806d + "," + this.f273808f + ",time_" + this.f273809g + ",error_" + this.f273810h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f273807e);
        parcel.writeString(this.f273808f);
        parcel.writeLong(this.f273809g);
        parcel.writeString(this.f273810h);
        parcel.writeByte(this.f273811i ? (byte) 1 : (byte) 0);
    }

    public C20964xc27324c3(android.os.Parcel parcel) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = o45.wf.f424556a;
        sb6.append(wo.q.f529313a);
        sb6.append("_");
        sb6.append(o45.wf.f424562g);
        sb6.append("_");
        sb6.append(android.os.Build.CPU_ABI);
        this.f273806d = sb6.toString();
        this.f273807e = parcel.readString();
        this.f273808f = parcel.readString();
        this.f273809g = parcel.readLong();
        this.f273810h = parcel.readString();
        this.f273811i = parcel.readByte() != 0;
    }
}
