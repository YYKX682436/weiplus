package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2457x798ad335;

/* renamed from: com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode */
/* loaded from: classes8.dex */
public enum EnumC19533xfc0809e implements android.os.Parcelable {
    OK,
    LOCAL_FILE_NOT_FOUND,
    PKG_INTEGRITY_FAILED,
    /* JADX INFO: Fake field, exist only in values array */
    PKG_INVALID,
    FAILED,
    CANCEL;


    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2457x798ad335.EnumC19533xfc0809e> f38790x681a0c0c = new xz4.g();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(ordinal());
    }
}
