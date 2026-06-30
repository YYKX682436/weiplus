package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameMessageBubbleView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15979x2e9762c6 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222452d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f222453e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f222454f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f222455g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 f222456h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f222457i;

    /* renamed from: m, reason: collision with root package name */
    public long f222458m;

    public ViewOnClickListenerC15979x2e9762c6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222457i = false;
        this.f222458m = 0L;
        this.f222452d = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r0.f221815g2.containsKey(r0.f221814f2.f221935c) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r5 = this;
            java.lang.Class<m33.r1> r0 = m33.r1.class
            i95.m r0 = i95.n0.c(r0)
            m33.r1 r0 = (m33.r1) r0
            com.tencent.mm.plugin.game.n1 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) r0
            com.tencent.mm.plugin.game.model.i1 r0 = r0.Ai()
            com.tencent.mm.plugin.game.model.e1 r0 = r0.j()
            r5.f222456h = r0
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L22
            android.view.View r0 = r5.f222453e
            r0.setOnClickListener(r2)
            r5.setVisibility(r1)
            goto L90
        L22:
            r0.t0()
            com.tencent.mm.plugin.game.model.e1 r0 = r5.f222456h
            int r3 = r0.f68469xc4aab016
            r4 = 100
            if (r3 != r4) goto L6d
            com.tencent.mm.plugin.game.model.p0 r0 = r0.f221814f2
            java.lang.String r0 = r0.f221934b
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto L5d
            com.tencent.mm.plugin.game.model.e1 r0 = r5.f222456h
            com.tencent.mm.plugin.game.model.p0 r0 = r0.f221814f2
            java.lang.String r0 = r0.f221933a
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto L5d
            com.tencent.mm.plugin.game.model.e1 r0 = r5.f222456h
            com.tencent.mm.plugin.game.model.p0 r0 = r0.f221814f2
            java.lang.String r0 = r0.f221935c
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto L5d
            com.tencent.mm.plugin.game.model.e1 r0 = r5.f222456h
            java.util.HashMap r3 = r0.f221815g2
            com.tencent.mm.plugin.game.model.p0 r0 = r0.f221814f2
            java.lang.String r0 = r0.f221935c
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L6d
        L5d:
            java.lang.String r0 = "MicroMsg.GameMessageHeaderView"
            java.lang.String r3 = "bubble is invalid"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r3)
            android.view.View r0 = r5.f222453e
            r0.setOnClickListener(r2)
            r5.setVisibility(r1)
            return
        L6d:
            android.widget.TextView r0 = r5.f222454f
            com.tencent.mm.plugin.game.model.e1 r1 = r5.f222456h
            com.tencent.mm.plugin.game.model.p0 r1 = r1.f221814f2
            java.lang.String r1 = r1.f221934b
            r0.setText(r1)
            n11.a r0 = n11.a.b()
            com.tencent.mm.plugin.game.model.e1 r1 = r5.f222456h
            com.tencent.mm.plugin.game.model.p0 r1 = r1.f221814f2
            java.lang.String r1 = r1.f221933a
            android.widget.ImageView r2 = r5.f222455g
            r0.g(r1, r2)
            android.view.View r0 = r5.f222453e
            r0.setOnClickListener(r5)
            r0 = 0
            r5.setVisibility(r0)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15979x2e9762c6.a():void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int v17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (java.lang.System.currentTimeMillis() - this.f222458m <= 500) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (this.f222456h == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = this.f222456h;
        int i19 = e1Var.f68469xc4aab016;
        android.content.Context context = this.f222452d;
        if (i19 == 100) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f221814f2.f221935c)) {
                this.f222458m = java.lang.System.currentTimeMillis();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var2 = this.f222456h;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0) e1Var2.f221815g2.get(e1Var2.f221814f2.f221935c);
                if (r0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var3 = this.f222456h;
                    int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1.a(context, e1Var3, r0Var, e1Var3.f68449x28d45f97, 1007);
                    if (a17 != 0) {
                        android.content.Context context2 = this.f222452d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var4 = this.f222456h;
                        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(context2, 10, 1007, 1, a17, 0, e1Var4.f68449x28d45f97, 0, e1Var4.S2, e1Var4.f68458xd54c6aa5, e1Var4.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a(null, null, e1Var4.U2, null));
                    }
                    if (r0Var.f221962d != 4) {
                        this.f222456h.f68463xff7b64c5 = true;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().mo9952xce0038c9(this.f222456h, new java.lang.String[0]);
                    }
                }
                this.f222458m = java.lang.System.currentTimeMillis();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (e1Var != null && e1Var.f221817i2 != 3) {
            e1Var.f68463xff7b64c5 = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().mo9952xce0038c9(this.f222456h, new java.lang.String[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var5 = this.f222456h;
        int i27 = e1Var5.f221817i2;
        if (i27 != 1) {
            if (i27 != 2) {
                if (i27 != 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageHeaderView", "unknown bubble_action = " + this.f222456h.f221817i2);
                    yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_open_message_center_v2, 1) == 1) {
                    intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836.class);
                } else {
                    intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15982xf89d78e9.class);
                }
                intent.putExtra("game_report_from_scene", 1007);
                android.content.Context context3 = this.f222452d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context3, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context3, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                v17 = 6;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var5.f68449x28d45f97)) {
                i17 = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageHeaderView", "message type : " + this.f222456h.f68469xc4aab016 + " ,message.field_appId is null.");
                i18 = i17;
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putCharSequence("game_app_id", this.f222456h.f68449x28d45f97);
                bundle.putInt("game_report_from_scene", 1007);
                v17 = r53.f.o(context, this.f222456h.f68449x28d45f97, null, bundle, 0);
            }
            i18 = v17;
        } else {
            i17 = 0;
            java.lang.String str = e1Var5.W1;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                v17 = r53.f.v(context, str, "game_center_bubble", null);
                i18 = v17;
            }
            i18 = i17;
        }
        android.content.Context context4 = this.f222452d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var6 = this.f222456h;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(context4, 10, 1007, 1, i18, 0, e1Var6.f68449x28d45f97, 0, e1Var6.f68469xc4aab016, e1Var6.f68458xd54c6aa5, e1Var6.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a(null, null, e1Var6.U2, null));
        this.f222458m = java.lang.System.currentTimeMillis();
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f222457i) {
            return;
        }
        this.f222455g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.gnj);
        this.f222454f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gni);
        this.f222453e = findViewById(com.p314xaae8f345.mm.R.id.gnk);
        setVisibility(8);
        this.f222457i = true;
    }
}
