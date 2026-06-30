package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api;

/* renamed from: com.tencent.mm.plugin.scanner.api.BaseScanRequest */
/* loaded from: classes.dex */
public class C17264x215089a1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17264x215089a1> f37912x681a0c0c = new ry3.a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f240195d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240196e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240197f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240198g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240199h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Bundle f240200i;

    public C17264x215089a1() {
        this.f240195d = false;
        this.f240196e = false;
        this.f240197f = false;
        this.f240198g = true;
        this.f240199h = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m68529x9616526c() {
        return java.lang.String.format("BaseScanRequest{hideBottomTab: %b, hideScanTips: %b, hideFlashSwitcher: %b, hideGalleryButton: %b, hideOptionMenu: %b}", java.lang.Boolean.valueOf(this.f240195d), java.lang.Boolean.valueOf(this.f240196e), java.lang.Boolean.valueOf(this.f240197f), java.lang.Boolean.valueOf(this.f240198g), java.lang.Boolean.valueOf(this.f240199h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f240195d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f240196e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f240197f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f240198g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f240199h ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.f240200i);
    }

    public C17264x215089a1(android.os.Parcel parcel) {
        this.f240195d = false;
        this.f240196e = false;
        this.f240197f = false;
        this.f240198g = true;
        this.f240199h = true;
        this.f240195d = parcel.readByte() != 0;
        this.f240196e = parcel.readByte() != 0;
        this.f240197f = parcel.readByte() != 0;
        this.f240198g = parcel.readByte() != 0;
        this.f240199h = parcel.readByte() != 0;
        this.f240200i = parcel.readBundle();
    }
}
