package com.tencent.mm.modeltalkroom;

/* loaded from: classes14.dex */
public class MultiTalkGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modeltalkroom.MultiTalkGroup> CREATOR = new p21.e();

    /* renamed from: g, reason: collision with root package name */
    public int f71609g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f71606d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f71607e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f71608f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f71610h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f71611i = new java.util.ArrayList();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "MultiTalkGroup [mMultiTalkGroupId=" + this.f71606d + ", mMultiTalkClientGroupId=" + this.f71607e + ", mWxGroupId=" + this.f71608f + ", mRouteId=" + this.f71609g + ", mCreatorUsrName=" + this.f71610h + ", mMultiTalkGroupMemberList=" + this.f71611i + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.f71606d;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f71607e;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f71608f;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        parcel.writeInt(this.f71609g);
        java.lang.String str4 = this.f71610h;
        parcel.writeString(str4 != null ? str4 : "");
        java.util.List list = this.f71611i;
        int size = list == null ? 0 : list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeParcelable((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) this.f71611i.get(i18), i17);
        }
    }
}
