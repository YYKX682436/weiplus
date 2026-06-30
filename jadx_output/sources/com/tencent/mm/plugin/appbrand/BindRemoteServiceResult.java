package com.tencent.mm.plugin.appbrand;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/BindRemoteServiceResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class BindRemoteServiceResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.BindRemoteServiceResult> CREATOR = new com.tencent.mm.plugin.appbrand.fa();

    /* renamed from: d, reason: collision with root package name */
    public final int f74871d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f74872e;

    public BindRemoteServiceResult(int i17, java.lang.String str) {
        this.f74871d = i17;
        this.f74872e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.BindRemoteServiceResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.BindRemoteServiceResult bindRemoteServiceResult = (com.tencent.mm.plugin.appbrand.BindRemoteServiceResult) obj;
        return this.f74871d == bindRemoteServiceResult.f74871d && kotlin.jvm.internal.o.b(this.f74872e, bindRemoteServiceResult.f74872e);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f74871d) * 31;
        java.lang.String str = this.f74872e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "BindRemoteServiceResult(errCode=" + this.f74871d + ", errMsg=" + this.f74872e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f74871d);
        out.writeString(this.f74872e);
    }

    public /* synthetic */ BindRemoteServiceResult(int i17, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, (i18 & 2) != 0 ? null : str);
    }
}
