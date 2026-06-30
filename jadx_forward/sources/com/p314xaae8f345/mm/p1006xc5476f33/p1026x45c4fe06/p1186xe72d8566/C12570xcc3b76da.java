package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/screenshot/AppBrandScreenshotInfo;", "Ldm/f0;", "Landroid/os/Parcelable;", "Ll81/j0;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/screenshot/x", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo */
/* loaded from: classes7.dex */
public final class C12570xcc3b76da extends dm.f0 implements android.os.Parcelable, l81.j0 {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.x f35160x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.x(null);

    public C12570xcc3b76da() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m52514x9616526c() {
        return "AppBrandScreenshotInfo(screenshotPath='" + this.f66474x90a2b490 + "', screenshotLastModified=" + this.f66472x127cb8ea + ", screenshotMd5='" + this.f66473xe3a21bb3 + "', appId='" + this.f66466x28d45f97 + "', nickname='" + this.f66470x21f9b213 + "', iconUrl='" + this.f66468xd6403ff1 + "', enterPath='" + this.f66467x6777de18 + "', savedImgPath='" + this.f66471x6de89926 + "', isGuideShown=" + this.f66469x90d08364 + ", field_versionType= '" + this.f66476x94d24c6d + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f66474x90a2b490);
        parcel.writeLong(this.f66472x127cb8ea);
        parcel.writeString(this.f66473xe3a21bb3);
        parcel.writeString(this.f66466x28d45f97);
        parcel.writeString(this.f66470x21f9b213);
        parcel.writeString(this.f66468xd6403ff1);
        parcel.writeString(this.f66467x6777de18);
        parcel.writeString(this.f66471x6de89926);
        parcel.writeInt(this.f66469x90d08364 ? 1 : 0);
        parcel.writeInt(this.f66475xccc1ea22);
        parcel.writeInt(this.f66476x94d24c6d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12570xcc3b76da(java.lang.String screenshotPath, long j17, java.lang.String str, java.lang.String appId, java.lang.String nickname, java.lang.String iconUrl, java.lang.String str2, java.lang.String str3, boolean z17, int i17, int i18) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenshotPath, "screenshotPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        this.f66474x90a2b490 = screenshotPath;
        this.f66472x127cb8ea = j17;
        this.f66473xe3a21bb3 = str;
        this.f66466x28d45f97 = appId;
        this.f66470x21f9b213 = nickname;
        this.f66468xd6403ff1 = iconUrl;
        this.f66467x6777de18 = str2;
        this.f66471x6de89926 = str3;
        this.f66469x90d08364 = z17;
        this.f66475xccc1ea22 = i17;
        this.f66476x94d24c6d = i18;
    }
}
