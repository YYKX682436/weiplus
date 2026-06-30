package com.tencent.mm.feature.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo> CREATOR = new t00.d0();

    /* renamed from: d, reason: collision with root package name */
    public final int f65621d;

    /* renamed from: e, reason: collision with root package name */
    public final float f65622e;

    /* renamed from: f, reason: collision with root package name */
    public final float f65623f;

    /* renamed from: g, reason: collision with root package name */
    public final long f65624g;

    public GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo(int i17, float f17, float f18, long j17) {
        this.f65621d = i17;
        this.f65622e = f17;
        this.f65623f = f18;
        this.f65624g = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo)) {
            return false;
        }
        com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo = (com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo) obj;
        return this.f65621d == getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo.f65621d && java.lang.Float.compare(this.f65622e, getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo.f65622e) == 0 && java.lang.Float.compare(this.f65623f, getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo.f65623f) == 0 && this.f65624g == getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo.f65624g;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f65621d) * 31) + java.lang.Float.hashCode(this.f65622e)) * 31) + java.lang.Float.hashCode(this.f65623f)) * 31) + java.lang.Long.hashCode(this.f65624g);
    }

    public java.lang.String toString() {
        return "IPCEcsPoiInfo(errCode=" + this.f65621d + ", longitude=" + this.f65622e + ", latitude=" + this.f65623f + ", updateTime=" + this.f65624g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f65621d);
        out.writeFloat(this.f65622e);
        out.writeFloat(this.f65623f);
        out.writeLong(this.f65624g);
    }
}
