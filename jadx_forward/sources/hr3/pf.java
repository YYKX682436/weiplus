package hr3;

/* loaded from: classes5.dex */
public final class pf extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f365421d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f365422e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f365423f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f365424g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f365425h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f365426i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f365427m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f365428n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f365429o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f365430p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f365431q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f365432r;

    static {
        new hr3.zd(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f365421d = jz5.h.b(new hr3.we(this));
        this.f365422e = jz5.h.b(new hr3.ue(this));
        this.f365423f = jz5.h.b(new hr3.ff(this));
        this.f365424g = jz5.h.b(new hr3.ee(this));
        this.f365425h = jz5.h.b(new hr3.gf(this));
        this.f365426i = jz5.h.b(new hr3.of(this));
        this.f365427m = jz5.h.b(new hr3.ve(this));
        this.f365428n = jz5.h.b(hr3.hf.f365149d);
        this.f365429o = jz5.h.b(new hr3.Cif(this));
        this.f365430p = jz5.h.b(new hr3.fe(this));
        this.f365432r = "";
    }

    public static final java.lang.String O6(hr3.pf pfVar) {
        pfVar.getClass();
        i21.q.h().getClass();
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("sayhi");
        if (!h07.m()) {
            h07.J();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h07.n());
        sb6.append("/");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "getSayHiPicTempPath(...)");
        return sb7;
    }

    public static final void P6(hr3.pf pfVar, int i17, int i18) {
        pfVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6846x38eaf21f c6846x38eaf21f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6846x38eaf21f();
        c6846x38eaf21f.f141688d = i17;
        c6846x38eaf21f.f141689e = i18;
        c6846x38eaf21f.k();
        c6846x38eaf21f.o();
    }

    public final void Q6(yz5.l afterUpload) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(afterUpload, "afterUpload");
        java.lang.String str = this.f365431q;
        int i17 = (str == null || r26.n0.N(str)) ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "checkUploadPicture() called with: localPath = " + str + " isSayHiPictureOpen:" + W6());
        pm0.v.K(null, new hr3.ze(kz5.c1.l(new jz5.l("view_id", "friend_request_send_btn"), new jz5.l("add_username", m133981x6c03c64c()), new jz5.l("friend_request_id", (java.lang.String) ((jz5.n) this.f365428n).mo141623x754a37bb()), new jz5.l("friend_request_has_img", java.lang.Integer.valueOf(i17 ^ 1)))));
        if (W6()) {
            if (!(str == null || r26.n0.N(str))) {
                p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.z.a(m158354x19263085()), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new hr3.de(str, afterUpload, null), 2, null);
                return;
            }
        }
        afterUpload.mo146xb9724478(null);
    }

    public final java.lang.String R6(java.lang.String str, yz5.a aVar) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
        java.lang.String str2 = (java.lang.String) aVar.mo152xb9724478();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x.v(str, 1080, 1080, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SayHiPictureUIC", "createThumbNail big pic fail");
            return null;
        }
        if (a17 == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.x.y0(str2, a17, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            return str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SayHiPictureUIC", "rotate big pic fail");
        return null;
    }

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21504xe1a6f222 S6() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21504xe1a6f222) ((jz5.n) this.f365423f).mo141623x754a37bb();
    }

    public final android.widget.TextView T6() {
        return (android.widget.TextView) ((jz5.n) this.f365429o).mo141623x754a37bb();
    }

    public final boolean U6(r45.dz3 dz3Var) {
        if (dz3Var == null) {
            return false;
        }
        java.util.LinkedList linkedList = dz3Var.f454402e;
        r45.v60 v60Var = linkedList != null ? (r45.v60) kz5.n0.Z(linkedList) : null;
        if (v60Var == null) {
            return false;
        }
        java.lang.String str = v60Var.f469465d;
        if (str == null || r26.n0.N(str)) {
            return false;
        }
        java.lang.String str2 = v60Var.f469466e;
        return !(str2 == null || r26.n0.N(str2));
    }

    public final void V6(yz5.a onSpanClickCallback) {
        r45.dz3 dz3Var;
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSpanClickCallback, "onSpanClickCallback");
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_COMMON_SAY_HI_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        this.f365432r = v17;
        java.lang.String v18 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_COMMON_SAY_HI_IMG_INFO_STRING_SYNC, "");
        if (android.text.TextUtils.isEmpty(v18)) {
            dz3Var = null;
        } else {
            r45.dz3 dz3Var2 = new r45.dz3();
            try {
                dz3Var2.mo11468x92b714fd(j34.d.a(v18, 0));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SayHiPictureUIC", th6, "parseImgInfo() err", new java.lang.Object[0]);
            }
            dz3Var = dz3Var2;
        }
        boolean U6 = U6(dz3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "initCommonSayHi() called commonSayHiContent:%s hasPic:%s", java.lang.Integer.valueOf(v17.length()), java.lang.Boolean.valueOf(U6));
        if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17) || U6) && (textView = (android.widget.TextView) ((jz5.n) this.f365430p).mo141623x754a37bb()) != null) {
            textView.setVisibility(0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            java.lang.String string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574267ho0, v17);
            java.lang.String str = string != null ? string : "";
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(m158354x19263085, str, textSize));
            p012xc85e97e9.p093xedfae76a.q a17 = p012xc85e97e9.p093xedfae76a.z.a(m158354x19263085());
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(a17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new hr3.le(U6, this, textView, v17, onSpanClickCallback, dz3Var, null), 2, null);
        }
    }

    public final boolean W6() {
        return ((java.lang.Boolean) ((jz5.n) this.f365427m).mo141623x754a37bb()).booleanValue();
    }

    public final void X6(java.lang.String str) {
        if ((m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9) || (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a)) {
            java.lang.String str2 = this.f365431q;
            pm0.v.K(null, new hr3.af(kz5.c1.l(new jz5.l("view_id", "friend_request_usual_set"), new jz5.l("add_username", m133981x6c03c64c()), new jz5.l("friend_request_id", (java.lang.String) ((jz5.n) this.f365428n).mo141623x754a37bb()), new jz5.l("friend_request_has_img", java.lang.Integer.valueOf(((str2 == null || r26.n0.N(str2)) ? 1 : 0) ^ 1)))));
        }
        if (str == null) {
            str = "";
        }
        java.lang.String str3 = this.f365431q;
        Y6(str, str3 != null ? str3 : "");
    }

    public final void Y6(java.lang.String str, java.lang.String str2) {
        boolean z17 = !android.text.TextUtils.isEmpty(str2) && com.p314xaae8f345.mm.vfs.w6.j(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "setCommonSayHi() called with: commonSayHi = [" + str + "], pictureLocalPath = [" + str2 + "] hasPic:" + z17);
        if (T6() == null) {
            return;
        }
        T6().setVisibility(8);
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new hr3.ef(z17, str2, str, this, null), 2, null);
    }

    public final void Z6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "showWithLocalPath() called with: localPath = " + str);
        if (str == null || r26.n0.N(str)) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.w.a(m158360xed6858b4()), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new hr3.nf(str, this, null), 2, null);
    }

    /* renamed from: getUsername */
    public final java.lang.String m133981x6c03c64c() {
        return (java.lang.String) ((jz5.n) this.f365426i).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        jz5.g gVar = this.f365430p;
        switch (i17) {
            case 101:
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                java.lang.String a17 = g83.a.a();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(m158354x19263085, intent, a17);
                if (b17 == null) {
                    return;
                }
                Z6(R6(b17, new hr3.xe(this)));
                T6().setVisibility(0);
                android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
                if (textView == null) {
                    return;
                }
                textView.setVisibility(8);
                return;
            case 102:
                java.util.List stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("CropImage_OutputPath_List") : null;
                if (stringArrayListExtra == null) {
                    stringArrayListExtra = kz5.p0.f395529d;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "onResult selectImgList:" + stringArrayListExtra);
                if (!stringArrayListExtra.isEmpty()) {
                    java.lang.Object obj = stringArrayListExtra.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    Z6(R6((java.lang.String) obj, new hr3.ye(this)));
                    T6().setVisibility(0);
                    android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
                    if (textView2 == null) {
                        return;
                    }
                    textView2.setVisibility(8);
                    return;
                }
                return;
            case 103:
                if (intent != null ? intent.getBooleanExtra("response_delete", false) : false) {
                    S6().m79050x6e4974fa(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (!(m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9) && !(m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a)) {
            if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "onCreate() called by SayHiPictureUI");
                S6().m79045x484a3591().setOnClickListener(new hr3.oe(this));
                S6().m79051x6a72901e(new hr3.pe(this));
                T6().setOnClickListener(new hr3.qe(this));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "onCreate() called by SayHiWithSnsPermissionUI");
        if (!((java.lang.Boolean) ((jz5.n) this.f365421d).mo141623x754a37bb()).booleanValue()) {
            pm0.v.K(null, new hr3.be(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "onCreate() called isOpenIm:" + ((java.lang.Boolean) ((jz5.n) this.f365422e).mo141623x754a37bb()).booleanValue());
        if (W6()) {
            S6().m79045x484a3591().setOnClickListener(new hr3.re(this));
            S6().m79051x6a72901e(new hr3.se(this));
        } else {
            S6().g();
        }
        T6().setOnClickListener(new hr3.te(this));
    }
}
