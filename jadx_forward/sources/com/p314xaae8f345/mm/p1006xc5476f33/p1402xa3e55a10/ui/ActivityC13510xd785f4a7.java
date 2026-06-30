package com.p314xaae8f345.mm.p1006xc5476f33.p1402xa3e55a10.ui;

/* renamed from: com.tencent.mm.plugin.extqlauncher.ui.QLauncherCreateShortcutUI */
/* loaded from: classes9.dex */
public class ActivityC13510xd785f4a7 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {
    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            finish();
            return;
        }
        if (i17 == 1 && intent != null) {
            if (!gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "account not ready");
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572696c65, 0).show();
                finish();
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            java.util.ArrayList P1 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")) : null;
            if (P1 == null || P1.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames empty");
            } else {
                P1.size();
                java.lang.String r17 = c01.z1.r();
                try {
                    android.content.ContentValues[] contentValuesArr = new android.content.ContentValues[P1.size()];
                    for (int i19 = 0; i19 < P1.size(); i19++) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n((java.lang.String) P1.get(i19), true);
                        if (n17 != null && ((int) n17.E2) > 0) {
                            java.lang.String e17 = xp1.c.e((java.lang.String) P1.get(i19));
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "null encryptShortcutUser");
                                finish();
                                return;
                            }
                            android.content.ContentValues contentValues = new android.content.ContentValues();
                            contentValues.put("source_key", xp1.c.f537406a);
                            contentValues.put("owner_id", xp1.c.e(r17));
                            contentValues.put("unique_id", e17);
                            contentValues.put("container", (java.lang.Integer) 1);
                            contentValues.put("item_type", java.lang.Integer.valueOf(n17.k2() ? 2 : !c01.e2.U(n17.d1()) ? 1 : 0));
                            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                            java.lang.String str = (java.lang.String) P1.get(i19);
                            ((sg3.a) v0Var).getClass();
                            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c01.a2.c(n17, str));
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                            contentValues.put("icon_path", com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i((java.lang.String) P1.get(i19), false, false));
                            android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.action.BIZSHORTCUT");
                            intent2.putExtra("LauncherUI.Shortcut.Username", e17);
                            intent2.putExtra("LauncherUI.From.Biz.Shortcut", true);
                            intent2.addFlags(67108864);
                            contentValues.put("intent", intent2.toUri(0));
                            contentValuesArr[i19] = contentValues;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "no such user");
                        finish();
                        return;
                    }
                    getContentResolver().bulkInsert(b72.a.f99732a, contentValuesArr);
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572697c66, 0).show();
                } catch (java.lang.Exception e18) {
                    e18.getMessage();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", e18, "", new java.lang.Object[0]);
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572696c65, 0).show();
                }
            }
        }
        finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3_);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a, 64, 16384));
        intent.putExtra("list_type", 12);
        intent.putExtra("stay_in_wechat", false);
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
        intent.putExtra("block_contact", c01.z1.r());
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }
}
