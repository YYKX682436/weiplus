package com.tencent.mm.msgsubscription;

/* loaded from: classes9.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData itemUiData = new com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        itemUiData.f71777d = readString;
        itemUiData.f71778e = parcel.readInt();
        itemUiData.f71779f = parcel.readInt() == 1;
        itemUiData.f71780g = parcel.readInt() == 0;
        return itemUiData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData[i17];
    }
}
