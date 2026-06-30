package com.google.android.gms.auth.api.proxy;

/* loaded from: classes13.dex */
public class ProxyResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.proxy.ProxyResponse> CREATOR = new com.google.android.gms.auth.api.proxy.zze();
    public static final int STATUS_CODE_NO_CONNECTION = -1;
    public final byte[] body;
    public final int googlePlayServicesStatusCode;
    public final android.app.PendingIntent recoveryAction;
    public final int statusCode;
    private final int versionCode;
    private final android.os.Bundle zzdw;

    public ProxyResponse(int i17, int i18, android.app.PendingIntent pendingIntent, int i19, android.os.Bundle bundle, byte[] bArr) {
        this.versionCode = i17;
        this.googlePlayServicesStatusCode = i18;
        this.statusCode = i19;
        this.zzdw = bundle;
        this.body = bArr;
        this.recoveryAction = pendingIntent;
    }

    public static com.google.android.gms.auth.api.proxy.ProxyResponse createErrorProxyResponse(int i17, android.app.PendingIntent pendingIntent, int i18, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr) {
        return new com.google.android.gms.auth.api.proxy.ProxyResponse(1, i17, pendingIntent, i18, zzd(map), bArr);
    }

    private static android.os.Bundle zzd(java.util.Map<java.lang.String, java.lang.String> map) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (map == null) {
            return bundle;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        if (this.zzdw == null) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.zzdw.keySet()) {
            hashMap.put(str, this.zzdw.getString(str));
        }
        return hashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.googlePlayServicesStatusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.recoveryAction, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 4, this.zzdw, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 5, this.body, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ProxyResponse(int i17, android.app.PendingIntent pendingIntent, int i18, android.os.Bundle bundle, byte[] bArr) {
        this(1, i17, pendingIntent, i18, bundle, bArr);
    }

    private ProxyResponse(int i17, android.os.Bundle bundle, byte[] bArr) {
        this(1, 0, null, i17, bundle, bArr);
    }

    public ProxyResponse(int i17, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr) {
        this(i17, zzd(map), bArr);
    }
}
