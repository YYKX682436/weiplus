package o44;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f424396a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f424397b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f424398c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f424399d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f424400e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f424401f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f424402g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f424403h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f424404i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.FrameLayout f424405j;

    /* renamed from: k, reason: collision with root package name */
    public ab4.b f424406k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f424407l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f424408m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f424409n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f424410o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f424411p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f424412q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f424413r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f424414s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f424415t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f424416u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f424417v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.drawable.Drawable f424418w;

    public static o44.c g(android.content.Context context, android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inflateCard", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        android.view.View inflate = i17 == 1 ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cpm, viewGroup, false) : i17 == 2 ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cpn, viewGroup, false) : null;
        if (inflate == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateCard", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return null;
        }
        o44.c cVar = new o44.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        cVar.f424397b = context;
        cVar.f424396a = i17;
        cVar.f424398c = inflate;
        cVar.f424400e = inflate.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        cVar.f424399d = inflate.findViewById(com.p314xaae8f345.mm.R.id.mqh);
        cVar.f424401f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gzm);
        cVar.f424402g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odh);
        cVar.f424403h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cuv);
        cVar.f424404i = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gxc);
        cVar.f424405j = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.gxf);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.azj);
        cVar.f424408m = textView;
        if (i17 == 1) {
            cVar.f424407l = textView;
        } else {
            cVar.f424407l = inflate.findViewById(com.p314xaae8f345.mm.R.id.b0r);
        }
        cVar.f424409n = inflate.findViewById(com.p314xaae8f345.mm.R.id.mm_);
        cVar.f424410o = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mma);
        cVar.f424411p = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mm9);
        cVar.f424412q = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mmb);
        cVar.f424416u = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.crf);
        cVar.f424414s = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566902hf3);
        cVar.f424413r = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566904hf5);
        cVar.f424415t = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566903hf4);
        try {
            com.p314xaae8f345.mm.ui.bk.r0(cVar.f424402g.getPaint(), 0.8f);
            cVar.a(i17);
            cVar.b();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HBCardViewWrapper", "adapter oldMode exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateCard", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        return cVar;
    }

    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adapterFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        m(this.f424401f, 14);
        if (i17 == 1) {
            m(this.f424402g, 20);
            m(this.f424403h, 14);
            m(this.f424413r, 14);
        } else {
            m(this.f424410o, 16);
            m(this.f424412q, 14);
            m(this.f424416u, 12);
            m(this.f424402g, 20);
            m(this.f424403h, 14);
        }
        m(this.f424408m, 17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adapterFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adapterLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        n(this.f424404i, 174, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508);
        n(this.f424405j, 174, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508);
        n(this.f424407l, 184, 48);
        n(this.f424414s, 18, 18);
        android.widget.TextView textView = this.f424413r;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = f(2);
                this.f424413r.setLayoutParams(layoutParams);
            }
        }
        int i17 = this.f424396a;
        if (i17 == 1) {
            o(this.f424401f, 0);
            o(this.f424402g, 32);
            o(this.f424403h, 10);
            o(this.f424404i, 0);
            o(this.f424405j, 0);
            o(this.f424407l, 19);
            o(this.f424415t, 15);
            if (this.f424415t != null) {
                int f17 = f(5);
                this.f424415t.setPadding(f17, f17, f17, f17);
            }
        } else if (i17 == 2) {
            o(this.f424401f, 32);
            o(this.f424409n, 32);
            o(this.f424402g, 10);
            o(this.f424398c.findViewById(com.p314xaae8f345.mm.R.id.gxd), 0);
            n(this.f424416u, 152, 39);
            o(this.f424407l, 19);
            o(this.f424403h, 16);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adapterLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cardAppeared", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f424398c.getVisibility();
        java.util.Objects.toString(this.f424406k);
        ab4.b bVar = this.f424406k;
        if (bVar != null) {
            bVar.J();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cardAppeared", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cardWillAppear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f424398c.getVisibility();
        java.util.Objects.toString(this.f424406k);
        ab4.b bVar = this.f424406k;
        if (bVar != null) {
            bVar.K();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cardWillAppear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cardWillDisappear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f424398c.getVisibility();
        java.util.Objects.toString(this.f424406k);
        ab4.b bVar = this.f424406k;
        if (bVar != null) {
            bVar.M();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cardWillDisappear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public int f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRelativeSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        int n17 = (int) za4.z0.n(i17, 375);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRelativeSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        return n17;
    }

    public void h(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnEnabled", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (z17) {
            this.f424417v.setAlpha(255);
            this.f424407l.setBackground(this.f424417v);
            this.f424407l.setEnabled(true);
        } else {
            this.f424417v.setAlpha(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5);
            this.f424407l.setBackground(this.f424417v);
            this.f424407l.setEnabled(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnEnabled", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void i(int i17) {
        android.widget.TextView textView;
        android.graphics.drawable.Drawable drawable;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnIconVisibility", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (this.f424396a != 2 || (textView = this.f424408m) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnIconVisibility", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        if (i17 != 0 || (drawable = this.f424418w) == null) {
            textView.setCompoundDrawables(null, null, null, null);
            this.f424408m.setCompoundDrawablePadding(0);
        } else {
            textView.setCompoundDrawables(drawable, null, null, null);
            this.f424408m.setCompoundDrawablePadding(i65.a.b(this.f424397b, 4));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnIconVisibility", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void j(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnText", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f424408m.setText(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnText", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void k(f54.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f424401f.setText(oVar.f341258a);
        this.f424403h.setText(oVar.f341259b);
        j(oVar.f341261d);
        h(true);
        this.f424398c.setRotation(0.0f);
        android.widget.TextView textView = this.f424416u;
        if (textView != null) {
            textView.setText(oVar.f341260c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b A[Catch: all -> 0x016c, TryCatch #4 {all -> 0x016c, blocks: (B:36:0x00e0, B:38:0x00f0, B:40:0x00f6, B:41:0x00fb, B:43:0x010b, B:44:0x0127, B:46:0x013a, B:48:0x0148, B:65:0x0119), top: B:35:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a A[Catch: all -> 0x016c, TryCatch #4 {all -> 0x016c, blocks: (B:36:0x00e0, B:38:0x00f0, B:40:0x00f6, B:41:0x00fb, B:43:0x010b, B:44:0x0127, B:46:0x013a, B:48:0x0148, B:65:0x0119), top: B:35:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119 A[Catch: all -> 0x016c, TryCatch #4 {all -> 0x016c, blocks: (B:36:0x00e0, B:38:0x00f0, B:40:0x00f6, B:41:0x00fb, B:43:0x010b, B:44:0x0127, B:46:0x013a, B:48:0x0148, B:65:0x0119), top: B:35:0x00e0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(f54.p r20) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o44.c.l(f54.p):void");
    }

    public void m(android.widget.TextView textView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRelativeFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRelativeFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        } else {
            textView.setTextSize(0, f(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRelativeFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        }
    }

    public final void n(android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        int f17 = f(i17);
        int f18 = f(i18);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != f17 || layoutParams.height != f18) {
            layoutParams.width = f17;
            layoutParams.height = f18;
            view.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public final void o(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewMarginTop", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewMarginTop", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        int f17 = f(i17);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != f17) {
                marginLayoutParams.topMargin = f17;
                view.setLayoutParams(layoutParams);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewMarginTop", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }
}
