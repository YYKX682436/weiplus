package zo1;

/* loaded from: classes5.dex */
public final class k4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements io1.c {

    /* renamed from: i, reason: collision with root package name */
    public static android.text.style.TextAppearanceSpan f556201i = new android.text.style.TextAppearanceSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30868x68b1db1.f576039yc);

    /* renamed from: m, reason: collision with root package name */
    public static final zo1.y3 f556202m = new zo1.y3();

    /* renamed from: n, reason: collision with root package name */
    public static android.text.style.TextAppearanceSpan f556203n = new android.text.style.TextAppearanceSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30868x68b1db1.f576038yb);

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f556204o;

    /* renamed from: p, reason: collision with root package name */
    public static final zo1.z3 f556205p;

    /* renamed from: d, reason: collision with root package name */
    public zo1.a4 f556206d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f556207e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public long f556208f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f556209g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f556210h = -1;

    static {
        new android.graphics.PorterDuffColorFilter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833), android.graphics.PorterDuff.Mode.SRC_IN);
        f556204o = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.mvc);
        f556205p = new zo1.z3();
    }

    public final void B(long j17) {
        long j18 = this.f556210h;
        if (j17 != j18) {
            if (j18 >= 0) {
                this.f556209g = j18;
            }
            if (j17 >= 0) {
                this.f556208f = j17;
            }
        }
        this.f556210h = j17;
    }

    public final void E(zo1.b4 b4Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var) {
        if (n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_DELETING) {
            jz5.l a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174101a.a(gVar.f297362d);
            if ((a17 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a) a17.f384366d : null) != com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a.f174094e) {
                b4Var.f556092h.setAlpha(1.0f);
                b4Var.f556092h.m53988x1c0e2c9f(false);
                return;
            }
        }
        b4Var.f556092h.setAlpha(0.5f);
        b4Var.f556092h.m53988x1c0e2c9f(true);
    }

    @Override // io1.c
    public void P5(qo1.f0 task, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        pm0.v.X(new zo1.h4(this, task, f17));
    }

    @Override // io1.c
    public void V1(qo1.j0 task, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        pm0.v.X(new zo1.i4(this, task, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(task.a()), state, error));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f556207e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.duu, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        zo1.b4 b4Var = new zo1.b4(inflate);
        inflate.setTag(b4Var);
        zo1.c4 c4Var = new zo1.c4(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12860xe75b74ec c12860xe75b74ec = b4Var.f556093i;
        c12860xe75b74ec.m54008xd93940fc(c4Var);
        c12860xe75b74ec.f174291w = b4Var;
        c12860xe75b74ec.setOnClickListener(null);
        b4Var.f556088d.setOnClickListener(new zo1.d4(b4Var, this));
        android.widget.TextView textView = b4Var.f556090f;
        textView.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView.getPaint().setStrokeWidth(1.25f);
        b4Var.f556094m.setOnClickListener(new zo1.e4(b4Var, this));
        b4Var.f556095n.setOnClickListener(new zo1.f4(b4Var, this));
        b4Var.f556096o.setOnClickListener(new zo1.g4(b4Var, this));
        return b4Var;
    }

    public final void x(long j17) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "expand package by id=" + j17);
        java.util.Iterator it = this.f556207e.iterator();
        int i18 = 0;
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else {
                if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d == j17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectPackageUI", "Fail to get package by id=" + j17);
            return;
        }
        java.util.Iterator it6 = this.f556207e.iterator();
        int i19 = 0;
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it6.next()).f297362d == this.f556210h) {
                i17 = i19;
                break;
            }
            i19++;
        }
        B(j17);
        if (i17 >= 0) {
            m8147xed6e4d18(i17);
        }
        m8147xed6e4d18(i18);
        zo1.a4 a4Var = this.f556206d;
        if (a4Var != null) {
            ((zo1.r4) a4Var).a(i18);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(zo1.b4 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f556207e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "onBindViewHolder pkgId=" + gVar.f297362d + ", option=" + gVar.f297368m);
        po1.c cVar = po1.d.f438827i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = gVar.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        po1.d a17 = cVar.a(uVar);
        java.lang.String a18 = go1.d.f355477a.a(gVar);
        android.text.SpannableString spannableString = new android.text.SpannableString(a18);
        spannableString.setSpan(f556201i, 0, a18.length(), 33);
        android.widget.TextView textView = holder.f556090f;
        textView.setText(spannableString);
        if ((gVar.f297368m & 1) != 0) {
            textView.append(" ");
            java.lang.String str = f556204o;
            android.text.SpannableString spannableString2 = new android.text.SpannableString(str);
            spannableString2.setSpan(f556203n, 0, str.length(), 33);
            spannableString2.setSpan(f556205p, 0, str.length(), 33);
            spannableString2.setSpan(f556202m, 0, str.length(), 33);
            textView.append(spannableString2);
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int ordinal = a17.f438829b.ordinal();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f556089e;
        if (ordinal == 0 || ordinal == 1) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80080x185fe337);
        } else if (ordinal != 2) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80343xde51652c);
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80343xde51652c);
        }
        qo1.j0 d17 = qo1.j1.f447056a.d(gVar.f297362d);
        jz5.l d18 = d17.d();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0) d18.f384366d;
        qo1.i0 i0Var = (qo1.i0) d18.f384367e;
        long j17 = this.f556210h;
        long j18 = gVar.f297362d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12857x9f527e91 c12857x9f527e91 = holder.f556092h;
        if (j17 == j18) {
            c12857x9f527e91.setVisibility(0);
            holder.f556093i.x(gVar, d17, n0Var, i0Var, true);
            E(holder, gVar, n0Var);
        } else {
            c12857x9f527e91.setVisibility(8);
            holder.f556093i.x(gVar, d17, n0Var, i0Var, false);
        }
        int mo1894x7e414b06 = mo1894x7e414b06();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = holder.f556091g;
        if (mo1894x7e414b06 == 1) {
            c22699x3dcdb3522.setVisibility(8);
            this.f556208f = -1L;
            this.f556209g = -1L;
            return;
        }
        c22699x3dcdb3522.setVisibility(0);
        long j19 = this.f556208f;
        long j27 = gVar.f297362d;
        if (j19 == j27) {
            this.f556208f = -1L;
            android.view.ViewPropertyAnimator animate = c22699x3dcdb3522.animate();
            animate.cancel();
            c22699x3dcdb3522.setRotation(0.0f);
            animate.rotation(180.0f);
            animate.setDuration(300L);
            animate.start();
            return;
        }
        if (this.f556209g != j27) {
            c22699x3dcdb3522.setRotation(this.f556210h != j27 ? 0.0f : 180.0f);
            return;
        }
        this.f556209g = -1L;
        android.view.ViewPropertyAnimator animate2 = c22699x3dcdb3522.animate();
        animate2.cancel();
        c22699x3dcdb3522.setRotation(180.0f);
        animate2.rotation(0.0f);
        animate2.setDuration(300L);
        animate2.start();
    }

    public final void z(long j17) {
        java.util.Iterator it = this.f556207e.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d == j17) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 >= 0) {
            this.f556207e.remove(i17);
            m8155x27702c4(i17);
            if (this.f556207e.size() == 1) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                zo1.j4 j4Var = new zo1.j4(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(j4Var, 150L, false);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        zo1.b4 holder = (zo1.b4) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "onBindViewHolder, payload.size = " + payloads.size());
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
            return;
        }
        java.lang.Object obj = this.f556207e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj;
        for (java.lang.Object obj2 : payloads) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            java.util.List list = (java.util.List) obj2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "onBindViewHolder, notifyType=" + list.get(0));
            java.lang.Object obj3 = list.get(0);
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12860xe75b74ec c12860xe75b74ec = holder.f556093i;
            if (b17) {
                java.lang.Object obj4 = list.get(2);
                qo1.f0 f0Var = obj4 instanceof qo1.f0 ? (qo1.f0) obj4 : null;
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectPackageUI", "onBindViewHolder with payloads, Fail to get task by pkgId=" + gVar.f297362d);
                    return;
                } else {
                    java.lang.Object obj5 = list.get(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.Float");
                    c12860xe75b74ec.u(((java.lang.Float) obj5).floatValue(), f0Var);
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, 0)) {
                boolean z17 = this.f556210h == gVar.f297362d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12860xe75b74ec c12860xe75b74ec2 = holder.f556093i;
                java.lang.Object obj6 = list.get(3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj6, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.task.IRoamTask");
                qo1.j0 j0Var = (qo1.j0) obj6;
                java.lang.Object obj7 = list.get(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj7, "null cannot be cast to non-null type com.tencent.wechat.aff.affroam.AffRoamTaskState");
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0) obj7;
                java.lang.Object obj8 = list.get(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj8, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.task.IRoamTask.ErrorType");
                c12860xe75b74ec2.x(gVar, j0Var, n0Var, (qo1.i0) obj8, z17);
                if (z17) {
                    java.lang.Object obj9 = list.get(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj9, "null cannot be cast to non-null type com.tencent.wechat.aff.affroam.AffRoamTaskState");
                    E(holder, gVar, (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0) obj9);
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, 2)) {
                if (this.f556210h != gVar.f297362d) {
                    return;
                }
                java.lang.Object obj10 = list.get(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj10, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((java.lang.Float) obj10).floatValue();
                if (c12860xe75b74ec.f174294z) {
                    c12860xe75b74ec.f529422g.m82049x3ae760af((int) (floatValue * 100));
                } else {
                    c12860xe75b74ec.f174292x.m54003x765074af(c12860xe75b74ec.B + ' ' + ((int) (floatValue * 100)) + '%');
                }
            } else {
                mo864xe5e2e48d(holder, i17);
            }
        }
    }
}
