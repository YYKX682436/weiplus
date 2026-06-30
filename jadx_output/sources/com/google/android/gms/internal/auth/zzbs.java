package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public abstract class zzbs extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    private static java.lang.String zzhq = "AUTH";

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public byte[] toByteArray() {
        try {
            return toString().getBytes(com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException unused) {
            return null;
        }
    }
}
