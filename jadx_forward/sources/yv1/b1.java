package yv1;

@j95.b(m140513x1e06fd29 = {qk.x7.class, c01.j8.class, tg3.v0.class, le0.x.class})
/* loaded from: classes12.dex */
public final class b1 extends i95.w implements c01.f8 {

    /* renamed from: e, reason: collision with root package name */
    public static final yv1.m0 f547530e = new yv1.m0(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f547531f = jz5.h.b(yv1.k0.f547631d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f547532g = jz5.h.b(yv1.j0.f547625d);

    /* renamed from: d, reason: collision with root package name */
    public volatile yv1.i0 f547533d;

    public static final java.lang.String Bi(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str2 = null;
        while (it.hasNext()) {
            ot1.h hVar = (ot1.h) ((ot1.i) it.next());
            java.lang.String t07 = hVar.t0();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t07, str)) {
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(t07);
                if (com.p314xaae8f345.mm.vfs.w6.j(t07) && k17 > 0 && k17 == hVar.f68228x22618426) {
                    com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(t07);
                    boolean z17 = false;
                    if (m17 != null && (m17 instanceof com.p314xaae8f345.mm.vfs.k5)) {
                        z17 = true;
                    }
                    if (z17) {
                        return t07;
                    }
                    if (str2 == null && com.p314xaae8f345.mm.vfs.w6.m(t07) != null) {
                        str2 = t07;
                    }
                }
            }
        }
        return str2;
    }

    public void Ai(android.content.Context context, android.os.Bundle jumpChatArg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpChatArg, "jumpChatArg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13113x92bcd2ee.f177252f.b(context, jumpChatArg);
    }

    public final jz5.l Di() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_compress_original_media_unfinished", gm0.j1.b().h(), 1);
        java.lang.String t17 = J2.t("clean_cache_estimated_detail");
        if (t17 == null) {
            t17 = "";
        }
        long p17 = J2.p("clean_cache_appbrand1") + J2.p("clean_cache_appbrand2");
        long p18 = J2.p("clean_cache_cached_origin");
        aw1.o0 h17 = aw1.l0.f96101a.h();
        return new jz5.l(kz5.n0.g0(r26.n0.e0(t17, new char[]{'#'}, false, 0, 6, null), "#", null, null, 0, null, new yv1.w0(h17.f96159c, p18, h17.f96158b, p17), 30, null), t17);
    }

    public java.lang.String Ni(android.content.Context context, android.os.Bundle jumpChatArg) {
        java.lang.String e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpChatArg, "jumpChatArg");
        java.lang.String[] stringArray = jumpChatArg.getStringArray("u");
        if (stringArray == null) {
            throw new java.lang.IllegalArgumentException(jumpChatArg.toString());
        }
        if (stringArray.length != 1) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n_b, java.lang.Integer.valueOf(stringArray.length));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String str = stringArray[0];
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.f(str, str);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.e(str);
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n_c, e17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }

    public java.lang.CharSequence Ri(android.content.Context context, android.os.Bundle jumpChatArg, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpChatArg, "jumpChatArg");
        java.lang.String[] stringArray = jumpChatArg.getStringArray("u");
        if (stringArray == null) {
            throw new java.lang.IllegalArgumentException(jumpChatArg.toString());
        }
        java.lang.String Ni = Ni(context, jumpChatArg);
        if (stringArray.length != 1) {
            return Ni;
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, Ni, f17);
    }

    public boolean Ui() {
        boolean z17 = f547530e.a().getBoolean("WxFileIndex2ndIndex", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "hasSecondIndex: " + z17);
        return z17;
    }

    public boolean Vi() {
        boolean z17 = f547530e.a().getBoolean("WxFileIndex3rdIndex", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "hasThirdIndex: " + z17);
        return z17;
    }

    public boolean Zi(java.lang.String path, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (!com.p314xaae8f345.mm.vfs.w6.j(path)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(path);
        java.lang.String str = null;
        if (m17 != null) {
            if (!(m17 instanceof com.p314xaae8f345.mm.vfs.k5)) {
                m17 = null;
            }
            if (m17 != null) {
                java.util.UUID fromString = java.util.UUID.fromString(((com.p314xaae8f345.mm.vfs.k5) m17).f294562h);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fromString, "fromString(...)");
                java.lang.String Bi = Bi(path, kz5.n0.V(mt1.b0.f412724a.n().f1(c01.td.b(fromString), i17, -1, null)));
                if (Bi != null) {
                    str = Bi;
                    return !(str != null || str.length() == 0) && com.p314xaae8f345.mm.vfs.w6.d(str, path, true) >= 0;
                }
            }
        }
        if (Ui()) {
            java.lang.String Bi2 = Bi(path, kz5.n0.V(mt1.b0.f412724a.n().o1(c01.td.a(path), i17, -1, null)));
            if (Bi2 != null) {
                str = Bi2;
            }
        }
        if (str != null || str.length() == 0) {
            return false;
        }
    }

    public final void aj(yv1.b0 b0Var) {
        yv1.i0 i0Var = this.f547533d;
        if (i0Var == null || b0Var == null) {
            return;
        }
        i0Var.f547616o = false;
        java.util.HashSet hashSet = i0Var.f547606e;
        synchronized (hashSet) {
            hashSet.remove(b0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Clean cache callback removed: " + b0Var);
    }

    public final void bj() {
        yv1.i0 i0Var = this.f547533d;
        if (i0Var == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_compress_original_media_unfinished", gm0.j1.b().h(), 1);
            J2.remove("clean_cache_last_clean_size");
            J2.remove("clean_cache_estimated_size");
            J2.remove("clean_cache_session_id");
            J2.remove("clean_cache_typed_deleted_size");
            J2.remove("clean_cache_appbrand1");
            J2.remove("clean_cache_appbrand2");
            J2.remove("clean_cache_cached_origin");
            J2.remove("clean_cache_cached_origin_image");
            J2.remove("clean_cache_cached_origin_video");
            J2.remove("clean_cache_estimated_detail");
            J2.remove("clean_cache_reported");
            aw1.l0 l0Var = aw1.l0.f96101a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = aw1.l0.f96112l;
            o4Var.remove("mmkv_compress_original_media_last_task_compressed_size");
            o4Var.remove("mmkv_compress_original_media_last_task_send_compressed_size");
            o4Var.remove("mmkv_compress_original_media_last_task_recv_compressed_size");
            o4Var.remove("mmkv_compress_original_media_last_task_send_expected_size");
            o4Var.remove("mmkv_compress_original_media_last_task_recv_expected_size");
            return;
        }
        i0Var.f547607f = 0L;
        i0Var.f547608g = 0L;
        i0Var.f547609h = 0L;
        i0Var.f547610i = 0L;
        i0Var.f547611j = 0L;
        i0Var.f547612k = 0L;
        aw1.l0 l0Var2 = aw1.l0.f96101a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = aw1.l0.f96112l;
        o4Var2.remove("mmkv_compress_original_media_last_task_compressed_size");
        o4Var2.remove("mmkv_compress_original_media_last_task_send_compressed_size");
        o4Var2.remove("mmkv_compress_original_media_last_task_recv_compressed_size");
        o4Var2.remove("mmkv_compress_original_media_last_task_send_expected_size");
        o4Var2.remove("mmkv_compress_original_media_last_task_recv_expected_size");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = i0Var.f547617p;
        o4Var3.remove("clean_cache_last_clean_size");
        o4Var3.remove("clean_cache_estimated_size");
        o4Var3.remove("clean_cache_session_id");
        o4Var3.remove("clean_cache_typed_deleted_size");
        o4Var3.remove("clean_cache_appbrand1");
        o4Var3.remove("clean_cache_appbrand2");
        o4Var3.remove("clean_cache_cached_origin");
        o4Var3.remove("clean_cache_cached_origin_image");
        o4Var3.remove("clean_cache_cached_origin_video");
        o4Var3.remove("clean_cache_estimated_detail");
        o4Var3.remove("clean_cache_reported");
    }

    public final java.lang.String cj(int i17, yv1.b0 b0Var) {
        long j17;
        yv1.g1 b17 = yv1.g1.f547573p.b(i17);
        yv1.i0 i0Var = this.f547533d;
        if (i0Var != null) {
            i0Var.f547602a = b17;
            i0Var.f547613l = b17.f547576b;
        } else {
            i0Var = new yv1.i0(this);
            i0Var.f547602a = b17;
            i0Var.f547613l = b17.f547576b;
            this.f547533d = i0Var;
            i0Var.f();
        }
        if (b0Var != null) {
            java.util.HashSet hashSet = i0Var.f547606e;
            synchronized (hashSet) {
                hashSet.add(b0Var);
            }
            boolean m108008xc9602be3 = i0Var.f547605d.m108008xc9602be3();
            boolean c17 = i0Var.c();
            synchronized (i0Var) {
                j17 = i0Var.f547608g + i0Var.f547609h + i0Var.f547607f;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Clean cache callback registered: " + b0Var);
            b0Var.j4(c17, m108008xc9602be3, j17, i0Var.f547612k);
        }
        return i0Var.f547614m;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fj(android.content.Context r20, long r21, java.lang.String r23, int r24) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yv1.b1.fj(android.content.Context, long, java.lang.String, int):void");
    }

    public void hj(long j17, java.lang.String talker, boolean z17) {
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        mt1.b0 b0Var = mt1.b0.f412724a;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        mt1.z zVar = new mt1.z(c26987xeef691ab2, j17, talker, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j17, talker);
        jz5.g gVar = mt1.b0.f412731h;
        jz5.l lVar = (jz5.l) ((java.util.Map) ((jz5.n) gVar).mo141623x754a37bb()).get(c16564xb55e1d5);
        if (lVar != null && (c26987xeef691ab = (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab) lVar.f384367e) != null) {
            c26987xeef691ab.m108007xae7a2e7a();
        }
        ((java.util.Map) ((jz5.n) gVar).mo141623x754a37bb()).put(c16564xb55e1d5, new jz5.l(zVar, c26987xeef691ab2));
        ((ku5.t0) ku5.t0.f394148d).l(zVar, 100L, "CalcWxUpdates");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (Ui() && Vi()) {
            return;
        }
        ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) ((jz5.n) f547532g).mo141623x754a37bb()).mo48813x58998cd();
    }

    public void wi(java.util.List talkers, c01.e8 e8Var, long j17, long j18, boolean z17, boolean z18, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkers, "talkers");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        yv1.n0 n0Var = new yv1.n0(talkers.size(), e8Var, z18);
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.b0.f412734k = false;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Scan WxFileIndex for message delete");
            try {
                b0Var.B(true, c26987xeef691ab);
                b0Var.t(null, c26987xeef691ab);
            } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
            }
        }
        wz1.b.b(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(((ku5.t0) ku5.t0.f394148d).a(aw1.n0.b(talkers, null, j17, j18, false, n0Var, c26987xeef691ab)));
        arrayList.add(((ku5.t0) ku5.t0.f394148d).a(new yv1.s0(talkers, n0Var, j17, j18, c26987xeef691ab)));
        arrayList.add(((ku5.t0) ku5.t0.f394148d).a(new yv1.t0(talkers, c26987xeef691ab, n0Var)));
        arrayList.add(((ku5.t0) ku5.t0.f394148d).a(z18 ? new yv1.u0(talkers, n0Var) : new yv1.v0(talkers, c26987xeef691ab, j18, n0Var)));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((wu5.c) it.next()).get();
        }
        mt1.b0 b0Var2 = mt1.b0.f412724a;
        mt1.b0.f412734k = true;
        boolean m108008xc9602be3 = c26987xeef691ab != null ? c26987xeef691ab.m108008xc9602be3() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Done sync delete messages, time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", cancelled: " + m108008xc9602be3);
        if (e8Var != null) {
            e8Var.c(m108008xc9602be3, n0Var.f547652m, n0Var.f547653n);
        }
    }
}
