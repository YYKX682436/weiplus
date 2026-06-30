package com.tencent.mm.feature.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/GetEcsWeShopPoiDataActionHandler$IPCPoiRequest", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class GetEcsWeShopPoiDataActionHandler$IPCPoiRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest> CREATOR = new t00.e0();

    /* renamed from: d, reason: collision with root package name */
    public final int f65625d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65626e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65627f;

    public GetEcsWeShopPoiDataActionHandler$IPCPoiRequest(int i17, boolean z17, int i18) {
        this.f65625d = i17;
        this.f65626e = z17;
        this.f65627f = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest)) {
            return false;
        }
        com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest getEcsWeShopPoiDataActionHandler$IPCPoiRequest = (com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest) obj;
        return this.f65625d == getEcsWeShopPoiDataActionHandler$IPCPoiRequest.f65625d && this.f65626e == getEcsWeShopPoiDataActionHandler$IPCPoiRequest.f65626e && this.f65627f == getEcsWeShopPoiDataActionHandler$IPCPoiRequest.f65627f;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f65625d) * 31) + java.lang.Boolean.hashCode(this.f65626e)) * 31) + java.lang.Integer.hashCode(this.f65627f);
    }

    public java.lang.String toString() {
        return "IPCPoiRequest(poiValidTimeSec=" + this.f65625d + ", waitingPoiUpdateResult=" + this.f65626e + ", waitingPoiUpdateTimeoutSec=" + this.f65627f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f65625d);
        out.writeInt(this.f65626e ? 1 : 0);
        out.writeInt(this.f65627f);
    }
}
