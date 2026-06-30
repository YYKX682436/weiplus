package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/NewSDKInvokeProcess$NewSdkInvokeBackData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class NewSDKInvokeProcess$NewSdkInvokeBackData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData> CREATOR = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.c0();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage f85555d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f85556e;

    public NewSDKInvokeProcess$NewSdkInvokeBackData(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage invokeReq, java.lang.String str) {
        kotlin.jvm.internal.o.g(invokeReq, "invokeReq");
        this.f85555d = invokeReq;
        this.f85556e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData newSDKInvokeProcess$NewSdkInvokeBackData = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData) obj;
        return kotlin.jvm.internal.o.b(this.f85555d, newSDKInvokeProcess$NewSdkInvokeBackData.f85555d) && kotlin.jvm.internal.o.b(this.f85556e, newSDKInvokeProcess$NewSdkInvokeBackData.f85556e);
    }

    public int hashCode() {
        int hashCode = this.f85555d.hashCode() * 31;
        java.lang.String str = this.f85556e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "NewSdkInvokeBackData(invokeReq=" + this.f85555d + ", backData=" + this.f85556e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        this.f85555d.writeToParcel(out, i17);
        out.writeString(this.f85556e);
    }
}
