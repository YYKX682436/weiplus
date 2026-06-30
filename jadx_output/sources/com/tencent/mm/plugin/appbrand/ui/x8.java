package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes3.dex */
public class x8 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC.IPCDeclarePromptCallbackParam(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC.IPCDeclarePromptCallbackParam[i17];
    }
}
