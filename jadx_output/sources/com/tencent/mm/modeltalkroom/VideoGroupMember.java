package com.tencent.mm.modeltalkroom;

/* loaded from: classes14.dex */
public class VideoGroupMember implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modeltalkroom.VideoGroupMember> CREATOR = new p21.m();

    /* renamed from: d, reason: collision with root package name */
    public int f71618d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f71619e;

    /* renamed from: f, reason: collision with root package name */
    public int f71620f;

    /* renamed from: g, reason: collision with root package name */
    public int f71621g;

    /* renamed from: h, reason: collision with root package name */
    public int f71622h;

    /* renamed from: i, reason: collision with root package name */
    public int f71623i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "VideoGroupMember [memberId=" + this.f71618d + ", wxUserName=" + this.f71619e + ", uuid=" + this.f71620f + ", videoStatus=" + this.f71621g + ", videoScreenSharingStatus=" + this.f71622h + ", memberRole=" + this.f71623i + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f71618d);
        java.lang.String str = this.f71619e;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f71620f);
        parcel.writeInt(this.f71621g);
        parcel.writeInt(this.f71622h);
        parcel.writeInt(this.f71623i);
    }
}
