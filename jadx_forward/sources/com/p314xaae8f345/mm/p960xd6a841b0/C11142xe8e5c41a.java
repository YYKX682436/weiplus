package com.p314xaae8f345.mm.p960xd6a841b0;

/* renamed from: com.tencent.mm.modeltalkroom.MultiTalkGroup */
/* loaded from: classes14.dex */
public class C11142xe8e5c41a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a> f32570x681a0c0c = new p21.e();

    /* renamed from: g, reason: collision with root package name */
    public int f153142g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f153139d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153140e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f153141f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f153143h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f153144i = new java.util.ArrayList();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48210x9616526c() {
        return "MultiTalkGroup [mMultiTalkGroupId=" + this.f153139d + ", mMultiTalkClientGroupId=" + this.f153140e + ", mWxGroupId=" + this.f153141f + ", mRouteId=" + this.f153142g + ", mCreatorUsrName=" + this.f153143h + ", mMultiTalkGroupMemberList=" + this.f153144i + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.f153139d;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f153140e;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f153141f;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        parcel.writeInt(this.f153142g);
        java.lang.String str4 = this.f153143h;
        parcel.writeString(str4 != null ? str4 : "");
        java.util.List list = this.f153144i;
        int size = list == null ? 0 : list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeParcelable((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) this.f153144i.get(i18), i17);
        }
    }
}
