package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public abstract class w8 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f157559a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v8 f157560b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f157561c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f157562d;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    static {
        /*
            java.lang.String r0 = a()     // Catch: java.lang.Exception -> L21
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)     // Catch: java.lang.Exception -> L21
            if (r1 != 0) goto L21
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r0)     // Catch: java.lang.Exception -> L21
            if (r1 == 0) goto L21
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L21
            java.lang.String r0 = com.p314xaae8f345.mm.vfs.w6.M(r0)     // Catch: java.lang.Exception -> L21
            r1.<init>(r0)     // Catch: java.lang.Exception -> L21
            java.lang.String r0 = "version"
            int r0 = r1.optInt(r0)     // Catch: java.lang.Exception -> L21
            goto L22
        L21:
            r0 = -1
        L22:
            com.tencent.mm.plugin.appbrand.appcache.v8 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v8.STABLE
            r2 = 0
            if (r0 <= 0) goto L2c
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a = r0
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157560b = r1
            goto L30
        L2c:
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a = r2
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157560b = r1
        L30:
            int r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a
            if (r0 <= 0) goto L35
            r2 = 1
        L35:
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157561c = r2
            r0 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157562d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.m49565x8c160ea9():void");
    }

    public static java.lang.String a() {
        return new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath() + "/MockLibInfo.json").o();
    }

    public static java.io.InputStream b(java.lang.String str) {
        android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
        try {
            return str.endsWith(".js") ? assets.open(str.concat(".nocompress"), 3) : assets.open(str, 3);
        } catch (java.lang.Exception e17) {
            if (!(e17 instanceof java.io.FileNotFoundException)) {
                return null;
            }
            try {
                return assets.open(str, 3);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }
}
