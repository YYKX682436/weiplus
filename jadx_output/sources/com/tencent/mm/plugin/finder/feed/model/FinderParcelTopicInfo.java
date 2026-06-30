package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes5.dex */
public class FinderParcelTopicInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.finder.feed.model.FinderParcelTopicInfo> CREATOR = new com.tencent.mm.plugin.finder.feed.model.f5();

    /* renamed from: d, reason: collision with root package name */
    public final r45.r03 f107531d;

    public FinderParcelTopicInfo(r45.r03 r03Var) {
        this.f107531d = r03Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            byte[] byteArray = this.f107531d.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        } catch (java.io.IOException unused) {
        }
    }

    public FinderParcelTopicInfo(android.os.Parcel parcel) {
        r45.r03 r03Var = new r45.r03();
        this.f107531d = r03Var;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            r03Var.parseFrom(bArr);
        } catch (java.io.IOException unused) {
        }
    }
}
