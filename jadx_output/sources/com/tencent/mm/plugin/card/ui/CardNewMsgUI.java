package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class CardNewMsgUI extends com.tencent.mm.ui.MMActivity implements wt1.e0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f94893n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f94894d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.s3 f94895e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f94896f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f94897g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f94898h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f94899i = false;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f94900m = new com.tencent.mm.plugin.card.ui.p3(this);

    @Override // wt1.e0
    public void L1(xt1.k kVar) {
        int i17 = kVar.field_msg_type;
        if ((i17 & 1) == 0 || (i17 & 3) == 0) {
            return;
        }
        T6();
        this.f94895e.f();
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
            java.util.List r0 = r0.f449267b
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
            android.widget.ListView r0 = r12.f94894d
            r0.setVisibility(r1)
            android.view.View r0 = r12.f94896f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
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
            r12.enableOptionMenu(r0)
            goto Lb8
        L6b:
            android.widget.ListView r0 = r12.f94894d
            r0.setVisibility(r2)
            android.view.View r0 = r12.f94896f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
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
            r12.enableOptionMenu(r1)
        Lb8:
            com.tencent.mm.plugin.card.ui.s3 r0 = r12.f94895e
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.CardNewMsgUI.T6():void");
    }

    public void U6(java.lang.String str, boolean z17) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
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

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488345qr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.auc);
        setBackBtn(new com.tencent.mm.plugin.card.ui.h3(this));
        this.f94894d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.baz);
        com.tencent.mm.plugin.card.ui.s3 s3Var = new com.tencent.mm.plugin.card.ui.s3(this);
        this.f94895e = s3Var;
        this.f94894d.setAdapter((android.widget.ListAdapter) s3Var);
        this.f94894d.setOnItemClickListener(new com.tencent.mm.plugin.card.ui.i3(this));
        this.f94894d.setOnItemLongClickListener(new com.tencent.mm.plugin.card.ui.j3(this));
        this.f94894d.setOnScrollListener(new com.tencent.mm.plugin.card.ui.k3(this));
        this.f94895e.f212611h = new com.tencent.mm.plugin.card.ui.l3(this);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.arp), new com.tencent.mm.plugin.card.ui.m3(this));
        this.f94896f = findViewById(com.tencent.mm.R.id.cho);
        T6();
        this.f94897g = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f488342qo, (android.view.ViewGroup) null);
        this.f94898h = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.byg, (android.view.ViewGroup) null);
        int f17 = xt1.t0.Vi().f();
        if (f17 > 0) {
            this.f94894d.addFooterView(this.f94897g);
            return;
        }
        com.tencent.mm.plugin.card.ui.s3 s3Var2 = this.f94895e;
        if (!(s3Var2.f95157o >= s3Var2.f95158p) && f17 == 0 && xt1.t0.Vi().getCount() > 0) {
            this.f94894d.addFooterView(this.f94898h);
            this.f94899i = true;
            return;
        }
        com.tencent.mm.plugin.card.ui.s3 s3Var3 = this.f94895e;
        if ((s3Var3.f95157o >= s3Var3.f95158p) && f17 == 0) {
            xt1.t0.Vi().getCount();
        }
    }

    @Override // wt1.e0
    public void onChange() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        wt1.f0 Ui = xt1.t0.Ui();
        if (Ui.f449266a == null) {
            Ui.f449266a = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ui.f449266a).add(new java.lang.ref.WeakReference(this));
        xt1.t0.Ui().d();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f94895e.c();
        xt1.t0.Ui().f(this);
        if (xt1.t0.Vi().f() > 0) {
            xt1.t0.Vi().f456518d.A("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
        }
        super.onDestroy();
    }
}
