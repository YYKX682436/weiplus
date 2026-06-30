package du3;

/* loaded from: classes10.dex */
public final class b0 extends yt3.a {
    public static final du3.r F = new du3.r(null);
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public boolean D;
    public java.lang.String E;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f325057f;

    /* renamed from: g, reason: collision with root package name */
    public final int f325058g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f325059h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f325060i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f325061m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f325062n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f325063o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f325064p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f325065q;

    /* renamed from: r, reason: collision with root package name */
    public du3.b f325066r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f325067s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f325068t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f325069u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f325070v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f325071w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f325072x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f325073y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f325074z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f325057f = parent;
        this.f325058g = hashCode();
        this.f325059h = "yb_task_id";
        this.f325060i = "yb_template_id";
        this.f325061m = "yb_image_local_id";
        this.f325062n = "yb_video_local_id";
        this.f325063o = "yb_media_type";
        this.f325064p = "yb_save_origin_image";
        this.f325065q = "%s?yb_task_id=%s&yb_template_id=%s&yb_image_local_id=%s&yb_support_live_photo=%s";
        this.f325067s = "0";
        this.f325069u = jz5.h.b(new du3.w(this));
        this.f325070v = jz5.h.b(new du3.v(this));
        this.f325071w = jz5.h.b(new du3.a0(this));
        this.f325072x = jz5.h.b(new du3.u(this, status));
        this.f325073y = new java.util.ArrayList();
        this.A = "";
        this.C = "";
    }

    public final void A(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "replaceImage localid:" + str + " path:" + d17);
        if (com.p314xaae8f345.mm.vfs.w6.j(d17)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_1_STRING", d17);
            this.f546865d.w(ju3.c0.Y1, bundle);
        }
    }

    public final void B(java.lang.String str) {
        if (this.D) {
            try {
                java.lang.String str2 = this.B;
                if (android.text.TextUtils.isEmpty(str2)) {
                    java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(this.E, false);
                    if (com.p314xaae8f345.mm.vfs.w6.j(i17)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
                        android.media.ExifInterface exifInterface = new android.media.ExifInterface(i17);
                        java.lang.String attribute = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93);
                        java.lang.String attribute2 = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("yuanbao.tencent.com", attribute) && !android.text.TextUtils.isEmpty(attribute2)) {
                            str2 = attribute2;
                        }
                    }
                }
                if (!android.text.TextUtils.isEmpty(str2) && str2 != null) {
                    java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
                    if (com.p314xaae8f345.mm.vfs.w6.j(i18)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i18);
                        android.media.ExifInterface exifInterface2 = new android.media.ExifInterface(i18);
                        exifInterface2.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93, "yuanbao.tencent.com");
                        exifInterface2.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604, str2);
                        exifInterface2.saveAttributes();
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("yb_template_id", str2);
                        java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wi6, "checkSnsPostSessionId(...)");
                        hashMap.put("sns_publish_sessionid", wi6);
                        hashMap.put("yb_return_type", this.f325067s);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_yb_retouch_complete", hashMap, 36244);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImproveEditPhotoAiPlugin", e17, "saveYuanBaoTemplateInfo error", new java.lang.Object[0]);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yt3.r2
    /* renamed from: onActivityResult */
    public void mo47332x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == this.f325058g && i18 == -1) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "get null data");
                return;
            }
            java.lang.String string = bundleExtra.getString(this.f325059h);
            if (string == null) {
                string = "";
            }
            java.lang.String decode = java.net.URLDecoder.decode(string, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String string2 = bundleExtra.getString(this.f325060i);
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String decode2 = java.net.URLDecoder.decode(string2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String string3 = bundleExtra.getString(this.f325061m);
            if (string3 == null) {
                string3 = "";
            }
            java.lang.String decode3 = java.net.URLDecoder.decode(string3, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String string4 = bundleExtra.getString(this.f325062n);
            if (string4 == null) {
                string4 = "";
            }
            java.lang.String decode4 = java.net.URLDecoder.decode(string4, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String string5 = bundleExtra.getString(this.f325063o);
            if (string5 == null) {
                string5 = "";
            }
            java.lang.String decode5 = java.net.URLDecoder.decode(string5, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode5, "decode(...)");
            this.f325067s = decode5;
            java.lang.String string6 = bundleExtra.getString(this.f325064p);
            if (string6 == null) {
                string6 = "";
            }
            java.lang.String decode6 = java.net.URLDecoder.decode(string6, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "taskId:" + decode + " templateId:" + decode2 + " mediaType:" + this.f325067s + " imageLocalId:" + decode3 + " videoLocalId:" + decode4);
            this.B = decode2;
            java.lang.String str = this.f325067s;
            int hashCode = str.hashCode();
            android.view.ViewGroup viewGroup = this.f325057f;
            switch (hashCode) {
                case 48:
                    if (str.equals("0")) {
                        A(decode3);
                        break;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "unsupported type:" + this.f325067s);
                    break;
                case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                    if (str.equals("1")) {
                        ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enablePublishLivePhoto", "com.tencent.mm.feature.sns.SnsFeatureService");
                        boolean a17 = pc4.e.f434959a.a();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enablePublishLivePhoto", "com.tencent.mm.feature.sns.SnsFeatureService");
                        boolean z17 = true;
                        if (!a17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "device not support livephoto");
                            if (decode3 != null && decode3.length() != 0) {
                                z17 = false;
                            }
                            if (!z17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "roll back to image");
                                A(decode3);
                                break;
                            }
                        } else {
                            if (!(decode3 == null || decode3.length() == 0)) {
                                if (decode4 != null && decode4.length() != 0) {
                                    z17 = false;
                                }
                                if (!z17) {
                                    ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
                                    java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(decode3);
                                    ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
                                    java.lang.String d18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(decode4);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "handleLivePhoto thumb:" + d17 + " video:" + d18);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "export thumb:" + com.p314xaae8f345.mm.vfs.w6.i(d17, false) + " video:" + com.p314xaae8f345.mm.vfs.w6.i(d18, false));
                                    B(d17);
                                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(bool, d18, d17, -1L, bool, nu3.i.f421751a.l());
                                    c16991x15ced046.f237200n = bool;
                                    ut3.f.f512709c.a(viewGroup.getContext(), c16991x15ced046);
                                    break;
                                }
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "unsupported type:" + this.f325067s);
                    break;
                case 50:
                    if (str.equals("2")) {
                        db5.e1.y(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.pdv), "", i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), null);
                        break;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "unsupported type:" + this.f325067s);
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "unsupported type:" + this.f325067s);
                    break;
            }
            if (decode.equals(this.A) && decode6.equals("1")) {
                java.lang.String str2 = this.C;
                if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                    java.lang.String a18 = q75.c.a("jpg");
                    zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    ((yb0.g) b0Var).getClass();
                    com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.b(context, str2, a18);
                    q75.c.f(a18, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "export " + str2 + " to:" + a18);
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode2);
            hashMap.put("yb_template_id", decode2);
            java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wi6, "checkSnsPostSessionId(...)");
            hashMap.put("sns_publish_sessionid", wi6);
            hashMap.put("yb_return_type", this.f325067s);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_yb_replace_asset", hashMap, 36244);
        }
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        ((hk0.u0) ((jz5.n) this.f325071w).mo141623x754a37bb()).Z6(6, new du3.z(this));
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        boolean a17 = F.a(configProvider);
        this.D = a17;
        if (a17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f325057f.getContext());
            c1162x665295de.Q(0);
            z().mo7967x900dcbe1(c1162x665295de);
            z().N(new eu3.d(10));
            z().mo7960x6cab2c8d((du3.q) ((jz5.n) this.f325072x).mo141623x754a37bb());
            java.lang.String inputPhotoPath = configProvider.D;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputPhotoPath, "inputPhotoPath");
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new du3.y(this, inputPhotoPath, null), 2, null);
            this.E = configProvider.D;
        }
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 z() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325069u).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }
}
