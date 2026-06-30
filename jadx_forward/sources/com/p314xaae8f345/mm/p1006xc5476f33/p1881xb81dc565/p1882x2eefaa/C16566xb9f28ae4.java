package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa;

/* renamed from: com.tencent.mm.plugin.multitalk.data.MultiTalkGroupData */
/* loaded from: classes14.dex */
public class C16566xb9f28ae4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa.C16566xb9f28ae4> f37686x681a0c0c = new aj3.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a f231027d;

    public C16566xb9f28ae4(com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a) {
        this.f231027d = c11142xe8e5c41a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a = this.f231027d;
        java.lang.String str = c11142xe8e5c41a.f153139d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = c11142xe8e5c41a.f153140e;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = c11142xe8e5c41a.f153141f;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        parcel.writeInt(c11142xe8e5c41a.f153142g);
        java.lang.String str4 = c11142xe8e5c41a.f153143h;
        parcel.writeString(str4 != null ? str4 : "");
        parcel.writeInt(c11142xe8e5c41a.f153144i.size());
        for (int i18 = 0; i18 < c11142xe8e5c41a.f153144i.size(); i18++) {
            parcel.writeParcelable(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa.C16567x2d94d91e((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) c11142xe8e5c41a.f153144i.get(i18)), i17);
        }
    }
}
