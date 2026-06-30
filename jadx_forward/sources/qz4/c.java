package qz4;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f449470a;

    static {
        new java.util.HashMap();
        new java.util.HashMap();
        f449470a = new jt0.j(30);
    }

    public static iz4.c a(iz4.c cVar, nz4.h hVar) {
        iz4.o oVar;
        int i17;
        if (cVar == null) {
            return null;
        }
        switch (cVar.d()) {
            case -1:
                oVar = new iz4.h();
                break;
            case 0:
            default:
                oVar = null;
                break;
            case 1:
                iz4.i iVar = new iz4.i();
                iVar.f377688t = ((iz4.i) cVar).f377688t;
                oVar = iVar;
                break;
            case 2:
                iz4.f fVar = new iz4.f();
                fVar.f377671t = ((iz4.f) cVar).f377671t;
                oVar = fVar;
                break;
            case 3:
                iz4.g gVar = new iz4.g();
                iz4.g gVar2 = (iz4.g) cVar;
                gVar.f377682u = gVar2.f377682u;
                gVar.f377683v = gVar2.f377683v;
                gVar.f377684w = gVar2.f377684w;
                gVar.f377685x = gVar2.f377685x;
                gVar.f377681t = gVar2.f377681t;
                gVar.f377686y = gVar2.f377686y;
                gVar.f377687z = gVar2.f377687z;
                gVar.A = gVar2.A;
                gVar.B = gVar2.B;
                gVar.C = gVar2.C;
                gVar.D = gVar2.D;
                gVar.E = gVar2.E;
                gVar.F = gVar2.F;
                oVar = gVar;
                break;
            case 4:
                iz4.l lVar = new iz4.l();
                iz4.l lVar2 = (iz4.l) cVar;
                lVar.f377694v = lVar2.f377694v;
                lVar.f377696x = lVar2.f377696x;
                lVar.f377695w = lVar2.f377695w;
                lVar.f377692t = lVar2.f377692t;
                oVar = lVar;
                break;
            case 5:
                iz4.d dVar = new iz4.d();
                iz4.d dVar2 = (iz4.d) cVar;
                dVar.f377689t = dVar2.f377689t;
                dVar.f377690u = dVar2.f377690u;
                dVar.f377691v = dVar2.f377691v;
                oVar = dVar;
                break;
            case 6:
                iz4.k kVar = new iz4.k();
                iz4.k kVar2 = (iz4.k) cVar;
                kVar.f377650t = kVar2.f377650t;
                kVar.f377651u = kVar2.f377651u;
                kVar.f377652v = kVar2.f377652v;
                oVar = kVar;
                break;
            case 7:
                iz4.p pVar = (iz4.p) cVar;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj();
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_we_note_force_check_cdn, 0) == 1) {
                    oVar = pVar.h(hVar);
                    break;
                } else {
                    iz4.p pVar2 = new iz4.p();
                    java.util.LinkedList list = pVar.f377669t;
                    if (hVar != null && (i17 = hVar.f423152a) == hVar.f423154c && i17 == pVar.a()) {
                        int i18 = hVar.f423155d;
                        for (int i19 = hVar.f423153b; i19 < i18; i19++) {
                            java.lang.Object obj = list.get(i19);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                            pVar2.g((iz4.c) obj);
                        }
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
                        pVar2.f377669t.addAll(list);
                    }
                    oVar = pVar2;
                    break;
                }
                break;
        }
        if (oVar == null) {
            return null;
        }
        iz4.o oVar2 = (iz4.o) cVar;
        oVar.f377666q = oVar2.f377666q;
        oVar.f377667r = oVar2.f377667r;
        oVar.f377668s = oVar2.f377668s;
        return oVar;
    }

    public static java.lang.String b(android.content.Context context, iz4.c cVar) {
        if (cVar == null) {
            return "";
        }
        int d17 = cVar.d();
        return d17 == 1 ? ((iz4.i) cVar).f377688t : d17 == 3 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_q) : d17 == 2 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_p) : d17 == 6 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_r) : d17 == 4 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_s) : d17 == 5 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_o) : "";
    }

    public static java.lang.String c(java.lang.String origPath, java.lang.String thumbFullPath) {
        int i17;
        int i18;
        int i19;
        int i27;
        java.lang.String Y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(thumbFullPath)) {
            thumbFullPath = o72.p5.c() + "/" + (kk.k.g((origPath + java.lang.System.currentTimeMillis()).getBytes()) + "_HD");
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(thumbFullPath)) {
            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(origPath);
            if (n07 == null || (i17 = n07.outWidth) <= 0 || (i18 = n07.outHeight) <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteUtil", "GetImageOptions Error");
                return null;
            }
            int i28 = i17 > 1280 ? 1280 : i17;
            int i29 = i18 <= 1280 ? i18 : 1280;
            if (i18 < i17) {
                int i37 = i28;
                i28 = i29;
                i29 = i37;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.d(origPath) > 0) {
                i19 = n07.outHeight;
                i27 = n07.outWidth;
            } else {
                i19 = i29;
                i27 = i28;
            }
            android.graphics.Bitmap.CompressFormat format = android.graphics.Bitmap.CompressFormat.JPEG;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origPath, "origPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFullPath, "thumbFullPath");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(origPath, i19, i27, format, 95, thumbFullPath, true) && (Y = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Y(origPath)) != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(Y, thumbFullPath);
            }
        }
        return thumbFullPath;
    }

    public static java.lang.String d(java.lang.String origPath, java.lang.String thumbFullPath) {
        int i17;
        int i18;
        java.lang.String Y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(thumbFullPath)) {
            thumbFullPath = o72.p5.c() + "/" + (kk.k.g((origPath + java.lang.System.currentTimeMillis()).getBytes()) + "_TH");
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(thumbFullPath)) {
            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(origPath);
            if (n07 == null || (i17 = n07.outWidth) <= 0 || (i18 = n07.outHeight) <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteUtil", "GetImageOptions Error,use orignal file");
                return null;
            }
            while (i17 * i18 > 2764800) {
                i17 >>= 1;
                i18 >>= 1;
            }
            if (i17 > 800) {
                i17 = 800;
            }
            if (i18 > 800) {
                i18 = 800;
            }
            if (n07.outHeight >= n07.outWidth) {
                int i19 = i18;
                i18 = i17;
                i17 = i19;
            }
            android.graphics.Bitmap.CompressFormat format = android.graphics.Bitmap.CompressFormat.JPEG;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origPath, "origPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFullPath, "thumbFullPath");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(origPath, i17, i18, format, 95, thumbFullPath, true) && (Y = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Y(origPath)) != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(Y, thumbFullPath);
            }
        }
        return thumbFullPath;
    }

    public static int e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        return h(qz4.b.a(str));
    }

    public static int f(java.lang.String str, int i17, int i18, boolean z17) {
        android.text.Spanned a17;
        android.text.Spanned spanned;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (a17 = kz4.a.a(str)) == null) {
            return 0;
        }
        if (z17) {
            i18 = a17.length();
        }
        if (i17 < 0 || i17 > a17.length() || i18 < 0 || i18 > a17.length() || i17 > i18 || (spanned = (android.text.Spanned) a17.subSequence(i17, i18)) == null) {
            return 0;
        }
        return h(spanned.toString());
    }

    public static android.graphics.Bitmap g(java.lang.String str, java.lang.String str2) {
        android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.c(str, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, false);
        if (c17 != null) {
            return c17;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.c(str2, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, false);
    }

    public static int h(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < str.length(); i18++) {
            i17 += str.charAt(i18) <= 127 ? 1 : 2;
        }
        return i17;
    }

    public static int i(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        kk.j jVar = f449470a;
        if (((lt0.f) jVar).k(str)) {
            return ((java.lang.Integer) ((lt0.f) jVar).get(str)).intValue();
        }
        int h17 = h(str);
        ((lt0.f) jVar).put(str, java.lang.Integer.valueOf(h17));
        return h17;
    }

    public static java.util.HashMap j(java.lang.String str, java.lang.String str2, boolean z17, android.content.Context context) {
        new java.util.ArrayList();
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(str2).matcher(str);
        java.util.HashMap hashMap = new java.util.HashMap();
        while (matcher.find()) {
            java.lang.String group = matcher.group(1);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(group)) {
                java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("<wx-li>(.*?)</wx-li>").matcher(group);
                java.lang.String str3 = "";
                int i17 = 1;
                while (matcher2.find()) {
                    if (z17) {
                        str3 = str3 + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_u) + i17 + matcher2.group(1);
                    } else {
                        str3 = str3 + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574271ho4) + matcher2.group(1);
                    }
                    i17++;
                }
                hashMap.put(group, str3);
            }
        }
        return hashMap;
    }

    public static java.lang.String k(iz4.c cVar) {
        return cVar == null ? "" : cVar.d() == 2 ? ((iz4.f) cVar).f377668s : cVar.d() == 6 ? ((iz4.k) cVar).f377650t : "";
    }

    public static java.lang.String l(java.lang.String str, android.content.Context context) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start, html = ");
        sb6.append(str);
        sb6.append(", isAccessibilityEnable = ");
        la5.c cVar = la5.b.f399133a;
        sb6.append(cVar.g(true));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteUtil", sb6.toString());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && cVar.g(true)) {
            try {
                java.lang.String replaceAll = str.replaceAll("<wn-todo checked=\"0\" >", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdu)).replaceAll("<wn-todo checked=\"1\" >", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdt)).replaceAll("</wn-todo>", "");
                java.util.HashMap j17 = j(replaceAll, "<wx-ul>(.*?)</wx-ul>", false, context);
                for (java.lang.String str2 : j17.keySet()) {
                    replaceAll = replaceAll.replaceAll("<wx-ul>" + str2 + "</wx-ul>", (java.lang.String) j17.get(str2));
                }
                java.util.HashMap j18 = j(replaceAll, "<wx-ol>(.*?)</wx-ol>", true, context);
                for (java.lang.String str3 : j18.keySet()) {
                    replaceAll = replaceAll.replaceAll("<wx-ol>" + str3 + "</wx-ol>", (java.lang.String) j18.get(str3));
                }
                str = replaceAll.replaceAll("</wx-ul>", "").replaceAll("</wx-li>", "").replaceAll("</wn-todo>", "").replaceAll("</wn-todo>", "").replaceAll("</wx-ol>", "");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteUtil", "e = " + e17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteUtil", "end htmlStr = " + str);
        }
        return str;
    }
}
