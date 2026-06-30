package ri2;

/* loaded from: classes10.dex */
public final class j implements ri2.a {
    public p3325xe03a0797.p3326xc267989b.r2 A;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f477591a;

    /* renamed from: b, reason: collision with root package name */
    public final bg2.k f477592b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f477593c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f477594d;

    /* renamed from: e, reason: collision with root package name */
    public final int f477595e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f477596f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f477597g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f477598h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f477599i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f477600j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f477601k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f477602l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f477603m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f477604n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f477605o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f477606p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f477607q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f477608r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f477609s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f477610t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f477611u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f477612v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f477613w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f477614x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f477615y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f477616z;

    public j(android.view.View root, bg2.k controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f477591a = root;
        this.f477592b = controller;
        this.f477593c = "LiveFeedCommonBattleUICallback";
        this.f477594d = "finder_live_pk_fire_ball.pag";
        this.f477595e = (int) root.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd);
        this.f477596f = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eog);
        this.f477597g = root.findViewById(com.p314xaae8f345.mm.R.id.ep_);
        this.f477598h = root.findViewById(com.p314xaae8f345.mm.R.id.epc);
        this.f477599i = root.findViewById(com.p314xaae8f345.mm.R.id.eoy);
        this.f477600j = root.findViewById(com.p314xaae8f345.mm.R.id.eow);
        this.f477601k = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.eov);
        this.f477602l = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eox);
        this.f477603m = root.findViewById(com.p314xaae8f345.mm.R.id.eos);
        this.f477604n = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.eor);
        this.f477605o = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eot);
        this.f477606p = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) root.findViewById(com.p314xaae8f345.mm.R.id.epb);
        this.f477607q = root.findViewById(com.p314xaae8f345.mm.R.id.epe);
        this.f477608r = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.epg);
        this.f477609s = root.findViewById(com.p314xaae8f345.mm.R.id.epf);
        this.f477610t = root.findViewById(com.p314xaae8f345.mm.R.id.f566101ep2);
        this.f477611u = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.ep8);
        this.f477612v = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f566104ep5);
        this.f477613w = root.findViewById(com.p314xaae8f345.mm.R.id.f566102ep3);
        this.f477614x = root.findViewById(com.p314xaae8f345.mm.R.id.ep6);
        this.f477615y = root.findViewById(com.p314xaae8f345.mm.R.id.epd);
        this.f477616z = root.findViewById(com.p314xaae8f345.mm.R.id.epc);
        int i17 = com.p314xaae8f345.mm.ui.bl.b(root.getContext()).x / 2;
        android.view.View view = this.f477600j;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(((i17 * 7) / 25) + i17);
        }
        android.view.View view2 = this.f477603m;
        java.lang.Object layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.setMarginStart(i17 + ((i17 * 7) / 25));
        }
        d92.f fVar = d92.f.f309003a;
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        float d17 = fVar.d(context, 11.0f, false);
        android.widget.TextView textView = this.f477611u;
        if (textView != null) {
            textView.setTextSize(1, d17);
        }
        android.widget.TextView textView2 = this.f477612v;
        if (textView2 != null) {
            textView2.setTextSize(1, d17);
        }
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        float d18 = fVar.d(context2, 12.6f, false);
        android.widget.TextView textView3 = this.f477608r;
        if (textView3 != null) {
            textView3.setTextSize(1, d18);
        }
        android.widget.TextView textView4 = this.f477596f;
        if (textView4 != null) {
            textView4.setTextSize(1, 28.0f);
        }
        zl2.r4.f555483a.b3(this.f477596f);
    }

    public final java.lang.Long a() {
        java.lang.Object obj;
        dk2.u4 f76 = this.f477592b.f7();
        if (f76 == null) {
            return null;
        }
        if (f76.f315693g != 2) {
            zy2.a aVar = (zy2.a) kz5.n0.Z(this.f477592b.c7());
            km2.k c17 = f76.c(aVar != null ? aVar.f558868b : null);
            if (c17 != null) {
                return java.lang.Long.valueOf(f76.f315694h == 1 ? c17.f390655i : c17.f390649c);
            }
            return null;
        }
        for (r45.r22 r22Var : f76.f315696j) {
            java.util.LinkedList m75941xfb821914 = r22Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
            synchronized (m75941xfb821914) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj).m75945x2fec8307(0), this.f477592b.f101765s)) {
                        break;
                    }
                }
            }
            if (obj == null) {
                return f76.f315694h == 1 ? java.lang.Long.valueOf(r22Var.m75942xfb822ef2(3)) : java.lang.Long.valueOf(r22Var.m75942xfb822ef2(1));
            }
        }
        return null;
    }

    public final java.lang.Long b() {
        java.lang.Object obj;
        dk2.u4 f76 = this.f477592b.f7();
        if (f76 == null) {
            return null;
        }
        if (f76.f315693g != 2) {
            km2.k e17 = f76.e(this.f477592b.f101765s);
            if (e17 != null) {
                return java.lang.Long.valueOf(f76.f315694h == 1 ? e17.f390655i : e17.f390649c);
            }
            return null;
        }
        for (r45.r22 r22Var : f76.f315696j) {
            java.util.LinkedList m75941xfb821914 = r22Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
            synchronized (m75941xfb821914) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj).m75945x2fec8307(0), this.f477592b.f101765s)) {
                        break;
                    }
                }
            }
            if (obj != null) {
                return f76.f315694h == 1 ? java.lang.Long.valueOf(r22Var.m75942xfb822ef2(3)) : java.lang.Long.valueOf(r22Var.m75942xfb822ef2(1));
            }
        }
        return null;
    }

    public final void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        bg2.k kVar = this.f477592b;
        kVar.f101766t = str2;
        kVar.getClass();
        android.widget.ImageView imageView = this.f477604n;
        if (imageView != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.a().c(new mn2.n(str, null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
        }
        android.widget.TextView textView = this.f477605o;
        if (textView != null) {
            textView.setText(str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f477593c, "loadOtherUserInfo headUrl:" + str + " username:" + str2 + " nickname:" + str3 + " sdkUserId:" + str4);
    }

    public void d(int i17) {
        android.view.View view = this.f477591a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r21 = this;
            r0 = r21
            bg2.k r1 = r0.f477592b
            int r2 = r1.d7()
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L1f
            dk2.u4 r2 = r1.f7()
            if (r2 == 0) goto L19
            int r2 = r2.f315693g
            r5 = 2
            if (r2 != r5) goto L19
            r2 = r3
            goto L1a
        L19:
            r2 = r4
        L1a:
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r2 = r4
            goto L20
        L1f:
            r2 = r3
        L20:
            r5 = 8
            if (r2 == 0) goto L81
            xi2.g r1 = r1.e7()
            if (r1 == 0) goto L31
            int r1 = r1.mo140755x61f71b08()
            if (r1 != r5) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            if (r3 == 0) goto L81
            android.view.View r1 = r0.f477597g
            if (r1 != 0) goto L3a
            goto Lcc
        L3a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r7 = r2.toArray()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback"
            java.lang.String r9 = "showPkBarGroup"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            yj0.a.d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback"
            java.lang.String r8 = "showPkBarGroup"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r1
            yj0.a.f(r6, r7, r8, r9, r10, r11, r12)
            goto Lcc
        L81:
            android.view.View r1 = r0.f477597g
            if (r1 != 0) goto L86
            goto Lcc
        L86:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r14 = r2.toArray()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback"
            java.lang.String r16 = "showPkBarGroup"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            yj0.a.d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback"
            java.lang.String r15 = "showPkBarGroup"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r13 = r1
            yj0.a.f(r13, r14, r15, r16, r17, r18, r19)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ri2.j.e():void");
    }

    public final void f(java.lang.Long l17, java.lang.Long l18, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f477593c, "updateBattleBar: selfWecoinHot:" + l17 + " otherWecoinHot:" + l18 + " needInit:" + z17);
        android.view.View view = this.f477597g;
        if (view != null) {
            view.post(new ri2.i(this, l17, l18, z17));
        }
    }
}
