package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
public class c0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper[i17];
    }
}
