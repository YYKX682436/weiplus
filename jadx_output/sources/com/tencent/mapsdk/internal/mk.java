package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class mk implements com.tencent.map.tools.net.processor.RequestProcessor {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f50422a = true;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f50423b;

    /* renamed from: com.tencent.mapsdk.internal.mk$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50424a;

        static {
            int[] iArr = new int[com.tencent.map.tools.net.NetMethod.values().length];
            f50424a = iArr;
            try {
                iArr[com.tencent.map.tools.net.NetMethod.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f50424a[com.tencent.map.tools.net.NetMethod.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private mk(java.lang.String str) {
        this.f50423b = str;
    }

    public static com.tencent.mapsdk.internal.mk a(java.lang.String str) {
        return new com.tencent.mapsdk.internal.mk(str);
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public void onRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        byte[] bArr;
        java.lang.String str = this.f50423b;
        if (netRequest == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(netRequest.url);
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = com.tencent.mapsdk.internal.mk.AnonymousClass1.f50424a[netRequest.mNetMethod.ordinal()];
        if (i17 == 1) {
            java.lang.String query = parse.getQuery();
            if (!android.text.TextUtils.isEmpty(query)) {
                if (!f50422a && query == null) {
                    throw new java.lang.AssertionError();
                }
                for (java.lang.String str2 : query.split("&")) {
                    java.lang.String[] split = str2.split("=");
                    java.lang.String substring = str2.substring(split[0].length() + 1);
                    split[1] = substring;
                    hashMap.put(split[0], substring);
                }
            }
        } else if (i17 == 2 && ((bArr = netRequest.postData) == null || bArr.length > 0)) {
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
        netRequest.url = parse.buildUpon().appendQueryParameter("sig", com.tencent.map.tools.Util.getMD5String(sb6.toString())).build().toString();
    }

    private static void a(com.tencent.map.tools.net.NetRequest netRequest, java.lang.String str) {
        byte[] bArr;
        if (netRequest == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(netRequest.url);
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = com.tencent.mapsdk.internal.mk.AnonymousClass1.f50424a[netRequest.mNetMethod.ordinal()];
        if (i17 == 1) {
            java.lang.String query = parse.getQuery();
            if (!android.text.TextUtils.isEmpty(query)) {
                if (!f50422a && query == null) {
                    throw new java.lang.AssertionError();
                }
                for (java.lang.String str2 : query.split("&")) {
                    java.lang.String[] split = str2.split("=");
                    java.lang.String substring = str2.substring(split[0].length() + 1);
                    split[1] = substring;
                    hashMap.put(split[0], substring);
                }
            }
        } else if (i17 == 2 && ((bArr = netRequest.postData) == null || bArr.length > 0)) {
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
        netRequest.url = parse.buildUpon().appendQueryParameter("sig", com.tencent.map.tools.Util.getMD5String(sb6.toString())).build().toString();
    }
}
