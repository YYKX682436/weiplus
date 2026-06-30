package com.tencent.mm.advertise.impl.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/advertise/impl/jsapi/MBJsApiGetAdPushMsg$AdPushMsgListWrapper", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MBJsApiGetAdPushMsg$AdPushMsgListWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper> CREATOR = new com.tencent.mm.advertise.impl.jsapi.p();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f53164d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53165e;

    public MBJsApiGetAdPushMsg$AdPushMsgListWrapper(java.util.List msgDataList, boolean z17) {
        kotlin.jvm.internal.o.g(msgDataList, "msgDataList");
        this.f53164d = msgDataList;
        this.f53165e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper)) {
            return false;
        }
        com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper mBJsApiGetAdPushMsg$AdPushMsgListWrapper = (com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper) obj;
        return kotlin.jvm.internal.o.b(this.f53164d, mBJsApiGetAdPushMsg$AdPushMsgListWrapper.f53164d) && this.f53165e == mBJsApiGetAdPushMsg$AdPushMsgListWrapper.f53165e;
    }

    public int hashCode() {
        return (this.f53164d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f53165e);
    }

    public java.lang.String toString() {
        return "AdPushMsgListWrapper(msgDataList=" + this.f53164d + ", status=" + this.f53165e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f53164d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        out.writeInt(this.f53165e ? 1 : 0);
    }
}
