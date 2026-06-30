package com.tencent.mm.feature.finder.live.api.params;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/finder/live/api/params/FinderLiveGalleryParams;", "Landroid/os/Parcelable;", "CREATOR", "t40/c", "live-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveGalleryParams implements android.os.Parcelable {
    public static final t40.c CREATOR = new t40.c(null);

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f66605f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f66606g;

    /* renamed from: h, reason: collision with root package name */
    public long f66607h;

    /* renamed from: d, reason: collision with root package name */
    public int f66603d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f66604e = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f66608i = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f66603d);
        parcel.writeString(this.f66604e);
        parcel.writeString(this.f66605f);
        parcel.writeString(this.f66606g);
        parcel.writeLong(this.f66607h);
        parcel.writeString(this.f66608i);
    }
}
