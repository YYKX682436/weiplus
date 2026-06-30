package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class e9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.e9 f102132a = new com.tencent.mm.plugin.finder.assist.e9();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f102133b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f102134c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f102135d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f102136e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f102137f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f102138g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f102139h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f102140i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f102141j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f102142k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f102143l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f102144m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f102145n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f102146o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f102147p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f102148q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f102149r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f102150s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.r2[] f102151t;

    static {
        java.lang.String str = com.tencent.mm.vfs.q7.c("finder") + '/';
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_DATA_ROOT=" + str);
        f102133b = str;
        java.lang.String str2 = com.tencent.mm.vfs.q7.c("finder_page") + '/';
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_DATA_PAGE_ROOT=" + str2);
        f102134c = str2;
        java.lang.String str3 = com.tencent.mm.vfs.q7.c("live") + '/';
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_LIVE_ROOT=" + str3);
        f102135d = str3;
        java.lang.String str4 = com.tencent.mm.vfs.q7.c("live_replay") + '/';
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_LIVE_REPLAY_ROOT=" + str4);
        f102136e = str4;
        java.lang.String str5 = com.tencent.mm.vfs.q7.c("live_replay_highlights") + '/';
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_LIVE_REPLAY_HIGHLIGHTS_ROOT=" + str5);
        f102137f = str5;
        java.lang.String str6 = com.tencent.mm.vfs.q7.c("live_visitor_mic_replay") + '/';
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_LIVE_VISITOR_MIC_REPLAY_ROOT=" + str6);
        f102138g = str6;
        java.lang.String str7 = com.tencent.mm.vfs.q7.c("finderposting") + '/';
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_POSTING_ROOT=" + str7);
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_LONG_VIDEO_ROOT=" + (com.tencent.mm.vfs.q7.c("LongVideo") + '/'));
        java.lang.String str8 = str + "image/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_IMG_DIR=" + str8);
        f102139h = str8;
        java.lang.String str9 = str + "video/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_VIDEO_DIR=" + str9);
        f102140i = str9;
        java.lang.String str10 = str + "avatar/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_AVATAR_DIR=" + str10);
        f102141j = str10;
        java.lang.String str11 = str + "cover/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_COVER_DIR=" + str11);
        f102142k = str11;
        java.lang.String str12 = str + "tmp/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_TMP_DIR=" + str12);
        f102143l = str12;
        java.lang.String str13 = str + "capture/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_CAPTURE_DIR=" + str13);
        f102144m = str13;
        java.lang.String str14 = str + "constants/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_CONSTANTS_DIR=" + str14);
        f102145n = str14;
        java.lang.String str15 = str7 + "media_tmp/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "POST_MEDIA_TMP_DIR=" + str15);
        f102146o = str15;
        java.lang.String str16 = str7 + "posting/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "POST_MEDIA_DIR=" + str16);
        f102147p = str16;
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("async_aigc_posting");
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_MASS_ASYNC_POST_ROOT=" + c17);
        f102148q = c17;
        java.lang.String str17 = str + "comment_image/";
        com.tencent.mars.xlog.Log.i("Finder.PathRouter", "FINDER_COMMENT_IMAGE_DIR=" + str17);
        f102149r = str17;
        f102150s = com.tencent.mm.vfs.q7.c("live_temp_user_transient");
        com.tencent.mm.vfs.q7.c("live_temp_shared_transient");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127861oa).getValue()).r()).intValue() == 0;
        boolean z18 = z17;
        com.tencent.mm.plugin.finder.assist.r2[] r2VarArr = {new com.tencent.mm.plugin.finder.assist.r2(str, "视频号根目录", 0L, false, 21, false, 36, null), new com.tencent.mm.plugin.finder.assist.r2(str2, "视频号page根目录", 0L, false, 0, false, 52, null), new com.tencent.mm.plugin.finder.assist.r2(str3, "视频号直播根目录", 0L, false, 31, false, 36, null), new com.tencent.mm.plugin.finder.assist.r2(str7, "视频号发表根目录", 0L, false, 21, false, 36, null), new com.tencent.mm.plugin.finder.assist.r2(str8, "feed图片目录", t70Var.Y1(), z18, 23, false, 32, null), new com.tencent.mm.plugin.finder.assist.r2(str9, "feed视频目录", t70Var.b2(), z17, 24, true), new com.tencent.mm.plugin.finder.assist.r2(str10, "视频号头像目录", t70Var.V1(), z18, 25, false, 32, null), new com.tencent.mm.plugin.finder.assist.r2(str11, "视频号封面目录", t70Var.X1(), z18, 25, false, 32, null), new com.tencent.mm.plugin.finder.assist.r2(str12, "视频号临时目录", t70Var.a2(), z18, 27, false, 32, null), new com.tencent.mm.plugin.finder.assist.r2(str14, "视频号简单数据记录目录", t70Var.V1(), z18, 0, false, 48, null), new com.tencent.mm.plugin.finder.assist.r2(str13, "视频号拍摄目录", t70Var.W1(), z18, 28, false, 32, null), new com.tencent.mm.plugin.finder.assist.r2(str16, "视频号发表目录", 0L, false, 29, false, 36, null), new com.tencent.mm.plugin.finder.assist.r2(str15, "视频号发表临时目录", t70Var.Z1(), false, 30, false, 40, null)};
        f102151t = r2VarArr;
        for (int i17 = 0; i17 < 13; i17++) {
            com.tencent.mm.vfs.w6.u(r2VarArr[i17].f102496a);
        }
    }

    public final void a() {
        com.tencent.mm.plugin.finder.assist.r2[] r2VarArr = f102151t;
        for (com.tencent.mm.plugin.finder.assist.r2 r2Var : r2VarArr) {
            com.tencent.mm.vfs.w6.f(r2Var.f102496a);
        }
        for (com.tencent.mm.plugin.finder.assist.r2 r2Var2 : r2VarArr) {
            com.tencent.mm.vfs.w6.u(r2Var2.f102496a);
        }
    }

    public final java.lang.String b() {
        fp.j jVar = new fp.j();
        jVar.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
        long j17 = 0;
        for (com.tencent.mm.plugin.finder.assist.r2 r2Var : f102151t) {
            jz5.l a17 = r2Var.a(true);
            java.lang.Object obj = a17.f302834e;
            j17 += ((java.lang.Number) obj).longValue();
            sb6.append(r2Var.f102497b + '(' + ((java.lang.Number) a17.f302833d).intValue() + " file), size=" + com.tencent.mm.sdk.platformtools.t8.f0(((java.lang.Number) obj).longValue()) + ", cost=" + jVar.a() + "ms path=" + r2Var.f102496a + '\n');
        }
        sb6.append("TotalSize=" + com.tencent.mm.sdk.platformtools.t8.f0(j17) + " Cost=" + jVar.a() + "ms");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String c(r45.zi2 musicInfo) {
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        return f102143l + musicInfo.getString(0);
    }

    public final java.lang.String d(mn2.c1 image, java.lang.String suffix) {
        kotlin.jvm.internal.o.g(image, "image");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        return f102147p + image.n() + '_' + suffix;
    }

    public final java.lang.String e(java.lang.String fileName) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        return f102147p + fileName;
    }

    public final java.lang.String f(mn2.r3 image, java.lang.String suffix) {
        kotlin.jvm.internal.o.g(image, "image");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        return f102147p + image.n() + '_' + suffix;
    }

    public final java.lang.String g(java.lang.String videoPath) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f102147p);
        sb6.append("video_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(videoPath.getBytes()));
        sb6.append('_');
        sb6.append(com.tencent.mm.vfs.w6.l(videoPath));
        sb6.append("_half_thumb");
        return sb6.toString();
    }

    public final java.lang.String h(mn2.g4 video, java.lang.String suffix) {
        kotlin.jvm.internal.o.g(video, "video");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        return f102147p + video.n() + '_' + suffix;
    }

    public final java.lang.String i(java.lang.String videoPath) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f102147p);
        sb6.append("video_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(videoPath.getBytes()));
        sb6.append('_');
        sb6.append(com.tencent.mm.vfs.w6.l(videoPath));
        sb6.append("_thumb");
        return sb6.toString();
    }

    public final java.lang.String j(java.lang.String imagePath) {
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f102149r);
        sb6.append("image_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(imagePath.getBytes()));
        sb6.append('_');
        sb6.append(com.tencent.mm.vfs.w6.l(imagePath));
        return sb6.toString();
    }

    public final java.lang.String k(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_video_");
        sb6.append(str);
        sb6.append('_');
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (str3 == null) {
                str3 = "";
            }
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            str2 = com.tencent.mm.sdk.platformtools.w2.b(str3.getBytes());
        }
        sb6.append(str2);
        return sb6.toString();
    }
}
