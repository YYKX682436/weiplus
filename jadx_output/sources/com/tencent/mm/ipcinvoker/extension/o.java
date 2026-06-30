package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public class o implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.extension.XParcelableWrapper xParcelableWrapper = new com.tencent.mm.ipcinvoker.extension.XParcelableWrapper(null);
        if (parcel.readInt() == 1) {
            java.lang.String readString = parcel.readString();
            java.util.Map map = com.tencent.mm.ipcinvoker.v0.f68408a;
            android.support.v4.media.f.a(qk0.c.d(readString, com.tencent.mm.ipcinvoker.extension.m.class));
        }
        return xParcelableWrapper;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.extension.XParcelableWrapper[i17];
    }
}
