package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Landroid/view/View;", "f", "Landroid/view/View;", "getIvMask", "()Landroid/view/View;", "setIvMask", "(Landroid/view/View;)V", "ivMask", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity */
/* loaded from: classes11.dex */
public final class ActivityC18630xe2209fff extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f255035q = 0;

    /* renamed from: d, reason: collision with root package name */
    public mj4.h f255036d;

    /* renamed from: e, reason: collision with root package name */
    public cj4.l1 f255037e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View ivMask;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f255039g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 f255040h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f255041i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f255042m;

    /* renamed from: n, reason: collision with root package name */
    public pj4.o0 f255043n;

    /* renamed from: o, reason: collision with root package name */
    public al5.a0 f255044o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f255045p;

    public final void T6() {
        kk4.b player;
        kk4.b player2;
        android.widget.FrameLayout frameLayout = this.f255039g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        android.widget.FrameLayout frameLayout2 = this.f255039g;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f255040h;
        if (c18690x34c5bc78 != null && (player2 = c18690x34c5bc78.getPlayer()) != null) {
            ((kk4.v) player2).P();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc782 = this.f255040h;
        if (c18690x34c5bc782 != null && (player = c18690x34c5bc782.getPlayer()) != null) {
            player.mo143590x408b7293();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc783 = this.f255040h;
        if (c18690x34c5bc783 != null) {
            c18690x34c5bc783.g();
        }
    }

    public final mj4.h U6() {
        mj4.h hVar = this.f255036d;
        if (hVar != null) {
            return hVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("info");
        throw null;
    }

    public final cj4.l1 V6() {
        cj4.l1 l1Var = this.f255037e;
        if (l1Var != null) {
            return l1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadLogic");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if ((r3 != null && com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.c.b(r3, r9)) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(mj4.h r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r9 == 0) goto La
            pj4.o0 r9 = xe0.j0.a(r9, r2, r0, r1)
            goto Lb
        La:
            r9 = r1
        Lb:
            if (r9 == 0) goto La2
            java.lang.String r3 = wi4.a.d(r9)
            if (r3 == 0) goto L1c
            boolean r3 = r26.n0.N(r3)
            if (r3 == 0) goto L1a
            goto L1c
        L1a:
            r3 = r2
            goto L1d
        L1c:
            r3 = r0
        L1d:
            if (r3 != 0) goto La2
            al5.a0 r3 = r8.f255044o
            if (r3 != 0) goto L24
            goto L33
        L24:
            pj4.o0 r3 = r8.f255043n
            if (r3 == 0) goto L30
            boolean r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.c.b(r3, r9)
            if (r3 != r0) goto L30
            r3 = r0
            goto L31
        L30:
            r3 = r2
        L31:
            if (r3 != 0) goto L34
        L33:
            r0 = r2
        L34:
            if (r0 != 0) goto L99
            al5.a0 r0 = r8.f255044o
            if (r0 == 0) goto L3d
            r0.i()
        L3d:
            al5.a0 r0 = r8.f255044o
            if (r0 == 0) goto L44
            r0.g()
        L44:
            al5.a0 r0 = r8.f255044o
            if (r0 == 0) goto L4b
            r0.mo451xac79a11b()
        L4b:
            r8.f255044o = r1
            r8.f255043n = r1
            android.widget.FrameLayout r0 = r8.f255042m
            if (r0 == 0) goto L56
            r0.removeAllViews()
        L56:
            java.lang.String r0 = wi4.a.d(r9)
            if (r0 != 0) goto L5e
            java.lang.String r0 = ""
        L5e:
            java.util.LinkedList r3 = r9.f436749g
            pj4.t r4 = new pj4.t
            r4.<init>()
            r4.f436821d = r2
            r5 = 3
            r4.f436822e = r5
            mj4.h r5 = r8.U6()
            mj4.k r5 = (mj4.k) r5
            mj4.a r5 = r5.f408600b
            int r5 = r5.f76512x81959a6e
            r4.f436824g = r5
            android.widget.FrameLayout r5 = r8.f255042m     // Catch: java.lang.Throwable -> L95
            if (r5 != 0) goto L7b
            goto L95
        L7b:
            if (r3 == 0) goto L82
            pj4.j0 r3 = sj4.a1.a(r3)     // Catch: java.lang.Throwable -> L95
            goto L83
        L82:
            r3 = r1
        L83:
            sj4.z0 r6 = sj4.z0.f490441a     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L8a
            java.lang.String r7 = r3.f436672d     // Catch: java.lang.Throwable -> L95
            goto L8b
        L8a:
            r7 = r1
        L8b:
            bi4.r0 r6 = r6.a(r7)     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L95
            al5.a0 r1 = r6.A1(r0, r5, r3, r4)     // Catch: java.lang.Throwable -> L95
        L95:
            r8.f255044o = r1
            r8.f255043n = r9
        L99:
            android.widget.FrameLayout r9 = r8.f255042m
            if (r9 != 0) goto L9e
            goto Lcc
        L9e:
            r9.setVisibility(r2)
            goto Lcc
        La2:
            al5.a0 r9 = r8.f255044o
            if (r9 == 0) goto La9
            r9.i()
        La9:
            al5.a0 r9 = r8.f255044o
            if (r9 == 0) goto Lb0
            r9.g()
        Lb0:
            al5.a0 r9 = r8.f255044o
            if (r9 == 0) goto Lb7
            r9.mo451xac79a11b()
        Lb7:
            r8.f255044o = r1
            r8.f255043n = r1
            android.widget.FrameLayout r9 = r8.f255042m
            if (r9 == 0) goto Lc2
            r9.removeAllViews()
        Lc2:
            android.widget.FrameLayout r9 = r8.f255042m
            if (r9 != 0) goto Lc7
            goto Lcc
        Lc7:
            r0 = 8
            r9.setVisibility(r0)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18630xe2209fff.W6(mj4.h):void");
    }

    public final void X6() {
        java.lang.String o17 = ((mj4.k) U6()).o();
        mj4.k kVar = (mj4.k) U6();
        mj4.a aVar = kVar.f408600b;
        if (aVar.f76525x91a52c19 != 2) {
            T6();
            return;
        }
        android.widget.FrameLayout frameLayout = this.f255039g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78(this);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        android.widget.FrameLayout frameLayout2 = this.f255039g;
        if (frameLayout2 != null) {
            frameLayout2.addView(c18690x34c5bc78, layoutParams);
        }
        android.widget.FrameLayout frameLayout3 = this.f255039g;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        kVar.j();
        byte[] bytes = kVar.j().getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        if (g17 == null) {
            g17 = "";
        }
        java.lang.String str = g17;
        kVar.j();
        java.lang.String j17 = kVar.j();
        java.lang.String c17 = bk4.n.f103046a.c(kVar.j(), o17);
        int i17 = aVar.f76542x2c5150a7;
        int i18 = aVar.f76541x4409ca66;
        if (i17 <= 0 || i18 <= 0) {
            com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(this);
            com.p314xaae8f345.mm.ui.ah a18 = com.p314xaae8f345.mm.ui.bh.a(this);
            i17 = a17.f278668a;
            i18 = a18.f278669b;
        }
        dk4.a aVar2 = new dk4.a(str, c17, j17, i17, i18);
        aVar2.f316001e = false;
        c18690x34c5bc78.m71980xdb50e870(aVar2);
        kk4.b player = c18690x34c5bc78.getPlayer();
        if (player != null) {
            ((kk4.v) player).f390118j = true;
        }
        kk4.b player2 = c18690x34c5bc78.getPlayer();
        if (player2 != null) {
            ((kk4.v) player2).A(true);
        }
        c18690x34c5bc78.m71973x9972f526().d();
        if (kVar.v()) {
            uq5.b b17 = c18690x34c5bc78.m71973x9972f526().b();
            b17.d(5.0f);
            b17.e(1.0f);
        }
        this.f255040h = c18690x34c5bc78;
        kk4.b player3 = c18690x34c5bc78.getPlayer();
        if (player3 != null) {
            ((kk4.v) player3).O();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571093cz2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:17|(4:(3:19|(1:21)(1:50)|(11:23|(1:25)|26|27|28|(2:30|(1:32))|47|(2:35|(1:37))(2:44|(1:46))|38|39|40))|38|39|40)|51|(1:53)|26|27|28|(0)|47|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0224, code lost:
    
        if (r3.q(r21.f255041i) == true) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0233  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18630xe2209fff.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        T6();
        V6().o();
        V6().n();
        al5.a0 a0Var = this.f255044o;
        if (a0Var != null) {
            a0Var.i();
        }
        al5.a0 a0Var2 = this.f255044o;
        if (a0Var2 != null) {
            a0Var2.g();
        }
        al5.a0 a0Var3 = this.f255044o;
        if (a0Var3 != null) {
            a0Var3.mo451xac79a11b();
        }
        this.f255044o = null;
        this.f255043n = null;
        gm0.j1.d().q(5967, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        kk4.b player;
        super.onPause();
        al5.a0 a0Var = this.f255044o;
        if (a0Var != null) {
            a0Var.i();
        }
        al5.a0 a0Var2 = this.f255044o;
        if (a0Var2 != null) {
            a0Var2.g();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f255040h;
        if (c18690x34c5bc78 == null || (player = c18690x34c5bc78.getPlayer()) == null) {
            return;
        }
        kk4.b.i(player, false, false, 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        kk4.b player;
        super.onResume();
        al5.a0 a0Var = this.f255044o;
        if (a0Var != null) {
            a0Var.j();
        }
        al5.a0 a0Var2 = this.f255044o;
        if (a0Var2 != null) {
            a0Var2.h();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f255040h;
        if (c18690x34c5bc78 == null || (player = c18690x34c5bc78.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).O();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        if (m1Var instanceof ej4.a) {
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            ((ej4.a) m1Var).getClass();
            d17.q(5967, this);
            if (i17 == 0 && i18 == 0) {
                z17 = true;
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                if (mo55332x76847179 != null) {
                    db5.e1.s(mo55332x76847179, mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574893jv3), "");
                }
                z17 = false;
            }
            if (z17) {
                finish();
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f255045p;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    /* renamed from: setIvMask */
    public final void m71816x121c80bb(android.view.View view) {
        this.ivMask = view;
    }
}
