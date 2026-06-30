package com.p314xaae8f345.mm.p960xd6a841b0;

/* renamed from: com.tencent.mm.modeltalkroom.MultiTalkGroupMember */
/* loaded from: classes14.dex */
public class C11143x170c3f54 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54> f32571x681a0c0c = new p21.f();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f153145d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153146e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f153147f;

    /* renamed from: g, reason: collision with root package name */
    public int f153148g;

    /* renamed from: h, reason: collision with root package name */
    public int f153149h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48212x9616526c() {
        return "MultiTalkGroupMember [usrName=" + this.f153145d + ", inviteUsrName=" + this.f153146e + ", status=" + this.f153147f + ", reason=" + this.f153148g + ", inviteTime=" + this.f153149h + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.f153145d;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f153146e;
        parcel.writeString(str2 != null ? str2 : "");
        parcel.writeInt(this.f153147f);
        parcel.writeInt(this.f153148g);
        parcel.writeInt(this.f153149h);
    }
}
