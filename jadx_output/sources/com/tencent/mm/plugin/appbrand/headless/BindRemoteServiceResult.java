package com.tencent.mm.plugin.appbrand.headless;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/headless/BindRemoteServiceResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class BindRemoteServiceResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult> CREATOR = new com.tencent.mm.plugin.appbrand.headless.l();

    /* renamed from: d, reason: collision with root package name */
    public final int f78280d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78281e;

    public BindRemoteServiceResult(int i17, java.lang.String str) {
        this.f78280d = i17;
        this.f78281e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult bindRemoteServiceResult = (com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult) obj;
        return this.f78280d == bindRemoteServiceResult.f78280d && kotlin.jvm.internal.o.b(this.f78281e, bindRemoteServiceResult.f78281e);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f78280d) * 31;
        java.lang.String str = this.f78281e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "BindRemoteServiceResult(errCode=" + this.f78280d + ", errMsg=" + this.f78281e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f78280d);
        out.writeString(this.f78281e);
    }

    public /* synthetic */ BindRemoteServiceResult(int i17, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, (i18 & 2) != 0 ? null : str);
    }
}
