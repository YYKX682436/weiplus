package com.tencent.mm.feature.gallery.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/BizData;", "Landroid/os/Parcelable;", "gallery-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class BizData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.gallery.api.BizData> CREATOR = new e60.a();

    /* renamed from: d, reason: collision with root package name */
    public final long f67086d;

    /* renamed from: e, reason: collision with root package name */
    public final long f67087e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67088f;

    public BizData(long j17, long j18, int i17) {
        this.f67086d = j17;
        this.f67087e = j18;
        this.f67088f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.gallery.api.BizData)) {
            return false;
        }
        com.tencent.mm.feature.gallery.api.BizData bizData = (com.tencent.mm.feature.gallery.api.BizData) obj;
        return this.f67086d == bizData.f67086d && this.f67087e == bizData.f67087e && this.f67088f == bizData.f67088f;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f67086d) * 31) + java.lang.Long.hashCode(this.f67087e)) * 31) + java.lang.Integer.hashCode(this.f67088f);
    }

    public java.lang.String toString() {
        return "BizData(bizUin=" + this.f67086d + ", mid=" + this.f67087e + ", idx=" + this.f67088f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeLong(this.f67086d);
        out.writeLong(this.f67087e);
        out.writeInt(this.f67088f);
    }
}
