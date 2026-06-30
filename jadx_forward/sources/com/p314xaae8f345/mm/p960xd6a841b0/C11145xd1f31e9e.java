package com.p314xaae8f345.mm.p960xd6a841b0;

/* renamed from: com.tencent.mm.modeltalkroom.VideoGroupMember */
/* loaded from: classes14.dex */
public class C11145xd1f31e9e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e> f32573x681a0c0c = new p21.m();

    /* renamed from: d, reason: collision with root package name */
    public int f153151d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153152e;

    /* renamed from: f, reason: collision with root package name */
    public int f153153f;

    /* renamed from: g, reason: collision with root package name */
    public int f153154g;

    /* renamed from: h, reason: collision with root package name */
    public int f153155h;

    /* renamed from: i, reason: collision with root package name */
    public int f153156i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48216x9616526c() {
        return "VideoGroupMember [memberId=" + this.f153151d + ", wxUserName=" + this.f153152e + ", uuid=" + this.f153153f + ", videoStatus=" + this.f153154g + ", videoScreenSharingStatus=" + this.f153155h + ", memberRole=" + this.f153156i + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f153151d);
        java.lang.String str = this.f153152e;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f153153f);
        parcel.writeInt(this.f153154g);
        parcel.writeInt(this.f153155h);
        parcel.writeInt(this.f153156i);
    }
}
