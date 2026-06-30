package on1;

/* loaded from: classes12.dex */
public class h extends kn1.a {

    /* renamed from: c, reason: collision with root package name */
    public static on1.h f428355c;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f428356b = null;

    public h() {
        d();
    }

    public static on1.g c(java.lang.String str) {
        if (f428355c == null) {
            on1.h hVar = new on1.h();
            f428355c = hVar;
            kn1.a.a(hVar);
        }
        on1.h hVar2 = f428355c;
        if (hVar2.f428356b == null) {
            hVar2.d();
        }
        return (on1.g) ((java.util.HashMap) hVar2.f428356b).get(str);
    }

    @Override // kn1.a
    public void b() {
        f428355c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5 A[Catch: Exception -> 0x00c8, TRY_LEAVE, TryCatch #4 {Exception -> 0x00c8, blocks: (B:71:0x00c0, B:66:0x00c5), top: B:70:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r7.f428356b = r0
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.AssetManager r0 = r0.getAssets()
            r1 = 0
            java.lang.String r2 = "emojiconf"
            java.io.InputStream r0 = r0.open(r2)     // Catch: java.lang.Throwable -> La2 java.io.IOException -> La7
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9d
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9d
            java.lang.String r4 = "utf-8"
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L98 java.io.IOException -> L9d
        L21:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            if (r1 == 0) goto L8d
            java.lang.String r3 = "icon_"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            if (r1 == 0) goto L21
            on1.g r1 = new on1.g     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            r1.<init>()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
        L34:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            if (r3 == 0) goto L21
            java.lang.String r4 = "img"
            boolean r4 = r3.contains(r4)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            if (r4 == 0) goto L43
            goto L21
        L43:
            java.lang.String r4 = "="
            int r4 = r3.indexOf(r4)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            int r4 = r4 + 1
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            if (r4 < r5) goto L52
            goto L21
        L52:
            java.lang.String r4 = r3.substring(r4)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            java.lang.String r5 = "iphone"
            boolean r5 = r3.startsWith(r5)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            if (r5 == 0) goto L61
            r1.f428352b = r4     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            goto L83
        L61:
            java.lang.String r5 = "android"
            boolean r5 = r3.startsWith(r5)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            if (r5 == 0) goto L6c
            r1.f428351a = r4     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            goto L83
        L6c:
            java.lang.String r5 = "s60v3"
            boolean r5 = r3.startsWith(r5)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            if (r5 == 0) goto L78
            r1.f428353c = r4     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            goto L83
        L78:
            java.lang.String r5 = "s60v5"
            boolean r3 = r3.startsWith(r5)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            if (r3 == 0) goto L83
            r1.f428354d = r4     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
        L83:
            java.util.Map r3 = r7.f428356b     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            java.lang.String r4 = r1.f428351a     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L96
            goto L34
        L8b:
            r1 = move-exception
            goto Lbe
        L8d:
            r2.close()     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto Lbd
        L92:
            r0.close()     // Catch: java.lang.Exception -> Lbd
            goto Lbd
        L96:
            r1 = move-exception
            goto Lab
        L98:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto Lbe
        L9d:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto Lab
        La2:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto Lbe
        La7:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        Lab:
            java.lang.String r3 = "MicroMsg.EmojiCovertMap"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L8b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto Lba
            r2.close()     // Catch: java.lang.Exception -> Lbd
        Lba:
            if (r0 == 0) goto Lbd
            goto L92
        Lbd:
            return
        Lbe:
            if (r2 == 0) goto Lc3
            r2.close()     // Catch: java.lang.Exception -> Lc8
        Lc3:
            if (r0 == 0) goto Lc8
            r0.close()     // Catch: java.lang.Exception -> Lc8
        Lc8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.h.d():void");
    }
}
