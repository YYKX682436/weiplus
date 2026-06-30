package com.tencent.mm.plugin.appbrand.jsapi.profile;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/JumpToProfileResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class JumpToProfileResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.profile.z();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.profile.b0 f82761d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f82762e;

    public JumpToProfileResult(com.tencent.mm.plugin.appbrand.jsapi.profile.b0 type, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f82761d = type;
        this.f82762e = errMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult jumpToProfileResult = (com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult) obj;
        return this.f82761d == jumpToProfileResult.f82761d && kotlin.jvm.internal.o.b(this.f82762e, jumpToProfileResult.f82762e);
    }

    public int hashCode() {
        return (this.f82761d.hashCode() * 31) + this.f82762e.hashCode();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
    }

    public java.lang.String toString() {
        return "JumpToProfileResult(type=" + this.f82761d + ", errMsg=" + this.f82762e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        com.tencent.mm.plugin.appbrand.jsapi.profile.b0 b0Var = this.f82761d;
        kotlin.jvm.internal.o.g(b0Var, "<this>");
        out.writeInt(b0Var.f82780d);
        out.writeString(this.f82762e);
    }
}
