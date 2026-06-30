package com.tencent.mm.plugin.appbrand.screenshot;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/screenshot/AppBrandScreenshotInfo;", "Ldm/f0;", "Landroid/os/Parcelable;", "Ll81/j0;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/screenshot/x", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandScreenshotInfo extends dm.f0 implements android.os.Parcelable, l81.j0 {
    public static final com.tencent.mm.plugin.appbrand.screenshot.x CREATOR = new com.tencent.mm.plugin.appbrand.screenshot.x(null);

    public AppBrandScreenshotInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "AppBrandScreenshotInfo(screenshotPath='" + this.field_screenshotPath + "', screenshotLastModified=" + this.field_screenshotLastModified + ", screenshotMd5='" + this.field_screenshotMd5 + "', appId='" + this.field_appId + "', nickname='" + this.field_nickname + "', iconUrl='" + this.field_iconUrl + "', enterPath='" + this.field_enterPath + "', savedImgPath='" + this.field_savedImgPath + "', isGuideShown=" + this.field_isGuideShown + ", field_versionType= '" + this.field_versionType + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.field_screenshotPath);
        parcel.writeLong(this.field_screenshotLastModified);
        parcel.writeString(this.field_screenshotMd5);
        parcel.writeString(this.field_appId);
        parcel.writeString(this.field_nickname);
        parcel.writeString(this.field_iconUrl);
        parcel.writeString(this.field_enterPath);
        parcel.writeString(this.field_savedImgPath);
        parcel.writeInt(this.field_isGuideShown ? 1 : 0);
        parcel.writeInt(this.field_showSourceView);
        parcel.writeInt(this.field_versionType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppBrandScreenshotInfo(java.lang.String screenshotPath, long j17, java.lang.String str, java.lang.String appId, java.lang.String nickname, java.lang.String iconUrl, java.lang.String str2, java.lang.String str3, boolean z17, int i17, int i18) {
        this();
        kotlin.jvm.internal.o.g(screenshotPath, "screenshotPath");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        this.field_screenshotPath = screenshotPath;
        this.field_screenshotLastModified = j17;
        this.field_screenshotMd5 = str;
        this.field_appId = appId;
        this.field_nickname = nickname;
        this.field_iconUrl = iconUrl;
        this.field_enterPath = str2;
        this.field_savedImgPath = str3;
        this.field_isGuideShown = z17;
        this.field_showSourceView = i17;
        this.field_versionType = i18;
    }
}
