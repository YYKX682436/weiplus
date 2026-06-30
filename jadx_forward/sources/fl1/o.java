package fl1;

/* loaded from: classes7.dex */
public class o extends android.app.Dialog implements fl1.b2, ui1.z {
    public final java.util.List A;
    public fl1.i1 B;
    public int C;

    /* renamed from: d, reason: collision with root package name */
    public final xi1.g f345349d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f345350e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f345351f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f345352g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Button f345353h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.Button f345354i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f345355m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f345356n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f345357o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f345358p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.LinearLayout f345359q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf f345360r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f345361s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f345362t;

    /* renamed from: u, reason: collision with root package name */
    public final fl1.s f345363u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f345364v;

    /* renamed from: w, reason: collision with root package name */
    public fl1.g2 f345365w;

    /* renamed from: x, reason: collision with root package name */
    public final ui1.y f345366x;

    /* renamed from: y, reason: collision with root package name */
    public final fl1.r1 f345367y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f345368z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, xi1.g windowAndroid, ui1.y listener) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowAndroid, "windowAndroid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f345349d = windowAndroid;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569619gu, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f345350e = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.oud);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f345363u = new fl1.s(context, findViewById);
        this.f345366x = listener;
        this.f345368z = "";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.A = arrayList;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f345351f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f345352g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById4;
        this.f345354i = button;
        button.setOnClickListener(new fl1.l(this));
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.Button button2 = (android.widget.Button) findViewById5;
        this.f345353h = button2;
        android.text.TextPaint paint = button2.getPaint();
        nf.y yVar = nf.x.f418149b;
        if (yVar != null) {
            yVar.g(paint);
        } else {
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            if (paint != null) {
                paint.setStrokeWidth(0.8f);
            }
        }
        button2.setOnClickListener(new fl1.m(this));
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById6;
        this.f345355m = textView;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.mwy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f345356n = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f345359q = (android.widget.LinearLayout) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById9;
        this.f345357o = imageView;
        zk1.j jVar = zk1.m.f554947l;
        zk1.j.b(jVar, imageView, null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f571837r9), false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 4090, null);
        android.view.View findViewById10 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById10;
        this.f345358p = textView2;
        android.text.TextPaint paint2 = textView2.getPaint();
        nf.y yVar2 = nf.x.f418149b;
        if (yVar2 != null) {
            yVar2.g(paint2);
        } else {
            if (paint2 != null) {
                paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
        }
        android.view.View findViewById11 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf c12697x85b15aaf = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf) findViewById11;
        this.f345360r = c12697x85b15aaf;
        zk1.j.b(jVar, c12697x85b15aaf, null, null, true, null, null, null, null, null, null, null, null, null, 8182, null);
        c12697x85b15aaf.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        fl1.r1 r1Var = new fl1.r1(arrayList);
        this.f345367y = r1Var;
        r1Var.f345385e = this.B;
        c12697x85b15aaf.mo7960x6cab2c8d(r1Var);
        c12697x85b15aaf.m7964x8d4ad49c(null);
        android.view.View findViewById12 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f345364v = findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b3v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.f345362t = findViewById13;
        android.view.View findViewById14 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById14;
        this.f345361s = textView3;
        zk1.j.b(jVar, textView3, android.widget.Button.class, null, false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 4092, null);
        textView2.setAccessibilityTraversalAfter(com.p314xaae8f345.mm.R.id.lzw);
        textView2.setAccessibilityTraversalBefore(com.p314xaae8f345.mm.R.id.lzz);
        textView.setAccessibilityTraversalAfter(com.p314xaae8f345.mm.R.id.lzm);
        textView.setAccessibilityTraversalBefore(com.p314xaae8f345.mm.R.id.lzy);
        textView3.setAccessibilityTraversalAfter(com.p314xaae8f345.mm.R.id.lzy);
        textView3.setAccessibilityTraversalBefore(com.p314xaae8f345.mm.R.id.lzn);
        this.C = 2;
    }

    public static final java.util.ArrayList c(fl1.o oVar, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        oVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.text.TextUtils.isEmpty(oVar.f345368z)) {
            java.util.List<fl1.h1> list = oVar.f345367y.f345384d;
            if (list.size() == 1) {
                fl1.h1 h1Var = (fl1.h1) list.get(0);
                if (h1Var != null && (str2 = h1Var.f345315d) != null) {
                    arrayList.add(str2);
                }
            } else {
                for (fl1.h1 h1Var2 : list) {
                    if ((h1Var2 != null && h1Var2.f345317f == z17) && (str = h1Var2.f345315d) != null) {
                        arrayList.add(str);
                    }
                }
            }
        } else {
            arrayList.add(oVar.f345368z);
        }
        return arrayList;
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    public final void e(int i17) {
        double d17 = (i17 == 1 || i17 == 3) ? 1.5d : 2.5d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf c12697x85b15aaf = this.f345360r;
        c12697x85b15aaf.getViewTreeObserver().addOnGlobalLayoutListener(new fl1.n(d17, this));
        c12697x85b15aaf.invalidate();
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f345350e;
    }

    @Override // ui1.z
    /* renamed from: getLastPointerDownTouchEvent */
    public android.view.MotionEvent mo2022x28e740ce() {
        android.view.View view = this.f345350e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandDialogContentView");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1223xb099fd48.C12770x94ea66f0) view).m53376x28e740ce();
    }

    @Override // fl1.b2
    /* renamed from: getPosition */
    public int mo14604xa86cd69f() {
        return this.C;
    }

    @Override // si1.k0
    public si1.j0 h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        xi1.g mo50261xee5260a9 = component.mo50261xee5260a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50261xee5260a9);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        fl1.z1 z1Var = new fl1.z1(r1Var, str, context, this.f345350e.getMeasuredHeight(), mo50261xee5260a9);
        z1Var.k(this.C);
        return z1Var;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    public final boolean k() {
        fl1.s sVar = this.f345363u;
        if (sVar.c()) {
            return sVar.a();
        }
        return true;
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f345350e);
    }

    @Override // ui1.z
    public void o(boolean z17) {
        this.f345357o.setVisibility(z17 ? 0 : 8);
    }

    @Override // fl1.b2
    /* renamed from: onCancel */
    public void mo123830x3d6f0539() {
        ui1.y.b(this.f345366x, 3, new java.util.ArrayList(), 0, false, 12, null);
    }

    @Override // si1.i0
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        i(component).a(this);
    }

    @Override // si1.i0
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        s(this.C);
        i(component).c(this);
    }

    public final void s(int i17) {
        this.C = i17;
        android.view.View view = this.f345350e;
        if (i17 == 1) {
            view.setBackground(b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562390ea));
        } else {
            if (i17 != 2) {
                return;
            }
            view.setBackground(b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.e_));
        }
    }

    @Override // ui1.z
    /* renamed from: setAppBrandName */
    public void mo2026xce3d2713(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f345352g.setText(str);
    }

    @Override // ui1.z
    /* renamed from: setApplyWording */
    public void mo2027xea2586cc(java.lang.String str) {
        this.f345358p.setText(str);
    }

    @Override // ui1.z
    /* renamed from: setExplainOnClickListener */
    public void mo2028x78fb63c8(android.view.View.OnClickListener onClickListener) {
        this.f345357o.setOnClickListener(onClickListener);
    }

    @Override // ui1.z
    /* renamed from: setFunctionButtonOnClickListener */
    public void mo2029x3aaeeaf1(android.view.View.OnClickListener onClickListener) {
        this.f345361s.setOnClickListener(onClickListener);
    }

    @Override // ui1.z
    /* renamed from: setFunctionButtonText */
    public void mo2030x8f8b3d79(java.lang.String str) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        android.widget.TextView textView = this.f345361s;
        if (isEmpty) {
            textView.setText("");
            textView.setVisibility(4);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    @Override // ui1.z
    /* renamed from: setFunctionButtonTextColor */
    public void mo2031x5951856a(int i17) {
        this.f345361s.setTextColor(i17);
    }

    @Override // ui1.z
    /* renamed from: setFunctionButtonVisibility */
    public void mo2032xf1caf25e(int i17) {
        this.f345361s.setVisibility(i17);
    }

    @Override // fl1.e2
    /* renamed from: setIExternalToolsHelper */
    public void mo2005x1f85dcf7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var) {
        this.f345363u.f345393m = r1Var;
    }

    @Override // ui1.z
    /* renamed from: setIconUrl */
    public void mo2033x12ec1b74(java.lang.String str) {
        l01.d0.f396294a.b(this.f345351f, str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ud.a(), l01.q0.f396320d);
    }

    @Override // ui1.z
    /* renamed from: setItemCheckedListener */
    public void mo2034x26df5226(fl1.i1 i1Var) {
        this.B = i1Var;
        this.f345367y.f345385e = i1Var;
    }

    @Override // ui1.z
    /* renamed from: setNegativeButtonText */
    public void mo2036xc499c596(java.lang.String str) {
        if (str != null) {
            this.f345354i.setText(str);
        }
    }

    @Override // ui1.z
    /* renamed from: setOnListItemLongClickListener */
    public void mo2037x3aaa4d8e(fl1.j1 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f345367y.f345386f = listener;
    }

    @Override // ui1.z
    /* renamed from: setPositiveButtonText */
    public void mo2038xd611ee5a(java.lang.String str) {
        if (str != null) {
            this.f345353h.setText(str);
        }
    }

    @Override // ui1.z
    /* renamed from: setRequestDesc */
    public void mo2039xb4c13ffe(java.lang.String str) {
        this.f345355m.setText(str);
    }

    @Override // ui1.z
    /* renamed from: setScope */
    public void mo2040x53aeff12(java.lang.String scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f345368z = scope;
    }

    @Override // ui1.z
    /* renamed from: setSelectListItem */
    public void mo2041x3f8132ef(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.List list2 = this.A;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        this.f345367y.m8146xced61ae5();
        this.f345359q.setVisibility(0);
        android.view.View view = this.f345364v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ui1.z
    /* renamed from: setSimpleDetailDesc */
    public void mo2042x364e0e56(java.lang.String str) {
        if (str != null) {
            android.widget.TextView textView = this.f345356n;
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // fl1.e2
    /* renamed from: setUserAgreementCheckBoxWording */
    public void mo2015xf085c78(java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        this.f345363u.mo2015xf085c78(wording);
    }

    @Override // fl1.e2
    /* renamed from: setUserAgreementCheckedAlertListener */
    public void mo2016x99ddcea6(fl1.j2 j2Var) {
        this.f345363u.f345395o = j2Var;
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        s(this.C);
        this.f345365w = g2Var;
        java.lang.Object systemService = getContext().getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f345325a;
            android.content.Context context = this.f345350e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i2Var.a(context, this.f345350e, this.f345362t, windowManager.getDefaultDisplay().getRotation(), this.f345349d, this.f345363u.c());
            e(windowManager.getDefaultDisplay().getRotation());
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        fl1.i2 i2Var = fl1.i2.f345325a;
        android.content.Context context = this.f345350e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        i2Var.a(context, this.f345350e, this.f345362t, i17, this.f345349d, this.f345363u.c());
        e(i17);
    }
}
