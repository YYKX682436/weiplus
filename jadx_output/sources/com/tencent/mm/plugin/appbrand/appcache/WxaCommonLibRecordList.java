package com.tencent.mm.plugin.appbrand.appcache;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/WxaCommonLibRecordList;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class WxaCommonLibRecordList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecordList> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.l8();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f75387d;

    public WxaCommonLibRecordList(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f75387d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecordList) && kotlin.jvm.internal.o.b(this.f75387d, ((com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecordList) obj).f75387d);
    }

    public int hashCode() {
        return this.f75387d.hashCode();
    }

    public java.lang.String toString() {
        return "WxaCommonLibRecordList(list=" + this.f75387d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f75387d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord) it.next()).writeToParcel(out, i17);
        }
    }
}
