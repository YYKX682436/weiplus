package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class r implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.downloader.model.DownloadState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.downloader.model.DownloadState[i17];
    }
}
