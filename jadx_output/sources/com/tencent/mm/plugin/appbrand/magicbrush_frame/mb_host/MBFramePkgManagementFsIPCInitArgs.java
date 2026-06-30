package com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/magicbrush_frame/mb_host/MBFramePkgManagementFsIPCInitArgs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class MBFramePkgManagementFsIPCInitArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs> CREATOR = new fh1.m0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f85741d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f85742e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f85743f;

    public MBFramePkgManagementFsIPCInitArgs(java.lang.String bizInstanceName, java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader wxaCommLib) {
        kotlin.jvm.internal.o.g(bizInstanceName, "bizInstanceName");
        kotlin.jvm.internal.o.g(wxaCommLib, "wxaCommLib");
        this.f85741d = bizInstanceName;
        this.f85742e = str;
        this.f85743f = wxaCommLib;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs mBFramePkgManagementFsIPCInitArgs = (com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs) obj;
        return kotlin.jvm.internal.o.b(this.f85741d, mBFramePkgManagementFsIPCInitArgs.f85741d) && kotlin.jvm.internal.o.b(this.f85742e, mBFramePkgManagementFsIPCInitArgs.f85742e) && kotlin.jvm.internal.o.b(this.f85743f, mBFramePkgManagementFsIPCInitArgs.f85743f);
    }

    public int hashCode() {
        int hashCode = this.f85741d.hashCode() * 31;
        java.lang.String str = this.f85742e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f85743f.hashCode();
    }

    public java.lang.String toString() {
        return "MBFramePkgManagementFsIPCInitArgs(bizInstanceName=" + this.f85741d + ", fsPath=" + this.f85742e + ", wxaCommLib=" + this.f85743f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f85741d);
        out.writeString(this.f85742e);
        out.writeParcelable(this.f85743f, i17);
    }
}
