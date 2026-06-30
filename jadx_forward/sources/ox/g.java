package ox;

@j95.b
/* loaded from: classes7.dex */
public final class g extends i95.w implements tk.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f431004d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f431005e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f431006f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f431007g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f431008h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 f431009i;

    public g() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        this.f431004d = L;
        this.f431005e = L.getBoolean("meStrategySwitch", false);
        this.f431006f = L.getBoolean("meStrategyOpenWithoutAcct", false);
        this.f431007g = L.getBoolean("canRegisterPhotoAccount", false);
        this.f431008h = kz5.p0.f395529d;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 w4Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4();
        w4Var.f300290d = L.getBoolean("bizOriginPublishSwitch", false);
        w4Var.f300291e = L.getInt("bizOriginPublishSizeLimit", 0);
        this.f431009i = w4Var;
    }

    public boolean Ai() {
        boolean z17 = hj("support_photo_acct_new_logo", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "canBizPhotoNewLogoFromNativeMMKV: " + z17);
        return z17;
    }

    public boolean Bi() {
        boolean c17 = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1.f299325c.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "canCreateBizPhoto: " + c17);
        return c17;
    }

    public boolean Di() {
        boolean z17 = hj("support_oper_photo_acct", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "canCreateBizPhotoFromNativeMMKV: " + z17);
        return z17;
    }

    public boolean Ni() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "enableCanRegisterPhotoAccount, canRegisterPhotoAccount=" + this.f431007g + '}');
        return this.f431007g;
    }

    public boolean Ri() {
        return com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1.f299325c.d();
    }

    public boolean Ui() {
        boolean z17 = (hj("support_view_photo_acct", 0) == 1) || Di();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "canViewBizPhotoFromNativeMMKV: " + z17);
        return z17;
    }

    public java.lang.String Vi() {
        return Ui() ? "1" : "0";
    }

    public void Zi(android.content.Context context, tk.p publishCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publishCallback, "publishCallback");
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449687b;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar2 = ((r01.l1) i95.n0.c(r01.l1.class)).f449681m.f449687b;
        if (bVar != null && bVar2 != null) {
            publishCallback.a(true, "", null);
            return;
        }
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        ox.a aVar = new ox.a(publishCallback, this, context);
        l1Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(l1Var.f449676e, null, null, new r01.u0(l1Var, aVar, null), 3, null);
    }

    public boolean aj() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449687b;
        boolean z17 = (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f299422e) || !bVar.f299427m) ? false : true;
        boolean m172127x74219ae7 = ((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).m172127x74219ae7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "checkShowBiz, showBiz=" + z17 + ", teenMode=" + m172127x74219ae7 + ", meStrategySwitch=" + this.f431005e);
        return z17 && !m172127x74219ae7 && this.f431005e;
    }

    public java.lang.String bj(java.lang.String srcPath, java.lang.String dstPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstPath, "dstPath");
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(srcPath);
        java.lang.String str = n07 != null ? n07.outMimeType : null;
        boolean z17 = false;
        if (str != null && (r26.i0.n(str, "jpeg", false) || r26.i0.n(str, "jpg", false) || r26.i0.n(str, "bmp", false) || r26.i0.n(str, "png", false) || r26.i0.n(str, "gif", false))) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "clearExif: skip, mime=" + str + " path=" + srcPath);
            com.p314xaae8f345.mm.vfs.w6.c(srcPath, dstPath);
            return dstPath;
        }
        int wi6 = ((ub0.p) ((ub0.o) i95.n0.c(ub0.o.class))).wi(srcPath, dstPath);
        ub0.n[] nVarArr = ub0.n.f507535d;
        if (wi6 != 0) {
            ub0.n[] nVarArr2 = ub0.n.f507535d;
            if (wi6 == -4) {
                com.p314xaae8f345.mm.vfs.w6.c(srcPath, dstPath);
            } else {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c(dstPath);
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.mm.vfs.w6.c(srcPath, dstPath);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "clearExif: path=" + srcPath + ", returnPath=" + dstPath + " exit: " + com.p314xaae8f345.mm.vfs.w6.j(dstPath) + " clearResult: " + wi6);
        return dstPath;
    }

    public final l81.b1 cj(l81.b1 b1Var) {
        b1Var.f398547b = "wx0b2ec076ec39c786";
        java.lang.String enterPath = b1Var.f398555f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterPath, "enterPath");
        if (!r26.i0.y(enterPath, "pages/creator-center/creator-center.html", false)) {
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        }
        b1Var.f398551d = 447;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "EDITOR_WE_APP_VERSION: 447");
        return b1Var;
    }

    public boolean fj() {
        boolean z17;
        if (!((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).m172127x74219ae7()) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Gc).mo141623x754a37bb()).r()).booleanValue()) {
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "getCanOpen: " + z17);
                return z17;
            }
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "getCanOpen: " + z17);
        return z17;
    }

    public final int hj(java.lang.String itemKey, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemKey, "itemKey");
        return this.f431004d.o("clientExpItemValue_".concat(itemKey), i17);
    }

    public java.lang.String ij(tk.w mpPublishActionStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mpPublishActionStr, "mpPublishActionStr");
        java.lang.String str = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449686a;
        int ordinal = mpPublishActionStr.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return "pages/image_editor/image_editor.html";
        }
        if (ordinal == 2) {
            return "pages/appmsg_editor/appmsg_editor.html?biz=" + android.net.Uri.encode(str);
        }
        if (ordinal == 3) {
            return "pages/register/register.html";
        }
        if (ordinal == 4) {
            return "";
        }
        throw new jz5.j();
    }

    public boolean mj() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s7.f184071a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "getFinderOpen: " + b17);
        return b17;
    }

    public boolean nj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "getMeTabOpenWithoutAcctSwitch, meStrategyOpenWithoutAcct=" + this.f431006f + ", finderOpen=" + mj());
        return this.f431006f && mj();
    }

    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 oj() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getOriginalPictureStrategy originalPictureStrategy: ");
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 w4Var = this.f431009i;
        sb6.append(w4Var != null ? java.lang.Boolean.valueOf(w4Var.f300290d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", sb6.toString());
        return this.f431009i;
    }

    public java.lang.String pj(java.lang.String mediaId, java.lang.String originPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originPath, "originPath");
        zw.a aVar = zw.a.f558018a;
        return aVar.b(aVar.c(mediaId + '_' + originPath.hashCode()), originPath);
    }

    public boolean qj() {
        boolean z17;
        java.lang.String str;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449687b;
        if (bVar != null && (str = bVar.f299422e) != null) {
            if (str.length() > 0) {
                z17 = true;
                return !z17 && bVar.f299427m;
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public void rj(boolean z17, android.content.Context context, l81.b1 weAppOpenBundle, tk.p publishCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppOpenBundle, "weAppOpenBundle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publishCallback, "publishCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "jumpMediaTabPicker, useDraft: " + z17);
        if (z17) {
            sj(context, weAppOpenBundle, publishCallback);
        } else {
            zw.o.f558069a.a(context, 45, 20, true, true, 1, new ox.c(publishCallback, this, weAppOpenBundle, context), false);
        }
    }

    public void sj(android.content.Context context, l81.b1 weAppOpenBundle, tk.p publishCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppOpenBundle, "weAppOpenBundle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publishCallback, "publishCallback");
        cj(weAppOpenBundle);
        i95.m c17 = i95.n0.c(tk.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (tk.r.Wf((tk.r) c17, context, weAppOpenBundle, null, 4, null)) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && !z65.c.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "openPublishMiniProgram");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, weAppOpenBundle);
            publishCallback.a(true, "", null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "openPublishMiniProgram debug env");
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        ox.d dVar = new ox.d(weAppOpenBundle, context, publishCallback);
        ((ox.r) d0Var).getClass();
        ((r01.l1) i95.n0.c(r01.l1.class)).Ui(dVar);
    }

    public void tj(android.content.Context context, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "openWebPage");
        if (url.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizPublishApiFeatureService", "openWebPage: url isEmpty");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void uj(java.lang.String itemKey, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemKey, "itemKey");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "putClientExpItemValue: " + itemKey + ", " + num);
        java.lang.String concat = "clientExpItemValue_".concat(itemKey);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f431004d;
        if (num == null) {
            o4Var.W(concat);
        } else {
            o4Var.A(concat, num.intValue());
        }
    }

    public boolean vj() {
        boolean Bi = Bi();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_biz_metab_full_rollout_android, false)) {
            return Bi;
        }
        return Bi || ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() || qj();
    }

    public boolean wi() {
        return com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1.f299325c.b();
    }

    public boolean wj() {
        boolean z17 = hj("metab_interactive", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishApiFeatureService", "worksEntryRedDotEnabled: " + z17);
        return z17;
    }
}
