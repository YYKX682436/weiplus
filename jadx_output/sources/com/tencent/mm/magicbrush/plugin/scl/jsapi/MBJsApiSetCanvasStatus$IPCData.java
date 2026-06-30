package com.tencent.mm.magicbrush.plugin.scl.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/magicbrush/plugin/scl/jsapi/MBJsApiSetCanvasStatus$IPCData", "Landroid/os/Parcelable;", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class MBJsApiSetCanvasStatus$IPCData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$IPCData> CREATOR = new com.tencent.mm.magicbrush.plugin.scl.jsapi.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68651d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68652e;

    public MBJsApiSetCanvasStatus$IPCData(java.lang.String frameSetId, int i17) {
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        this.f68651d = frameSetId;
        this.f68652e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$IPCData)) {
            return false;
        }
        com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$IPCData mBJsApiSetCanvasStatus$IPCData = (com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$IPCData) obj;
        return kotlin.jvm.internal.o.b(this.f68651d, mBJsApiSetCanvasStatus$IPCData.f68651d) && this.f68652e == mBJsApiSetCanvasStatus$IPCData.f68652e;
    }

    public int hashCode() {
        return (this.f68651d.hashCode() * 31) + java.lang.Integer.hashCode(this.f68652e);
    }

    public java.lang.String toString() {
        return "IPCData(frameSetId=" + this.f68651d + ", canvasId=" + this.f68652e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f68651d);
        out.writeInt(this.f68652e);
    }
}
