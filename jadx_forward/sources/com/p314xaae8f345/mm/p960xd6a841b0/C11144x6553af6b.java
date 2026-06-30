package com.p314xaae8f345.mm.p960xd6a841b0;

/* renamed from: com.tencent.mm.modeltalkroom.SubscribeVideoMember */
/* loaded from: classes4.dex */
public class C11144x6553af6b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p960xd6a841b0.C11144x6553af6b> f32572x681a0c0c = new p21.k();

    /* renamed from: d, reason: collision with root package name */
    public int f153150d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48214x9616526c() {
        return "SubscribeVideoMember{memberId=" + this.f153150d + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f153150d);
    }
}
