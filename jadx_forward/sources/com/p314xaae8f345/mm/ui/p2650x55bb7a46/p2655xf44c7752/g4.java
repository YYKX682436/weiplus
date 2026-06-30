package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    public final fq.d f282479a;

    /* renamed from: b, reason: collision with root package name */
    public final int f282480b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f282481c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f282482d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 f282483e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f282484f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f282485g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.u f282486h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f282487i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.FrameLayout f282488j;

    public g4(fq.d binding, int i17, android.view.View container, yz5.a currentVertical) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentVertical, "currentVertical");
        this.f282479a = binding;
        this.f282480b = i17;
        this.f282481c = container;
        this.f282482d = currentVertical;
        this.f282485g = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s3.f282888d);
        h();
    }

    public final android.view.animation.Animation a(int i17) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(i17);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator(10.0f));
        return alphaAnimation;
    }

    public final android.content.Context b() {
        return this.f282481c.getContext();
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) this.f282485g).mo141623x754a37bb()).booleanValue();
    }

    public final void d(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideLayer: ");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var = this.f282483e;
        sb6.append(r3Var != null ? java.lang.Integer.valueOf(r3Var.f282853a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", sb6.toString());
        boolean z18 = false;
        this.f282484f = false;
        fq.d dVar = this.f282479a;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21801xa1cf70e9 c21801xa1cf70e9 = dVar.f346943g;
            c21801xa1cf70e9.clearAnimation();
            android.view.animation.Animation a17 = a(150);
            a17.setAnimationListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.u3(c21801xa1cf70e9, this));
            c21801xa1cf70e9.startAnimation(a17);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var2 = this.f282483e;
            if (r3Var2 != null && r3Var2.f282855c) {
                z18 = true;
            }
            if (z18 || !c()) {
                android.widget.FrameLayout frameLayout = dVar.f346938b;
                frameLayout.clearAnimation();
                frameLayout.startAnimation(a(150));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21801xa1cf70e9 c21801xa1cf70e92 = dVar.f346943g;
        c21801xa1cf70e92.clearAnimation();
        c21801xa1cf70e92.setAlpha(0.0f);
        c21801xa1cf70e92.setVisibility(4);
        c21801xa1cf70e92.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.v3(this));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var3 = this.f282483e;
        if (r3Var3 != null && r3Var3.f282855c) {
            z18 = true;
        }
        if (z18 || !c()) {
            android.widget.FrameLayout frameLayout2 = dVar.f346938b;
            frameLayout2.clearAnimation();
            frameLayout2.setAlpha(0.0f);
            frameLayout2.setVisibility(4);
        }
    }

    public final void e(java.lang.String str, yz5.l lVar) {
        fq.d dVar = this.f282479a;
        android.widget.LinearLayout linearLayout = dVar.f346948l;
        linearLayout.setElevation(10.0f);
        linearLayout.setVisibility(0);
        linearLayout.setContentDescription(str);
        linearLayout.setOutlineProvider(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.w3(this));
        dy1.a.i(linearLayout, "img_source_info_btn");
        dy1.a.e(linearLayout, 40, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.x3(lVar));
        android.widget.Button button = dVar.f346949m;
        button.setGravity(16);
        android.text.TextPaint paint = button.getPaint();
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(0.8f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r0.f282855c == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void f(boolean r4) {
        /*
            r3 = this;
            com.tencent.mm.ui.chatting.gallery.r3 r0 = r3.f282483e
            r1 = 0
            if (r0 == 0) goto Lb
            r2 = 1
            boolean r0 = r0.f282855c
            if (r0 != r2) goto Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            r0 = 0
            if (r2 == 0) goto L22
            android.widget.FrameLayout r2 = r3.f282488j
            if (r2 == 0) goto L1c
            if (r4 == 0) goto L16
            goto L18
        L16:
            r1 = 8
        L18:
            r2.setVisibility(r1)
            goto L22
        L1c:
            java.lang.String r4 = "errorTipsOnSeekbarContainer"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r4)
            throw r0
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4.f(boolean):java.lang.Void");
    }

    public final void g() {
        int c17 = com.p314xaae8f345.mm.ui.bl.c(b());
        int h17 = com.p314xaae8f345.mm.ui.bl.h(b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "setToHorizontal: nav: " + c17 + ", status: " + h17);
        int f17 = i65.a.f(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int f18 = i65.a.f(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        fq.d dVar = this.f282479a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19740xe82b0b7f c19740xe82b0b7f = dVar.f346958v;
        android.view.ViewGroup.LayoutParams layoutParams = c19740xe82b0b7f.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int max = java.lang.Math.max(c17, h17);
        marginLayoutParams.setMarginStart(max);
        marginLayoutParams.setMarginEnd(max);
        c19740xe82b0b7f.setLayoutParams(marginLayoutParams);
        int i17 = f17 * 2;
        dVar.f346939c.setPadding(f18, i17, f18, i17);
        dVar.f346938b.setPadding(f18, f17, f18, f17);
    }

    public final void h() {
        int e17 = com.p314xaae8f345.mm.ui.bl.e(b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "setToVertical: nav " + e17);
        int f17 = i65.a.f(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int i17 = f17 * 2;
        fq.d dVar = this.f282479a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19740xe82b0b7f c19740xe82b0b7f = dVar.f346958v;
        android.view.ViewGroup.LayoutParams layoutParams = c19740xe82b0b7f.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        c19740xe82b0b7f.setLayoutParams(marginLayoutParams);
        dVar.f346939c.setPadding(0, i17, 0, e17 + i17);
        dVar.f346938b.setPadding(i17, f17, i17, f17);
    }

    public final java.lang.Void i(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "setTransState: " + z17);
        boolean z18 = false;
        fq.d dVar = this.f282479a;
        if (z17) {
            dVar.f346945i.setEnabled(false);
            dVar.f346959w.setAlpha(0.15f);
            dVar.f346957u.setVisibility(8);
        } else {
            dVar.f346945i.setEnabled(true);
            dVar.f346959w.setAlpha(1.0f);
            dVar.f346957u.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var = this.f282483e;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = r3Var != null ? r3Var.f282864l : null;
            if (r3Var != null && r3Var.f282855c) {
                z18 = true;
            }
            if (!z18) {
                m11.b0 v17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.v(f9Var);
                if (v17 != null) {
                    if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.f(f9Var, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f104083a.d(v17.l()), v17.f404170e, "", ""))) {
                        dVar.f346957u.setVisibility(8);
                    }
                }
            } else if (f9Var != null) {
                if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.N.b(f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.s(f9Var))) {
                    dVar.f346957u.setVisibility(8);
                    return null;
                }
            }
        }
        return null;
    }

    public final void j(boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var = this.f282483e;
        boolean z18 = false;
        if (r3Var != null && r3Var.f282862j) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showLayer skip: ");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var2 = this.f282483e;
            sb6.append(r3Var2 != null ? java.lang.Integer.valueOf(r3Var2.f282853a) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showLayer: ");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var3 = this.f282483e;
        sb7.append(r3Var3 != null ? java.lang.Integer.valueOf(r3Var3.f282853a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", sb7.toString());
        fq.d dVar = this.f282479a;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21801xa1cf70e9 c21801xa1cf70e9 = dVar.f346943g;
            c21801xa1cf70e9.setVisibility(0);
            c21801xa1cf70e9.clearAnimation();
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setFillAfter(true);
            c21801xa1cf70e9.startAnimation(alphaAnimation);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var4 = this.f282483e;
            if (r3Var4 != null && r3Var4.f282855c) {
                z18 = true;
            }
            if (z18 || !c()) {
                android.widget.FrameLayout frameLayout = dVar.f346938b;
                frameLayout.clearAnimation();
                android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setDuration(150);
                alphaAnimation2.setFillAfter(true);
                frameLayout.startAnimation(alphaAnimation2);
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21801xa1cf70e9 c21801xa1cf70e92 = dVar.f346943g;
            c21801xa1cf70e92.clearAnimation();
            c21801xa1cf70e92.setAlpha(1.0f);
            c21801xa1cf70e92.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var5 = this.f282483e;
            if ((r3Var5 != null && r3Var5.f282855c) || !c()) {
                android.widget.FrameLayout frameLayout2 = dVar.f346938b;
                frameLayout2.clearAnimation();
                frameLayout2.setAlpha(1.0f);
                frameLayout2.setVisibility(0);
            }
        }
        this.f282484f = true;
    }

    public final java.lang.Void k(java.lang.Integer num, boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var = this.f282483e;
        if (r3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryOPLayer", "upImageDownloadState: config is null");
            return null;
        }
        fq.d dVar = this.f282479a;
        if (num == null) {
            fq.b bVar = dVar.f346952p;
            bVar.f346924b.setVisibility(0);
            bVar.f346925c.setVisibility(8);
            return null;
        }
        if (!r3Var.f282855c) {
            android.widget.TextView textView = dVar.f346952p.f346927e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(num);
            sb6.append('%');
            textView.setText(sb6.toString());
            if (z17) {
                fq.b bVar2 = dVar.f346952p;
                bVar2.f346925c.setVisibility(8);
                android.widget.LinearLayout linearLayout = bVar2.f346926d;
                linearLayout.setVisibility(0);
                android.view.animation.Animation a17 = a(1000);
                a17.setAnimationListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e4(this));
                linearLayout.startAnimation(a17);
            } else {
                fq.b bVar3 = dVar.f346952p;
                bVar3.f346923a.setVisibility(0);
                bVar3.f346924b.setVisibility(8);
                bVar3.f346925c.setVisibility(0);
                bVar3.f346926d.setVisibility(8);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r0.f282855c == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void l(java.lang.Integer r7, boolean r8) {
        /*
            r6 = this;
            com.tencent.mm.ui.chatting.gallery.r3 r0 = r6.f282483e
            r1 = 0
            if (r0 == 0) goto Lb
            r2 = 1
            boolean r0 = r0.f282855c
            if (r0 != r2) goto Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            r0 = 0
            if (r2 == 0) goto L70
            r2 = 8
            fq.d r3 = r6.f282479a
            if (r7 != 0) goto L22
            fq.c r7 = r3.f346953q
            android.widget.Button r8 = r7.f346933c
            r8.setVisibility(r1)
            android.widget.RelativeLayout r7 = r7.f346936f
            r7.setVisibility(r2)
            return r0
        L22:
            fq.c r4 = r3.f346953q
            android.widget.TextView r4 = r4.f346935e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r7 = 37
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            r4.setText(r7)
            if (r8 == 0) goto L5a
            fq.c r7 = r3.f346953q
            android.widget.RelativeLayout r8 = r7.f346936f
            r8.setVisibility(r2)
            android.widget.LinearLayout r7 = r7.f346934d
            r7.setVisibility(r1)
            r8 = 1000(0x3e8, float:1.401E-42)
            android.view.animation.Animation r8 = r6.a(r8)
            com.tencent.mm.ui.chatting.gallery.f4 r1 = new com.tencent.mm.ui.chatting.gallery.f4
            r1.<init>(r6)
            r8.setAnimationListener(r1)
            r7.startAnimation(r8)
            goto L70
        L5a:
            fq.c r7 = r3.f346953q
            android.widget.FrameLayout r8 = r7.f346931a
            r8.setVisibility(r1)
            android.widget.Button r8 = r7.f346933c
            r8.setVisibility(r2)
            android.widget.RelativeLayout r8 = r7.f346936f
            r8.setVisibility(r1)
            android.widget.LinearLayout r7 = r7.f346934d
            r7.setVisibility(r2)
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4.l(java.lang.Integer, boolean):java.lang.Void");
    }
}
