package j53;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f379341a = new java.util.HashMap();

    public d(j53.a aVar) {
    }

    public static java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 c17 = c(c16991x15ced046.f237194e);
        if (c17 == null) {
            return null;
        }
        java.lang.String b17 = b(c16991x15ced046.f237195f, c16991x15ced046.f237194e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4.f264535b.b(b17);
        if (b18 != null) {
            c17.f264270f = b18.f264271g;
        }
        c17.f264283v.putInt("mark_edit_flag", d(c16991x15ced046.a()));
        return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.i(c17.f264269e, b17, c17.f264287w, c17.f264278q, c17.f264277p, c17.f264276o);
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
            java.lang.String m82467xfb82e301 = r6Var.m82467xfb82e301();
            java.lang.String substring = (android.text.TextUtils.isEmpty(m82467xfb82e301) || !m82467xfb82e301.contains(".")) ? null : m82467xfb82e301.substring(0, m82467xfb82e301.lastIndexOf("."));
            if (android.text.TextUtils.isEmpty(substring)) {
                str = r6Var.r() + "microMsg_" + java.lang.System.currentTimeMillis() + ".jpeg";
            } else {
                str = r6Var.r() + "/" + substring + ".jpeg";
            }
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "file is exist for path:%s!", str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "create new thumb path:%s!", str);
            android.graphics.Bitmap createVideoThumbnail = android.media.ThumbnailUtils.createVideoThumbnail(str2, 1);
            if (createVideoThumbnail == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.ActionAfterVideoEdited", "createVideoThumbnail bitmap fail for path:%s!", str);
                return "";
            }
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(android.media.ThumbnailUtils.extractThumbnail(createVideoThumbnail, uc1.w1.f76932x366c91de, 400, 2), 30, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.ActionAfterVideoEdited", "saveBitmapToImage exist IOException:" + e17.getMessage());
            }
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 e18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.e(str, str);
        e18.f264281t = true;
        e18.f264275n = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(e18);
        return e18.f264269e;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 c(java.lang.String str) {
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.ActionAfterVideoEdited", "video after edited is error");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(str);
        b17.f264287w = d17.a();
        int i17 = d17.f243928n;
        if (i17 == 90 || i17 == 270) {
            b17.f264277p = d17.f243918d;
            b17.f264278q = d17.f243917c;
        } else {
            b17.f264277p = d17.f243917c;
            b17.f264278q = d17.f243918d;
        }
        b17.f264276o = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(b17);
        return b17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255) {
        boolean z17 = false;
        if (c16994x3ba8255 == null) {
            return 0;
        }
        boolean z18 = ((java.lang.Integer) c16994x3ba8255.b("KEY_ADD_EMOJI_COUNT_INT", 0)).intValue() != 0 ? 1 : 0;
        boolean z19 = ((java.lang.Integer) c16994x3ba8255.b("KEY_ADD_TEXT_COUNT_INT", 0)).intValue() != 0;
        boolean z27 = ((java.lang.Integer) c16994x3ba8255.b("KEY_SELECT_MUSIC_INT", 0)).intValue() != 0;
        long intValue = ((java.lang.Integer) c16994x3ba8255.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", 0)).intValue();
        long intValue2 = ((java.lang.Integer) c16994x3ba8255.b("KEY_VIDEO_CROP_DURATION_MS_INT", 0)).intValue();
        if (intValue != 0 && intValue2 != 0 && intValue != intValue2) {
            z17 = true;
        }
        int i17 = z19 ? z18 | 2 : z18;
        if (z27) {
            i17 |= 4;
        }
        if (z17) {
            i17 |= 8;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "hasEmoji:%b, hasText:%b, hasMusic:%b, hasCut:%b, editFlag:%d", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        int i17 = bundle.getInt("key_video_from", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 a17 = c16991x15ced046.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("videoid", com.p314xaae8f345.mm.vfs.w6.p(c16991x15ced046.f237194e));
        hashMap.put("costtime", a17.b("KEY_REMUX_VIDEO_COST_MS_INT", 0));
        hashMap.put("origtime", java.lang.Integer.valueOf(bundle.getInt("key_raw_video_duration", 0)));
        hashMap.put("cliptime", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(c16991x15ced046.f237196g.longValue())));
        int i18 = bundle.getInt("key_raw_video_size", 0);
        hashMap.put("origsize", java.lang.Integer.valueOf(i18));
        hashMap.put("remuxsize", java.lang.Integer.valueOf((int) com.p314xaae8f345.mm.vfs.w6.k(c16991x15ced046.f237194e)));
        int intValue = ((java.lang.Integer) a17.b("KEY_ADD_EMOJI_COUNT_INT", 0)).intValue();
        hashMap.put("hasexpre", java.lang.Integer.valueOf(intValue));
        int intValue2 = ((java.lang.Integer) a17.b("KEY_ADD_TEXT_COUNT_INT", 0)).intValue();
        hashMap.put("hasword", a17.b("KEY_ADD_TEXT_COUNT_INT", 0));
        hashMap.put("hasmusic", 1);
        if (((java.lang.String) a17.b("KEY_MUSIC_ID_STRING", "")).isEmpty()) {
            hashMap.put("hasmusic", 0);
        }
        j53.c cVar = new j53.c();
        cVar.f379340d = i18;
        cVar.f379337a = intValue2;
        cVar.f379338b = intValue;
        if (!((java.lang.String) a17.b("KEY_MUSIC_ID_STRING", "")).isEmpty()) {
            cVar.f379339c = 1;
        }
        j53.b.f379336a.f379341a.put(c16991x15ced046.f237194e, cVar);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            stringBuffer.append((java.lang.String) entry.getKey());
            stringBuffer.append(":");
            stringBuffer.append(entry.getValue());
            stringBuffer.append(", ");
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        java.lang.Boolean bool = c16991x15ced046.f237193d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "remuxResult:%b, statistic:[%s]", bool, stringBuffer2);
        int i19 = bundle.getInt("game_haowan_source_scene_id", 0);
        if (bool.booleanValue()) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8763, 2, 48, i19, lj0.a.a(i17, hashMap));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.ActionAfterVideoEdited", "video remux error");
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8763, 2, 56, i19, lj0.a.a(i17, hashMap));
        }
    }

    public static void f(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        if (str.equals(c16991x15ced046.f237195f)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str));
        if (com.p314xaae8f345.mm.vfs.w6.d(c16991x15ced046.f237195f, str, false) > 0) {
            c16991x15ced046.f237195f = str;
        }
    }

    public static void g(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        if (str.equals(c16991x15ced046.f237194e)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str));
        if (com.p314xaae8f345.mm.vfs.w6.d(c16991x15ced046.f237194e, str, false) > 0) {
            c16991x15ced046.f237194e = str;
        }
    }
}
