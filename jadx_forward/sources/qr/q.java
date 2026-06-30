package qr;

/* loaded from: classes12.dex */
public class q implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qr.s f447567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qr.r f447568f;

    public q(qr.r rVar, java.lang.String str, qr.s sVar) {
        this.f447568f = rVar;
        this.f447566d = str;
        this.f447567e = sVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        qr.r rVar = this.f447568f;
        rVar.f447557f = hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadCDN", "cdn callback: %s, %s", str, java.lang.Integer.valueOf(i17));
        if (i17 != 0) {
            if (com.p314xaae8f345.mm.vfs.w6.j(rVar.f447573h)) {
                com.p314xaae8f345.mm.vfs.w6.h(rVar.f447573h);
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(rVar.f447574i)) {
                com.p314xaae8f345.mm.vfs.w6.h(rVar.f447574i);
            }
            rVar.a(11);
            return 0;
        }
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadCDN", "cdn callback progress: %s, %s, %s", java.lang.Integer.valueOf(gVar.f69499x10a0fed7), java.lang.Long.valueOf(gVar.f69496x83ec3dd), java.lang.Long.valueOf(gVar.f69500x8ab84c59));
        }
        if (hVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(hVar.f69553xb5f54fe9);
            objArr[1] = hVar.f323305g;
            java.lang.String str2 = hVar.f69524x419c440e;
            if (str2 == null) {
                str2 = "no url";
            }
            objArr[2] = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadCDN", "cdn callback result: %s, %s, %s", objArr);
            if (com.p314xaae8f345.mm.vfs.w6.j(rVar.f447573h)) {
                com.p314xaae8f345.mm.vfs.w6.h(rVar.f447573h);
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(rVar.f447574i)) {
                com.p314xaae8f345.mm.vfs.w6.h(rVar.f447574i);
            }
            java.lang.String str3 = hVar.f323305g;
            int i18 = hVar.f69553xb5f54fe9;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = rVar.f447552a;
            if (i18 != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                int i19 = hVar.f69553xb5f54fe9;
                if (i19 <= -20000 || i19 >= 0) {
                    if (i19 == -5109012) {
                        final qr.s sVar = this.f447567e;
                        if (!sVar.f447577c) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadCDN", "try fetch original image %s", c21053xdbf1e5f4.f68671x4b6e68b9);
                            final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4(c21053xdbf1e5f4);
                            c21053xdbf1e5f42.f68661x765114aa = "";
                            new cr.k(c21053xdbf1e5f42, new cr.l(c21053xdbf1e5f42, new yz5.l() { // from class: qr.q$$a
                                @Override // yz5.l
                                /* renamed from: invoke */
                                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                                    qr.q qVar = qr.q.this;
                                    qVar.getClass();
                                    boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                                    qr.r rVar2 = qVar.f447568f;
                                    if (booleanValue) {
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f43 = c21053xdbf1e5f42;
                                        sb6.append(c21053xdbf1e5f43.N0());
                                        sb6.append("_origin_");
                                        sb6.append(java.lang.System.currentTimeMillis());
                                        java.lang.String path = sb6.toString();
                                        fr.b bVar = new fr.b();
                                        fr.c a17 = fr.d.f347220a.a(c21053xdbf1e5f43);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                                        boolean z18 = a17.f347215c;
                                        int i27 = a17.f347219g;
                                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo = a17.f347213a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
                                        java.lang.String verifyMd5 = a17.f347214b;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyMd5, "verifyMd5");
                                        java.lang.String aesKey = a17.f347216d;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
                                        java.lang.String tempPath = a17.f347218f;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempPath, "tempPath");
                                        if (bVar.b(new fr.c(emojiInfo, verifyMd5, z18, aesKey, path, tempPath, i27))) {
                                            qr.s sVar2 = sVar;
                                            sVar2.f447577c = true;
                                            sVar2.f447578d = path;
                                            rVar2.f447574i = path;
                                            qr.r.e(rVar2, sVar2);
                                            return jz5.f0.f384359a;
                                        }
                                    }
                                    rVar2.a(11);
                                    return jz5.f0.f384359a;
                                }
                            }));
                            return 0;
                        }
                    }
                    rVar.a(11);
                } else if (i19 == -447) {
                    rVar.a(2);
                } else if (i19 == -448) {
                    rVar.a(8);
                } else {
                    rVar.c();
                }
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - rVar.f447555d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadCDN", "complete cost %d, size %d, rate %d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(c21053xdbf1e5f4.f68679x22618426), java.lang.Long.valueOf(c21053xdbf1e5f4.f68679x22618426 / currentTimeMillis));
                java.lang.String str4 = this.f447566d;
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = hVar.f69524x419c440e;
                rVar.b(0, str3, str4, str5 != null ? str5 : "");
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
