package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView */
/* loaded from: classes9.dex */
public class C12980x8e9ea871 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374 {
    public final or1.p1 A;
    public java.util.List B;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f175547s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f175548t;

    /* renamed from: u, reason: collision with root package name */
    public or1.m0 f175549u;

    /* renamed from: v, reason: collision with root package name */
    public int f175550v;

    /* renamed from: w, reason: collision with root package name */
    public or1.t0 f175551w;

    /* renamed from: x, reason: collision with root package name */
    public or1.s0 f175552x;

    /* renamed from: y, reason: collision with root package name */
    public int f175553y;

    /* renamed from: z, reason: collision with root package name */
    public int f175554z;

    public C12980x8e9ea871(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f175550v = -1;
        this.f175553y = 0;
        this.f175554z = 0;
        this.A = new or1.p1(new or1.i0(this));
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871, qk.o oVar, int i17) {
        c12980x8e9ea871.getClass();
        r01.m y07 = r01.q3.bj().y0(c12980x8e9ea871.f175547s);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14507, java.lang.Long.valueOf(y07 != null ? y07.f66046x771ad30a : 0L), java.lang.Long.valueOf(oVar.w0()), java.lang.Long.valueOf(y07 != null ? y07.f66050x2a8d0441 : 0L), 2, 2, java.lang.Integer.valueOf(i17));
    }

    /* renamed from: getSortEntityList */
    private java.util.List<fb5.n> m54309xd32f1055() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor o17 = r01.q3.cj().o1(this.f175547s, this.f175548t);
        while (o17.moveToNext()) {
            or1.n0 n0Var = new or1.n0();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(o17);
            qk.o oVar = new qk.o();
            oVar.mo9015xbf5d97fd(o17);
            n0Var.f453209d = z3Var.d1();
            n0Var.f453210e = z3Var;
            n0Var.f453211f = oVar;
            fb5.n nVar = new fb5.n();
            nVar.f342431b = n0Var;
            if (oVar.F0()) {
                nVar.f342430a = "!1";
            } else if (n0Var.f453210e.w2()) {
                nVar.f342430a = "!2";
            } else {
                int c27 = n0Var.f453210e.c2();
                if (c27 >= 97 && c27 <= 122) {
                    c27 -= 32;
                }
                if (c27 < 65 || c27 > 90) {
                    nVar.f342430a = "#";
                } else {
                    nVar.f342430a = ((char) c27) + "";
                }
            }
            arrayList.add(nVar);
        }
        o17.close();
        if (this.B != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(this.B.size());
            for (r45.co coVar : this.B) {
                fb5.n nVar2 = new fb5.n();
                nVar2.f342431b = coVar;
                nVar2.f342430a = "!1";
                arrayList2.add(nVar2);
            }
            arrayList.addAll(0, arrayList2);
        }
        this.f175550v = arrayList.size();
        java.util.Collections.sort(arrayList, new or1.v0(this, null));
        return arrayList;
    }

    public static void h(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871, android.widget.TextView textView, android.content.Context context, java.lang.String str, int i17) {
        c12980x8e9ea871.getClass();
        if (textView == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            textView.setText(new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, i17)));
        } catch (java.lang.Exception unused) {
            textView.setText("");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    public android.view.View b() {
        return android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570277a95, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    public boolean c(java.lang.String str, fb5.n nVar) {
        r45.co coVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || nVar == null || (coVar = (r45.co) nVar.f342431b) == null) {
            return false;
        }
        java.lang.String g27 = coVar.f453210e.g2();
        java.lang.String T0 = coVar.f453210e.T0();
        java.lang.String U0 = coVar.f453210e.U0();
        java.lang.String upperCase = str.toUpperCase();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g27) && g27.toUpperCase().indexOf(upperCase) != -1) {
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T0) || T0.toUpperCase().indexOf(upperCase) == -1) {
            return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(U0) && U0.toUpperCase().startsWith(upperCase);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f175553y = (int) motionEvent.getRawX();
            this.f175554z = (int) motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getContactCount */
    public int m54310xab916345() {
        return this.f175550v;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getItemViewCreator */
    public fb5.l mo48655x185aee7e() {
        return new or1.l0(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getListView */
    public android.widget.ListView mo48656xcc101dd9() {
        return (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i3y);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getNoResultView */
    public android.view.View mo48657x932e1f79() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kch);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c1g);
        return textView;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getScrollBar */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 mo48658x1853ff50() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10) findViewById(com.p314xaae8f345.mm.R.id.mwe);
    }

    public void i() {
        java.util.List<fb5.n> m54309xd32f1055 = m54309xd32f1055();
        or1.m0 m0Var = this.f175549u;
        if (m0Var != null) {
            int i17 = this.f175550v;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12979xbcc07f40 activityC12979xbcc07f40 = ((or1.e0) m0Var).f429014a;
            if (activityC12979xbcc07f40.f175542g != null) {
                activityC12979xbcc07f40.f175541f.setVisibility(i17 > 0 ? 0 : 8);
                android.view.View view = activityC12979xbcc07f40.f175542g;
                int i18 = i17 <= 0 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListUI$2", "onUpdate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListUI$2", "onUpdate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        e(m54309xd32f1055);
        fb5.m mVar = this.f279399g;
        mVar.c(mVar.f342427d);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        or1.t0 t0Var = this.f175551w;
        if (t0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12983x9320522e) t0Var).mo48674x36654fab();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: setEmptyListener */
    public void m54311xee5033df(or1.m0 m0Var) {
        this.f175549u = m0Var;
    }

    /* renamed from: setExcludeBizChat */
    public void m54312x542a48d3(boolean z17) {
        this.f175548t = z17;
    }

    /* renamed from: setFatherBizName */
    public void m54313x16db6000(java.lang.String str) {
        this.f175547s = str;
    }

    /* renamed from: setFixedBrandServiceItem */
    public void m54314x88574db3(java.util.List<or1.n0> list) {
        this.B = list;
    }

    /* renamed from: setOnTouchListener */
    public void m54315xcc7da8b2(or1.t0 t0Var) {
        this.f175551w = t0Var;
    }
}
