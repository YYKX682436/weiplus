package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class t implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor subscribeMsgExecutor = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor(java.lang.String.valueOf(parcel.readString()));
        java.util.List list = subscribeMsgExecutor.f82316h;
        java.util.RandomAccess createTypedArrayList = parcel.createTypedArrayList(com.tencent.mm.msgsubscription.SubscribeMsgTmpItem.CREATOR);
        if (createTypedArrayList == null) {
            createTypedArrayList = kz5.p0.f313996d;
        }
        ((java.util.ArrayList) list).addAll(createTypedArrayList);
        byte[] bArr = new byte[parcel.readInt()];
        subscribeMsgExecutor.f82315g = bArr;
        parcel.readByteArray(bArr);
        subscribeMsgExecutor.f82313e = (com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData) parcel.readParcelable(com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.class.getClassLoader());
        return subscribeMsgExecutor;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor[i17];
    }
}
