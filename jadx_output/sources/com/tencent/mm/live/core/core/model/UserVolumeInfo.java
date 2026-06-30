package com.tencent.mm.live.core.core.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/live/core/core/model/UserVolumeInfo;", "Landroid/os/Parcelable;", "CREATOR", "kn0/s", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class UserVolumeInfo implements android.os.Parcelable {
    public static final kn0.s CREATOR = new kn0.s(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68557d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68558e;

    /* renamed from: f, reason: collision with root package name */
    public final int f68559f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserVolumeInfo(android.os.Parcel parcel) {
        this("", 0, 0);
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f68557d = readString != null ? readString : "";
        this.f68558e = parcel.readInt();
        this.f68559f = parcel.readInt();
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getF68557d() {
        return this.f68557d;
    }

    /* renamed from: b, reason: from getter */
    public final int getF68558e() {
        return this.f68558e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f68557d);
        parcel.writeInt(this.f68558e);
        parcel.writeInt(this.f68559f);
    }

    public UserVolumeInfo(java.lang.String userId, int i17, int i18) {
        kotlin.jvm.internal.o.g(userId, "userId");
        this.f68557d = userId;
        this.f68558e = i17;
        this.f68559f = i18;
    }
}
