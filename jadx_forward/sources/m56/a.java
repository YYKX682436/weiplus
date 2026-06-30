package m56;

/* loaded from: classes13.dex */
public class a implements m56.b {

    /* renamed from: c, reason: collision with root package name */
    public static /* synthetic */ int[] f405868c;

    /* renamed from: a, reason: collision with root package name */
    public final l56.a f405869a;

    /* renamed from: b, reason: collision with root package name */
    public final i56.b f405870b;

    public a(i56.b bVar, l56.a aVar) {
        this.f405870b = bVar;
        this.f405869a = aVar;
    }

    public final void a(l56.c cVar, l56.i iVar) {
        i56.b bVar = this.f405870b;
        bVar.getClass();
        cVar.d("oauth_timestamp", java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()).longValue() / 1000)));
        bVar.getClass();
        cVar.d("oauth_nonce", java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()).longValue() / 1000).longValue() + java.lang.Integer.valueOf(new java.util.Random().nextInt()).intValue()));
        l56.a aVar = this.f405869a;
        cVar.d("oauth_consumer_key", aVar.f398206a);
        bVar.getClass();
        cVar.d("oauth_signature_method", "HMAC-SHA1");
        cVar.d("oauth_version", "1.0");
        aVar.getClass();
        aVar.a("generating signature...");
        bVar.getClass();
        n56.c.b(cVar, "Cannot extract base string from null object");
        java.util.Map map = cVar.f398210g;
        if (map == null || ((java.util.HashMap) map).size() <= 0) {
            throw new j56.c(cVar);
        }
        java.lang.String b17 = n56.b.b(cVar.f398215b.name());
        java.lang.String str = cVar.f398214a;
        java.lang.String str2 = "";
        java.lang.String b18 = n56.b.b(str.replaceAll("\\?.*", "").replace("\\:\\d{4}", ""));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String query = new java.net.URL(str).getQuery();
            if (query != null && query.length() > 0) {
                java.lang.String[] split = query.split("&");
                int length = split.length;
                char c17 = 0;
                int i17 = 0;
                while (i17 < length) {
                    java.lang.String[] split2 = split[i17].split("=");
                    arrayList2.add(new l56.d(n56.b.a(split2[c17]), split2.length > 1 ? n56.b.a(split2[1]) : ""));
                    i17++;
                    c17 = 0;
                }
            }
            arrayList2.addAll(cVar.f398216c.f398213a);
            arrayList.addAll(arrayList2);
            arrayList.addAll(cVar.f398217d.f398213a);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
                arrayList3.add(new l56.d((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
            }
            arrayList.addAll(arrayList3);
            l56.e eVar = new l56.e(arrayList);
            java.util.Collections.sort(eVar.f398213a);
            java.lang.String format = java.lang.String.format("%s&%s&%s", b17, b18, n56.b.b(eVar.a()));
            java.lang.String str3 = aVar.f398207b;
            java.lang.String str4 = iVar.f398226e;
            try {
                n56.c.a(format, "Base string cant be null or empty string");
                n56.c.a(str3, "Api secret cant be null or empty string");
                javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec((java.lang.String.valueOf(n56.b.b(str3)) + '&' + n56.b.b(str4)).getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), "HmacSHA1");
                javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA1");
                mac.init(secretKeySpec);
                java.lang.String replace = new java.lang.String(n56.a.b(mac.doFinal(format.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)), true)).replace(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, "");
                aVar.a("base string is: ".concat(format));
                aVar.a("signature is: " + replace);
                cVar.d("oauth_signature", replace);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appended additional OAuth parameters: ");
                if (map != null) {
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    if (hashMap.isEmpty()) {
                        str2 = "{}";
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
                            sb7.append(java.lang.String.format(", %s -> %s ", entry2.getKey().toString(), entry2.getValue().toString()));
                        }
                        str2 = "{" + sb7.substring(1) + "}";
                    }
                }
                sb6.append(str2);
                aVar.a(sb6.toString());
            } catch (java.lang.Exception e17) {
                throw new j56.d(format, e17);
            }
        } catch (java.net.MalformedURLException e18) {
            throw new j56.b("Malformed URL", e18);
        }
    }

    public final void b(l56.c cVar) {
        int[] iArr = f405868c;
        if (iArr == null) {
            iArr = new int[l56.h.valuesCustom().length];
            try {
                iArr[0] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f405868c = iArr;
        }
        l56.a aVar = this.f405869a;
        aVar.getClass();
        int i17 = iArr[0];
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            aVar.a("using Querystring signature");
            for (java.util.Map.Entry entry : ((java.util.HashMap) cVar.f398210g).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                ((java.util.ArrayList) cVar.f398216c.f398213a).add(new l56.d(str, str2));
            }
            return;
        }
        aVar.a("using Http Header signature");
        this.f405870b.getClass();
        n56.c.b(cVar, "Cannot extract a header from a null object");
        java.util.Map map = cVar.f398210g;
        if (map == null || ((java.util.HashMap) map).size() <= 0) {
            throw new j56.c(cVar);
        }
        java.util.HashMap hashMap = (java.util.HashMap) cVar.f398210g;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(hashMap.size() * 20);
        stringBuffer.append("OAuth ");
        for (java.lang.String str3 : hashMap.keySet()) {
            if (stringBuffer.length() > 6) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(java.lang.String.format("%s=\"%s\"", str3, n56.b.b((java.lang.String) hashMap.get(str3))));
        }
        ((java.util.HashMap) cVar.f398218e).put("Authorization", stringBuffer.toString());
    }

    public l56.i c(l56.i iVar, l56.k kVar) {
        this.f405870b.getClass();
        this.f405869a.getClass();
        l56.c cVar = new l56.c(l56.j.POST, "https://api.twitter.com/oauth/access_token");
        cVar.d("oauth_token", iVar.f398225d);
        cVar.d("oauth_verifier", kVar.f398231a);
        iVar.m145176x9616526c();
        a(cVar, iVar);
        b(cVar);
        l56.g c17 = cVar.c();
        k56.a aVar = new k56.a();
        java.lang.String a17 = c17.a();
        n56.c.a(a17, "Response body is incorrect. Can't extract a token from an empty string");
        return new l56.i(aVar.a(a17, k56.a.f386007a), aVar.a(a17, k56.a.f386008b), a17);
    }

    public l56.i d() {
        this.f405870b.getClass();
        l56.a aVar = this.f405869a;
        aVar.getClass();
        l56.c cVar = new l56.c(l56.j.POST, "https://api.twitter.com/oauth/request_token");
        cVar.d("oauth_callback", aVar.f398208c);
        a(cVar, l56.b.f398209a);
        b(cVar);
        java.lang.String a17 = cVar.c().a();
        k56.a aVar2 = new k56.a();
        n56.c.a(a17, "Response body is incorrect. Can't extract a token from an empty string");
        return new l56.i(aVar2.a(a17, k56.a.f386007a), aVar2.a(a17, k56.a.f386008b), a17);
    }
}
