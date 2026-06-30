package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f257313a = new java.util.ArrayList();

    public static final r45.h70 a(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition, r45.i70 outputConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputConfig, "outputConfig");
        r45.h70 h70Var = new r45.h70();
        long j17 = 1000;
        h70Var.f457431e = composition.i().m97261xccb87a6a() / j17;
        h70Var.f457432f = composition.i().m97259x74606f23() / j17;
        java.util.LinkedList linkedList = h70Var.f457430d;
        java.util.ArrayList arrayList = composition.f257130c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 track = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
            r45.ho6 ho6Var = new r45.ho6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
            ho6Var.f457866d = track.f257149a;
            ho6Var.f457867e = track.f257150b;
            rm5.j jVar = track.f257160l;
            ho6Var.f457868f = jVar.f479035d;
            ho6Var.f457869g = jVar.f479036e;
            ho6Var.f457870h = jVar.f479037f;
            ho6Var.f457871i = jVar.f479038g;
            ho6Var.f457872m = jVar.f479041j;
            ho6Var.f457873n = track.f257154f;
            ho6Var.f457874o = track.f257155g;
            ho6Var.f457875p = track.f257156h;
            ho6Var.f457876q = jVar.f479040i;
            r45.ka0 ka0Var = new r45.ka0();
            ho6Var.f457877r = ka0Var;
            ka0Var.f460059d = new r45.aj4();
            ka0Var.f460062g = new r45.vl5();
            ka0Var.f460060e = new r45.vl5();
            ka0Var.f460061f = new r45.vl5();
            ka0Var.f460063h = new r45.vl5();
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = track.f257157i;
            android.graphics.Matrix matrix = yVar.f257317a;
            r45.aj4 matrix2 = ka0Var.f460059d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matrix2, "matrix");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            java.util.LinkedList linkedList2 = matrix2.f451585d;
            linkedList2.clear();
            for (int i17 = 0; i17 < 9; i17++) {
                linkedList2.add(java.lang.Float.valueOf(fArr[i17]));
            }
            r45.vl5 contentRect = ka0Var.f460062g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentRect, "contentRect");
            g(yVar.f257320d, contentRect);
            r45.vl5 cropRect = ka0Var.f460060e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cropRect, "cropRect");
            g(yVar.f257318b, cropRect);
            r45.vl5 viewRect = ka0Var.f460061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewRect, "viewRect");
            g(yVar.f257319c, viewRect);
            android.graphics.Rect rect = jVar.f479046o;
            r45.vl5 trackCropRect = ka0Var.f460063h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(trackCropRect, "trackCropRect");
            g(rect, trackCropRect);
            r45.wp6 wp6Var = new r45.wp6();
            ho6Var.f457879t = wp6Var;
            rm5.n transition = jVar.f479048q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
            wp6Var.f470912d = transition.f479062a;
            wp6Var.f470914f = transition.f479064c;
            ho6Var.f457878s = track.f257151c;
            arrayList2.add(ho6Var);
        }
        linkedList.addAll(arrayList2);
        h70Var.f457433g = composition.f257133f;
        h70Var.f457436m = true;
        h70Var.f457435i = outputConfig;
        h70Var.f457434h = composition.f257135h;
        h70Var.f457440q = composition.f257136i;
        h70Var.f457441r = new java.util.LinkedList();
        for (java.util.Map.Entry entry : so4.g.f492316h.entrySet()) {
            r45.j70 j70Var = new r45.j70();
            j70Var.f459153d = (java.lang.String) entry.getKey();
            java.lang.Object first = ((android.util.Pair) entry.getValue()).first;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
            j70Var.f459154e = ((java.lang.Number) first).intValue();
            java.lang.Object second = ((android.util.Pair) entry.getValue()).second;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
            j70Var.f459155f = ((java.lang.Number) second).longValue();
            h70Var.f457441r.add(j70Var);
        }
        return h70Var;
    }

    public static final java.lang.String b(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        int i17 = -1;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i18 = length - 1;
                if (str.charAt(length) == '/') {
                    i17 = length;
                    break;
                }
                if (i18 < 0) {
                    break;
                }
                length = i18;
            }
        }
        java.lang.String substring = str.substring(i17 + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 c(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h1Var, "<this>");
        java.util.Iterator it = h1Var.f257130c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            rm5.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj).f257160l;
            if (jVar.f479035d <= j17 && jVar.f479036e > j17) {
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 d(r45.h70 proto, com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc effectMgr) {
        int i17;
        int i18;
        java.lang.String str;
        uq5.y i19;
        uq5.y i27;
        java.lang.String str2;
        uq5.y i28;
        uq5.y yVar;
        int i29;
        uq5.y i37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effectMgr, "effectMgr");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList tracks = proto.f457430d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tracks, "tracks");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tracks, 10));
        java.util.Iterator it = tracks.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.ho6 ho6Var = (r45.ho6) it.next();
            java.lang.String path = ho6Var.f457866d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(path, ho6Var.f457867e, 0);
            i1Var.e(ho6Var.f457868f);
            i1Var.a(ho6Var.f457869g);
            i1Var.d(ho6Var.f457870h);
            i1Var.c(ho6Var.f457871i);
            i1Var.f257154f = ho6Var.f457873n;
            i1Var.f257155g = ho6Var.f457874o;
            i1Var.f257156h = ho6Var.f457875p;
            i1Var.f257160l.f(ho6Var.f457876q);
            r45.vl5 vl5Var = ho6Var.f457877r.f460060e;
            rm5.j jVar = i1Var.f257160l;
            f(vl5Var, jVar.f479045n);
            f(ho6Var.f457877r.f460063h, jVar.f479046o);
            r45.wp6 wp6Var = ho6Var.f457879t;
            if (wp6Var != null) {
                rm5.n transition = jVar.f479048q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
                java.lang.String path2 = wp6Var.f470912d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path2, "path");
                transition.f479062a = path2;
                transition.f479064c = wp6Var.f470914f;
            }
            arrayList.add(i1Var);
        }
        linkedList.addAll(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(linkedList);
        r45.i70 i70Var = proto.f457435i;
        if (i70Var.f458326y != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            f(proto.f457435i.f458326y, rect);
            i17 = rect.width();
            i18 = rect.height();
        } else {
            i17 = i70Var.f458309e;
            i18 = i70Var.f458310f;
        }
        h1Var.e().l(i17, i18);
        h1Var.s(proto.f457431e, proto.f457432f);
        boolean z17 = true;
        java.lang.String str3 = "musicPath";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(proto.f457434h)) {
            java.lang.String musicPath = proto.f457434h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(musicPath, "musicPath");
            h1Var.a(musicPath, true);
        }
        h1Var.d(proto.f457433g);
        if (proto.f457435i.f458311g != null) {
            android.graphics.Rect rect2 = new android.graphics.Rect();
            f(proto.f457435i.f458311g, rect2);
            h1Var.t(rect2);
        } else {
            android.graphics.Rect rect3 = new android.graphics.Rect();
            r45.i70 i70Var2 = proto.f457435i;
            r45.y25 y25Var = i70Var2.f458327z;
            if (y25Var != null) {
                f(y25Var.f472263d, rect3);
            } else {
                f(i70Var2.A.f472263d, rect3);
            }
            h1Var.t(rect3);
        }
        java.util.Iterator it6 = h1Var.f257130c.iterator();
        while (true) {
            str = "getAssets(...)";
            if (!it6.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it6.next();
            if (i1Var2.f257160l.f479048q.a()) {
                boolean A = r26.i0.A(i1Var2.f257160l.f479048q.f479062a, "assets://", false, 2, null);
                uq5.k kVar = uq5.k.PAGTransitionEffect;
                if (A) {
                    android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
                    i37 = effectMgr.h(kVar, assets, i1Var2.f257160l.f479048q.f479062a);
                } else {
                    i37 = effectMgr.i(kVar, i1Var2.f257160l.f479048q.f479062a);
                }
                i1Var2.f257160l.f479048q.f479063b = i37;
                effectMgr.c(i37);
            }
        }
        h1Var.q(effectMgr);
        java.util.LinkedList stickerEffectList = proto.f457444u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stickerEffectList, "stickerEffectList");
        java.util.Iterator it7 = ((java.util.ArrayList) kz5.n0.t0(stickerEffectList, f257313a)).iterator();
        while (it7.hasNext()) {
            r45.fe6 fe6Var = (r45.fe6) it7.next();
            java.lang.String str4 = fe6Var.f455792e;
            boolean z18 = (str4 == null || str4.length() == 0) ? z17 : false;
            uq5.k kVar2 = uq5.k.StickerEffect;
            if (z18) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = fe6Var.f455793f;
                if (gVar != null) {
                    byte[] bArr = gVar.f273689a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
                    yVar = effectMgr.j(kVar2, bArr);
                } else {
                    yVar = null;
                }
            } else {
                java.lang.String path3 = fe6Var.f455792e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path3, "path");
                yVar = effectMgr.i(kVar2, path3);
            }
            uq5.w wVar = yVar instanceof uq5.w ? (uq5.w) yVar : null;
            if (wVar != null) {
                r45.oi0 oi0Var = fe6Var.f455796i;
                r45.ni0 ni0Var = fe6Var.f455797m;
                java.lang.String str5 = str3;
                java.lang.String str6 = str;
                wVar.b(oi0Var.f463808d, oi0Var.f463809e);
                uq5.f fVar = new uq5.f(ni0Var.f462947d, ni0Var.f462948e, ni0Var.f462949f, ni0Var.f462950g);
                uq5.q qVar = wVar.f511798d;
                qVar.getClass();
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6 c22985x615f1ce6 = com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495;
                c22985x615f1ce6.m83855x13be9db0(qVar.f511794a.f511802c, fVar);
                int i38 = fe6Var.f455794g;
                if (i38 != 0 && (i29 = fe6Var.f455795h) != 0) {
                    c22985x615f1ce6.m83862xfdca8f6f(wVar.f511802c, i38, i29);
                }
                effectMgr.c(wVar);
                str3 = str5;
                str = str6;
                z17 = true;
            }
        }
        java.lang.String str7 = str3;
        java.lang.String str8 = str;
        java.util.LinkedList baseItemData = proto.f457437n.f456472e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseItemData, "baseItemData");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : baseItemData) {
            int i39 = ((r45.de) obj).f453871d;
            zu3.e eVar = zu3.e.f557329e;
            if (i39 == 8) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            r45.de deVar = (r45.de) it8.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(deVar);
            zu3.y yVar2 = new zu3.y(deVar);
            java.lang.String str9 = yVar2.f557398g;
            boolean A2 = r26.i0.A(str9, "assets://", false, 2, null);
            uq5.k kVar3 = uq5.k.PAGTextEffect;
            if (A2) {
                android.content.res.AssetManager assets2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
                str2 = str8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets2, str2);
                i28 = effectMgr.h(kVar3, assets2, str9);
            } else {
                str2 = str8;
                i28 = effectMgr.i(kVar3, str9);
            }
            effectMgr.c(i28);
            android.util.Size size = new android.util.Size(0, 0);
            yVar2.f557401j = size.getWidth();
            yVar2.f557402k = size.getHeight();
            android.graphics.Rect rect4 = new android.graphics.Rect();
            f(proto.f457437n.f456471d, rect4);
            yVar2.f557406o.set(rect4);
            yVar2.p(yVar2.f557296f);
            yVar2.f557399h = i28 != null ? i28.f511800a : 0L;
            str8 = str2;
        }
        java.lang.String str10 = str8;
        java.util.LinkedList<r45.ci4> magicInfoList = proto.f457438o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(magicInfoList, "magicInfoList");
        for (r45.ci4 ci4Var : magicInfoList) {
            java.lang.String path4 = ci4Var.f453107d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path4, "path");
            boolean y17 = r26.i0.y(path4, "assets://", false);
            uq5.k kVar4 = uq5.k.PAGGlobalAnimateEffect;
            if (y17) {
                android.content.res.AssetManager assets3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets3, str10);
                java.lang.String path5 = ci4Var.f453107d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path5, "path");
                i27 = effectMgr.h(kVar4, assets3, path5);
            } else {
                java.lang.String path6 = ci4Var.f453107d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path6, "path");
                i27 = effectMgr.i(kVar4, path6);
            }
            if (i27 != null) {
                i27.b(ci4Var.f453108e, ci4Var.f453109f);
            }
            effectMgr.c(i27);
        }
        r45.tz6 tz6Var = proto.f457439p;
        if (tz6Var != null) {
            java.lang.String templatePath = tz6Var.f468423d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(templatePath, "templatePath");
            boolean y18 = r26.i0.y(templatePath, "assets://", false);
            uq5.k kVar5 = uq5.k.PAGVideoTemplateEffect;
            if (y18) {
                android.content.res.AssetManager assets4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets4, str10);
                java.lang.String templatePath2 = proto.f457439p.f468423d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(templatePath2, "templatePath");
                i19 = effectMgr.h(kVar5, assets4, templatePath2);
            } else {
                java.lang.String templatePath3 = proto.f457439p.f468423d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(templatePath3, "templatePath");
                i19 = effectMgr.i(kVar5, templatePath3);
            }
            effectMgr.c(i19);
            new android.util.Size(0, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(proto.f457439p.f468423d, "templatePath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(proto.f457439p.f468424e, str7);
            long j17 = proto.f457439p.f468425f;
            new java.util.ArrayList();
            effectMgr.f();
            if (i19 != null) {
                i19.b(0L, j17);
            }
            java.lang.String str11 = proto.f457439p.f468424e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str11, str7);
            h1Var.a(str11, false);
            java.util.Iterator it9 = h1Var.f257130c.iterator();
            while (it9.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it9.next()).f257160l.f479047p = false;
            }
        }
        h1Var.f257136i = proto.f457440q;
        if (h1Var.f257136i) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.LinkedList<r45.j70> trackLabelInfoList = proto.f457441r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(trackLabelInfoList, "trackLabelInfoList");
            for (r45.j70 j70Var : trackLabelInfoList) {
                java.lang.String path7 = j70Var.f459153d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path7, "path");
                hashMap.put(path7, java.lang.Integer.valueOf(j70Var.f459154e));
            }
            uq5.y g17 = effectMgr.g(uq5.k.ImageEnhanceEffect);
            uq5.p pVar = g17 instanceof uq5.p ? (uq5.p) g17 : null;
            if (pVar != null) {
                pVar.b(h1Var.j(), h1Var.h());
            }
            effectMgr.c(pVar);
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_FACE_LANDMARKS_INT_SYNC", 0) == 1;
            if (z19 && pVar != null) {
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83861x8d5376cf(pVar.f511802c, z19);
            }
            java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(dp4.b.f323796b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
            if ((M.length() > 0) && pVar != null) {
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83854xc7842b9f(pVar.f511802c, M);
            }
            h1Var.f257128a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n1(h1Var, hashMap, pVar));
        }
        return h1Var;
    }

    public static final zv3.c e(r45.h70 proto) {
        float[] fArr;
        int width;
        int height;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        lt3.n nVar = lt3.n.f402793a;
        java.util.LinkedList<r45.de> baseItemData = proto.f457437n.f456472e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseItemData, "baseItemData");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "get the editor data which is waiting for run mixing");
        for (r45.de deVar : baseItemData) {
            int i17 = deVar.f453871d;
            zu3.e eVar = zu3.e.f557329e;
            if (i17 == 1) {
                arrayList.add(new zu3.b0(context).d(new zu3.a0(deVar)));
            } else if (i17 == 2) {
                zu3.j jVar = new zu3.j(deVar);
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = jVar.f557343g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC4987x84e327cb);
                av3.e eVar2 = new av3.e(interfaceC4987x84e327cb, jVar.f557296f);
                r45.bi0 bi0Var = new r45.bi0();
                bv3.d dVar = jVar.f557293c;
                bi0Var.f452305d = dVar.c();
                bi0Var.f452306e = dVar.b();
                eVar2.f95746c = bi0Var;
                arrayList.add(eVar2);
            } else if (i17 == 3) {
                zu3.z zVar = new zu3.z(context);
                zu3.s sVar = new zu3.s(deVar);
                arrayList.add(new av3.c(zVar.c(sVar), sVar.f557296f));
            } else if (i17 == 4) {
                zu3.c0 c0Var = new zu3.c0(context);
                zu3.a0 a0Var = new zu3.a0(deVar);
                arrayList.add(new av3.c(c0Var.c(a0Var), a0Var.f557296f));
            } else if (i17 == 5) {
                arrayList.add(new zu3.m(context).r(new zu3.t(deVar)));
            } else {
                zu3.e eVar3 = zu3.e.f557334m;
                if (i17 == 6) {
                    byte[] bArr = deVar.f453872e.f453374f.f273689a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
                    arrayList.add(new av3.d(new zu3.d(eVar3, bArr)));
                } else {
                    zu3.e eVar4 = zu3.e.f557335n;
                    if (i17 == 7) {
                        byte[] bArr2 = deVar.f453872e.f453374f.f273689a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr2, "getBytes(...)");
                        arrayList.add(new av3.d(new zu3.d(eVar4, bArr2)));
                    }
                }
            }
        }
        java.util.LinkedList values = proto.f457437n.f456471d.f469883d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "values");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(values, 10));
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Float.valueOf(((java.lang.Integer) it.next()).intValue()));
        }
        float[] P0 = kz5.n0.P0(arrayList2);
        r45.vl5 vl5Var = proto.f457437n.f456474g;
        if (vl5Var != null) {
            java.util.LinkedList values2 = vl5Var.f469883d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "values");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(values2, 10));
            java.util.Iterator it6 = values2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Float.valueOf(((java.lang.Integer) it6.next()).intValue()));
            }
            fArr = kz5.n0.P0(arrayList3);
        } else {
            fArr = null;
        }
        float[] fArr2 = fArr;
        r45.i70 i70Var = proto.f457435i;
        if (i70Var.f458326y == null) {
            width = i70Var.f458309e;
            height = i70Var.f458310f;
        } else {
            android.graphics.Rect rect = new android.graphics.Rect();
            f(proto.f457435i.f458326y, rect);
            width = rect.width();
            height = rect.height();
        }
        return new zv3.f(P0, fArr2, arrayList, width, height);
    }

    public static final void f(r45.vl5 vl5Var, android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        if (vl5Var != null && vl5Var.f469883d.size() == 4) {
            java.lang.Object obj = vl5Var.f469883d.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            int intValue = ((java.lang.Number) obj).intValue();
            java.lang.Object obj2 = vl5Var.f469883d.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            int intValue2 = ((java.lang.Number) obj2).intValue();
            java.lang.Object obj3 = vl5Var.f469883d.get(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            int intValue3 = ((java.lang.Number) obj3).intValue();
            java.lang.Object obj4 = vl5Var.f469883d.get(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
            rect.set(intValue, intValue2, intValue3, ((java.lang.Number) obj4).intValue());
        }
    }

    public static final void g(android.graphics.Rect rect, r45.vl5 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        proto.f469883d.clear();
        proto.f469883d.add(java.lang.Integer.valueOf(rect.left));
        proto.f469883d.add(java.lang.Integer.valueOf(rect.top));
        proto.f469883d.add(java.lang.Integer.valueOf(rect.right));
        proto.f469883d.add(java.lang.Integer.valueOf(rect.bottom));
    }
}
