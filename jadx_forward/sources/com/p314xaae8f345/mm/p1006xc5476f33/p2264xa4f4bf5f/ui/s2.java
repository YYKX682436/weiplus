package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public class s2 implements bi4.i0, android.view.View.OnClickListener, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f255792d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f255793e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f255794f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f255795g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f255796h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f255797i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f255798m;

    /* renamed from: n, reason: collision with root package name */
    public mj4.h f255799n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f255800o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f255801p;

    /* renamed from: q, reason: collision with root package name */
    public final cj4.k1 f255802q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f255803r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f255804s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f255805t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f255806u;

    /* renamed from: v, reason: collision with root package name */
    public final bi4.m0 f255807v;

    /* renamed from: w, reason: collision with root package name */
    public long f255808w;

    /* renamed from: x, reason: collision with root package name */
    public long f255809x;

    public s2(android.content.Context context, android.widget.RelativeLayout rootLayout, android.widget.LinearLayout headerRoot, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootLayout, "rootLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerRoot, "headerRoot");
        this.f255792d = rootLayout;
        this.f255793e = headerRoot;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571098d01, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f255794f = inflate;
        this.f255796h = context;
        this.f255803r = new java.util.HashMap();
        bi4.k1 k1Var = new bi4.k1();
        k1Var.q(true);
        k1Var.f102601h = false;
        k1Var.f102600g = 4;
        cj4.a0 a0Var = new cj4.a0(k1Var);
        this.f255802q = a0Var;
        a0Var.i(inflate);
        a0Var.f123502z1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.o2(this);
        this.f255795g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oq8);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.b0s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f255798m = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.opx);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h5z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.om8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.hxj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.onw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.hwc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f255800o = findViewById6;
        this.f255801p = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ope);
        imageView.setOutlineProvider(new bk4.e2(true, true, i65.a.a(context, 10.0f)));
        imageView.setClipToOutline(true);
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        uj4.e eVar = (uj4.e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(uj4.e.class);
        if (eVar != null) {
            eVar.f509951e = new java.lang.ref.WeakReference(this);
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        java.lang.String l17 = o13.n.l(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getUnsignedMd5UInt(...)");
        this.f255805t = l17;
        this.f255806u = "";
        this.f255807v = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.r2(this, context);
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.ProfileCardView", "updateByStatusId: failed");
            return;
        }
        mj4.h t17 = ai4.m0.f86706a.G().t(str);
        if (t17 != null) {
            g(((mj4.k) t17).o(), t17);
        }
        ((cj4.i1) this.f255802q).A1 = this.f255807v;
    }

    @Override // bi4.n0
    public void S5(long j17) {
        long c17 = c01.id.c();
        long j18 = this.f255808w;
        long j19 = c17 - j18;
        qj4.s.m(qj4.s.f445491a, this.f255796h, 2L, null, null, j17, (j19 < 0 || j18 == 0) ? 0L : j19, 0L, 0L, null, null, 0L, 1996, null);
    }

    @Override // bi4.i0
    public void W(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.ProfileCardView", "forceHideCardView: " + z17);
        this.f255804s = z17;
        if (z17) {
            android.view.View view = this.f255794f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/ProfileCardView", "forceHideCardView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView", "forceHideCardView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f255794f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/ProfileCardView", "forceHideCardView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView", "forceHideCardView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // bi4.q0
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void b(int i17) {
        this.f255802q.getClass();
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return;
        }
        g(str, ai4.m0.f86706a.M(str));
        ((cj4.i1) this.f255802q).A1 = this.f255807v;
    }

    @Override // bi4.q0
    public void c() {
    }

    @Override // bi4.q0
    public void d() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void e() {
        this.f255802q.getClass();
    }

    public final void f() {
        if (!android.text.TextUtils.equals(this.f255797i, en1.a.a()) && h()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (java.lang.Math.abs(currentTimeMillis - this.f255809x) < 1000) {
                return;
            }
            this.f255809x = currentTimeMillis;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r38, mj4.h r39) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.s2.g(java.lang.String, mj4.h):void");
    }

    @Override // bi4.n0
    /* renamed from: getView */
    public android.view.View mo10628xfb86a31b() {
        return this.f255794f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r0.l() == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r4) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r9 = this;
            mj4.h r0 = r9.f255799n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = r9.f255797i
            if (r2 != 0) goto Lb
            return r1
        Lb:
            mj4.k r0 = (mj4.k) r0
            mj4.a r2 = r0.f408600b
            int r3 = r2.f76525x91a52c19
            java.lang.String r4 = "thumb"
            bk4.n r5 = bk4.n.f103046a
            r6 = 1
            if (r3 == r6) goto L71
            r7 = 2
            if (r3 == r7) goto L44
            cj4.k1 r0 = r9.f255802q
            r3 = r0
            cj4.i1 r3 = (cj4.i1) r3
            bi4.h0 r3 = r3.d()
            if (r3 == 0) goto L2f
            boolean r3 = r3.j()
            if (r3 != r6) goto L2f
            r3 = r6
            goto L30
        L2f:
            r3 = r1
        L30:
            if (r3 == 0) goto Lb7
            cj4.i1 r0 = (cj4.i1) r0
            bi4.h0 r0 = r0.d()
            if (r0 == 0) goto L41
            boolean r0 = r0.l()
            if (r0 != r6) goto L41
        L40:
            r1 = r6
        L41:
            r6 = r1
            goto Lb7
        L44:
            java.lang.String r3 = r0.l()
            java.lang.String r7 = r0.i()
            java.lang.String r3 = r5.g(r4, r3, r7)
            java.lang.String r4 = r0.i()
            boolean r4 = r26.n0.N(r4)
            if (r4 == 0) goto L5c
            r4 = r6
            goto L5d
        L5c:
            r4 = r1
        L5d:
            if (r4 != 0) goto Lb7
            java.lang.String r0 = r0.j()
            boolean r0 = r26.n0.N(r0)
            if (r0 == 0) goto L6a
            r1 = r6
        L6a:
            if (r1 != 0) goto Lb7
            boolean r6 = com.p314xaae8f345.mm.vfs.w6.j(r3)
            goto Lb7
        L71:
            java.lang.String r3 = r0.l()
            java.lang.String r7 = r0.i()
            java.lang.String r3 = r5.g(r4, r3, r7)
            java.lang.String r4 = r0.l()
            java.lang.String r7 = r0.j()
            java.lang.String r8 = "image"
            java.lang.String r4 = r5.g(r8, r4, r7)
            java.lang.String r5 = r0.i()
            boolean r5 = r26.n0.N(r5)
            if (r5 == 0) goto L98
            r5 = r6
            goto L99
        L98:
            r5 = r1
        L99:
            if (r5 != 0) goto Lb7
            java.lang.String r0 = r0.j()
            boolean r0 = r26.n0.N(r0)
            if (r0 == 0) goto La7
            r0 = r6
            goto La8
        La7:
            r0 = r1
        La8:
            if (r0 != 0) goto Lb7
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r3)
            if (r0 == 0) goto L41
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r4)
            if (r0 == 0) goto L41
            goto L40
        Lb7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isCanRef:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = " mtpe:"
            r0.append(r1)
            int r1 = r2.f76525x91a52c19
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.TextStatus.ProfileCardView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.s2.h():boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void j(int i17) {
        this.f255802q.getClass();
    }

    @Override // bi4.n0
    /* renamed from: onBackPressed */
    public void mo10629xbdc3c5dc() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/ProfileCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.o4w) {
            f();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.ope && ai4.m0.f86706a.M(this.f255797i) != null) {
            bi4.d1 d1Var = new bi4.d1();
            d1Var.f436474h = this.f255805t;
            d1Var.f436473g = false;
            d1Var.f436482s = 2;
            d1Var.f436483t = this.f255797i;
            mj4.h hVar = this.f255799n;
            d1Var.E = hVar != null ? ((mj4.k) hVar).l() : null;
            d1Var.f436473g = true;
            d1Var.f436475i = 13L;
            pj4.b0 b0Var = d1Var.f436470d;
            pj4.o0 o0Var = b0Var != null ? b0Var.f436508g : null;
            if (o0Var != null) {
                mj4.h hVar2 = this.f255799n;
                o0Var.f436747e = hVar2 != null ? ((mj4.k) hVar2).h() : null;
            }
            bi4.o1.f102608a.a(this.f255796h, d1Var, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPostClose */
    public void mo14951x73fef619() {
        ((cj4.a0) this.f255802q).mo14951x73fef619();
        android.widget.TextView textView = this.f255801p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = this.f255798m;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (((((mj4.k) r10).s() & 4) != 0) == true) goto L37;
     */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPostOpen */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo14952xd2370609(boolean r10) {
        /*
            r9 = this;
            cj4.k1 r0 = r9.f255802q
            cj4.a0 r0 = (cj4.a0) r0
            r0.mo14952xd2370609(r10)
            di4.i r10 = di4.i.f314315a
            jz5.g r10 = di4.i.f314319e
            jz5.n r10 = (jz5.n) r10
            java.lang.Object r10 = r10.mo141623x754a37bb()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r0 = 0
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L1d
            goto L72
        L1d:
            mj4.h r10 = r9.f255799n
            if (r10 == 0) goto L29
            mj4.k r10 = (mj4.k) r10
            java.lang.String r10 = r10.o()
            r4 = r10
            goto L2a
        L29:
            r4 = r2
        L2a:
            mj4.h r10 = r9.f255799n
            if (r10 == 0) goto L36
            mj4.k r10 = (mj4.k) r10
            java.lang.String r10 = r10.l()
            r5 = r10
            goto L37
        L36:
            r5 = r2
        L37:
            mj4.h r10 = r9.f255799n
            if (r10 == 0) goto L72
            if (r5 == 0) goto L46
            boolean r10 = r26.n0.N(r5)
            if (r10 == 0) goto L44
            goto L46
        L44:
            r10 = r0
            goto L47
        L46:
            r10 = r1
        L47:
            if (r10 == 0) goto L4a
            goto L72
        L4a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "onPostOpen do markReadByStatusId by switch, userName="
            r10.<init>(r3)
            r10.append(r4)
            java.lang.String r3 = ", statusId="
            r10.append(r3)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            java.lang.String r3 = "MicroMsg.TextStatus.ProfileCardView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r10)
            ai4.m0 r10 = ai4.m0.f86706a
            si4.a r3 = r10.G()
            r6 = 0
            r7 = 4
            r8 = 0
            si4.a.k(r3, r4, r5, r6, r7, r8)
        L72:
            java.lang.String r10 = r9.f255797i
            java.lang.String r3 = en1.a.a()
            boolean r10 = android.text.TextUtils.equals(r10, r3)
            if (r10 != 0) goto Laa
            boolean r10 = r9.h()
            if (r10 == 0) goto Laa
            mj4.h r10 = r9.f255799n
            if (r10 == 0) goto L9d
            mj4.k r10 = (mj4.k) r10
            long r3 = r10.s()
            r5 = 4
            long r3 = r3 & r5
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 == 0) goto L99
            r10 = r1
            goto L9a
        L99:
            r10 = r0
        L9a:
            if (r10 != r1) goto L9d
            goto L9e
        L9d:
            r1 = r0
        L9e:
            if (r1 == 0) goto Laa
            android.widget.TextView r10 = r9.f255801p
            if (r10 != 0) goto La5
            goto Laa
        La5:
            r1 = 8
            r10.setVisibility(r1)
        Laa:
            android.widget.TextView r10 = r9.f255798m
            if (r10 != 0) goto Laf
            goto Lb2
        Laf:
            r10.setVisibility(r0)
        Lb2:
            ai4.m0 r10 = ai4.m0.f86706a
            si4.a r10 = r10.G()
            mj4.h r0 = r9.f255799n
            if (r0 == 0) goto Lc3
            mj4.k r0 = (mj4.k) r0
            java.lang.String r0 = r0.o()
            goto Lc4
        Lc3:
            r0 = r2
        Lc4:
            mj4.h r1 = r9.f255799n
            if (r1 == 0) goto Lce
            mj4.k r1 = (mj4.k) r1
            java.lang.String r2 = r1.l()
        Lce:
            r10.a(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.s2.mo14952xd2370609(boolean):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPreClose */
    public void mo14953x56608c14() {
        ((cj4.a0) this.f255802q).mo14953x56608c14();
        this.f255794f.setClickable(true);
        android.widget.RelativeLayout relativeLayout = this.f255792d;
        android.view.View findViewById = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.ovx);
        if (findViewById != null) {
            findViewById.setOnTouchListener(null);
        }
        relativeLayout.setOnTouchListener(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPreOpen */
    public void mo14954x3c9d44ae() {
        ((cj4.a0) this.f255802q).mo14954x3c9d44ae();
        this.f255794f.setClickable(false);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ej4.b) {
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            ((ej4.b) m1Var).getClass();
            d17.q(5293, this);
            if (i17 == 0 && i18 == 0) {
                return;
            }
            android.content.Context context = this.f255796h;
            db5.e1.s(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574893jv3), "");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void p() {
        this.f255802q.getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void q(int i17) {
        this.f255802q.getClass();
    }

    @Override // bi4.b1
    public void r(float f17, float f18, float f19) {
        ((cj4.a0) this.f255802q).r(f17, f18, f19);
    }

    @Override // bi4.n0
    public void v3(boolean z17) {
    }

    @Override // bi4.n0
    public void v5(boolean z17) {
    }
}
