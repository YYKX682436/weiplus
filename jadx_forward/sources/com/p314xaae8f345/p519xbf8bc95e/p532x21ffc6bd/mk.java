package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class mk implements com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f131955a = true;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f131956b;

    /* renamed from: com.tencent.mapsdk.internal.mk$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f131957a;

        static {
            int[] iArr = new int[com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.m35949xcee59d22().length];
            f131957a = iArr;
            try {
                iArr[com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f131957a[com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private mk(java.lang.String str) {
        this.f131956b = str;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mk a(java.lang.String str) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mk(str);
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3
    /* renamed from: onRequest */
    public void mo36059x90f4f3b0(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        byte[] bArr;
        java.lang.String str = this.f131956b;
        if (c4329xa3f02252 == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(c4329xa3f02252.url);
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mk.AnonymousClass1.f131957a[c4329xa3f02252.f16960xad7346f1.ordinal()];
        if (i17 == 1) {
            java.lang.String query = parse.getQuery();
            if (!android.text.TextUtils.isEmpty(query)) {
                if (!f131955a && query == null) {
                    throw new java.lang.AssertionError();
                }
                for (java.lang.String str2 : query.split("&")) {
                    java.lang.String[] split = str2.split("=");
                    java.lang.String substring = str2.substring(split[0].length() + 1);
                    split[1] = substring;
                    hashMap.put(split[0], substring);
                }
            }
        } else if (i17 == 2 && ((bArr = c4329xa3f02252.f16967x2d17ac6a) == null || bArr.length > 0)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
                org.json.JSONArray names = jSONObject.names();
                for (int i18 = 0; i18 < names.length(); i18++) {
                    java.lang.String optString = names.optString(i18);
                    hashMap.put(optString, jSONObject.opt(optString));
                }
            } catch (org.json.JSONException unused) {
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(parse.getPath());
        sb6.append("?");
        if (!hashMap.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.keySet());
            java.util.Collections.sort(arrayList);
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                java.lang.String str3 = (java.lang.String) arrayList.get(i19);
                java.lang.Object obj = hashMap.get(str3);
                if (obj != null) {
                    if (i19 == arrayList.size() - 1) {
                        sb6.append(str3);
                        sb6.append("=");
                        sb6.append(obj.toString());
                    } else {
                        sb6.append(str3);
                        sb6.append("=");
                        sb6.append(obj.toString());
                        sb6.append("&");
                    }
                }
            }
        }
        sb6.append(str);
        c4329xa3f02252.url = parse.buildUpon().appendQueryParameter("sig", com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(sb6.toString())).build().toString();
    }

    private static void a(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252, java.lang.String str) {
        byte[] bArr;
        if (c4329xa3f02252 == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(c4329xa3f02252.url);
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mk.AnonymousClass1.f131957a[c4329xa3f02252.f16960xad7346f1.ordinal()];
        if (i17 == 1) {
            java.lang.String query = parse.getQuery();
            if (!android.text.TextUtils.isEmpty(query)) {
                if (!f131955a && query == null) {
                    throw new java.lang.AssertionError();
                }
                for (java.lang.String str2 : query.split("&")) {
                    java.lang.String[] split = str2.split("=");
                    java.lang.String substring = str2.substring(split[0].length() + 1);
                    split[1] = substring;
                    hashMap.put(split[0], substring);
                }
            }
        } else if (i17 == 2 && ((bArr = c4329xa3f02252.f16967x2d17ac6a) == null || bArr.length > 0)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
                org.json.JSONArray names = jSONObject.names();
                for (int i18 = 0; i18 < names.length(); i18++) {
                    java.lang.String optString = names.optString(i18);
                    hashMap.put(optString, jSONObject.opt(optString));
                }
            } catch (org.json.JSONException unused) {
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(parse.getPath());
        sb6.append("?");
        if (!hashMap.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.keySet());
            java.util.Collections.sort(arrayList);
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                java.lang.String str3 = (java.lang.String) arrayList.get(i19);
                java.lang.Object obj = hashMap.get(str3);
                if (obj != null) {
                    if (i19 == arrayList.size() - 1) {
                        sb6.append(str3);
                        sb6.append("=");
                        sb6.append(obj.toString());
                    } else {
                        sb6.append(str3);
                        sb6.append("=");
                        sb6.append(obj.toString());
                        sb6.append("&");
                    }
                }
            }
        }
        sb6.append(str);
        c4329xa3f02252.url = parse.buildUpon().appendQueryParameter("sig", com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(sb6.toString())).build().toString();
    }
}
