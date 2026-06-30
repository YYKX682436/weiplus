package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f152049a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f152050b;

    /* renamed from: c, reason: collision with root package name */
    public final long f152051c;

    /* renamed from: d, reason: collision with root package name */
    public final dn.k f152052d;

    public q0(java.lang.String imgPath, kv.i0 iImgUploadCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iImgUploadCallback, "iImgUploadCallback");
        this.f152052d = new com.p314xaae8f345.mm.p943x351df9c2.p0(iImgUploadCallback, this);
        this.f152051c = java.lang.System.currentTimeMillis();
        this.f152049a = imgPath;
        java.util.Random random = new java.util.Random();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String valueOf = java.lang.String.valueOf(random.nextInt());
        java.lang.String str = "kidsupload";
        java.lang.String str2 = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("kidsupload")) {
            int i17 = 0;
            while (true) {
                if (i17 >= 10) {
                    break;
                }
                char charAt = "kidsupload".charAt(i17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y0(charAt) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O0(charAt)) {
                    str = null;
                    break;
                }
                i17++;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "prefix is null");
        } else if (currentTimeMillis <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "createTime <= 0");
        } else {
            byte[] bytes = this.f152049a.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("akidsupload_");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            java.lang.String substring = g17.substring(0, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            sb6.append(substring);
            sb6.append('_');
            sb6.append(currentTimeMillis);
            java.lang.String sb7 = sb6.toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(valueOf)) {
                str2 = sb7;
            } else {
                str2 = sb7 + '_' + valueOf;
            }
        }
        str2 = str2 == null ? "" : str2;
        this.f152050b = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "KidsWatchHeadImageUploader imgPath:%s mediaId:%s", imgPath, str2);
    }

    public boolean a() {
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_KidsWatchHeadImageUpload";
        mVar.f323320f = this.f152052d;
        java.lang.String str = this.f152050b;
        mVar.f69601xaca5bdda = str;
        mVar.f69595x6d25b0d9 = this.f152049a;
        mVar.f69619xe9ed65f6 = "";
        mVar.f69592xf1ebe47b = 5;
        mVar.f69618x114ef53e = "";
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = 1;
        mVar.f69584x89a4c0cf = 0;
        mVar.f323322h = 5;
        mVar.f69621xf91593ca = true;
        mVar.f69587xa6fe74c = false;
        if (com.p314xaae8f345.mm.p947xba6de98f.s1.fj().d(mVar)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra addSendTask failed. mediaId:%s", str);
        return false;
    }
}
