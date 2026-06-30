package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI */
/* loaded from: classes15.dex */
public class ActivityC13057x768a6365 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements wt1.e0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f176426n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f176427d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3 f176428e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f176429f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f176430g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f176431h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f176432i = false;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f176433m = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p3(this);

    @Override // wt1.e0
    public void L1(xt1.k kVar) {
        int i17 = kVar.f68131xd14432dd;
        if ((i17 & 1) == 0 || (i17 & 3) == 0) {
            return;
        }
        T6();
        this.f176428e.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6() {
        /*
            r12 = this;
            wt1.f0 r0 = xt1.t0.Ui()
            java.util.List r0 = r0.f530800b
            r1 = 0
            if (r0 == 0) goto L17
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L12
            goto L17
        L12:
            int r0 = r0.size()
            goto L18
        L17:
            r0 = r1
        L18:
            r2 = 8
            if (r0 <= 0) goto L6b
            android.widget.ListView r0 = r12.f176427d
            r0.setVisibility(r1)
            android.view.View r0 = r12.f176429f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.add(r2)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r4 = r11.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI"
            java.lang.String r6 = "doUpdate"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r11.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI"
            java.lang.String r5 = "doUpdate"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            r0 = 1
            r12.m78501x43e00957(r0)
            goto Lb8
        L6b:
            android.widget.ListView r0 = r12.f176427d
            r0.setVisibility(r2)
            android.view.View r0 = r12.f176429f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r4 = r2.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI"
            java.lang.String r6 = "doUpdate"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI"
            java.lang.String r5 = "doUpdate"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            r12.m78501x43e00957(r1)
        Lb8:
            com.tencent.mm.plugin.card.ui.s3 r0 = r12.f176428e
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365.T6():void");
    }

    public void U6(java.lang.String str, boolean z17) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
        intent.putExtra("key_card_id", str);
        intent.putExtra("key_is_share_card", z17);
        intent.putExtra("key_from_scene", 4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI", "gotoCardDetailUI", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI", "gotoCardDetailUI", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569878qr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.auc);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.h3(this));
        this.f176427d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.baz);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3 s3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3(this);
        this.f176428e = s3Var;
        this.f176427d.setAdapter((android.widget.ListAdapter) s3Var);
        this.f176427d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.i3(this));
        this.f176427d.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.j3(this));
        this.f176427d.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k3(this));
        this.f176428e.f294144h = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l3(this);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.arp), new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m3(this));
        this.f176429f = findViewById(com.p314xaae8f345.mm.R.id.cho);
        T6();
        this.f176430g = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569875qo, (android.view.ViewGroup) null);
        this.f176431h = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byg, (android.view.ViewGroup) null);
        int f17 = xt1.t0.Vi().f();
        if (f17 > 0) {
            this.f176427d.addFooterView(this.f176430g);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3 s3Var2 = this.f176428e;
        if (!(s3Var2.f176690o >= s3Var2.f176691p) && f17 == 0 && xt1.t0.Vi().mo78086x7444f759() > 0) {
            this.f176427d.addFooterView(this.f176431h);
            this.f176432i = true;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3 s3Var3 = this.f176428e;
        if ((s3Var3.f176690o >= s3Var3.f176691p) && f17 == 0) {
            xt1.t0.Vi().mo78086x7444f759();
        }
    }

    @Override // wt1.e0
    /* renamed from: onChange */
    public void mo54452x3dcbea6f() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        wt1.f0 Ui = xt1.t0.Ui();
        if (Ui.f530799a == null) {
            Ui.f530799a = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ui.f530799a).add(new java.lang.ref.WeakReference(this));
        xt1.t0.Ui().d();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f176428e.c();
        xt1.t0.Ui().f(this);
        if (xt1.t0.Vi().f() > 0) {
            xt1.t0.Vi().f538051d.A("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
        }
        super.onDestroy();
    }
}
