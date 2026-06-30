package qx5;

/* loaded from: classes13.dex */
public class y implements qx5.l {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f449068a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f449069b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f449070c;

    /* renamed from: d, reason: collision with root package name */
    public qx5.k f449071d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f449072e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f449073f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f449074g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f449075h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f449076i;

    public y(android.content.Context context, android.view.ViewGroup viewGroup) {
        this.f449072e = null;
        this.f449073f = null;
        this.f449074g = null;
        this.f449075h = null;
        this.f449076i = null;
        this.f449068a = context;
        this.f449069b = viewGroup;
        this.f449070c = null;
        g();
    }

    @Override // qx5.l
    public void a() {
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        if (!by5.d4.e().getBoolean("bShowSavePage", false)) {
            by5.c4.f("XWebDebugView", "refreshSavePageView, show save page is disabled");
            android.widget.Button button = this.f449076i;
            if (button != null) {
                button.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f449070c == null) {
            android.widget.Button button2 = this.f449076i;
            if (button2 != null) {
                button2.setVisibility(8);
                return;
            }
            return;
        }
        android.widget.Button button3 = this.f449076i;
        if (button3 != null) {
            button3.setVisibility(0);
            return;
        }
        android.widget.Button button4 = new android.widget.Button(mo161096x76847179());
        this.f449076i = button4;
        button4.setText("保存页面");
        this.f449076i.setOnClickListener(new qx5.e0(this));
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
        this.f449069b.addView(this.f449076i, layoutParams);
    }

    @Override // qx5.l
    public void b() {
        android.widget.TextView textView = this.f449073f;
        if (textView != null) {
            textView.setVisibility(0);
            return;
        }
        android.widget.TextView textView2 = new android.widget.TextView(mo161096x76847179());
        this.f449073f = textView2;
        textView2.setTextColor(-16777216);
        this.f449073f.setBackgroundColor(-1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f449070c;
        sb6.append(qx5.x.c(c27816xac2547f9));
        sb6.append("\n");
        sb6.append(qx5.x.b(c27816xac2547f9));
        sb6.append("\n");
        sb6.append(qx5.u.d());
        java.lang.String sb7 = sb6.toString();
        this.f449073f.setText(sb7);
        this.f449073f.setOnLongClickListener(new qx5.h0(this, sb7));
        android.widget.ScrollView scrollView = new android.widget.ScrollView(mo161096x76847179());
        scrollView.addView(this.f449073f);
        this.f449069b.addView(scrollView);
    }

    @Override // qx5.l
    public void c() {
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        if (!by5.d4.e().getBoolean("bShowVersion", false)) {
            by5.c4.f("XWebDebugView", "refreshVersionView, show version is disabled");
            android.widget.TextView textView = this.f449072e;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f449070c;
        if (c27816xac2547f9 == null) {
            android.widget.TextView textView2 = this.f449072e;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        android.widget.TextView textView3 = this.f449072e;
        if (textView3 != null) {
            textView3.setVisibility(0);
            return;
        }
        this.f449072e = new android.widget.TextView(mo161096x76847179());
        this.f449072e.setText(qx5.x.c(c27816xac2547f9));
        this.f449072e.setOnLongClickListener(new qx5.g0(this));
        this.f449069b.addView(this.f449072e);
    }

    @Override // qx5.l
    public boolean d(java.lang.String str) {
        by5.c4.f("XWebDebugView", "onInterceptTestUrl, url:" + str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(ya.b.f77502x92235c1b, 1);
        bundle.putString("command", str);
        qx5.a b17 = by5.d1.b(bundle, this);
        return b17.f449012a && e(mo161096x76847179(), b17);
    }

    @Override // qx5.l
    public boolean e(android.content.Context context, qx5.a aVar) {
        if (!aVar.f449012a) {
            android.widget.Toast.makeText(context, "执行失败", 0).show();
            return false;
        }
        if (aVar.f449013b) {
            new android.app.AlertDialog.Builder(mo161096x76847179()).setTitle("执行成功").setMessage("部分配置需重启生效，请确认是否立即重启?").setPositiveButton("确定", new qx5.a0(this, context)).setNegativeButton("取消", new qx5.z(this)).show();
            return true;
        }
        android.widget.Toast.makeText(context, "执行成功", 0).show();
        return true;
    }

    @Override // qx5.l
    public void f(final android.webkit.ValueCallback valueCallback) {
        try {
            new android.app.AlertDialog.Builder(mo161096x76847179()).setTitle("权限请求").setMessage("是否打开微信浏览器调试能力？").setPositiveButton("确定", new android.content.DialogInterface.OnClickListener() { // from class: qx5.y$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
                    by5.d4.e().edit().putBoolean("bEnableOpenDebugURL", true).commit();
                    by5.d4.e().edit().putLong("bEnableOpenDebugURLDate", java.lang.System.currentTimeMillis()).commit();
                    android.webkit.ValueCallback valueCallback2 = valueCallback;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(java.lang.Boolean.TRUE);
                    }
                }
            }).setNegativeButton("取消", new android.content.DialogInterface.OnClickListener() { // from class: qx5.y$$b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
                    by5.d4.e().edit().putBoolean("bEnableOpenDebugURL", false).commit();
                    android.webkit.ValueCallback valueCallback2 = valueCallback;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(java.lang.Boolean.FALSE);
                    }
                }
            }).show();
        } catch (java.lang.Exception e17) {
            by5.c4.f("XWebDebugView", "showAuthDialog failed." + e17.getMessage());
        }
    }

    @Override // qx5.l
    public void g() {
        android.view.View view = this.f449074g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/xweb/debug/XWebDebugView", "refreshDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/xweb/debug/XWebDebugView", "refreshDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.content.Context context = this.f449068a;
        boolean z17 = context instanceof android.content.MutableContextWrapper ? ((android.content.MutableContextWrapper) context).getBaseContext() instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 : context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        by5.c4.f("XWebDebugView", "refreshDebugView, context:" + this.f449068a + ", isAppCompatActivity:" + z17 + ", appCompatActivity:" + j());
        if (!z17) {
            android.widget.Toast.makeText(this.f449068a, "当前界面不支持显示调试组件", 0).show();
            return;
        }
        android.view.View inflate = android.view.View.inflate(this.f449068a, com.p314xaae8f345.p3222x9cba06de.R.C27875xbddafb2a.f61376xfbd51554, null);
        this.f449074g = inflate;
        this.f449069b.addView(inflate);
        this.f449075h = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) this.f449074g.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61367xa53c3da9);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 j17 = j();
        java.util.Objects.requireNonNull(j17);
        this.f449075h.m8315x6cab2c8d(new qx5.d(j17.mo7595x9cdc264(), this));
        ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) this.f449074g.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61348x2b37714)).m20382x3da43a7b(this.f449075h);
        ((android.widget.Button) this.f449074g.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61287x6f45c7bf)).setOnClickListener(new qx5.f0(this));
    }

    @Override // qx5.l
    /* renamed from: getContext */
    public android.content.Context mo161096x76847179() {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f449070c;
        if (c27816xac2547f9 != null) {
            this.f449068a = c27816xac2547f9.getContext();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 j17 = j();
            if (j17 != null) {
                this.f449068a = j17;
                return j17;
            }
        }
        return this.f449068a;
    }

    @Override // qx5.l
    /* renamed from: getWebView */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 mo161097x86b9ebe3() {
        return this.f449070c;
    }

    @Override // qx5.l
    public void h() {
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        if (!by5.d4.e().getBoolean("bShowFps", false)) {
            by5.c4.f("XWebDebugView", "refreshFpsView, show fps is disabled");
            return;
        }
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f449070c;
        if (c27816xac2547f9 != null) {
            c27816xac2547f9.mo14660x738236e6(by5.a1.d(mo161096x76847179(), "xweb_show_fps.js"), new qx5.b0(this));
        }
    }

    @Override // qx5.l
    public boolean i(java.lang.String str) {
        java.util.HashSet hashSet = by5.d1.f117963a;
        if (str == null) {
            return false;
        }
        return str.startsWith("https://debugxweb.qq.com") || str.startsWith("http://debugxweb.qq.com");
    }

    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 j() {
        android.content.Context context = this.f449068a;
        if (!(context instanceof android.content.MutableContextWrapper ? ((android.content.MutableContextWrapper) context).getBaseContext() instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 : context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            return null;
        }
        android.content.Context context2 = this.f449068a;
        return context2 instanceof android.content.MutableContextWrapper ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) ((android.content.MutableContextWrapper) context2).getBaseContext() : (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2;
    }

    public y(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        this.f449072e = null;
        this.f449073f = null;
        this.f449074g = null;
        this.f449075h = null;
        this.f449076i = null;
        this.f449070c = c27816xac2547f9;
        this.f449068a = c27816xac2547f9.getContext();
        this.f449069b = c27816xac2547f9.mo120155xf9dcf964();
        if (c27816xac2547f9 != null) {
            c();
            h();
            a();
            return;
        }
        g();
    }
}
