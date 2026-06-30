package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f178170a = new jt0.j(30);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ix1.f, ix1.l] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ix1.j, ix1.c] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ix1.d, ix1.e] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ix1.h, ix1.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ix1.g, ix1.d, ix1.b] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ix1.m] */
    public static ix1.a a(ix1.a aVar) {
        ix1.k kVar;
        if (aVar == null) {
            return null;
        }
        switch (aVar.b()) {
            case -1:
                kVar = new ix1.k();
                break;
            case 0:
            default:
                kVar = null;
                break;
            case 1:
                ?? lVar = new ix1.l();
                lVar.f376871s = ((ix1.l) aVar).f376871s;
                kVar = lVar;
                break;
            case 2:
                ?? jVar = new ix1.j();
                jVar.f376855s = ((ix1.j) aVar).f376855s;
                kVar = jVar;
                break;
            case 3:
                ?? eVar = new ix1.e();
                ix1.e eVar2 = (ix1.e) aVar;
                eVar.f376864t = eVar2.f376864t;
                eVar.f376865u = eVar2.f376865u;
                eVar.f376866v = eVar2.f376866v;
                eVar.f376867w = eVar2.f376867w;
                eVar.f376863s = eVar2.f376863s;
                eVar.f376861q = eVar2.f376861q;
                eVar.f376862r = eVar2.f376862r;
                eVar.f376868x = eVar2.f376868x;
                eVar.f376869y = eVar2.f376869y;
                eVar.f376870z = eVar2.f376870z;
                eVar.A = eVar2.A;
                eVar.B = eVar2.B;
                eVar.C = eVar2.C;
                eVar.D = eVar2.D;
                eVar.E = eVar2.E;
                kVar = eVar;
                break;
            case 4:
                ?? nVar = new ix1.n();
                ix1.n nVar2 = (ix1.n) aVar;
                nVar.f376878v = nVar2.f376878v;
                nVar.f376877u = nVar2.f376877u;
                nVar.f376875s = nVar2.f376875s;
                kVar = nVar;
                break;
            case 5:
                ?? bVar = new ix1.b();
                ix1.b bVar2 = (ix1.b) aVar;
                bVar.f376859o = bVar2.f376859o;
                bVar.f376861q = bVar2.f376861q;
                bVar.f376862r = bVar2.f376862r;
                bVar.f376872s = bVar2.f376872s;
                bVar.f376873t = bVar2.f376873t;
                bVar.f376874u = bVar2.f376874u;
                kVar = bVar;
                break;
            case 6:
                ?? mVar = new ix1.m();
                ix1.m mVar2 = (ix1.m) aVar;
                mVar.f376879s = mVar2.f376879s;
                mVar.f376880t = mVar2.f376880t;
                mVar.f376881u = mVar2.f376881u;
                kVar = mVar;
                break;
        }
        if (kVar == null) {
            return null;
        }
        ix1.d dVar = (ix1.d) aVar;
        kVar.f376860p = dVar.f376860p;
        kVar.f376861q = dVar.f376861q;
        kVar.f376862r = dVar.f376862r;
        return kVar;
    }

    public static java.lang.String b(android.content.Context context, ix1.a aVar) {
        if (aVar == null) {
            return "";
        }
        int b17 = aVar.b();
        if (b17 == 1) {
            return ((ix1.l) aVar).f376871s;
        }
        if (b17 != 3) {
            return b17 == 2 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574241hj3) : b17 == 6 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574243hj5) : b17 == 4 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hj6) : b17 == 5 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574240hj2, ((ix1.b) aVar).f376872s) : "";
        }
        ix1.e eVar = (ix1.e) aVar;
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574242hj4, eVar.f376863s, eVar.f376867w);
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        int i17;
        int i18;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = o72.p5.c() + "/" + (kk.k.g((str + java.lang.System.currentTimeMillis()).getBytes()) + "_TH");
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
            if (n07 == null || (i17 = n07.outWidth) <= 0 || (i18 = n07.outHeight) <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorUtil", "GetImageOptions Error,use orignal file");
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(str, i17, i18, android.graphics.Bitmap.CompressFormat.JPEG, 95, str2, true);
        }
        return str2;
    }

    public static int d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        return g(k(str));
    }

    public static int e(java.lang.String str, int i17, int i18, boolean z17) {
        android.text.Spanned a17;
        android.text.Spanned spanned;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (a17 = lx1.a.a(str)) == null) {
            return 0;
        }
        if (z17) {
            i18 = a17.length();
        }
        if (i17 < 0 || i17 > a17.length() || i18 < 0 || i18 > a17.length() || i17 > i18 || (spanned = (android.text.Spanned) a17.subSequence(i17, i18)) == null) {
            return 0;
        }
        return g(spanned.toString());
    }

    public static android.graphics.Bitmap f(java.lang.String str, java.lang.String str2) {
        android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.c(str, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, false);
        if (c17 != null) {
            return c17;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.c(str2, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, false);
    }

    public static int g(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < str.length(); i18++) {
            i17 += str.charAt(i18) <= 127 ? 1 : 2;
        }
        return i17;
    }

    public static int h(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        kk.j jVar = f178170a;
        if (((lt0.f) jVar).k(str)) {
            return ((java.lang.Integer) ((lt0.f) jVar).get(str)).intValue();
        }
        int g17 = g(str);
        ((lt0.f) jVar).put(str, java.lang.Integer.valueOf(g17));
        return g17;
    }

    public static java.lang.String i(ix1.a aVar) {
        return aVar == null ? "" : aVar.b() == 2 ? ((ix1.j) aVar).f376862r : aVar.b() == 6 ? ((ix1.m) aVar).f376879s : "";
    }

    public static float j(long j17) {
        float f17 = ((float) j17) / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        return java.lang.Math.round(f17);
    }

    public static java.lang.String k(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() == 0) {
            return str;
        }
        return java.util.regex.Pattern.compile("&amp;", 2).matcher(java.util.regex.Pattern.compile("&gt;", 2).matcher(java.util.regex.Pattern.compile("&lt;", 2).matcher(java.util.regex.Pattern.compile("&nbsp;", 2).matcher(java.util.regex.Pattern.compile("<[^>]*>", 2).matcher(java.util.regex.Pattern.compile("</p>", 2).matcher(java.util.regex.Pattern.compile("<p [^>]*>", 2).matcher(java.util.regex.Pattern.compile("<hr[^>]*>", 2).matcher(java.util.regex.Pattern.compile("</wx-todo>", 2).matcher(java.util.regex.Pattern.compile("</wx-li>", 2).matcher(java.util.regex.Pattern.compile("<div>", 2).matcher(java.util.regex.Pattern.compile("<br[^>]*>", 2).matcher(str).replaceAll("\n")).replaceAll("")).replaceAll("\n")).replaceAll("\n")).replaceAll("\n")).replaceAll("")).replaceAll("")).replaceAll("")).replaceAll(" ")).replaceAll("<")).replaceAll(">")).replaceAll("&");
    }

    public static java.util.ArrayList l(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() == 0) {
            return null;
        }
        java.lang.String[] split = java.util.regex.Pattern.compile("\n", 2).matcher(java.util.regex.Pattern.compile("<div></div>", 2).matcher(java.util.regex.Pattern.compile("</object>", 2).matcher(java.util.regex.Pattern.compile("<hr[^>]*>", 2).matcher(java.util.regex.Pattern.compile("<object[^>]*>", 2).matcher(java.util.regex.Pattern.compile("<div><object[^>]*></object></div>", 2).matcher(str).replaceAll("<object>")).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#")).replaceAll("#WNNoteNode#<ThisisNoteNodeHrObj>#WNNoteNode#")).replaceAll("")).replaceAll("")).replaceAll("").replaceAll("<br>", "<br/>").trim().split("#WNNoteNode#");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : split) {
            if (str2.length() > 0) {
                java.lang.String replace = str2.replace("</div>", "<div>");
                int lastIndexOf = replace.endsWith("<div>") ? replace.lastIndexOf("<div>") : -1;
                if (lastIndexOf > 0) {
                    replace = replace.substring(0, lastIndexOf);
                }
                arrayList.add(replace.replace("<div><br/>", "<div>"));
            }
        }
        return arrayList;
    }

    public static java.lang.CharSequence m(android.content.Context context, int i17) {
        if (i17 <= 0) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccs, 0, 0);
        }
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccs, java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60));
    }
}
