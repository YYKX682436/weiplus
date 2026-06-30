package vw0;

/* loaded from: classes5.dex */
public final class i0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f522317d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f522318e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f522319f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f522320g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f522321h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f522322i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f522323m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f522324n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f522325o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f522326p;

    /* renamed from: q, reason: collision with root package name */
    public final int f522327q;

    /* renamed from: r, reason: collision with root package name */
    public final int f522328r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f522329s;

    /* renamed from: t, reason: collision with root package name */
    public final pw0.m f522330t;

    /* renamed from: u, reason: collision with root package name */
    public final pw0.q f522331u;

    /* renamed from: v, reason: collision with root package name */
    public final pw0.s f522332v;

    /* renamed from: w, reason: collision with root package name */
    public final pw0.o f522333w;

    /* renamed from: x, reason: collision with root package name */
    public vw0.d0 f522334x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context) {
        super(context, null, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f522327q = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.acs, null);
        this.f522328r = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ac_, null);
        this.f522329s = j65.q.a(context).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cvp, null);
        pw0.m mVar = new pw0.m(new vw0.e0(this));
        this.f522330t = mVar;
        pw0.q qVar = new pw0.q(new vw0.g0(this));
        this.f522331u = qVar;
        pw0.s sVar = new pw0.s(new vw0.h0(this));
        this.f522332v = sVar;
        pw0.o oVar = new pw0.o(new vw0.f0(this));
        this.f522333w = oVar;
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dgc, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.q_l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f522317d = c1163xf1deaba4;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.q_m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
        this.f522318e = c1163xf1deaba42;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.q_n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById3;
        this.f522319f = c1163xf1deaba43;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.s3e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById4;
        this.f522320g = c1163xf1deaba44;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.qaw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f522321h = findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.qax);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f522322i = findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.s9c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f522323m = findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.s9w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById8;
        this.f522324n = textView;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.s9x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById9;
        this.f522325o = textView2;
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.s9v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById10;
        this.f522326p = textView3;
        textView.setOnClickListener(new vw0.x(this));
        textView2.setOnClickListener(new vw0.y(this));
        textView3.setOnClickListener(new vw0.z(this));
        textView.performClick();
        c1163xf1deaba4.N(new lv0.c(j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb), j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, 0, null, 56, null));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
        c1163xf1deaba4.mo7960x6cab2c8d(mVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c1163xf1deaba4.m7949x5701d990();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 o3Var = m7949x5701d990 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) m7949x5701d990 : null;
        if (o3Var != null) {
            o3Var.f93715g = false;
        }
        c1163xf1deaba42.N(new lv0.c(j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), 0, 0, null, 56, null));
        c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
        c1163xf1deaba42.mo7960x6cab2c8d(qVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d9902 = c1163xf1deaba42.m7949x5701d990();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 o3Var2 = m7949x5701d9902 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) m7949x5701d9902 : null;
        if (o3Var2 != null) {
            o3Var2.f93715g = false;
        }
        c1163xf1deaba43.N(new lv0.c(j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), 0, 0, null, 56, null));
        c1163xf1deaba43.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
        c1163xf1deaba43.mo7960x6cab2c8d(sVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d9903 = c1163xf1deaba43.m7949x5701d990();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 o3Var3 = m7949x5701d9903 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) m7949x5701d9903 : null;
        if (o3Var3 != null) {
            o3Var3.f93715g = false;
        }
        c1163xf1deaba44.N(new lv0.c(j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), 0, 0, null, 56, null));
        c1163xf1deaba44.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
        c1163xf1deaba44.mo7960x6cab2c8d(oVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d9904 = c1163xf1deaba44.m7949x5701d990();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 o3Var4 = m7949x5701d9904 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) m7949x5701d9904 : null;
        if (o3Var4 != null) {
            o3Var4.f93715g = false;
        }
        findViewById5.setOnClickListener(new vw0.a0(this));
        findViewById6.setOnClickListener(new vw0.b0(this));
        findViewById7.setOnClickListener(new vw0.c0(this));
    }

    public static final void a(vw0.i0 i0Var, android.widget.TextView textView) {
        android.widget.TextView textView2 = i0Var.f522324n;
        int i17 = i0Var.f522328r;
        textView2.setTextColor(i17);
        textView2.setBackground(null);
        android.widget.TextView textView3 = i0Var.f522325o;
        textView3.setTextColor(i17);
        textView3.setBackground(null);
        android.widget.TextView textView4 = i0Var.f522326p;
        textView4.setTextColor(i17);
        textView4.setBackground(null);
        textView.setTextColor(i0Var.f522327q);
        textView.setBackground(i0Var.f522329s);
    }

    public final void b(sw0.g selectedPack) {
        pw0.o oVar = this.f522333w;
        oVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = oVar.f357503d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sw0.d dVar = (sw0.d) obj;
            if (dVar.f494957c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sw0.d.a(dVar, null, null, false, null, 11, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sw0.d dVar2 = (sw0.d) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (dVar2 != null) {
                arrayList.set(intValue, dVar2);
                oVar.m8147xed6e4d18(intValue);
            }
        }
        int i19 = selectedPack.f494968b;
        sw0.d dVar3 = (sw0.d) kz5.n0.a0(arrayList, i19);
        if (dVar3 != null) {
            oVar.x(i19, sw0.d.a(dVar3, null, null, true, null, 11, null));
        }
        if (dVar3 != null) {
            dy0.o.b(this.f522320g, selectedPack.f494968b, false, 2, null);
        }
    }

    public final void c(sw0.g selectedPack) {
        pw0.q qVar = this.f522331u;
        qVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = qVar.f357503d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sw0.d dVar = (sw0.d) obj;
            if (dVar.f494957c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sw0.d.a(dVar, null, null, false, null, 11, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sw0.d dVar2 = (sw0.d) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (dVar2 != null) {
                arrayList.set(intValue, dVar2);
                qVar.m8147xed6e4d18(intValue);
            }
        }
        int i19 = selectedPack.f494968b;
        sw0.d dVar3 = (sw0.d) kz5.n0.a0(arrayList, i19);
        if (dVar3 != null) {
            qVar.x(i19, sw0.d.a(dVar3, null, null, true, null, 11, null));
        }
        if (dVar3 != null) {
            dy0.o.b(this.f522318e, selectedPack.f494968b, false, 2, null);
        }
    }

    public final void d(sw0.g selectedPack) {
        pw0.s sVar = this.f522332v;
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = sVar.f357503d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sw0.d dVar = (sw0.d) obj;
            if (dVar.f494957c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sw0.d.a(dVar, null, null, false, null, 11, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sw0.d dVar2 = (sw0.d) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (dVar2 != null) {
                arrayList.set(intValue, dVar2);
                sVar.m8147xed6e4d18(intValue);
            }
        }
        int i19 = selectedPack.f494968b;
        sw0.d dVar3 = (sw0.d) kz5.n0.a0(arrayList, i19);
        if (dVar3 != null) {
            sVar.x(i19, sw0.d.a(dVar3, null, null, true, null, 11, null));
        }
        if (dVar3 != null) {
            dy0.o.b(this.f522319f, selectedPack.f494968b, false, 2, null);
        }
    }

    public final void e(sw0.g selectedPack) {
        pw0.m mVar = this.f522330t;
        mVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = mVar.f357503d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sw0.d dVar = (sw0.d) obj;
            if (dVar.f494957c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sw0.d.a(dVar, null, null, false, null, 11, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sw0.d dVar2 = (sw0.d) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (dVar2 != null) {
                arrayList.set(intValue, dVar2);
                mVar.m8147xed6e4d18(intValue);
            }
        }
        int i19 = selectedPack.f494968b;
        sw0.d dVar3 = (sw0.d) kz5.n0.a0(arrayList, i19);
        if (dVar3 != null) {
            mVar.x(i19, sw0.d.a(dVar3, null, null, true, null, 11, null));
        }
        if (dVar3 != null) {
            dy0.o.b(this.f522317d, selectedPack.f494968b, false, 2, null);
        }
    }

    /* renamed from: getSelectedTextStyleCallback */
    public final vw0.d0 m172801x677cf0d8() {
        return this.f522334x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if ((r11.f522319f.getVisibility() == 0) != false) goto L13;
     */
    /* renamed from: setAnimStyleState$plugin_mj_template_release */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m172802x7391889(sw0.e r12) {
        /*
            r11 = this;
            java.lang.String r0 = "textMaterialUiState"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setAnimDataList: textMaterialUiState "
            r0.<init>(r1)
            sw0.m r1 = r12.f494961c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextStyleView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            boolean r0 = r1 instanceof sw0.i
            pw0.o r3 = r11.f522333w
            sw0.g r4 = r12.f494960b
            if (r0 == 0) goto La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setAnimDataList: "
            r0.<init>(r1)
            java.util.List r12 = r12.f494959a
            int r1 = r12.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r3.y(r12)
            r11.b(r4)
            java.util.ArrayList r12 = r3.f357503d
            boolean r12 = r12.isEmpty()
            r0 = 0
            if (r12 == 0) goto L57
            androidx.recyclerview.widget.RecyclerView r12 = r11.f522319f
            int r12 = r12.getVisibility()
            r1 = 1
            if (r12 != 0) goto L53
            r12 = r1
            goto L54
        L53:
            r12 = r0
        L54:
            if (r12 == 0) goto L57
            goto L58
        L57:
            r1 = r0
        L58:
            android.view.View r12 = r11.f522322i
            if (r1 == 0) goto L5e
            r1 = r0
            goto L60
        L5e:
            r1 = 8
        L60:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f554818a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r3 = r10.toArray()
            java.lang.String r4 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r5 = "showAnimLoadFailedHintIfDataListEmpty"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r10.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r4 = "showAnimLoadFailedHintIfDataListEmpty"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            goto Lc8
        La2:
            boolean r12 = r1 instanceof sw0.l
            if (r12 == 0) goto Laa
            r11.b(r4)
            goto Lc8
        Laa:
            boolean r12 = r1 instanceof sw0.j
            if (r12 == 0) goto Lb8
            sw0.j r1 = (sw0.j) r1
            int r12 = r1.f494971a
            zu0.i r0 = r1.f494972b
            r3.z(r12, r0)
            goto Lc8
        Lb8:
            boolean r12 = r1 instanceof sw0.k
            if (r12 == 0) goto Lc8
            r11.b(r4)
            sw0.k r1 = (sw0.k) r1
            int r12 = r1.f494973a
            zu0.i r0 = r1.f494974b
            r3.z(r12, r0)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vw0.i0.m172802x7391889(sw0.e):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if ((r11.f522318e.getVisibility() == 0) != false) goto L13;
     */
    /* renamed from: setColorStyleState$plugin_mj_template_release */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m172803xc27babb(sw0.e r12) {
        /*
            r11 = this;
            java.lang.String r0 = "textMaterialUiState"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setColorDataList: textMaterialUiState "
            r0.<init>(r1)
            sw0.m r1 = r12.f494961c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextStyleView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            boolean r0 = r1 instanceof sw0.i
            pw0.q r3 = r11.f522331u
            sw0.g r4 = r12.f494960b
            if (r0 == 0) goto La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setColorDataList: "
            r0.<init>(r1)
            java.util.List r12 = r12.f494959a
            int r1 = r12.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r3.y(r12)
            r11.c(r4)
            java.util.ArrayList r12 = r3.f357503d
            boolean r12 = r12.isEmpty()
            r0 = 0
            if (r12 == 0) goto L57
            androidx.recyclerview.widget.RecyclerView r12 = r11.f522318e
            int r12 = r12.getVisibility()
            r1 = 1
            if (r12 != 0) goto L53
            r12 = r1
            goto L54
        L53:
            r12 = r0
        L54:
            if (r12 == 0) goto L57
            goto L58
        L57:
            r1 = r0
        L58:
            android.view.View r12 = r11.f522321h
            if (r1 == 0) goto L5e
            r1 = r0
            goto L60
        L5e:
            r1 = 8
        L60:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f554818a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r3 = r10.toArray()
            java.lang.String r4 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r5 = "showColorLoadFailedHintIfDataListEmpty"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r10.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r4 = "showColorLoadFailedHintIfDataListEmpty"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            goto Lc8
        La2:
            boolean r12 = r1 instanceof sw0.l
            if (r12 == 0) goto Laa
            r11.c(r4)
            goto Lc8
        Laa:
            boolean r12 = r1 instanceof sw0.j
            if (r12 == 0) goto Lb8
            sw0.j r1 = (sw0.j) r1
            int r12 = r1.f494971a
            zu0.i r0 = r1.f494972b
            r3.z(r12, r0)
            goto Lc8
        Lb8:
            boolean r12 = r1 instanceof sw0.k
            if (r12 == 0) goto Lc8
            r11.c(r4)
            sw0.k r1 = (sw0.k) r1
            int r12 = r1.f494973a
            zu0.i r0 = r1.f494974b
            r3.z(r12, r0)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vw0.i0.m172803xc27babb(sw0.e):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if ((r11.f522319f.getVisibility() == 0) != false) goto L13;
     */
    /* renamed from: setFontStyleState */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m172804x6434e411(sw0.e r12) {
        /*
            r11 = this;
            java.lang.String r0 = "textMaterialUiState"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setFontDataList: textMaterialUiState "
            r0.<init>(r1)
            sw0.m r1 = r12.f494961c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextStyleView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            boolean r0 = r1 instanceof sw0.i
            pw0.s r2 = r11.f522332v
            sw0.g r3 = r12.f494960b
            if (r0 == 0) goto L8d
            java.util.List r12 = r12.f494959a
            r2.y(r12)
            r11.d(r3)
            java.util.ArrayList r12 = r2.f357503d
            boolean r12 = r12.isEmpty()
            r0 = 0
            if (r12 == 0) goto L42
            androidx.recyclerview.widget.RecyclerView r12 = r11.f522319f
            int r12 = r12.getVisibility()
            r1 = 1
            if (r12 != 0) goto L3e
            r12 = r1
            goto L3f
        L3e:
            r12 = r0
        L3f:
            if (r12 == 0) goto L42
            goto L43
        L42:
            r1 = r0
        L43:
            android.view.View r12 = r11.f522322i
            if (r1 == 0) goto L49
            r1 = r0
            goto L4b
        L49:
            r1 = 8
        L4b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f554818a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r3 = r10.toArray()
            java.lang.String r4 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r5 = "showFontLoadFailedHintIfDataListEmpty"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r10.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView"
            java.lang.String r4 = "showFontLoadFailedHintIfDataListEmpty"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            goto Lb3
        L8d:
            boolean r12 = r1 instanceof sw0.l
            if (r12 == 0) goto L95
            r11.d(r3)
            goto Lb3
        L95:
            boolean r12 = r1 instanceof sw0.j
            if (r12 == 0) goto La3
            sw0.j r1 = (sw0.j) r1
            int r12 = r1.f494971a
            zu0.i r0 = r1.f494972b
            r2.z(r12, r0)
            goto Lb3
        La3:
            boolean r12 = r1 instanceof sw0.k
            if (r12 == 0) goto Lb3
            r11.d(r3)
            sw0.k r1 = (sw0.k) r1
            int r12 = r1.f494973a
            zu0.i r0 = r1.f494974b
            r2.z(r12, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vw0.i0.m172804x6434e411(sw0.e):void");
    }

    /* renamed from: setSelectedTextStyleCallback */
    public final void m172805xb149494c(vw0.d0 d0Var) {
        this.f522334x = d0Var;
    }

    /* renamed from: setTextStyleState */
    public final void m172806xba281f6f(sw0.e textMaterialUiState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textMaterialUiState, "textMaterialUiState");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTextStyleData: textStyleUiState ");
        sw0.m mVar = textMaterialUiState.f494961c;
        sb6.append(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextStyleView", sb6.toString());
        boolean z17 = mVar instanceof sw0.i;
        pw0.m mVar2 = this.f522330t;
        sw0.g gVar = textMaterialUiState.f494960b;
        if (z17) {
            mVar2.y(textMaterialUiState.f494959a);
            e(gVar);
            return;
        }
        if (mVar instanceof sw0.l) {
            e(gVar);
            return;
        }
        if (mVar instanceof sw0.j) {
            sw0.j jVar = (sw0.j) mVar;
            mVar2.z(jVar.f494971a, jVar.f494972b);
        } else if (mVar instanceof sw0.k) {
            e(gVar);
            sw0.k kVar = (sw0.k) mVar;
            mVar2.z(kVar.f494973a, kVar.f494974b);
        }
    }
}
