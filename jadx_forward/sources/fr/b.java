package fr;

/* loaded from: classes12.dex */
public final class b {
    public final void a(fr.c cVar, boolean z17) {
        if (z17) {
            int i17 = cVar.f347219g;
            if (i17 == 1) {
                h12.f.a(7L, 1L);
                return;
            } else if (i17 == 2) {
                h12.f.a(11L, 1L);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                h12.f.a(24L, 1L);
                return;
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = cVar.f347213a;
        int i18 = cVar.f347219g;
        if (i18 == 1) {
            h12.f.a(8L, 1L);
            h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 3, 0, 1, c21053xdbf1e5f4.f68663x861009b5, 1, c21053xdbf1e5f4.f68657xb76d85ab);
        } else if (i18 == 2) {
            h12.f.a(12L, 1L);
            h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 4, 0, 1, c21053xdbf1e5f4.f68663x861009b5, 1, c21053xdbf1e5f4.f68657xb76d85ab);
        } else {
            if (i18 != 3) {
                return;
            }
            h12.f.a(25L, 1L);
        }
    }

    public final boolean b(fr.c verifyConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyConfig, "verifyConfig");
        java.lang.String str = verifyConfig.f347216d;
        boolean z17 = verifyConfig.f347215c;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = verifyConfig.f347213a;
        java.lang.String str2 = verifyConfig.f347217e;
        java.lang.String str3 = verifyConfig.f347218f;
        if (z17) {
            try {
                byte[] a17 = kk.b.a(com.p314xaae8f345.mm.vfs.w6.N(str3, 0, -1), android.util.Base64.encodeToString(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str), 0));
                boolean z18 = a17 != null && com.p314xaae8f345.mm.vfs.w6.S(str2, a17, 0, a17.length) == 0;
                com.p314xaae8f345.mm.vfs.w6.h(str3);
                if (!z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiLoader.EmojiFileVerify", "decrypt failed : " + str);
                    a(verifyConfig, false);
                    return false;
                }
                a(verifyConfig, true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiLoader.EmojiFileVerify", e17, "decrypt exception : " + str, new java.lang.Object[0]);
                a(verifyConfig, false);
                if (e17 instanceof javax.crypto.BadPaddingException) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader.EmojiFileVerify", "checkFixAesKey: " + str);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68688x29e035ee)) {
                        c21053xdbf1e5f4.f68661x765114aa = "";
                        c21053xdbf1e5f4.f68659x5efe714f = "";
                        c21053xdbf1e5f4.f68654xf47770e7 = "";
                        c21053xdbf1e5f4.f68688x29e035ee = "";
                        c21053xdbf1e5f4.f68642xf11e6e15 = "";
                        new cr.k(c21053xdbf1e5f4, fr.a.f347212d);
                    }
                }
                return false;
            }
        } else {
            com.p314xaae8f345.mm.vfs.w6.w(str3, str2);
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("file md5 ");
        sb6.append(p17);
        sb6.append(", ");
        java.lang.String str4 = verifyConfig.f347214b;
        sb6.append(str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader.EmojiFileVerify", sb6.toString());
        boolean z19 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17) && r26.i0.p(p17, str4, true);
        int i17 = verifyConfig.f347219g;
        if (z19) {
            if (i17 == 0) {
                h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 4, 0, 0, c21053xdbf1e5f4.f68663x861009b5, 0, c21053xdbf1e5f4.f68657xb76d85ab);
                h12.f.a(4L, 1L);
            } else if (i17 == 1) {
                h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 2, 0, 0, c21053xdbf1e5f4.f68663x861009b5, 0, c21053xdbf1e5f4.f68657xb76d85ab);
                h12.f.a(4L, 1L);
            } else if (i17 == 2) {
                h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 4, 0, 0, c21053xdbf1e5f4.f68663x861009b5, 1, c21053xdbf1e5f4.f68657xb76d85ab);
                h12.f.a(13L, 1L);
            } else if (i17 == 3) {
                h12.f.a(26L, 1L);
            }
        } else if (i17 == 0) {
            h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 4, 1, 1, c21053xdbf1e5f4.f68663x861009b5, 1, c21053xdbf1e5f4.f68657xb76d85ab);
            h12.f.a(5L, 1L);
        } else if (i17 == 1) {
            h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 2, 1, 1, c21053xdbf1e5f4.f68663x861009b5, 1, c21053xdbf1e5f4.f68657xb76d85ab);
            h12.f.a(5L, 1L);
        } else if (i17 == 2) {
            h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 4, 1, 1, c21053xdbf1e5f4.f68663x861009b5, 1, c21053xdbf1e5f4.f68657xb76d85ab);
            h12.f.a(14L, 1L);
        } else if (i17 == 3) {
            h12.f.a(27L, 1L);
        }
        if (!z19 || !gm0.j1.b().m()) {
            return false;
        }
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        wq.a.f().d(c21053xdbf1e5f4, true);
        return true;
    }
}
