package com.tencent.mm.ipcinvoker.extension.event;

/* loaded from: classes7.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.extension.event.WrapperParcelable wrapperParcelable = new com.tencent.mm.ipcinvoker.extension.event.WrapperParcelable(null);
        if (parcel.readInt() == 1) {
            wrapperParcelable.f68350d = com.tencent.mm.ipcinvoker.extension.c.c(parcel.readString(), parcel);
        }
        return wrapperParcelable;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.extension.event.WrapperParcelable[i17];
    }
}
