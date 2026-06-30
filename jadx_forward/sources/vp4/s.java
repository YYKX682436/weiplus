package vp4;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a */
    public static final vp4.s f520607a = new vp4.s();

    public static boolean b(vp4.s sVar, boolean z17, java.lang.String thumbPath, int i17, java.lang.String inputVideoPath, java.lang.String outputVideoPath, boolean z18, boolean z19, boolean z27, ct0.b bVar, boolean z28, int i18, java.lang.Object obj) {
        ct0.b bVar2 = (i18 & 256) != 0 ? null : bVar;
        boolean z29 = (i18 & 512) != 0 ? false : z28;
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputVideoPath, "inputVideoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputVideoPath, "outputVideoPath");
        if (!z29) {
            boolean C = dw3.c0.f325715a.C(outputVideoPath, thumbPath, ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Di() ? i17 : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> saveResult: " + C);
            if (!C) {
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> video thumbPath " + thumbPath + ", videoPath: " + outputVideoPath);
        if (com.p314xaae8f345.mm.vfs.w6.j(outputVideoPath)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> info:" + dw3.e0.f325735a.a(outputVideoPath));
            boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69219x922a682f(outputVideoPath);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxFileUtil", "time cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            dw3.c0.f325715a.v(z17, inputVideoPath, outputVideoPath, z18, z19, z27);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> videoPath: " + outputVideoPath + " is no exist");
        }
        sVar.g(bVar2);
        if (!z29) {
            nu3.m.f421762a.m(outputVideoPath);
        }
        return true;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n d(vp4.s sVar, r45.h70 h70Var, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, int i17, st3.r rVar, int i18, int i19, yz5.p pVar, java.lang.String str, yz5.l lVar, int i27, java.lang.Object obj) {
        return sVar.c(h70Var, c16993xacc19624, i17, rVar, i18, i19, pVar, (i27 & 128) != 0 ? "" : str, (i27 & 256) != 0 ? null : lVar);
    }

    public static void e(vp4.s sVar, st3.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, java.lang.String str, int i17, java.lang.Object obj) {
        int i18;
        java.lang.String str2 = (i17 & 4) != 0 ? "" : str;
        sVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(985L, 154L, 1L, false);
        int i19 = 0;
        if (str2.length() > 0) {
            zp4.e.f556487a.e(str2, true);
        } else {
            nu3.m.f421762a.s(0);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoExportUtil", "start forceRemux");
        java.lang.String str3 = c16993xacc19624.B + "_tmp";
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = c16993xacc19624.f237209n;
        if (c11120x15dce88d.f152739v == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoExportUtil", "ABA: Using Min Max QP Limitation: [%d], [%d] ", java.lang.Integer.valueOf(c11120x15dce88d.D), java.lang.Integer.valueOf(c16993xacc19624.f237209n.E));
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = c16993xacc19624.f237209n;
            int i27 = c11120x15dce88d2.D;
            i18 = c11120x15dce88d2.E;
            i19 = i27;
        } else {
            i18 = 51;
        }
        int i28 = rVar.f494111f;
        jz5.l lVar = (i28 == 90 || i28 == 270) ? new jz5.l(java.lang.Integer.valueOf(rVar.f494106a), java.lang.Integer.valueOf(rVar.f494107b)) : new jz5.l(java.lang.Integer.valueOf(rVar.f494107b), java.lang.Integer.valueOf(rVar.f494106a));
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        java.lang.String str4 = c16993xacc19624.B;
        int i29 = rVar.f494108c;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d3 = c16993xacc19624.f237209n;
        int m69233xcf34d77e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69233xcf34d77e(str4, str3, intValue2, intValue, i29, c11120x15dce88d3.f152735r, 8, c11120x15dce88d3.f152734q, 25.0f, rVar.f494110e, null, 0, false, i19, i18);
        com.p314xaae8f345.mm.vfs.w6.c(str3, c16993xacc19624.B);
        com.p314xaae8f345.mm.vfs.w6.h(str3);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoExportUtil", "minQP :" + i19 + "  maxQP :" + i18 + "  duration:" + m69233xcf34d77e + " cost:" + elapsedRealtime2);
        g0Var.mo68477x336bdfd8(985L, 155L, elapsedRealtime2, false);
    }

    public final rp4.a a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider, st3.s editConfig, st3.r encode, ct0.b bVar, boolean z17, boolean z18) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editConfig, "editConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encode, "encode");
        rp4.a aVar = new rp4.a();
        int i17 = configProvider.F;
        float f17 = 1.0f;
        if (i17 == 1) {
            f17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_c2c_generate_multiple_kbps, 1.0f);
        } else if (i17 == 2) {
            f17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_sns_generate_multiple_kbps, 1.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ABAParamsUtil", "final kbps: " + f17 + "  " + (encode.f494108c * f17));
        aVar.f480135e = encode.f494107b;
        aVar.f480134d = encode.f494106a;
        aVar.f480136f = (int) (((float) encode.f494108c) * f17);
        aVar.f480137g = encode.f494110e;
        aVar.f480138h = encode.f494111f;
        if (aVar.f480131a == null) {
            aVar.f480131a = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8 c17684x1bb265e8 = aVar.f480131a;
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.c();
        }
        boolean z19 = configProvider.M.getBoolean("key_use_aba_change_resolution", true);
        if (configProvider.f237212q == 3 || !z19) {
            aVar.f480133c = true;
        }
        if (bVar == null || (str = bVar.f303737a) == null) {
            str = "";
        }
        aVar.f480141k = str;
        if (z17 || z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoExportUtil", "createABAParameter exportHevcHard:" + z17 + ", exportHevcSoft:" + z18);
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = configProvider.f237209n;
            if (c11120x15dce88d != null) {
                c11120x15dce88d.A = z18 ? 1 : 2;
            }
        }
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = configProvider.f237209n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11120x15dce88d2);
        if (aVar.f480131a == null) {
            aVar.f480131a = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ABAParamsUtil", "Scene: [%d], ABASwitch: [%d] ceilingVideoBR:[%d]", java.lang.Integer.valueOf(c11120x15dce88d2.G), java.lang.Integer.valueOf(c11120x15dce88d2.f152738u), java.lang.Integer.valueOf(c11120x15dce88d2.f152742y));
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8 c17684x1bb265e82 = aVar.f480131a;
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243895a = aVar.f480135e;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243896b = aVar.f480134d;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243897c = aVar.f480136f;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243898d = editConfig.f494125f;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243899e = editConfig.f494126g;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243900f = c11120x15dce88d2.G;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243901g = c11120x15dce88d2.f152738u;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243902h = c11120x15dce88d2.f152739v;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243903i = c11120x15dce88d2.f152740w;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243904j = c11120x15dce88d2.f152741x;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243905k = c11120x15dce88d2.f152742y;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243906l = c11120x15dce88d2.f152743z;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243908n = c11120x15dce88d2.B;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243907m = c11120x15dce88d2.A;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243909o = c11120x15dce88d2.C;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243910p = c11120x15dce88d2.D;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243911q = c11120x15dce88d2.E;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243912r = c11120x15dce88d2.F;
        }
        if (c17684x1bb265e82 != null) {
            c17684x1bb265e82.f243913s = c11120x15dce88d2.P;
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r1 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        r1 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r1 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        r1 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if ((r21.length() == 0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        if ((r21.length() == 0) != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n c(r45.h70 r14, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 r15, int r16, st3.r r17, int r18, int r19, yz5.p r20, java.lang.String r21, yz5.l r22) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp4.s.c(r45.h70, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, int, st3.r, int, int, yz5.p, java.lang.String, yz5.l):com.tencent.mm.plugin.vlog.model.n");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x05ac A[LOOP:2: B:104:0x05a6->B:106:0x05ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[LOOP:4: B:144:0x04b0->B:155:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0335 A[LOOP:5: B:161:0x0273->B:174:0x0335, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.h70 f(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 r29, st3.s r30, rp4.x r31, boolean r32, boolean r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp4.s.f(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, st3.s, rp4.x, boolean, boolean, java.lang.String, int):r45.h70");
    }

    public final void g(ct0.b bVar) {
        if (bVar != null) {
            ut3.f fVar = ut3.f.f512709c;
            fVar.f512711b.putBoolean("key_is_capture_video", bVar.f303739c);
            android.os.Bundle bundle = fVar.f512711b;
            java.util.ArrayList arrayList = bVar.f303747k;
            bundle.putBoolean("key_is_photo_video", !(arrayList == null || arrayList.isEmpty()));
            java.util.ArrayList arrayList2 = bVar.f303747k;
            if (!(arrayList2 == null || arrayList2.isEmpty())) {
                fVar.f512711b.putStringArrayList("key_src_list", bVar.f303747k);
                return;
            }
            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
            arrayList3.add(bVar.f303737a);
            fVar.f512711b.putStringArrayList("key_src_list", arrayList3);
        }
    }
}
