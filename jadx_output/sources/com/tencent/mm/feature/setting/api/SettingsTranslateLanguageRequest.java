package com.tencent.mm.feature.setting.api;

/* loaded from: classes5.dex */
public class SettingsTranslateLanguageRequest implements android.os.Parcelable, java.lang.Cloneable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest> CREATOR = new wd0.j2();

    /* renamed from: d, reason: collision with root package name */
    public wd0.k2 f67821d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f67822e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f67823f;

    /* renamed from: g, reason: collision with root package name */
    public int f67824g;

    public SettingsTranslateLanguageRequest() {
        this.f67821d = wd0.k2.UNKNOWN;
        this.f67824g = 0;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest clone() {
        try {
            com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = (com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest) super.clone();
            settingsTranslateLanguageRequest.f67821d = this.f67821d;
            settingsTranslateLanguageRequest.f67822e = this.f67822e;
            settingsTranslateLanguageRequest.f67823f = this.f67823f == null ? null : new java.util.HashMap(this.f67823f);
            settingsTranslateLanguageRequest.f67824g = this.f67824g;
            return settingsTranslateLanguageRequest;
        } catch (java.lang.CloneNotSupportedException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsTranslateLanguageRequest", e17, "clone", new java.lang.Object[0]);
            return new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
        }
    }

    public com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest b(java.lang.String str, java.lang.String str2) {
        if (str != null && !str.isEmpty()) {
            if (str2 == null) {
                java.util.Map map = this.f67823f;
                if (map != null) {
                    map.remove(str);
                }
                return this;
            }
            if (this.f67823f == null) {
                this.f67823f = new java.util.HashMap();
            }
            this.f67823f.put(str, str2);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f67821d.name());
        parcel.writeString(this.f67822e);
        parcel.writeInt(this.f67824g);
        parcel.writeMap(this.f67823f);
    }

    public SettingsTranslateLanguageRequest(android.os.Parcel parcel) {
        wd0.k2 k2Var = wd0.k2.UNKNOWN;
        this.f67821d = k2Var;
        this.f67824g = 0;
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                k2Var = wd0.k2.valueOf(readString);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsTranslateLanguageRequest", e17, "", new java.lang.Object[0]);
            }
        }
        this.f67821d = k2Var;
        this.f67822e = parcel.readString();
        this.f67824g = parcel.readInt();
    }
}
