package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.HttpUtils */
/* loaded from: classes13.dex */
public class C2000x819d4ce9 {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private C2000x819d4ce9() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap] */
    /* renamed from: parse */
    public static java.util.Map<java.lang.String, java.lang.String> m18578x6581ab3(java.net.URI uri, java.lang.String str) {
        ?? emptyMap = java.util.Collections.emptyMap();
        java.lang.String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new java.util.HashMap();
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzx zzc2 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzx.zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzo.zzb('='));
            java.util.Iterator it = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzx.zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzo.zzb('&')).zzb().zzd(rawQuery).iterator();
            while (it.hasNext()) {
                java.util.List zzf = zzc2.zzf((java.lang.String) it.next());
                if (zzf.isEmpty() || zzf.size() > 2) {
                    throw new java.lang.IllegalArgumentException("bad parameter");
                }
                emptyMap.put(zza((java.lang.String) zzf.get(0), str), zzf.size() == 2 ? zza((java.lang.String) zzf.get(1), str) : null);
            }
        }
        return emptyMap;
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            str2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a;
        }
        try {
            return java.net.URLDecoder.decode(str, str2);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.IllegalArgumentException(e17);
        }
    }
}
