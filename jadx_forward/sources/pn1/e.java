package pn1;

/* loaded from: classes12.dex */
public class e implements on1.i {
    @Override // on1.i
    public boolean a(r45.ed edVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean z17;
        m11.b0 b27;
        boolean z18 = false;
        if (f9Var.z2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemImg", "complementMediaFile, msg.isClean");
            return false;
        }
        java.lang.String str = edVar.f454816h.f454289d;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        if (d17 != null) {
            z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msg.img.$hdlength"), 0L) > 0;
            java.util.Iterator it = edVar.f454823r.iterator();
            while (it.hasNext()) {
                if (((r45.eu5) it.next()).f455266d == 3) {
                    z17 = true;
                }
            }
        } else {
            z17 = false;
        }
        m11.l0 f17 = tn1.f.f().e().f();
        if (f9Var.A0() == 1) {
            b27 = f9Var.m124847x74d37ac6() != 0 ? f17.T1(f9Var.Q0(), f9Var.m124847x74d37ac6()) : null;
            if (b27 == null || b27.f404166a == 0) {
                b27 = f17.b2(f9Var.Q0(), f9Var.I0());
            }
        } else {
            b27 = f17.b2(f9Var.Q0(), f9Var.I0());
        }
        ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
        m11.b0 d18 = m11.c0.d(b27);
        if (!b27.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemImg", " complementMediaFile img == null");
            return false;
        }
        if (com.p314xaae8f345.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, b27.f404172g, true)) == 0) {
            byte[] y17 = kn1.k.y(edVar, 1);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            f17.i1(f9Var, edVar.f454827v, y17, c19772x1c2cd081, c19767x257d7f, c19767x257d7f2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemImg", "genThumb, pThumbWidth = " + c19767x257d7f + ", pThumbHeight = " + c19767x257d7f2);
            z18 = true;
        }
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.c0.f104083a.d(b27.l()), b27.f404170e, "", "", true, false);
        if (com.p314xaae8f345.mm.vfs.w6.k(bj6) != 0) {
            return z18;
        }
        if (z17 && b27.j() && d18.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemImg", "writeItem, BACKUPITEM_IMAGE_HD");
            kn1.k.F(edVar, 3, bj6);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemImg", "writeItem, BACKUPITEM_IMAGE");
            kn1.k.F(edVar, 2, bj6);
        }
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(bj6, f9Var.mo78013xfb85f7b0(), null, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027b  */
    @Override // on1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(java.lang.String r31, r45.ed r32, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r33, on1.a r34) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn1.e.b(java.lang.String, r45.ed, com.tencent.mm.storage.f9, on1.a):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x04eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04ec  */
    @Override // on1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(r45.ed r31, boolean r32, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r33, java.lang.String r34, java.util.LinkedList r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn1.e.c(r45.ed, boolean, com.tencent.mm.storage.f9, java.lang.String, java.util.LinkedList, boolean):int");
    }

    public final java.lang.String d(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
            return str;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("MicroMsg.BackupMoveServer");
        if (!h07.m()) {
            h07.J();
        }
        com.p314xaae8f345.mm.vfs.r6 n17 = h07.n();
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str3 = a17.f294812f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(n17, str3);
        int aj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(str, r6Var.o(), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemImg", "convertFromWxam2Jpg, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", ret = " + aj6);
        return aj6 == 0 ? r6Var.o() : str;
    }
}
