package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes7.dex */
public class n implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.minigame.download.mmdownloader.WVADownloadState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.minigame.download.mmdownloader.WVADownloadState[i17];
    }
}
