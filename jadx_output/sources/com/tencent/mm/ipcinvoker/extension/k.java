package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable xIPCInvoker$WrapperParcelable = new com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable(null);
        xIPCInvoker$WrapperParcelable.f68343d = parcel.readString();
        if (parcel.readInt() == 1) {
            xIPCInvoker$WrapperParcelable.f68344e = com.tencent.mm.ipcinvoker.extension.c.c(parcel.readString(), parcel);
        }
        return xIPCInvoker$WrapperParcelable;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable[i17];
    }
}
