package com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114;

@db5.a(m123858x6ac9171 = 4)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/XUpdateDownloadUI;", "Lcom/tencent/mm/plugin/updater/xlabupdater/DialogDownloadUI;", "<init>", "()V", "plugin-updater_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI */
/* loaded from: classes11.dex */
public final class ActivityC18782xb52fd33d extends com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f257045q = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f257046h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f257047i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f257048m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f257049n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f257050o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f257051p;

    public ActivityC18782xb52fd33d() {
        jz5.h.b(new xn4.p(this));
        jz5.h.b(new xn4.h(this));
        this.f257046h = -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4
    public void W6(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "onDownloadFail ");
        ym5.a1.f(new xn4.k(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4
    public void X6(double d17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "onDownloadProgress " + d17);
        android.widget.ProgressBar progressBar = this.f257051p;
        if (progressBar != null) {
            progressBar.setProgress((int) d17, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4
    public void Y6(r45.mm6 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "onDownloadSuccess ");
        xn4.c0 c0Var = xn4.c0.f537137a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c0Var.k(context, info);
        c7();
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4
    public void Z6() {
        int i17 = this.f257046h;
        xn4.c0 c0Var = xn4.c0.f537137a;
        java.lang.String cdnUrl = V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
        if (i17 == c0Var.e(cdnUrl)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "curShowingStatus == XUpdateHelper.getCurStatus, dont need changeDialog " + this.f257046h);
            return;
        }
        java.lang.String cdnUrl2 = V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl2, "cdnUrl");
        boolean z17 = true;
        if (!(c0Var.e(cdnUrl2) == 0)) {
            java.lang.String cdnUrl3 = V6().f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl3, "cdnUrl");
            if (c0Var.e(cdnUrl3) == 1) {
                this.f257046h = 1;
                d7();
                return;
            }
            return;
        }
        this.f257046h = 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
        java.lang.String str = V6().f462206i;
        if (str == null || str.length() == 0) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3v);
        }
        u1Var.g(str);
        java.lang.String str2 = V6().f462208n;
        if (str2 == null || str2.length() == 0) {
            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571908t8);
        }
        u1Var.n(str2);
        java.lang.String str3 = V6().f462209o;
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        }
        u1Var.j(str3);
        u1Var.l(new xn4.n(this));
        u1Var.i(new xn4.o(this));
        u1Var.q(false);
        this.f257047i = u1Var.f293531c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4
    public void a7(java.lang.String mediaId, r45.mm6 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "onMergeSuccess ");
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).wi(this, xn4.e0.f537147d.b().f462204g);
    }

    public final void c7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "hideDownloadingDialog: ");
        ym5.a1.f(new xn4.i(this));
    }

    public final void d7() {
        android.text.TextPaint paint;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
        u1Var.d(com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2u, (android.view.ViewGroup) null));
        u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3u));
        u1Var.l(new xn4.l(this));
        u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.i(new xn4.m(this));
        u1Var.q(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = u1Var.f293531c;
        this.f257048m = j0Var;
        this.f257049n = (android.widget.TextView) j0Var.findViewById(com.p314xaae8f345.mm.R.id.otd);
        this.f257050o = (android.widget.TextView) j0Var.findViewById(com.p314xaae8f345.mm.R.id.otb);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) j0Var.findViewById(com.p314xaae8f345.mm.R.id.otc);
        this.f257051p = progressBar;
        if (progressBar != null) {
            progressBar.setProgress(this.f257042d, false);
        }
        android.widget.TextView textView = this.f257049n;
        if (textView != null && (paint = textView.getPaint()) != null) {
            com.p314xaae8f345.mm.ui.bk.s0(paint);
        }
        android.widget.TextView textView2 = this.f257049n;
        if (textView2 != null) {
            java.lang.String str = V6().f462220z;
            if (str == null || str.length() == 0) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3t);
            }
            textView2.setText(str);
        }
        android.widget.TextView textView3 = this.f257050o;
        if (textView3 == null) {
            return;
        }
        java.lang.String str2 = V6().f462220z;
        if (str2 == null || str2.length() == 0) {
            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3s) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(V6().f462203f);
        }
        textView3.setText(str2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }
}
