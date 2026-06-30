package com.p314xaae8f345.mm.p2617xca9a2a67;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.splash.SplashHackActivity */
/* loaded from: classes12.dex */
public class ActivityC21044x3dec3d77 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f275168d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f275169e;

    public ActivityC21044x3dec3d77() {
        this.f275169e = false;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 100) {
            finish();
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackActivity", "unknown request code.", new java.lang.Object[0]);
        } else if (i18 != -100) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackActivity", "Back pressed", new java.lang.Object[0]);
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                finish();
            } else {
                onBackPressed();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackActivity", "onCreate", new java.lang.Object[0]);
        setVisible(false);
        if (com.p314xaae8f345.mm.p2617xca9a2a67.j.b()) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p2617xca9a2a67.j.f275190p);
            intent.putExtra("hashcode", hashCode());
            if (!this.f275169e) {
                startActivityForResult(intent, 100);
                overridePendingTransition(0, 0);
                return;
            }
            intent.putExtra("replay_intent", getIntent());
            intent.putExtra("real_activity", this.f275168d);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/splash/SplashHackActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/splash/SplashHackActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackActivity", "onDestroy", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p2617xca9a2a67.j.f275175a.remove(this);
        setVisible(true);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        boolean z17 = false;
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackActivity", "onNewIntent.", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p2617xca9a2a67.d dVar = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275179e;
        if (dVar != null) {
            ((com.p314xaae8f345.mm.p815xbe0af3c9.app.n0) dVar).getClass();
            if (intent != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "absolutely_exit_pid", 0) == android.os.Process.myPid()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "handle exit intent.");
                com.p314xaae8f345.mm.ui.vb.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(intent, "kill_service", true));
                z17 = true;
            }
            if (z17) {
                finish();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackActivity", "onPause", new java.lang.Object[0]);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackActivity", "onResume", new java.lang.Object[0]);
    }

    public ActivityC21044x3dec3d77(boolean z17) {
        this.f275169e = false;
        this.f275169e = z17;
    }
}
