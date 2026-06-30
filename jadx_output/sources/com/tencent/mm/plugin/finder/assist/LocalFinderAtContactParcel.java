package com.tencent.mm.plugin.finder.assist;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/assist/LocalFinderAtContactParcel;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/finder/assist/z8", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LocalFinderAtContactParcel implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.finder.assist.z8 CREATOR = new com.tencent.mm.plugin.finder.assist.z8(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f101985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f101986e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f101987f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f101988g;

    /* renamed from: h, reason: collision with root package name */
    public long f101989h;

    /* renamed from: i, reason: collision with root package name */
    public int f101990i;

    /* renamed from: m, reason: collision with root package name */
    public int f101991m;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f101985d);
        parcel.writeString(this.f101986e);
        parcel.writeString(this.f101987f);
        parcel.writeByteArray(this.f101988g);
        parcel.writeLong(this.f101989h);
        parcel.writeInt(this.f101990i);
        parcel.writeInt(this.f101991m);
    }
}
