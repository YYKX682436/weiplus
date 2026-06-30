package com.tencent.mm.advertise.impl.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/advertise/impl/jsapi/MBJsApiClearAdPushMsg$RequestType", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MBJsApiClearAdPushMsg$RequestType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType> CREATOR = new com.tencent.mm.advertise.impl.jsapi.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f53162d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f53163e;

    public MBJsApiClearAdPushMsg$RequestType(java.lang.String slotid, java.lang.String bizName) {
        kotlin.jvm.internal.o.g(slotid, "slotid");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        this.f53162d = slotid;
        this.f53163e = bizName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType)) {
            return false;
        }
        com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType mBJsApiClearAdPushMsg$RequestType = (com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType) obj;
        return kotlin.jvm.internal.o.b(this.f53162d, mBJsApiClearAdPushMsg$RequestType.f53162d) && kotlin.jvm.internal.o.b(this.f53163e, mBJsApiClearAdPushMsg$RequestType.f53163e);
    }

    public int hashCode() {
        return (this.f53162d.hashCode() * 31) + this.f53163e.hashCode();
    }

    public java.lang.String toString() {
        return "RequestType(slotid=" + this.f53162d + ", bizName=" + this.f53163e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f53162d);
        out.writeString(this.f53163e);
    }
}
