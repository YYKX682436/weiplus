package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5 f176684e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5 activityC13047x63b575f5, java.lang.String str) {
        this.f176684e = activityC13047x63b575f5;
        this.f176683d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5 activityC13047x63b575f5 = this.f176684e;
        java.lang.String str = this.f176683d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.S;
        synchronized (activityC13047x63b575f5) {
            if (activityC13047x63b575f5.f176312x) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "has start CardConsumeSuccessUI!");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "startConsumedSuccUI() ");
            activityC13047x63b575f5.f176312x = true;
            android.content.Intent intent = new android.content.Intent(activityC13047x63b575f5, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13041xc416088b.class);
            intent.putExtra("KEY_CARD_ID", activityC13047x63b575f5.f176297f.g());
            intent.putExtra("KEY_CARD_CONSUMED_JSON", str);
            intent.putExtra("KEY_CARD_COLOR", activityC13047x63b575f5.f176297f.s0().f470088p);
            intent.putExtra("key_stastic_scene", activityC13047x63b575f5.B);
            intent.putExtra("key_from_scene", 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC13047x63b575f5, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardDetailUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC13047x63b575f5.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC13047x63b575f5, "com/tencent/mm/plugin/card/ui/CardDetailUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
