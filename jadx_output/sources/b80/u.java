package b80;

@j95.b
/* loaded from: classes12.dex */
public final class u extends i95.w implements o70.e {

    /* renamed from: n, reason: collision with root package name */
    public static final b80.f f18274n = new b80.f(null);

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f18275o;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f18276p;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f18277d = jz5.h.b(b80.t.f18273d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f18278e = jz5.h.b(b80.k.f18250d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f18279f = jz5.h.b(b80.j.f18249d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f18280g = jz5.h.b(b80.o.f18261d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f18281h = jz5.h.b(b80.p.f18262d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f18282i = jz5.h.b(b80.l.f18251d);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f18283m = jz5.h.b(b80.g.f18244d);

    static {
        boolean z17 = false;
        if (kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_c2c_wxam_send", "0", false, true)) || z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (z17) {
            com.tencent.mm.sdk.platformtools.o4.L().putBoolean("sendC2CImageUseWxam", true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "sendC2CImageUseWxam, use = " + z17);
        f18275o = z17;
        f18276p = jz5.h.b(b80.e.f18243d);
    }

    public final boolean Ai(o70.h hVar, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(hVar.f343233a, ij(hVar.f343237e, hVar.f343236d)), str);
        if (r6Var.m()) {
            return com.tencent.mm.vfs.w6.x(r6Var.o(), str2, true);
        }
        return false;
    }

    public final boolean Bi(o70.h hVar, java.lang.String str) {
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(ij(hVar.f343237e, hVar.f343236d), false, true);
        com.tencent.mm.vfs.r6 r6Var = hVar.f343233a;
        com.tencent.mm.vfs.z7 z7Var = r6Var == null ? com.tencent.mm.vfs.z7.f213276i : r6Var.f213166d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str2 = z7Var.f213279f;
            z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str2 + '/' + l17, z7Var.f213280g, z7Var.f213281h);
        }
        java.lang.String l18 = com.tencent.mm.vfs.e8.l(str, false, true);
        if (l18 != null && !l18.isEmpty()) {
            java.lang.String str3 = z7Var.f213279f;
            z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str3 + '/' + l18, z7Var.f213280g, z7Var.f213281h);
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public final boolean Di(o70.h params, java.lang.String targetPath) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "live_photo_hd_video", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.idkeyStat(1949L, 34L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1949L, 35L, 1L, false);
        }
        return Ai;
    }

    public final boolean Ni(o70.h params, java.lang.String targetPath) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "live_photo_video", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.idkeyStat(1949L, 32L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1949L, 33L, 1L, false);
        }
        return Ai;
    }

    public final boolean Ri(o70.h params, java.lang.String targetPath) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "mid.jpg", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.idkeyStat(1949L, 11L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1949L, 12L, 1L, false);
        }
        return Ai;
    }

    public final boolean Ui(o70.h params, java.lang.String targetPath) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "mid.jpg_hevc", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.idkeyStat(1949L, 13L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1949L, 14L, 1L, false);
        }
        return Ai;
    }

    public final boolean Vi(o70.h params, java.lang.String targetPath) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "orig.jpg", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.idkeyStat(1949L, 22L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1949L, 23L, 1L, false);
        }
        return Ai;
    }

    public final boolean Zi(o70.h params, java.lang.String targetPath) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "thumb.jpg", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.idkeyStat(1949L, 7L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1949L, 8L, 1L, false);
        }
        return Ai;
    }

    public final j15.c aj(o70.h params) {
        aq.u0 u0Var;
        kotlin.jvm.internal.o.g(params, "params");
        if (params.f343244l == null || (u0Var = (aq.u0) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f18278e).getValue()).get(java.lang.Long.valueOf(params.f343238f))) == null) {
            return null;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(params.f343233a, ij(params.f343237e, params.f343236d));
        java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, "live_photo_video").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.String o18 = new com.tencent.mm.vfs.r6(r6Var, "live_photo_hd_video").o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        j15.c cVar = new j15.c();
        cVar.q(u0Var.f12980f);
        cVar.y(u0Var.f12981g);
        cVar.x(com.tencent.mm.vfs.w6.k(o17));
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(o17);
        if (p17 == null) {
            p17 = "";
        }
        cVar.w(p17);
        if (params.f343240h != 1 || m11.c.a(params.f343237e)) {
            return cVar;
        }
        cVar.u(com.tencent.mm.vfs.w6.k(o18));
        java.lang.String p18 = com.tencent.mm.vfs.w6.p(o18);
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
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        kotlin.jvm.internal.o.g(midPath, "midPath");
        fj(params, targetPath, midPath, 120, 90);
    }

    public final void fj(o70.h hVar, java.lang.String str, java.lang.String str2, int i17, int i18) {
        android.graphics.Bitmap u17;
        java.lang.Object m521constructorimpl;
        int d17 = com.tencent.mm.sdk.platformtools.q2.d(hVar.f343237e);
        int a17 = com.tencent.mm.sdk.platformtools.l.a(hVar.f343237e) + (hVar.f343236d * 90);
        if (!com.tencent.mm.vfs.w6.j(str2) || com.tencent.mm.vfs.w6.k(hVar.f343237e) <= 26214400) {
            str2 = hVar.f343237e;
        }
        if (d17 > 0) {
            u17 = com.tencent.mm.sdk.platformtools.x.Q(com.tencent.mm.sdk.platformtools.q2.a(str2, d17, a17), str2, hVar.f343242j);
        } else {
            u17 = com.tencent.mm.sdk.platformtools.x.u(str2, i17, i17, true, false, hVar.f343242j);
        }
        if (u17 == null) {
            jx3.f.INSTANCE.idkeyStat(1949L, 15L, 1L, false);
        }
        boolean z17 = false;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.x.D0(u17, i18, android.graphics.Bitmap.CompressFormat.JPEG, str, false)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) m521constructorimpl;
        if (bool != null) {
            z17 = bool.booleanValue();
        } else {
            nj(hVar, 10007);
        }
        if (!z17) {
            jx3.f.INSTANCE.idkeyStat(1949L, 16L, 1L, false);
        } else if (mj()) {
            java.lang.String Y = com.tencent.mm.sdk.platformtools.x.Y(str2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Y)) {
                com.tencent.mm.sdk.platformtools.x.L0(Y, str);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "[" + hVar.f343234b + "] genThumb imgPath:" + str2 + " targetPath:" + str + " fileLength:" + com.tencent.mm.vfs.w6.k(str) + " type:" + d17);
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
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(imgPath + '_' + i17);
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        return a17;
    }

    public final boolean mj() {
        return ((java.lang.Boolean) ((jz5.n) this.f18282i).getValue()).booleanValue();
    }

    public final void nj(o70.h hVar, int i17) {
        com.tencent.mm.autogen.mmdata.rpt.SendImgErrorReportStruct sendImgErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SendImgErrorReportStruct();
        sendImgErrorReportStruct.f60212f = hVar.f343235c;
        sendImgErrorReportStruct.f60210d = i17;
        sendImgErrorReportStruct.f60211e = hVar.f343240h;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(hVar.f343237e);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str2 = a17.f213279f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        sendImgErrorReportStruct.f60213g = sendImgErrorReportStruct.b("FileName", str2, true);
        sendImgErrorReportStruct.f60214h = hVar.f343236d;
        sendImgErrorReportStruct.f60216j = sendImgErrorReportStruct.b("Rev", com.tencent.mm.sdk.platformtools.z.f193109e, true);
        sendImgErrorReportStruct.k();
        sendImgErrorReportStruct.o();
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
    public java.lang.Object qj(o70.h r31, boolean r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.u.qj(o70.h, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean wi(o70.h params, java.lang.String targetPath) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        boolean Ai = Ai(params, "hd_thumb.jpg", targetPath);
        if (Ai) {
            jx3.f.INSTANCE.idkeyStat(1949L, 9L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1949L, 10L, 1L, false);
        }
        return Ai;
    }
}
