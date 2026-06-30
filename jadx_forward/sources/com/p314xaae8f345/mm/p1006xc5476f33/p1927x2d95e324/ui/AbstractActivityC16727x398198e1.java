package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI */
/* loaded from: classes15.dex */
public abstract class AbstractActivityC16727x398198e1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int U = 0;
    public long A;
    public long B;
    public int C;
    public boolean D;
    public boolean E;
    public java.lang.String F;
    public java.lang.String G;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f233763J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public int P;
    public boolean Q;
    public boolean R;
    public final android.view.View.OnClickListener S;
    public final i11.c T;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e f233764d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f233765e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.C16732x5a1f3ad5 f233766f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a f233767g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a f233768h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f233769i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f233770m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f233771n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f233772o = "";

    /* renamed from: p, reason: collision with root package name */
    public final i11.e f233773p;

    /* renamed from: q, reason: collision with root package name */
    public dn3.k f233774q;

    /* renamed from: r, reason: collision with root package name */
    public int f233775r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f233776s;

    /* renamed from: t, reason: collision with root package name */
    public r45.d64 f233777t;

    /* renamed from: u, reason: collision with root package name */
    public float f233778u;

    /* renamed from: v, reason: collision with root package name */
    public float f233779v;

    /* renamed from: w, reason: collision with root package name */
    public int f233780w;

    /* renamed from: x, reason: collision with root package name */
    public float f233781x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f233782y;

    /* renamed from: z, reason: collision with root package name */
    public long f233783z;

    public AbstractActivityC16727x398198e1() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f233773p = i11.h.e();
        this.f233777t = null;
        this.f233778u = 0.0f;
        this.f233779v = 0.0f;
        this.f233780w = 0;
        this.f233781x = 0.0f;
        this.f233782y = true;
        this.f233783z = -1L;
        this.A = -1L;
        this.B = -1L;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = "";
        this.G = "";
        this.I = false;
        this.f233763J = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = 1;
        this.P = -1;
        this.Q = true;
        this.S = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.b(this);
        this.T = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.j(this);
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1, com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a aVar) {
        r45.d64 d64Var;
        if (abstractActivityC16727x398198e1.f233777t == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseLifeUI", "location is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        ((java.util.ArrayList) abstractActivityC16727x398198e1.f233776s).clear();
        if (aVar.f233842q && (d64Var = abstractActivityC16727x398198e1.f233777t) != null) {
            ((java.util.ArrayList) abstractActivityC16727x398198e1.f233776s).add(d64Var);
            r45.d64 d64Var2 = abstractActivityC16727x398198e1.f233777t;
            hashMap.put(new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(d64Var2.f453708e, d64Var2.f453707d), 1);
        }
        java.util.Iterator it = aVar.f233837i.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 c20989xcfc00935 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935) it.next();
            if (!hashMap.containsKey(c20989xcfc00935)) {
                r45.d64 d64Var3 = new r45.d64();
                d64Var3.f453711h = "";
                d64Var3.f453712i = 0;
                d64Var3.f453708e = c20989xcfc00935.f273942d;
                d64Var3.f453707d = c20989xcfc00935.f273943e;
                d64Var3.f453710g = "";
                d64Var3.f453709f = 0;
                ((java.util.ArrayList) abstractActivityC16727x398198e1.f233776s).add(d64Var3);
                hashMap.put(c20989xcfc00935, 1);
            }
        }
        abstractActivityC16727x398198e1.f233774q = null;
        abstractActivityC16727x398198e1.f233775r = -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseLifeUI", "list size:" + ((java.util.ArrayList) abstractActivityC16727x398198e1.f233776s).size() + " show curpos: " + aVar.f233842q);
    }

    public boolean V6() {
        return true;
    }

    public final void W6(int i17) {
        this.f233764d.removeFooterView(this.f233765e);
        this.f233764d.removeFooterView(this.f233769i);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e c21506x8bfe589e = this.f233764d;
        c21506x8bfe589e.removeFooterView(c21506x8bfe589e.f279026d);
        android.view.View view = this.f233769i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "creaetPoiVisble", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "creaetPoiVisble", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f233770m.setVisibility(i17);
        this.f233771n.setVisibility(i17);
        if (i17 == 0) {
            this.f233764d.addFooterView(this.f233769i);
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e c21506x8bfe589e2 = this.f233764d;
        if (c21506x8bfe589e2.f279026d == null) {
            c21506x8bfe589e2.f();
        }
        try {
            c21506x8bfe589e2.removeFooterView(c21506x8bfe589e2.f279026d);
            c21506x8bfe589e2.addFooterView(c21506x8bfe589e2.f279026d);
        } catch (java.lang.Exception unused) {
        }
        this.f233764d.addFooterView(this.f233765e);
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a X6();

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a Y6();

    public void Z6(int i17, boolean z17, java.lang.String str, boolean z18) {
        int i18;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "";
        java.lang.String str6 = (str == null || !str.startsWith("mm_")) ? str : "";
        if (i17 >= 0) {
            i18 = z17 ? z18 ? 43 : 3 : z18 ? 41 : 1;
            if (this.E) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(z17 ? 5 : 4);
                g0Var.d(11139, objArr);
            }
            if (z17) {
                str4 = this.f233768h.getItem(i17).f323539a;
                if (this.f233768h.getCount() >= 1) {
                    str5 = this.f233768h.getItem(1).f323546h;
                }
            } else {
                str4 = this.f233767g.getItem(i17).f323539a;
                if (this.f233767g.getCount() >= 1) {
                    str5 = this.f233767g.getItem(1).f323546h;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                str5 = this.G;
            }
            str2 = str4;
            str3 = str5;
        } else {
            if (!this.D) {
                r2 = z18 ? 42 : 2;
            } else if (z18) {
                r2 = 44;
            }
            i18 = r2;
            str2 = "";
            str3 = str2;
        }
        r45.d64 d64Var = this.f233777t;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11135, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17 + 1), java.lang.Long.valueOf(this.f233783z), java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(this.A), java.lang.Integer.valueOf(this.C), d64Var == null ? "null/null" : java.lang.String.format("%f/%f", java.lang.Float.valueOf(d64Var.f453708e), java.lang.Float.valueOf(this.f233777t.f453707d)), str6, java.lang.Integer.valueOf(this.P), str2, wo.w0.g(true), 0, 0, 0, "", 0, str3);
    }

    public abstract void a7(double d17, double d18);

    public abstract void b7(double d17, double d18);

    public void c7() {
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.a39, null);
        this.f233769i = inflate;
        this.f233770m = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.olz);
        this.f233771n = (android.widget.TextView) this.f233769i.findViewById(com.p314xaae8f345.mm.R.id.oly);
        this.f233769i.setOnClickListener(this.S);
        android.view.View inflate2 = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.c_b, null);
        this.f233765e = inflate2;
        this.f233764d.addFooterView(inflate2);
        android.view.View view = this.f233765e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "preAddHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "preAddHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d7(boolean z17) {
        java.lang.Object[] objArr;
        if (this.f233774q != null) {
            return false;
        }
        int size = ((java.util.ArrayList) this.f233776s).size() - 1;
        int i17 = this.f233775r;
        if (size <= i17) {
            this.f233775r = -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseLifeUI", "index inc to end, ret");
            return false;
        }
        int i18 = i17 + 1;
        this.f233775r = i18;
        r45.d64 d64Var = (r45.d64) ((java.util.ArrayList) this.f233776s).get(i18);
        if (this.f233775r == 0) {
            this.C++;
        }
        if ((this.I ? this.f233768h.g(new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(d64Var.f453708e, d64Var.f453707d)) : this.f233767g.g(new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(d64Var.f453708e, d64Var.f453707d))) <= 0) {
            return d7(z17);
        }
        r45.cu5 cu5Var = null;
        if (this.I) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a aVar = this.f233768h;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 c20989xcfc00935 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(d64Var.f453708e, d64Var.f453707d);
            java.util.HashMap hashMap = (java.util.HashMap) aVar.f233838m;
            if (hashMap.containsKey(c20989xcfc00935)) {
                cu5Var = (r45.cu5) hashMap.get(c20989xcfc00935);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a aVar2 = this.f233767g;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 c20989xcfc009352 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(d64Var.f453708e, d64Var.f453707d);
            java.util.HashMap hashMap2 = (java.util.HashMap) aVar2.f233838m;
            if (hashMap2.containsKey(c20989xcfc009352)) {
                cu5Var = (r45.cu5) hashMap2.get(c20989xcfc009352);
            }
        }
        r45.cu5 cu5Var2 = cu5Var;
        boolean z18 = this.I;
        java.util.Vector vector = dn3.k.f323556p;
        java.lang.String str = (z18 ? 1 : 0) + "";
        java.util.Vector vector2 = dn3.k.f323556p;
        if (vector2.contains(str)) {
            objArr = false;
        } else {
            vector2.add(str);
            objArr = true;
        }
        if (objArr != true) {
            this.f233775r = -1;
            return false;
        }
        if (-1 == this.f233783z) {
            this.f233783z = java.lang.System.currentTimeMillis();
        }
        this.f233774q = new dn3.k(z18 ? 1 : 0, this.L, d64Var.f453707d, d64Var.f453708e, d64Var.f453709f, d64Var.f453712i, d64Var.f453710g, d64Var.f453711h, cu5Var2, this.I ? this.f233768h.f233843r : "", this.P, z17, false, this.M);
        c01.d9.e().g(this.f233774q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseLifeUI", "start get lbs life list, index:%d, lat:%f, long:%f", java.lang.Integer.valueOf(this.f233775r), java.lang.Float.valueOf(d64Var.f453708e), java.lang.Float.valueOf(d64Var.f453707d));
        return true;
    }

    public final void e7() {
        if (!this.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseLifeUI", "is not Search mode pass createpoi");
            return;
        }
        if (V6()) {
            boolean z17 = true;
            try {
                int intValue = java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("POICreateForbiden")).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseLifeUI", "getDynamicConfig createpoi %d", java.lang.Integer.valueOf(intValue));
                if (intValue == 1) {
                    return;
                }
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a aVar = this.f233768h;
            java.lang.String str = aVar.f233843r;
            aVar.getClass();
            java.lang.String trim = str.trim();
            java.util.Iterator it = aVar.f233835g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                dn3.i iVar = (dn3.i) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f323541c) && trim.equals(iVar.f323541c.trim())) {
                    break;
                }
            }
            if (z17) {
                W6(8);
            } else {
                this.f233770m.setText(java.lang.String.format(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h9j), this.f233768h.f233843r));
                W6(0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c5y;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e c21506x8bfe589e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e) findViewById(com.p314xaae8f345.mm.R.id.k5a);
        this.f233764d = c21506x8bfe589e;
        c21506x8bfe589e.m79053x71113d75(getString(this.M ? com.p314xaae8f345.mm.R.C30867xcad56011.f574150m22 : com.p314xaae8f345.mm.R.C30867xcad56011.h5t));
        this.f233766f = (com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.C16732x5a1f3ad5) findViewById(com.p314xaae8f345.mm.R.id.k5_);
        c7();
        this.f233767g = X6();
        this.f233768h = Y6();
        this.f233764d.setAdapter((android.widget.ListAdapter) this.f233767g);
        this.f233766f.m67451xc6c87ee5(this.f233764d);
        this.f233767g.notifyDataSetChanged();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.c(this));
        m78597x53c22598(new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.d(this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        this.H = c9Var;
        c9Var.f291857i = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.f(this);
        this.f233764d.m79055xb7d2c730(new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.g(this));
        this.f233764d.g();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.Q = getIntent().getBooleanExtra("poi_show_none", true);
        this.P = (int) (java.lang.System.currentTimeMillis() / 1000);
        dn3.k.f323556p.clear();
        c01.d9.e().a(603, this);
        this.L = getIntent().getIntExtra("near_life_scene", 0);
        this.G = getIntent().getStringExtra("request_id");
        this.M = getIntent().getBooleanExtra("search_all", false);
        this.f233776s = new java.util.ArrayList();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(603, this);
        super.onDestroy();
        i11.e eVar = this.f233773p;
        if (eVar != null) {
            ((i11.h) eVar).m(this.T);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((i11.h) this.f233773p).m(this.T);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        i11.e eVar;
        super.onResume();
        this.f233767g.notifyDataSetChanged();
        this.f233764d.c();
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.h(this)) || (eVar = this.f233773p) == null) {
            return;
        }
        ((i11.h) eVar).l(this.T, true, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0352  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r22, int r23, java.lang.String r24, com.p314xaae8f345.mm.p944x882e457a.m1 r25) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
