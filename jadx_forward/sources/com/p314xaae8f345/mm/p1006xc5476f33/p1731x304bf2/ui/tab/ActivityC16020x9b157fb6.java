package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab;

/* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI */
/* loaded from: classes8.dex */
public class ActivityC16020x9b157fb6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15949x2763f3ba {
    public static final /* synthetic */ int D = 0;
    public java.lang.String B;
    public final android.content.BroadcastReceiver C = new p53.i(this);

    public final void a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabHomeUI", "GameTabHomeUI goBack!");
        java.lang.String stringExtra = getIntent().getStringExtra("jump_find_more_friends");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.equals("jump_find_more_friends")) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 2);
            j45.l.u(this, ".ui.LauncherUI", intent, null);
            finish();
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabHomeUI", "back to FindMoreFriendsUI");
        }
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.game.ACTION_EXIT");
        intent2.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        sendBroadcast(intent2, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15949x2763f3ba, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15946xc98b8f0c, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15945x98cc0336, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabHomeUI", "%s create", getClass().getSimpleName());
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d c15921xfed2506d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d) getIntent().getParcelableExtra("tab_data");
        this.B = getIntent().getStringExtra("tab_key");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647 c16024xb4559647 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647) findViewById(com.p314xaae8f345.mm.R.id.nvu);
        p53.c cVar = new p53.c(this);
        c16024xb4559647.m64824x6cab2c8d(cVar);
        java.lang.String str = this.B;
        cVar.f433586e = c15921xfed2506d;
        cVar.f433587f = str;
        cVar.notifyDataSetChanged();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.C;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a, null);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a, null, 4);
        }
        mo54448x9c8c0d33(new p53.h(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15949x2763f3ba, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.C);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        a7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("tab_key");
        java.lang.String str = this.B;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabHomeUI", "reload %s. current_key:%s, next_key:%s", getClass().getSimpleName(), this.B, stringExtra);
            finish();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/tab/GameTabHomeUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/game/ui/tab/GameTabHomeUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9, com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15949x2763f3ba, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15946xc98b8f0c, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (m78735x28280f95() != null) {
            m78735x28280f95().m81450x8e764904(false);
        }
    }
}
