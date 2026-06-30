package pa1;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vd7 f434489a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f434490b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f434491c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("canvas_security_guard");

    /* renamed from: d, reason: collision with root package name */
    public final java.security.PublicKey f434492d;

    public e(r45.vd7 vd7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        byte[] bArr;
        this.f434489a = vd7Var;
        this.f434490b = new java.lang.ref.WeakReference(c11510xdd90c2f2);
        if (vd7Var == null || (gVar = vd7Var.f469673f) == null || (bArr = gVar.f273689a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameCanvasSecurityGuard", "hy: no pubkey retrieved");
            this.f434492d = null;
            return;
        }
        try {
            this.f434492d = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(new java.lang.String(bArr).replace("\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGameCanvasSecurityGuard", th6, "hy: can not retrieve rsa key!", new java.lang.Object[0]);
            this.f434492d = null;
        }
        java.lang.String str = this.f434489a.f469672e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(pa1.e r10, java.lang.String r11, android.graphics.Bitmap r12) {
        /*
            r45.vd7 r0 = r10.f434489a
            int r1 = r0.f469675h
            int r0 = r0.f469676i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "hy: server sample: %d, %d"
            java.lang.String r4 = "MicroMsg.WAGameCanvasSecurityGuard"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3, r2)
            r2 = 0
            if (r1 <= 0) goto L55
            if (r0 <= 0) goto L55
            r3 = 100
            if (r0 > r3) goto L55
            if (r1 <= r3) goto L25
            goto L55
        L25:
            float r1 = (float) r1
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            int r3 = r12.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            int r5 = r12.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r1
            int r1 = (int) r5
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createScaledBitmap(r12, r3, r1, r2)
            if (r12 != 0) goto L43
            java.lang.String r12 = "hy: scaled is null!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r12)
            goto L55
        L43:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
            r12.compress(r3, r0, r1)
            byte[] r12 = r1.toByteArray()
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r1)
            goto L56
        L55:
            r12 = 0
        L56:
            if (r12 == 0) goto La3
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 117(0x75, float:1.64E-43)
            r0.<init>(r1)
            byte[] r3 = new byte[r1]     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            int r5 = r12.length     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            int r5 = r5 / r1
            r6 = 1
            int r5 = r5 + r6
            r7 = r2
        L66:
            if (r7 >= r5) goto L8c
            int r8 = r7 * 117
            int r9 = r12.length     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            int r9 = r9 - r8
            int r9 = java.lang.Math.min(r1, r9)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            java.lang.System.arraycopy(r12, r8, r3, r2, r9)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            java.security.PublicKey r8 = r10.f434492d     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            java.lang.String r9 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r9)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            r9.init(r6, r8)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            byte[] r8 = r9.doFinal(r3)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            r0.write(r8)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            int r7 = r7 + 1
            goto L66
        L88:
            r10 = move-exception
            goto L9f
        L8a:
            r10 = move-exception
            goto L94
        L8c:
            byte[] r12 = r0.toByteArray()     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            r10.f(r11, r12)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            goto L9b
        L94:
            java.lang.String r11 = "hy: enc failed!"
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L88
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r10, r11, r12)     // Catch: java.lang.Throwable -> L88
        L9b:
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r0)
            goto La8
        L9f:
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r0)
            throw r10
        La3:
            java.lang.String r10 = "hy: compress failed!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r10)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pa1.e.a(pa1.e, java.lang.String, android.graphics.Bitmap):void");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 b() {
        java.lang.ref.WeakReference weakReference = this.f434490b;
        if (weakReference.get() != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) weakReference.get()).x0() != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) weakReference.get()).x0().m52169xfdaa7672() != null && (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) weakReference.get()).x0().m52169xfdaa7672().mo14682x9dee9c37() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7)) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) weakReference.get()).x0().m52169xfdaa7672().mo14682x9dee9c37();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameCanvasSecurityGuard", "hy: runtime released");
        return null;
    }

    public final ce.g c() {
        if (b() != null) {
            return (ce.g) b().B1(ce.g.class);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameCanvasSecurityGuard", "hy: GamePageLogicExt not found");
        return null;
    }

    public final boolean d() {
        return (c() == null || ((ce.o) c()).f122219g == null || ((ce.o) c()).f122219g.m34856x4a42b983().d()) ? false : true;
    }

    public void e() {
        r45.vd7 vd7Var = this.f434489a;
        if (vd7Var == null || c() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vd7Var.f469672e) || !vd7Var.f469671d || this.f434492d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameCanvasSecurityGuard", "hy: should not do make canvas bitmap!");
            return;
        }
        if (d()) {
            ce.o oVar = (ce.o) c();
            oVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "hy: markBeforeStartToBackground");
            if (oVar.f122232w.getParent() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "markBeforeStartToBackground wva 模式下暂不进行安全校验");
                return;
            }
            try {
                oVar.M();
                oVar.f122225p = oVar.f122219g.m34856x4a42b983().f130124o.d();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.Game.WAGamePageViewRenderer", e17, "hy: captureDefaultWindow error!", new java.lang.Object[0]);
            }
        }
    }

    public final void f(java.lang.String str, byte[] bArr) {
        java.lang.String str2;
        if (bArr.length > 204800) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameCanvasSecurityGuard", "triggerUploadWithData exceed max limit upload size: %d, max: %d", java.lang.Integer.valueOf(bArr.length), 204800);
            str2 = "data exceed max limit:204800,Current datalength:" + bArr.length;
            bArr = new byte[0];
        } else {
            str2 = "";
        }
        if (this.f434490b.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameCanvasSecurityGuard", "hy: runtime released when triggerUploadWithData");
            return;
        }
        java.lang.String str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.f434490b.get()).f156336n;
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.f434490b.get()).E0().f387385r.f33456x1c82a56c;
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.f434490b.get()).E0().f387385r.f156932d;
        java.lang.String g17 = kk.k.g(bArr);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x xVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sq5();
        lVar.f152198b = new r45.tq5();
        lVar.f152200d = 12630;
        lVar.f152199c = "/cgi-bin/mmgame-bin/reportserverdata";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.sq5 sq5Var = (r45.sq5) a17.f152243a.f152217a;
        sq5Var.f467459d = new java.util.LinkedList();
        r45.d73 d73Var = new r45.d73();
        d73Var.f453727d = str3;
        d73Var.f453729f = i18;
        d73Var.f453728e = i17;
        d73Var.f453732i = str;
        d73Var.f453731h = g17;
        d73Var.f453730g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        d73Var.f453733m = str2;
        sq5Var.f467459d.add(d73Var);
        ((h80.i) xVar).wi(a17, new pa1.d(this));
    }
}
