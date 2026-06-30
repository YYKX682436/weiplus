package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* renamed from: com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState */
/* loaded from: classes15.dex */
public class C22948xa5af14f0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22948xa5af14f0> f39970x681a0c0c = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d0();

    /* renamed from: d, reason: collision with root package name */
    public int f295918d;

    /* renamed from: e, reason: collision with root package name */
    public int f295919e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f295920f;

    public C22948xa5af14f0(android.os.Parcel parcel) {
        this.f295918d = parcel.readInt();
        this.f295919e = parcel.readInt();
        this.f295920f = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f295918d);
        parcel.writeInt(this.f295919e);
        parcel.writeInt(this.f295920f ? 1 : 0);
    }

    public C22948xa5af14f0(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22948xa5af14f0 c22948xa5af14f0) {
        this.f295918d = c22948xa5af14f0.f295918d;
        this.f295919e = c22948xa5af14f0.f295919e;
        this.f295920f = c22948xa5af14f0.f295920f;
    }
}
