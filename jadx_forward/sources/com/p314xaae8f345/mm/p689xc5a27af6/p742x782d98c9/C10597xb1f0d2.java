package com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9;

/* renamed from: com.tencent.mm.feature.exdevice.NetworkDeviceInfo */
/* loaded from: classes8.dex */
public class C10597xb1f0d2 implements in5.c, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2> f28874x681a0c0c = new i30.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f148119d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f148120e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f148121f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f148122g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f148123h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f148124i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f148125m;

    /* renamed from: n, reason: collision with root package name */
    public final int f148126n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f148127o;

    /* renamed from: p, reason: collision with root package name */
    public int f148128p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f148129q;

    public C10597xb1f0d2() {
        this.f148127o = false;
        this.f148128p = 0;
        this.f148129q = null;
    }

    public boolean a(int i17) {
        java.util.LinkedList linkedList = this.f148129q;
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
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f148119d);
        parcel.writeString(this.f148120e);
        parcel.writeString(this.f148121f);
        parcel.writeString(this.f148122g);
        parcel.writeString(this.f148123h);
        parcel.writeString(this.f148124i);
        parcel.writeString(this.f148125m);
        parcel.writeInt(this.f148126n);
        parcel.writeByte(this.f148127o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f148128p);
        parcel.writeList(this.f148129q);
    }

    public C10597xb1f0d2(android.os.Parcel parcel) {
        this.f148127o = false;
        this.f148128p = 0;
        this.f148129q = null;
        this.f148119d = parcel.readString();
        this.f148120e = parcel.readString();
        this.f148121f = parcel.readString();
        this.f148122g = parcel.readString();
        this.f148123h = parcel.readString();
        this.f148124i = parcel.readString();
        this.f148125m = parcel.readString();
        this.f148126n = parcel.readInt();
        this.f148127o = parcel.readByte() != 0;
        this.f148128p = parcel.readInt();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f148129q = linkedList;
        parcel.readList(linkedList, java.lang.Integer.class.getClassLoader());
    }
}
