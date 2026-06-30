package com.tencent.mm.plugin.appbrand.v8_snapshot;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/NodeFakePkgInfo;", "Lcom/tencent/mm/plugin/appbrand/appcache/IPkgInfo;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class NodeFakePkgInfo implements com.tencent.mm.plugin.appbrand.appcache.IPkgInfo {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakePkgInfo> CREATOR = new com.tencent.mm.plugin.appbrand.v8_snapshot.g1();

    @Override // com.tencent.mm.plugin.appbrand.appcache.IPkgInfo
    public java.lang.String checksumMd5() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.IPkgInfo
    public long lastModified() {
        return 0L;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.IPkgInfo
    public java.lang.String pkgPath() {
        return "/assets/node";
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.IPkgInfo
    public int pkgVersion() {
        return Integer.MAX_VALUE;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(1);
    }
}
