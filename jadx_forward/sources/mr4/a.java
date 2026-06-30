package mr4;

/* loaded from: classes5.dex */
public abstract class a {
    public static final java.lang.String a(java.lang.String itemInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        java.util.List f07 = r26.n0.f0(itemInfo, new java.lang.String[]{":"}, false, 0, 6, null);
        java.lang.String str = (java.lang.String) f07.get(0);
        java.nio.charset.Charset charset = vv5.d.f522083a;
        return fp.s0.b(str, charset.toString()) + ':' + fp.s0.b((java.lang.String) f07.get(1), charset.toString());
    }

    public static final java.lang.String b() {
        return c("click");
    }

    public static final java.lang.String c(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < 10; i17++) {
            sb6.append(c06.e.f119249d.d(10));
        }
        return str + '-' + currentTimeMillis + '-' + ((java.lang.Object) sb6);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f A[Catch: Exception -> 0x004a, TRY_ENTER, TryCatch #0 {Exception -> 0x004a, blocks: (B:12:0x000c, B:6:0x001f, B:9:0x0037), top: B:11:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #0 {Exception -> 0x004a, blocks: (B:12:0x000c, B:6:0x001f, B:9:0x0037), top: B:11:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String d(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "path"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "clickId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            if (r4 == 0) goto L15
            int r0 = r4.length()     // Catch: java.lang.Exception -> L4a
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            java.lang.String r1 = "toString(...)"
            java.lang.String r2 = "referClickId"
            java.lang.String r3 = "referPagePath"
            if (r0 == 0) goto L37
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4a
            r5.<init>()     // Catch: java.lang.Exception -> L4a
            fr4.s[] r0 = fr4.s.f347393d     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = "w1w-personal-msg-chat-list"
            r5.put(r3, r0)     // Catch: java.lang.Exception -> L4a
            r5.put(r2, r6)     // Catch: java.lang.Exception -> L4a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L4a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r1)     // Catch: java.lang.Exception -> L4a
            return r5
        L37:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4a
            r0.<init>(r4)     // Catch: java.lang.Exception -> L4a
            r0.put(r3, r5)     // Catch: java.lang.Exception -> L4a
            r0.put(r2, r6)     // Catch: java.lang.Exception -> L4a
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L4a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r1)     // Catch: java.lang.Exception -> L4a
            return r5
        L4a:
            if (r4 != 0) goto L4e
            java.lang.String r4 = ""
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mr4.a.d(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
