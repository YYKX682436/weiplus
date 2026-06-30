package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public final class c0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage.CREATOR.createFromParcel(parcel), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData[i17];
    }
}
