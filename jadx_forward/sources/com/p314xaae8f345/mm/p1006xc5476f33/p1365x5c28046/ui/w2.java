package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes8.dex */
public class w2 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 f180065a;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 activityC13309xb24c3226) {
        this.f180065a = activityC13309xb24c3226;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_action_type", 200002);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 activityC13309xb24c3226 = this.f180065a;
        j45.l.n(activityC13309xb24c3226, "wallet_index", ".ui.WalletIapUI", intent, 2001);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiPaidUI", "[showMenuDialog] startActivityForResult ui.WalletIapUI");
        activityC13309xb24c3226.o7();
    }
}
