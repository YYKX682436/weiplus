package zr5;

/* loaded from: classes13.dex */
public final class b extends bs5.c {

    /* renamed from: d, reason: collision with root package name */
    public final bs5.d f556741d;

    public b(int i17) {
        super(i17);
        this.f556741d = null;
        this.f556741d = new zr5.c();
    }

    @Override // bs5.c
    public java.lang.String e(java.lang.String str, java.lang.String str2) {
        return zr5.a.a(str, str2);
    }

    @Override // bs5.c
    public java.lang.String f() {
        return "DesHttp";
    }

    @Override // bs5.c
    public java.lang.String g() {
        return "DesHttp(" + this.f105547b + ")";
    }

    @Override // bs5.c
    public java.net.SocketAddress h(java.lang.String str, int i17) {
        return this.f556741d.b(str, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
    @Override // bs5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String i(java.lang.String r8, java.lang.String r9, bs5.q r10) {
        /*
            r7 = this;
            java.lang.String[] r0 = kr5.d.f393064a
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r0 = r0.contains(r9)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r3 = 10
            long r3 = (long) r3
            r5 = 60
            long r3 = r3 * r5
            long r1 = r1 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r9 = 59
            r3.append(r9)
            r3.append(r1)
            java.lang.String r9 = r3.toString()
            java.lang.String r1 = r10.f105590c
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            r3 = 1
            if (r2 != 0) goto L60
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L3c
            goto L60
        L3c:
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = "utf-8"
            byte[] r1 = r1.getBytes(r4)     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = "DES"
            r2.<init>(r1, r4)     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "DES/ECB/PKCS5Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Exception -> L60
            r1.init(r3, r2)     // Catch: java.lang.Exception -> L60
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Exception -> L60
            byte[] r9 = r1.doFinal(r9)     // Catch: java.lang.Exception -> L60
            java.lang.String r9 = bs5.p.a(r9)     // Catch: java.lang.Exception -> L60
            goto L62
        L60:
            java.lang.String r9 = ""
        L62:
            int r1 = r7.f105547b
            java.lang.String r10 = r10.f105589b
            if (r1 == r3) goto L90
            r2 = 2
            if (r1 == r2) goto L89
            r2 = 3
            if (r1 != r2) goto L75
            java.lang.String r1 = "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&type=addrs"
            java.lang.String r9 = bs5.r.b(r9, r10, r1, r0)
            goto L96
        L75:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unexpected value: "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L89:
            java.lang.String r1 = "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&type=aaaa"
            java.lang.String r9 = bs5.r.b(r9, r10, r1, r0)
            goto L96
        L90:
            java.lang.String r1 = "dn=%s&ip=%s&clientip=1&ttl=1&id=%s"
            java.lang.String r9 = bs5.r.b(r9, r10, r1, r0)
        L96:
            bs5.d r10 = r7.f556741d
            java.lang.String r8 = r10.c(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zr5.b.i(java.lang.String, java.lang.String, bs5.q):java.lang.String");
    }
}
