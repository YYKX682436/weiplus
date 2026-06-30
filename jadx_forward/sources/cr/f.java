package cr;

/* loaded from: classes12.dex */
public final class f implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f303099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303100b;

    public f(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, yz5.l lVar) {
        this.f303099a = c21053xdbf1e5f4;
        this.f303100b = lVar;
    }

    @Override // dr.q
    public void a(boolean z17) {
        android.graphics.Bitmap mo174306x74704fb7;
        java.lang.String D;
        boolean z18;
        byte[] bj6;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo = this.f303099a;
        sb6.append(emojiInfo.mo42933xb5885648());
        sb6.append(", ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", sb6.toString());
        yz5.l lVar = this.f303100b;
        if (!z17) {
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", "createThumb: " + emojiInfo.mo42933xb5885648());
        com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.Companion companion = com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE;
        wq.d m43681x99bce80e = companion.m43681x99bce80e(emojiInfo);
        boolean z19 = false;
        if (companion.m43685x7b953cf2(m43681x99bce80e)) {
            if ((m43681x99bce80e instanceof wq.h) && m43681x99bce80e.d() == 1) {
                m43681x99bce80e.mo174305x5cd39ffa();
                byte[] z27 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z(emojiInfo);
                mo174306x74704fb7 = (z27 == null || (bj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).bj(z27, 6)) == null) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bj6);
            } else {
                m43681x99bce80e.c();
                mo174306x74704fb7 = m43681x99bce80e.mo174306x74704fb7();
                m43681x99bce80e.mo174305x5cd39ffa();
            }
            if (mo174306x74704fb7 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCoverFetcher", "bitmap is null");
            } else {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(mo174306x74704fb7, 100, android.graphics.Bitmap.CompressFormat.PNG, emojiInfo.h0(), false);
                    if ((mo174306x74704fb7.getWidth() <= 120 && mo174306x74704fb7.getHeight() <= 120) || (mo174306x74704fb7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(mo174306x74704fb7, 120, 120, false, true)) != null) {
                        ar.c.f94889a.b(emojiInfo.mo42933xb5885648(), mo174306x74704fb7);
                        z19 = true;
                    }
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiCoverFetcher", e17, "saveBitmapToImage failed", new java.lang.Object[0]);
                    java.lang.String h07 = emojiInfo.h0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h07, "getCoverPath(...)");
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = e17.getMessage();
                        java.lang.Throwable cause = e17.getCause();
                        objArr[1] = cause != null ? cause.getMessage() : null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", "error message: %s, cause: %s", objArr);
                        for (com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(h07)); r6Var != null; r6Var = r6Var.s()) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append("path: ");
                            sb7.append(r6Var.u());
                            sb7.append(", exist: ");
                            sb7.append(r6Var.m());
                            sb7.append(", canRead: ");
                            sb7.append(r6Var.h());
                            sb7.append(", canWrite: ");
                            sb7.append(r6Var.i());
                            sb7.append(", canExecute: ");
                            com.p314xaae8f345.mm.vfs.z2 M = r6Var.M();
                            if (M.a()) {
                                com.p314xaae8f345.mm.vfs.q2 q2Var = M.f294799a;
                                if ((q2Var.o() & 2) != 0 && (D = q2Var.D(M.f294800b, false)) != null && new java.io.File(D).canExecute()) {
                                    z18 = true;
                                    sb7.append(z18);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", sb7.toString());
                                }
                            }
                            z18 = false;
                            sb7.append(z18);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", sb7.toString());
                        }
                        try {
                            com.p314xaae8f345.mm.vfs.u6 u6Var = new com.p314xaae8f345.mm.vfs.u6(h07);
                            try {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", "read-only open OK");
                                vz5.b.a(u6Var, null);
                            } catch (java.lang.Throwable th6) {
                                try {
                                    throw th6;
                                } catch (java.lang.Throwable th7) {
                                    vz5.b.a(u6Var, th6);
                                    throw th7;
                                }
                            }
                        } catch (java.io.IOException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", "read-only open fail, " + e18.getMessage());
                        }
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverFetcher", "logFileAccessDiagnostics fail, " + e19.getMessage());
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiCoverFetcher", "createThumb: invalid decoder");
            m43681x99bce80e.mo174305x5cd39ffa();
        }
        if (z19) {
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } else if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
