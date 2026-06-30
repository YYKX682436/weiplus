package com.google.android.gms.auth.api.credentials;

/* loaded from: classes13.dex */
public class Credential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.Credential> CREATOR = new com.google.android.gms.auth.api.credentials.zzd();
    public static final java.lang.String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    private final java.lang.String mName;
    private final java.lang.String zzbx;
    private final java.lang.String zzci;
    private final android.net.Uri zzcj;
    private final java.util.List<com.google.android.gms.auth.api.credentials.IdToken> zzck;
    private final java.lang.String zzcl;
    private final java.lang.String zzcm;
    private final java.lang.String zzcn;
    private final java.lang.String zzco;
    private final java.lang.String zzcp;

    /* loaded from: classes13.dex */
    public static class Builder {
        private java.lang.String mName;
        private java.lang.String zzbx;
        private final java.lang.String zzci;
        private android.net.Uri zzcj;
        private java.util.List<com.google.android.gms.auth.api.credentials.IdToken> zzck;
        private java.lang.String zzcl;
        private java.lang.String zzcm;
        private java.lang.String zzcn;
        private java.lang.String zzco;
        private java.lang.String zzcp;

        public Builder(com.google.android.gms.auth.api.credentials.Credential credential) {
            this.zzci = credential.zzci;
            this.mName = credential.mName;
            this.zzcj = credential.zzcj;
            this.zzck = credential.zzck;
            this.zzcl = credential.zzcl;
            this.zzbx = credential.zzbx;
            this.zzcm = credential.zzcm;
            this.zzcn = credential.zzcn;
            this.zzco = credential.zzco;
            this.zzcp = credential.zzcp;
        }

        public com.google.android.gms.auth.api.credentials.Credential build() {
            return new com.google.android.gms.auth.api.credentials.Credential(this.zzci, this.mName, this.zzcj, this.zzck, this.zzcl, this.zzbx, this.zzcm, this.zzcn, this.zzco, this.zzcp);
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setAccountType(java.lang.String str) {
            this.zzbx = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setName(java.lang.String str) {
            this.mName = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setPassword(java.lang.String str) {
            this.zzcl = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setProfilePictureUri(android.net.Uri uri) {
            this.zzcj = uri;
            return this;
        }

        public Builder(java.lang.String str) {
            this.zzci = str;
        }
    }

    public Credential(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.util.List<com.google.android.gms.auth.api.credentials.IdToken> list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        java.lang.String trim = ((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(trim, "credential identifier cannot be empty");
        if (str3 != null && android.text.TextUtils.isEmpty(str3)) {
            throw new java.lang.IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z17 = false;
            if (!android.text.TextUtils.isEmpty(str4)) {
                android.net.Uri parse = android.net.Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !android.text.TextUtils.isEmpty(parse.getScheme()) && !android.text.TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                    z17 = true;
                }
            }
            if (!java.lang.Boolean.valueOf(z17).booleanValue()) {
                throw new java.lang.IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!android.text.TextUtils.isEmpty(str4) && !android.text.TextUtils.isEmpty(str3)) {
            throw new java.lang.IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && android.text.TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.mName = str2;
        this.zzcj = uri;
        this.zzck = list == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list);
        this.zzci = trim;
        this.zzcl = str3;
        this.zzbx = str4;
        this.zzcm = str5;
        this.zzcn = str6;
        this.zzco = str7;
        this.zzcp = str8;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.credentials.Credential)) {
            return false;
        }
        com.google.android.gms.auth.api.credentials.Credential credential = (com.google.android.gms.auth.api.credentials.Credential) obj;
        return android.text.TextUtils.equals(this.zzci, credential.zzci) && android.text.TextUtils.equals(this.mName, credential.mName) && com.google.android.gms.common.internal.Objects.equal(this.zzcj, credential.zzcj) && android.text.TextUtils.equals(this.zzcl, credential.zzcl) && android.text.TextUtils.equals(this.zzbx, credential.zzbx) && android.text.TextUtils.equals(this.zzcm, credential.zzcm);
    }

    public java.lang.String getAccountType() {
        return this.zzbx;
    }

    public java.lang.String getFamilyName() {
        return this.zzcp;
    }

    public java.lang.String getGeneratedPassword() {
        return this.zzcm;
    }

    public java.lang.String getGivenName() {
        return this.zzco;
    }

    public java.lang.String getId() {
        return this.zzci;
    }

    public java.util.List<com.google.android.gms.auth.api.credentials.IdToken> getIdTokens() {
        return this.zzck;
    }

    public java.lang.String getName() {
        return this.mName;
    }

    public java.lang.String getPassword() {
        return this.zzcl;
    }

    public android.net.Uri getProfilePictureUri() {
        return this.zzcj;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzci, this.mName, this.zzcj, this.zzcl, this.zzbx, this.zzcm);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getProfilePictureUri(), i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getGeneratedPassword(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzcn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
