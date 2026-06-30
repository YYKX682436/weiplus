package xl3;

/* loaded from: classes11.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f536652a = {"#", "?", "&"};

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f536653b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f536654c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f536655d = java.util.regex.Pattern.compile("songid=([0-9]+)");

    public static boolean a(java.lang.String str, boolean z17, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081) {
        java.lang.String str2 = new java.lang.String(k(str));
        int indexOf = str2.indexOf("{");
        if (indexOf != -1) {
            str2 = str2.substring(indexOf);
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            java.lang.String string = jSONObject.getString("song_WapLiveURL");
            java.lang.String string2 = jSONObject.getString("song_WifiURL");
            if (z17) {
                string = string2;
            }
            c19772x1c2cd081.f38869x6ac9171 = string;
            return true;
        } catch (java.lang.Exception e17) {
            c19772x1c2cd081.f38869x6ac9171 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicUrlUtil", e17, "decodeJson", new java.lang.Object[0]);
            return false;
        }
    }

    public static java.lang.String b(b21.r rVar) {
        if (h(rVar) == null) {
            return null;
        }
        java.lang.String c17 = c(rVar.f98885n);
        if (c17 != null) {
            return c17;
        }
        java.lang.String c18 = c(rVar.f98887p);
        return c18 != null ? c18 : c(rVar.f98886o);
    }

    public static java.lang.String c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String str2 = f536653b;
        if (str2 != null && str.equals(str2)) {
            return f536654c;
        }
        java.lang.String[] strArr = f536652a;
        java.lang.String str3 = "";
        java.lang.String str4 = null;
        for (int i17 = 0; i17 < 3; i17++) {
            str3 = strArr[i17] + "p=";
            if (str.contains(str3)) {
                str4 = str;
            }
            if (str4 != null) {
                break;
            }
        }
        if (str4 == null) {
            return null;
        }
        int indexOf = str4.indexOf(str3);
        if (indexOf < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.MusicUrlUtil", "pIndex is %d, return", java.lang.Integer.valueOf(indexOf));
            return null;
        }
        java.lang.String substring = str4.substring(indexOf + str3.length());
        for (int i18 = 0; i18 < 3; i18++) {
            int indexOf2 = substring.indexOf(strArr[i18]);
            if (indexOf2 > 0) {
                substring = substring.substring(0, indexOf2);
            }
        }
        if (substring != null) {
            f536653b = str;
            f536654c = substring;
        }
        return substring;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a) {
        java.lang.String str3 = (z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) ? str : str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return str3;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlUtil", "url[%s], lowBandUrl[%s], isWifi[%B]", str, str2, java.lang.Boolean.valueOf(z17));
        java.lang.String c17 = c(str3);
        if (c17 != null) {
            if (a(c17, z17, c19772x1c2cd081)) {
                c19762x487075a.f38859x6ac9171 = z17;
            }
        } else if (str3.contains("wechat_music_url=")) {
            a(str3.substring(str3.indexOf("wechat_music_url=") + 17), z17, c19772x1c2cd081);
        } else {
            c19772x1c2cd081.f38869x6ac9171 = str3;
        }
        return c19772x1c2cd081.f38869x6ac9171;
    }

    public static int e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        java.util.regex.Matcher matcher = f536655d.matcher(str);
        if (matcher.find()) {
            try {
                return java.lang.Integer.valueOf(matcher.group(1)).intValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicUrlUtil", e17, "getSongId", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    public static java.lang.String f(java.lang.String str) {
        int indexOf = str == null ? -1 : str.indexOf("songid=");
        if (indexOf < 0) {
            return null;
        }
        java.lang.String substring = str.substring(indexOf + 7);
        return (substring == null || !substring.contains("&")) ? substring : substring.substring(0, substring.indexOf("&"));
    }

    public static java.lang.String g(java.lang.String str) {
        int indexOf = str == null ? -1 : str.indexOf("songmid=");
        if (indexOf < 0) {
            return null;
        }
        java.lang.String substring = str.substring(indexOf + 8);
        return (substring == null || !substring.contains("&")) ? substring : substring.substring(0, substring.indexOf("&"));
    }

    public static java.lang.String h(b21.r rVar) {
        if (rVar == null) {
            return null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98885n)) {
            return rVar.f98885n;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98887p)) {
            return rVar.f98887p;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98886o)) {
            return null;
        }
        return rVar.f98886o;
    }

    public static java.lang.String i(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        if (str2 == null) {
            return "";
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
            if (packageInfo == null) {
                return "";
            }
            str = "" + packageInfo.versionName;
            try {
                return str + "" + packageInfo.versionCode;
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                e = e17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicUrlUtil", e, "", new java.lang.Object[0]);
                return str;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e18) {
            e = e18;
            str = "";
        }
    }

    public static boolean j(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        if ((parse != null ? parse.getHost() : "") == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlUtil", "host is null, url is not match .qq.com");
            return false;
        }
        boolean contains = parse.getHost().contains(".qq.com");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.MusicUrlUtil", "url %s match ? %B", str, java.lang.Boolean.valueOf(contains));
        return contains;
    }

    public static byte[] k(java.lang.String str) {
        int i17;
        byte[] bArr = new byte[(str.length() / 2) + (str.length() % 2)];
        int i18 = 0;
        int i19 = 0;
        while (i18 < str.length()) {
            try {
                int i27 = i18 + 1;
                char charAt = str.charAt(i18);
                int i28 = (charAt < '1' || charAt > '9') ? (charAt < 'A' || charAt > 'F') ? 0 : (charAt - 'A') + 10 : charAt - '0';
                if (i27 < str.length()) {
                    int i29 = i27 + 1;
                    char charAt2 = str.charAt(i27);
                    i17 = (charAt2 < '1' || charAt2 > '9') ? (charAt2 < 'A' || charAt2 > 'F') ? 0 : (charAt2 - 'A') + 10 : charAt2 - '0';
                    i27 = i29;
                } else {
                    i17 = 0;
                }
                int i37 = i19 + 1;
                bArr[i19] = (byte) ((i28 << 4) | i17);
                i18 = i27;
                i19 = i37;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return bArr;
    }
}
