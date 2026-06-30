package pn1;

/* loaded from: classes12.dex */
public class h implements on1.i {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f438498a = {35, 33, 65, 77, 82, 10, 2, 35, 33};

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f438499b = {35, 33, 65, 77, 82, 10, 35, 33};

    @Override // on1.i
    public boolean a(r45.ed edVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.z2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemVoice", "complementMediaFile, msg.isClean");
            return false;
        }
        if (f9Var.mo78013xfb85f7b0() == 34) {
            java.lang.String xj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).xj(f9Var, f9Var.z0(), null, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemVoice", "complementMediaFile, existFullPath = " + xj6 + ", len = " + com.p314xaae8f345.mm.vfs.w6.k(xj6));
            if (com.p314xaae8f345.mm.vfs.w6.k(xj6) == 0) {
                kn1.k.F(edVar, 9, xj6);
                return true;
            }
        }
        return false;
    }

    @Override // on1.i
    public int b(java.lang.String str, r45.ed edVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, on1.a aVar) {
        boolean z17;
        int b17;
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = edVar.f454816h.f454289d;
        if (tn1.e.h(edVar.f454814f.f454289d) && (b17 = tn1.e.b(str2)) != -1 && (i17 = b17 + 2) < str2.length()) {
            str2 = str2.substring(i17);
        }
        java.util.Map<java.lang.String, java.lang.String> d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "msg", null);
        boolean z18 = false;
        if (d17 != null) {
            try {
                f9Var.d1(w21.u0.c(d17.get(".msg.voicemsg.$fromusername"), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17.get(".msg.voicemsg.$voicelength"), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17.get(".msg.voicemsg.$isPlayed"), 1) == 1));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FastBackupItemVoice", "parsing voice msg xml failed");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FastBackupItemVoice", e17, "", new java.lang.Object[0]);
            }
            try {
                r15.b bVar = new r15.b();
                bVar.m126733x88c2ee0f(d17, "msg");
                aVar.f428335m = bVar;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FastBackupItemVoice", th6, "parse voice quote", new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FastBackupItemVoice", "voicemsg paseXml failed:%s", edVar.f454816h.f454289d);
            f9Var.d1(edVar.f454816h.f454289d);
        }
        java.lang.String s07 = on1.c.f428341c ? w21.g1.s0(f9Var.I0()) : w21.g1.n0(edVar.f454814f.f454289d, "amr_");
        if (!pt0.f0.f439742b1.j()) {
            f9Var.i1(s07);
        }
        java.lang.String d18 = tn1.e.d(f9Var, s07, true);
        java.lang.String w17 = kn1.k.w(edVar, 9, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17)) {
            java.lang.String str3 = kn1.k.n(w17) + w17;
            if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str3, 0, 9);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
                    int i18 = 0;
                    while (true) {
                        byte[] bArr = this.f438498a;
                        if (i18 >= bArr.length) {
                            z17 = true;
                            break;
                        }
                        if (bArr[i18] != N[i18]) {
                            break;
                        }
                        i18++;
                    }
                }
                z17 = false;
                if (z17) {
                    byte[] N2 = com.p314xaae8f345.mm.vfs.w6.N(str3, 6, -1);
                    com.p314xaae8f345.mm.vfs.w6.h(str3);
                    com.p314xaae8f345.mm.vfs.w6.R(str3, N2);
                } else {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
                        int i19 = 0;
                        while (true) {
                            byte[] bArr2 = this.f438499b;
                            if (i19 >= bArr2.length) {
                                z18 = true;
                                break;
                            }
                            if (bArr2[i19] != N[i19]) {
                                z18 = false;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (z18) {
                        byte[] N3 = com.p314xaae8f345.mm.vfs.w6.N(str3, 6, -1);
                        com.p314xaae8f345.mm.vfs.w6.h(str3);
                        com.p314xaae8f345.mm.vfs.w6.R(str3, N3);
                    }
                }
            }
        }
        if (kn1.k.F(edVar, 9, d18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemVoice", "writeItem == null");
            sb6.append(d18);
            sb6.append(";");
            on1.c.a(f9Var.I0(), sb6.toString());
            return 1;
        }
        java.lang.String w18 = kn1.k.w(edVar, 9, null);
        if (w18 != null) {
            com.p314xaae8f345.mm.vfs.w6.w(kn1.k.n(w18) + w18, d18);
            sb6.append(d18);
            sb6.append(";");
            on1.c.a(f9Var.I0(), sb6.toString());
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    @Override // on1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(r45.ed r18, boolean r19, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r20, java.lang.String r21, java.util.LinkedList r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn1.h.c(r45.ed, boolean, com.tencent.mm.storage.f9, java.lang.String, java.util.LinkedList, boolean):int");
    }
}
