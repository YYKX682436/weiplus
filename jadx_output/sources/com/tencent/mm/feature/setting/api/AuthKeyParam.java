package com.tencent.mm.feature.setting.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/setting/api/AuthKeyParam;", "Landroid/os/Parcelable;", "setting-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class AuthKeyParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.setting.api.AuthKeyParam> CREATOR = new wd0.d();

    /* renamed from: d, reason: collision with root package name */
    public int f67810d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f67811e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f67812f;

    public AuthKeyParam(int i17, java.lang.String authKey, java.lang.String authKey_signature) {
        kotlin.jvm.internal.o.g(authKey, "authKey");
        kotlin.jvm.internal.o.g(authKey_signature, "authKey_signature");
        this.f67810d = i17;
        this.f67811e = authKey;
        this.f67812f = authKey_signature;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.setting.api.AuthKeyParam)) {
            return false;
        }
        com.tencent.mm.feature.setting.api.AuthKeyParam authKeyParam = (com.tencent.mm.feature.setting.api.AuthKeyParam) obj;
        return this.f67810d == authKeyParam.f67810d && kotlin.jvm.internal.o.b(this.f67811e, authKeyParam.f67811e) && kotlin.jvm.internal.o.b(this.f67812f, authKeyParam.f67812f);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f67810d) * 31) + this.f67811e.hashCode()) * 31) + this.f67812f.hashCode();
    }

    public java.lang.String toString() {
        return "AuthKeyParam(errCode=" + this.f67810d + ", authKey=" + this.f67811e + ", authKey_signature=" + this.f67812f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f67810d);
        out.writeString(this.f67811e);
        out.writeString(this.f67812f);
    }

    public /* synthetic */ AuthKeyParam(int i17, java.lang.String str, java.lang.String str2, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? "" : str, (i18 & 4) != 0 ? "" : str2);
    }
}
