package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f96637a = new jt0.j(30);

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
                lVar.f295338s = ((ix1.l) aVar).f295338s;
                kVar = lVar;
                break;
            case 2:
                ?? jVar = new ix1.j();
                jVar.f295322s = ((ix1.j) aVar).f295322s;
                kVar = jVar;
                break;
            case 3:
                ?? eVar = new ix1.e();
                ix1.e eVar2 = (ix1.e) aVar;
                eVar.f295331t = eVar2.f295331t;
                eVar.f295332u = eVar2.f295332u;
                eVar.f295333v = eVar2.f295333v;
                eVar.f295334w = eVar2.f295334w;
                eVar.f295330s = eVar2.f295330s;
                eVar.f295328q = eVar2.f295328q;
                eVar.f295329r = eVar2.f295329r;
                eVar.f295335x = eVar2.f295335x;
                eVar.f295336y = eVar2.f295336y;
                eVar.f295337z = eVar2.f295337z;
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
                nVar.f295345v = nVar2.f295345v;
                nVar.f295344u = nVar2.f295344u;
                nVar.f295342s = nVar2.f295342s;
                kVar = nVar;
                break;
            case 5:
                ?? bVar = new ix1.b();
                ix1.b bVar2 = (ix1.b) aVar;
                bVar.f295326o = bVar2.f295326o;
                bVar.f295328q = bVar2.f295328q;
                bVar.f295329r = bVar2.f295329r;
                bVar.f295339s = bVar2.f295339s;
                bVar.f295340t = bVar2.f295340t;
                bVar.f295341u = bVar2.f295341u;
                kVar = bVar;
                break;
            case 6:
                ?? mVar = new ix1.m();
                ix1.m mVar2 = (ix1.m) aVar;
                mVar.f295346s = mVar2.f295346s;
                mVar.f295347t = mVar2.f295347t;
                mVar.f295348u = mVar2.f295348u;
                kVar = mVar;
                break;
        }
        if (kVar == null) {
            return null;
        }
        ix1.d dVar = (ix1.d) aVar;
        kVar.f295327p = dVar.f295327p;
        kVar.f295328q = dVar.f295328q;
        kVar.f295329r = dVar.f295329r;
        return kVar;
    }

    public static java.lang.String b(android.content.Context context, ix1.a aVar) {
        if (aVar == null) {
            return "";
        }
        int b17 = aVar.b();
        if (b17 == 1) {
            return ((ix1.l) aVar).f295338s;
        }
        if (b17 != 3) {
            return b17 == 2 ? context.getString(com.tencent.mm.R.string.f492708hj3) : b17 == 6 ? context.getString(com.tencent.mm.R.string.f492710hj5) : b17 == 4 ? context.getString(com.tencent.mm.R.string.hj6) : b17 == 5 ? context.getString(com.tencent.mm.R.string.f492707hj2, ((ix1.b) aVar).f295339s) : "";
        }
        ix1.e eVar = (ix1.e) aVar;
        return context.getString(com.tencent.mm.R.string.f492709hj4, eVar.f295330s, eVar.f295334w);
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        int i17;
        int i18;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = o72.p5.c() + "/" + (kk.k.g((str + java.lang.System.currentTimeMillis()).getBytes()) + "_TH");
        }
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
            if (n07 == null || (i17 = n07.outWidth) <= 0 || (i18 = n07.outHeight) <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorUtil", "GetImageOptions Error,use orignal file");
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
            com.tencent.mm.sdk.platformtools.x.x(str, i17, i18, android.graphics.Bitmap.CompressFormat.JPEG, 95, str2, true);
        }
        return str2;
    }

    public static int d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        return g(k(str));
    }

    public static int e(java.lang.String str, int i17, int i18, boolean z17) {
        android.text.Spanned a17;
        android.text.Spanned spanned;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (a17 = lx1.a.a(str)) == null) {
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
        android.graphics.Bitmap c17 = com.tencent.mm.plugin.fav.ui.u1.c(str, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, false);
        if (c17 != null) {
            return c17;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        return com.tencent.mm.plugin.fav.ui.u1.c(str2, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, false);
    }

    public static int g(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < str.length(); i18++) {
            i17 += str.charAt(i18) <= 127 ? 1 : 2;
        }
        return i17;
    }

    public static int h(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        kk.j jVar = f96637a;
        if (((lt0.f) jVar).k(str)) {
            return ((java.lang.Integer) ((lt0.f) jVar).get(str)).intValue();
        }
        int g17 = g(str);
        ((lt0.f) jVar).put(str, java.lang.Integer.valueOf(g17));
        return g17;
    }

    public static java.lang.String i(ix1.a aVar) {
        return aVar == null ? "" : aVar.b() == 2 ? ((ix1.j) aVar).f295329r : aVar.b() == 6 ? ((ix1.m) aVar).f295346s : "";
    }

    public static float j(long j17) {
        float f17 = ((float) j17) / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        return java.lang.Math.round(f17);
    }

    public static java.lang.String k(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() == 0) {
            return str;
        }
        return java.util.regex.Pattern.compile("&amp;", 2).matcher(java.util.regex.Pattern.compile("&gt;", 2).matcher(java.util.regex.Pattern.compile("&lt;", 2).matcher(java.util.regex.Pattern.compile("&nbsp;", 2).matcher(java.util.regex.Pattern.compile("<[^>]*>", 2).matcher(java.util.regex.Pattern.compile("</p>", 2).matcher(java.util.regex.Pattern.compile("<p [^>]*>", 2).matcher(java.util.regex.Pattern.compile("<hr[^>]*>", 2).matcher(java.util.regex.Pattern.compile("</wx-todo>", 2).matcher(java.util.regex.Pattern.compile("</wx-li>", 2).matcher(java.util.regex.Pattern.compile("<div>", 2).matcher(java.util.regex.Pattern.compile("<br[^>]*>", 2).matcher(str).replaceAll("\n")).replaceAll("")).replaceAll("\n")).replaceAll("\n")).replaceAll("\n")).replaceAll("")).replaceAll("")).replaceAll("")).replaceAll(" ")).replaceAll("<")).replaceAll(">")).replaceAll("&");
    }

    public static java.util.ArrayList l(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() == 0) {
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
            return context.getString(com.tencent.mm.R.string.ccs, 0, 0);
        }
        return context.getString(com.tencent.mm.R.string.ccs, java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60));
    }
}
