package z12;

/* loaded from: classes12.dex */
public class k implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z12.l f550850d;

    public k(z12.l lVar) {
        this.f550850d = lVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        z12.l lVar = this.f550850d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f550862r) && str.equals(lVar.f550862r)) {
            if (i17 == -21006) {
                lVar.I(lVar.f550853f, 6, 0, lVar.f550862r);
                return 0;
            }
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "download emoji pack failed. mProductId:%s:", lVar.f550853f);
                lVar.I(lVar.f550853f, -1, 0, lVar.f550862r);
                return 0;
            }
            if (gVar != null) {
                long j17 = gVar.f69496x83ec3dd;
                long j18 = gVar.f69500x8ab84c59;
                if (j17 == j18) {
                    return 0;
                }
                java.lang.String str2 = lVar.f550862r;
                if (!lVar.f550863s) {
                    lVar.I(lVar.f550853f, 6, (int) ((((float) j17) / ((float) j18)) * 100.0f), str2);
                }
                return 0;
            }
            if (hVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10625, 2, hVar.f69522xf9dbbe9c, lVar.f550853f, hVar.f69564xd94f6271);
                int i18 = hVar.f69553xb5f54fe9;
                if (i18 == 0) {
                    java.lang.String productId = lVar.f550853f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", "checkPack: ".concat(productId));
                    pm0.v.K(null, new pr.j(productId, pr.k.f439255d));
                    try {
                        if (y12.c.f540385b == null) {
                            synchronized (y12.c.class) {
                                y12.c.f540385b = new y12.c();
                            }
                        }
                        y12.c cVar = y12.c.f540385b;
                        java.lang.String str3 = lVar.f550853f;
                        java.util.ArrayList arrayList = cVar.f540386a;
                        if (arrayList != null && arrayList.contains(str3)) {
                            cVar.f540386a.remove(str3);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.w(lVar.f550853f, lVar.f550854g, lVar.f550856i, lVar.f550857m, lVar.f550865u);
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().m145262xf35bbb4();
                        gr.p.a(((r45.ql0) lVar.f550851d.f152244b.f152233a).f465616e);
                        lVar.I(lVar.f550853f, 7, 100, lVar.f550862r);
                        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.t() + lVar.f550853f);
                        if (r6Var.A() && r6Var.m()) {
                            r6Var.l();
                        }
                        z12.l.H(lVar, lVar.f550853f, true);
                        return 0;
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Error." + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                        lVar.I(lVar.f550853f, -1, 0, lVar.f550862r);
                        z12.l.H(lVar, lVar.f550853f, false);
                        return 0;
                    } catch (java.lang.OutOfMemoryError unused2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Out Of Memory Error." + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                        lVar.I(lVar.f550853f, -1, 0, lVar.f550862r);
                        z12.l.H(lVar, lVar.f550853f, false);
                        return 0;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "donwload emoji pack faild. ProductId:%s code:%d ", lVar.f550853f, java.lang.Integer.valueOf(i18));
                lVar.I(lVar.f550853f, -1, 0, lVar.f550862r);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
