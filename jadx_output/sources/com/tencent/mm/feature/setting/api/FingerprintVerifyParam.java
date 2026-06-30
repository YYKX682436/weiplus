package com.tencent.mm.feature.setting.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/setting/api/FingerprintVerifyParam;", "Landroid/os/Parcelable;", "setting-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class FingerprintVerifyParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.setting.api.FingerprintVerifyParam> CREATOR = new wd0.f1();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.feature.setting.api.AskParam f67817d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.feature.setting.api.AuthKeyParam f67818e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67819f;

    /* renamed from: g, reason: collision with root package name */
    public int f67820g;

    public FingerprintVerifyParam(com.tencent.mm.feature.setting.api.AskParam askInfo, com.tencent.mm.feature.setting.api.AuthKeyParam authKeyInfo, int i17, int i18) {
        kotlin.jvm.internal.o.g(askInfo, "askInfo");
        kotlin.jvm.internal.o.g(authKeyInfo, "authKeyInfo");
        this.f67817d = askInfo;
        this.f67818e = authKeyInfo;
        this.f67819f = i17;
        this.f67820g = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.setting.api.FingerprintVerifyParam)) {
            return false;
        }
        com.tencent.mm.feature.setting.api.FingerprintVerifyParam fingerprintVerifyParam = (com.tencent.mm.feature.setting.api.FingerprintVerifyParam) obj;
        return kotlin.jvm.internal.o.b(this.f67817d, fingerprintVerifyParam.f67817d) && kotlin.jvm.internal.o.b(this.f67818e, fingerprintVerifyParam.f67818e) && this.f67819f == fingerprintVerifyParam.f67819f && this.f67820g == fingerprintVerifyParam.f67820g;
    }

    public int hashCode() {
        return (((((this.f67817d.hashCode() * 31) + this.f67818e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f67819f)) * 31) + java.lang.Integer.hashCode(this.f67820g);
    }

    public java.lang.String toString() {
        return "FingerprintVerifyParam(askInfo=" + this.f67817d + ", authKeyInfo=" + this.f67818e + ", scene=" + this.f67819f + ", errCode=" + this.f67820g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        this.f67817d.writeToParcel(out, i17);
        this.f67818e.writeToParcel(out, i17);
        out.writeInt(this.f67819f);
        out.writeInt(this.f67820g);
    }
}
