package aw1;

/* loaded from: classes12.dex */
public final class a0 {
    public a0(kotlin.jvm.internal.i iVar) {
    }

    public static aw1.b0 a(aw1.a0 a0Var, byte[] tagSet, aw1.w wVar, com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.Set set, java.util.Set set2, java.util.Set set3, java.util.Set set4, java.util.Set set5, java.util.Set set6, java.lang.Runnable runnable, long[] jArr, int i17, java.lang.Object obj) {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = (i17 & 4) != 0 ? null : cancellationSignal;
        int i18 = i17 & 8;
        kz5.r0 r0Var = kz5.r0.f314002d;
        java.util.Set forceCleanFs = i18 != 0 ? r0Var : set;
        java.util.Set forceKeepFs = (i17 & 16) != 0 ? r0Var : set2;
        java.util.Set forceCleanSelfAccountFs = (i17 & 32) != 0 ? r0Var : set3;
        java.util.Set forceKeepSelfAccountFs = (i17 & 64) != 0 ? r0Var : set4;
        java.util.Set forceCleanOtherAccountFs = (i17 & 128) != 0 ? r0Var : set5;
        java.util.Set forceKeepOtherAccountFs = (i17 & 256) != 0 ? r0Var : set6;
        java.lang.Runnable runnable2 = (i17 & 512) == 0 ? runnable : null;
        long[] taggedDeletedSize = (i17 & 1024) != 0 ? new long[21] : jArr;
        a0Var.getClass();
        kotlin.jvm.internal.o.g(tagSet, "tagSet");
        kotlin.jvm.internal.o.g(forceCleanFs, "forceCleanFs");
        kotlin.jvm.internal.o.g(forceKeepFs, "forceKeepFs");
        kotlin.jvm.internal.o.g(forceCleanSelfAccountFs, "forceCleanSelfAccountFs");
        kotlin.jvm.internal.o.g(forceKeepSelfAccountFs, "forceKeepSelfAccountFs");
        kotlin.jvm.internal.o.g(forceCleanOtherAccountFs, "forceCleanOtherAccountFs");
        kotlin.jvm.internal.o.g(forceKeepOtherAccountFs, "forceKeepOtherAccountFs");
        kotlin.jvm.internal.o.g(taggedDeletedSize, "taggedDeletedSize");
        aw1.z zVar = new aw1.z(forceKeepFs, forceKeepSelfAccountFs, forceKeepOtherAccountFs, forceCleanFs, forceCleanSelfAccountFs, forceCleanOtherAccountFs, tagSet, 120000 + java.lang.System.currentTimeMillis(), taggedDeletedSize, wVar);
        return new aw1.b0(zVar, true, zVar, cancellationSignal2, runnable2);
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
        java.util.List<java.lang.String> yc6 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).yc();
        kotlin.jvm.internal.o.f(yc6, "getNotHandleWithPrefixListWhenCleanup(...)");
        com.tencent.mm.vfs.b2 b2Var = com.tencent.mm.vfs.b2.f212807a;
        com.tencent.mm.vfs.l2.f213058q = yc6;
        com.tencent.mm.vfs.q2 b17 = ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).b("WxaCodePkgsCacheGlobal");
        if (b17 == null || (str = b17.D("", false)) == null) {
            str = lp0.b.e() + "appbrand";
        }
        kotlin.jvm.internal.o.d(str);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(yc6, 10));
        for (java.lang.String str5 : yc6) {
            java.util.List e07 = r26.n0.e0(str5, new char[]{'/'}, false, 2, 2, null);
            com.tencent.mm.vfs.FastList.Tagger tagger = new com.tencent.mm.vfs.FastList.Tagger();
            if (e07.size() > 1) {
                tagger.path = str + "/pkg/" + ((java.lang.String) e07.get(0));
                com.tencent.mm.vfs.FastList.TaggerPattern taggerPattern = new com.tencent.mm.vfs.FastList.TaggerPattern();
                taggerPattern.pattern = ((java.lang.String) e07.get(1)) + "*.wxapkg";
                tagger.patterns = new com.tencent.mm.vfs.FastList.TaggerPattern[]{taggerPattern};
            } else {
                tagger.path = str.concat("/pkg");
                com.tencent.mm.vfs.FastList.TaggerPattern taggerPattern2 = new com.tencent.mm.vfs.FastList.TaggerPattern();
                taggerPattern2.pattern = str5.concat("*.wxapkg");
                tagger.patterns = new com.tencent.mm.vfs.FastList.TaggerPattern[]{taggerPattern2};
            }
            tagger.andTag = -1;
            tagger.orTag = 0;
            arrayList.add(tagger);
        }
        com.tencent.mm.vfs.l2.f213059r = arrayList;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.vfs.b2 b2Var2 = com.tencent.mm.vfs.b2.f212807a;
        java.lang.String[] strArr = new java.lang.String[3];
        if (context == null) {
            by5.c4.c("XWebFileUtil", "getCurrentVersionDir with context, context is null");
            o17 = "";
        } else {
            org.xwalk.core.XWalkEnvironment.c(context);
            int d17 = org.xwalk.core.XWalkEnvironment.d();
            by5.c4.f("XWebFileUtil", "getCurrentVersionDir, version:" + d17);
            o17 = by5.z3.o(context, d17);
        }
        strArr[0] = o17;
        if (context == null) {
            by5.c4.c("XWebFileUtil", "getPredownloadVersionDir with context, context is null");
            o18 = "";
        } else {
            org.xwalk.core.XWalkEnvironment.c(context);
            int i17 = org.xwalk.core.XWalkEnvironment.i();
            by5.c4.f("XWebFileUtil", "getPredownloadVersionDir, version:" + i17);
            o18 = by5.z3.o(context, i17);
        }
        strArr[1] = o18;
        if (context == null) {
            by5.c4.c("XWebFileUtil", "getNewestVersionDir with context, context is null");
            o19 = "";
        } else {
            org.xwalk.core.XWalkEnvironment.c(context);
            int h17 = org.xwalk.core.XWalkEnvironment.h();
            by5.c4.f("XWebFileUtil", "getNewestVersionDir, version:" + h17);
            o19 = by5.z3.o(context, h17);
        }
        strArr[2] = o19;
        java.util.Set<java.lang.String> D0 = kz5.z.D0(strArr);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(D0, 10));
        for (java.lang.String str6 : D0) {
            com.tencent.mm.vfs.FastList.Tagger tagger2 = new com.tencent.mm.vfs.FastList.Tagger();
            tagger2.path = com.tencent.mm.vfs.b2.f212807a.a(str6);
            tagger2.orTag = 2;
            arrayList2.add(tagger2);
        }
        com.tencent.mm.vfs.l2.f213057p = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(D0, 10));
        java.util.Iterator it = D0.iterator();
        while (it.hasNext()) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a((java.lang.String) it.next());
            java.lang.String str7 = a17.f213279f;
            if (str7 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str7, false, false);
                if (!a17.f213279f.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String str8 = a17.f213279f;
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
            kotlin.jvm.internal.o.d(str9);
            if (r26.i0.y(str9, "app_xwalk", false)) {
                arrayList4.add(next);
            } else {
                arrayList5.add(next);
            }
        }
        com.tencent.mm.vfs.l2.f213055n = arrayList4;
        com.tencent.mm.vfs.l2.f213056o = arrayList5;
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        boolean b18 = kotlin.jvm.internal.o.b("1", dVar.aj("clicfg_clean_include_snsdb", "1"));
        com.tencent.mm.vfs.b2 b2Var3 = com.tencent.mm.vfs.b2.f212807a;
        java.util.List list2 = kz5.p0.f313996d;
        if (b18) {
            java.util.Map c17 = com.tencent.mm.vfs.a3.f212781a.c();
            list = new java.util.ArrayList();
            com.tencent.mm.vfs.FastList.Tagger tagger3 = new com.tencent.mm.vfs.FastList.Tagger();
            tagger3.orTag = 0;
            tagger3.depth = 1;
            com.tencent.mm.vfs.FastList.TaggerPattern taggerPattern3 = new com.tencent.mm.vfs.FastList.TaggerPattern();
            taggerPattern3.pattern = "SnsMicroMsg.db*";
            taggerPattern3.orTag = 6;
            tagger3.patterns = new com.tencent.mm.vfs.FastList.TaggerPattern[]{taggerPattern3};
            jz5.l lVar = new jz5.l("${data}/MicroMsg/${account}", tagger3);
            com.tencent.mm.vfs.FastList.Tagger tagger4 = new com.tencent.mm.vfs.FastList.Tagger();
            tagger4.orTag = 0;
            tagger4.depth = 1;
            com.tencent.mm.vfs.FastList.TaggerPattern taggerPattern4 = new com.tencent.mm.vfs.FastList.TaggerPattern();
            taggerPattern4.pattern = "SnsMicroMsg.db*";
            taggerPattern4.orTag = 6;
            tagger4.patterns = new com.tencent.mm.vfs.FastList.TaggerPattern[]{taggerPattern4};
            java.util.List i18 = kz5.c0.i(lVar, new jz5.l("${data}/MicroMsg/${accountAllOther}", tagger4));
            kotlin.jvm.internal.o.d(c17);
            b2Var3.d(list, i18, c17);
        } else {
            list = list2;
        }
        com.tencent.mm.vfs.l2.f213062u = list;
        if (b18) {
            com.tencent.mm.vfs.l2.f213047f.add("SnsMicroMsg");
        } else {
            com.tencent.mm.vfs.l2.f213047f.remove("SnsMicroMsg");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanWxTask", "Clean SnsDB: " + b18);
        boolean b19 = kotlin.jvm.internal.o.b("1", dVar.aj("clicfg_clean_include_image", "0"));
        if (!b19) {
            com.tencent.mm.vfs.q2 b27 = ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).b("image");
            if (b27 == null || (str4 = b27.D("", false)) == null) {
                str4 = gm0.j1.u().d() + "image";
            }
            kotlin.jvm.internal.o.d(str4);
            com.tencent.mm.vfs.FastList.Tagger tagger5 = new com.tencent.mm.vfs.FastList.Tagger();
            tagger5.path = str4;
            tagger5.orTag = 0;
            list2 = kz5.b0.c(tagger5);
        }
        com.tencent.mm.vfs.l2.f213063v = list2;
        if (b19) {
            com.tencent.mm.vfs.l2.f213042a.remove("image");
        } else {
            com.tencent.mm.vfs.l2.f213042a.put("image", 65536);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanWxTask", "Clean Image: " + b19);
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.q2 b28 = ((com.tencent.mm.vfs.r5) b3Var.a()).b("c2c_origin_image");
        if (b28 == null || (str2 = b28.D("", false)) == null) {
            str2 = gm0.j1.u().h() + "c2c_temp/origin/image";
        }
        kotlin.jvm.internal.o.d(str2);
        com.tencent.mm.vfs.q2 b29 = ((com.tencent.mm.vfs.r5) b3Var.a()).b("c2c_origin_video");
        if (b29 == null || (str3 = b29.D("", false)) == null) {
            str3 = gm0.j1.u().h() + "c2c_temp/origin/video";
        }
        kotlin.jvm.internal.o.d(str3);
        com.tencent.mm.vfs.FastList.Tagger tagger6 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger6.path = str2;
        tagger6.orTag = 26;
        com.tencent.mm.vfs.FastList.Tagger tagger7 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger7.path = str3;
        tagger7.orTag = 26;
        kz5.c0.i(tagger6, tagger7);
        java.util.HashMap hashMap = com.tencent.mm.vfs.l2.f213042a;
        hashMap.remove("c2c_origin_image");
        hashMap.remove("c2c_origin_video");
        boolean Xc = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Xc();
        if (Xc) {
            com.tencent.mm.vfs.q2 b37 = ((com.tencent.mm.vfs.r5) b3Var.a()).b("favorite");
            if (b37 != null && (D = b37.D("", false)) != null) {
                com.tencent.mm.vfs.FastList.Tagger tagger8 = new com.tencent.mm.vfs.FastList.Tagger();
                tagger8.path = D;
                tagger8.orTag = 0;
                kz5.b0.c(tagger8);
                hashMap.put("favorite", 65536);
            }
        } else {
            hashMap.remove("favorite");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Clean favorite: ");
        sb6.append(!Xc);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanWxTask", sb6.toString());
        ((yy0.q7) ((pp0.n0) i95.n0.c(pp0.n0.class))).getClass();
        com.tencent.mm.vfs.l2.f213064w = az0.i5.f15557a.t();
    }
}
