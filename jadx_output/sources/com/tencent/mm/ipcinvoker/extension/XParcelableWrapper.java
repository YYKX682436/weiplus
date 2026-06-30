package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public class XParcelableWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.extension.XParcelableWrapper> CREATOR = new com.tencent.mm.ipcinvoker.extension.o();

    public XParcelableWrapper(com.tencent.mm.ipcinvoker.extension.o oVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(0);
    }
}
