package com.tencent.mm.magicbrush.plugin.scl.jsapi.touch;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/magicbrush/plugin/scl/jsapi/touch/MBJsApiSetGestureRects$IPCCallback", "Landroid/os/Parcelable;", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final /* data */ class MBJsApiSetGestureRects$IPCCallback implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback> CREATOR = new com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.a();

    /* renamed from: d, reason: collision with root package name */
    public final long f68667d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f68668e;

    public MBJsApiSetGestureRects$IPCCallback(long j17, java.lang.String str) {
        this.f68667d = j17;
        this.f68668e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback)) {
            return false;
        }
        com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback mBJsApiSetGestureRects$IPCCallback = (com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback) obj;
        return this.f68667d == mBJsApiSetGestureRects$IPCCallback.f68667d && kotlin.jvm.internal.o.b(this.f68668e, mBJsApiSetGestureRects$IPCCallback.f68668e);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f68667d) * 31;
        java.lang.String str = this.f68668e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "IPCCallback(errCode=" + this.f68667d + ", errMsg=" + this.f68668e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeLong(this.f68667d);
        out.writeString(this.f68668e);
    }
}
