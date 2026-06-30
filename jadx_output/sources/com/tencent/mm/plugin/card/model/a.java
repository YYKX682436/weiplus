package com.tencent.mm.plugin.card.model;

/* loaded from: classes15.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem[i17];
    }
}
