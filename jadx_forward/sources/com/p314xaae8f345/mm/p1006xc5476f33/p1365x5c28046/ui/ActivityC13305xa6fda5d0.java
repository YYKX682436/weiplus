package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@db5.a(m123858x6ac9171 = 34)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiFinderPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiFinderPreviewUI */
/* loaded from: classes10.dex */
public final class ActivityC13305xa6fda5d0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f179309d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 f179310e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f179311f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f179312g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f179313h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f179314i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f179315m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f179316n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f179317o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f179318p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f179319q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f179320r = true;

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13305xa6fda5d0 activityC13305xa6fda5d0) {
        kk4.b player;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = activityC13305xa6fda5d0.f179310e;
        if (c18690x34c5bc78 == null || (player = c18690x34c5bc78.getPlayer()) == null) {
            return;
        }
        if (activityC13305xa6fda5d0.f179320r) {
            kk4.b.i(player, false, false, 3, null);
            activityC13305xa6fda5d0.f179320r = false;
            activityC13305xa6fda5d0.U6(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiFinderPreviewUI", "togglePlayPause: pause");
            return;
        }
        ((kk4.v) player).O();
        activityC13305xa6fda5d0.f179320r = true;
        activityC13305xa6fda5d0.U6(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiFinderPreviewUI", "togglePlayPause: play");
    }

    public final void U6(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f179313h;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(z17 ? 0 : 8);
        }
        android.view.View view = this.f179314i;
        if (view == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiFinderPreviewUI", "showPlayIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiFinderPreviewUI", "showPlayIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e4v;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        ya2.b2 b2Var;
        android.widget.ImageView imageView;
        java.lang.String m76197x6c03c64c;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        super.onCreate(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(-16777216);
        com.p314xaae8f345.mm.ui.bk.i0(getWindow(), false);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_finder_object_bytes");
        if (byteArrayExtra != null) {
            c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            c19792x256d2725.mo11468x92b714fd(byteArrayExtra);
        } else {
            c19792x256d2725 = null;
        }
        this.f179309d = c19792x256d2725;
        if (c19792x256d2725 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmojiFinderPreviewUI", "finderObject is null, finish");
            finish();
            return;
        }
        this.f179311f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.o78);
        this.f179312g = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.oy7);
        this.f179313h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.g99);
        this.f179314i = findViewById(com.p314xaae8f345.mm.R.id.g4y);
        this.f179315m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a8f);
        this.f179316n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a8p);
        this.f179317o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.i1f);
        this.f179318p = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.coc);
        this.f179319q = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.aa9);
        int h17 = com.p314xaae8f345.mm.ui.bl.h(this);
        android.widget.FrameLayout frameLayout = this.f179318p;
        if (frameLayout != null) {
            frameLayout.setPadding(0, h17, 0, 0);
        }
        android.widget.FrameLayout frameLayout2 = this.f179318p;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = this.f179319q;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h2(this));
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f179309d;
        if (c19792x256d27252 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d27252.m76802x2dd01666();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e);
            if (c19788xd7cfd73e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmojiFinderPreviewUI", "mediaList is empty");
            } else {
                java.lang.String str = c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca();
                android.widget.ImageView imageView2 = this.f179311f;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    mn2.h3 e17 = ya2.l.f542035a.e(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.e().c(e17, imageView2, g1Var.h(mn2.f1.B));
                }
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b6Var);
                float h37 = zy2.b6.h3(b6Var, "EmojiFinderPreviewUI", c19792x256d27252, false, 4, null);
                jz5.l a17 = hc2.f1.a(this, h37, getResources().getDisplayMetrics().heightPixels, "EmojiFinderPreviewUI", 0L, 0, 0, 32, null);
                jz5.o oVar = (jz5.o) a17.f384366d;
                jz5.l lVar = (jz5.l) a17.f384367e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiFinderPreviewUI", "initVideoPlayer: ratio=" + h37 + ", parentParams=" + oVar + ", childParams=" + lVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78((android.content.Context) this, false);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(((java.lang.Number) lVar.f384366d).intValue(), ((java.lang.Number) lVar.f384367e).intValue());
                layoutParams.gravity = ((java.lang.Number) oVar.f384376f).intValue();
                c18690x34c5bc78.setLayoutParams(layoutParams);
                c18690x34c5bc78.f();
                dk4.a sj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).sj(c19792x256d27252);
                if (sj6 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmojiFinderPreviewUI", "createTPMediaInfo return null");
                } else {
                    c18690x34c5bc78.m71980xdb50e870(sj6);
                    c18690x34c5bc78.setKeepScreenOn(true);
                    kk4.b player = c18690x34c5bc78.getPlayer();
                    if (player != null) {
                        ((kk4.v) player).f390118j = true;
                    }
                    kk4.b player2 = c18690x34c5bc78.getPlayer();
                    if (player2 != null) {
                        ((kk4.v) player2).A(true);
                    }
                    kk4.b player3 = c18690x34c5bc78.getPlayer();
                    if (player3 != null) {
                        ((kk4.v) player3).C(false);
                    }
                    c18690x34c5bc78.m71981xa2fa530b(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.i2(this));
                    kk4.b player4 = c18690x34c5bc78.getPlayer();
                    if (player4 != null) {
                        ((kk4.v) player4).O();
                    }
                    this.f179310e = c18690x34c5bc78;
                    android.widget.FrameLayout frameLayout3 = this.f179312g;
                    if (frameLayout3 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
                        android.widget.FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
                        if (layoutParams3 != null) {
                            layoutParams3.topMargin = ((java.lang.Number) oVar.f384374d).intValue();
                            layoutParams3.bottomMargin = ((java.lang.Number) oVar.f384375e).intValue();
                            layoutParams3.gravity = ((java.lang.Number) oVar.f384376f).intValue();
                        } else {
                            layoutParams3 = null;
                        }
                        frameLayout3.setLayoutParams(layoutParams3);
                    }
                    android.widget.FrameLayout frameLayout4 = this.f179312g;
                    if (frameLayout4 != null) {
                        frameLayout4.addView(this.f179310e, 0);
                    }
                    android.widget.FrameLayout frameLayout5 = this.f179312g;
                    if (frameLayout5 != null) {
                        frameLayout5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.j2(this));
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f179313h;
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.k2(this));
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = this.f179309d;
        if (c19792x256d27253 == null) {
            return;
        }
        zy2.b6 b6Var2 = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d27253.m76760x76845fea();
        if (m76760x76845fea == null || (m76197x6c03c64c = m76760x76845fea.m76197x6c03c64c()) == null) {
            b2Var = null;
        } else {
            c61.l7 l7Var = (c61.l7) b6Var2;
            l7Var.getClass();
            b2Var = l7Var.Jj().y0(m76197x6c03c64c);
        }
        java.lang.String m76801x8010e5e4 = c19792x256d27253.m76801x8010e5e4();
        if (m76801x8010e5e4 == null) {
            java.lang.String w07 = b2Var != null ? b2Var.w0() : null;
            m76801x8010e5e4 = w07 == null ? "" : w07;
        }
        java.lang.String m176700xe5e0d2a0 = b2Var != null ? b2Var.m176700xe5e0d2a0() : "";
        android.widget.TextView textView = this.f179316n;
        if (textView != null) {
            textView.setText(m76801x8010e5e4);
        }
        if ((m176700xe5e0d2a0.length() > 0) && (imageView = this.f179315m) != null) {
            ((c61.l7) b6Var2).getClass();
            ya2.l.f542035a.g(imageView, m176700xe5e0d2a0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.W);
        }
        int m76791xf4204902 = c19792x256d27253.m76791xf4204902();
        java.lang.String il6 = m76791xf4204902 > 0 ? ((c61.l7) b6Var2).il(m76791xf4204902) : "0";
        android.widget.TextView textView2 = this.f179317o;
        if (textView2 == null) {
            return;
        }
        textView2.setText(il6);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        kk4.b player;
        kk4.b player2;
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiFinderPreviewUI", "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f179310e;
        if (c18690x34c5bc78 != null && (player2 = c18690x34c5bc78.getPlayer()) != null) {
            player2.mo143591x360802();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc782 = this.f179310e;
        if (c18690x34c5bc782 != null && (player = c18690x34c5bc782.getPlayer()) != null) {
            player.mo143590x408b7293();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc783 = this.f179310e;
        if (c18690x34c5bc783 != null) {
            c18690x34c5bc783.g();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        kk4.b player;
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f179310e;
        if (c18690x34c5bc78 == null || (player = c18690x34c5bc78.getPlayer()) == null) {
            return;
        }
        kk4.b.i(player, false, false, 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        kk4.b player;
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f179310e;
        kk4.b player2 = c18690x34c5bc78 != null ? c18690x34c5bc78.getPlayer() : null;
        if (player2 != null) {
            ((kk4.v) player2).f390118j = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc782 = this.f179310e;
        if (c18690x34c5bc782 == null || (player = c18690x34c5bc782.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).O();
    }
}
