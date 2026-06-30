package com.p314xaae8f345.p2891x34da02;

/* renamed from: com.tencent.qbar.WxQBarResult */
/* loaded from: classes13.dex */
public class C25311x69ff7e80 extends zs5.c0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2891x34da02.C25311x69ff7e80> f45407x681a0c0c = new zs5.x0();

    /* renamed from: m, reason: collision with root package name */
    public int f296783m;

    /* renamed from: n, reason: collision with root package name */
    public int f296784n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p2891x34da02.C25310xa03ac6cd f296785o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f296786p;

    public C25311x69ff7e80(int i17, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, int i18) {
        this.f296783m = 0;
        this.f296784n = 0;
        this.f296786p = false;
        this.f556863d = i17;
        this.f556864e = str;
        this.f556865f = str2;
        this.f556866g = bArr;
        this.f556867h = str3;
        this.f556868i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f556863d);
        parcel.writeString(this.f556864e);
        parcel.writeString(this.f556865f);
        parcel.writeByteArray(this.f556866g);
        parcel.writeString(this.f556867h);
        parcel.writeInt(this.f296783m);
        parcel.writeParcelable(this.f296785o, i17);
        parcel.writeInt(this.f556868i);
        parcel.writeInt(this.f296784n);
        parcel.writeInt(this.f296786p ? 1 : 0);
    }

    public C25311x69ff7e80(android.os.Parcel parcel) {
        this.f296783m = 0;
        this.f296784n = 0;
        this.f296786p = false;
        this.f556863d = parcel.readInt();
        this.f556864e = parcel.readString();
        this.f556865f = parcel.readString();
        parcel.readByteArray(this.f556866g);
        this.f556867h = parcel.readString();
        this.f296783m = parcel.readInt();
        this.f296785o = (com.p314xaae8f345.p2891x34da02.C25310xa03ac6cd) parcel.readParcelable(com.p314xaae8f345.p2891x34da02.C25310xa03ac6cd.class.getClassLoader());
        this.f556868i = parcel.readInt();
        this.f296784n = parcel.readInt();
        this.f296786p = parcel.readByte() != 0;
    }
}
