package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Ll75/z0;", "Lo13/x;", "Landroid/view/View;", "e", "Landroid/view/View;", "getMMainView", "()Landroid/view/View;", "setMMainView", "(Landroid/view/View;)V", "mMainView", "f", "getMEditFooter", "setMEditFooter", "mEditFooter", "h", "getMEmptyView", "setMEmptyView", "mEmptyView", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI */
/* loaded from: classes.dex */
public final class ActivityC16174xab39c6e1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, l75.z0, o13.x {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f224849z = 0;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View mMainView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View mEditFooter;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f224853g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public android.view.View mEmptyView;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f224855i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f224856m;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f224859p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f224861r;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d f224865v;

    /* renamed from: d, reason: collision with root package name */
    public final int f224850d = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 50);

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f224857n = "";

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f224858o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f224860q = new java.util.HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f224862s = new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.o(this);

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f224863t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.g(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f224864u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.m(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f224866w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.n(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f224867x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.r(this));

    /* renamed from: y, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f224868y = new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.p(this);

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.f T6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.f) ((jz5.n) this.f224863t).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b) ((jz5.n) this.f224864u).mo141623x754a37bb();
    }

    public final void V6() {
        java.util.ArrayList arrayList;
        android.widget.Button button = this.f224853g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U6 = U6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U6);
        button.setEnabled(U6.A.size() > 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U62 = U6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U62);
        if (U62.A.size() > 0) {
            android.widget.Button button2 = this.f224853g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button2);
            button2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560824v7));
        } else {
            android.widget.Button button3 = this.f224853g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button3);
            button3.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560253fb));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U63 = U6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U63);
        if (U63.A.size() > 0) {
            android.widget.Button button4 = this.f224853g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button4);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bod));
            sb6.append(" (");
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U64 = U6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U64);
            sb6.append(U64.A.size());
            sb6.append(')');
            button4.setText(sb6.toString());
        } else {
            android.widget.Button button5 = this.f224853g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button5);
            button5.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bod));
        }
        android.widget.TextView textView = this.f224856m;
        if (textView != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            textView.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.f T6 = T6();
            java.util.ArrayList arrayList2 = T6 != null ? T6.f224900p : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
            int size = arrayList2.size();
            if (size > 1) {
                android.widget.TextView textView2 = this.f224856m;
                if (textView2 == null) {
                    return;
                }
                android.content.res.Resources resources = getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.f T62 = T6();
                arrayList = T62 != null ? T62.f224900p : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
                objArr[0] = arrayList.get(0);
                textView2.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bk6, objArr));
                return;
            }
            if (size != 1) {
                android.widget.TextView textView3 = this.f224856m;
                if (textView3 == null) {
                    return;
                }
                textView3.setVisibility(8);
                return;
            }
            android.widget.TextView textView4 = this.f224856m;
            if (textView4 == null) {
                return;
            }
            android.content.res.Resources resources2 = getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.f T63 = T6();
            arrayList = T63 != null ? T63.f224900p : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
            objArr2[0] = arrayList.get(0);
            textView4.setText(resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bk9, objArr2));
        }
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        V6();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 stg, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stg, "stg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f224862s;
        if (n3Var != null) {
            n3Var.mo50303x856b99f0(com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.f50820x1cfb1f28);
            n3Var.mo50307xb9e94560(com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.f50820x1cfb1f28, 400L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getCustomBounceId */
    public int mo56571xc86d394a() {
        return com.p314xaae8f345.mm.R.id.cas;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a2k;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String string;
        mo78530x8b45058f();
        java.lang.String stringExtra = getIntent().getStringExtra("contact_search_query");
        this.f224857n = stringExtra;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        if (stringExtra.length() > 10) {
            java.lang.String str = this.f224857n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.lang.String substring = str.substring(0, 11);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbd, substring.concat("..."));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbd, this.f224857n);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        mo54450xbf7c1df6(string);
        mo74406x9c8c0d33(this.f224868y, com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        this.mMainView = findViewById(com.p314xaae8f345.mm.R.id.hsc);
        this.mEmptyView = findViewById(com.p314xaae8f345.mm.R.id.f567002hs4);
        this.f224855i = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.cas);
        this.f224856m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cej);
        this.f224865v = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(this);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f224855i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22849x81a93d25);
        c22849x81a93d25.mo7967x900dcbe1(this.f224865v);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f224855i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22849x81a93d252);
        c22849x81a93d252.m7963x830bc99d(true);
        this.mEditFooter = findViewById(com.p314xaae8f345.mm.R.id.f565684d61);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ctd);
        this.f224853g = button;
        if (button != null) {
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.l(this));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f224855i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22849x81a93d253);
        jz5.g gVar = this.f224866w;
        c22849x81a93d253.mo7960x6cab2c8d((xm3.t0) ((jz5.n) gVar).mo141623x754a37bb());
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.f T6 = T6();
        if (T6 != null) {
            T6.f224894g = U6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.f T62 = T6();
        if (T62 != null) {
            T62.f224895h = this;
        }
        xm3.t0 t0Var = (xm3.t0) ((jz5.n) gVar).mo141623x754a37bb();
        if (t0Var != null) {
            t0Var.B = (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.q) ((jz5.n) this.f224867x).mo141623x754a37bb();
        }
        android.widget.Button button2 = this.f224853g;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 1L, 0L, 0L, 0L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        m78548x39037dd1();
        android.view.View view = this.mEditFooter;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.Button button = this.f224853g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button);
        button.setEnabled(false);
        android.widget.Button button2 = this.f224853g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button2);
        button2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560253fb));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        gm0.j1.n().f354821b.a(3990, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        gm0.j1.n().f354821b.q(3990, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (i17 != 4 || event.getAction() != 0) {
            return super.onKeyDown(i17, event);
        }
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        java.lang.String m150572x17ec12d2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (scene instanceof w11.h0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f224859p;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f224859p = null;
            }
            if (i17 == 0 && i18 == 0) {
                dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbf), 0).show();
                java.util.HashSet hashSet = this.f224860q;
                java.util.List list = ((w11.h0) scene).f523572e;
                hashSet.addAll(list);
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.f T6 = T6();
                if (T6 != null) {
                    T6.f224893f = hashSet;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getNames(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U6 = U6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U6);
                U6.A.removeAll(list);
                V6();
                this.f224861r = true;
                return;
            }
            if (i18 != -3503) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
                if (i18 == -3500) {
                    w11.h0 h0Var = (w11.h0) scene;
                    m150572x17ec12d2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bba, java.lang.Integer.valueOf(h0Var.f523578n - ((java.util.LinkedList) h0Var.f523572e).size()));
                } else {
                    m150572x17ec12d2 = scene.mo47948x7f0c4558().mo13821x7f35c2d1().m150572x17ec12d2();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m150572x17ec12d2)) {
                        m150572x17ec12d2 = ((w11.h0) scene).H() == null ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbb) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbc);
                    }
                }
                u1Var.g(m150572x17ec12d2);
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
                u1Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.t.f224915a);
                u1Var.q(false);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
            java.lang.String m150572x17ec12d22 = scene.mo47948x7f0c4558().mo13821x7f35c2d1().m150572x17ec12d2();
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbc);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m150572x17ec12d22 == null) {
                m150572x17ec12d22 = string;
            }
            u1Var2.g(m150572x17ec12d22);
            u1Var2.a(true);
            u1Var2.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hmr));
            u1Var2.m(com.p314xaae8f345.mm.R.C30867xcad56011.hms);
            u1Var2.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.s(this));
            u1Var2.q(false);
        }
    }

    /* renamed from: setMEditFooter */
    public final void m65199xa99492d0(android.view.View view) {
        this.mEditFooter = view;
    }

    /* renamed from: setMEmptyView */
    public final void m65200x427a15a7(android.view.View view) {
        this.mEmptyView = view;
    }

    /* renamed from: setMMainView */
    public final void m65201x803f0949(android.view.View view) {
        this.mMainView = view;
    }
}
