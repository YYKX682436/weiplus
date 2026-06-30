package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class a2 {
    public static final java.lang.Object D = new java.lang.Object();
    public static int E;
    public java.lang.String A;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 f230798a;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f230803f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f230804g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 f230805h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f230806i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f230807j;

    /* renamed from: k, reason: collision with root package name */
    public qk.o9 f230808k;

    /* renamed from: l, reason: collision with root package name */
    public qk.s f230809l;

    /* renamed from: m, reason: collision with root package name */
    public bi3.b f230810m;

    /* renamed from: n, reason: collision with root package name */
    public ls0.n f230811n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f230812o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z1 f230813p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16556x73b8f72 f230814q;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f230816s;

    /* renamed from: y, reason: collision with root package name */
    public int f230822y;

    /* renamed from: z, reason: collision with root package name */
    public gi3.b f230823z;

    /* renamed from: b, reason: collision with root package name */
    public boolean f230799b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f230800c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f230801d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f230802e = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f230815r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f230817t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f230818u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f230819v = false;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f230820w = null;

    /* renamed from: x, reason: collision with root package name */
    public int f230821x = -1;
    public boolean B = false;
    public boolean C = true;

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var, boolean z17) {
        int width = a2Var.f230805h.getWidth();
        int height = a2Var.f230805h.getHeight();
        int b17 = i65.a.b(a2Var.f230807j, 20) + (a2Var.f230814q.getHeight() <= 0 ? i65.a.b(a2Var.f230807j, 95) : a2Var.f230814q.getHeight()) + i65.a.b(a2Var.f230807j, 12);
        if (com.p314xaae8f345.mm.ui.bl.f(a2Var.f230807j)) {
            b17 += com.p314xaae8f345.mm.ui.bl.c(a2Var.f230807j);
        }
        int i17 = height - b17;
        if (a2Var.f230805h.getBottom() + b17 < ai3.d.f(a2Var.f230807j).y) {
            i17 = (int) ((width - (i65.a.b(a2Var.f230807j, 32) * 2)) / (width / height));
        }
        float f17 = i17;
        float f18 = ((int) ((r0 / r1) * f17)) / width;
        float f19 = f17 / height;
        if (z17) {
            float f27 = -(b17 / 2.0f);
            a2Var.f230805h.animate().scaleX(f18).scaleY(f19).translationY(f27).setDuration(300L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b1(a2Var));
            a2Var.f230809l.animate().scaleX(f18).scaleY(f19).translationY(f27).setDuration(300L);
        } else {
            a2Var.f230805h.setScaleX(f18);
            a2Var.f230805h.setScaleY(f19);
            float f28 = -(b17 / 2.0f);
            a2Var.f230805h.setTranslationY(f28);
            a2Var.f230809l.setScaleX(f18);
            a2Var.f230809l.setScaleY(f19);
            a2Var.f230809l.setTranslationY(f28);
        }
        a2Var.f230809l.mo160422x2cadd325(false);
        a2Var.f230809l.mo160423x2f328115(false);
        a2Var.f230809l.mo160421xeaaa6c37(false);
        if (!a2Var.f230799b) {
            a2Var.f230798a.m66915x5dd7c812(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.v1(a2Var));
            a2Var.f230798a.m66916x13f495cb(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.w1(a2Var));
            a2Var.f230798a.f(a2Var.f230803f);
            a2Var.f230805h.mo69317x764cf626(true);
            a2Var.f230805h.mo69326x360a109e(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x1(a2Var));
            a2Var.f230799b = true;
        }
        a2Var.f230814q.setVisibility(0);
        a2Var.f230814q.bringToFront();
        a2Var.f230819v = true;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var, android.graphics.Bitmap bitmap) {
        if (a2Var.C) {
            s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.l1(a2Var, bitmap), "MMSightVideoEditor_remux");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "not need remux video!");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.m1(a2Var));
        }
    }

    public final void c() {
        this.f230805h.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(300L);
        this.f230814q.animate().alpha(0.0f).setDuration(100L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.c1(this));
        this.f230809l.mo160423x2f328115(true);
        this.f230809l.mo160422x2cadd325(true);
        this.f230809l.mo160421xeaaa6c37(true);
        this.f230809l.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(300L);
        this.f230819v = false;
    }

    public void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16556x73b8f72 c16556x73b8f72, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, boolean z17) {
        this.f230816s = c11120x15dce88d;
        if (c11120x15dce88d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightVideoEditor", "video trans para is null!!!");
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
            this.f230816s = c11120x15dce88d2;
            c11120x15dce88d2.f152728h = 10000;
        } else if (c11120x15dce88d.f152728h <= 0) {
            c11120x15dce88d.f152728h = 10000;
        }
        this.f230822y = i17;
        this.f230803f = str;
        this.f230814q = c16556x73b8f72;
        this.f230805h = c19745xad58a1a4;
        this.f230806i = viewGroup;
        this.f230807j = abstractActivityC21394xb3d2c0cf;
        this.f230818u = z17;
        this.f230823z = new gi3.b(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = c16556x73b8f72.f230792d;
        this.f230798a = c16538x58704dc4;
        c16538x58704dc4.m66917x824516f(this.f230816s);
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        rj.l lVar = new rj.l();
        this.f230808k = lVar;
        qk.l9 l9Var = new qk.l9();
        l9Var.f445765b = false;
        l9Var.f445766c = true;
        l9Var.f445764a = qk.n9.VIDEO;
        l9Var.f445769f = new android.graphics.Rect(this.f230805h.getLeft(), this.f230805h.getTop(), this.f230805h.getRight(), this.f230805h.getBottom());
        lVar.d(l9Var);
        qk.s c17 = this.f230808k.c(this.f230806i.getContext());
        this.f230809l = c17;
        c17.mo160420x1f31d20(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.n1(this));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
        if (com.p314xaae8f345.mm.ui.bl.f(this.f230807j)) {
            marginLayoutParams.height = ai3.d.j().y - java.lang.Math.max(com.p314xaae8f345.mm.ui.bl.c(this.f230807j), com.p314xaae8f345.mm.ui.bl.g(this.f230807j));
        }
        this.f230806i.addView(this.f230809l, marginLayoutParams);
        this.f230809l.m160424xbe8e76ed(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.o1(this));
        this.f230814q.m66977x7379a92e(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r1(this));
        this.f230814q.m66978x190f7a75(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.s1(this));
        if (this.f230818u) {
            this.f230814q.setVisibility(0);
            this.f230814q.bringToFront();
            this.f230814q.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t1(this));
        }
    }

    public void e() {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f230804g;
            if (b4Var != null) {
                b4Var.d();
                this.f230804g = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = this.f230798a;
            if (c16538x58704dc4 != null) {
                c16538x58704dc4.g();
            }
            qk.o9 o9Var = this.f230808k;
            if (o9Var != null) {
                o9Var.f();
            }
            android.view.ViewGroup viewGroup = this.f230806i;
            if (viewGroup != null) {
                viewGroup.removeView(this.f230809l);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16556x73b8f72 c16556x73b8f72 = this.f230814q;
            if (c16556x73b8f72 != null) {
                c16556x73b8f72.b();
            }
            this.f230799b = false;
            ei3.x.f334720d.c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightVideoEditor", e17, "release error: %s", e17.getMessage());
        }
    }

    public void f(boolean z17, java.lang.String str) {
        java.util.Stack e17;
        try {
            this.f230823z.f353810b = z17;
            qk.o9 o9Var = this.f230808k;
            if (o9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightVideoEditor", "[report] null == photoEditor");
                return;
            }
            f65.r rVar = (f65.r) o9Var.b();
            this.f230823z.f353813e = rVar.b();
            this.f230823z.f353814f = rVar.e();
            this.f230823z.f353817i = rVar.a();
            this.f230823z.f353816h = rVar.f();
            this.f230823z.f353818j = rVar.d();
            gi3.b bVar = this.f230823z;
            um.g gVar = (um.g) com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().c(dl.a.EMOJI_AND_TEXT);
            int i17 = 0;
            if (gVar != null && (e17 = gVar.e(true)) != null) {
                java.util.Iterator it = e17.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    xk0.f fVar = (xk0.f) it.next();
                    if (fVar instanceof xk0.p) {
                        xk0.p pVar = (xk0.p) fVar;
                        int[] iArr = dn5.c.D;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= 8) {
                                break;
                            }
                            if (pVar.A == iArr[i19]) {
                                i18 |= 1 << i19;
                                break;
                            }
                            i19++;
                        }
                    }
                }
                i17 = i18;
            }
            bVar.f353819k = i17;
            gi3.c.b(this.f230823z, str);
        } catch (java.lang.Exception unused) {
        }
    }
}
