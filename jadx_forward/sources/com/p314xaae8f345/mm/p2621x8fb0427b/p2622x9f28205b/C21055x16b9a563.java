package com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b;

/* renamed from: com.tencent.mm.storage.emotion.SmileyPanelConfigInfo */
/* loaded from: classes4.dex */
public class C21055x16b9a563 extends dm.la implements android.os.Parcelable {

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f275426p = dm.la.m125206x3593deb(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563> f39216x681a0c0c = new z85.c0();

    public C21055x16b9a563(android.os.Parcel parcel) {
        this.f67354x4a55a2ce = parcel.readInt();
        this.f67353x4b6e619a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.la, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m78000x9616526c() {
        return "index:" + this.f67354x4a55a2ce + "key  :" + this.f67353x4b6e619a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f67354x4a55a2ce);
        parcel.writeString(this.f67353x4b6e619a);
    }

    public C21055x16b9a563() {
    }

    public C21055x16b9a563(int i17, java.lang.String str) {
        this.f67354x4a55a2ce = i17;
        this.f67353x4b6e619a = str;
    }
}
