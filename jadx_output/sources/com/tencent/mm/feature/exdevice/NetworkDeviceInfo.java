package com.tencent.mm.feature.exdevice;

/* loaded from: classes8.dex */
public class NetworkDeviceInfo implements in5.c, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.exdevice.NetworkDeviceInfo> CREATOR = new i30.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f66586d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f66587e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f66588f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f66589g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f66590h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f66591i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f66592m;

    /* renamed from: n, reason: collision with root package name */
    public final int f66593n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f66594o;

    /* renamed from: p, reason: collision with root package name */
    public int f66595p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f66596q;

    public NetworkDeviceInfo() {
        this.f66594o = false;
        this.f66595p = 0;
        this.f66596q = null;
    }

    public boolean a(int i17) {
        java.util.LinkedList linkedList = this.f66596q;
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (((java.lang.Integer) it.next()).intValue() == i17) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f66586d);
        parcel.writeString(this.f66587e);
        parcel.writeString(this.f66588f);
        parcel.writeString(this.f66589g);
        parcel.writeString(this.f66590h);
        parcel.writeString(this.f66591i);
        parcel.writeString(this.f66592m);
        parcel.writeInt(this.f66593n);
        parcel.writeByte(this.f66594o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f66595p);
        parcel.writeList(this.f66596q);
    }

    public NetworkDeviceInfo(android.os.Parcel parcel) {
        this.f66594o = false;
        this.f66595p = 0;
        this.f66596q = null;
        this.f66586d = parcel.readString();
        this.f66587e = parcel.readString();
        this.f66588f = parcel.readString();
        this.f66589g = parcel.readString();
        this.f66590h = parcel.readString();
        this.f66591i = parcel.readString();
        this.f66592m = parcel.readString();
        this.f66593n = parcel.readInt();
        this.f66594o = parcel.readByte() != 0;
        this.f66595p = parcel.readInt();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f66596q = linkedList;
        parcel.readList(linkedList, java.lang.Integer.class.getClassLoader());
    }
}
