package com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api;

/* renamed from: com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest */
/* loaded from: classes5.dex */
public class C10687xa533b04c implements android.os.Parcelable, java.lang.Cloneable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c> f28926x681a0c0c = new wd0.j2();

    /* renamed from: d, reason: collision with root package name */
    public wd0.k2 f149354d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f149355e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f149356f;

    /* renamed from: g, reason: collision with root package name */
    public int f149357g;

    public C10687xa533b04c() {
        this.f149354d = wd0.k2.UNKNOWN;
        this.f149357g = 0;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c m45295x5a5dd5d() {
        try {
            com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = (com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c) super.clone();
            c10687xa533b04c.f149354d = this.f149354d;
            c10687xa533b04c.f149355e = this.f149355e;
            c10687xa533b04c.f149356f = this.f149356f == null ? null : new java.util.HashMap(this.f149356f);
            c10687xa533b04c.f149357g = this.f149357g;
            return c10687xa533b04c;
        } catch (java.lang.CloneNotSupportedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingsTranslateLanguageRequest", e17, "clone", new java.lang.Object[0]);
            return new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
        }
    }

    public com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c b(java.lang.String str, java.lang.String str2) {
        if (str != null && !str.isEmpty()) {
            if (str2 == null) {
                java.util.Map map = this.f149356f;
                if (map != null) {
                    map.remove(str);
                }
                return this;
            }
            if (this.f149356f == null) {
                this.f149356f = new java.util.HashMap();
            }
            this.f149356f.put(str, str2);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f149354d.name());
        parcel.writeString(this.f149355e);
        parcel.writeInt(this.f149357g);
        parcel.writeMap(this.f149356f);
    }

    public C10687xa533b04c(android.os.Parcel parcel) {
        wd0.k2 k2Var = wd0.k2.UNKNOWN;
        this.f149354d = k2Var;
        this.f149357g = 0;
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                k2Var = wd0.k2.m173501xdce0328(readString);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingsTranslateLanguageRequest", e17, "", new java.lang.Object[0]);
            }
        }
        this.f149354d = k2Var;
        this.f149355e = parcel.readString();
        this.f149357g = parcel.readInt();
    }
}
