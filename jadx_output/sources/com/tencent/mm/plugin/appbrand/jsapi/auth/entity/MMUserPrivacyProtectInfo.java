package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMUserPrivacyProtectInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/auth/entity/v", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MMUserPrivacyProtectInfo implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.v CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.v(null);

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo f79479f = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo(false, "");

    /* renamed from: d, reason: collision with root package name */
    public final boolean f79480d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f79481e;

    public MMUserPrivacyProtectInfo(boolean z17, java.lang.String str) {
        this.f79480d = z17;
        this.f79481e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeByte(this.f79480d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f79481e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MMUserPrivacyProtectInfo(r45.pw6 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "info"
            kotlin.jvm.internal.o.g(r3, r0)
            boolean r0 = r3.f383440d
            java.lang.String r3 = r3.f383441e
            java.lang.String r1 = "wording"
            kotlin.jvm.internal.o.f(r3, r1)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo.<init>(r45.pw6):void");
    }
}
