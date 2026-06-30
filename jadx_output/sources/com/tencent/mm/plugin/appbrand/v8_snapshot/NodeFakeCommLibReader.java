package com.tencent.mm.plugin.appbrand.v8_snapshot;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/NodeFakeCommLibReader;", "Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;", "Lcom/tencent/mm/plugin/appbrand/appcache/IPkgInfo;", "pkgInfo", "<init>", "(Lcom/tencent/mm/plugin/appbrand/appcache/IPkgInfo;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class NodeFakeCommLibReader implements com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader> CREATOR = new com.tencent.mm.plugin.appbrand.v8_snapshot.f1();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.IPkgInfo f90658d;

    /* JADX WARN: Multi-variable type inference failed */
    public NodeFakeCommLibReader() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader
    public java.lang.String B7() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public android.content.res.AssetFileDescriptor G0(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public java.lang.String M(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public java.lang.String W0() {
        return java.lang.String.valueOf(i());
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public java.lang.String Y0() {
        return java.lang.String.valueOf(i());
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public java.io.InputStream a(java.lang.String str) {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.lang.Comparable
    public int compareTo(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader2 = iCommLibReader;
        if (iCommLibReader2 == null) {
            return -1;
        }
        if (kotlin.jvm.internal.o.b(iCommLibReader2.getClass(), com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader.class) && iCommLibReader2.i() > 0 && iCommLibReader2.i() == i()) {
            return 0;
        }
        java.lang.String Y0 = Y0();
        java.lang.String Y02 = iCommLibReader2.Y0();
        kotlin.jvm.internal.o.f(Y02, "versionBuildInfo(...)");
        return Y0.compareTo(Y02);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public int i() {
        return this.f90658d.pkgVersion();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader
    public java.lang.String qe(java.lang.String str) {
        return null;
    }

    public java.lang.String toString() {
        return "NodeFakeCommLibReader()";
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    /* renamed from: v0, reason: from getter */
    public com.tencent.mm.plugin.appbrand.appcache.IPkgInfo getF90658d() {
        return this.f90658d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f90658d, i17);
    }

    public NodeFakeCommLibReader(com.tencent.mm.plugin.appbrand.appcache.IPkgInfo pkgInfo) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        this.f90658d = pkgInfo;
    }

    public /* synthetic */ NodeFakeCommLibReader(com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? new com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakePkgInfo() : iPkgInfo);
    }
}
