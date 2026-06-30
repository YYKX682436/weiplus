package b80;

@j95.b
/* loaded from: classes12.dex */
public final class u extends i95.w implements o70.e {

    /* renamed from: n, reason: collision with root package name */
    public static final b80.f f99807n = new b80.f(null);

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f99808o;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f99809p;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f99810d = jz5.h.b(b80.t.f99806d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f99811e = jz5.h.b(b80.k.f99783d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f99812f = jz5.h.b(b80.j.f99782d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f99813g = jz5.h.b(b80.o.f99794d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f99814h = jz5.h.b(b80.p.f99795d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f99815i = jz5.h.b(b80.l.f99784d);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f99816m = jz5.h.b(b80.g.f99777d);

    static {
        boolean z17 = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", j62.e.g().a("clicfg_c2c_wxam_send", "0", false, true)) || z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("sendC2CImageUseWxam", true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "sendC2CImageUseWxam, use = " + z17);
        f99808o = z17;
        f99809p = jz5.h.b(b80.e.f99776d);
    }

    public final boolean Ai(o70.h hVar, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(hVar.f424766a, ij(hVar.f424770e, hVar.f424769d)), str);
        if (r6Var.m()) {
            return com.p314xaae8f345.mm.vfs.w6.x(r6Var.o(), str2, true);
        }
        return false;
    }

    public final boolean Bi(o70.h hVar, java.lang.String str) {
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(ij(hVar.f424770e, hVar.f424769d), false, true);
        com.p314xaae8f345.mm.vfs.r6 r6Var = hVar.f424766a;
        com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str2 = z7Var.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str2 + '/' + l17, z7Var.f294813g, z7Var.f294814h);
        }
        java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str, false, true);
        if (l18 != null && !l18.isEmpty()) {
            java.lang.String str3 = z7Var.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str3 + '/' + l18, z7Var.f294813g, z7Var.f294814h);
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    public final boolean Di(o70.h params, java.lang.String targetPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "live_photo_hd_video", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 34L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 35L, 1L, false);
        }
        return Ai;
    }

    public final boolean Ni(o70.h params, java.lang.String targetPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "live_photo_video", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 32L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 33L, 1L, false);
        }
        return Ai;
    }

    public final boolean Ri(o70.h params, java.lang.String targetPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "mid.jpg", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 11L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 12L, 1L, false);
        }
        return Ai;
    }

    public final boolean Ui(o70.h params, java.lang.String targetPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "mid.jpg_hevc", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 13L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 14L, 1L, false);
        }
        return Ai;
    }

    public final boolean Vi(o70.h params, java.lang.String targetPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "orig.jpg", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 22L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 23L, 1L, false);
        }
        return Ai;
    }

    public final boolean Zi(o70.h params, java.lang.String targetPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "thumb.jpg", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 7L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 8L, 1L, false);
        }
        return Ai;
    }

    public final j15.c aj(o70.h params) {
        aq.u0 u0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (params.f424777l == null || (u0Var = (aq.u0) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f99811e).mo141623x754a37bb()).get(java.lang.Long.valueOf(params.f424771f))) == null) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(params.f424766a, ij(params.f424770e, params.f424769d));
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var, "live_photo_video").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(r6Var, "live_photo_hd_video").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
        j15.c cVar = new j15.c();
        cVar.q(u0Var.f94513f);
        cVar.y(u0Var.f94514g);
        cVar.x(com.p314xaae8f345.mm.vfs.w6.k(o17));
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(o17);
        if (p17 == null) {
            p17 = "";
        }
        cVar.w(p17);
        if (params.f424773h != 1 || m11.c.a(params.f424770e)) {
            return cVar;
        }
        cVar.u(com.p314xaae8f345.mm.vfs.w6.k(o18));
        java.lang.String p18 = com.p314xaae8f345.mm.vfs.w6.p(o18);
        cVar.w(p18 != null ? p18 : "");
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021c  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bj(o70.h r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.u.bj(o70.h, java.lang.String, java.lang.String):void");
    }

    public void cj(o70.h params, java.lang.String targetPath, java.lang.String midPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(midPath, "midPath");
        fj(params, targetPath, midPath, 120, 90);
    }

    public final void fj(o70.h hVar, java.lang.String str, java.lang.String str2, int i17, int i18) {
        android.graphics.Bitmap u17;
        java.lang.Object m143895xf1229813;
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.d(hVar.f424770e);
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(hVar.f424770e) + (hVar.f424769d * 90);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2) || com.p314xaae8f345.mm.vfs.w6.k(hVar.f424770e) <= 26214400) {
            str2 = hVar.f424770e;
        }
        if (d17 > 0) {
            u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Q(com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.a(str2, d17, a17), str2, hVar.f424775j);
        } else {
            u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.u(str2, i17, i17, true, false, hVar.f424775j);
        }
        if (u17 == null) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 15L, 1L, false);
        }
        boolean z17 = false;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(u17, i18, android.graphics.Bitmap.CompressFormat.JPEG, str, false)));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) m143895xf1229813;
        if (bool != null) {
            z17 = bool.booleanValue();
        } else {
            nj(hVar, 10007);
        }
        if (!z17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 16L, 1L, false);
        } else if (mj()) {
            java.lang.String Y = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Y(str2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Y)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(Y, str);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "[" + hVar.f424767b + "] genThumb imgPath:" + str2 + " targetPath:" + str + " fileLength:" + com.p314xaae8f345.mm.vfs.w6.k(str) + " type:" + d17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x017d, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x017b, code lost:
    
        if ((r6 / r7) > 2.5d) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016f, code lost:
    
        if ((r7 / r6) > 2.5d) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017f, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hj(o70.h r36, java.lang.String r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.u.hj(o70.h, java.lang.String, java.lang.String):void");
    }

    public final java.lang.String ij(java.lang.String imgPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(imgPath + '_' + i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        return a17;
    }

    public final boolean mj() {
        return ((java.lang.Boolean) ((jz5.n) this.f99815i).mo141623x754a37bb()).booleanValue();
    }

    public final void nj(o70.h hVar, int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6856xf0654a96 c6856xf0654a96 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6856xf0654a96();
        c6856xf0654a96.f141745f = hVar.f424768c;
        c6856xf0654a96.f141743d = i17;
        c6856xf0654a96.f141744e = hVar.f424773h;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(hVar.f424770e);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str2 = a17.f294812f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        c6856xf0654a96.f141746g = c6856xf0654a96.b("FileName", str2, true);
        c6856xf0654a96.f141747h = hVar.f424769d;
        c6856xf0654a96.f141749j = c6856xf0654a96.b("Rev", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
        c6856xf0654a96.k();
        c6856xf0654a96.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0273 A[LOOP:1: B:65:0x026d->B:67:0x0273, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x040e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList oj(o70.k r66) {
        /*
            Method dump skipped, instructions count: 3522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.u.oj(o70.k):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x041c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void pj(o70.h r45) {
        /*
            Method dump skipped, instructions count: 1849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.u.pj(o70.h):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object qj(o70.h r31, boolean r32, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r33) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.u.qj(o70.h, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean wi(o70.h params, java.lang.String targetPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "hd_thumb.jpg", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 9L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 10L, 1L, false);
        }
        return Ai;
    }
}
