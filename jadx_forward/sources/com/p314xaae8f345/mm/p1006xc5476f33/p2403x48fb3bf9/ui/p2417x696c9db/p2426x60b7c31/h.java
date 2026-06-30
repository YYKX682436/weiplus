package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f266676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f266677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f266678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f266679g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f266680h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266681i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f266682m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f266683n;

    public h(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.net.Uri uri, com.p314xaae8f345.mm.vfs.r6 r6Var, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, int i17, boolean z19) {
        this.f266676d = h0Var;
        this.f266677e = uri;
        this.f266678f = r6Var;
        this.f266679g = z17;
        this.f266680h = z18;
        this.f266681i = c1Var;
        this.f266682m = i17;
        this.f266683n = z19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f266676d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var.f391656d, this.f266677e);
        boolean z17 = this.f266679g;
        if (b17) {
            str = this.f266678f.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAbsolutePath(...)");
        } else {
            java.lang.String str2 = z17 ? "capture_video" : "capture_image";
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("wcf://temp/wv_choose_media"));
            r6Var.J();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            sb6.append('_');
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(java.lang.System.currentTimeMillis());
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, sb6.toString());
            r6Var2.k();
            java.lang.String o17 = r6Var2.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            com.p314xaae8f345.mm.vfs.w6.c(((android.net.Uri) h0Var.f391656d).toString(), o17);
            str = o17;
        }
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        int i17 = this.f266682m;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266681i;
        if (!j17 || com.p314xaae8f345.mm.vfs.w6.k(str) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromCamera onActivityResult realFilePath(" + str + ") invalid");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f(c1Var, i17));
            return;
        }
        if (!this.f266680h && !z17) {
            android.util.DisplayMetrics displayMetrics = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics();
            int max = java.lang.Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels) * 2;
            int min = java.lang.Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels) * 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5 f5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class);
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = pu5.f.f440003a;
            if (max < 0) {
                max = 0;
            } else if (max > 4096) {
                max = 4096;
            }
            if (min < 0) {
                min = 0;
            } else if (min > 4096) {
                min = 4096;
            }
            java.lang.String fc6 = f5Var.fc(str, max, min, 100);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fc6, "doCompressImageWithoutAccountRequired(...)");
            if (!(fc6.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(fc6) && com.p314xaae8f345.mm.vfs.w6.k(fc6) > 0) {
                str = fc6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b18 = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(str) : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4.f264535b.a(b18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g(b18, c1Var, i17, this.f266683n));
    }
}
