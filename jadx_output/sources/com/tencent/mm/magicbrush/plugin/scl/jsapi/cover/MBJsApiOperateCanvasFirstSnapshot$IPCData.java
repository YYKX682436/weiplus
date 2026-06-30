package com.tencent.mm.magicbrush.plugin.scl.jsapi.cover;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/magicbrush/plugin/scl/jsapi/cover/MBJsApiOperateCanvasFirstSnapshot$IPCData", "Landroid/os/Parcelable;", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class MBJsApiOperateCanvasFirstSnapshot$IPCData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.magicbrush.plugin.scl.jsapi.cover.MBJsApiOperateCanvasFirstSnapshot$IPCData> CREATOR = new com.tencent.mm.magicbrush.plugin.scl.jsapi.cover.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68654d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f68655e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f68656f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f68657g;

    public MBJsApiOperateCanvasFirstSnapshot$IPCData(java.lang.String action, java.lang.String extInfo, java.lang.String instanceName, java.lang.String snapshotLocalPath) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(snapshotLocalPath, "snapshotLocalPath");
        this.f68654d = action;
        this.f68655e = extInfo;
        this.f68656f = instanceName;
        this.f68657g = snapshotLocalPath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.magicbrush.plugin.scl.jsapi.cover.MBJsApiOperateCanvasFirstSnapshot$IPCData)) {
            return false;
        }
        com.tencent.mm.magicbrush.plugin.scl.jsapi.cover.MBJsApiOperateCanvasFirstSnapshot$IPCData mBJsApiOperateCanvasFirstSnapshot$IPCData = (com.tencent.mm.magicbrush.plugin.scl.jsapi.cover.MBJsApiOperateCanvasFirstSnapshot$IPCData) obj;
        return kotlin.jvm.internal.o.b(this.f68654d, mBJsApiOperateCanvasFirstSnapshot$IPCData.f68654d) && kotlin.jvm.internal.o.b(this.f68655e, mBJsApiOperateCanvasFirstSnapshot$IPCData.f68655e) && kotlin.jvm.internal.o.b(this.f68656f, mBJsApiOperateCanvasFirstSnapshot$IPCData.f68656f) && kotlin.jvm.internal.o.b(this.f68657g, mBJsApiOperateCanvasFirstSnapshot$IPCData.f68657g);
    }

    public int hashCode() {
        return (((((this.f68654d.hashCode() * 31) + this.f68655e.hashCode()) * 31) + this.f68656f.hashCode()) * 31) + this.f68657g.hashCode();
    }

    public java.lang.String toString() {
        return "IPCData(action=" + this.f68654d + ", extInfo=" + this.f68655e + ", instanceName=" + this.f68656f + ", snapshotLocalPath=" + this.f68657g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f68654d);
        out.writeString(this.f68655e);
        out.writeString(this.f68656f);
        out.writeString(this.f68657g);
    }
}
