package hc2;

/* loaded from: classes10.dex */
public abstract class l {
    public static final void a(java.lang.String logPrefix, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logPrefix, "logPrefix");
        boolean z18 = true;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            throw new java.lang.RuntimeException(logPrefix + " type:" + i17 + " invalid");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderExt", logPrefix + " type:" + i17 + " invalid", new java.lang.Object[0]);
    }

    public static final java.lang.String b(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        java.lang.String input = r26.n0.u0(str).toString();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\n\n[\\s]*\n)|(\n[\\s]*\n\n)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("\n\n");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("(\r\n\r\n[\\s]*\r\n)|(\r\n[\\s]*\r\n\r\n)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
        java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\r\n\r\n");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll2, "replaceAll(...)");
        java.util.regex.Pattern compile3 = java.util.regex.Pattern.compile("[ ]{11,}");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile3, "compile(...)");
        java.lang.String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("          ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll3, "replaceAll(...)");
        return replaceAll3;
    }

    public static final jz5.l c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l8 l8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l8(new android.media.ExifInterface(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getImageLocation] longitude:");
        java.lang.Float f17 = l8Var.f183898c;
        sb6.append(f17);
        sb6.append(" latitude:");
        java.lang.Float f18 = l8Var.f183897b;
        sb6.append(f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", sb6.toString());
        if (f18 == null || f17 == null) {
            return null;
        }
        return new jz5.l(java.lang.Double.valueOf(f18.floatValue()), java.lang.Double.valueOf(f17.floatValue()));
    }

    public static final java.lang.String d(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        java.lang.String obj = r26.n0.u0(str).toString();
        int L = r26.n0.L(obj, "\n", 0, false, 6, null);
        return L == -1 ? obj : r26.n0.b0(obj, L, obj.length(), "…").toString();
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b e(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 == null) {
            d17 = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b();
        }
        if (d17.f243918d <= 0 || d17.f243917c <= 0) {
            try {
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(com.p314xaae8f345.mm.vfs.w6.i(str, false));
                d17.f243917c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(18), 0);
                d17.f243918d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(19), 0);
                d17.f243916b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(20), 0);
                d17.f243915a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(9), 0);
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused) {
            }
        }
        int mo10218x9787f6ed = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10218x9787f6ed(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "width %d, height %d, rotate %d", java.lang.Integer.valueOf(d17.f243917c), java.lang.Integer.valueOf(d17.f243918d), java.lang.Integer.valueOf(mo10218x9787f6ed));
        if (mo10218x9787f6ed == 90 || mo10218x9787f6ed == 270) {
            int i17 = d17.f243918d;
            d17.f243918d = d17.f243917c;
            d17.f243917c = i17;
        }
        return d17;
    }

    public static final jz5.l f(java.lang.String str) {
        int i17;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            gp.d dVar = new gp.d();
            dVar.setDataSource(str);
            java.lang.String extractMetadata = dVar.extractMetadata(23);
            dVar.release();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "[getVideoLocation] locationString " + extractMetadata);
            if (!android.text.TextUtils.isEmpty(extractMetadata)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(extractMetadata);
                char[] charArray = extractMetadata.toCharArray();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray, "toCharArray(...)");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (char c17 : charArray) {
                    if (c17 != '+' && c17 != '-' && c17 != '.') {
                        i17 = android.text.TextUtils.isDigitsOnly(c17 + "") ? 0 : i17 + 1;
                    }
                    sb6.append(c17);
                }
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                int O = r26.n0.O(sb7, '+', 0, false, 6, null);
                if (-1 == O) {
                    O = r26.n0.O(sb7, '-', 0, false, 6, null);
                }
                java.lang.String substring = sb7.substring(0, O);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                double parseDouble = java.lang.Double.parseDouble(substring);
                java.lang.String substring2 = sb7.substring(O);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                return new jz5.l(java.lang.Double.valueOf(parseDouble), java.lang.Double.valueOf(java.lang.Double.parseDouble(substring2)));
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public static final boolean g(java.lang.String str) {
        java.lang.String U = g92.b.f351302e.U();
        if (str == null || str.length() == 0) {
            return false;
        }
        return (U.length() > 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, U);
    }

    public static final boolean h(java.lang.String str) {
        org.json.JSONObject optJSONObject;
        if (str == null) {
            return false;
        }
        try {
            if ((str.length() > 0 ? str : null) == null || (optJSONObject = new org.json.JSONObject(str).optJSONObject("sns_ad")) == null) {
                return false;
            }
            return optJSONObject.has("uxinfo");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderExt", "isJsapiFromAd " + e17.getMessage());
            return false;
        }
    }

    public static final boolean i(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, c01.z1.r());
    }

    public static final java.lang.String j(java.lang.String str, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.String pattern = "&?" + name + "=[^&]*";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public static final java.lang.String k(java.lang.String str) {
        java.lang.String str2;
        if (str != null) {
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    public static final int l(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        try {
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }
}
