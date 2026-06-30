package vf0;

@j95.b
/* loaded from: classes12.dex */
public final class c extends i95.w implements c35.m {

    /* renamed from: d, reason: collision with root package name */
    public static final int f517662d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f517663e;

    static {
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20518xc2aa30ca());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoPathFeatureService", "c2cOriginVideoExpireDays: " + c17);
        if (c17 <= 0) {
            c17 = 14;
        }
        f517662d = c17;
        f517663e = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20517x43ca093a()), 1);
    }

    public static final boolean fj(java.lang.String tmpPath, java.lang.String finalPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmpPath, "tmpPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finalPath, "finalPath");
        if (!com.p314xaae8f345.mm.vfs.w6.j(tmpPath)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CVideoPathFeatureService", "renameTmpToFinal: tmp not found: ".concat(tmpPath));
            return false;
        }
        boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(tmpPath, finalPath, true);
        if (!x17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CVideoPathFeatureService", "renameTmpToFinal: rename failed, tmp=" + tmpPath + ", final=" + finalPath);
        }
        return x17;
    }

    public java.lang.String Ai(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        return Bi(msgInfo.Q0(), msgInfo.m124847x74d37ac6(), msgInfo.mo78012x3fdd41df(), msgInfo.z0(), null, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Bi(java.lang.String r13, long r14, long r16, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf0.c.Bi(java.lang.String, long, long, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3 != null ? r3.f496339d : null) != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jz5.l Di(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf0.c.Di(com.tencent.mm.storage.f9):jz5.l");
    }

    public java.lang.String Ni(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.String Ai = Ai(msgInfo, z17);
        if (Ai.length() == 0) {
            return "";
        }
        int O = r26.n0.O(Ai, '/', 0, false, 6, null);
        if (O < 0) {
            return "tmp_".concat(Ai);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = O + 1;
        java.lang.String substring = Ai.substring(0, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append("tmp_");
        java.lang.String substring2 = Ai.substring(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        return sb6.toString();
    }

    public java.lang.String Ri(bm5.f0 resType, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        return (resType != bm5.f0.f104103r || f9Var == null) ? Ui(bm5.y.f104289i.a(f9Var, resType), str, z17) : Bi(f9Var.Q0(), f9Var.m124847x74d37ac6(), f9Var.mo78012x3fdd41df(), f9Var.z0(), str, z17);
    }

    public final java.lang.String Ui(bm5.y yVar, java.lang.String str, boolean z17) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yVar.f104291a);
        long j17 = yVar.f104293c;
        long j18 = yVar.f104292b;
        if (K0 || (j18 <= 0 && j17 == 0)) {
            if (yVar.f104296f == bm5.v.f104276f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CVideoPathFeatureService", "getC2CVideoPath, error for msgInfo, id:" + j18 + ", svrId: " + j17 + " talker:" + yVar.f104291a);
            }
            return str == null ? "" : str;
        }
        boolean z18 = true;
        if (!hj()) {
            if (z17) {
                return str == null || str.length() == 0 ? bm5.z.d(yVar, null, true, 1, null) : str;
            }
            java.lang.String i17 = bm5.z.i(yVar, null, null, false, 7, null);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(i17);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                return i17;
            }
            if (str != null && str.length() != 0) {
                z18 = false;
            }
            return !z18 ? str : bm5.z.d(yVar, null, false, 3, null);
        }
        if (z17 && bm5.c0.f104083a.b(yVar) != 0) {
            return str == null ? "" : str;
        }
        if (z17) {
            return bm5.z.d(yVar, null, true, 1, null);
        }
        java.lang.String i18 = bm5.z.i(yVar, null, null, false, 7, null);
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(i18);
        java.lang.String str3 = a18.f294812f;
        if (str3 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (!m18.a() ? false : m18.f294799a.F(m18.f294800b)) {
            return i18;
        }
        if (str != null) {
            com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str4 = a19.f294812f;
            if (str4 != null) {
                java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l19)) {
                    a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l19, a19.f294813g, a19.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a19, null);
            if (!m19.a() ? false : m19.f294799a.F(m19.f294800b)) {
                return str;
            }
        }
        return bm5.z.d(yVar, null, false, 3, null);
    }

    public int Vi(long j17) {
        int i17 = f517662d;
        if (i17 < 0) {
            i17 = 0;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        long millis = timeUnit.toMillis(i17);
        if (j17 < 0) {
            j17 = 0;
        }
        long c17 = (j17 + millis) - (f517663e ? c01.id.c() : java.lang.System.currentTimeMillis());
        return (int) timeUnit.convert((c17 >= 0 ? c17 : 0L) + (timeUnit.toMillis(1L) - 1), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int Zi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        return Vi(msgInfo.mo78012x3fdd41df());
    }

    public java.lang.String aj(bm5.f0 resType, java.lang.String str) {
        java.lang.String bj6;
        java.lang.String bj7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        if (resType == bm5.f0.f104103r) {
            t21.v2 h17 = t21.d3.h(str);
            if (h17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.S)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    if ((str == null || r26.i0.n(str, ya.b.f77495x8b74a326, false)) ? false : true) {
                        bj7 = bj(str + ya.b.f77495x8b74a326);
                        if (bj7 == null) {
                            return "";
                        }
                    }
                }
                if (!(str != null && r26.i0.n(str, ya.b.f77495x8b74a326, false)) || (bj7 = bj(str)) == null) {
                    return "";
                }
            } else {
                bj7 = bj(h17.S);
                if (bj7 == null) {
                    return "";
                }
            }
            return bj7;
        }
        int ordinal = resType.ordinal();
        if (ordinal == 10) {
            bj6 = bj(str);
            if (bj6 == null) {
                return "";
            }
        } else if (ordinal != 11) {
            bj6 = bj(str);
            if (bj6 == null) {
                return "";
            }
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                bj6 = null;
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(gm0.j1.u().d() + "video/");
                sb6.append(str);
                sb6.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
                bj6 = sb6.toString();
                if (!com.p314xaae8f345.mm.vfs.w6.j(bj6)) {
                    java.util.Iterator it = com.p314xaae8f345.mm.vfs.q7.d().iterator();
                    while (it.hasNext()) {
                        java.lang.String str2 = lp0.b.D() + ((java.lang.String) it.next()) + "/video/" + str + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
                        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                            com.p314xaae8f345.mm.vfs.w6.w(str2, bj6);
                            com.p314xaae8f345.mm.vfs.c1.f(2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.C2CVideoPathFeatureService", "success restore file, from " + str2 + " to " + bj6);
                        }
                    }
                }
            }
            if (bj6 == null) {
                return "";
            }
        }
        return bj6;
    }

    public final java.lang.String bj(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().d() + "video/");
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            return sb7;
        }
        java.lang.String str2 = sb7 + ".mp4";
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            return str2;
        }
        java.util.Iterator it = com.p314xaae8f345.mm.vfs.q7.d().iterator();
        while (it.hasNext()) {
            java.lang.String str3 = lp0.b.D() + ((java.lang.String) it.next()) + "/video/" + str + ".mp4";
            if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                com.p314xaae8f345.mm.vfs.w6.w(str3, str2);
                com.p314xaae8f345.mm.vfs.c1.f(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.C2CVideoPathFeatureService", "success restore file, from " + str3 + " to " + str2);
            }
        }
        return str2;
    }

    public void cj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        if (f9Var != null) {
            java.lang.String b17 = bm5.d0.b(f9Var, bm5.f0.f104104s);
            if (!z17) {
                b17 = null;
            }
            if (b17 != null) {
                wi(f9Var, b17);
            }
            bm5.f0 f0Var = bm5.f0.f104105t;
            java.lang.String b18 = z17 ? bm5.d0.b(f9Var, f0Var) : null;
            if (b18 != null) {
                wi(f9Var, b18);
            }
            bm5.c0.f104083a.c(bm5.z.f(bm5.y.f104289i.a(f9Var, f0Var)), true);
        }
    }

    public boolean hj() {
        return pt0.f0.f439742b1.i();
    }

    public final zz.b wi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str, f9Var.mo78013xfb85f7b0(), null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoPathFeatureService", "videoCheckDup:%s ret:%s hitCache:%s copyResult:%s replaceResult:%s", str, java.lang.Integer.valueOf(bj6.f559224a), java.lang.Boolean.valueOf(bj6.f559225b), java.lang.Boolean.valueOf(bj6.f559227d), java.lang.Long.valueOf(bj6.f559228e));
        return bj6;
    }
}
