package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui;

/* loaded from: classes8.dex */
public abstract class e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final vj5.h f221352d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f221353e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f221354f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f221355g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f221356h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f221357i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.LinearLayout f221358m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f221359n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f221360o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y f221361p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f221362q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f221363r;

    /* renamed from: s, reason: collision with root package name */
    public int f221364s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f221365t;

    /* renamed from: u, reason: collision with root package name */
    public int f221366u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f221367v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f221368w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnClickListener f221369x;

    public e(android.content.Context context) {
        super(context);
        this.f221363r = false;
        this.f221366u = -1;
        this.f221369x = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.l(this);
        setId(com.p314xaae8f345.mm.R.id.j7i);
        setBackgroundColor(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.s(context);
        this.f221352d = sVar;
        addView(sVar, -1, -1);
        this.f221364s = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aay);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d9q, (android.view.ViewGroup) this, false);
        this.f221367v = inflate;
        m64563x1b598243(this.f221364s);
        sVar.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, m64558xb0586f4e()));
        this.f221353e = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563971el);
        this.f221354f = inflate.findViewById(com.p314xaae8f345.mm.R.id.jbs);
        this.f221355g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564043gi);
        this.f221356h = imageView;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.f(this));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f221357i = textView;
        com.p314xaae8f345.mm.ui.f.b(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r);
        this.f221358m = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564071h4);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564070h3);
        this.f221359n = imageView2;
        imageView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.g(this));
        imageView2.setClickable(false);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564072h5);
        this.f221360o = textView2;
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.h(this));
        textView2.setClickable(false);
    }

    /* renamed from: getActionBarHeight */
    private int m64558xb0586f4e() {
        return com.p314xaae8f345.mm.ui.bl.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    /* renamed from: setActionBarColor */
    private void m64559x5185d868(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteActionBar", "setActionBarColor, color : %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            i17 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        }
        boolean g17 = com.p314xaae8f345.mm.ui.uk.g(i17);
        int i18 = this.f221366u;
        if (i18 == 0) {
            g17 = true;
        } else if (i18 == 1) {
            g17 = false;
        }
        vj5.a.a(this.f221352d, i17, !g17);
        this.f221368w = java.lang.Integer.valueOf(i17);
        m64563x1b598243(i17);
        a(g17);
    }

    public abstract void a(boolean z17);

    public void b(int i17, boolean z17, boolean z18) {
        java.lang.Integer num;
        this.f221364s = i17;
        this.f221365t = z18;
        if (z17 && ((num = this.f221368w) == null || num.intValue() == 0)) {
            m64567xff3c34b8(z18);
        } else {
            m64559x5185d868(i17);
        }
    }

    /* renamed from: getMenuHelp */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y mo64557x57d7ceb6() {
        if (this.f221361p == null) {
            this.f221361p = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y();
        }
        return this.f221361p;
    }

    /* renamed from: getTitle */
    public java.lang.String m64560x7531c8a2() {
        return this.f221362q;
    }

    /* renamed from: getTopBarHeight */
    public int m64561xf1d6ffbb() {
        return this.f221352d.getHeight();
    }

    /* renamed from: setActionBarColorValue */
    public void m64562x26c2c9e9(int i17) {
        this.f221364s = i17;
    }

    /* renamed from: setActionBarViewColor */
    public void m64563x1b598243(int i17) {
        android.view.View view = this.f221367v;
        if (view != null) {
            view.setBackgroundColor(i17);
            if (((i17 >> 24) & 255) / 255.0f > 0.0f) {
                view.setClickable(true);
            } else {
                view.setClickable(false);
            }
        }
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        if (f17 == 0.0f) {
            m64567xff3c34b8(this.f221365t);
            return;
        }
        int i17 = (int) (255.0f * f17);
        android.widget.TextView textView = this.f221357i;
        textView.setVisibility(0);
        android.widget.ImageView imageView = this.f221355g;
        imageView.setVisibility(0);
        int i18 = this.f221364s;
        int i19 = ((i18 >> 16) & 255) << 16;
        m64559x5185d868((i18 & 255) | i19 | (i17 << 24) | (((i18 >> 8) & 255) << 8));
        textView.setAlpha(f17);
        imageView.setImageAlpha(i17);
        this.f221356h.setImageAlpha(i17);
        this.f221359n.setImageAlpha(i17);
    }

    /* renamed from: setBackBtn */
    public void m64564x9c8c0d33(int i17) {
        this.f221356h.setImageResource(i17);
    }

    /* renamed from: setCloseWindowConfirmInfo */
    public void m64565x8e5d7968(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.getBoolean("close_window_confirm_dialog_switch");
        bundle.getString("close_window_confirm_dialog_title_cn");
        bundle.getString("close_window_confirm_dialog_title_eng");
        bundle.getString("close_window_confirm_dialog_ok_cn");
        bundle.getString("close_window_confirm_dialog_ok_eng");
        bundle.getString("close_window_confirm_dialog_cancel_cn");
        bundle.getString("close_window_confirm_dialog_cancel_eng");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    /* renamed from: setIconDark */
    public void m64566x4a8f5a11(int i17) {
        this.f221366u = i17;
    }

    /* renamed from: setImmersiveStyle */
    public void m64567xff3c34b8(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteActionBar", "setImmersiveStyle");
        int i17 = this.f221366u;
        if (i17 == 0) {
            z17 = true;
        } else if (i17 == 1) {
            z17 = false;
        }
        vj5.a.a(this.f221352d, 0, !z17);
        this.f221368w = 0;
        m64563x1b598243(0);
        this.f221357i.setVisibility(8);
        this.f221355g.setVisibility(8);
        this.f221356h.setImageAlpha(255);
        this.f221359n.setImageAlpha(255);
        a(z17);
    }

    /* renamed from: setNavigationBarButtons */
    public void m64568x753cf8a4(android.os.Bundle bundle) {
        android.graphics.Bitmap a17;
        if (bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString("set_navigation_bar_buttons_left_text_color");
        boolean z17 = bundle.getBoolean("set_navigation_bar_buttons_hide_right_button", false);
        java.lang.String string2 = bundle.getString("set_navigation_bar_buttons_text");
        java.lang.String string3 = bundle.getString("set_navigation_bar_buttons_icon_data");
        java.lang.String string4 = bundle.getString("set_navigation_bar_buttons_text_color");
        boolean z18 = bundle.getBoolean("set_navigation_bar_buttons_need_click_event", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.c(string, -16777216);
        int d17 = (int) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.d(string4, -1L);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
            try {
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.a(string3);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteActionBar", "setNavigationBarButtons, decode base64 image, exception = %s", e17);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.k(this, z17, a17, string2, d17, z18));
        }
        a17 = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.k(this, z17, a17, string2, d17, z18));
    }

    /* renamed from: setOptionEnable */
    public void m64569xd4333bda(boolean z17) {
        android.widget.TextView textView = this.f221360o;
        android.widget.ImageView imageView = this.f221359n;
        if (z17) {
            imageView.setClickable(true);
            textView.setClickable(true);
        } else {
            imageView.setClickable(false);
            textView.setClickable(false);
        }
    }

    /* renamed from: setTitleColor */
    public void m64570xb124d9ed(int i17) {
        this.f221357i.setTextColor(i17);
    }

    /* renamed from: setTitleText */
    public void m64571xdc742163(java.lang.String str) {
        this.f221362q = str;
        android.widget.TextView textView = this.f221357i;
        textView.setText(str);
        textView.setVisibility(0);
    }
}
