package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a;

/* renamed from: com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify */
/* loaded from: classes8.dex */
public class C19534xa57d6e76 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19534xa57d6e76> f38791x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f269858d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f269859e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f269860f;

    public C19534xa57d6e76(java.lang.String str, boolean z17, boolean z18) {
        this.f269858d = str;
        this.f269859e = z17;
        this.f269860f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f269858d);
        parcel.writeInt(this.f269859e ? 1 : 0);
        parcel.writeInt(this.f269860f ? 1 : 0);
    }

    public C19534xa57d6e76(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.a aVar) {
        this.f269858d = parcel.readString();
        this.f269859e = parcel.readInt() == 1;
        this.f269860f = parcel.readInt() == 1;
    }
}
