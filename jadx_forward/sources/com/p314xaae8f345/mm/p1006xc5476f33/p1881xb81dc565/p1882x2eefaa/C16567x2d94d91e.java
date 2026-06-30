package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa;

/* renamed from: com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData */
/* loaded from: classes14.dex */
public class C16567x2d94d91e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa.C16567x2d94d91e> f37687x681a0c0c = new aj3.b();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 f231028d;

    public C16567x2d94d91e(com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54) {
        this.f231028d = c11143x170c3f54;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54 = this.f231028d;
        java.lang.String str = c11143x170c3f54.f153145d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = c11143x170c3f54.f153146e;
        parcel.writeString(str2 != null ? str2 : "");
        parcel.writeInt(c11143x170c3f54.f153147f);
        parcel.writeInt(c11143x170c3f54.f153148g);
        parcel.writeInt(c11143x170c3f54.f153149h);
    }
}
