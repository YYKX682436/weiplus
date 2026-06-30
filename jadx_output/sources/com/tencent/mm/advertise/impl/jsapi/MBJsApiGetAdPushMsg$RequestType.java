package com.tencent.mm.advertise.impl.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/advertise/impl/jsapi/MBJsApiGetAdPushMsg$RequestType", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MBJsApiGetAdPushMsg$RequestType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$RequestType> CREATOR = new com.tencent.mm.advertise.impl.jsapi.r();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f53166d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f53167e;

    public MBJsApiGetAdPushMsg$RequestType(java.lang.String slotid, java.lang.String bizName) {
        kotlin.jvm.internal.o.g(slotid, "slotid");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        this.f53166d = slotid;
        this.f53167e = bizName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$RequestType)) {
            return false;
        }
        com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$RequestType mBJsApiGetAdPushMsg$RequestType = (com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$RequestType) obj;
        return kotlin.jvm.internal.o.b(this.f53166d, mBJsApiGetAdPushMsg$RequestType.f53166d) && kotlin.jvm.internal.o.b(this.f53167e, mBJsApiGetAdPushMsg$RequestType.f53167e);
    }

    public int hashCode() {
        return (this.f53166d.hashCode() * 31) + this.f53167e.hashCode();
    }

    public java.lang.String toString() {
        return "RequestType(slotid=" + this.f53166d + ", bizName=" + this.f53167e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f53166d);
        out.writeString(this.f53167e);
    }
}
