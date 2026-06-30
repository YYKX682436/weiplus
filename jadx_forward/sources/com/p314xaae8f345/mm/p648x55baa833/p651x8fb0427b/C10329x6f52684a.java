package com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b;

/* renamed from: com.tencent.mm.chatroom.storage.GroupToolItem */
/* loaded from: classes11.dex */
public class C10329x6f52684a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a> f27780x681a0c0c = new rn.f();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145215d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145216e;

    /* renamed from: f, reason: collision with root package name */
    public long f145217f;

    public C10329x6f52684a() {
        this.f145215d = "";
        this.f145216e = "";
        this.f145217f = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m43513xb2c87fbf(java.lang.Object obj) {
        return obj != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a) obj).f145215d, this.f145215d);
    }

    /* renamed from: toString */
    public java.lang.String m43514x9616526c() {
        return "GroupToolItem{username='" + this.f145215d + "', path='" + this.f145216e + "', updateTime=" + this.f145217f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f145215d);
        parcel.writeString(this.f145216e);
        parcel.writeLong(this.f145217f);
    }

    public C10329x6f52684a(java.lang.String str, java.lang.String str2) {
        this.f145217f = 0L;
        this.f145215d = str;
        this.f145216e = str2;
    }

    public C10329x6f52684a(java.lang.String str, java.lang.String str2, long j17) {
        this.f145215d = str;
        this.f145216e = str2;
        this.f145217f = j17;
    }

    public C10329x6f52684a(android.os.Parcel parcel) {
        this.f145215d = "";
        this.f145216e = "";
        this.f145217f = 0L;
        this.f145215d = parcel.readString();
        this.f145216e = parcel.readString();
        this.f145217f = parcel.readLong();
    }
}
