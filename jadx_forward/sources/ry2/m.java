package ry2;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f482939a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_android_use_algorithm_check_black_frame_switch, 0);

    /* renamed from: b, reason: collision with root package name */
    public final int f482940b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_android_replace_user_default_thumb_switch, 0);

    public final r45.fp5 a(java.lang.String path, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        r45.fp5 fp5Var = new r45.fp5();
        fp5Var.f456066i = -1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCoverPath useAlgorithmCoverSwitch:");
        int i17 = this.f482939a;
        sb6.append(i17);
        sb6.append(" replaceUserDefaultThumbSwitch:");
        int i18 = this.f482940b;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostReplaceCover", sb6.toString());
        fp5Var.f456067m = i17;
        fp5Var.f456068n = i18;
        if (i17 > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long d17 = d(path, 0L, j17);
            fp5Var.f456065h = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
            fp5Var.f456064g = (int) d17;
            if (i18 > 0) {
                if (0 <= d17 && d17 <= j17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostReplaceCover", "getThumbBitmap replace from: to:" + d17);
                    java.lang.String b17 = com.p314xaae8f345.mm.vfs.x6.b(path, false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "exportExternalPath(...)");
                    e(c(b17, d17), new ry2.k(fp5Var));
                }
            }
        }
        return fp5Var;
    }

    public final r45.fp5 b(r45.h70 composition) {
        long j17;
        java.lang.String str;
        long j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        r45.fp5 fp5Var = new r45.fp5();
        fp5Var.f456066i = -1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCoverPath useAlgorithmCoverSwitch:");
        int i17 = this.f482939a;
        sb6.append(i17);
        sb6.append(" replaceUserDefaultThumbSwitch:");
        int i18 = this.f482940b;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostReplaceCover", sb6.toString());
        fp5Var.f456067m = i17;
        fp5Var.f456068n = i18;
        if (i17 > 0) {
            long j19 = composition.f457431e;
            long j27 = composition.f457432f;
            java.util.Iterator it = composition.f457430d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    j17 = -1;
                    str = "";
                    j18 = -1;
                    break;
                }
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                r45.ho6 ho6Var = (r45.ho6) next;
                if (ho6Var.f457867e == 2) {
                    j18 = ho6Var.f457870h;
                    j17 = ho6Var.f457869g - ho6Var.f457868f;
                    java.lang.String path = ho6Var.f457866d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
                    str = path;
                    break;
                }
            }
            if (j18 >= 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long d17 = d(str, j18, j17);
                fp5Var.f456065h = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
                fp5Var.f456064g = (int) d17;
                if (i18 > 0) {
                    if (j19 <= d17 && d17 <= j27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostReplaceCover", "getThumbBitmap replace from:" + j19 + " to:" + d17);
                        java.lang.String b17 = com.p314xaae8f345.mm.vfs.x6.b(str, false);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "exportExternalPath(...)");
                        e(c(b17, d17), new ry2.l(fp5Var));
                    }
                }
            }
        }
        return fp5Var;
    }

    public final android.graphics.Bitmap c(java.lang.String str, long j17) {
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                aVar.c(3);
                aVar.c(java.lang.Long.valueOf(j17 * 1000));
                yj0.a.d(mediaMetadataRetriever, aVar.b(), "com/tencent/mm/plugin/finder/widget/post/FinderPostReplaceCover", "getThumbBitmap", "(Ljava/lang/String;J)Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
                zj0.c.f554818a.set(aVar);
                android.graphics.Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(((java.lang.Long) aVar.a(0)).longValue(), ((java.lang.Integer) zj0.c.a().a(1)).intValue());
                yj0.a.e(mediaMetadataRetriever, frameAtTime, "com/tencent/mm/plugin/finder/widget/post/FinderPostReplaceCover", "getThumbBitmap", "(Ljava/lang/String;J)Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
                try {
                    mediaMetadataRetriever.release();
                    return frameAtTime;
                } catch (java.io.IOException unused) {
                    return frameAtTime;
                }
            } catch (java.io.IOException unused2) {
                return null;
            }
        } catch (java.lang.IllegalArgumentException | java.lang.RuntimeException unused3) {
            mediaMetadataRetriever.release();
            return null;
        } catch (java.lang.Throwable th6) {
            try {
                mediaMetadataRetriever.release();
            } catch (java.io.IOException unused4) {
            }
            throw th6;
        }
    }

    public final long d(java.lang.String str, long j17, long j18) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8.h(str, ((float) j17) / 1000.0f, ((float) j18) / 1000.0f, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_finder_android_black_frame_avgmvthresh, -1.0f), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_finder_android_black_frame_avgqpthresh, -1.0f), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_finder_android_black_frame_skipmodethresh, -1.0f));
    }

    public final void e(android.graphics.Bitmap bitmap, yz5.r rVar) {
        if (bitmap == null) {
            rVar.C("", "", "", 0);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p;
        sb6.append(str);
        sb6.append("cover_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, t70Var.r2(), android.graphics.Bitmap.CompressFormat.JPEG, sb7, false)) {
            sb7 = "";
        }
        java.lang.String str2 = str + "full_cover_" + java.lang.System.currentTimeMillis();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, t70Var.r2(), android.graphics.Bitmap.CompressFormat.JPEG, str2, false)) {
            str2 = "";
        }
        java.lang.String str3 = str + "share_cover_" + java.lang.System.currentTimeMillis();
        rVar.C(str2, sb7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, t70Var.r2(), android.graphics.Bitmap.CompressFormat.JPEG, str3, false) ? str3 : "", java.lang.Integer.valueOf(t70Var.v2() ? com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8.e(40, 0, bitmap.getWidth(), bitmap.getHeight(), t70Var.r2() / 100.0f) : 0));
    }
}
