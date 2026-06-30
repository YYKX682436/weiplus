package ku3;

/* loaded from: classes10.dex */
public final class s implements yt3.r2, android.view.View.OnClickListener {
    public android.util.Range A;
    public android.view.View B;
    public android.widget.TextView C;
    public int D;
    public boolean E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f393917d;

    /* renamed from: e, reason: collision with root package name */
    public final zt3.a f393918e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f393919f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f393920g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f393921h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f393922i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f393923m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f393924n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f393925o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f393926p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f393927q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f393928r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f393929s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f393930t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f393931u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f393932v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f393933w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashMap f393934x;

    /* renamed from: y, reason: collision with root package name */
    public float f393935y;

    /* renamed from: z, reason: collision with root package name */
    public float f393936z;

    public s(android.view.ViewGroup parent, ju3.d0 status, zt3.a kitContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        this.f393917d = parent;
        this.f393918e = kitContext;
        this.f393919f = jz5.h.b(new ku3.c(this));
        this.f393920g = jz5.h.b(new ku3.d(this));
        this.f393921h = jz5.h.b(new ku3.e(this));
        this.f393922i = jz5.h.b(new ku3.f(this));
        this.f393923m = jz5.h.b(new ku3.q(this));
        this.f393924n = jz5.h.b(new ku3.r(this));
        this.f393925o = jz5.h.b(new ku3.k(this));
        this.f393926p = jz5.h.b(new ku3.l(this));
        this.f393927q = jz5.h.b(new ku3.m(this));
        this.f393928r = jz5.h.b(new ku3.n(this));
        this.f393929s = jz5.h.b(new ku3.o(this));
        this.f393930t = jz5.h.b(new ku3.p(this));
        this.f393931u = jz5.h.b(new ku3.i(this));
        this.f393932v = jz5.h.b(new ku3.j(this));
        this.f393933w = i65.a.i(parent.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562458fj);
        this.f393934x = new java.util.HashMap();
    }

    public static final void a(ku3.s sVar, android.view.View view) {
        sVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "showIndicator", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "showIndicator", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.animate().alpha(1.0f).start();
    }

    public final android.view.View b() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393919f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393920g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View d() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393922i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final java.lang.String e() {
        if (this.f393936z % ((float) 1) == 0.0f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((int) this.f393936z);
            sb6.append('x');
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(this.f393936z);
        sb7.append('x');
        return sb7.toString();
    }

    public final android.view.View f() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393931u).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View g() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393925o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View h() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393927q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View i() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393929s).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View j() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393923m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void k() {
        android.view.View view = this.B;
        if (view != null) {
            view.setBackground(null);
        }
        java.lang.Float f17 = (java.lang.Float) this.f393934x.get(java.lang.Integer.valueOf(this.D));
        if (f17 != null) {
            android.widget.TextView textView = this.C;
            if (textView != null) {
                float floatValue = f17.floatValue();
                textView.setText(floatValue < 1.0f ? java.lang.String.valueOf(floatValue) : java.lang.String.valueOf((int) floatValue));
            }
            android.widget.TextView textView2 = this.C;
            if (textView2 == null) {
                return;
            }
            textView2.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r1.contains((android.util.Range) java.lang.Float.valueOf(r18.f393936z)) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r18 = this;
            r0 = r18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "showIndicatorFoldCenter >> "
            r1.<init>(r2)
            float r2 = r0.f393936z
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.CameraKitIndicatorPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            android.util.Range r1 = r0.A
            r2 = 0
            if (r1 == 0) goto L2b
            float r3 = r0.f393936z
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r1 = r1.contains(r3)
            r3 = 1
            if (r1 != r3) goto L2b
            goto L2c
        L2b:
            r3 = r2
        L2c:
            if (r3 == 0) goto Ld3
            jz5.g r1 = r0.f393921h
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            java.lang.String r3 = "getValue(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.n(r1)
            android.view.View r1 = r18.c()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r11.add(r3)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r4 = r11.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin"
            java.lang.String r6 = "showIndicatorFoldCenter"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setAlpha"
            java.lang.String r10 = "(F)V"
            r3 = r1
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r3 = r11.get(r2)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.setAlpha(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin"
            java.lang.String r5 = "showIndicatorFoldCenter"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setAlpha"
            java.lang.String r9 = "(F)V"
            r3 = r1
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            android.view.View r1 = r18.c()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.add(r4)
            java.util.Collections.reverse(r3)
            java.lang.Object[] r11 = r3.toArray()
            java.lang.String r12 = "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin"
            java.lang.String r13 = "showIndicatorFoldCenter"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            yj0.a.d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin"
            java.lang.String r12 = "showIndicatorFoldCenter"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            yj0.a.f(r10, r11, r12, r13, r14, r15, r16)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ku3.s.m():void");
    }

    public final void n(android.widget.TextView textView) {
        if (textView != null) {
            textView.setText(e());
            textView.setTypeface(android.graphics.Typeface.defaultFromStyle(this.f393936z >= 100.0f ? 0 : 1));
        }
    }

    public final void o() {
        int i17;
        java.util.HashMap hashMap = this.f393934x;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((java.lang.Number) entry.getValue()).floatValue() >= this.f393936z) {
                i17 = ((java.lang.Number) entry.getKey()).intValue();
                break;
            }
        }
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraKitIndicatorPlugin", "no find select type");
            return;
        }
        if (i17 == this.D) {
            n(this.C);
            return;
        }
        android.view.View view = this.B;
        if (view != null) {
            view.setBackground(null);
        }
        java.lang.Float f17 = (java.lang.Float) hashMap.get(java.lang.Integer.valueOf(this.D));
        if (f17 != null) {
            android.widget.TextView textView = this.C;
            if (textView != null) {
                float floatValue = f17.floatValue();
                textView.setText(floatValue < 1.0f ? java.lang.String.valueOf(floatValue) : java.lang.String.valueOf((int) floatValue));
            }
            android.widget.TextView textView2 = this.C;
            if (textView2 != null) {
                textView2.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
            }
        }
        this.D = i17;
        if (i17 == 1) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393924n).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            this.C = (android.widget.TextView) mo141623x754a37bb;
            this.B = j();
        } else if (i17 == 2) {
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f393926p).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            this.C = (android.widget.TextView) mo141623x754a37bb2;
            this.B = g();
        } else if (i17 == 3) {
            this.B = h();
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) this.f393928r).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            this.C = (android.widget.TextView) mo141623x754a37bb3;
        } else if (i17 == 4) {
            this.B = i();
            java.lang.Object mo141623x754a37bb4 = ((jz5.n) this.f393930t).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
            this.C = (android.widget.TextView) mo141623x754a37bb4;
        } else if (i17 == 5) {
            this.B = f();
            java.lang.Object mo141623x754a37bb5 = ((jz5.n) this.f393932v).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
            this.C = (android.widget.TextView) mo141623x754a37bb5;
        }
        android.view.View view2 = this.B;
        if (view2 != null) {
            view2.setBackground(this.f393933w);
        }
        n(this.C);
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        if (d().getVisibility() == 0 && this.E) {
            android.view.View d17 = d();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "resetIndicator", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "resetIndicator", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.F = false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        int id6 = v17.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.hca) {
            o();
            android.view.View c17 = c();
            c17.animate().alpha(0.0f).withEndAction(new ku3.a(c17)).start();
            android.view.View d17 = d();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(d17, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "showUnFoldIndicatorWithAni", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "showUnFoldIndicatorWithAni", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(d(), "scaleX", 0.0f, 1.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(d(), "alpha", 0.0f, 1.0f);
            this.f393935y = d().getWidth() / 2.0f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitIndicatorPlugin", "showUnFoldIndicatorWithAni >> " + this.f393935y);
            d().setPivotX(this.f393935y);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
        } else {
            java.util.HashMap hashMap = this.f393934x;
            android.graphics.drawable.Drawable drawable = this.f393933w;
            zt3.a aVar = this.f393918e;
            android.view.ViewGroup viewGroup = this.f393917d;
            if (id6 == com.p314xaae8f345.mm.R.id.mkb) {
                if (this.D != 1) {
                    java.lang.Float f17 = (java.lang.Float) hashMap.get(1);
                    if (f17 == null || !aVar.f557110e.g(f17.floatValue())) {
                        db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmk));
                    } else {
                        j().setBackground(drawable);
                        k();
                        this.D = 1;
                        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393924n).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                        this.C = (android.widget.TextView) mo141623x754a37bb;
                        this.B = j();
                        this.f393936z = f17.floatValue();
                        n(this.C);
                    }
                }
            } else if (id6 == com.p314xaae8f345.mm.R.id.mjm) {
                if (this.D != 2) {
                    java.lang.Float f18 = (java.lang.Float) hashMap.get(2);
                    if (f18 == null || !aVar.f557110e.g(f18.floatValue())) {
                        db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmk));
                    } else {
                        g().setBackground(drawable);
                        k();
                        this.D = 2;
                        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f393926p).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
                        this.C = (android.widget.TextView) mo141623x754a37bb2;
                        this.B = g();
                        this.f393936z = f18.floatValue();
                        n(this.C);
                    }
                }
            } else if (id6 == com.p314xaae8f345.mm.R.id.f568359mk5) {
                if (this.D != 3) {
                    java.lang.Float f19 = (java.lang.Float) hashMap.get(3);
                    if (f19 == null || !aVar.f557110e.g(f19.floatValue())) {
                        db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmk));
                    } else {
                        h().setBackground(drawable);
                        k();
                        this.D = 3;
                        java.lang.Object mo141623x754a37bb3 = ((jz5.n) this.f393928r).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
                        this.C = (android.widget.TextView) mo141623x754a37bb3;
                        this.B = h();
                        this.f393936z = f19.floatValue();
                        n(this.C);
                    }
                }
            } else if (id6 == com.p314xaae8f345.mm.R.id.mk8) {
                if (this.D != 4) {
                    java.lang.Float f27 = (java.lang.Float) hashMap.get(4);
                    if (f27 == null || !aVar.f557110e.g(f27.floatValue())) {
                        db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmk));
                    } else {
                        i().setBackground(drawable);
                        k();
                        this.D = 4;
                        java.lang.Object mo141623x754a37bb4 = ((jz5.n) this.f393930t).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
                        this.C = (android.widget.TextView) mo141623x754a37bb4;
                        this.B = i();
                        this.f393936z = f27.floatValue();
                        n(this.C);
                    }
                }
            } else if (id6 == com.p314xaae8f345.mm.R.id.f568347mj3 && this.D != 5) {
                java.lang.Float f28 = (java.lang.Float) hashMap.get(5);
                if (f28 == null || !aVar.f557110e.g(f28.floatValue())) {
                    db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmk));
                } else {
                    f().setBackground(drawable);
                    k();
                    this.D = 5;
                    java.lang.Object mo141623x754a37bb5 = ((jz5.n) this.f393932v).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
                    this.C = (android.widget.TextView) mo141623x754a37bb5;
                    this.B = f();
                    this.f393936z = f28.floatValue();
                    n(this.C);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        this.F = true;
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.E) {
            android.view.View b17 = b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i17 == 0) {
                android.view.View b18 = b();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                b18.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(b18, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View d17 = d();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(d17, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                d17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(d17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m();
            }
        }
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        c().setOnClickListener(this);
        this.f393918e.Q6(10, new ku3.g(this));
        d().setOnClickListener(ku3.h.f393774d);
    }
}
