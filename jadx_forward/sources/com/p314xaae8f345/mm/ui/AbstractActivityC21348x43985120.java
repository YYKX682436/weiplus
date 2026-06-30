package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.BaseActivity */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC21348x43985120 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f278120y = 0;

    /* renamed from: actionbarView */
    private android.view.View f39294xdb9e2262;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.b f278121d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f278122e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f278123f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f278124g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f278125h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f278126i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Context f278127m;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f278129o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f278130p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f278131q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.MenuItem f278132r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.MenuItem f278133s;

    /* renamed from: t, reason: collision with root package name */
    public int f278134t;

    /* renamed from: u, reason: collision with root package name */
    public int f278135u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.r1 f278136v;

    /* renamed from: n, reason: collision with root package name */
    public int f278128n = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f278137w = false;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f278138x = new java.util.LinkedList();

    private void S6() {
        android.widget.TextView textView = this.f278122e;
        if (textView == null) {
            return;
        }
        if (this.f278137w) {
            textView.setTextColor(this.f278127m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by));
        } else {
            textView.setTextColor(this.f278127m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560132bx));
        }
    }

    public void O6(int i17, int i18, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener, com.p314xaae8f345.mm.ui.r1 r1Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.ui.q1 q1Var = new com.p314xaae8f345.mm.ui.q1();
        q1Var.f291060a = i17;
        q1Var.f291061b = i18;
        q1Var.f291062c = str;
        q1Var.f291067h = onMenuItemClickListener;
        q1Var.f291068i = onLongClickListener;
        q1Var.f291066g = r1Var;
        if (i18 == com.p314xaae8f345.mm.R.C30861xcebc809e.bu_ && (str == null || str.length() <= 0)) {
            q1Var.f291062c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571345cf);
        }
        int i19 = q1Var.f291060a;
        int i27 = 0;
        while (true) {
            linkedList = this.f278138x;
            if (i27 >= linkedList.size()) {
                break;
            }
            if (((com.p314xaae8f345.mm.ui.q1) linkedList.get(i27)).f291060a == i19) {
                com.p314xaae8f345.mm.ui.yk.a("BaseActivity", "match menu, id ：" + i19 + ", remove it", new java.lang.Object[0]);
                linkedList.remove(i27);
                break;
            }
            i27++;
        }
        linkedList.add(q1Var);
        new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.ui.o1(this), 200L);
    }

    public void P6(int i17) {
        if (this.f278121d == null) {
            return;
        }
        this.f278128n = i17;
        this.f278137w = com.p314xaae8f345.mm.ui.uk.g(i17);
        this.f278121d.w(new android.graphics.drawable.ColorDrawable(this.f278128n));
        getWindow().setStatusBarColor(this.f278128n);
        android.view.View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(this.f278137w ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        if (this.f278137w) {
            this.f278126i.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            this.f278126i.setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        R6();
        S6();
        android.widget.TextView textView = this.f278123f;
        if (textView != null) {
            if (this.f278137w) {
                textView.setTextColor(this.f278127m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560129bu));
            } else {
                textView.setTextColor(this.f278127m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560128bt));
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f278130p;
        if (c22699x3dcdb352 == null) {
            return;
        }
        if (this.f278137w) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bue);
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bua);
        }
    }

    public void Q6(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17, com.p314xaae8f345.mm.ui.p1 p1Var) {
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f278121d;
        if (bVar == null) {
            return;
        }
        if (onMenuItemClickListener == null) {
            bVar.B(false);
        } else {
            bVar.B(false);
            android.view.View view = this.f278125h;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/BaseActivity", "setBackBtn", "(Landroid/view/MenuItem$OnMenuItemClickListener;ILcom/tencent/mm/ui/BaseActivity$LeftIconStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/BaseActivity", "setBackBtn", "(Landroid/view/MenuItem$OnMenuItemClickListener;ILcom/tencent/mm/ui/BaseActivity$LeftIconStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f278125h.setOnClickListener(new com.p314xaae8f345.mm.ui.k1(this, onMenuItemClickListener));
            }
        }
        if (i17 != 0) {
            this.f278134t = i17;
        }
        if (p1Var == com.p314xaae8f345.mm.ui.p1.NONE) {
            this.f278134t = 0;
        }
        if (p1Var == com.p314xaae8f345.mm.ui.p1.BACK) {
            this.f278134t = com.p314xaae8f345.mm.R.C30861xcebc809e.bu7;
        } else if (p1Var == com.p314xaae8f345.mm.ui.p1.CLOSE) {
            this.f278134t = com.p314xaae8f345.mm.R.C30861xcebc809e.bu9;
        }
        android.widget.ImageView imageView = this.f278126i;
        if (imageView != null && this.f278134t != 0) {
            imageView.setVisibility(0);
            this.f278126i.setImageResource(this.f278134t);
        }
        if (this.f278137w) {
            this.f278126i.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            this.f278126i.setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final void R6() {
        int i17;
        com.p314xaae8f345.mm.ui.r1 r1Var = this.f278136v;
        if (r1Var == com.p314xaae8f345.mm.ui.r1.TEXT) {
            android.widget.TextView textView = this.f278131q;
            if (textView == null) {
                return;
            }
            if (this.f278137w) {
                textView.setTextColor(this.f278127m.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3));
                return;
            } else {
                textView.setTextColor(this.f278127m.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560255fd));
                return;
            }
        }
        if (r1Var == com.p314xaae8f345.mm.ui.r1.ADD) {
            this.f278135u = com.p314xaae8f345.mm.R.C30861xcebc809e.bu6;
        } else if (r1Var == com.p314xaae8f345.mm.ui.r1.MORE) {
            this.f278135u = com.p314xaae8f345.mm.R.C30861xcebc809e.bu_;
        } else if (r1Var == com.p314xaae8f345.mm.ui.r1.SEARCH) {
            this.f278135u = com.p314xaae8f345.mm.R.C30861xcebc809e.bua;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f278129o;
        if (c22699x3dcdb352 == null || (i17 = this.f278135u) == 0) {
            return;
        }
        c22699x3dcdb352.setImageResource(i17);
        if (this.f278137w) {
            this.f278129o.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            this.f278129o.getDrawable().setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: getLayoutId */
    public abstract int mo32073x2ee31f5b();

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTheme(getApplicationContext().getSharedPreferences("SETTING_COLOR", 0).getInt("APP_THEME_COLOR", -16777216));
        setContentView(mo32073x2ee31f5b());
        this.f278127m = this;
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        this.f278121d = mo2533x106ab264;
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.I(new android.graphics.drawable.ColorDrawable(getResources().getColor(android.R.color.transparent)));
            this.f278121d.F(false);
            this.f278121d.B(false);
            this.f278121d.E(false);
            this.f278121d.D(true);
            this.f278121d.y(android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569450bj, (android.view.ViewGroup) null));
            if (this.f278128n == 0) {
                this.f278128n = com.p314xaae8f345.mm.ui.zk.c(this.f278127m, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559628aj);
            }
            this.f278137w = com.p314xaae8f345.mm.ui.uk.g(this.f278128n);
            this.f278121d.w(new android.graphics.drawable.ColorDrawable(this.f278128n));
            this.f278122e = (android.widget.TextView) findViewById(android.R.id.text1);
            this.f278123f = (android.widget.TextView) findViewById(android.R.id.text2);
            this.f278124g = findViewById(com.p314xaae8f345.mm.R.id.oct);
            this.f278125h = findViewById(com.p314xaae8f345.mm.R.id.f78238xaeb5384d);
            this.f278126i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f78239x65c2f76a);
            Q6(new com.p314xaae8f345.mm.ui.j1(this), 0, com.p314xaae8f345.mm.ui.p1.BACK);
        }
        com.p314xaae8f345.mm.ui.zk.e(this.f278127m, com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        com.p314xaae8f345.mm.ui.zk.e(this.f278127m, com.p314xaae8f345.mm.R.C30860x5b28f31.f561448iu);
        if (this.f278128n == 0) {
            this.f278128n = com.p314xaae8f345.mm.ui.zk.c(this.f278127m, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559628aj);
        }
        android.view.Window window = getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(this.f278128n);
        android.view.View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(this.f278137w ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        java.util.LinkedList linkedList = this.f278138x;
        com.p314xaae8f345.mm.ui.yk.a("BaseActivity", "on create option menu, menuCache size:%d", java.lang.Integer.valueOf(linkedList.size()));
        boolean z17 = false;
        if (this.f278121d == null || linkedList.size() == 0) {
            com.p314xaae8f345.mm.ui.yk.f("BaseActivity", "error, mActionBar is null or cache size:%d", java.lang.Integer.valueOf(linkedList.size()));
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.q1 q1Var = (com.p314xaae8f345.mm.ui.q1) it.next();
                int i17 = q1Var.f291060a;
                if (i17 != 16908332) {
                    if (q1Var.f291066g == com.p314xaae8f345.mm.ui.r1.SEARCH) {
                        this.f278132r = menu.add(0, i17, 0, q1Var.f291062c);
                        com.p314xaae8f345.mm.ui.l1 l1Var = new com.p314xaae8f345.mm.ui.l1(this, q1Var);
                        if (q1Var.f291065f == null) {
                            q1Var.f291065f = android.view.View.inflate(this.f278127m, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569440b9, null);
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) q1Var.f291065f.findViewById(com.p314xaae8f345.mm.R.id.f564015fq);
                        this.f278130p = c22699x3dcdb352;
                        c22699x3dcdb352.setVisibility(0);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f278130p;
                        if (c22699x3dcdb3522 != null) {
                            if (this.f278137w) {
                                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bue);
                            } else {
                                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bua);
                            }
                        }
                        this.f278130p.setOnClickListener(l1Var);
                        this.f278130p.setEnabled(true);
                        this.f278132r.setActionView(q1Var.f291065f);
                        this.f278132r.setEnabled(true);
                        this.f278132r.setVisible(true);
                    } else {
                        this.f278133s = menu.add(0, i17, 0, q1Var.f291062c);
                        com.p314xaae8f345.mm.ui.m1 m1Var = new com.p314xaae8f345.mm.ui.m1(this, q1Var);
                        com.p314xaae8f345.mm.ui.n1 n1Var = new com.p314xaae8f345.mm.ui.n1(this, q1Var);
                        com.p314xaae8f345.mm.ui.r1 r1Var = q1Var.f291066g;
                        this.f278136v = r1Var;
                        com.p314xaae8f345.mm.ui.r1 r1Var2 = com.p314xaae8f345.mm.ui.r1.GREEN_TEXT;
                        if (r1Var == r1Var2 || r1Var == com.p314xaae8f345.mm.ui.r1.TEXT) {
                            if (q1Var.f291063d == null) {
                                q1Var.f291063d = android.view.View.inflate(this.f278127m, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569440b9, null);
                            }
                            android.widget.TextView textView = (android.widget.TextView) q1Var.f291063d.findViewById(com.p314xaae8f345.mm.R.id.f564019fu);
                            this.f278131q = textView;
                            textView.setVisibility(0);
                            this.f278131q.setText(q1Var.f291062c);
                            if (q1Var.f291066g == r1Var2) {
                                this.f278131q.setTextColor(this.f278127m.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560270fs));
                            } else {
                                R6();
                            }
                            this.f278131q.setOnClickListener(m1Var);
                            this.f278131q.setOnLongClickListener(n1Var);
                            this.f278131q.setEnabled(true);
                            this.f278133s.setActionView(q1Var.f291063d);
                        } else {
                            int i18 = q1Var.f291061b;
                            if (i18 != 0) {
                                this.f278135u = i18;
                            }
                            if (r1Var == com.p314xaae8f345.mm.ui.r1.NONE) {
                                this.f278135u = 0;
                            }
                            if (q1Var.f291064e == null) {
                                q1Var.f291064e = android.view.View.inflate(this.f278127m, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569440b9, null);
                            }
                            this.f278129o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) q1Var.f291064e.findViewById(com.p314xaae8f345.mm.R.id.f564015fq);
                            R6();
                            if (this.f278135u != 0) {
                                this.f278129o.setVisibility(0);
                                this.f278129o.setOnClickListener(m1Var);
                                this.f278129o.setOnLongClickListener(n1Var);
                                this.f278129o.setEnabled(true);
                                this.f278133s.setActionView(q1Var.f291064e);
                            }
                        }
                        this.f278133s.setEnabled(true);
                        this.f278133s.setVisible(true);
                        android.view.MenuItem menuItem = this.f278133s;
                        if (menuItem != null) {
                            menuItem.setShowAsAction(2);
                        }
                    }
                }
            }
            android.view.MenuItem menuItem2 = this.f278132r;
            if (menuItem2 != null) {
                menuItem2.setShowAsAction(2);
            }
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public void setTitle(java.lang.CharSequence charSequence) {
        android.widget.TextView textView;
        if (this.f278121d == null || (textView = this.f278122e) == null) {
            return;
        }
        textView.setText(charSequence.toString());
        S6();
    }
}
