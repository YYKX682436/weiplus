package com.tencent.mm.plugin.appbrand.ad.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/ad/jsapi/JsApiGetAdPushMsg$AdPushMsgListWrapper", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiGetAdPushMsg$AdPushMsgListWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$AdPushMsgListWrapper> CREATOR = new com.tencent.mm.plugin.appbrand.ad.jsapi.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f74897d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74898e;

    public JsApiGetAdPushMsg$AdPushMsgListWrapper(java.util.List msgDataList, boolean z17) {
        kotlin.jvm.internal.o.g(msgDataList, "msgDataList");
        this.f74897d = msgDataList;
        this.f74898e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$AdPushMsgListWrapper)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$AdPushMsgListWrapper jsApiGetAdPushMsg$AdPushMsgListWrapper = (com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$AdPushMsgListWrapper) obj;
        return kotlin.jvm.internal.o.b(this.f74897d, jsApiGetAdPushMsg$AdPushMsgListWrapper.f74897d) && this.f74898e == jsApiGetAdPushMsg$AdPushMsgListWrapper.f74898e;
    }

    public int hashCode() {
        return (this.f74897d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f74898e);
    }

    public java.lang.String toString() {
        return "AdPushMsgListWrapper(msgDataList=" + this.f74897d + ", status=" + this.f74898e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f74897d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        out.writeInt(this.f74898e ? 1 : 0);
    }
}
