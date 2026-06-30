package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes15.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f172431a = kz5.c1.k(new jz5.l("User-Agent", "user_agent"), new jz5.l("Cookie", "cookies"), new jz5.l("Referer", "referer"));

    public static final java.lang.String a() {
        int i17;
        java.lang.String a17 = bm5.f1.a();
        if (!(a17 == null || a17.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            int K = r26.n0.K(a17, ':', 0, false, 6, null);
            if (K >= 0 && (i17 = K + 1) <= a17.length()) {
                java.lang.String substring = a17.substring(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                return substring;
            }
        }
        return com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
    }

    public static final int b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interfaceC26164x73fc6bc6, "<this>");
        long mo100917x37a7fa50 = interfaceC26164x73fc6bc6.mo100917x37a7fa50();
        if (0 < mo100917x37a7fa50) {
            return (int) ((interfaceC26164x73fc6bc6.mo100919xac6a8d7e() * 100) / mo100917x37a7fa50);
        }
        return 0;
    }

    public static final void c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, java.lang.String url, java.util.Map headers) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interfaceC26164x73fc6bc6, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        headers.toString();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : headers.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Iterator it = f172431a.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (r26.i0.p(str, (java.lang.String) ((java.util.Map.Entry) obj).getKey(), true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
            if (entry2 != null) {
                if (((java.lang.String) linkedHashMap.put(entry2.getValue(), entry.getValue())) == null) {
                }
            }
        }
        linkedHashMap.toString();
        interfaceC26164x73fc6bc6.mo100946x683d6267(url, linkedHashMap);
    }
}
