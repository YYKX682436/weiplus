package pa4;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f434554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434555g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434556h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pa4.e f434557i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f434558m;

    public d(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, pa4.e eVar, int i18) {
        this.f434552d = str;
        this.f434553e = str2;
        this.f434554f = i17;
        this.f434555g = str3;
        this.f434556h = str4;
        this.f434557i = eVar;
        this.f434558m = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int m77710x7cda4f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onPostScene$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload ok ");
        java.lang.String str2 = this.f434552d;
        sb6.append(str2);
        sb6.append("  ");
        java.lang.String str3 = this.f434553e;
        sb6.append(str3);
        sb6.append("  ");
        int i17 = this.f434554f;
        sb6.append(i17);
        sb6.append(" thumbUrl: ");
        java.lang.String str4 = this.f434555g;
        sb6.append(str4);
        sb6.append(" md5: ");
        java.lang.String str5 = this.f434556h;
        sb6.append(str5);
        sb6.append(" thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", sb6.toString());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        pa4.e eVar = this.f434557i;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(pa4.e.I(eVar), options);
        java.lang.String str6 = options.outMimeType;
        if (str6 != null) {
            java.util.Locale locale = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
            str = str6.toLowerCase(locale);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toLowerCase(...)");
        } else {
            str = "";
        }
        if ((!r26.i0.n(str, "jpg", false) && !r26.i0.n(str, "jpeg", false)) || (m77710x7cda4f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77710x7cda4f17(pa4.e.I(eVar))) == 0) {
            m77710x7cda4f17 = -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.r.e(pa4.e.I(eVar), this.f434552d, options.outMimeType, options.outWidth, options.outHeight, m77710x7cda4f17, com.p314xaae8f345.mm.vfs.w6.k(pa4.e.I(eVar)));
        pa4.e.J(eVar).k(str3);
        r45.cj4 cj4Var = new r45.cj4();
        cj4Var.f453129e = i17;
        cj4Var.f453128d = str2;
        pa4.e.K(eVar).f462099g = cj4Var;
        pa4.e.K(eVar).f462103n = 0;
        pa4.e.K(eVar).f462112w = str5;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            r45.cj4 cj4Var2 = new r45.cj4();
            cj4Var2.f453129e = this.f434558m;
            cj4Var2.f453128d = str4;
            pa4.e.K(eVar).f462101i.add(cj4Var2);
        }
        try {
            pa4.e.J(eVar).m(pa4.e.K(eVar).mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsLivePhotoImgUpload", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        ((pa4.i) eVar.f434561f).a(true, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onPostScene$1");
    }
}
