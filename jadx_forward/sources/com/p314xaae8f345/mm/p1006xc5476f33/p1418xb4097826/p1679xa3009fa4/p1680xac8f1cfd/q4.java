package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public abstract class q4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f217189g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f217190h = "";

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f217191d;

    /* renamed from: e, reason: collision with root package name */
    public az2.f f217192e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217193f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217193f = "";
    }

    public static /* synthetic */ void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 q4Var, android.view.View view, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report25496");
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        q4Var.W6(view, str, z17);
    }

    public abstract int O6();

    public final void P6() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, m158354x19263085(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        intent.putExtra("key_create_scene", 16);
        intent.putExtra("key_router_to_profile", false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).rj(m158354x19263085(), intent, O6());
    }

    public void Q6() {
        java.lang.String str;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(m80379x76847179());
        this.f217191d = y1Var;
        y1Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d4(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = this.f217191d;
        if (y1Var2 != null) {
            y1Var2.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5n);
            android.view.View rootView = y1Var2.f293560f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "rootView");
            W6(rootView, "finder_create_account_half_view", false);
            y1Var2.f293566o = true;
            r45.kw2 kw2Var = (r45.kw2) g92.b.f351302e.k2().d().m75936x14adae67(22);
            if (kw2Var == null || (str = kw2Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCreateAccountHalfScreenUIC", "wording: ".concat(str));
            if ((str.length() > 0) && (textView = (android.widget.TextView) y1Var2.f293560f.findViewById(com.p314xaae8f345.mm.R.id.ebe)) != null) {
                textView.setText(str);
            }
            android.view.View view = y1Var2.f293560f;
            if (view != null) {
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.eay);
                android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565982eb2);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, c01.z1.r(), null);
                if (f217189g.length() == 0) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    java.lang.String j17 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().j(c01.z1.r(), false);
                    f217189g = j17;
                    if (((int) com.p314xaae8f345.mm.vfs.w6.k(j17)) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCreateAccountHalfScreenUIC", "WX avatar file size is zero");
                        f217189g = "";
                    }
                }
                java.lang.String str2 = f217190h;
                if (str2.length() == 0) {
                    str2 = c01.z1.l();
                }
                f217190h = str2;
                textView2.setText(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCreateAccountHalfScreenUIC", "lastAvatarPath: " + f217189g + ", lastNickName: " + f217190h);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y0).mo141623x754a37bb()).r()).intValue() == 1) {
                    pq5.g l17 = new db2.v2(1).l();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085);
                    l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c4(textView2, this));
                }
            }
            android.view.View findViewById = y1Var2.f293560f.findViewById(com.p314xaae8f345.mm.R.id.f565980eb0);
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e4(this));
            X6(this, findViewById, "half_create_account_page_edit_button", false, 4, null);
            android.widget.TextView textView3 = (android.widget.TextView) y1Var2.f293560f.findViewById(com.p314xaae8f345.mm.R.id.g4d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f183625a;
            android.app.Activity m80379x76847179 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
            d8Var.e(m80379x76847179, textView3, "Finder.FinderBaseCreateAccountHalfScreenUIC");
            android.view.View findViewById2 = y1Var2.f293560f.findViewById(com.p314xaae8f345.mm.R.id.g4a);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f4(this, findViewById2));
            }
            android.widget.Button button = (android.widget.Button) y1Var2.f293560f.findViewById(com.p314xaae8f345.mm.R.id.eaz);
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g4(this));
            X6(this, button, "half_create_account_page_create_post_button", false, 4, null);
            android.view.View findViewById3 = y1Var2.f293560f.findViewById(com.p314xaae8f345.mm.R.id.f565981eb1);
            findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h4(this));
            X6(this, findViewById3, "half_create_account_page_not_create_button", false, 4, null);
        }
    }

    public void R6() {
    }

    public void S6() {
    }

    public void T6() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4.f217190h.length() > 0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6() {
        /*
            r3 = this;
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4.f217189g
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1d
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4.f217190h
            int r0 = r0.length()
            if (r0 <= 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            if (r1 == 0) goto L28
            com.tencent.mm.ui.widget.dialog.y1 r0 = r3.f217191d
            if (r0 == 0) goto L2b
            r0.s()
            goto L2b
        L28:
            r3.P6()
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4.U6():void");
    }

    public void V6(r45.r01 r01Var) {
        r45.nk2 nk2Var;
        java.lang.String m75945x2fec8307;
        az2.f fVar = this.f217192e;
        if (fVar != null) {
            fVar.b();
        }
        if (r01Var == null || (nk2Var = (r45.nk2) r01Var.m75936x14adae67(2)) == null) {
            return;
        }
        java.lang.String m158362x2fec8307 = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ev6);
        java.lang.String m75945x2fec83072 = nk2Var.m75945x2fec8307(1);
        if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0) && (m75945x2fec8307 = nk2Var.m75945x2fec8307(1)) != null) {
            m158362x2fec8307 = m75945x2fec8307;
        }
        db5.t7.m(m80379x76847179(), m158362x2fec8307);
    }

    public final void W6(android.view.View view, java.lang.String str, boolean z17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i4(this));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, z17 ? 40 : 32, 25496);
    }

    public final void Y6(java.lang.String str) {
        c01.fb a17 = c01.fb.a();
        r45.hz0 hz0Var = new r45.hz0();
        r45.hz0 hz0Var2 = new r45.hz0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var2.f391649d = 1;
        hz0Var.set(3, java.lang.Integer.valueOf(a17.f118721b));
        if (a17.f118721b == 0) {
            f0Var.f391649d = 1;
        }
        java.lang.String str2 = a17.f118726g;
        if (!(str2 == null || str2.length() == 0)) {
            java.lang.String str3 = a17.f118728i;
            if (!(str3 == null || str3.length() == 0)) {
                java.lang.String str4 = a17.f118727h;
                if (!(str4 == null || str4.length() == 0)) {
                    f0Var2.f391649d = 0;
                    hz0Var.set(0, a17.f118726g);
                    hz0Var.set(1, a17.f118728i);
                    hz0Var.set(2, a17.f118727h);
                }
            }
        }
        pf5.e.m158343xd39de650(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p4(str, hz0Var, hz0Var2, f0Var, f0Var2, this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCreateAccountHalfScreenUIC", "requestCode: " + i17 + ", resultCode: " + i18);
        if (i17 == O6() && i18 == 1) {
            S6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String e17 = xy2.c.e(m158354x19263085());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "<set-?>");
        this.f217193f = e17;
        Q6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f217191d;
        if (y1Var != null) {
            y1Var.f293566o = false;
        }
        if (y1Var != null) {
            y1Var.q();
        }
    }
}
