package com.google.android.gms.auth.api.proxy;

/* loaded from: classes13.dex */
public class ProxyRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int VERSION_CODE = 2;
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final java.lang.String url;
    private final int versionCode;
    private android.os.Bundle zzdw;
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.proxy.ProxyRequest> CREATOR = new com.google.android.gms.auth.api.proxy.zzd();
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    /* loaded from: classes13.dex */
    public static class Builder {
        private java.lang.String zzdx;
        private int zzdy = com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_GET;
        private long zzdz = 3000;
        private byte[] zzea = null;
        private android.os.Bundle zzeb = new android.os.Bundle();

        public Builder(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            if (android.util.Patterns.WEB_URL.matcher(str).matches()) {
                this.zzdx = str;
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51);
            sb6.append("The supplied url [ ");
            sb6.append(str);
            sb6.append("] is not match Patterns.WEB_URL!");
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest build() {
            if (this.zzea == null) {
                this.zzea = new byte[0];
            }
            return new com.google.android.gms.auth.api.proxy.ProxyRequest(2, this.zzdx, this.zzdy, this.zzdz, this.zzea, this.zzeb);
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder putHeader(java.lang.String str, java.lang.String str2) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Header name cannot be null or empty!");
            android.os.Bundle bundle = this.zzeb;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setBody(byte[] bArr) {
            this.zzea = bArr;
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setHttpMethod(int i17) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i17 >= 0 && i17 <= com.google.android.gms.auth.api.proxy.ProxyRequest.LAST_CODE, "Unrecognized http method code.");
            this.zzdy = i17;
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setTimeoutMillis(long j17) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j17 >= 0, "The specified timeout must be non-negative.");
            this.zzdz = j17;
            return this;
        }
    }

    public ProxyRequest(int i17, java.lang.String str, int i18, long j17, byte[] bArr, android.os.Bundle bundle) {
        this.versionCode = i17;
        this.url = str;
        this.httpMethod = i18;
        this.timeoutMillis = j17;
        this.body = bArr;
        this.zzdw = bundle;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(this.zzdw.size());
        for (java.lang.String str : this.zzdw.keySet()) {
            linkedHashMap.put(str, this.zzdw.getString(str));
        }
        return java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    public java.lang.String toString() {
        java.lang.String str = this.url;
        int i17 = this.httpMethod;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 42);
        sb6.append("ProxyRequest[ url: ");
        sb6.append(str);
        sb6.append(", method: ");
        sb6.append(i17);
        sb6.append(" ]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.url, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.httpMethod);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.timeoutMillis);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.body, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 5, this.zzdw, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
