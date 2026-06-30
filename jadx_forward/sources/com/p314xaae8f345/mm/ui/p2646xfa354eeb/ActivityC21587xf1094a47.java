package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI */
/* loaded from: classes9.dex */
public class ActivityC21587xf1094a47 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements y90.j, hb5.z {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f279459d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f279460e;

    /* renamed from: f, reason: collision with root package name */
    public int f279461f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f279462g;

    /* renamed from: h, reason: collision with root package name */
    public hb5.g0 f279463h;

    /* renamed from: i, reason: collision with root package name */
    public a31.v f279464i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2646xfa354eeb.C21586x3fe9b1f6 f279465m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f279466n;

    /* renamed from: o, reason: collision with root package name */
    public hb5.e0 f279467o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f279468p = new hb5.a0(this);

    @Override // y90.j
    public void G2() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (str2 = this.f279462g) != null) {
            java.lang.String str3 = null;
            this.f279462g = null;
            if (!str2.equals("")) {
                this.f279464i.r(str2);
            }
            a31.v vVar = this.f279464i;
            hb5.e0 e0Var = this.f279467o;
            int i17 = hb5.e0.N;
            if (e0Var.d()) {
                str3 = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ao9);
            } else if (this.f279467o.f()) {
                str3 = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aod);
            } else {
                if (this.f279467o.f361698e == 3) {
                    str3 = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ao6);
                }
            }
            vVar.q(str3);
            this.f279464i.a();
            return;
        }
        hb5.e0 e0Var2 = this.f279467o;
        e0Var2.f361699f = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            e0Var2.a();
            e0Var2.E = false;
            e0Var2.L = false;
            e0Var2.h(true);
            return;
        }
        if (e0Var2.f361698e == 4) {
            e0Var2.a();
            e0Var2.E = false;
            e0Var2.L = false;
            e0Var2.j(str);
            return;
        }
        if (e0Var2.f()) {
            e0Var2.E = true;
            e0Var2.L = false;
            e0Var2.g();
            e0Var2.k(str, false);
            if (e0Var2.f361703m) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new hb5.c0(e0Var2, str), 200L);
                return;
            }
            return;
        }
        e0Var2.k(str, true);
        boolean z17 = e0Var2.f361703m;
        if (z17 && e0Var2.E && z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new hb5.c0(e0Var2, str), 200L);
        }
        if (e0Var2.f361705o) {
            e0Var2.j(str);
        }
    }

    public final void T6(qk.o oVar, int i17) {
        r01.m y07 = r01.q3.bj().y0(this.f279460e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14507, java.lang.Long.valueOf(y07 != null ? y07.f66046x771ad30a : 0L), java.lang.Long.valueOf(oVar.w0()), java.lang.Long.valueOf(y07 != null ? y07.f66050x2a8d0441 : 0L), 2, 2, java.lang.Integer.valueOf(i17));
    }

    public void U6(int i17) {
        hb5.g0 g0Var = this.f279463h;
        if (g0Var != null) {
            if (i17 == 1) {
                g0Var.a(true, false, false);
            } else if (i17 != 2) {
                g0Var.a(false, false, false);
            } else {
                g0Var.a(false, false, true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a99;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279459d)) {
            this.f279459d = getIntent().getStringExtra("enterprise_biz_name");
            this.f279460e = getIntent().getStringExtra("enterprise_biz_father_name");
            this.f279461f = getIntent().getIntExtra("biz_chat_search_scene", 1);
            this.f279462g = getIntent().getStringExtra("biz_chat_search_text");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279459d)) {
                finish();
            }
        }
        this.f279465m = (com.p314xaae8f345.mm.ui.p2646xfa354eeb.C21586x3fe9b1f6) findViewById(com.p314xaae8f345.mm.R.id.ask);
        this.f279466n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kcj);
        hb5.e0 e0Var = new hb5.e0(mo55332x76847179(), this.f279459d, this.f279460e, this.f279461f);
        this.f279467o = e0Var;
        if (e0Var.f()) {
            hb5.g0 g0Var = new hb5.g0(null);
            this.f279463h = g0Var;
            com.p314xaae8f345.mm.ui.p2646xfa354eeb.C21586x3fe9b1f6 c21586x3fe9b1f6 = this.f279465m;
            android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bsg, null);
            g0Var.f361725a = inflate.findViewById(com.p314xaae8f345.mm.R.id.imc);
            g0Var.f361726b = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567213im1);
            g0Var.f361727c = inflate.findViewById(com.p314xaae8f345.mm.R.id.imi);
            android.view.View view = g0Var.f361725a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = g0Var.f361726b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = g0Var.f361727c;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c21586x3fe9b1f6.addFooterView(inflate);
            U6(0);
        }
        this.f279465m.setAdapter((android.widget.ListAdapter) this.f279467o);
        this.f279465m.setOnItemClickListener(new hb5.b0(this));
        this.f279465m.m79364xcc7da8b2(this);
        if (this.f279467o.f()) {
            this.f279465m.setOnScrollListener(this.f279468p);
        }
        a31.v vVar = new a31.v();
        this.f279464i = vVar;
        vVar.c(this.f279467o.d());
        a31.v vVar2 = this.f279464i;
        vVar2.f82532u = this;
        vVar2.f291857i = this;
        vVar2.f82529r = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        mo48674x36654fab();
        return true;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        this.f279464i.j(this, menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f279464i.s();
        this.f279464i.a();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f279464i.m(this, menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
