package lr;

/* loaded from: classes13.dex */
public final class j1 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final ir.h f402071f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f402072g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f402073h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f402074i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f402075m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f402076n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f402077o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f402078p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f402079q;

    /* renamed from: r, reason: collision with root package name */
    public final int f402080r;

    /* renamed from: s, reason: collision with root package name */
    public r45.v75 f402081s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.view.View itemView, lr.k0 k0Var, ir.h hVar) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f402071f = hVar;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565737dd3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f402072g = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565734dd0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f402073h = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.plm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f402074i = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.dcz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f402075m = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565735dd1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f402076n = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565736dd2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f402077o = findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.lr7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f402078p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.p314xaae8f345.mm.R.id.lo9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f402079q = (android.widget.ImageView) findViewById8;
        this.f402080r = i65.a.b(itemView.getContext(), 12);
        itemView.setOnClickListener(null);
        findViewById2.setOnClickListener(new lr.g1(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if ((k() || j()) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0184  */
    @Override // lr.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(ir.u0 r20) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.j1.i(ir.u0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r4 = this;
            r45.v75 r0 = r4.f402081s
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f469497d
            if (r3 != 0) goto Lc
            r3 = r1
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r3 != 0) goto L56
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.f469503m
            if (r0 == 0) goto L22
            int r0 = r0.length()
            if (r0 <= 0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            if (r0 != r1) goto L22
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 == 0) goto L56
            r45.v75 r0 = r4.f402081s
            if (r0 == 0) goto L3a
            java.lang.String r0 = r0.f469500g
            if (r0 == 0) goto L3a
            int r0 = r0.length()
            if (r0 <= 0) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 != r1) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 == 0) goto L56
            r45.v75 r0 = r4.f402081s
            if (r0 == 0) goto L52
            java.lang.String r0 = r0.f469502i
            if (r0 == 0) goto L52
            int r0 = r0.length()
            if (r0 <= 0) goto L4d
            r0 = r1
            goto L4e
        L4d:
            r0 = r2
        L4e:
            if (r0 != r1) goto L52
            r0 = r1
            goto L53
        L52:
            r0 = r2
        L53:
            if (r0 == 0) goto L56
            goto L57
        L56:
            r1 = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.j1.j():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            r4 = this;
            r45.v75 r0 = r4.f402081s
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f469497d
            if (r3 != 0) goto Lc
            r3 = r1
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r3 != 0) goto L3e
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.f469498e
            if (r0 == 0) goto L22
            int r0 = r0.length()
            if (r0 <= 0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            if (r0 != r1) goto L22
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 == 0) goto L3e
            r45.v75 r0 = r4.f402081s
            if (r0 == 0) goto L3a
            java.lang.String r0 = r0.f469499f
            if (r0 == 0) goto L3a
            int r0 = r0.length()
            if (r0 <= 0) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 != r1) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 == 0) goto L3e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.j1.k():boolean");
    }

    public final void l() {
        ir.r rVar;
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        android.widget.ImageView imageView = this.f402079q;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f402078p;
        android.widget.TextView textView = this.f402075m;
        android.widget.ImageView imageView2 = this.f402076n;
        if (n17) {
            if (k() || j()) {
                r45.v75 v75Var = this.f402081s;
                if (v75Var != null) {
                    java.lang.String str = v75Var.f469500g;
                    boolean z17 = str != null && str.length() > 0;
                    textView.setVisibility(0);
                    imageView.setVisibility(textView.getVisibility());
                    textView.setText(z17 ? v75Var.f469503m : v75Var.f469498e);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(v75Var.f469498e);
                    android.view.View view = this.f402073h;
                    sb6.append(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bur));
                    view.setContentDescription(sb6.toString());
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    android.widget.TextView textView2 = this.f402072g;
                    sb7.append(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572640by3));
                    ir.i0 i0Var = (ir.i0) this.f402114e;
                    sb7.append((i0Var == null || (rVar = i0Var.f375399b) == null) ? null : rVar.e());
                    textView2.setContentDescription(sb7.toString());
                    imageView2.setVisibility(0);
                    imageView2.setImageDrawable(null);
                    n11.a b17 = n11.a.b();
                    java.lang.String str2 = z17 ? v75Var.f469502i : v75Var.f469499f;
                    o11.f fVar = new o11.f();
                    fVar.f423610a = true;
                    fVar.f423611b = true;
                    fVar.f423629t = true;
                    b17.h(str2, imageView2, fVar.a());
                    ir.i0 i0Var2 = (ir.i0) this.f402114e;
                    if (i0Var2 != null && i0Var2.f375401d) {
                        android.view.View view2 = this.f402077o;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "updateDesignerInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "updateDesignerInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View view3 = this.f402077o;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "updateDesignerInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "updateDesignerInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (z17) {
                        c22699x3dcdb352.setVisibility(0);
                        return;
                    } else {
                        c22699x3dcdb352.setVisibility(8);
                        return;
                    }
                }
                return;
            }
        }
        imageView2.setImageDrawable(null);
        imageView2.setVisibility(8);
        textView.setVisibility(8);
        android.view.View view4 = this.f402077o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "updateDesignerInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "updateDesignerInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22699x3dcdb352.setVisibility(8);
        imageView.setVisibility(8);
    }
}
