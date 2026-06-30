package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* loaded from: classes7.dex */
public final class f1 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f157323d = new java.util.concurrent.ConcurrentHashMap();

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.b1(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 Dh(java.lang.String r8, int r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto Ld
            int r2 = r8.length()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            r3 = 0
            if (r2 == 0) goto L12
            return r3
        L12:
            java.lang.Class<com.tencent.mm.plugin.appbrand.app.r9> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class
            i95.m r2 = i95.n0.c(r2)
            com.tencent.mm.plugin.appbrand.app.r9 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9) r2
            r2.getClass()
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj()
            com.tencent.mm.plugin.appbrand.appcache.qa r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di()
            java.util.List r9 = r2.v(r8, r9)
            java.lang.String r2 = "selectAllIncludingModule…By_appId_versionType(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r2)
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.d1 r2 = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.d1
            r2.<init>()
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.e1 r4 = new com.tencent.mm.plugin.appbrand.appcache.predownload.export.e1
            r4.<init>(r2)
            java.util.List r9 = kz5.n0.F0(r9, r4)
            java.util.Iterator r9 = r9.iterator()
        L3f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r9.next()
            com.tencent.mm.plugin.appbrand.appcache.n9 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9) r2
            java.lang.String r4 = r2.f67183x55b471cc
            boolean r4 = com.p314xaae8f345.mm.vfs.w6.j(r4)
            if (r4 != 0) goto L54
            goto L3f
        L54:
            java.lang.String r4 = r2.f67177x28d45f97
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r4)
            if (r4 == 0) goto L5d
            return r2
        L5d:
            java.lang.String r4 = r2.f67177x28d45f97
            if (r4 == 0) goto L7a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = "$__APP__"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            boolean r4 = r26.i0.y(r4, r5, r1)
            if (r4 != r0) goto L7a
            r4 = r0
            goto L7b
        L7a:
            r4 = r1
        L7b:
            if (r4 == 0) goto L7e
            return r2
        L7e:
            com.tencent.mm.plugin.appbrand.appcache.y8 r4 = new com.tencent.mm.plugin.appbrand.appcache.y8
            java.lang.String r5 = r2.f67183x55b471cc
            r4.<init>(r5)
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L97
            java.lang.String r5 = "/app-config.json"
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r5 = r4.mo49523xc00e82af(r5)     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L97
            vz5.b.a(r4, r3)
            return r2
        L97:
            vz5.b.a(r4, r3)
            goto L3f
        L9b:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            vz5.b.a(r4, r8)
            throw r9
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.f1.Dh(java.lang.String, int):com.tencent.mm.plugin.appbrand.appcache.n9");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6
    public void Uf(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f157323d.put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1(str, 0, i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[RETURN] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l5(java.lang.String r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto Lc
            int r1 = r5.length()
            if (r1 != 0) goto La
            goto Lc
        La:
            r1 = r0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.Class<com.tencent.mm.plugin.appbrand.app.r9> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class
            i95.m r1 = i95.n0.c(r1)
            com.tencent.mm.plugin.appbrand.app.r9 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9) r1
            r1.getClass()
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj()
            r1 = 0
            if (r6 != 0) goto L49
            k91.m4 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij()
            java.lang.String r3 = "versionInfo"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            k91.v5 r2 = r2.k1(r5, r3)
            if (r2 == 0) goto L37
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r2.w0()
            goto L38
        L37:
            r2 = r1
        L38:
            if (r2 == 0) goto L49
            int r3 = r2.f158977d
            if (r3 <= 0) goto L49
            com.tencent.mm.plugin.appbrand.appcache.qa r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di()
            int r2 = r2.f158977d
            java.util.List r5 = r3.w(r5, r6, r2)
            goto L52
        L49:
            com.tencent.mm.plugin.appbrand.appcache.qa r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di()
            r3 = -1
            java.util.List r5 = r2.w(r5, r6, r3)
        L52:
            java.lang.String r6 = "run(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r6)
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L62
            goto L85
        L62:
            java.lang.Object r1 = r5.next()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L6d
            goto L85
        L6d:
            r6 = r1
            com.tencent.mm.plugin.appbrand.appcache.n9 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9) r6
            int r6 = r6.f67185x8987ca93
        L72:
            java.lang.Object r2 = r5.next()
            r3 = r2
            com.tencent.mm.plugin.appbrand.appcache.n9 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9) r3
            int r3 = r3.f67185x8987ca93
            if (r6 >= r3) goto L7f
            r1 = r2
            r6 = r3
        L7f:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L72
        L85:
            com.tencent.mm.plugin.appbrand.appcache.n9 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9) r1
            if (r1 == 0) goto L90
            com.tencent.mm.plugin.appbrand.appcache.i8 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i8.f157131a
            boolean r5 = r5.a(r1)
            return r5
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.f1.l5(java.lang.String, int):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 q6(java.lang.String str, int i17, int i18) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 f07 = i18 == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().f0(str, i17, new java.lang.String[0]) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().L(str, i18, i17, new java.lang.String[0]);
        if (f07 != null) {
            java.lang.String str2 = f07.f67183x55b471cc;
            if (!(str2 == null || str2.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(f07.f67183x55b471cc)) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(f07.f67183x55b471cc);
                java.lang.String[] strArr = {f07.f67186x912ff5eb, f07.f67176xd0b3bac3};
                long j17 = f07.f67178x795e65e8;
                if ((j17 <= 0 || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Zi(r6Var, j17, str, "getPkgRecord", null)) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.aj(r6Var, strArr, str, "getPkgRecord", null) : true) {
                    return f07;
                }
            }
        }
        return null;
    }

    public final java.util.List wi() {
        return new java.util.LinkedList(this.f157323d.values());
    }
}
