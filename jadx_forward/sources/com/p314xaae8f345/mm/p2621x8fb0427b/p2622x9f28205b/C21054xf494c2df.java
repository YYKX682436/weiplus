package com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b;

/* renamed from: com.tencent.mm.storage.emotion.SmileyInfo */
/* loaded from: classes12.dex */
public class C21054xf494c2df extends dm.ka implements android.os.Parcelable {
    public static final l75.e0 F = dm.ka.m125177x3593deb(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df> f39215x681a0c0c = new z85.a0();

    public C21054xf494c2df() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.ka, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m77998x9616526c() {
        return "key:" + this.f67254x4b6e619a + "/ncn:" + this.f67249xaa3a4d81 + "/nqq:" + this.f67256x93f014ec + "/nen:" + this.f67251x1406c403 + "/nth:" + this.f67257x23472918 + "/ntw:" + this.f67258x3cdfda69 + "/nposition:" + this.f67255x4a55a2ce + "/nfile Name:" + this.f67252xf1e8cfcc + "/negg index:" + this.f67250x1636f572 + "/n";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f67254x4b6e619a);
        parcel.writeString(this.f67249xaa3a4d81);
        parcel.writeString(this.f67256x93f014ec);
        parcel.writeString(this.f67258x3cdfda69);
        parcel.writeString(this.f67251x1406c403);
        parcel.writeString(this.f67257x23472918);
        parcel.writeString(this.f67252xf1e8cfcc);
        parcel.writeInt(this.f67255x4a55a2ce);
        parcel.writeInt(this.f67250x1636f572);
        parcel.writeInt(this.f67253x225ba391);
    }

    public C21054xf494c2df(android.os.Parcel parcel) {
        this.f67254x4b6e619a = parcel.readString();
        this.f67249xaa3a4d81 = parcel.readString();
        this.f67256x93f014ec = parcel.readString();
        this.f67258x3cdfda69 = parcel.readString();
        this.f67251x1406c403 = parcel.readString();
        this.f67257x23472918 = parcel.readString();
        this.f67252xf1e8cfcc = parcel.readString();
        this.f67255x4a55a2ce = parcel.readInt();
        this.f67250x1636f572 = parcel.readInt();
        this.f67253x225ba391 = parcel.readInt();
    }

    public C21054xf494c2df(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17) {
        this.f67254x4b6e619a = str;
        this.f67249xaa3a4d81 = str3;
        this.f67256x93f014ec = str2;
        this.f67251x1406c403 = str5;
        this.f67257x23472918 = str6;
        this.f67258x3cdfda69 = str4;
        this.f67255x4a55a2ce = i17;
    }

    public C21054xf494c2df(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        this.f67254x4b6e619a = str;
        this.f67249xaa3a4d81 = str3;
        this.f67256x93f014ec = str2;
        this.f67251x1406c403 = str5;
        this.f67257x23472918 = str6;
        this.f67258x3cdfda69 = str4;
        this.f67252xf1e8cfcc = str7;
        this.f67250x1636f572 = i17;
    }
}
