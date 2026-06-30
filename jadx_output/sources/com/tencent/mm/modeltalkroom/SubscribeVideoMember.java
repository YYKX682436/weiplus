package com.tencent.mm.modeltalkroom;

/* loaded from: classes4.dex */
public class SubscribeVideoMember implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modeltalkroom.SubscribeVideoMember> CREATOR = new p21.k();

    /* renamed from: d, reason: collision with root package name */
    public int f71617d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "SubscribeVideoMember{memberId=" + this.f71617d + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f71617d);
    }
}
