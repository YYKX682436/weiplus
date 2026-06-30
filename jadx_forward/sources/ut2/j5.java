package ut2;

/* loaded from: classes3.dex */
public final class j5 implements android.view.View.OnClickListener {
    public final android.view.ViewGroup A;
    public final xt2.r3 B;
    public xt2.n C;
    public xt2.n D;
    public p3325xe03a0797.p3326xc267989b.r2 E;

    /* renamed from: d, reason: collision with root package name */
    public final st2.h1 f512469d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f512470e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f512471f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f512472g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f512473h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f512474i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f512475m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f512476n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f512477o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f512478p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f512479q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f512480r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f512481s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f512482t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f512483u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f512484v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f512485w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f512486x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f512487y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.ViewGroup f512488z;

    public j5(st2.h1 shoppingList, android.view.ViewGroup root, gk2.e buContext, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shoppingList, "shoppingList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f512469d = shoppingList;
        this.f512470e = root;
        this.f512471f = buContext;
        this.f512472g = y0Var;
        this.f512473h = "ShoppingPanelHeaderHolder";
        this.f512474i = root.findViewById(com.p314xaae8f345.mm.R.id.qye);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.flz);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        d92.f fVar = d92.f.f309003a;
        java.lang.Float valueOf = java.lang.Float.valueOf(15.0f);
        fVar.h(textView, valueOf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        this.f512475m = jz5.h.b(new ut2.r4(this));
        jz5.h.b(new ut2.s4(this));
        this.f512476n = jz5.h.b(new ut2.g5(this));
        android.view.View findViewById2 = s().findViewById(com.p314xaae8f345.mm.R.id.mui);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        fVar.h(textView2, valueOf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "apply(...)");
        this.f512477o = (android.widget.TextView) findViewById2;
        this.f512478p = jz5.h.b(new ut2.f5(this));
        this.f512479q = jz5.h.b(new ut2.e5(this));
        android.view.View findViewById3 = p().findViewById(com.p314xaae8f345.mm.R.id.mug);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        zl2.r4 r4Var = zl2.r4.f555483a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        try {
            textView3.setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), "fonts/SF-Pro-Text-MediumItalic.ttf"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveUtil", "setShopScoreTypeFace() Exception:" + e17.getMessage());
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        fVar.h(textView3, java.lang.Float.valueOf(13.0f));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "apply(...)");
        this.f512480r = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = p().findViewById(com.p314xaae8f345.mm.R.id.mue);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById4;
        com.p314xaae8f345.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        fVar.h(textView4, java.lang.Float.valueOf(12.0f));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "apply(...)");
        this.f512481s = (android.widget.TextView) findViewById4;
        this.f512482t = jz5.h.b(new ut2.b5(this));
        jz5.h.b(new ut2.c5(this));
        jz5.h.b(new ut2.d5(this));
        this.f512483u = jz5.h.b(new ut2.j4(this));
        this.f512484v = jz5.h.b(new ut2.x4(this));
        this.f512485w = jz5.h.b(new ut2.v4(this));
        this.f512486x = jz5.h.b(new ut2.w4(this));
        android.view.View findViewById5 = p().findViewById(com.p314xaae8f345.mm.R.id.mua);
        android.widget.TextView textView5 = (android.widget.TextView) findViewById5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView5);
        fVar.h(textView5, java.lang.Float.valueOf(12.0f));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "apply(...)");
        this.f512487y = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = t().findViewById(com.p314xaae8f345.mm.R.id.s5y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f512488z = (android.view.ViewGroup) findViewById6;
        android.view.View findViewById7 = t().findViewById(com.p314xaae8f345.mm.R.id.s5v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.A = (android.view.ViewGroup) findViewById7;
        android.view.View findViewById8 = this.f512470e.findViewById(com.p314xaae8f345.mm.R.id.f565126bd4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.B = new xt2.r3((android.view.ViewGroup) findViewById8, h());
        ym5.a1.h(s(), new ut2.a5(this));
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42328x90544e91(t(), ut2.i4.f512457d);
    }

    public static final void a(ut2.j5 j5Var, ml2.f4 f4Var) {
        r45.e56 e56Var = ((mm2.f6) j5Var.f512471f.a(mm2.f6.class)).K;
        org.json.JSONObject jSONObject = null;
        java.lang.Integer valueOf = e56Var != null ? java.lang.Integer.valueOf(e56Var.m75939xb282bd08(18)) : null;
        if (valueOf != null) {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("window_type", valueOf.intValue());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j5Var.f512473h, "report shopwindow action = " + f4Var.name() + ", type = " + valueOf);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, f4Var, null, null, null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
    }

    public static final void d(ut2.j5 j5Var, boolean z17) {
        r45.e56 e56Var = ((mm2.f6) j5Var.f512471f.a(mm2.f6.class)).K;
        int m75939xb282bd08 = e56Var != null ? e56Var.m75939xb282bd08(11) : 0;
        gk2.e eVar = j5Var.f512471f;
        r45.e56 e56Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).K;
        java.lang.String m75945x2fec8307 = e56Var2 != null ? e56Var2.m75945x2fec8307(12) : null;
        r45.e56 e56Var3 = ((mm2.f6) eVar.a(mm2.f6.class)).K;
        java.lang.String m75945x2fec83072 = e56Var3 != null ? e56Var3.m75945x2fec8307(13) : null;
        jz5.g gVar = j5Var.f512484v;
        jz5.g gVar2 = j5Var.f512486x;
        jz5.g gVar3 = j5Var.f512485w;
        if (!z17 || m75939xb282bd08 == 0) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar3).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.widget.ImageView) mo141623x754a37bb).setVisibility(8);
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb2).setVisibility(8);
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            android.view.View view = (android.view.View) mo141623x754a37bb3;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        android.view.View view2 = (android.view.View) mo141623x754a37bb4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar3).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        ((android.widget.ImageView) mo141623x754a37bb5).setVisibility(0);
        java.lang.Object mo141623x754a37bb6 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb6).setVisibility(0);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e);
        java.lang.Object mo141623x754a37bb7 = ((jz5.n) gVar3).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb7, "getValue(...)");
        e17.c(q3Var, (android.widget.ImageView) mo141623x754a37bb7, g1Var.h(mn2.f1.f411498s));
        java.lang.Object mo141623x754a37bb8 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb8, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb8).setText(m75945x2fec83072);
    }

    public final boolean b() {
        r45.h92 h92Var;
        gk2.e eVar = this.f512471f;
        r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
        if ((dv1Var != null ? (r45.h92) dv1Var.m75936x14adae67(11) : null) == null) {
            return false;
        }
        r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
        return !(dv1Var2 != null && (h92Var = (r45.h92) dv1Var2.m75936x14adae67(11)) != null && h92Var.m75939xb282bd08(0) == 0);
    }

    public final void c() {
        if (!(((mm2.f6) this.f512471f.a(mm2.f6.class)).Z != null)) {
            android.view.View h17 = h();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkCartShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkCartShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        d92.f fVar = d92.f.f309003a;
        android.view.View findViewById = h().findViewById(com.p314xaae8f345.mm.R.id.fld);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        fVar.k(findViewById, 20.0f, 20.0f);
        android.view.View findViewById2 = h().findViewById(com.p314xaae8f345.mm.R.id.rn_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        fVar.k(findViewById2, 20.0f, 20.0f);
        android.view.View findViewById3 = h().findViewById(com.p314xaae8f345.mm.R.id.fle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        fVar.h((android.widget.TextView) findViewById3, java.lang.Float.valueOf(12.0f));
        if (h().getVisibility() != 0) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408797s;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", mc1.c.f72820x366c91de);
            jSONObject.put("btn_word", "购物车");
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            android.view.View h18 = h();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(h18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkCartShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(h18, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkCartShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:154|(1:156)(1:218)|157|(1:159)(1:217)|160|(3:212|213|(1:215)(18:216|163|(3:165|166|167)(2:208|(1:210))|168|169|(3:198|199|(1:201)(11:202|(1:173)|178|(1:180)(1:197)|181|(1:183)|184|(1:186)(1:196)|(1:195)(1:190)|(1:192)(1:194)|193))|171|(0)|178|(0)(0)|181|(0)|184|(0)(0)|(1:188)|195|(0)(0)|193))|162|163|(0)(0)|168|169|(0)|171|(0)|178|(0)(0)|181|(0)|184|(0)(0)|(0)|195|(0)(0)|193) */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0728, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0866 A[Catch: Exception -> 0x0861, TryCatch #3 {Exception -> 0x0861, blocks: (B:145:0x0858, B:124:0x0866, B:143:0x086b), top: B:144:0x0858 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x086b A[Catch: Exception -> 0x0861, TRY_LEAVE, TryCatch #3 {Exception -> 0x0861, blocks: (B:145:0x0858, B:124:0x0866, B:143:0x086b), top: B:144:0x0858 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06f4 A[Catch: Exception -> 0x06ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x06ed, blocks: (B:213:0x06e4, B:165:0x06f4), top: B:212:0x06e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x076d A[Catch: Exception -> 0x0768, TRY_LEAVE, TryCatch #1 {Exception -> 0x0768, blocks: (B:199:0x075f, B:173:0x076d), top: B:198:0x075f }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x075f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0711 A[Catch: Exception -> 0x0728, TryCatch #2 {Exception -> 0x0728, blocks: (B:167:0x0700, B:208:0x0711, B:210:0x0719), top: B:163:0x06f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c6  */
    /* JADX WARN: Type inference failed for: r0v166 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 2515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut2.j5.e():void");
    }

    public final void f(boolean z17) {
        java.lang.Object obj;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String str;
        java.lang.String str2;
        r45.dv1 dv1Var = ((mm2.f6) this.f512471f.a(mm2.f6.class)).f410571n;
        r45.h92 h92Var = dv1Var != null ? (r45.h92) dv1Var.m75936x14adae67(11) : null;
        java.util.Iterator it = this.f512469d.P.f503418p.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            so2.j5 j5Var = (so2.j5) obj;
            if ((j5Var instanceof cm2.m0) && ((cm2.m0) j5Var).G == 1) {
                break;
            }
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = this.f512470e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        cm2.m0 m0Var = (cm2.m0) ((so2.j5) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#enterShopCustomerService ");
        sb6.append(m0Var != null ? java.lang.Long.valueOf(m0Var.f124902w) : null);
        sb6.append(", ");
        sb6.append(h92Var != null ? java.lang.Integer.valueOf(h92Var.m75939xb282bd08(0)) : "null");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
        if (h92Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "#enterShopCustomerService csInfo is null. jump to msg");
            zl2.r4.N(context);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "#enterShopCustomerService " + pm0.b0.g(h92Var));
        int m75939xb282bd08 = h92Var.m75939xb282bd08(0);
        if (m75939xb282bd08 == 1) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).tk(2);
            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(h92Var.m75945x2fec8307(1), new zl2.q1(h92Var, m0Var, context));
            return;
        }
        java.lang.String str3 = "";
        if (m75939xb282bd08 == 2) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).tk(4);
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            r45.c33 c33Var = (r45.c33) h92Var.m75936x14adae67(2);
            java.lang.String str4 = (c33Var == null || (m75945x2fec83072 = c33Var.m75945x2fec8307(0)) == null) ? "" : m75945x2fec83072;
            r45.c33 c33Var2 = (r45.c33) h92Var.m75936x14adae67(2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).ll(context, str4, (c33Var2 == null || (m75945x2fec8307 = c33Var2.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307, 1177, "");
            return;
        }
        if (m75939xb282bd08 == 3) {
            java.lang.String m75945x2fec83073 = h92Var.m75945x2fec8307(3);
            if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "invalid h5 url");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", h92Var.m75945x2fec8307(3));
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (m75939xb282bd08 != 4 && m75939xb282bd08 != 6) {
            zl2.r4.N(context);
            return;
        }
        int m75939xb282bd082 = h92Var.m75939xb282bd08(0);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).tk(m75939xb282bd082 != 4 ? 5 : 3);
        r45.u23 u23Var = (r45.u23) h92Var.m75936x14adae67(4);
        if (u23Var == null || (str = u23Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "#enterShopCustomerService type = " + m75939xb282bd082 + " kfUrl=" + str);
        j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
        if (zVar != null) {
            com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = new com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1();
            c11207x71c7a1c1.f153805d = context;
            c11207x71c7a1c1.f153806e = java.lang.System.currentTimeMillis();
            c11207x71c7a1c1.f153807f = 11;
            r45.s4 s4Var = new r45.s4();
            s4Var.f467019d = str;
            r45.l05 l05Var = new r45.l05();
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            if (c1Var != null && (str2 = c1Var.f410385o) != null) {
                str3 = str2;
            }
            l05Var.f460593e = str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "entityid " + l05Var.f460593e);
            s4Var.f467022g = l05Var;
            c11207x71c7a1c1.f153810i = s4Var;
            c11207x71c7a1c1.f153809h = j41.f0.a(c11207x71c7a1c1.f153807f);
            ((l41.g2) zVar).Bi(c11207x71c7a1c1);
        }
    }

    public final android.widget.ImageView g() {
        java.lang.Object mo141623x754a37bb = this.f512483u.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }

    public final android.view.View h() {
        android.view.View findViewById = t().findViewById(com.p314xaae8f345.mm.R.id.flc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    public final android.view.View i() {
        android.view.View findViewById = t().findViewById(com.p314xaae8f345.mm.R.id.flm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    public final android.view.View j() {
        android.view.View findViewById = t().findViewById(com.p314xaae8f345.mm.R.id.flr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    public final android.widget.TextView k() {
        android.view.View findViewById = t().findViewById(com.p314xaae8f345.mm.R.id.s3q);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        d92.f fVar = d92.f.f309003a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        fVar.h(textView, java.lang.Float.valueOf(12.0f));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        return (android.widget.TextView) findViewById;
    }

    public final android.view.View l() {
        android.view.View findViewById = t().findViewById(com.p314xaae8f345.mm.R.id.rnb);
        android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.rne);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        java.lang.Float dpSize = java.lang.Float.valueOf(12.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dpSize, "dpSize");
        ((android.widget.TextView) findViewById2).setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        return findViewById;
    }

    public final android.view.View m() {
        android.view.View findViewById = t().findViewById(com.p314xaae8f345.mm.R.id.flw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 n() {
        android.view.View findViewById = m().findViewById(com.p314xaae8f345.mm.R.id.flx);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        d92.f fVar = d92.f.f309003a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        fVar.k(c22699x3dcdb352, 20.0f, 20.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
    }

    public final android.widget.TextView o() {
        android.view.View findViewById = m().findViewById(com.p314xaae8f345.mm.R.id.fly);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        java.lang.Float dpSize = java.lang.Float.valueOf(12.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dpSize, "dpSize");
        textView.setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        return (android.widget.TextView) findViewById;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        r45.c33 c33Var;
        java.lang.String m75945x2fec8307;
        r45.c33 c33Var2;
        r45.c33 c33Var3;
        r45.c33 c33Var4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        st2.h1 h1Var = this.f512469d;
        if (valueOf == null || valueOf.intValue() != com.p314xaae8f345.mm.R.id.flf) {
            str = "";
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.flr) {
                if (!h1Var.w()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gotoShoppingOrder appId:");
                    gk2.e eVar = h1Var.f493868f;
                    r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
                    sb6.append((dv1Var == null || (c33Var4 = (r45.c33) dv1Var.m75936x14adae67(7)) == null) ? null : c33Var4.m75945x2fec8307(0));
                    sb6.append(",path:");
                    r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
                    sb6.append((dv1Var2 == null || (c33Var3 = (r45.c33) dv1Var2.m75936x14adae67(7)) == null) ? null : c33Var3.m75945x2fec8307(1));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", sb6.toString());
                    st2.o oVar = new st2.o(h1Var);
                    java.lang.String obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0().toString();
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    if (r4Var.w1()) {
                        p52.c cVar = p52.h.f433549a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
                        p52.h.f433562n = obj;
                    }
                    l81.b1 b1Var = new l81.b1();
                    r45.dv1 dv1Var3 = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
                    if (dv1Var3 == null || (c33Var2 = (r45.c33) dv1Var3.m75936x14adae67(7)) == null || (str2 = c33Var2.m75945x2fec8307(0)) == null) {
                        str2 = "";
                    }
                    b1Var.f398547b = str2;
                    r45.dv1 dv1Var4 = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
                    if (dv1Var4 != null && (c33Var = (r45.c33) dv1Var4.m75936x14adae67(7)) != null && (m75945x2fec8307 = c33Var.m75945x2fec8307(1)) != null) {
                        str = m75945x2fec8307;
                    }
                    b1Var.f398555f = str;
                    b1Var.f398565k = 1177;
                    b1Var.f398567l = "live_list_order:" + ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0) + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).f410385o + "::" + ((mm2.c1) eVar.a(mm2.c1.class)).f410394p2 + ':' + obj + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).P3 + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).f410324d3;
                    if (!r4Var.w1()) {
                        p52.c cVar2 = p52.h.f433549a;
                        java.lang.String str3 = b1Var.f398547b;
                        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                        long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                        ((m30.m) rVar).getClass();
                        java.lang.String q17 = b52.b.q(m75942xfb822ef2);
                        n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
                        long j17 = ((mm2.c1) eVar.a(mm2.c1.class)).f410394p2;
                        ((m30.m) rVar2).getClass();
                        cVar2.g(obj, str3, q17, "", b52.b.q(j17));
                    }
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.y4 y4Var = ml2.j0.f409116i;
                    java.lang.String sceneNote = b1Var.f398567l;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sceneNote, "sceneNote");
                    y4Var.getClass();
                    y4Var.f409839n = sceneNote;
                    oVar.mo149xb9724478(java.lang.Boolean.FALSE, b1Var);
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.flw) {
                int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_SHOPPING_SERVICE_NOTE_TIME_LONG_SYNC;
                long t17 = c17.t(u3Var, 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f512473h, "lastShowNoteTime " + t17);
                boolean b17 = b();
                if (m75939xb282bd08 == 1 || (java.lang.System.currentTimeMillis() - t17 <= 86400000 && ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.I1).mo141623x754a37bb()).r()).intValue() != 0)) {
                    f(false);
                } else {
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    h1Var.u();
                    android.view.ViewGroup viewGroup = this.f512470e;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(viewGroup.getContext());
                    y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.azm);
                    com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.fsz)).getPaint(), 0.8f);
                    android.view.View findViewById = y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.fsx);
                    android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.h5n);
                    android.widget.TextView textView = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.fsz);
                    android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.obc);
                    android.widget.TextView textView3 = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
                    ((android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.m3v)).setVisibility(8);
                    if (b17) {
                        textView.setText(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573366ee0));
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context = viewGroup.getContext();
                        java.lang.String b18 = hc2.t.b(viewGroup.getContext(), 2);
                        ((ke0.e) xVar).getClass();
                        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, b18));
                        ng5.a.a(imageView, c01.z1.r());
                    } else {
                        gk2.e eVar2 = this.f512471f;
                        int m75939xb282bd082 = ((mm2.c1) eVar2.a(mm2.c1.class)).I7().m75939xb282bd08(2);
                        mn2.g1 g1Var = mn2.g1.f411508a;
                        if (m75939xb282bd082 == 3) {
                            textView.setText(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eee));
                            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                            android.content.Context context2 = viewGroup.getContext();
                            java.lang.String b19 = hc2.t.b(viewGroup.getContext(), 1);
                            ((ke0.e) xVar2).getClass();
                            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, b19));
                            ya2.g gVar = ya2.h.f542017a;
                            android.content.Context context3 = viewGroup.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                            ya2.b2 b27 = gVar.b(xy2.c.e(context3));
                            str = b27 != null ? b27.m176700xe5e0d2a0() : "";
                            vo0.d a17 = g1Var.a();
                            mn2.n nVar = new mn2.n(str, null, 2, null);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                            a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
                        } else if (((mm2.c1) eVar2.a(mm2.c1.class)).I7().m75939xb282bd08(2) == 2) {
                            textView.setText(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eed));
                            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                            android.content.Context context4 = viewGroup.getContext();
                            java.lang.String m75945x2fec83072 = ((mm2.c1) eVar2.a(mm2.c1.class)).I7().m75945x2fec8307(0);
                            ((ke0.e) xVar3).getClass();
                            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context4, m75945x2fec83072));
                            vo0.d a18 = g1Var.a();
                            mn2.n nVar2 = new mn2.n(((mm2.c1) eVar2.a(mm2.c1.class)).I7().m75945x2fec8307(1), null, 2, null);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                            a18.c(nVar2, imageView, g1Var.h(mn2.f1.f411490h));
                        } else {
                            f(false);
                        }
                    }
                    textView3.setVisibility(8);
                    ((android.widget.Button) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.khs)).setOnClickListener(new ut2.t4(y1Var, this));
                    ((android.widget.Button) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.b5i)).setOnClickListener(new ut2.u4(y1Var, this));
                    y1Var.s();
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.flc) {
                if (zl2.r4.f555483a.w1()) {
                    u();
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = h1Var.f493870h;
                    if (lVar != null && lVar.x0()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = h1Var.f493870h;
                        if (lVar2 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.s1(lVar2, "PORTRAIT_ACTION_CART_CLICKED", 0, 0, 4, null);
                        }
                    } else {
                        u();
                    }
                }
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c18;
                ml2.b4 b4Var = ml2.b4.f408797s;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("commerceAction", 1031);
                jSONObject.put("btn_word", "购物车");
                ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            }
        } else if (h1Var.j().getVisibility() == 0) {
            if (h1Var.p().getVisibility() == 0) {
                h1Var.s(true);
            } else {
                h1Var.u();
            }
        } else if (h1Var.p().getVisibility() == 0) {
            h1Var.t(true, true);
        } else {
            h1Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final android.view.View p() {
        java.lang.Object mo141623x754a37bb = this.f512479q.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.widget.ImageView q() {
        java.lang.Object mo141623x754a37bb = this.f512478p.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }

    public final android.widget.ImageView r() {
        android.view.View findViewById = t().findViewById(com.p314xaae8f345.mm.R.id.s5x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final android.view.View s() {
        java.lang.Object mo141623x754a37bb = this.f512476n.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View t() {
        android.view.View normalTitleGroup = this.f512474i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(normalTitleGroup, "normalTitleGroup");
        return normalTitleGroup;
    }

    public final void u() {
        gk2.e eVar = this.f512471f;
        bw5.x7 x7Var = ((mm2.f6) eVar.a(mm2.f6.class)).f410574p0;
        android.view.ViewGroup viewGroup = this.f512470e;
        if (x7Var != null) {
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pq.a aVar = new pq.a(context);
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
            return;
        }
        r45.c33 c33Var = ((mm2.f6) eVar.a(mm2.f6.class)).Z;
        if (c33Var == null) {
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = c33Var.m75945x2fec8307(0);
        b1Var.f398555f = c33Var.m75945x2fec8307(1);
        b1Var.f398565k = 1177;
        b1Var.X = k91.b1.f387074e;
        dk2.q4 q4Var = dk2.q4.f315471a;
        android.content.Context context2 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        q4Var.l(context2, this.f512471f, b1Var, true, null);
    }
}
