package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/assist/LocalFinderAtContactParcel;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/finder/assist/z8", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.assist.LocalFinderAtContactParcel */
/* loaded from: classes10.dex */
public final class C13678x881de345 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z8 f35520x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z8(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f183518d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f183519e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f183520f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f183521g;

    /* renamed from: h, reason: collision with root package name */
    public long f183522h;

    /* renamed from: i, reason: collision with root package name */
    public int f183523i;

    /* renamed from: m, reason: collision with root package name */
    public int f183524m;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f183518d);
        parcel.writeString(this.f183519e);
        parcel.writeString(this.f183520f);
        parcel.writeByteArray(this.f183521g);
        parcel.writeLong(this.f183522h);
        parcel.writeInt(this.f183523i);
        parcel.writeInt(this.f183524m);
    }
}
