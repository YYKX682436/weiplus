package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class x implements android.os.Parcelable.Creator {
    public x(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo appBrandScreenshotInfo = new com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo();
        appBrandScreenshotInfo.field_screenshotPath = parcel.readString();
        appBrandScreenshotInfo.field_screenshotLastModified = parcel.readLong();
        appBrandScreenshotInfo.field_screenshotMd5 = parcel.readString();
        appBrandScreenshotInfo.field_appId = parcel.readString();
        appBrandScreenshotInfo.field_nickname = parcel.readString();
        appBrandScreenshotInfo.field_iconUrl = parcel.readString();
        appBrandScreenshotInfo.field_enterPath = parcel.readString();
        appBrandScreenshotInfo.field_savedImgPath = parcel.readString();
        appBrandScreenshotInfo.field_isGuideShown = parcel.readInt() != 0;
        appBrandScreenshotInfo.field_showSourceView = parcel.readInt();
        appBrandScreenshotInfo.field_versionType = parcel.readInt();
        return appBrandScreenshotInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo[i17];
    }
}
