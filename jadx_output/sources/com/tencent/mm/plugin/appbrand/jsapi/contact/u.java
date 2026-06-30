package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes12.dex */
public class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask[i17];
    }
}
