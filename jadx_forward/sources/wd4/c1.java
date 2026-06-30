package wd4;

/* loaded from: classes9.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f526414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f526415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f526416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f526417g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(wd4.l1 l1Var, boolean z17, r45.jj4 jj4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        super(1);
        this.f526414d = l1Var;
        this.f526415e = z17;
        this.f526416f = jj4Var;
        this.f526417g = c17933xe8d1b226;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String imagePath;
        android.graphics.Bitmap i07;
        jd5.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
        wd4.l1 l1Var = this.f526414d;
        boolean z17 = l1Var.c() instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        r45.jj4 media = this.f526416f;
        boolean z18 = this.f526415e;
        if (z17) {
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f526417g;
            if (!z18) {
                jd5.c cVar2 = new jd5.c();
                wd4.z0 z0Var = wd4.l1.f526483g;
                java.lang.String m70363x51f8f990 = c17933xe8d1b226.m70363x51f8f990();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70363x51f8f990, "getLocalid(...)");
                jz5.l b17 = z0Var.b(media, m70363x51f8f990);
                java.lang.String str2 = (java.lang.String) b17.f384366d;
                java.lang.String str3 = (java.lang.String) b17.f384367e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSheet", "pathResult imgPath: " + str2 + " fullPath: " + str3);
                if (!(str2 == null || str2.length() == 0)) {
                    if (((str3 == null || str3.length() == 0) ? 1 : 0) == 0) {
                        cVar2.q(ca4.z0.S(str3));
                        cVar2.o(str2);
                        cVar2.r(str3);
                        java.lang.String m70363x51f8f9902 = c17933xe8d1b226.m70363x51f8f990();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70363x51f8f9902, "getLocalid(...)");
                        cVar2.set(cVar2.f125235d + 4, m70363x51f8f9902);
                        cVar = cVar2;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareSheet", "path is invalid");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
                return f0Var;
            }
            jd5.a aVar = new jd5.a();
            java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(media);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getExistSnsDirectPath(...)");
            aVar.p(l17);
            java.lang.String m70363x51f8f9903 = c17933xe8d1b226.m70363x51f8f990();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70363x51f8f9903, "getLocalid(...)");
            aVar.set(aVar.f125235d + 4, m70363x51f8f9903);
            cVar = aVar;
            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
            android.app.Activity c17 = l1Var.c();
            wd4.a1 a1Var = new wd4.a1(this.f526414d, this.f526417g, str, this.f526415e, this.f526416f);
            n13.t tVar = new n13.t();
            tVar.f415666a = a1Var;
            tVar.f415671f.f415672a = 7;
            ((dk5.y) a0Var).wi(c17, cVar, str, tVar);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
            if (z18) {
                imagePath = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(media);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imagePath);
            } else {
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), media.f459388d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMediaFilePath(...)");
                java.lang.String R = ca4.z0.R(media);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSnsSightName(...)");
                if (com.p314xaae8f345.mm.vfs.w6.j(d17.concat(R))) {
                    imagePath = d17 + ca4.z0.U(media);
                } else {
                    imagePath = "";
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbBitmap", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "path");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(imagePath)) {
                    i07 = null;
                } else {
                    i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(imagePath, 140, 140, i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)), com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(imagePath).m43592x7a249f0b() >= 0 ? r5 : 0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbBitmap", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoThumb", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
                i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(imagePath);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoThumb", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            }
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ni(l1Var.c(), str, i07, l1Var.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), z18 ? 3 : 2, new wd4.b1(this.f526414d, this.f526417g, str, this.f526415e, this.f526416f)).show();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
        return f0Var2;
    }
}
