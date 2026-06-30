package com.tencent.mm.modelavatar;

/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f70516a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f70517b;

    /* renamed from: c, reason: collision with root package name */
    public final long f70518c;

    /* renamed from: d, reason: collision with root package name */
    public final dn.k f70519d;

    public q0(java.lang.String imgPath, kv.i0 iImgUploadCallback) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        kotlin.jvm.internal.o.g(iImgUploadCallback, "iImgUploadCallback");
        this.f70519d = new com.tencent.mm.modelavatar.p0(iImgUploadCallback, this);
        this.f70518c = java.lang.System.currentTimeMillis();
        this.f70516a = imgPath;
        java.util.Random random = new java.util.Random();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String valueOf = java.lang.String.valueOf(random.nextInt());
        java.lang.String str = "kidsupload";
        java.lang.String str2 = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0("kidsupload")) {
            int i17 = 0;
            while (true) {
                if (i17 >= 10) {
                    break;
                }
                char charAt = "kidsupload".charAt(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.y0(charAt) && !com.tencent.mm.sdk.platformtools.t8.O0(charAt)) {
                    str = null;
                    break;
                }
                i17++;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "prefix is null");
        } else if (currentTimeMillis <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "createTime <= 0");
        } else {
            byte[] bytes = this.f70516a.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("akidsupload_");
            kotlin.jvm.internal.o.d(g17);
            java.lang.String substring = g17.substring(0, 16);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            sb6.append(substring);
            sb6.append('_');
            sb6.append(currentTimeMillis);
            java.lang.String sb7 = sb6.toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(valueOf)) {
                str2 = sb7;
            } else {
                str2 = sb7 + '_' + valueOf;
            }
        }
        str2 = str2 == null ? "" : str2;
        this.f70517b = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "KidsWatchHeadImageUploader imgPath:%s mediaId:%s", imgPath, str2);
    }

    public boolean a() {
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_KidsWatchHeadImageUpload";
        mVar.f241787f = this.f70519d;
        java.lang.String str = this.f70517b;
        mVar.field_mediaId = str;
        mVar.field_fullpath = this.f70516a;
        mVar.field_thumbpath = "";
        mVar.field_fileType = 5;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 1;
        mVar.field_bzScene = 0;
        mVar.f241789h = 5;
        mVar.field_trysafecdn = true;
        mVar.field_enable_hitcheck = false;
        if (com.tencent.mm.modelcdntran.s1.fj().d(mVar)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra addSendTask failed. mediaId:%s", str);
        return false;
    }
}
