package com.p314xaae8f345.mm.p965xc41bc71e;

/* loaded from: classes9.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.ItemUiData itemUiData = new com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.ItemUiData();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        itemUiData.f153310d = readString;
        itemUiData.f153311e = parcel.readInt();
        itemUiData.f153312f = parcel.readInt() == 1;
        itemUiData.f153313g = parcel.readInt() == 0;
        return itemUiData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.ItemUiData[i17];
    }
}
