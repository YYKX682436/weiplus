package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder;", "Lcom/tencent/mm/plugin/emoji/ui/EmojiEditorActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmoticonEditorActivityDirectFinder */
/* loaded from: classes10.dex */
public final class ActivityC13323x5e994e71 extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 {
    public long E;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void T6(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String u17 = pm0.v.u(this.E);
        intent.putExtra("allow_add_exceed_limit", true);
        intent.putExtra("hide_added_toast", true);
        intent.putExtra("hide_exceed_limit_hint", true);
        intent.putExtra("extra_upload_scene", 3);
        intent.putExtra("feedId", u17);
        r45.sj0 sj0Var = new r45.sj0();
        sj0Var.f467304d = u17;
        intent.putExtra("upload_finder_link_info", sj0Var.mo14344x5f01b1f6());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public long V6() {
        return 3L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public long W6() {
        return 3L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void e7() {
        if (this.f179289d) {
            this.f179304v = new p12.x(this, b7());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiEditorActivity+DirectFinder", "not video! it's not allowed to use in direct finder category");
        setResult(0);
        finish();
        this.f179307y = 1L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void g7() {
        this.f179307y = 3L;
        i7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public int k7() {
        return 1000068;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62
    public void l7() {
        super.l7();
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ojn)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571537i6));
        findViewById(com.p314xaae8f345.mm.R.id.ojn).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z3(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1 && i18 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (intent == null) {
            intent = null;
        }
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("extra_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55.class);
            intent2.putExtra("md5", stringExtra);
            intent2.putExtra("add_exceed_limit", i18 == 1);
            intent2.putExtra("edie_session_id", this.f179306x);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("feedId")) {
            this.E = getIntent().getLongExtra("feedId", 0L);
        }
    }
}
