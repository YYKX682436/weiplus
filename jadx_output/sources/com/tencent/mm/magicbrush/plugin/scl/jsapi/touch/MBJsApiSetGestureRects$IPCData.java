package com.tencent.mm.magicbrush.plugin.scl.jsapi.touch;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/magicbrush/plugin/scl/jsapi/touch/MBJsApiSetGestureRects$IPCData", "Landroid/os/Parcelable;", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class MBJsApiSetGestureRects$IPCData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCData> CREATOR = new com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68669d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68670e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f68671f;

    public MBJsApiSetGestureRects$IPCData(java.lang.String frameSetId, int i17, java.lang.String rects) {
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        kotlin.jvm.internal.o.g(rects, "rects");
        this.f68669d = frameSetId;
        this.f68670e = i17;
        this.f68671f = rects;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCData)) {
            return false;
        }
        com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCData mBJsApiSetGestureRects$IPCData = (com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCData) obj;
        return kotlin.jvm.internal.o.b(this.f68669d, mBJsApiSetGestureRects$IPCData.f68669d) && this.f68670e == mBJsApiSetGestureRects$IPCData.f68670e && kotlin.jvm.internal.o.b(this.f68671f, mBJsApiSetGestureRects$IPCData.f68671f);
    }

    public int hashCode() {
        return (((this.f68669d.hashCode() * 31) + java.lang.Integer.hashCode(this.f68670e)) * 31) + this.f68671f.hashCode();
    }

    public java.lang.String toString() {
        return "IPCData(frameSetId=" + this.f68669d + ", canvasId=" + this.f68670e + ", rects=" + this.f68671f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f68669d);
        out.writeInt(this.f68670e);
        out.writeString(this.f68671f);
    }
}
