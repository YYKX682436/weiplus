package com.tencent.mm.modeltalkroom;

/* loaded from: classes14.dex */
public class MultiTalkGroupMember implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modeltalkroom.MultiTalkGroupMember> CREATOR = new p21.f();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f71612d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f71613e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f71614f;

    /* renamed from: g, reason: collision with root package name */
    public int f71615g;

    /* renamed from: h, reason: collision with root package name */
    public int f71616h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "MultiTalkGroupMember [usrName=" + this.f71612d + ", inviteUsrName=" + this.f71613e + ", status=" + this.f71614f + ", reason=" + this.f71615g + ", inviteTime=" + this.f71616h + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.f71612d;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f71613e;
        parcel.writeString(str2 != null ? str2 : "");
        parcel.writeInt(this.f71614f);
        parcel.writeInt(this.f71615g);
        parcel.writeInt(this.f71616h);
    }
}
