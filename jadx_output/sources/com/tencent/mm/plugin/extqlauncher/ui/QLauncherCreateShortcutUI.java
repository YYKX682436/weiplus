package com.tencent.mm.plugin.extqlauncher.ui;

/* loaded from: classes9.dex */
public class QLauncherCreateShortcutUI extends com.tencent.mm.ui.MMBaseActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            finish();
            return;
        }
        if (i17 == 1 && intent != null) {
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "account not ready");
                dp.a.makeText(this, com.tencent.mm.R.string.f491163c65, 0).show();
                finish();
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            java.util.ArrayList P1 = !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")) : null;
            if (P1 == null || P1.size() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames empty");
            } else {
                P1.size();
                java.lang.String r17 = c01.z1.r();
                try {
                    android.content.ContentValues[] contentValuesArr = new android.content.ContentValues[P1.size()];
                    for (int i19 = 0; i19 < P1.size(); i19++) {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n((java.lang.String) P1.get(i19), true);
                        if (n17 != null && ((int) n17.E2) > 0) {
                            java.lang.String e17 = xp1.c.e((java.lang.String) P1.get(i19));
                            if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "null encryptShortcutUser");
                                finish();
                                return;
                            }
                            android.content.ContentValues contentValues = new android.content.ContentValues();
                            contentValues.put("source_key", xp1.c.f455873a);
                            contentValues.put("owner_id", xp1.c.e(r17));
                            contentValues.put("unique_id", e17);
                            contentValues.put("container", (java.lang.Integer) 1);
                            contentValues.put("item_type", java.lang.Integer.valueOf(n17.k2() ? 2 : !c01.e2.U(n17.d1()) ? 1 : 0));
                            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                            java.lang.String str = (java.lang.String) P1.get(i19);
                            ((sg3.a) v0Var).getClass();
                            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, c01.a2.c(n17, str));
                            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                            contentValues.put("icon_path", com.tencent.mm.modelavatar.d1.Ai().i((java.lang.String) P1.get(i19), false, false));
                            android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.action.BIZSHORTCUT");
                            intent2.putExtra("LauncherUI.Shortcut.Username", e17);
                            intent2.putExtra("LauncherUI.From.Biz.Shortcut", true);
                            intent2.addFlags(67108864);
                            contentValues.put("intent", intent2.toUri(0));
                            contentValuesArr[i19] = contentValues;
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "no such user");
                        finish();
                        return;
                    }
                    getContentResolver().bulkInsert(b72.a.f18199a, contentValuesArr);
                    dp.a.makeText(this, com.tencent.mm.R.string.f491164c66, 0).show();
                } catch (java.lang.Exception e18) {
                    e18.getMessage();
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", e18, "", new java.lang.Object[0]);
                    dp.a.makeText(this, com.tencent.mm.R.string.f491163c65, 0).show();
                }
            }
        }
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(com.tencent.mm.R.layout.a3_);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206780a, 64, 16384));
        intent.putExtra("list_type", 12);
        intent.putExtra("stay_in_wechat", false);
        intent.putExtra("titile", getString(com.tencent.mm.R.string.f489934fx));
        intent.putExtra("block_contact", c01.z1.r());
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }
}
