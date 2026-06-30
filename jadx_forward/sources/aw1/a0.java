package aw1;

/* loaded from: classes12.dex */
public final class a0 {
    public a0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static aw1.b0 a(aw1.a0 a0Var, byte[] tagSet, aw1.w wVar, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, java.util.Set set, java.util.Set set2, java.util.Set set3, java.util.Set set4, java.util.Set set5, java.util.Set set6, java.lang.Runnable runnable, long[] jArr, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = (i17 & 4) != 0 ? null : c26987xeef691ab;
        int i18 = i17 & 8;
        kz5.r0 r0Var = kz5.r0.f395535d;
        java.util.Set forceCleanFs = i18 != 0 ? r0Var : set;
        java.util.Set forceKeepFs = (i17 & 16) != 0 ? r0Var : set2;
        java.util.Set forceCleanSelfAccountFs = (i17 & 32) != 0 ? r0Var : set3;
        java.util.Set forceKeepSelfAccountFs = (i17 & 64) != 0 ? r0Var : set4;
        java.util.Set forceCleanOtherAccountFs = (i17 & 128) != 0 ? r0Var : set5;
        java.util.Set forceKeepOtherAccountFs = (i17 & 256) != 0 ? r0Var : set6;
        java.lang.Runnable runnable2 = (i17 & 512) == 0 ? runnable : null;
        long[] taggedDeletedSize = (i17 & 1024) != 0 ? new long[21] : jArr;
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagSet, "tagSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceCleanFs, "forceCleanFs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceKeepFs, "forceKeepFs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceCleanSelfAccountFs, "forceCleanSelfAccountFs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceKeepSelfAccountFs, "forceKeepSelfAccountFs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceCleanOtherAccountFs, "forceCleanOtherAccountFs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceKeepOtherAccountFs, "forceKeepOtherAccountFs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taggedDeletedSize, "taggedDeletedSize");
        aw1.z zVar = new aw1.z(forceKeepFs, forceKeepSelfAccountFs, forceKeepOtherAccountFs, forceCleanFs, forceCleanSelfAccountFs, forceCleanOtherAccountFs, tagSet, 120000 + java.lang.System.currentTimeMillis(), taggedDeletedSize, wVar);
        return new aw1.b0(zVar, true, zVar, c26987xeef691ab2, runnable2);
    }

    public final void b() {
        java.lang.String str;
        java.lang.String o17;
        java.lang.String o18;
        java.lang.String o19;
        java.util.List list;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String D;
        java.lang.String str4;
        java.util.List<java.lang.String> yc6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).yc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(yc6, "getNotHandleWithPrefixListWhenCleanup(...)");
        com.p314xaae8f345.mm.vfs.b2 b2Var = com.p314xaae8f345.mm.vfs.b2.f294340a;
        com.p314xaae8f345.mm.vfs.l2.f294591q = yc6;
        com.p314xaae8f345.mm.vfs.q2 b17 = ((com.p314xaae8f345.mm.vfs.r5) com.p314xaae8f345.mm.vfs.a3.f294314a.a()).b("WxaCodePkgsCacheGlobal");
        if (b17 == null || (str = b17.D("", false)) == null) {
            str = lp0.b.e() + "appbrand";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(yc6, 10));
        for (java.lang.String str5 : yc6) {
            java.util.List e07 = r26.n0.e0(str5, new char[]{'/'}, false, 2, 2, null);
            com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
            if (e07.size() > 1) {
                tagger.f39809x346425 = str + "/pkg/" + ((java.lang.String) e07.get(0));
                com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern taggerPattern = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern();
                taggerPattern.f39814xd0d8eb90 = ((java.lang.String) e07.get(1)) + "*.wxapkg";
                tagger.f39810x4a4486e3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[]{taggerPattern};
            } else {
                tagger.f39809x346425 = str.concat("/pkg");
                com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern taggerPattern2 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern();
                taggerPattern2.f39814xd0d8eb90 = str5.concat("*.wxapkg");
                tagger.f39810x4a4486e3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[]{taggerPattern2};
            }
            tagger.f39806xabc2ea43 = -1;
            tagger.f39808x6514ab7 = 0;
            arrayList.add(tagger);
        }
        com.p314xaae8f345.mm.vfs.l2.f294592r = arrayList;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.vfs.b2 b2Var2 = com.p314xaae8f345.mm.vfs.b2.f294340a;
        java.lang.String[] strArr = new java.lang.String[3];
        if (context == null) {
            by5.c4.c("XWebFileUtil", "getCurrentVersionDir with context, context is null");
            o17 = "";
        } else {
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.c(context);
            int d17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
            by5.c4.f("XWebFileUtil", "getCurrentVersionDir, version:" + d17);
            o17 = by5.z3.o(context, d17);
        }
        strArr[0] = o17;
        if (context == null) {
            by5.c4.c("XWebFileUtil", "getPredownloadVersionDir with context, context is null");
            o18 = "";
        } else {
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.c(context);
            int i17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.i();
            by5.c4.f("XWebFileUtil", "getPredownloadVersionDir, version:" + i17);
            o18 = by5.z3.o(context, i17);
        }
        strArr[1] = o18;
        if (context == null) {
            by5.c4.c("XWebFileUtil", "getNewestVersionDir with context, context is null");
            o19 = "";
        } else {
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.c(context);
            int h17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.h();
            by5.c4.f("XWebFileUtil", "getNewestVersionDir, version:" + h17);
            o19 = by5.z3.o(context, h17);
        }
        strArr[2] = o19;
        java.util.Set<java.lang.String> D0 = kz5.z.D0(strArr);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(D0, 10));
        for (java.lang.String str6 : D0) {
            com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger2 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
            tagger2.f39809x346425 = com.p314xaae8f345.mm.vfs.b2.f294340a.a(str6);
            tagger2.f39808x6514ab7 = 2;
            arrayList2.add(tagger2);
        }
        com.p314xaae8f345.mm.vfs.l2.f294590p = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(D0, 10));
        java.util.Iterator it = D0.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a((java.lang.String) it.next());
            java.lang.String str7 = a17.f294812f;
            if (str7 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str7, false, false);
                if (!a17.f294812f.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.lang.String str8 = a17.f294812f;
            int lastIndexOf = str8.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str8 = str8.substring(lastIndexOf + 1);
            }
            arrayList3.add(str8);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            java.lang.String str9 = (java.lang.String) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str9);
            if (r26.i0.y(str9, "app_xwalk", false)) {
                arrayList4.add(next);
            } else {
                arrayList5.add(next);
            }
        }
        com.p314xaae8f345.mm.vfs.l2.f294588n = arrayList4;
        com.p314xaae8f345.mm.vfs.l2.f294589o = arrayList5;
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", dVar.aj("clicfg_clean_include_snsdb", "1"));
        com.p314xaae8f345.mm.vfs.b2 b2Var3 = com.p314xaae8f345.mm.vfs.b2.f294340a;
        java.util.List list2 = kz5.p0.f395529d;
        if (b18) {
            java.util.Map c17 = com.p314xaae8f345.mm.vfs.a3.f294314a.c();
            list = new java.util.ArrayList();
            com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
            tagger3.f39808x6514ab7 = 0;
            tagger3.f39807x5b0cac3 = 1;
            com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern taggerPattern3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern();
            taggerPattern3.f39814xd0d8eb90 = "SnsMicroMsg.db*";
            taggerPattern3.f39813x6514ab7 = 6;
            tagger3.f39810x4a4486e3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[]{taggerPattern3};
            jz5.l lVar = new jz5.l("${data}/MicroMsg/${account}", tagger3);
            com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger4 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
            tagger4.f39808x6514ab7 = 0;
            tagger4.f39807x5b0cac3 = 1;
            com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern taggerPattern4 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern();
            taggerPattern4.f39814xd0d8eb90 = "SnsMicroMsg.db*";
            taggerPattern4.f39813x6514ab7 = 6;
            tagger4.f39810x4a4486e3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[]{taggerPattern4};
            java.util.List i18 = kz5.c0.i(lVar, new jz5.l("${data}/MicroMsg/${accountAllOther}", tagger4));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            b2Var3.d(list, i18, c17);
        } else {
            list = list2;
        }
        com.p314xaae8f345.mm.vfs.l2.f294595u = list;
        if (b18) {
            com.p314xaae8f345.mm.vfs.l2.f294580f.add("SnsMicroMsg");
        } else {
            com.p314xaae8f345.mm.vfs.l2.f294580f.remove("SnsMicroMsg");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanWxTask", "Clean SnsDB: " + b18);
        boolean b19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", dVar.aj("clicfg_clean_include_image", "0"));
        if (!b19) {
            com.p314xaae8f345.mm.vfs.q2 b27 = ((com.p314xaae8f345.mm.vfs.r5) com.p314xaae8f345.mm.vfs.a3.f294314a.a()).b("image");
            if (b27 == null || (str4 = b27.D("", false)) == null) {
                str4 = gm0.j1.u().d() + "image";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
            com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger5 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
            tagger5.f39809x346425 = str4;
            tagger5.f39808x6514ab7 = 0;
            list2 = kz5.b0.c(tagger5);
        }
        com.p314xaae8f345.mm.vfs.l2.f294596v = list2;
        if (b19) {
            com.p314xaae8f345.mm.vfs.l2.f294575a.remove("image");
        } else {
            com.p314xaae8f345.mm.vfs.l2.f294575a.put("image", 65536);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanWxTask", "Clean Image: " + b19);
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.q2 b28 = ((com.p314xaae8f345.mm.vfs.r5) b3Var.a()).b("c2c_origin_image");
        if (b28 == null || (str2 = b28.D("", false)) == null) {
            str2 = gm0.j1.u().h() + "c2c_temp/origin/image";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        com.p314xaae8f345.mm.vfs.q2 b29 = ((com.p314xaae8f345.mm.vfs.r5) b3Var.a()).b("c2c_origin_video");
        if (b29 == null || (str3 = b29.D("", false)) == null) {
            str3 = gm0.j1.u().h() + "c2c_temp/origin/video";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger6 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger6.f39809x346425 = str2;
        tagger6.f39808x6514ab7 = 26;
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger7 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger7.f39809x346425 = str3;
        tagger7.f39808x6514ab7 = 26;
        kz5.c0.i(tagger6, tagger7);
        java.util.HashMap hashMap = com.p314xaae8f345.mm.vfs.l2.f294575a;
        hashMap.remove("c2c_origin_image");
        hashMap.remove("c2c_origin_video");
        boolean Xc = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Xc();
        if (Xc) {
            com.p314xaae8f345.mm.vfs.q2 b37 = ((com.p314xaae8f345.mm.vfs.r5) b3Var.a()).b("favorite");
            if (b37 != null && (D = b37.D("", false)) != null) {
                com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger8 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
                tagger8.f39809x346425 = D;
                tagger8.f39808x6514ab7 = 0;
                kz5.b0.c(tagger8);
                hashMap.put("favorite", 65536);
            }
        } else {
            hashMap.remove("favorite");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Clean favorite: ");
        sb6.append(!Xc);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanWxTask", sb6.toString());
        ((yy0.q7) ((pp0.n0) i95.n0.c(pp0.n0.class))).getClass();
        com.p314xaae8f345.mm.vfs.l2.f294597w = az0.i5.f97090a.t();
    }
}
