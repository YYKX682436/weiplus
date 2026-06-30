package com.p314xaae8f345.mm.p648x55baa833.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/chatroom/ui/ChatRoomBindAppUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatroom.ui.ChatRoomBindAppUI */
/* loaded from: classes4.dex */
public final class ActivityC10330xb121fb05 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public vg3.i3 f145218d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569935sb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.content.Intent intent = getIntent();
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("key_bind_param") : null;
        vg3.i3 i3Var = serializableExtra instanceof vg3.i3 ? (vg3.i3) serializableExtra : null;
        this.f145218d = i3Var;
        if (i3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomBindAppUI", "openParam is null");
            finish();
            return;
        }
        mo54450xbf7c1df6("");
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.a(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565013b00);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.Button) findViewById).setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.d(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ol6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        vg3.i3 i3Var2 = this.f145218d;
        java.lang.String str = i3Var2 != null ? i3Var2.f518249h : null;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.axz, objArr));
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        vg3.i3 i3Var3 = this.f145218d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(i3Var3 != null ? i3Var3.f518251m : null, true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomBindAppUI", "contact is null");
            finish();
            return;
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.hke);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        vg3.i3 i3Var4 = this.f145218d;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(imageView, i3Var4 != null ? i3Var4.f518251m : null, null);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.on_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = n17.d1();
        ((sg3.a) v0Var).getClass();
        ((android.widget.TextView) findViewById4).setText(((ke0.e) xVar).bj(mo55332x76847179, c01.a2.e(d17), i65.a.h(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)));
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.ol7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        vg3.i3 i3Var5 = this.f145218d;
        java.lang.String str2 = i3Var5 != null ? i3Var5.f518249h : null;
        objArr2[0] = str2 != null ? str2 : "";
        textView2.setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572355ay0, objArr2));
    }
}
